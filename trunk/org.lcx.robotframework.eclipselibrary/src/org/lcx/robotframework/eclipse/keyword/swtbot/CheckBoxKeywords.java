package org.lcx.robotframework.eclipse.keyword.swtbot;

import static org.junit.Assert.assertTrue;

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
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	bot.checkBox(mnemonicText).click();
    }
	
    @RobotKeyword("Does the checkbox with the given mnemonicText is checked\n\n"
            + "Example:\n"
            + "| Checkbox Should Be Checked | mnemonicText |\n")
    @ArgumentNames({"mnemonicText"})
        public void checkboxShouldBeChecked(String mnemonicText) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	assertTrue(bot.checkBox(mnemonicText).isChecked());
    }
}
