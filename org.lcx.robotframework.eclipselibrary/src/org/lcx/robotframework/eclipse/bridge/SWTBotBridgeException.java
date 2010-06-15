package org.lcx.robotframework.eclipse.bridge;

public class SWTBotBridgeException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SWTBotBridgeException() {
//		SWTUtils.captureScreenshot();
	}

	public SWTBotBridgeException(String message) {
		super(message);
//		SWTUtils.captureScreenshot();
	}

	public SWTBotBridgeException(Throwable cause) {
		super(cause);
//		SWTUtils.captureScreenshot();
	}

	public SWTBotBridgeException(String message, Throwable cause) {
		super(message, cause);
//		SWTUtils.captureScreenshot();
	}

}
