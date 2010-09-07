/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbotpref;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class SWTBotPreferencesActionKeywords {

	private static String prefclassname = "org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences";
	
	private Object getKeyValue(String key) throws Exception {
		return SWTBotBridge.getStaticField(prefclassname, key);
	}
	
	private void setKeyValue(String key, Object value) throws Exception {
		SWTBotBridge.setStaticField(prefclassname, key, value);
	}

	@RobotKeyword("Get SWTBotPreferences DEFAULT_KEY\n\n"
            + "Example:\n"
            + "| Get SWTBotPreferences DEFAULT_KEY |\n")
        public String getSWTBotPreferencesDEFAULT_KEY() throws Exception {
			return (String)getKeyValue("DEFAULT_KEY");
    	}

	@RobotKeyword("Set SWTBotPreferences DEFAULT_KEY\n\n"
            + "Example:\n"
            + "| Set SWTBotPreferences DEFAULT_KEY | key | \n")
    @ArgumentNames({"value"})
        public void setSWTBotPreferencesDEFAULT_KEY(String value) throws Exception {
			setKeyValue("DEFAULT_KEY", value);
    	}

	@RobotKeyword("Get SWTBotPreferences TIMEOUT as long\n\n"
            + "Example:\n"
            + "| Get SWTBotPreferences TIMEOUT |\n")
        public Long getSWTBotPreferencesTIMEOUT() throws Exception {
			return ((Long)getKeyValue("TIMEOUT")).longValue();
    	}
	
	@RobotKeyword("Set SWTBotPreferences TIMEOUT as long\n\n"
            + "Example:\n"
            + "| Set SWTBotPreferences TIMEOUT | 1000 | \n")
    @ArgumentNames({"value"})
        public void setSWTBotPreferencesTIMEOUT(String value) throws Exception {
			System.out.println(value+":"+value.getClass().getName());
			long l = Long.valueOf(value).longValue();
			setKeyValue("TIMEOUT", l);
    	}

	@RobotKeyword("Get SWTBotPreferences RECORDER_FILE_NAME\n\n"
            + "Example:\n"
            + "| Get SWTBotPreferences RECORDER_FILE_NAME |\n")
        public String getSWTBotPreferencesRECORDER_FILE_NAME() throws Exception {
			return (String)getKeyValue("RECORDER_FILE_NAME");
    	}

	@RobotKeyword("Set SWTBotPreferences RECORDER_FILE_NAME\n\n"
            + "Example:\n"
            + "| Set SWTBotPreferences RECORDER_FILE_NAME | filename | \n")
    @ArgumentNames({"value"})
        public void setSWTBotPreferencesRECORDER_FILE_NAME(String value) throws Exception {
			setKeyValue("RECORDER_FILE_NAME", value);
    	}
	
	@RobotKeyword("Get SWTBotPreferences PLAYBACK_DELAY as long\n\n"
            + "Example:\n"
            + "| Get SWTBotPreferences PLAYBACK_DELAY |\n")
        public long getSWTBotPreferencesPLAYBACK_DELAY() throws Exception {
			return ((Long)getKeyValue("PLAYBACK_DELAY")).longValue();
    	}

	@RobotKeyword("Set SWTBotPreferences PLAYBACK_DELAY as long\n\n"
            + "Example:\n"
            + "| Set SWTBotPreferences PLAYBACK_DELAY | 100 | \n")
    @ArgumentNames({"value"})
        public void setSWTBotPreferencesPLAYBACK_DELAY(String value) throws Exception {
			long l = Long.valueOf(value).longValue();
			setKeyValue("PLAYBACK_DELAY", l);
    	}
	
	@RobotKeyword("Get SWTBotPreferences MAX_ERROR_SCREENSHOT_COUNT as int\n\n"
            + "Example:\n"
            + "| Get SWTBotPreferences MAX_ERROR_SCREENSHOT_COUNT |\n")
        public int getSWTBotPreferencesMAX_ERROR_SCREENSHOT_COUNT() throws Exception {
			return ((Integer)getKeyValue("MAX_ERROR_SCREENSHOT_COUNT")).intValue();
    	}

	@RobotKeyword("Set SWTBotPreferences MAX_ERROR_SCREENSHOT_COUNT as int\n\n"
            + "Example:\n"
            + "| Set SWTBotPreferences MAX_ERROR_SCREENSHOT_COUNT | 20 | \n")
    @ArgumentNames({"value"})
        public void setSWTBotPreferencesMAX_ERROR_SCREENSHOT_COUNT(String value) throws Exception {
			int i = Integer.valueOf(value).intValue();
			setKeyValue("MAX_ERROR_SCREENSHOT_COUNT", i);
    	}

	@RobotKeyword("Get SWTBotPreferences SCREENSHOTS_DIR\n\n"
            + "Example:\n"
            + "| Get SWTBotPreferences SCREENSHOTS_DIR |\n")
        public String getSWTBotPreferencesSCREENSHOTS_DIR() throws Exception {
			return (String)getKeyValue("SCREENSHOTS_DIR");
    	}
	@RobotKeyword("Set SWTBotPreferences SCREENSHOTS_DIR\n\n"
            + "Example:\n"
            + "| Set SWTBotPreferences SCREENSHOTS_DIR | filename | \n")
    @ArgumentNames({"value"})
        public void setSWTBotPreferencesSCREENSHOTS_DIR(String value) throws Exception {
			setKeyValue("SCREENSHOTS_DIR", value);
    	}
	
	
	@RobotKeyword("Get SWTBotPreferences SCREENSHOT_FORMAT\n\n"
            + "Example:\n"
            + "| Get SWTBotPreferences SCREENSHOT_FORMAT |\n")
        public String getSWTBotPreferencesSCREENSHOT_FORMAT() throws Exception {
			return (String)getKeyValue("SCREENSHOT_FORMAT");
    	}

	@RobotKeyword("Set SWTBotPreferences SCREENSHOT_FORMAT\n\n"
			+ "The value must be one these: BMP, GIF, ICO, JPEG, JPG, PNG or TIFF.\n"
            + "Example:\n"
            + "| Set SWTBotPreferences SCREENSHOT_FORMAT | PNG | \n")
    @ArgumentNames({"value"})
        public void setSWTBotPreferencesSCREENSHOT_FORMAT(String value) throws Exception {
			setKeyValue("SCREENSHOT_FORMAT", value);
    	}

	@RobotKeyword("Get SWTBotPreferences KEYBOARD_LAYOUT\n\n"
            + "Example:\n"
            + "| Get SWTBotPreferences KEYBOARD_LAYOUT |\n")
        public String getSWTBotPreferencesKEYBOARD_LAYOUT() throws Exception {
			return (String)getKeyValue("KEYBOARD_LAYOUT");
    	}
	@RobotKeyword("Set SWTBotPreferences KEYBOARD_LAYOUT\n\n"
            + "Example:\n"
            + "| Set SWTBotPreferences KEYBOARD_LAYOUT | layout | \n")
    @ArgumentNames({"value"})
        public void setSWTBotPreferencesKEYBOARD_LAYOUT(String value) throws Exception {
			setKeyValue("KEYBOARD_LAYOUT", value);
    	}
	
	
	@RobotKeyword("Get SWTBotPreferences TYPE_INTERVAL as int\n\n"
            + "Example:\n"
            + "| Get SWTBotPreferences TYPE_INTERVAL |\n")
        public int getSWTBotPreferencesTYPE_INTERVAL() throws Exception {
			return ((Integer)getKeyValue("TYPE_INTERVAL")).intValue();
    	}
	@RobotKeyword("Set SWTBotPreferences TYPE_INTERVAL as int\n\n"
            + "Example:\n"
            + "| Set SWTBotPreferences TYPE_INTERVAL | 20 | \n")
    @ArgumentNames({"value"})
        public void setSWTBotPreferencesTYPE_INTERVAL(String value) throws Exception {
			int i = Integer.valueOf(value).intValue();
			setKeyValue("TYPE_INTERVAL", i);
    	}

	@RobotKeyword("Get SWTBotPreferences KEYBOARD_STRATEGY\n\n"
            + "Example:\n"
            + "| Get SWTBotPreferences KEYBOARD_STRATEGY |\n")
        public String getSWTBotPreferencesKEYBOARD_STRATEGY() throws Exception {
			return (String)getKeyValue("KEYBOARD_STRATEGY");
    	}
	@RobotKeyword("Set SWTBotPreferences KEYBOARD_STRATEGY\n\n"
            + "Example:\n"
            + "| Set SWTBotPreferences KEYBOARD_STRATEGY | stategy | \n")
    @ArgumentNames({"value"})
        public void setSWTBotPreferencesKEYBOARD_STRATEGY(String value) throws Exception {
			setKeyValue("KEYBOARD_STRATEGY", value);
    	}
	
}