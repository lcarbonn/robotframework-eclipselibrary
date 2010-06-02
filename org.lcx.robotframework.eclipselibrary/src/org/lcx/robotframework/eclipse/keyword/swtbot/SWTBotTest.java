package org.lcx.robotframework.eclipse.keyword.swtbot;

import java.lang.reflect.Method;

import org.apache.log4j.BasicConfigurator;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class SWTBotTest {
	
    @RobotKeyword("openAboutMenu.\n\n"
            + "Example:\n"
            + "| Open About Menu |\n")
        public void openAboutMenu() throws Exception {
    	
    	try {
		BasicConfigurator.configure();

		System.out.println("test starting");
		
			Object swtbotservice = SWTBotBridge.getSwtbotservice();
			Method getDisplay = swtbotservice.getClass().getDeclaredMethod("getDisplay");
			Object display = getDisplay.invoke(swtbotservice);
			System.out.println("Display="+display);
			
		System.out.println("test ended");
		
	} catch (Exception e) {
		e.printStackTrace();
		throw e;
	}
    }	
}
