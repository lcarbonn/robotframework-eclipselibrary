package org.lcx.robotframework.eclipse.keyword.swtbot;

import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class TrayKeywords {

    @RobotKeyword("Select tray item\n\n"
            + "Example:\n"
            + "| Select Tray Item |\n")
//    @ArgumentNames({"text"})
        public void selectTrayItem() throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	bot.trayItem();
    }	
	
    @RobotKeyword("Select indexed Tray Item\n\n"
            + "Example:\n"
            + "| Select Indexed Tray Item | 0 |\n")
    @ArgumentNames({"index"})
        public void selectIndexedTrayItem(String index) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	int indexI = Integer.valueOf(index).intValue();
    	bot.trayItem(indexI);
    }	

    @RobotKeyword("Select Tray Item with the given tooltip\n\n"
            + "Example:\n"
            + "| Select Tray Item With Tooltip | tooltip |\n")
    @ArgumentNames({"key"})
        public void selectTrayItemWithTooltip(String tooltip) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	bot.trayItemWithTooltip(tooltip);
    }	
	
    @RobotKeyword("Select Tray Item with the given tooltip\n\n"
            + "Example:\n"
            + "| Select Tray Item With Tooltip | tooltip | 0 |\n")
    @ArgumentNames({"tooltip", "index"})
        public void clickOnIndexedMenuWithKey(String tooltip, String index) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	int indexI = Integer.valueOf(index).intValue();
    	bot.trayItemWithTooltip(tooltip, indexI);
    }
    
}
