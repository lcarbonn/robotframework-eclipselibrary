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

	@RobotKeyword("Get SWTPreferences DEFAULT_KEY\n\n"
            + "Example:\n"
            + "| Get DEFAULT_KEY |\n")
        public String getDEFAUTL_KEY() throws Exception {
			return (String)getKeyValue("DEFAULT_KEY");
    	}

	@RobotKeyword("Set SWTPreferences DEFAULT_KEY\n\n"
            + "Example:\n"
            + "| Set DEFAULT_KEY | key | \n")
    @ArgumentNames({"value"})
        public void setDEFAUTL_KEY(String value) throws Exception {
			setKeyValue("DEFAULT_KEY", value);
    	}

	@RobotKeyword("Get SWTPreferences TIMEOUT as long\n\n"
            + "Example:\n"
            + "| Get TIMEOUT |\n")
        public long getTIMEOUT() throws Exception {
			return ((Long)getKeyValue("TIMEOUT")).longValue();
    	}
	
	@RobotKeyword("Set SWTPreferences TIMEOUT as long\n\n"
            + "Example:\n"
            + "| Set TIMEOUT | 1000 | \n")
    @ArgumentNames({"value"})
        public void getTIMEOUT(long value) throws Exception {
			setKeyValue("TIMEOUT", value);
    	}

	@RobotKeyword("Get SWTPreferences RECORDER_FILE_NAME\n\n"
            + "Example:\n"
            + "| Get RECORDER_FILE_NAME |\n")
        public String getRECORDER_FILE_NAME() throws Exception {
			return (String)getKeyValue("RECORDER_FILE_NAME");
    	}

	@RobotKeyword("Set SWTPreferences RECORDER_FILE_NAME\n\n"
            + "Example:\n"
            + "| Set RECORDER_FILE_NAME | filename | \n")
    @ArgumentNames({"value"})
        public void setRECORDER_FILE_NAME(String value) throws Exception {
			setKeyValue("RECORDER_FILE_NAME", value);
    	}
	
	@RobotKeyword("Get SWTPreferences PLAYBACK_DELAY as long\n\n"
            + "Example:\n"
            + "| Get PLAYBACK_DELAY |\n")
        public long getPLAYBACK_DELAY() throws Exception {
			return ((Long)getKeyValue("PLAYBACK_DELAY")).longValue();
    	}

	@RobotKeyword("Set SWTPreferences PLAYBACK_DELAY as long\n\n"
            + "Example:\n"
            + "| Set PLAYBACK_DELAY | 100 | \n")
    @ArgumentNames({"value"})
        public void setPLAYBACK_DELAY(long value) throws Exception {
			setKeyValue("PLAYBACK_DELAY", value);
    	}
	
	@RobotKeyword("Get SWTPreferences MAX_ERROR_SCREENSHOT_COUNT as int\n\n"
            + "Example:\n"
            + "| Get MAX_ERROR_SCREENSHOT_COUNT |\n")
        public int getMAX_ERROR_SCREENSHOT_COUNT() throws Exception {
			return ((Integer)getKeyValue("MAX_ERROR_SCREENSHOT_COUNT")).intValue();
    	}

	@RobotKeyword("Set SWTPreferences MAX_ERROR_SCREENSHOT_COUNT as int\n\n"
            + "Example:\n"
            + "| Set MAX_ERROR_SCREENSHOT_COUNT | 20 | \n")
    @ArgumentNames({"value"})
        public void setMAX_ERROR_SCREENSHOT_COUNT(int value) throws Exception {
			setKeyValue("MAX_ERROR_SCREENSHOT_COUNT", value);
    	}

	@RobotKeyword("Get SWTPreferences SCREENSHOTS_DIR\n\n"
            + "Example:\n"
            + "| Get SCREENSHOTS_DIR |\n")
        public String getSCREENSHOTS_DIR() throws Exception {
			return (String)getKeyValue("SCREENSHOTS_DIR");
    	}
	@RobotKeyword("Set SWTPreferences SCREENSHOTS_DIR\n\n"
            + "Example:\n"
            + "| Set SCREENSHOTS_DIR | filename | \n")
    @ArgumentNames({"value"})
        public void setSCREENSHOTS_DIR(String value) throws Exception {
			setKeyValue("SCREENSHOTS_DIR", value);
    	}
	
	
	@RobotKeyword("Get SWTPreferences SCREENSHOT_FORMAT\n\n"
            + "Example:\n"
            + "| Get SCREENSHOT_FORMAT |\n")
        public String getSCREENSHOT_FORMAT() throws Exception {
			return (String)getKeyValue("SCREENSHOT_FORMAT");
    	}

	@RobotKeyword("Set SWTPreferences SCREENSHOT_FORMAT\n\n"
            + "Example:\n"
            + "| Set SCREENSHOT_FORMAT | format | \n")
    @ArgumentNames({"value"})
        public void setSCREENSHOT_FORMAT(String value) throws Exception {
			setKeyValue("SCREENSHOT_FORMAT", value);
    	}

	@RobotKeyword("Get SWTPreferences KEYBOARD_LAYOUT\n\n"
            + "Example:\n"
            + "| Get KEYBOARD_LAYOUT |\n")
        public String getKEYBOARD_LAYOUT() throws Exception {
			return (String)getKeyValue("KEYBOARD_LAYOUT");
    	}
	@RobotKeyword("Set SWTPreferences KEYBOARD_LAYOUT\n\n"
            + "Example:\n"
            + "| Set KEYBOARD_LAYOUT | layout | \n")
    @ArgumentNames({"value"})
        public void setKEYBOARD_LAYOUT(String value) throws Exception {
			setKeyValue("KEYBOARD_LAYOUT", value);
    	}
	
	
	@RobotKeyword("Get SWTPreferences TYPE_INTERVAL as int\n\n"
            + "Example:\n"
            + "| Get TYPE_INTERVAL |\n")
        public int getTYPE_INTERVAL() throws Exception {
			return ((Integer)getKeyValue("TYPE_INTERVAL")).intValue();
    	}
	@RobotKeyword("Set SWTPreferences TYPE_INTERVAL as int\n\n"
            + "Example:\n"
            + "| Set TYPE_INTERVAL | 20 | \n")
    @ArgumentNames({"value"})
        public void setTYPE_INTERVAL(int value) throws Exception {
			setKeyValue("TYPE_INTERVAL", value);
    	}

	@RobotKeyword("Get SWTPreferences KEYBOARD_STRATEGY\n\n"
            + "Example:\n"
            + "| Get KEYBOARD_STRATEGY |\n")
        public String getKEYBOARD_STRATEGY() throws Exception {
			return (String)getKeyValue("KEYBOARD_STRATEGY");
    	}
	@RobotKeyword("Set SWTPreferences KEYBOARD_STRATEGY\n\n"
            + "Example:\n"
            + "| Set KEYBOARD_STRATEGY | stategy | \n")
    @ArgumentNames({"value"})
        public void setKEYBOARD_STRATEGY(String value) throws Exception {
			setKeyValue("KEYBOARD_STRATEGY", value);
    	}
	
}