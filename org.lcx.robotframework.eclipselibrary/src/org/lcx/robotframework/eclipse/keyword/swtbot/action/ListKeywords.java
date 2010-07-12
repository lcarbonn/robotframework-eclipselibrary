package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import static org.junit.Assert.assertTrue;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ListKeywords {

    @RobotKeyword("Select the list\n\n"
            + "Example:\n"
            + "| Select List | \n")
        public void selectList() throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	bot.list();
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
    
    @RobotKeyword("Select the item(s) with the given label on the selected list\n\n"
            + "Example:\n"
            + "| Select Items On List | item1 | item2 | ... \n")
    @ArgumentNames({"*itemsLabel"})
        public void selectItemsOnList(String[] itemsLabel) throws Exception {
    	SWTBotList list = (SWTBotList)Context.getCurrentWidget(SWTBotList.class);
    	list.select(itemsLabel);
    }
    
    @RobotKeyword("Lines of indexed list should be equal to the givens text.\n\n"
            + "Example:\n"
            + "| List Lines Should Be Equal | 0 | line1 | line2 |\n")
    @ArgumentNames({"index", "*lines"})
        public void listLinesShouldBeEqual(String index, String... lines) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	int indexI = Integer.valueOf(index).intValue();
    	String[] ls = bot.list(indexI).getItems();
    	for (String string : ls) {
			System.out.println("line="+string);
		}
    	assertTrue(ls.length==lines.length);
    	int i=0;
    	for (String s : ls) {
    		assertTrue(s.equals(lines[i++]));
    	}
    }	

}
