package org.lcx.robotframework.eclipse.keyword.swtbot;

import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widget.SWTBotTable;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class TableKeywords {

    @RobotKeyword("Select the item(s) with the given label on the table\n\n"
            + "Example:\n"
            + "| Select Items On Table | item1 | item2 | ... \n")
    @ArgumentNames({"*itemsLabel"})
        public void selectItemsOnTable(String[] itemsLabel) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	SWTBotTable table = bot.table();
    	table.select(itemsLabel);
    }

}
