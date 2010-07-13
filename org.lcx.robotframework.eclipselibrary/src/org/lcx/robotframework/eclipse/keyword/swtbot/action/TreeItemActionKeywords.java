package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import java.util.List;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class TreeItemActionKeywords {

	@RobotKeyword("Click on the tableItem\n\n"
            + "Example:\n"
            + "| Click TreeItem |\n")
        public void clickTreeItem() throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		treeItem.click();
    	}
	
	@RobotKeyword("Is the treeItem active\n\n"
            + "Example:\n"
            + "| Is TreeItem Active |\n")
        public boolean isTreeItemActive() throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		return treeItem.isActive();
    	}

	@RobotKeyword("Is the treeItem enabled\n\n"
            + "Example:\n"
            + "| Is TreeItem Enabled |\n")
        public boolean isTreeItemEnabled() throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		return treeItem.isEnabled();
    	}

	@RobotKeyword("Is the treeItem visible\n\n"
            + "Example:\n"
            + "| Is TreeItem Visible |\n")
        public boolean isTreeItemVisible() throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		return treeItem.isVisible();
    	}

	@RobotKeyword("Get the text of the treeItem\n\n"
            + "Example:\n"
            + "| Get TreeItem Text |\n")
//    @ArgumentNames({"text"})
        public String getTreeItemText() throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		return treeItem.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the treeItem\n\n"
            + "Example:\n"
            + "| Get TreeItem Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getTreeItemTooltipText() throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		return treeItem.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the treeItem\n\n"
            + "Example:\n"
            + "| Set Focus On TreeItem |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnTreeItem() throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		treeItem.setFocus();
    	}
	
	@RobotKeyword("Check the treeItem\n\n"
            + "Example:\n"
            + "| Check TreeItem |\n")
//    @ArgumentNames({"text"})
        public void checkTreeItem() throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		treeItem.check();
    	}

	@RobotKeyword("ToogleCheck the treeItem\n\n"
            + "Example:\n"
            + "| ToggleCheck TreeItem |\n")
//    @ArgumentNames({"text"})
        public void toggleCheckTreeItem() throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		treeItem.toggleCheck();
    	}

	@RobotKeyword("Is the treeItem checked\n\n"
            + "Example:\n"
            + "| Is TreeItem Checked |\n")
//    @ArgumentNames({"text"})
        public boolean isTreeItemChecked() throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		return treeItem.isChecked();
    	}

	@RobotKeyword("Is the treeItem expanded\n\n"
            + "Example:\n"
            + "| Is TreeItem Expanded |\n")
//    @ArgumentNames({"text"})
        public boolean isTreeItemExpanded() throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		return treeItem.isExpanded();
    	}
	
	@RobotKeyword("Is the treeItem selected\n\n"
            + "Example:\n"
            + "| Is TreeItem Selected |\n")
//    @ArgumentNames({"text"})
        public boolean isTreeItemSelected() throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		return treeItem.isSelected();
    	}

	@RobotKeyword("Select the treeItem\n\n"
            + "Example:\n"
            + "| Select TreeItem |\n")
//    @ArgumentNames({"text"})
        public void selectTreeItem() throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		treeItem.select();
    	}

	@RobotKeyword("Uncheck the treeItem\n\n"
            + "Example:\n"
            + "| Uncheck TreeItem |\n")
//    @ArgumentNames({"text"})
        public void uncheckTreeItem() throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		treeItem.uncheck();
    	}

	@RobotKeyword("Get the text of the cell of the treeItem at the given column\n\n"
            + "\t column the column number, 0 based."
            + "Example:\n"
            + "| Get TreeItem Column Cell |\n")
    @ArgumentNames({"column"})
        public String getTreeItemColumnCell(String column) throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		Integer c = Integer.valueOf(column).intValue();
    		return treeItem.cell(c);
    	}

	@RobotKeyword("Get the text of the cell of the treeItem at the given position\n\n"
			+ "\t row the row number, 0 based."
            + "\t column the column number, 0 based."
            + "Example:\n"
            + "| Get TreeItem Cell |\n")
    @ArgumentNames({"row", "column"})
        public String getTreeItemCell(String row, String column) throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		Integer r = Integer.valueOf(row).intValue();
    		Integer c = Integer.valueOf(column).intValue();
    		return treeItem.cell(r, c);
    	}

	@RobotKeyword("Collapse the treeItem\n\n"
            + "Example:\n"
            + "| Get TreeItem Cell |\n")
//    @ArgumentNames({"row", "column"})
        public void collapseTreeItem() throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		treeItem.collapse();
    	}
	
	@RobotKeyword("Collapse the treeItem node with the given text\n\n"
            + "Example:\n"
            + "| Collapse TreeItem Node |\n")
    @ArgumentNames({"text"})
        public void collapseTreeItemNode(String text) throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		treeItem.collapseNode(text);
    	}
	
	@RobotKeyword("Expand the treeItem\n\n"
            + "Example:\n"
            + "| Expand TreeItem |\n")
//    @ArgumentNames({"row", "column"})
        public void expandTreeItem() throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		treeItem.expand();
    	}
	
	@RobotKeyword("Expands the given treeItem nodes\n\n"
            + "Example:\n"
            + "| Expand TreeItem Nodes | text1 | text2 |\n")
    @ArgumentNames({"*text"})
        public void expandTreeItemNodes(String... text) throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		Context.setCurrentWidget(treeItem.expandNode(text));
    	}
	
	@RobotKeyword("Get the treeItem node at the given row\n\n"
            + "Example:\n"
            + "| Get TreeItem At Row | 0 | \n")
    @ArgumentNames({"row"})
        public void getTreeItemAtRow(String row) throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		int r = Integer.valueOf(row).intValue();
    		Context.setCurrentWidget(treeItem.getNode(r));
    	}

	@RobotKeyword("Get the treeItem node with the given text\n\n"
            + "Example:\n"
            + "| Get TreeItem With Text | text | \n")
    @ArgumentNames({"text"})
        public void getTreeItemWithText(String text) throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		Context.setCurrentWidget(treeItem.getNode(text));
    	}

	@RobotKeyword("Get the index'th treeItem node with the given text\n\n"
            + "Example:\n"
            + "| Get TreeItem With Text At Index | text | 0 |\n")
    @ArgumentNames({"text", "index"})
        public void getTreeItemWithTextAtIndex(String text, String index) throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		int i = Integer.valueOf(index).intValue();
    		Context.setCurrentWidget(treeItem.getNode(text, i));
    	}

	@RobotKeyword("Get the treeItem nodes\n\n"
            + "Example:\n"
            + "| Get TreeItem Nodes | \n")
//    @ArgumentNames({"text", "index"})
        public String[] getTreeItemNodes(String text, String index) throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		List<String> list = treeItem.getNodes();
    		String[] a = new String[list.size()];
    		list.toArray(a);
    		return a;
    	}

	@RobotKeyword("Count the treeItem rows (means children)\n\n"
            + "Example:\n"
            + "| Count TreeItem Rows | \n")
//    @ArgumentNames({"text", "index"})
        public int countTreeItemRows() throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		return treeItem.rowCount();
    	}

	@RobotKeyword("Double Click on the tableItem\n\n"
            + "Example:\n"
            + "| Double Click TreeItem |\n")
        public void doubleClickTreeItem() throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		treeItem.doubleClick();
    	}

	@RobotKeyword("Select the treeItem with the given name\n\n"
            + "Example:\n"
            + "| Select TreeItem With Name | name |\n")
    @ArgumentNames({"name"})
        public void selectTreeItemWithName(String name) throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		Context.setCurrentWidget(treeItem.select(name));
    	}

	@RobotKeyword("Select the treeItem with the given names\n\n"
            + "Example:\n"
            + "| Select TreeItem With Names | name1 | name2 | \n")
    @ArgumentNames({"*name"})
        public void selectTreeItemWithNames(String... names) throws Exception {
    		SWTBotTreeItem treeItem = (SWTBotTreeItem)Context.getCurrentWidget(SWTBotTreeItem.class);
    		Context.setCurrentWidget(treeItem.select(names));
    	}
	

}