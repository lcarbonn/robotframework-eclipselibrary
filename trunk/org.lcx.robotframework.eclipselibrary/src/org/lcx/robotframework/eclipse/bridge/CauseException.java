/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.bridge;

public class CauseException {

	private static String SWTBOTException = "org.eclipse.swtbot.swt.finder.exceptions";
	
	public static boolean findCauseException(Class<?> expected, Throwable actual) {
		Throwable cause = actual;
		while(cause!=null) {
			if(cause.getClass().equals(expected)) return true;
			cause = cause.getCause();
		}
		return false;
	}

	public static String getCauseExceptionMessage(String expected, Throwable actual) {
		Throwable cause = actual;
		while(cause!=null) {
			if(cause.getClass().getName().startsWith(expected)) return cause.getMessage();
			cause = cause.getCause();
		}
		return null;
	}
	
	public static SWTBotBridgeException generateException(Throwable cause) {
		cause.printStackTrace();
		String message = CauseException.getCauseExceptionMessage(SWTBOTException, cause);
		if(message!=null) {
			return new SWTBotBridgeException(message, cause);
		} else {
			return new SWTBotBridgeException(cause);
		}
	}
	
}
