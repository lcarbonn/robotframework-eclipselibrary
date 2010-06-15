package org.lcx.robotframework.eclipse.keyword.swtbot;

import static org.junit.Assert.assertTrue;

import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class TextKeywords {

    @RobotKeyword("Inserts text into a text component having the given label.\n\n"
            + "Example:\n"
            + "| Insert Into Text | username | foo |\n")
    @ArgumentNames({"label", "text"})
        public void insertIntoText(String label, String text) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	SWTBotText t = bot.textWithLabel(label);
    	t.setText(text);
    }	
	
    @RobotKeyword("Text of text component with the given label should be equal to the given text.\n\n"
            + "Example:\n"
            + "| Text Should Be Equal | username | foo |\n")
    @ArgumentNames({"label", "text"})
        public void textShouldBeEqual(String label, String text) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	SWTBotText t = bot.textWithLabel(label);
    	assertTrue(t.getText().equals(text));
    }	

}
