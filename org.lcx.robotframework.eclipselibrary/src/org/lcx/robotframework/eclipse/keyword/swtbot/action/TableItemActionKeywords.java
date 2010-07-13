package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableItem;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class TableItemActionKeywords {

	@RobotKeyword("Click on the tableItem\n\n"
            + "Example:\n"
            + "| Click TableItem |\n")
        public void clickTableItem() throws Exception {
    		SWTBotTableItem tableItem = (SWTBotTableItem)Context.getCurrentWidget(SWTBotTableItem.class);
    		tableItem.click();
    	}
	
	@RobotKeyword("Is the tableItem active\n\n"
            + "Example:\n"
            + "| Is TableItem Active |\n")
        public boolean isTableItemActive() throws Exception {
    		SWTBotTableItem tableItem = (SWTBotTableItem)Context.getCurrentWidget(SWTBotTableItem.class);
    		return tableItem.isActive();
    	}

	@RobotKeyword("Is the tableItem enabled\n\n"
            + "Example:\n"
            + "| Is TableItem Enabled |\n")
        public boolean isTableItemEnabled() throws Exception {
    		SWTBotTableItem tableItem = (SWTBotTableItem)Context.getCurrentWidget(SWTBotTableItem.class);
    		return tableItem.isEnabled();
    	}

	@RobotKeyword("Is the tableItem visible\n\n"
            + "Example:\n"
            + "| Is TableItem Visible |\n")
        public boolean isTableItemVisible() throws Exception {
    		SWTBotTableItem tableItem = (SWTBotTableItem)Context.getCurrentWidget(SWTBotTableItem.class);
    		return tableItem.isVisible();
    	}

	@RobotKeyword("Get the text of the tableItem\n\n"
            + "Example:\n"
            + "| Get TableItem Text |\n")
//    @ArgumentNames({"text"})
        public String getTableItemText() throws Exception {
    		SWTBotTableItem tableItem = (SWTBotTableItem)Context.getCurrentWidget(SWTBotTableItem.class);
    		return tableItem.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the tableItem\n\n"
            + "Example:\n"
            + "| Get TableItem Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getTableItemTooltipText() throws Exception {
    		SWTBotTableItem tableItem = (SWTBotTableItem)Context.getCurrentWidget(SWTBotTableItem.class);
    		return tableItem.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the tableItem\n\n"
            + "Example:\n"
            + "| Set Focus On TableItem |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnTableItem() throws Exception {
    		SWTBotTableItem tableItem = (SWTBotTableItem)Context.getCurrentWidget(SWTBotTableItem.class);
    		tableItem.setFocus();
    	}
	
	@RobotKeyword("Check the tableItem\n\n"
            + "Example:\n"
            + "| Check TableItem |\n")
//    @ArgumentNames({"text"})
        public void checkTableItem() throws Exception {
    		SWTBotTableItem tableItem = (SWTBotTableItem)Context.getCurrentWidget(SWTBotTableItem.class);
    		tableItem.check();
    	}

	@RobotKeyword("ToogleCheck the tableItem\n\n"
            + "Example:\n"
            + "| ToggleCheck TableItem |\n")
//    @ArgumentNames({"text"})
        public void toggleCheckTableItem() throws Exception {
    		SWTBotTableItem tableItem = (SWTBotTableItem)Context.getCurrentWidget(SWTBotTableItem.class);
    		tableItem.toggleCheck();
    	}

	@RobotKeyword("Is the tableItem checked\n\n"
            + "Example:\n"
            + "| Is TableItem Checked |\n")
//    @ArgumentNames({"text"})
        public boolean isTableItemChecked() throws Exception {
    		SWTBotTableItem tableItem = (SWTBotTableItem)Context.getCurrentWidget(SWTBotTableItem.class);
    		return tableItem.isChecked();
    	}

	@RobotKeyword("Is the tableItem grayed\n\n"
            + "Example:\n"
            + "| Is TableItem Grayed |\n")
//    @ArgumentNames({"text"})
        public boolean isTableItemGrayed() throws Exception {
    		SWTBotTableItem tableItem = (SWTBotTableItem)Context.getCurrentWidget(SWTBotTableItem.class);
    		return tableItem.isGrayed();
    	}
	
	@RobotKeyword("Select the tableItem\n\n"
            + "Example:\n"
            + "| Select TableItem |\n")
//    @ArgumentNames({"text"})
        public void selectTableItem() throws Exception {
    		SWTBotTableItem tableItem = (SWTBotTableItem)Context.getCurrentWidget(SWTBotTableItem.class);
    		tableItem.select();
    	}

	@RobotKeyword("Uncheck the tableItem\n\n"
            + "Example:\n"
            + "| Uncheck TableItem |\n")
//    @ArgumentNames({"text"})
        public void uncheckTableItem() throws Exception {
    		SWTBotTableItem tableItem = (SWTBotTableItem)Context.getCurrentWidget(SWTBotTableItem.class);
    		tableItem.uncheck();
    	}
	
}