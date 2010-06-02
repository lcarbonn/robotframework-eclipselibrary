package org.lcx.robotframework.eclipse.keyword.swtbot;

import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ViewKeywords {

    @RobotKeyword("Click on view toolbar button with the given labels\n\n"
            + "Example:\n"
            + "| Click On View Toolbarbutton | Task Repositories | Add Task Repository... | \n")
    @ArgumentNames({"viewLabel", "toolbarLabel"})
        public void clickOnViewToolbarbutton(String viewLabel, String toolbarLabel) throws Exception {
    	SWTWorkbenchBot bot = new SWTWorkbenchBot();
    	bot.viewByTitle(viewLabel).toolbarButton(toolbarLabel).click();
    }	
	
}
