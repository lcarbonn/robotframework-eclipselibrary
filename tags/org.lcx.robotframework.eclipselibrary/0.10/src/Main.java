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
		
		EclipseLaunchingKeywords elk = new EclipseLaunchingKeywords();
		String[] s = new String[0];
		Thread et =null;
		UncaughtExceptionHandler eh = new UncaughtExceptionHandler() {
			
			public void uncaughtException(Thread t, Throwable e) {
				e.printStackTrace();
			}
		};
		try {
			et = elk.startEclipseInSeparateThread(s);
			System.out.println("lancé");
			et.setUncaughtExceptionHandler(eh);
//			et.join();
			System.out.println("join");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
		} finally {
			System.out.println("terminé");
		}
	}

}
