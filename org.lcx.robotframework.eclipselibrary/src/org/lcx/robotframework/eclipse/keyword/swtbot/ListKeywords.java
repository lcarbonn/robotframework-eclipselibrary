package org.lcx.robotframework.eclipse.keyword.swtbot;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widget.SWTBotList;
import org.lcx.robotframework.swtbot.swt.finder.widget.SWTBotWidget;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ListKeywords {

    @RobotKeyword("Select the item(s) with the given label on the indexed list\n\n"
            + "Example:\n"
            + "| Select Items On Indexed List | index  | item1 | item2 | ... \n")
    @ArgumentNames({"index", "*itemsLabel"})
        public void selectItemsOnIndexedList(String index, String[] itemsLabel) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	int indexI = Integer.valueOf(index).intValue();
    	SWTBotList list = bot.list(indexI);
    	list.select(itemsLabel);
    }
    
    @RobotKeyword("Select the item(s) with the given label on the last selected list\n\n"
            + "Example:\n"
            + "| Select Items On Last List | item1 | item2 | ... \n")
    @ArgumentNames({"*itemsLabel"})
        public void selectItemsOnLastList(String[] itemsLabel) throws Exception {
    	SWTBotWidget w = Context.getCurrentWidget();
    	if(!(w instanceof SWTBotList)) {
    		throw new Exception("Last selected widget is not a List but instance of"+w.getClass().getName());
    	}
    	SWTBotList list = (SWTBotList)Context.getCurrentWidget();
    	list.select(itemsLabel);
    }

    @RobotKeyword("Select the indexed list\n\n"
            + "Example:\n"
            + "| Select Indexed List | index |\n")
    @ArgumentNames({"index"})
        public void selectIndexedList(String index) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	int indexI = Integer.valueOf(index).intValue();
    	bot.list(indexI);
    }
    
}
