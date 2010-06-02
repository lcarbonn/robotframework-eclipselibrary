package org.lcx.robotframework.eclipse.keyword.swtbot;

import org.lcx.robotframework.swtbot.eclipse.finder.SWTBotPerspective;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class PerspectiveKeywords {

    @RobotKeyword("Activate perspective with the given label\n\n"
            + "Example:\n"
            + "| Activate Perspective | Planning |\n")
    @ArgumentNames({"label"})
        public void activatePerspective(String label) throws Exception {
    	SWTWorkbenchBot bot = new SWTWorkbenchBot();
    	SWTBotPerspective p = bot.perspectiveByLabel(label);
    	p.activate();
    }	
}
