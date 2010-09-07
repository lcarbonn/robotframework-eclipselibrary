/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.lcx.robotframework.eclipse.keyword.swtbotpref.SWTBotPreferencesActionKeywords;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class SWTBotKeywords {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
	public static boolean IS_CAPTURE_SCREENSHOT_ON_ERROR = false;
	public static String ERROR_SCREENSHOT_FILE_NAME = "errorscreenshot";

	@RobotKeyword("Captures a screenshot to the given file name.\n\n"
			+ " The file name will be prefixed with timestamp \n"
            + "Example:\n"
            + "| Capture Screenshot | screenshot.jpg |\n"
            + " will produced 20100131_screenshot.jpg for instance\n")
    @ArgumentNames({"fileName"})
        public String captureScreenshot(String fileName) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	SWTBotPreferencesActionKeywords pref = new SWTBotPreferencesActionKeywords();
    	Date now = new Date(System.currentTimeMillis());
    	String name = pref.getSWTBotPreferencesSCREENSHOTS_DIR() + sdf.format(now) + "_" +fileName;
    	bot.captureScreenshot(name);
    	return "file://"+name;

    }
    
	@RobotKeyword("Set SWTBot to captures a screenshot to the given file name on error.\n\n"
			+ " The file name will be prefixed with timestamp \n"
            + "Example:\n"
            + "| Set Capture Screenshot On Error | screenshot.jpg |\n"
            + " will produced 20100131_screenshot.jpg for instance\n")
    @ArgumentNames({"fileName"})
        public void setCaptureScreenshotOnError(String fileName) throws Exception {
		
			IS_CAPTURE_SCREENSHOT_ON_ERROR = true;
			ERROR_SCREENSHOT_FILE_NAME = fileName;
		
    }

}
