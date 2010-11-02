/*
 * Copyright 2010 L. Carbonnaux
 */
import java.lang.Thread.UncaughtExceptionHandler;

import org.lcx.robotframework.eclipse.keyword.launch.EclipseLaunchingKeywords;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EclipseLibrary el = new EclipseLibrary();
		for(String keyword : el.getKeywordNames()){
			System.out.println(keyword);
		}

		el.runKeyword("Start Eclipse", args);
		String[] a = {"Resource"};
		el.runKeyword("Find Perspective By Label", a);
		el.runKeyword("Activate Perspective", new Object[0]);
		
	}		

		
	public static void testLaunchEclipse(String[] args) {
		EclipseLaunchingKeywords elk = new EclipseLaunchingKeywords();
		UncaughtExceptionHandler eh = new UncaughtExceptionHandler() {
			
			public void uncaughtException(Thread t, Throwable e) {
				e.printStackTrace();
			}
		};
		try {
			Thread et = elk.startEclipseInSeparateThread(args);
			System.out.println("Eclipse Started");
			et.setUncaughtExceptionHandler(eh);
			et.join();
			System.out.println("join");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Eclipse Error");
		} finally {
			System.out.println("Eclipse Ended");
		}
	}
}
