package org.lcx.robotframework.eclipse.keyword.swtbot;

import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ButtonKeywords {

    @RobotKeyword("Click on the button with the given mnemonic\n\n"
            + "Example:\n"
            + "| Click On Button | mnemonicText |\n")
    @ArgumentNames({"mnemonicText"})
        public void clickOnButton(String mnemonicText) throws Exception {
    	SWTWorkbenchBot bot = new SWTWorkbenchBot();
    	bot.button(mnemonicText).click();
    }
	
    @RobotKeyword("Click on the button with the given index\n\n"
            + "Example:\n"
            + "| Click On Indexed Button | index |\n")
    @ArgumentNames({"index"})
        public void clickOnIndexedButton(int index) throws Exception {
    	SWTWorkbenchBot bot = new SWTWorkbenchBot();
    	bot.button(index).click();
    }
}
