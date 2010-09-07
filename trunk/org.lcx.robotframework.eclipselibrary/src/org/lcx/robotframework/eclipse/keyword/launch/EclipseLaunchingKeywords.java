/*
 * Copyright 2010 L. Carbonnaux
 */

package org.lcx.robotframework.eclipse.keyword.launch;

import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.reflect.Method;

import org.lcx.robotframework.eclipse.launcher.EclipseMain;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class EclipseLaunchingKeywords {

	private static final String TIMEOUT = "-timeout"; //$NON-NLS-1$
	
    @RobotKeyword("Start Eclipse with the given arguments in a separate thread\n")
    @ArgumentNames({"*args"})
    public void startEclipse(String[] args) throws Exception {
    	startEclipseInSeparateThread(args);
    }

    /**
     * Method is public for unit test purpose
     * @param args
     * @return Thread
     * @throws Exception
     */
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

		long timeout = 1000 * 60;
        for (int i = 0; i < args.length; i++) {
//			System.out.println("args="+args[i]);
			if(args[i].equals(TIMEOUT) && i<(args.length-1)) {
				timeout = Long.parseLong(args[i+1]);
//				System.out.println("timeout="+timeout);
			}
		}

        boolean run = true;
        long start = System.currentTimeMillis();
        long end = start;
        while(run && ((end-start)<timeout)) {
			// Is Eclipse is running?
        	Thread.sleep(1000);
        	if (EclipseMain.starter!=null) {
				Method method = EclipseMain.starter.getDeclaredMethod("isRunning");
				boolean isRunning = ((Boolean)method.invoke(EclipseMain.starter)).booleanValue();
	//			if(debug) System.out.println("Eclipse is running="+isRunning);
				if(isRunning) run = false;
				end = System.currentTimeMillis();
        	}
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
