/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import java.util.List;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableColumn;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableItem;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class TableActionKeywords {

	@RobotKeyword("Is the table active\n\n"
            + "Example:\n"
            + "| Is Table Active |\n")
        public boolean isTableActive() throws SWTBotBridgeException {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		return table.isActive();
    	}

	@RobotKeyword("Is the table enabled\n\n"
            + "Example:\n"
            + "| Is Table Enabled |\n")
        public boolean isTableEnabled() throws SWTBotBridgeException {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		return table.isEnabled();
    	}

	@RobotKeyword("Is the table visible\n\n"
            + "Example:\n"
            + "| Is Table Visible |\n")
        public boolean isTableVisible() throws SWTBotBridgeException {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		return table.isVisible();
    	}

	@RobotKeyword("Get the text of the table\n\n"
            + "Example:\n"
            + "| Get Table Text |\n")
//    @ArgumentNames({"text"})
        public String getTableText() throws SWTBotBridgeException {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		return table.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the table\n\n"
            + "Example:\n"
            + "| Get Table Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getTableTooltipText() throws SWTBotBridgeException {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		return table.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the table\n\n"
            + "Example:\n"
            + "| Set Focus On Table |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnTable() throws SWTBotBridgeException {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		table.setFocus();
    	}
	
	@RobotKeyword("Get the text of the cell of the table at the given position\n\n"
			+ "\t row the row number, 0 based."
            + "\t column the column number, 0 based."
            + "Example:\n"
            + "| Get Table Cell |\n")
    @ArgumentNames({"row", "column"})
        public String getTableCell(String row, String column) throws SWTBotBridgeException {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		Integer r = Integer.valueOf(row).intValue();
    		Integer c = Integer.valueOf(column).intValue();
    		return table.cell(r, c);
    	}

	@RobotKeyword("Get the text of the cell of the table at the given row and column name\n\n"
			+ "\t row the row number, 0 based."
            + "\t columnName the name of the column."
            + "Example:\n"
            + "| Get Table Cell With Column Name |\n")
    @ArgumentNames({"row", "columnName"})
        public String getTableCellWithColumnName(String row, String columnName) throws SWTBotBridgeException {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		Integer r = Integer.valueOf(row).intValue();
    		return table.cell(r, columnName);
    	}

	@RobotKeyword("Click on the given cell of table\n\n"
			+ "\t row the row number, 0 based."
            + "\t column the column number, 0 based."
            + "Example:\n"
            + "| Click Table Cell |\n")
    @ArgumentNames({"row", "column"})
        public void clickTableCell(String row, String column) throws SWTBotBridgeException {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		Integer r = Integer.valueOf(row).intValue();
    		Integer c = Integer.valueOf(column).intValue();
    		table.click(r, c);
    	}

	@RobotKeyword("Count the number of columns in the table\n\n"
            + "Example:\n"
            + "| Count Table Columns |\n")
//    @ArgumentNames({"row", "column"})
        public int countTableColumns() throws SWTBotBridgeException {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		return table.columnCount();
    	}

	@RobotKeyword("Count the number of rows in the table\n\n"
            + "Example:\n"
            + "| Count Table Rows |\n")
//    @ArgumentNames({"row", "column"})
        public int countTableRows() throws SWTBotBridgeException {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		return table.rowCount();
    	}

	@RobotKeyword("Count the number of columns in the table\n\n"
            + "Example:\n"
            + "| Get Table Columns |\n")
//    @ArgumentNames({"row", "column"})
        public String[] getTableColumns() throws SWTBotBridgeException {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		List<String> list = table.columns();
    		String[] a = new String[list.size()];
    		list.toArray(a);
    		return a;
    	}

	@RobotKeyword("Does the table contains the given item\n\n"
            + "Example:\n"
            + "| Table Contains Item |\n")
    @ArgumentNames({"text"})
        public boolean tableContainsItem(String text) throws SWTBotBridgeException {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		return table.containsItem(text);
    	}

	@RobotKeyword("Double Click on the given cell of table\n\n"
			+ "\t row the row number, 0 based."
            + "\t column the column number, 0 based."
            + "Example:\n"
            + "| Double Click Table Cell |\n")
    @ArgumentNames({"row", "column"})
        public void doubleClickTableCell(String row, String column) throws SWTBotBridgeException {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		Integer r = Integer.valueOf(row).intValue();
    		Integer c = Integer.valueOf(column).intValue();
    		table.doubleClick(r, c);
    	}

	@RobotKeyword("Get the table item at the given row\n\n"
			+ "\t row the row number, 0 based."
            + "Example:\n"
            + "| Get Table Item At Row | 0 |\n")
    @ArgumentNames({"row"})
        public SWTBotTableItem getTableItemAtRow(String row) throws SWTBotBridgeException {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		Integer r = Integer.valueOf(row).intValue();
    		SWTBotTableItem item = table.getTableItem(r);
    		Context.setCurrentWidget(item);
    		return item;
    	}

	@RobotKeyword("Get the table item with the given text\n\n"
            + "Example:\n"
            + "| Get Table Item With Text | text |\n")
    @ArgumentNames({"text"})
        public SWTBotTableItem getTableItemWithText(String text) throws SWTBotBridgeException {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		SWTBotTableItem item = table.getTableItem(text);
    		Context.setCurrentWidget(item);
    		return item;
    	}

	@RobotKeyword("Get the table header with the given text\n\n"
            + "Example:\n"
            + "| Get Table Header With Text | text |\n")
    @ArgumentNames({"text"})
        public SWTBotTableColumn getTableHeader(String text) throws SWTBotBridgeException {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		SWTBotTableColumn header = table.header(text);
    		Context.setCurrentWidget(header);
    		return header;
    	}

	@RobotKeyword("Gets the index of the item matching the given item\n"
			+ " , or -1 if the item does not exist in the table.\n\n"
            + "Example:\n"
            + "| Get Table Item Index | text |\n")
    @ArgumentNames({"text"})
        public int getTableItemIndex(String text) throws SWTBotBridgeException {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		return table.indexOf(text);
    	}

	@RobotKeyword("Gets the index of the item matching the given item and the given column\n"
			+ " , or -1 if the item does not exist in the table.\n\n"
            + "Example:\n"
            + "\t column the column number, 0 based.\n"
            + "| Get Table Item Index In Column Name | text | name | \n")
    @ArgumentNames({"text", "columnName"})
        public int getTableItemIndexInColumnName(String text, String columnName) throws SWTBotBridgeException {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		return table.indexOf(text, columnName);
    	}
	
	@RobotKeyword("Gets the index of the item matching the given item and the given column\n"
			+ " , or -1 if the item does not exist in the table.\n\n"
            + "Example:\n"
            + "\t column the column number, 0 based.\n"
            + "| Get Table Item Index In Column | text | 0 | \n")
    @ArgumentNames({"text", "column"})
        public int getTableItemIndexInColumn(String text, String column) throws SWTBotBridgeException {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		Integer c = Integer.valueOf(column).intValue();
    		return table.indexOf(text, c);
    	}

	@RobotKeyword("Gets the index of the column matching the given name\n"
			+ " , or -1 if the column does not exist in the table.\n\n"
            + "Example:\n"
            + "| Get Table Column Index | columnName | \n")
    @ArgumentNames({"columnName"})
        public int getTableColumnIndex(String columnName) throws SWTBotBridgeException {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		return table.indexOfColumn(columnName);
    	}
	
	@RobotKeyword("Select the indexed item(s) in the table\n\n"
            + "Example:\n"
            + "| Select Indexed Items In Table | 0 | 1 |\n")
    @ArgumentNames({"*index"})
        public void selectIndexedItemsInTable(String... index) throws SWTBotBridgeException {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		int[] indexes = new int[index.length];
    		for (int i = 0; i < index.length; i++) {
				int ind = Integer.valueOf(index[i]).intValue();
				indexes[i] = ind;
			}
    		table.select(indexes);
    	}

	@RobotKeyword("Select the item(s) with the given text(s) in the table\n\n"
            + "Example:\n"
            + "| Select Items In Table | item0 | item1 |\n")
    @ArgumentNames({"*text"})
        public void selectItemsInTable(String... text) throws SWTBotBridgeException {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		table.select(text);
    	}

	@RobotKeyword("Get the count of selected items of the table\n\n"
            + "Example:\n"
            + "| Count Table Selected Items |\n")
//    @ArgumentNames({"text"})
        public int countTableSelectedItems() throws SWTBotBridgeException {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		return table.selectionCount();
    	}

	@RobotKeyword("Unselect all the items of the table\n\n"
            + "Example:\n"
            + "| Unselect All Table Items |\n")
//    @ArgumentNames({"text"})
        public void unselectAllTableItems() throws SWTBotBridgeException {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		table.unselect();
    	}

}