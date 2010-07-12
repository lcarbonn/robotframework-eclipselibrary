package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableItem;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class TableItemKeywords {
	

    @RobotKeyword("Click on the context menu with the given text of the selected item\n\n"
            + "Example:\n"
            + "| Click On Item Context Menu | text | \n")
    @ArgumentNames({"text"})
        public void clickOnItemContextMenu(String text) throws Exception {
    	SWTBotTableItem item = (SWTBotTableItem)Context.getCurrentWidget(SWTBotTableItem.class);
    	item.contextMenu(text).click();
    }
    
}
