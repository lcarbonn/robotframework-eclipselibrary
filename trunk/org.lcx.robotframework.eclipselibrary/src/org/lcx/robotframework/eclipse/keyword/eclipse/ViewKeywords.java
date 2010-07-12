package org.lcx.robotframework.eclipse.keyword.eclipse;

import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ViewKeywords {

    @RobotKeyword("Click on view toolbar button with the given labels\n\n"
            + "Example:\n"
            + "| Click On View Toolbarbutton | Task Repositories | Add Task Repository... | \n")
    @ArgumentNames({"viewTitle", "toolbarLabel"})
        public void clickOnViewToolbarbutton(String viewTitle, String toolbarLabel) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	bot.viewByTitle(viewTitle).toolbarButton(toolbarLabel).click();
    }	
	
    @RobotKeyword("Select a view by is title\n\n"
            + "Example:\n"
            + "| Select View By Title | Task Repositories | \n")
    @ArgumentNames({"viewTitle"})
        public void selectViewByTitle(String viewTitle) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	bot.viewByTitle(viewTitle);
    }	
}
