package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import java.util.List;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class TableActionKeywords {

	@RobotKeyword("Is the table active\n\n"
            + "Example:\n"
            + "| Is Table Active |\n")
        public boolean isTableActive() throws Exception {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		return table.isActive();
    	}

	@RobotKeyword("Is the table enabled\n\n"
            + "Example:\n"
            + "| Is Table Enabled |\n")
        public boolean isTableEnabled() throws Exception {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		return table.isEnabled();
    	}

	@RobotKeyword("Is the table visible\n\n"
            + "Example:\n"
            + "| Is Table Visible |\n")
        public boolean isTableVisible() throws Exception {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		return table.isVisible();
    	}

	@RobotKeyword("Get the text of the table\n\n"
            + "Example:\n"
            + "| Get Table Text |\n")
//    @ArgumentNames({"text"})
        public String getTableText() throws Exception {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		return table.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the table\n\n"
            + "Example:\n"
            + "| Get Table Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getTableTooltipText() throws Exception {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		return table.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the table\n\n"
            + "Example:\n"
            + "| Set Focus On Table |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnTable() throws Exception {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		table.setFocus();
    	}
	
	@RobotKeyword("Get the text of the cell of the table at the given position\n\n"
			+ "\t row the row number, 0 based."
            + "\t column the column number, 0 based."
            + "Example:\n"
            + "| Get Table Cell |\n")
    @ArgumentNames({"row", "column"})
        public String getTableCell(String row, String column) throws Exception {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		Integer r = Integer.valueOf(row).intValue();
    		Integer c = Integer.valueOf(column).intValue();
    		return table.cell(r, c);
    	}

	@RobotKeyword("Get the text of the cell of the table at the given row and column name\n\n"
			+ "\t row the row number, 0 based."
            + "\t columnName the name of the column."
            + "Example:\n"
            + "| Get Table Cell With Column Name|\n")
    @ArgumentNames({"row", "columnName"})
        public String getTableCellWithColumnName(String row, String columnName) throws Exception {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		Integer r = Integer.valueOf(row).intValue();
    		return table.cell(r, columnName);
    	}

	@RobotKeyword("Click on the given cell of table\n\n"
			+ "\t row the row number, 0 based."
            + "\t column the column number, 0 based."
            + "Example:\n"
            + "| Click Table Cell|\n")
    @ArgumentNames({"row", "column"})
        public void clickTableCell(String row, String column) throws Exception {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		Integer r = Integer.valueOf(row).intValue();
    		Integer c = Integer.valueOf(column).intValue();
    		table.click(r, c);
    	}

	@RobotKeyword("Count the number of columns in the table\n\n"
            + "Example:\n"
            + "| Count Table Columns|\n")
//    @ArgumentNames({"row", "column"})
        public int countTableColumns() throws Exception {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		return table.columnCount();
    	}

	@RobotKeyword("Count the number of rows in the table\n\n"
            + "Example:\n"
            + "| Count Table Rows|\n")
//    @ArgumentNames({"row", "column"})
        public int countTableRows() throws Exception {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		return table.rowCount();
    	}

	@RobotKeyword("Count the number of columns in the table\n\n"
            + "Example:\n"
            + "| Get Table Columns|\n")
//    @ArgumentNames({"row", "column"})
        public String[] getTableColumns() throws Exception {
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
        public boolean tableContainsItem(String text) throws Exception {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		return table.containsItem(text);
    	}

	@RobotKeyword("Double Click on the given cell of table\n\n"
			+ "\t row the row number, 0 based."
            + "\t column the column number, 0 based."
            + "Example:\n"
            + "| Double Click Table Cell|\n")
    @ArgumentNames({"row", "column"})
        public void doubleClickTableCell(String row, String column) throws Exception {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		Integer r = Integer.valueOf(row).intValue();
    		Integer c = Integer.valueOf(column).intValue();
    		table.doubleClick(r, c);
    	}

	@RobotKeyword("Select the table item at the given row\n\n"
			+ "\t row the row number, 0 based."
            + "Example:\n"
            + "| Select Table Item At Row | 0 |\n")
    @ArgumentNames({"row"})
        public void selectTableItemAtRow(String row) throws Exception {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		Integer r = Integer.valueOf(row).intValue();
    		Context.setCurrentWidget(table.getTableItem(r));
    	}

	@RobotKeyword("Select the table item with the given text\n\n"
            + "Example:\n"
            + "| Select Table Item With Text | text |\n")
    @ArgumentNames({"text"})
        public void selectTableItemWithText(String text) throws Exception {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		Context.setCurrentWidget(table.getTableItem(text));
    	}

	@RobotKeyword("Select the table header with the given text\n\n"
            + "Example:\n"
            + "| Select Table Header With Text | text |\n")
    @ArgumentNames({"text"})
        public void selectTableHeaderWithText(String text) throws Exception {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		Context.setCurrentWidget(table.header(text));
    	}

	@RobotKeyword("Gets the index of the item matching the given item\n"
			+ " , or -1 if the item does not exist in the table.\n\n"
            + "Example:\n"
            + "| Get Table Item Index | text |\n")
    @ArgumentNames({"text"})
        public int getTableItemIndex(String text) throws Exception {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		return table.indexOf(text);
    	}

	@RobotKeyword("Gets the index of the item matching the given item and the given column\n"
			+ " , or -1 if the item does not exist in the table.\n\n"
            + "Example:\n"
            + "\t column the column number, 0 based."
            + "| Get Table Item Index In Column| text | 0 | \n")
    @ArgumentNames({"text", "column"})
        public int getTableItemIndexInColumn(String text, String column) throws Exception {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		Integer c = Integer.valueOf(column).intValue();
    		return table.indexOf(text, c);
    	}

	@RobotKeyword("Gets the index of the column matching the given name\n"
			+ " , or -1 if the column does not exist in the table.\n\n"
            + "Example:\n"
            + "| Get Table Column Index | columnName | \n")
    @ArgumentNames({"columnName"})
        public int getTableColumnIndex(String columnName) throws Exception {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		return table.indexOfColumn(columnName);
    	}
	
	@RobotKeyword("Select the indexed item(s) in the table\n\n"
            + "Example:\n"
            + "| Select Indexed Items In Table |\n")
    @ArgumentNames({"*index"})
        public void selectIndexedItemsInTable(String... index) throws Exception {
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
            + "| Select Items In Table |\n")
    @ArgumentNames({"*text"})
        public void selectItemsInTable(String... text) throws Exception {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		table.select(text);
    	}

	@RobotKeyword("Get the count of selected items of the table\n\n"
            + "Example:\n"
            + "| Count Table Selected Items |\n")
//    @ArgumentNames({"text"})
        public int countTableSelectedItems() throws Exception {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		return table.selectionCount();
    	}

	@RobotKeyword("Unselect all the items of the table\n\n"
            + "Example:\n"
            + "| Unselect All Table Items |\n")
//    @ArgumentNames({"text"})
        public void unselectAllTableItems() throws Exception {
    		SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
    		table.unselect();
    	}

}