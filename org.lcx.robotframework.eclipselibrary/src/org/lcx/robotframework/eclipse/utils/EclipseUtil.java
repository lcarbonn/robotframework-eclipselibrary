/*
 * Copyright 2013 L. Carbonnaux
 */

package org.lcx.robotframework.eclipse.utils;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import org.apache.log4j.Logger;
import org.lcx.robotframework.eclipse.LibraryLogger;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;

public class EclipseUtil {
	
	public static String EQUINOX_LAUNCHER = "org.eclipse.equinox.launcher_";
	public static String EXTEND_TO_PLUGINS = "/plugins";
	public static String INSTALL = "-install";

	private Logger log = LibraryLogger.getLogger();
	
	private String pathToEclipse = null;

	public void loadEclipseLauncherJar(String[] args) throws MalformedURLException, SWTBotBridgeException {
		log.debug("Load Eclipse launcher jar");
		setPathToEclipse(args);
		log.debug("\t pathToEclipse="+pathToEclipse);
		
		if(pathToEclipse!=null) {
			URL url = new URL(pathToEclipse);
			File eclipseLauncherJar = findTheJar(url.getFile());
			if(eclipseLauncherJar==null) {
				log.debug("\t eclipse launcher jar not found=");
			}
			else {
				log.debug("\t eclipseLauncherJar="+eclipseLauncherJar.getAbsolutePath());
				loadTheJar(eclipseLauncherJar);
			}
		}
	}

	private void setPathToEclipse(String[] args) {
		if(args!=null) {
			for (int i = 0; i < args.length; i++) {
				if(args[i].equals(INSTALL) && i<(args.length-1)) {
					pathToEclipse=args[(i+1)];
				}
			}
		}
	}
	
	public File findTheJar(String pathToEclipse) {
		// find the jar into the given folder
		String pluginFolder = pathToEclipse + EXTEND_TO_PLUGINS;
		File folder = new File(pluginFolder);
		EclipseFileNameFilter filter = new EclipseFileNameFilter();
		filter.setReference(EQUINOX_LAUNCHER);
		File[] listOfJar = folder.listFiles(filter);
		if(listOfJar!= null && listOfJar.length==1) {
			return listOfJar[0];
		}
		
		return null;
	}

	public void loadTheJar(File eclipseLauncherJar) throws SWTBotBridgeException {
		try {
			URL u = new URL("file:/"+eclipseLauncherJar.getAbsolutePath());
			URLClassLoader urlClassLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
			Class<?> urlClass = URLClassLoader.class;
			Method method;
			method = urlClass.getDeclaredMethod("addURL", new Class[]{URL.class});
			method.setAccessible(true);
			method.invoke(urlClassLoader, new Object[]{u});
			log.debug("\t "+u+" is loaded");
		} catch (SecurityException e) {
			throw new SWTBotBridgeException(e);
		} catch (NoSuchMethodException e) {
			throw new SWTBotBridgeException(e);
		} catch (IllegalArgumentException e) {
			throw new SWTBotBridgeException(e);
		} catch (IllegalAccessException e) {
			throw new SWTBotBridgeException(e);
		} catch (InvocationTargetException e) {
			throw new SWTBotBridgeException(e);
		} catch (MalformedURLException e) {
			throw new SWTBotBridgeException(e);
		}
		
	}

}
