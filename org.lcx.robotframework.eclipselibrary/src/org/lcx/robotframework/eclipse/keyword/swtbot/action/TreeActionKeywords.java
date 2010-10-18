/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import java.util.List;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class TreeActionKeywords {

	@RobotKeyword("Is the tree active\n\n"
            + "Example:\n"
            + "| Is Tree Active |\n")
        public boolean isTreeActive() throws Exception {
    		SWTBotTree tree = (SWTBotTree)Context.getCurrentWidget(SWTBotTree.class);
    		return tree.isActive();
    	}

	@RobotKeyword("Is the tree enabled\n\n"
            + "Example:\n"
            + "| Is Tree Enabled |\n")
        public boolean isTreeEnabled() throws Exception {
    		SWTBotTree tree = (SWTBotTree)Context.getCurrentWidget(SWTBotTree.class);
    		return tree.isEnabled();
    	}

	@RobotKeyword("Is the tree visible\n\n"
            + "Example:\n"
            + "| Is Tree Visible |\n")
        public boolean isTreeVisible() throws Exception {
    		SWTBotTree tree = (SWTBotTree)Context.getCurrentWidget(SWTBotTree.class);
    		return tree.isVisible();
    	}

	@RobotKeyword("Get the text of the tree\n\n"
            + "Example:\n"
            + "| Get Tree Text |\n")
//    @ArgumentNames({"text"})
        public String getTreeText() throws Exception {
    		SWTBotTree tree = (SWTBotTree)Context.getCurrentWidget(SWTBotTree.class);
    		return tree.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the tree\n\n"
            + "Example:\n"
            + "| Get Tree Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getTreeTooltipText() throws Exception {
    		SWTBotTree tree = (SWTBotTree)Context.getCurrentWidget(SWTBotTree.class);
    		return tree.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the tree\n\n"
            + "Example:\n"
            + "| Set Focus On Tree |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnTree() throws Exception {
    		SWTBotTree tree = (SWTBotTree)Context.getCurrentWidget(SWTBotTree.class);
    		tree.setFocus();
    	}
	
	@RobotKeyword("Get the text of the cell of the tree at the given position\n\n"
			+ "\t row the row number, 0 based."
            + "\t column the column number, 0 based."
            + "Example:\n"
            + "| Get Tree Cell |\n")
    @ArgumentNames({"row", "column"})
        public String getTreeCell(String row, String column) throws Exception {
    		SWTBotTree tree = (SWTBotTree)Context.getCurrentWidget(SWTBotTree.class);
    		Integer r = Integer.valueOf(row).intValue();
    		Integer c = Integer.valueOf(column).intValue();
    		return tree.cell(r, c);
    	}

	@RobotKeyword("Get the text of the cell of the tree at the given row and column name\n\n"
			+ "\t row the row number, 0 based."
            + "\t columnName the name of the column."
            + "Example:\n"
            + "| Get Tree Cell With Column Name |\n")
    @ArgumentNames({"row", "columnName"})
        public String getTreeCellWithColumnName(String row, String columnName) throws Exception {
    		SWTBotTree tree = (SWTBotTree)Context.getCurrentWidget(SWTBotTree.class);
    		Integer r = Integer.valueOf(row).intValue();
    		return tree.cell(r, columnName);
    	}

	@RobotKeyword("Collapse the tree node with the given text\n\n"
            + "Example:\n"
            + "| Collapse Tree Node |\n")
    @ArgumentNames({"text"})
        public void collapseTreeNode(String text) throws Exception {
    		SWTBotTree tree = (SWTBotTree)Context.getCurrentWidget(SWTBotTree.class);
    		tree.collapseNode(text);
    	}
	
	@RobotKeyword("Count the number of columns in the tree\n\n"
            + "Example:\n"
            + "| Count Tree Columns|\n")
//    @ArgumentNames({"row", "column"})
        public int countTreeColumns() throws Exception {
    		SWTBotTree tree = (SWTBotTree)Context.getCurrentWidget(SWTBotTree.class);
    		return tree.columnCount();
    	}

	@RobotKeyword("Count the number of rows in the tree\n\n"
            + "Example:\n"
            + "| Count Tree Rows|\n")
//    @ArgumentNames({"row", "column"})
        public int countTreeRows() throws Exception {
    		SWTBotTree tree = (SWTBotTree)Context.getCurrentWidget(SWTBotTree.class);
    		return tree.rowCount();
    	}

	@RobotKeyword("Count the number of columns in the tree\n\n"
            + "Example:\n"
            + "| Get Tree Columns|\n")
//    @ArgumentNames({"row", "column"})
        public String[] getTreeColumns() throws Exception {
    		SWTBotTree tree = (SWTBotTree)Context.getCurrentWidget(SWTBotTree.class);
    		List<String> list = tree.columns();
    		String[] a = new String[list.size()];
    		list.toArray(a);
    		return a;
    	}

	@RobotKeyword("Find the tree treeItem with the given text\n\n"
            + "Example:\n"
            + "| Find Tree TreeItem | text |\n")
    @ArgumentNames({"text"})
        public void findTreeTreeItem(String text) throws Exception {
    		SWTBotTree tree = (SWTBotTree)Context.getCurrentWidget(SWTBotTree.class);
    		SWTBotTreeItem item = tree.getTreeItem(text);
    		Context.setCurrentWidget(item);
    	}

	@RobotKeyword("Get all the tree treeItems text as a array of string\n\n"
            + "Example:\n"
            + "| Get All Tree Items |\n")
//    @ArgumentNames({"text"})
        public String[] getAllTreeItems() throws Exception {
    		SWTBotTree tree = (SWTBotTree)Context.getCurrentWidget(SWTBotTree.class);
    		SWTBotTreeItem[] items = tree.getAllItems();
    		String[] its = new String[items.length];
    		for (int i = 0; i < items.length; i++) {
				its[i] = items[i].getText();
			}
    		return its;
    	}

	@RobotKeyword("Expands the given tree nodes\n\n"
            + "Example:\n"
            + "| Expand Tree Nodes | text1 | text2 |\n")
    @ArgumentNames({"*text"})
        public void expandTreeNodes(String... text) throws Exception {
    		SWTBotTree tree = (SWTBotTree)Context.getCurrentWidget(SWTBotTree.class);
    		tree.expandNode(text);
//    		Context.setCurrentWidget(tree.expandNode(text));
    	}
	
	@RobotKeyword("Expands the given tree node recursivly\n\n"
            + "Example:\n"
            + "| Expand Tree Node | text1 | true |\n")
    @ArgumentNames({"text", "recursive"})
        public void expandTreeNode(String text, String recursive) throws Exception {
    		SWTBotTree tree = (SWTBotTree)Context.getCurrentWidget(SWTBotTree.class);
    		boolean b = Boolean.valueOf(recursive).booleanValue();
    		tree.expandNode(text, b);
//    		Context.setCurrentWidget(tree.expandNode(text, b));
    	}
	
	@RobotKeyword("Select the indexed item(s) in the tree\n\n"
            + "Example:\n"
            + "| Select Indexed Items In Tree | 0 | 1 |\n")
    @ArgumentNames({"*index"})
        public void selectIndexedItemsInTree(String... index) throws Exception {
    		SWTBotTree tree = (SWTBotTree)Context.getCurrentWidget(SWTBotTree.class);
    		int[] indexes = new int[index.length];
    		for (int i = 0; i < index.length; i++) {
				int ind = Integer.valueOf(index[i]).intValue();
				indexes[i] = ind;
			}
    		tree.select(indexes);
    	}

	@RobotKeyword("Select the item(s) with the given text(s) in the tree\n\n"
            + "Example:\n"
            + "| Select Items In Tree | item0 | item1 |\n")
    @ArgumentNames({"*text"})
        public void selectItemsInTree(String... text) throws Exception {
    		SWTBotTree tree = (SWTBotTree)Context.getCurrentWidget(SWTBotTree.class);
    		tree.select(text);
    	}
	
	@RobotKeyword("Get the count of selected items of the tree\n\n"
            + "Example:\n"
            + "| Count Tree Selected Items |\n")
//    @ArgumentNames({"text"})
        public int countTreeSelectedItems() throws Exception {
    		SWTBotTree tree = (SWTBotTree)Context.getCurrentWidget(SWTBotTree.class);
    		return tree.selectionCount();
    	}
	
	@RobotKeyword("Does the tree have items\n\n"
            + "Example:\n"
            + "| Has Tree Items |\n")
//    @ArgumentNames({"text"})
        public boolean hasTreeItems() throws Exception {
    		SWTBotTree tree = (SWTBotTree)Context.getCurrentWidget(SWTBotTree.class);
    		return tree.hasItems();
    	}
	
	@RobotKeyword("Count the tree visible rows\n\n"
            + "Example:\n"
            + "| Count Tree Visible Rows |\n")
//    @ArgumentNames({"text"})
        public int countTreeVisibleRows() throws Exception {
    		SWTBotTree tree = (SWTBotTree)Context.getCurrentWidget(SWTBotTree.class);
    		return tree.visibleRowCount();
    	}
	
	@RobotKeyword("Unselect all the items of the tree\n\n"
            + "Example:\n"
            + "| Unselect All Tree Items |\n")
//    @ArgumentNames({"text"})
        public void unselectAllTreeItems() throws Exception {
    		SWTBotTree tree = (SWTBotTree)Context.getCurrentWidget(SWTBotTree.class);
    		tree.unselect();
    	}
	
}