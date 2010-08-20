package org.lcx.robotframework.eclipse.bridge;

import org.lcx.robotframework.eclipse.keyword.utils.SWTBotKeywords;

public class SWTBotBridgeException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SWTBotBridgeException() {
		captureScreenshot();
	}

	public SWTBotBridgeException(String message) {
		super(message);
		captureScreenshot();
	}

	public SWTBotBridgeException(Throwable cause) {
		super(cause);
		captureScreenshot();
	}

	public SWTBotBridgeException(String message, Throwable cause) {
		super(message, cause);
		captureScreenshot();
	}

	private String captureScreenshot() {
		try {
			if(SWTBotKeywords.IS_CAPTURE_SCREENSHOT_ON_ERROR) {
				SWTBotKeywords k = new SWTBotKeywords();
				return k.captureScreenshot(SWTBotKeywords.ERROR_SCREENSHOT_FILE_NAME);
			}
		} catch (Exception e) {
			// do nothing
		}
		return null;
	}
}
