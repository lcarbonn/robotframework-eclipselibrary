/*
 * Copyright 2015 L. Carbonnaux
 */

package org.lcx.robotframework.eclipse.keyword.launch;

import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URLClassLoader;

import org.apache.log4j.Logger;
import org.lcx.robotframework.eclipse.LibraryLogger;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.utils.EclipseUtil;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class EclipseLaunchingKeywords {

	private static final String TIMEOUT = "-timeout"; //$NON-NLS-1$
	private boolean error = false;
	private final static String ECLIPSE_LAUNCHER_CLASS = "org.eclipse.equinox.launcher.Main";
	
	private Logger log = LibraryLogger.getLogger();

	public EclipseLaunchingKeywords() {
	}
	
    

    @RobotKeyword("Start Eclipse with the given arguments in a separate thread\n")
    @ArgumentNames({"*args"})
    public void startEclipse(String[] args) throws SWTBotBridgeException {
    	startEclipseInSeparateThread(args);
    }

    /**
     * Method is public for unit test purpose
     * @param args
     * @return Thread
     * @throws Exception
     */
    public Thread startEclipseInSeparateThread(final String[] args) throws SWTBotBridgeException {

        boolean isBridgeInitialized = false;
        boolean timeoutReached = false;

		// Searching and loading the launcher jar of eclipse in the -install folder
        log.debug("loading eclipse launcher jar");
		EclipseUtil eu = new EclipseUtil();
		try {
			eu.loadEclipseLauncherJar(args);
		} catch (MalformedURLException e1) {
			throw new SWTBotBridgeException(e1);
		}
		// (only) Search the main method
		log.debug("get the Main method");
        getMainMethod();
    	
        // Prepare the exception handler
		UncaughtExceptionHandler eh = new UncaughtExceptionHandler() {

			public void uncaughtException(Thread t, Throwable e) {
				error=true;
				throw new RuntimeException(e);
			}
		};

		// Prepare the thread in which eclipse will be started
    	Thread et = createThread(new Runnable() {
            public void run() {
                try {
                	internalLaunchEclipse(args);
                } catch (Exception e) {
                	error=true;
                    throw new RuntimeException(e);
                }
            }
        });
    	et.setUncaughtExceptionHandler(eh);
		log.info("Eclipse start is requested");

		// Change the eclipse security manager in order to be able to launch it
		//SecurityManager previousSecurityManager = setSecurityManager();

		// Start the thread Eclipse
		et.start();

		// Get the timeout parameter
		long timeout = getTimeOut(args);
		
        long start = System.currentTimeMillis();
        long end = start;
        // Wait for the bridge to get initialized
        while(!error && !isBridgeInitialized && !timeoutReached) {
			// Is bridge initialized?
        	try {
            	Thread.sleep(1000);
			} catch (Exception e) {
				// nothing to do
			}
        	isBridgeInitialized = SWTBotBridge.isISBRIDGEINITIATED();
        	end = System.currentTimeMillis();
        	if(timeout!=0) {
        		timeoutReached = ((end-start)>timeout);
        	}
        }
        
    	if(error) {
    		throw new SWTBotBridgeException();
    	}
        
        if(isBridgeInitialized) {
        	log.info("SWTBotBridge is initialized");
        }
        if(timeoutReached) {
    		log.error("SWTBotBridge initialization failed or timeout reached");
        	throw new SWTBotBridgeException("Timeout reached before end of initialization\n " +
        			"  Check if EclipseLibrary plugin is installed" +
        			"  Or use -timeout option in Start Eclipse keyword");
        }
        
        // reset eclipse security manager to previous one
        //resetSecurityManager(previousSecurityManager);
        
    	return et;
    }

	private long getTimeOut(String[] args) {
		long timeout = 2 * 60 * 1000;
		if(args != null) {
	        for (int i = 0; i < args.length; i++) {
				if(args[i].equals(TIMEOUT) && i<(args.length-1)) {
					timeout = Long.parseLong(args[i+1]);
				}
			}
		}
		return timeout;
	}



	private Thread createThread(Runnable runnable) {
    	Thread t = new Thread(runnable);
    	return t;
    }
    
    private void internalLaunchEclipse(String[] args) throws SWTBotBridgeException {
		try {
			log.debug("requesting Main method of eclipse launcher jar");
            Method mainMethod = getMainMethod();
            mainMethod.invoke(null, new Object[] { args });
		} catch (Exception e) {
    		error = true;
    		log.debug("Error in internalLaunchEclipse");
    		log.error(e);
    		log.error(e.getCause().getMessage(), e.getCause());
			throw new SWTBotBridgeException(e.getCause().getMessage(), e);
		}
    }
    
    private Method getMainMethod() throws SWTBotBridgeException {
        try {
            //Class<?> clss = Class.forName(ECLIPSE_LAUNCHER);
        	URLClassLoader urlClassLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
            //return clss.getMethod("main", String[].class);
        	Class<?> clss = urlClassLoader.loadClass(ECLIPSE_LAUNCHER_CLASS);
        	return clss.getMethod("main", String[].class);
        } catch (NoSuchMethodException e) {
            throw new SWTBotBridgeException("Class '" + ECLIPSE_LAUNCHER_CLASS + "' doesn't have a main method.");
        } catch (ClassNotFoundException e) {
            throw new SWTBotBridgeException("Class '" + ECLIPSE_LAUNCHER_CLASS + "' not found.");
        }
    }

//    private void resetSecurityManager(SecurityManager previousSecurityManager) {
//        System.setSecurityManager(previousSecurityManager);
//	}
//
//	private SecurityManager setSecurityManager() {
//		// install security manager to avoid System.exit() called from lib
//		SecurityManager previousSecurityManager = System.getSecurityManager();
//
//		final SecurityManager securityManager         = new SecurityManager() {
//		    @Override public void checkPermission(final Permission permission) {
//		      if (permission.getName() != null && permission.getName().startsWith("exitVM")) {
//		        throw new SecurityException();
//		      }
//		    }
//		    @Override
//		    public void checkExit(int status) {
//		            if(status!=0) {
//		            	throw new SecurityException("Eclipse exit with status="+status+
//		            			", see log for detail and check StartEclipse keyword parameters");
//		            }
//		    }
//		  };
//		System.setSecurityManager(securityManager);
//		return previousSecurityManager;
//	}
//
}
