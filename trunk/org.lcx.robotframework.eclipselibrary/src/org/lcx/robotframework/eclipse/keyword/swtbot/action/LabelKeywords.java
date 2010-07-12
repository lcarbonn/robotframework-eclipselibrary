package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class LabelKeywords {

    @RobotKeyword("Set the focus on the label with the given mnemonicText\n\n"
            + "Example:\n"
            + "| Focus On Label | mnemonicText |\n")
    @ArgumentNames({"mnemonicText"})
        public void focusOnLabel(String mnemonicText) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	bot.label(mnemonicText).setFocus();
    }
	
}
