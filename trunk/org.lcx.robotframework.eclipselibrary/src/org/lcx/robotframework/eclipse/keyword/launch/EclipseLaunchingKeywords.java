/*
 * Copyright 2010 L. Carbonnaux
 */

package org.lcx.robotframework.eclipse.keyword.launch;

import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.lcx.robotframework.eclipse.LibraryLogger;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class EclipseLaunchingKeywords {

	private static final String TIMEOUT = "-timeout"; //$NON-NLS-1$
	private boolean error = false;
	private final static String ECLIPSE_LAUNCHER = "org.eclipse.equinox.launcher.Main";
	
	private Logger log = LibraryLogger.getLogger();
	
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

    	getMainMethod();
    	
		UncaughtExceptionHandler eh = new UncaughtExceptionHandler() {
			
			public void uncaughtException(Thread t, Throwable e) {
				log.error("Uncaught Exception in startEclipseInSeparateThread", e);
				error=true;
			}
		};

    	Thread et = createThread(new Runnable() {
            public void run() {
                try {
                	internalLaunchEclipse(args);
                } catch (Exception e) {
                	error=true;
    				log.error("Erro createThread in startEclipseInSeparateThread", e);
                    throw new RuntimeException(e);
                }
            }
        });
    	et.setUncaughtExceptionHandler(eh);
    	et.start();

    	if(error) {
    		return null;
    	}
    	
		long timeout = 2 * 60 * 1000;
        for (int i = 0; i < args.length; i++) {
			if(args[i].equals(TIMEOUT) && i<(args.length-1)) {
				timeout = Long.parseLong(args[i+1]);
			}
		}

        boolean isBridgeInitialized = false;
        boolean timeoutReached = false;
        long start = System.currentTimeMillis();
        long end = start;
        while(!isBridgeInitialized && !timeoutReached) {
			// Is bridge initialized?
        	try {
            	Thread.sleep(1000);
			} catch (Exception e) {
				// nothing tod o
			}
        	isBridgeInitialized = SWTBotBridge.isISBRIDGEINITIATED();
        	end = System.currentTimeMillis();
        	if(timeout!=0) {
        		timeoutReached = ((end-start)>timeout);
        	}
        }
        if(isBridgeInitialized) {
        	log.info("SWTBotBridge is initialized");
        }
        if(timeoutReached) {
        	throw new SWTBotBridgeException("Timeout reached before end of initialization\n " +
        			"  Check if EclipseLibrary plugin is installed" +
        			"  Or use -timeout option in Start Eclipse keyword");
        }
    	return et;
    }

    private Thread createThread(Runnable runnable) {
    	Thread t = new Thread(runnable);
    	return t;
    }
    
    private void internalLaunchEclipse(String[] args) throws SWTBotBridgeException {
    	try {
            Method mainMethod = getMainMethod();
            mainMethod.invoke(null, new Object[] { args });
           
    	} catch (Exception e) {
			e.printStackTrace();
			throw new SWTBotBridgeException(e);
		}
    }
    
    private Method getMainMethod() throws SWTBotBridgeException {
        try {
            Class<?> clss = Class.forName(ECLIPSE_LAUNCHER);
            return clss.getMethod("main", String[].class);
        } catch (NoSuchMethodException e) {
            throw new SWTBotBridgeException("Class '" + ECLIPSE_LAUNCHER + "' doesn't have a main method.");
        } catch (ClassNotFoundException e) {
            throw new SWTBotBridgeException("Class '" + ECLIPSE_LAUNCHER + "' not found.");
        }
    }
    
}
