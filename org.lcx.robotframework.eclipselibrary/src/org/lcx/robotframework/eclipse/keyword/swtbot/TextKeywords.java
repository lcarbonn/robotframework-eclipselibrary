package org.lcx.robotframework.eclipse.keyword.swtbot;

import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widget.SWTBotText;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class TextKeywords {

    @RobotKeyword("Inserts text into a text component having the given label.\n\n"
            + "Example:\n"
            + "| Insert Into Textfield | username | foo |\n")
    @ArgumentNames({"label", "text"})
        public void insertIntoTextfield(String label, String text) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	SWTBotText t = bot.textWithLabel(label);
    	t.setText(text);
    }	
	

}
