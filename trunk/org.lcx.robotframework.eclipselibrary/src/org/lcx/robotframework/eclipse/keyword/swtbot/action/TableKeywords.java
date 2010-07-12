package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import static org.junit.Assert.assertTrue;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableItem;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class TableKeywords {
	

    @RobotKeyword("Select the table\n\n"
            + "Example:\n"
            + "| Select Table |\n")
        public void selectTable() throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	bot.table();
    }
	
	@RobotKeyword("Select the indexed table\n\n"
            + "Example:\n"
            + "| Select Indexed Table | 0 |\n")
    @ArgumentNames({"index"})
        public void selectIndexedTable(String index) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	int indexI = Integer.valueOf(index).intValue();
    	bot.table(indexI);
    }

    @RobotKeyword("Select the item(s) with the given label on the selected table\n\n"
            + "Example:\n"
            + "| Select Items On Table | item1 | item2 | ... \n")
    @ArgumentNames({"*itemsLabel"})
        public void selectItemsOnTable(String[] itemsLabel) throws Exception {
    	SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    	table.select(itemsLabel);
    }

    @RobotKeyword("Select the item(s) with the given label on the indexed table\n\n"
            + "Example:\n"
            + "| Select Items On Indexed Table | 0 | item1 | item2 | ... \n")
    @ArgumentNames({"index", "*itemsLabel"})
        public void selectItemsOnIndexedTable(String index, String[] itemsLabel) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	int indexI = Integer.valueOf(index).intValue();
    	SWTBotTable table = bot.table(indexI);
    	table.select(itemsLabel);
    }

    @RobotKeyword("Does the selected table contains the given item\n\n"
            + "Example:\n"
            + "| Table Should Contains Item | item | \n")
    @ArgumentNames({"item"})
        public void tableShouldContainsItem(String item) throws Exception {
    	SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    	assertTrue(table.containsItem(item));
    }
    
    @RobotKeyword("Click on the context menu with the given text of the selected table\n\n"
            + "Example:\n"
            + "| Click On Table Context Menu | text | \n")
    @ArgumentNames({"text"})
        public void clickOnTableContextMenu(String text) throws Exception {
    	SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    	table.contextMenu(text).click();
    }
    
    @RobotKeyword("Select (and keep as current widget) the item with the given label on the selected table\n\n"
            + "Example:\n"
            + "| Get Item On Table  | item1 |\n")
    @ArgumentNames({"itemLabel"})
        public void getItemOnTable(String itemLabel) throws Exception {
    	SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    	SWTBotTableItem item = table.getTableItem(itemLabel);
		Context.setCurrentWidget(item);
    }

}
