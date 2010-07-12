package org.lcx.robotframework.eclipse.keyword.swtbot;

import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class MenuKeywords {

    @RobotKeyword("Click on menu with the given text\n\n"
            + "Example:\n"
            + "| Click On Menu | Add Task Repository |\n")
    @ArgumentNames({"text"})
        public void clickOnMenu(String text) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	bot.menu(text).click();
    }	
	
    @RobotKeyword("Click on indexed menu with the given text\n\n"
            + "Example:\n"
            + "| Click On Indexed Menu | Add Task Repository | 0 |\n")
    @ArgumentNames({"text", "index"})
        public void clickOnIndexedMenu(String text, String index) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	int indexI = Integer.valueOf(index).intValue();
    	bot.menu(text, indexI).click();
    }	

    @RobotKeyword("Click on menu with the given key\n\n"
            + "Example:\n"
            + "| Click On Menu With Key | id |\n")
    @ArgumentNames({"key"})
        public void clickOnMenuWithKey(String key) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	bot.menuWithId(key).click();
    }	
	
    @RobotKeyword("Click on Indexed menu with the given Key\n\n"
            + "Example:\n"
            + "| Click On Indexed Menu With Key | Add Task Repository | 0 |\n")
    @ArgumentNames({"key", "index"})
        public void clickOnIndexedMenuWithKey(String key, String index) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	int indexI = Integer.valueOf(index).intValue();
    	bot.menuWithId(key, indexI).click();
    }
    
    @RobotKeyword("Click On Indexed menu with the given id Key and id value\n\n"
            + "Example:\n"
            + "| Click On Menu With Id | Add Task Repository | 0 |\n")
    @ArgumentNames({"key", "id"})
        public void clickOnMenuWithKeyId(String key, String id) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	bot.menuWithId(key, id).click();
    }
    
    @RobotKeyword("Click On Indexed menu with the given id Key and id value\n\n"
            + "Example:\n"
            + "| Click On Indexed Menu With Id | Add Task Repository | 0 |\n")
    @ArgumentNames({"key", "id", "index"})
        public void clickOnIndexedMenuWithKeyId(String key, String id, String index) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	int indexI = Integer.valueOf(index).intValue();
    	bot.menuWithId(key, id, indexI).click();
    }

}
