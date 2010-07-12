package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class CTabItemKeywords {
	

    @RobotKeyword("Activate CTab Item\n\n"
            + "Example:\n"
            + "| Activate CTab Item | \n")
//    @ArgumentNames({"text"})
        public void activateCTabItem() throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	bot.cTabItem().activate();
    }
    
    @RobotKeyword("Activate CTab Item with the given mnemonicText\n\n"
            + "Example:\n"
            + "| Activate CTab Item With Text | New Task | \n")
    @ArgumentNames({"mnemonicText"})
        public void activateCTabItemWithText(String mnemonicText) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	bot.cTabItem(mnemonicText).activate();
    }

    @RobotKeyword("Activate the indexed CTab Item with the given mnemonicText\n\n"
            + "Example:\n"
            + "| Activate Indexed CTab Item With Text | New Task | 0 | \n")
    @ArgumentNames({"mnemonicText", "index"})
        public void activateIndexedCTabItemWithText(String mnemonicText, String index) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	int indexI = Integer.valueOf(index).intValue();
    	bot.cTabItem(mnemonicText, indexI).activate();
    }

    @RobotKeyword("Activate the indexed CTab Item\n\n"
            + "Example:\n"
            + "| Activate Indexed CTab Item | 0 | \n")
    @ArgumentNames({"index"})
        public void activateIndexedCTabItem(String index) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	int indexI = Integer.valueOf(index).intValue();
    	bot.cTabItem(indexI).activate();
    }
}
