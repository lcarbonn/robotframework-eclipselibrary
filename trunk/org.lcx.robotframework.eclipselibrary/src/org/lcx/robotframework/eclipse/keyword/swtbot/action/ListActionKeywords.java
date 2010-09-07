/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ListActionKeywords {

	@RobotKeyword("Is the list active\n\n"
            + "Example:\n"
            + "| Is List Active |\n")
        public boolean isListActive() throws Exception {
    		SWTBotList list = (SWTBotList)Context.getCurrentWidget(SWTBotList.class);
    		return list.isActive();
    	}

	@RobotKeyword("Is the list enabled\n\n"
            + "Example:\n"
            + "| Is List Enabled |\n")
        public boolean isListEnabled() throws Exception {
    		SWTBotList list = (SWTBotList)Context.getCurrentWidget(SWTBotList.class);
    		return list.isEnabled();
    	}

	@RobotKeyword("Is the list visible\n\n"
            + "Example:\n"
            + "| Is List Visible |\n")
        public boolean isListVisible() throws Exception {
    		SWTBotList list = (SWTBotList)Context.getCurrentWidget(SWTBotList.class);
    		return list.isVisible();
    	}

	@RobotKeyword("Get the text of the list\n\n"
            + "Example:\n"
            + "| Get List Text |\n")
//    @ArgumentNames({"text"})
        public String getListText() throws Exception {
    		SWTBotList list = (SWTBotList)Context.getCurrentWidget(SWTBotList.class);
    		return list.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the list\n\n"
            + "Example:\n"
            + "| Get List Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getListTooltipText() throws Exception {
    		SWTBotList list = (SWTBotList)Context.getCurrentWidget(SWTBotList.class);
    		return list.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the list\n\n"
            + "Example:\n"
            + "| Set Focus On List |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnList() throws Exception {
    		SWTBotList list = (SWTBotList)Context.getCurrentWidget(SWTBotList.class);
    		list.setFocus();
    	}
	
	@RobotKeyword("Get the items of the list\n\n"
            + "Example:\n"
            + "| Get List Items |\n")
//    @ArgumentNames({"text"})
        public String[] getListItems() throws Exception {
    		SWTBotList list = (SWTBotList)Context.getCurrentWidget(SWTBotList.class);
    		return list.getItems();
    	}

	@RobotKeyword("Get the index of the given text in the list\n\n"
            + "Example:\n"
            + "| Get IndexOf Text In List |\n")
    @ArgumentNames({"text"})
        public int getIndexOfTextInList(String text) throws Exception {
    		SWTBotList list = (SWTBotList)Context.getCurrentWidget(SWTBotList.class);
    		return list.indexOf(text);
    	}

	@RobotKeyword("Get the text of the item at the geiven index in the list\n\n"
            + "Example:\n"
            + "| Get Text Item At Index In List | 1 | \n")
    @ArgumentNames({"index"})
        public String getTextItemAtIndexInList(String index) throws Exception {
    		SWTBotList list = (SWTBotList)Context.getCurrentWidget(SWTBotList.class);
    		if(index!=null) {
				Integer i = Integer.valueOf(index).intValue();
				return list.itemAt(i);
    		}
    		return null;
    	}

	@RobotKeyword("Count the items in the list\n\n"
            + "Example:\n"
            + "| Count List Items |\n")
//    @ArgumentNames({"text"})
        public int countListItems() throws Exception {
    		SWTBotList list = (SWTBotList)Context.getCurrentWidget(SWTBotList.class);
    		return list.itemCount();
    	}
	
	@RobotKeyword("Select the indexed item(s) in the list\n\n"
            + "Example:\n"
            + "| Select Indexed Items In List | 0 | 1 |\n")
    @ArgumentNames({"*index"})
        public void selectIndexedItemsInList(String... index) throws Exception {
    		SWTBotList list = (SWTBotList)Context.getCurrentWidget(SWTBotList.class);
    		int[] indexes = new int[index.length];
    		for (int i = 0; i < index.length; i++) {
				int ind = Integer.valueOf(index[i]).intValue();
				indexes[i] = ind;
			}
    		list.select(indexes);
    	}

	@RobotKeyword("Select the item(s) with the given text(s) in the list\n\n"
            + "Example:\n"
            + "| Select Items In List | item 0 | item 1 |\n")
    @ArgumentNames({"*text"})
        public void selectItemsInList(String... text) throws Exception {
    		SWTBotList list = (SWTBotList)Context.getCurrentWidget(SWTBotList.class);
    		list.select(text);
    	}

	@RobotKeyword("Get the selected items of the list\n\n"
            + "Example:\n"
            + "| Get Selected List Items |\n")
//    @ArgumentNames({"text"})
        public String[] getSelectedListItems() throws Exception {
    		SWTBotList list = (SWTBotList)Context.getCurrentWidget(SWTBotList.class);
    		return list.selection();
    	}

	@RobotKeyword("Get the count of selected items of the list\n\n"
            + "Example:\n"
            + "| Count List Selected Items |\n")
//    @ArgumentNames({"text"})
        public int countListSelectedItems() throws Exception {
    		SWTBotList list = (SWTBotList)Context.getCurrentWidget(SWTBotList.class);
    		return list.selectionCount();
    	}

	@RobotKeyword("Unselect all the items of the list\n\n"
            + "Example:\n"
            + "| Unselect All List Items |\n")
//    @ArgumentNames({"text"})
        public void unselectAllListItems() throws Exception {
    		SWTBotList list = (SWTBotList)Context.getCurrentWidget(SWTBotList.class);
    		list.unselect();
    	}

}