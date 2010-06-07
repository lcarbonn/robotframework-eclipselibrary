package org.lcx.robotframework.eclipse.keyword.swtbot;

import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widget.SWTBotShell;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ShellKeywords {

    @RobotKeyword("Activate shell with the given text\n\n"
            + "Example:\n"
            + "| Activate Shell | Add Task Repository |\n")
    @ArgumentNames({"text"})
        public void activateShell(String text) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	SWTBotShell s = bot.shell(text);
    	s.activate();
    }	
	
}
