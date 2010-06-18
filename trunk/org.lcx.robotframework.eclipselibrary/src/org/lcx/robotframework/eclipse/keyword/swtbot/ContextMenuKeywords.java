package org.lcx.robotframework.eclipse.keyword.swtbot;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ContextMenuKeywords {
	
    @RobotKeyword("Click on the context menu with the given text on the last widget\n\n"
            + "Example:\n"
            + "| Click On Context Menu | text | \n")
    @ArgumentNames({"text"})
        public void clickOnContextMenu(String text) throws Exception {
    	AbstractSWTBotControl widget = Context.getCurrentWidget();
    	widget.contextMenu(text).click();
    }
    
}
