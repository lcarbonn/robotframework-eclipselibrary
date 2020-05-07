/*
 * Copyright 2010 L. Carbonnaux
 * 2020 Nebula Nattable extension by J. Beaumont
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.nebula.action;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable;

import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class NatTableActionKeywords {

	@RobotKeyword("Count the total number of rows in the table\n\n"
            + "Example:\n"
            + "| Count Nattable Rows |\n")
//    @ArgumentNames({"row", "column"})
        public int countNattableRows() throws SWTBotBridgeException {
    		SWTBotNatTable table = (SWTBotNatTable)Context.getCurrentWidget(SWTBotNatTable.class);
    		return table.preferredRowCount();
    	}

	@RobotKeyword("Count the total number of columns in the table\n\n"
            + "Example:\n"
            + "| Count Nattable Columns |\n")
//    @ArgumentNames({"row", "column"})
        public int countNattableColumns() throws SWTBotBridgeException {
    		SWTBotNatTable table = (SWTBotNatTable)Context.getCurrentWidget(SWTBotNatTable.class);
    		return table.preferredColumnCount();
    	}

	@RobotKeyword("Count the number of visible rows in the table\n\n"
            + "Example:\n"
            + "| Count Nattable Visible Rows |\n")
//    @ArgumentNames({"row", "column"})
        public int countNattableVisibleRows() throws SWTBotBridgeException {
    		SWTBotNatTable table = (SWTBotNatTable)Context.getCurrentWidget(SWTBotNatTable.class);
    		return table.rowCount();
    	}

	@RobotKeyword("Count the number of visible columns in the table\n\n"
            + "Example:\n"
            + "| Count Nattable Visible Columns |\n")
//    @ArgumentNames({"row", "column"})
        public int countNattableVisibleColumns() throws SWTBotBridgeException {
    		SWTBotNatTable table = (SWTBotNatTable)Context.getCurrentWidget(SWTBotNatTable.class);
    		return table.columnCount();
    	}

	@RobotKeyword("Get the Id  of the table \n\n"
            + "Example:\n"
            + "| Get Nattable Id |\n")
//    @ArgumentNames({"row", "column"})
        public String getNattableId() throws SWTBotBridgeException {
    		SWTBotNatTable table = (SWTBotNatTable)Context.getCurrentWidget(SWTBotNatTable.class);
    		return table.getId();
    	}
	
	@RobotKeyword("Get the text of the cell of the table at the given position\n\n"
			+ "\t row the row number, 0 based."
            + "\t column the column number, 0 based."
            + "Example:\n"
            + "| Get Nattable Cell |\n")
    @ArgumentNames({"row", "column"})
        public String getNattableCell(String row, String column) throws SWTBotBridgeException {
    		SWTBotNatTable table = (SWTBotNatTable)Context.getCurrentWidget(SWTBotNatTable.class);
    		Integer r = Integer.valueOf(row).intValue();
    		Integer c = Integer.valueOf(column).intValue();
    		return table.getCellDataValueByPosition(r, c);
    	}

	@RobotKeyword("Set the text of the cell of the table at the given position\n\n"
			+ "\t row the row number, 0 based."
            + "\t column the column number, 0 based."
            + "\t text the text to set."
            + "Example:\n"
            + "| Set Nattable Cell |\n")
    @ArgumentNames({"row", "column", "text"})
        public String setNattableCell(String row, String column, String text) throws SWTBotBridgeException {
    		SWTBotNatTable table = (SWTBotNatTable)Context.getCurrentWidget(SWTBotNatTable.class);
    		Integer r = Integer.valueOf(row).intValue();
    		Integer c = Integer.valueOf(column).intValue();
    		return table.setCellDataValueByPosition(r, c, text);
    	}
	
	@RobotKeyword("Click on the given cell of table\n\n"
			+ "\t row the row number, 0 based."
            + "\t column the column number, 0 based."
            + "Example:\n"
            + "| Click Nattable Cell |\n")
    @ArgumentNames({"row", "column"})
        public void clickNattableCell(String row, String column) throws SWTBotBridgeException {
    		SWTBotNatTable table = (SWTBotNatTable)Context.getCurrentWidget(SWTBotNatTable.class);
    		Integer r = Integer.valueOf(row).intValue();
    		Integer c = Integer.valueOf(column).intValue();
    		table.click(r, c);
    	}
	
	@RobotKeyword("Double click on the given cell of table\n\n"
			+ "\t row the row number, 0 based."
            + "\t column the column number, 0 based."
            + "Example:\n"
            + "| Double Click Nattable Cell |\n")
    @ArgumentNames({"row", "column"})
        public void doubleClickNattableCell(String row, String column) throws SWTBotBridgeException {
    		SWTBotNatTable table = (SWTBotNatTable)Context.getCurrentWidget(SWTBotNatTable.class);
    		Integer r = Integer.valueOf(row).intValue();
    		Integer c = Integer.valueOf(column).intValue();
    		table.doubleClick(r, c);
    	}
	
	@RobotKeyword("Right click on the given cell of table\n\n"
			+ "\t row the row number, 0 based."
            + "\t column the column number, 0 based."
            + "Example:\n"
            + "| Right Click Nattable Cell |\n")
    @ArgumentNames({"row", "column"})
        public void rightClickNattableCell(String row, String column) throws SWTBotBridgeException {
    		SWTBotNatTable table = (SWTBotNatTable)Context.getCurrentWidget(SWTBotNatTable.class);
    		Integer r = Integer.valueOf(row).intValue();
    		Integer c = Integer.valueOf(column).intValue();
    		table.rightClick(r, c);
    	}
	
	@RobotKeyword("Scroll to column header Nattable. Scrolls the viewport found at the specified NatTable position so that the column header cell is made visible\n\n"
			+ "\t rowPosition the row number, 0 based. Viewport position is any cell below the header and filter rows"
            + "\t columnPosition the column number, 0 based."
            + "\t headerRow the fixed header row number, 0 based."
            + "\t scrollableColumn the column (in the viewport's underlying scrollable layer's coordinates) of the header cell that should be made visible number, 0 based."
            + "Example:\n"
            + "| Scroll To Column Header Nattable|\n")
    @ArgumentNames({"rowPosition", "columnPosition", "headerRow", "scrollableColumn"})
        public void scrollToColumnHeaderNattable(String rowPosition, String columnPosition, String headerRow, String scrollableColumn) throws SWTBotBridgeException {
    		SWTBotNatTable table = (SWTBotNatTable)Context.getCurrentWidget(SWTBotNatTable.class);
    		Integer iRowPosition = Integer.valueOf(rowPosition).intValue();
    		Integer iColumnPosition = Integer.valueOf(columnPosition).intValue();
    		Integer iHeaderRow = Integer.valueOf(headerRow).intValue();
    		Integer iScrollableColumn = Integer.valueOf(scrollableColumn).intValue();
    		table.scrollViewport(iRowPosition, iColumnPosition, iHeaderRow, iScrollableColumn);
    	}
	
}