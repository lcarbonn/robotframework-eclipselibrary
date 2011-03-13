/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbotpref;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.utils.TimeParser;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class SWTBotPreferencesActionKeywords {

	private static String prefclassname = "org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences";
	private static String DEFAULT_KEY = "DEFAULT_KEY";
	private static String DEFAULT_POLL_DELAY = "DEFAULT_POLL_DELAY";
	
	private Object getKeyValue(String key) throws SWTBotBridgeException {
		return SWTBotBridge.getStaticField(prefclassname, key);
	}
	
	private void setKeyValue(String key, Object value) throws SWTBotBridgeException {
		SWTBotBridge.setStaticField(prefclassname, key, value);
	}

	@RobotKeyword("Get SWTBotPreferences DEFAULT_KEY\n\n"
            + "Example:\n"
            + "| Get SWTBotPreferences DEFAULT_KEY |\n")
        public String getSWTBotPreferencesDEFAULT_KEY() throws SWTBotBridgeException {
			return (String)getKeyValue(DEFAULT_KEY);
    	}

	@RobotKeyword("Set SWTBotPreferences DEFAULT_KEY\n\n"
			+" The default key used to match SWT widgets. Defaults to org.eclipse.swtbot.widget.key." 			
            + "Example:\n"
            + "| Set SWTBotPreferences DEFAULT_KEY | org.eclipse.swtbot.widget.key | \n")
    @ArgumentNames({"value"})
        public void setSWTBotPreferencesDEFAULT_KEY(String value) throws SWTBotBridgeException {
			setKeyValue(DEFAULT_KEY, value);
    	}

	@RobotKeyword("Get SWTBotPreferences TIMEOUT in milliseconds\n\n"
            + "Example:\n"
            + "| Get SWTBotPreferences TIMEOUT |\n")
        public Long getSWTBotPreferencesTIMEOUT() throws SWTBotBridgeException {
			return ((Long)getKeyValue("TIMEOUT")).longValue();
    	}
	
	@RobotKeyword("Set SWTBotPreferences TIMEOUT in time format\n\n"
			+ "The timeout for finding widgets among other things. Defaults to 5000ms\n"
            + "Example:\n"
            + "| Set SWTBotPreferences TIMEOUT | 1 s | \n")
    @ArgumentNames({"value"})
        public void setSWTBotPreferencesTIMEOUT(String value) throws SWTBotBridgeException {
			System.out.println(value+":"+value.getClass().getName());
			long l = TimeParser.parseMillisecond(value);
			setKeyValue("TIMEOUT", l);
    	}

	@RobotKeyword("Get SWTBotPreferences RECORDER_FILE_NAME\n\n"
            + "Example:\n"
            + "| Get SWTBotPreferences RECORDER_FILE_NAME |\n")
        public String getSWTBotPreferencesRECORDER_FILE_NAME() throws SWTBotBridgeException {
			return (String)getKeyValue("RECORDER_FILE_NAME");
    	}

	@RobotKeyword("Set SWTBotPreferences RECORDER_FILE_NAME\n\n"
			+ "The name of the file in which the recorder records. Defaults to 'swtbot.record.txt'.\n"
            + "Example:\n"
            + "| Set SWTBotPreferences RECORDER_FILE_NAME | filename | \n")
    @ArgumentNames({"value"})
        public void setSWTBotPreferencesRECORDER_FILE_NAME(String value) throws SWTBotBridgeException {
			setKeyValue("RECORDER_FILE_NAME", value);
    	}
	
	@RobotKeyword("Get SWTBotPreferences PLAYBACK_DELAY in milliseconds\n\n"
            + "Example:\n"
            + "| Get SWTBotPreferences PLAYBACK_DELAY |\n")
        public long getSWTBotPreferencesPLAYBACK_DELAY() throws SWTBotBridgeException {
			return ((Long)getKeyValue("PLAYBACK_DELAY")).longValue();
    	}

	@RobotKeyword("Set SWTBotPreferences PLAYBACK_DELAY in time format\n\n"
			+ "The speed of playback in milliseconds. Defaults to 0 ms.\n"
            + "Example:\n"
            + "| Set SWTBotPreferences PLAYBACK_DELAY | 10 ms | \n")
    @ArgumentNames({"value"})
        public void setSWTBotPreferencesPLAYBACK_DELAY(String value) throws SWTBotBridgeException {
			long l = TimeParser.parseMillisecond(value);
			setKeyValue("PLAYBACK_DELAY", l);
    	}
	
	@RobotKeyword("Get SWTBotPreferences MAX_ERROR_SCREENSHOT_COUNT\n\n"
            + "Example:\n"
            + "| Get SWTBotPreferences MAX_ERROR_SCREENSHOT_COUNT |\n")
        public int getSWTBotPreferencesMAX_ERROR_SCREENSHOT_COUNT() throws SWTBotBridgeException {
			return ((Integer)getKeyValue("MAX_ERROR_SCREENSHOT_COUNT")).intValue();
    	}

	@RobotKeyword("Set SWTBotPreferences MAX_ERROR_SCREENSHOT_COUNT\n\n"
			+ "The maximum number of screenshots that SWTBot should capture. Defaults to 100.\n"
            + "Example:\n"
            + "| Set SWTBotPreferences MAX_ERROR_SCREENSHOT_COUNT | 20 | \n")
    @ArgumentNames({"value"})
        public void setSWTBotPreferencesMAX_ERROR_SCREENSHOT_COUNT(String value) throws SWTBotBridgeException {
			int i = Integer.valueOf(value).intValue();
			setKeyValue("MAX_ERROR_SCREENSHOT_COUNT", i);
    	}

	@RobotKeyword("Get SWTBotPreferences SCREENSHOTS_DIR\n\n"
            + "Example:\n"
            + "| Get SWTBotPreferences SCREENSHOTS_DIR |\n")
        public String getSWTBotPreferencesSCREENSHOTS_DIR() throws SWTBotBridgeException {
			return (String)getKeyValue("SCREENSHOTS_DIR");
    	}
	@RobotKeyword("Set SWTBotPreferences SCREENSHOTS_DIR\n\n"
			+ "The directory in which screenshots should be generated. Defaults to './screenshots'.\n"
            + "Example:\n"
            + "| Set SWTBotPreferences SCREENSHOTS_DIR | ./screenshots | \n")
    @ArgumentNames({"value"})
        public void setSWTBotPreferencesSCREENSHOTS_DIR(String value) throws SWTBotBridgeException {
			setKeyValue("SCREENSHOTS_DIR", value);
    	}
	
	
	@RobotKeyword("Get SWTBotPreferences SCREENSHOT_FORMAT\n\n"
            + "Example:\n"
            + "| Get SWTBotPreferences SCREENSHOT_FORMAT |\n")
        public String getSWTBotPreferencesSCREENSHOT_FORMAT() throws SWTBotBridgeException {
			return (String)getKeyValue("SCREENSHOT_FORMAT");
    	}

	@RobotKeyword("Set SWTBotPreferences SCREENSHOT_FORMAT\n\n"
			+ "The screenshot image format to be used. Defaults to 'jpeg'\n"
			+ "The value must be one these: BMP, GIF, ICO, JPEG, JPG, PNG or TIFF.\n"
            + "Example:\n"
            + "| Set SWTBotPreferences SCREENSHOT_FORMAT | PNG | \n")
    @ArgumentNames({"value"})
        public void setSWTBotPreferencesSCREENSHOT_FORMAT(String value) throws SWTBotBridgeException {
			setKeyValue("SCREENSHOT_FORMAT", value);
    	}

	@RobotKeyword("Get SWTBotPreferences KEYBOARD_LAYOUT\n\n"
            + "Example:\n"
            + "| Get SWTBotPreferences KEYBOARD_LAYOUT |\n")
        public String getSWTBotPreferencesKEYBOARD_LAYOUT() throws SWTBotBridgeException {
			return (String)getKeyValue("KEYBOARD_LAYOUT");
    	}
	@RobotKeyword("Set SWTBotPreferences KEYBOARD_LAYOUT\n\n"
			+ "The keyboard layout. This value is autodetected at runtime. This can be set using the system property 'org.eclipse.swtbot.keyboard.layout'.\n" 
			+ "Note: the layout must be of the form foo.bar.baz.[MAC_][LANGUAGE_][COUNTRY_][VARIANT_] This expects a file named 'foo/bar/baz/[MAC_][LANGUAGE_][COUNTRY_][VARIANT_].keyboard'\n\n" 

			+ "Eg: Layout Name       | Configuration File\n" 
			+ "com.foo.bar.MAC.EN.US | com/foo/bar/MAC_EN_US.keyboard\n" 
			+ "com.foo.bar.MAC.EN_GB | com/foo/bar/MAC_EN_GB.keyboard\n"
			+ "com.foo.bar.FR_FR     | com/foo/bar/FR_FR.keyboard\n"
			+ "com.foo.bar.DE        | /com/foo/bar/DE.keyboard\n\n"
			
            + "Example:\n"
            + "| Set SWTBotPreferences KEYBOARD_LAYOUT | layout | \n")
    @ArgumentNames({"value"})
        public void setSWTBotPreferencesKEYBOARD_LAYOUT(String value) throws SWTBotBridgeException {
			setKeyValue("KEYBOARD_LAYOUT", value);
    	}
	
	
	@RobotKeyword("Get SWTBotPreferences TYPE_INTERVAL in milliseconds\n\n"
            + "Example:\n"
            + "| Get SWTBotPreferences TYPE_INTERVAL |\n")
        public int getSWTBotPreferencesTYPE_INTERVAL() throws SWTBotBridgeException {
			return ((Integer)getKeyValue("TYPE_INTERVAL")).intValue();
    	}
	
	@RobotKeyword("Set SWTBotPreferences TYPE_INTERVAL in time format \n\n"
			+ "The the time interval in milliseconds between typing characters in a string. Defaults to 50ms\n"
            + "Example:\n"
            + "| Set SWTBotPreferences TYPE_INTERVAL | 20ms | \n")
    @ArgumentNames({"value"})
        public void setSWTBotPreferencesTYPE_INTERVAL(String value) throws SWTBotBridgeException {
			int i = ((Long)TimeParser.parseMillisecond(value)).intValue();
			setKeyValue("TYPE_INTERVAL", i);
    	}

	@RobotKeyword("Get SWTBotPreferences KEYBOARD_STRATEGY\n\n"
            + "Example:\n"
            + "| Get SWTBotPreferences KEYBOARD_STRATEGY |\n")
        public String getSWTBotPreferencesKEYBOARD_STRATEGY() throws SWTBotBridgeException {
			return (String)getKeyValue("KEYBOARD_STRATEGY");
    	}
	@RobotKeyword("Set SWTBotPreferences KEYBOARD_STRATEGY\n\n"
			+ "The default keyboard strategy. Defaults to org.eclipse.swtbot.swt.finder.keyboard.AWTKeyboardStrategy\n"
            + "Example:\n"
            + "| Set SWTBotPreferences KEYBOARD_STRATEGY | org.eclipse.swtbot.swt.finder.keyboard.AWTKeyboardStrategy | \n")
    @ArgumentNames({"value"})
        public void setSWTBotPreferencesKEYBOARD_STRATEGY(String value) throws SWTBotBridgeException {
			setKeyValue("KEYBOARD_STRATEGY", value);
    	}

	@RobotKeyword("Get SWTBotPreferences DEFAULT_POLL_DELAYL in milliseconds\n\n"
            + "Example:\n"
            + "| Get SWTBotPreferences DEFAULT_POLL_DELAY |\n")
        public int getSWTBotPreferencesDEFAULT_POLL_DELAY() throws SWTBotBridgeException {
			return ((Integer)getKeyValue(DEFAULT_POLL_DELAY)).intValue();
    	}
	
	@RobotKeyword("Set SWTBotPreferences DEFAULT_POLL_DELAY in time format\n\n"
			+ "The default time delay between successive polling while waiting for a condition to be evaluated. Defaults to 500ms.\n"
            + "Example:\n"
            + "| Set SWTBotPreferences DEFAULT_POLL_DELAY | 500ms | \n")
    @ArgumentNames({"value"})
        public void setSWTBotPreferencesDEFAULT_POLL_DELAY(String value) throws SWTBotBridgeException {
			int i = ((Long)TimeParser.parseMillisecond(value)).intValue();
			setKeyValue(DEFAULT_POLL_DELAY, i);
    	}
	
}