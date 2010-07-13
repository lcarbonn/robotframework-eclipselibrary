package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ToolbarToggleButtonActionKeywords {

	@RobotKeyword("Click on the toolbarToggleButton\n\n"
            + "Example:\n"
            + "| Click ToolbarToggleButton |\n")
        public void clickToolbarToggleButton() throws Exception {
    		SWTBotToolbarToggleButton toolbarToggleButton = (SWTBotToolbarToggleButton)Context.getCurrentWidget(SWTBotToolbarToggleButton.class);
    		toolbarToggleButton.click();
    	}
	
	@RobotKeyword("Is the toolbarToggleButton active\n\n"
            + "Example:\n"
            + "| Is ToolbarToggleButton Active |\n")
        public boolean isToolbarToggleButtonActive() throws Exception {
    		SWTBotToolbarToggleButton toolbarToggleButton = (SWTBotToolbarToggleButton)Context.getCurrentWidget(SWTBotToolbarToggleButton.class);
    		return toolbarToggleButton.isActive();
    	}

	@RobotKeyword("Is the toolbarToggleButton enabled\n\n"
            + "Example:\n"
            + "| Is ToolbarToggleButton Enabled |\n")
        public boolean isToolbarToggleButtonEnabled() throws Exception {
    		SWTBotToolbarToggleButton toolbarToggleButton = (SWTBotToolbarToggleButton)Context.getCurrentWidget(SWTBotToolbarToggleButton.class);
    		return toolbarToggleButton.isEnabled();
    	}

	@RobotKeyword("Is the toolbarToggleButton visible\n\n"
            + "Example:\n"
            + "| Is ToolbarToggleButton Visible |\n")
        public boolean isToolbarToggleButtonVisible() throws Exception {
    		SWTBotToolbarToggleButton toolbarToggleButton = (SWTBotToolbarToggleButton)Context.getCurrentWidget(SWTBotToolbarToggleButton.class);
    		return toolbarToggleButton.isVisible();
    	}

	@RobotKeyword("Get the text of the toolbarToggleButton\n\n"
            + "Example:\n"
            + "| Get ToolbarToggleButton Text |\n")
//    @ArgumentNames({"text"})
        public String getToolbarToggleButtonText() throws Exception {
    		SWTBotToolbarToggleButton toolbarToggleButton = (SWTBotToolbarToggleButton)Context.getCurrentWidget(SWTBotToolbarToggleButton.class);
    		return toolbarToggleButton.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the toolbarToggleButton\n\n"
            + "Example:\n"
            + "| Get ToolbarToggleButton Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getToolbarToggleButtonTooltipText() throws Exception {
    		SWTBotToolbarToggleButton toolbarToggleButton = (SWTBotToolbarToggleButton)Context.getCurrentWidget(SWTBotToolbarToggleButton.class);
    		return toolbarToggleButton.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the toolbarToggleButton\n\n"
            + "Example:\n"
            + "| Set Focus On ToolbarToggleButton |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnToolbarToggleButton() throws Exception {
    		SWTBotToolbarToggleButton toolbarToggleButton = (SWTBotToolbarToggleButton)Context.getCurrentWidget(SWTBotToolbarToggleButton.class);
    		toolbarToggleButton.setFocus();
    	}
	
	@RobotKeyword("Is the toolbarToggleButton checked\n\n"
            + "Example:\n"
            + "| Is ToolbarToggleButton Checked |\n")
        public boolean isToolbarToggleButtonChecked() throws Exception {
    		SWTBotToolbarToggleButton toolbarToggleButton = (SWTBotToolbarToggleButton)Context.getCurrentWidget(SWTBotToolbarToggleButton.class);
    		return toolbarToggleButton.isChecked();
    	}

	@RobotKeyword("Select the toolbarToggleButton\n\n"
            + "Example:\n"
            + "| Select ToolbarToggleButton |\n")
        public void selectToolbarToggleButton() throws Exception {
    		SWTBotToolbarToggleButton toolbarToggleButton = (SWTBotToolbarToggleButton)Context.getCurrentWidget(SWTBotToolbarToggleButton.class);
    		toolbarToggleButton.select();
    	}

	@RobotKeyword("Deselect the toolbarToggleButton\n\n"
            + "Example:\n"
            + "| Deselect ToolbarToggleButton |\n")
        public void deselectToolbarToggleButton() throws Exception {
    		SWTBotToolbarToggleButton toolbarToggleButton = (SWTBotToolbarToggleButton)Context.getCurrentWidget(SWTBotToolbarToggleButton.class);
    		toolbarToggleButton.deselect();
    	}
	
	@RobotKeyword("Toggle the toolbarToggleButton\n\n"
            + "Example:\n"
            + "| Toggle ToolbarToggleButton |\n")
        public void toggleToolbarToggleButton() throws Exception {
    		SWTBotToolbarToggleButton toolbarToggleButton = (SWTBotToolbarToggleButton)Context.getCurrentWidget(SWTBotToolbarToggleButton.class);
    		toolbarToggleButton.toggle();
    	}
	
}