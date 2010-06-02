package org.lcx.robotframework.eclipse.keyword.swtbot;

import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class CheckBoxKeywords {

    @RobotKeyword("Click on the checkbox with the given mnemonicText\n\n"
            + "Example:\n"
            + "| Click On Checkbox | mnemonicText |\n")
    @ArgumentNames({"mnemonicText"})
        public void clickOnCheckbox(String mnemonicText) throws Exception {
    	SWTWorkbenchBot bot = new SWTWorkbenchBot();
    	bot.checkBox(mnemonicText).click();
    }
	
}
