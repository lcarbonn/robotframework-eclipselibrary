package org.lcx.robotframework.eclipse.keyword.swtbot;

import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ShellKeywords {

    @RobotKeyword("Activate shell\n\n"
            + "Example:\n"
            + "| Activate Shell|\n")
//    @ArgumentNames({})
        public void activateShell() throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	bot.activeShell();
    }	

    @RobotKeyword("Activate shell with the given text\n\n"
            + "Example:\n"
            + "| Activate Shell | Add Task Repository |\n")
    @ArgumentNames({"text"})
        public void activateShell(String text) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	bot.shell(text).activate();
    }	
	
    @RobotKeyword("Activate Indexed shell with the given text\n\n"
            + "Example:\n"
            + "| Activate Indexed Shell | Add Task Repository | 0 |\n")
    @ArgumentNames({"text", "index"})
        public void activateIndexedShell(String text, String index) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	int indexI = Integer.valueOf(index).intValue();
    	bot.shell(text, indexI).activate();
    }	

    @RobotKeyword("Activate shell with the given key\n\n"
            + "Example:\n"
            + "| Activate Shell With Key | id |\n")
    @ArgumentNames({"key"})
        public void activateShellWithKey(String key) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	bot.shellWithId(key).activate();
    }	
	
    @RobotKeyword("Activate Indexed shell with the given Key\n\n"
            + "Example:\n"
            + "| Activate Indexed Shell With Key | Add Task Repository | 0 |\n")
    @ArgumentNames({"key", "index"})
        public void activateIndexedShellWithKey(String key, String index) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	int indexI = Integer.valueOf(index).intValue();
    	bot.shellWithId(key, indexI).activate();
    }
    
    @RobotKeyword("Activate Indexed shell with the given id Key and id value\n\n"
            + "Example:\n"
            + "| Activate Shell With Id | Add Task Repository | 0 |\n")
    @ArgumentNames({"key", "id"})
        public void activateShellWithKeyId(String key, String id) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	bot.shellWithId(key, id).activate();
    }
    
    @RobotKeyword("Activate Indexed shell with the given id Key and id value\n\n"
            + "Example:\n"
            + "| Activate Indexed Shell With Id | Add Task Repository | 0 |\n")
    @ArgumentNames({"key", "id", "index"})
        public void activateIndexedShellWithKeyId(String key, String id, String index) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	int indexI = Integer.valueOf(index).intValue();
    	bot.shellWithId(key, id, indexI).activate();
    }

}
