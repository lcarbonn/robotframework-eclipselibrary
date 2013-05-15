package org.lcx.robotframework.eclipse.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.net.URL;

import org.junit.Test;
import org.lcx.robotframework.eclipse.keyword.launch.EclipseLaunchingKeywords;


public class EclipseLaunchingTest {

	/*
	try to add eclipse in classpath
	 */
	

	@Test
	public void testFindEclipseMain() throws Exception {
		long t1 = System.currentTimeMillis();

		String pathToEclipse = "file://D:/eclipse/eclipse-jee-helios-SR2-win32_OLD/eclipse";
		
		// find the jar
		URL url = new URL(pathToEclipse);
		
		EclipseUtil eclipseUtil = new EclipseUtil();
		
		File eclipseLauncherJar = eclipseUtil.findTheJar(url.getFile());
		System.out.println(eclipseLauncherJar.getAbsolutePath());
		assertNotNull(eclipseLauncherJar);
		assertEquals("org.eclipse.equinox.launcher_1.1.1.R36x_v20101122_1400.jar", eclipseLauncherJar.getName());
		

		
		// load the jar
		eclipseUtil.loadTheJar(eclipseLauncherJar);
		
	
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		
	}
	
	@Test
	public void testLoadEclipse() throws Exception {
		long t1 = System.currentTimeMillis();

		String pathToEclipse = "file:/D:/eclipse/eclipse-jee-helios-SR2-win32/eclipse";
		String pathToWorkspace = "file:/D:/bootstrap36-robot/worskspace_blank";
		String[] args = new String[5];
		args[0]="-install";
		args[1]=pathToEclipse;
		args[2]="-data";
		args[3]=pathToWorkspace;
		args[4]="-consolelog -debug";
//		EclipseUtil eclipseUtil = new EclipseUtil();
//		eclipseUtil.loadEclipseLauncherJar(args);
		
		// launch eclipse
		EclipseLaunchingKeywords ekw = new EclipseLaunchingKeywords();
		try {
			ekw.startEclipse(args);
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
	}
}
