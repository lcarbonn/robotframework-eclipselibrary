/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableColumn;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class TableColumnActionKeywords {

	@RobotKeyword("Click on the tableColumn\n\n"
            + "Example:\n"
            + "| Click TableColumn |\n")
        public void clickTableColumn() throws Exception {
    		SWTBotTableColumn tableColumn = (SWTBotTableColumn)Context.getCurrentWidget(SWTBotTableColumn.class);
    		tableColumn.click();
    	}
	
	@RobotKeyword("Is the tableColumn active\n\n"
            + "Example:\n"
            + "| Is TableColumn Active |\n")
        public boolean isTableColumnActive() throws Exception {
    		SWTBotTableColumn tableColumn = (SWTBotTableColumn)Context.getCurrentWidget(SWTBotTableColumn.class);
    		return tableColumn.isActive();
    	}

	@RobotKeyword("Is the tableColumn enabled\n\n"
            + "Example:\n"
            + "| Is TableColumn Enabled |\n")
        public boolean isTableColumnEnabled() throws Exception {
    		SWTBotTableColumn tableColumn = (SWTBotTableColumn)Context.getCurrentWidget(SWTBotTableColumn.class);
    		return tableColumn.isEnabled();
    	}

	@RobotKeyword("Is the tableColumn visible\n\n"
            + "Example:\n"
            + "| Is TableColumn Visible |\n")
        public boolean isTableColumnVisible() throws Exception {
    		SWTBotTableColumn tableColumn = (SWTBotTableColumn)Context.getCurrentWidget(SWTBotTableColumn.class);
    		return tableColumn.isVisible();
    	}

	@RobotKeyword("Get the text of the tableColumn\n\n"
            + "Example:\n"
            + "| Get TableColumn Text |\n")
//    @ArgumentNames({"text"})
        public String getTableColumnText() throws Exception {
    		SWTBotTableColumn tableColumn = (SWTBotTableColumn)Context.getCurrentWidget(SWTBotTableColumn.class);
    		return tableColumn.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the tableColumn\n\n"
            + "Example:\n"
            + "| Get TableColumn Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getTableColumnTooltipText() throws Exception {
    		SWTBotTableColumn tableColumn = (SWTBotTableColumn)Context.getCurrentWidget(SWTBotTableColumn.class);
    		return tableColumn.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the tableColumn\n\n"
            + "Example:\n"
            + "| Set Focus On TableColumn |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnTableColumn() throws Exception {
    		SWTBotTableColumn tableColumn = (SWTBotTableColumn)Context.getCurrentWidget(SWTBotTableColumn.class);
    		tableColumn.setFocus();
    	}
	
}