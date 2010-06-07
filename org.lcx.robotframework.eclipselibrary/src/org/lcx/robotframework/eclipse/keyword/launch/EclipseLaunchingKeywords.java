/*
 * Copyright 2010 L. Carbonnaux
 */

package org.lcx.robotframework.eclipse.keyword.launch;

import java.lang.Thread.UncaughtExceptionHandler;

import org.lcx.robotframework.eclipse.launcher.EclipseMain;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class EclipseLaunchingKeywords {

	private static final String TIMEOUT = "-timeout"; //$NON-NLS-1$
	
	@RobotKeyword("Launches Eclipse with the given arguments.\n\n"
        + "Example:\n"
        + "| Launch Eclipse |\n")
    @ArgumentNames({"*args"})
    public void launchEclipse(String[] args) throws Exception {
    	startEclipseInSeparateThread(args);
    }

    @RobotKeyword("Alias for `Launch Eclipse` keyword\n")
    @ArgumentNames({"*args"})
    public void startEclipse(String[] args) throws Exception {
    	startEclipseInSeparateThread(args);
    }

    @RobotKeyword("Launches Eclipse in a separate thread with the given arguments.\n"
        + "This is useful if eclipse does something that blocks eg. opens up a dialog.\n\n"
        + "Example:\n"
        + "| Start Eclipse In Separate Thread | \n")
    @ArgumentNames({"*args"})
    public Thread startEclipseInSeparateThread(final String[] args) throws Exception {
		UncaughtExceptionHandler eh = new UncaughtExceptionHandler() {
			
			public void uncaughtException(Thread t, Throwable e) {
				e.printStackTrace();
			}
		};

    	Thread et = createThread(new Runnable() {
            public void run() {
                try {
                	internalLaunchEclipse(args);
                } catch (Exception e) {
                	e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        });
    	et.setUncaughtExceptionHandler(eh);
    	et.start();

    	boolean forcedTimeout = false;
        for (int i = 0; i < args.length; i++) {
//			System.out.println("args="+args[i]);
			if(args[i].equals(TIMEOUT) && i<(args.length-1)) {
				long timeout = Long.parseLong(args[i+1]);
				Thread.sleep(timeout);
				forcedTimeout = true;
				System.out.println("timeout="+timeout);
			}
		}
        if(!forcedTimeout) {
			Thread.sleep(1000 * 20);
        }
    	
    	return et;
    }

    private Thread createThread(Runnable runnable) {
    	Thread t = new Thread(runnable);
    	return t;
    }
    
    private void internalLaunchEclipse(String[] args) throws Exception {
    	try {
//            Method mainMethod = getMainMethod("org.eclipse.equinox.launcher.Main");
//            Method mainMethod = getMainMethod("org.lcx.robotframework.eclipse.launcher.Main");
//    		String args2[] = { "-consolelog", "-debug", "-install", "file:/d:/eclipse/eclipse35", "-data", "file:/d:/bootstrap35-sv3" };
            // in case all parameters are in one single column
            if(args.length==1) {
            	EclipseMain.main(args[0]);
            } else {
            	EclipseMain.main(args);
            }
//            mainMethod.invoke(null, new Object[] { args });
           
    	} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
    }
    
}
