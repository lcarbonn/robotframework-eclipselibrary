/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.swt.finder.utils;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.lcx.robotframework.eclipse.LibraryLogger;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;

public abstract class SWTUtils {

	private static Logger log = LibraryLogger.getLogger();
	
	public final static String fileName = "screenshot"; 
	public final static String fileExt = ".jpeg"; 

	public static boolean captureScreenshot() {
		
		try {
			String file = fileName + System.currentTimeMillis() + fileExt;
			return captureScreenshot(file);
		} catch (Exception e) {
			log.error("Error in SWTUtils captureScreenshot", e);
		}
		return false;
	}

	public static boolean captureScreenshot(String fileName) throws SWTBotBridgeException {
		
		try {
			Class<?> swtutils = SWTBotBridge.loadClass("org.eclipse.swtbot.swt.finder.utils.SWTUtils");
			Method method = swtutils.getMethod("captureScreenshot", String.class);
			method.setAccessible(true);
			Boolean o = (Boolean)method.invoke(null, fileName);
			return o;
		} catch (Exception e) {
			throw new SWTBotBridgeException("Error in captureScreenshot method", e);
		}
		
	}
	
}
