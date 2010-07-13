package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ToolbarRadioButtonActionKeywords {

	@RobotKeyword("Click on the toolbarRadioButton\n\n"
            + "Example:\n"
            + "| Click ToolbarRadioButton |\n")
        public void clickToolbarRadioButton() throws Exception {
    		SWTBotToolbarRadioButton toolbarRadioButton = (SWTBotToolbarRadioButton)Context.getCurrentWidget(SWTBotToolbarRadioButton.class);
    		toolbarRadioButton.click();
    	}
	
	@RobotKeyword("Is the toolbarRadioButton active\n\n"
            + "Example:\n"
            + "| Is ToolbarRadioButton Active |\n")
        public boolean isToolbarRadioButtonActive() throws Exception {
    		SWTBotToolbarRadioButton toolbarRadioButton = (SWTBotToolbarRadioButton)Context.getCurrentWidget(SWTBotToolbarRadioButton.class);
    		return toolbarRadioButton.isActive();
    	}

	@RobotKeyword("Is the toolbarRadioButton enabled\n\n"
            + "Example:\n"
            + "| Is ToolbarRadioButton Enabled |\n")
        public boolean isToolbarRadioButtonEnabled() throws Exception {
    		SWTBotToolbarRadioButton toolbarRadioButton = (SWTBotToolbarRadioButton)Context.getCurrentWidget(SWTBotToolbarRadioButton.class);
    		return toolbarRadioButton.isEnabled();
    	}

	@RobotKeyword("Is the toolbarRadioButton visible\n\n"
            + "Example:\n"
            + "| Is ToolbarRadioButton Visible |\n")
        public boolean isToolbarRadioButtonVisible() throws Exception {
    		SWTBotToolbarRadioButton toolbarRadioButton = (SWTBotToolbarRadioButton)Context.getCurrentWidget(SWTBotToolbarRadioButton.class);
    		return toolbarRadioButton.isVisible();
    	}

	@RobotKeyword("Get the text of the toolbarRadioButton\n\n"
            + "Example:\n"
            + "| Get ToolbarRadioButton Text |\n")
//    @ArgumentNames({"text"})
        public String getToolbarRadioButtonText() throws Exception {
    		SWTBotToolbarRadioButton toolbarRadioButton = (SWTBotToolbarRadioButton)Context.getCurrentWidget(SWTBotToolbarRadioButton.class);
    		return toolbarRadioButton.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the toolbarRadioButton\n\n"
            + "Example:\n"
            + "| Get ToolbarRadioButton Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getToolbarRadioButtonTooltipText() throws Exception {
    		SWTBotToolbarRadioButton toolbarRadioButton = (SWTBotToolbarRadioButton)Context.getCurrentWidget(SWTBotToolbarRadioButton.class);
    		return toolbarRadioButton.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the toolbarRadioButton\n\n"
            + "Example:\n"
            + "| Set Focus On ToolbarRadioButton |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnToolbarRadioButton() throws Exception {
    		SWTBotToolbarRadioButton toolbarRadioButton = (SWTBotToolbarRadioButton)Context.getCurrentWidget(SWTBotToolbarRadioButton.class);
    		toolbarRadioButton.setFocus();
    	}
	
	@RobotKeyword("Is the toolbarRadioButton checked\n\n"
            + "Example:\n"
            + "| Is ToolbarRadioButton Checked |\n")
        public boolean isToolbarRadioButtonChecked() throws Exception {
    		SWTBotToolbarRadioButton toolbarRadioButton = (SWTBotToolbarRadioButton)Context.getCurrentWidget(SWTBotToolbarRadioButton.class);
    		return toolbarRadioButton.isChecked();
    	}

	@RobotKeyword("Select the toolbarRadioButton\n\n"
            + "Example:\n"
            + "| Select ToolbarRadioButton |\n")
        public void selectToolbarRadioButton() throws Exception {
    		SWTBotToolbarRadioButton toolbarRadioButton = (SWTBotToolbarRadioButton)Context.getCurrentWidget(SWTBotToolbarRadioButton.class);
    		toolbarRadioButton.select();
    	}

	@RobotKeyword("Deselect the toolbarRadioButton\n\n"
            + "Example:\n"
            + "| Deselect ToolbarRadioButton |\n")
        public void deselectToolbarRadioButton() throws Exception {
    		SWTBotToolbarRadioButton toolbarRadioButton = (SWTBotToolbarRadioButton)Context.getCurrentWidget(SWTBotToolbarRadioButton.class);
    		toolbarRadioButton.deselect();
    	}
	
	@RobotKeyword("Toggle the toolbarRadioButton\n\n"
            + "Example:\n"
            + "| Toggle ToolbarRadioButton |\n")
        public void toggleToolbarRadioButton() throws Exception {
    		SWTBotToolbarRadioButton toolbarRadioButton = (SWTBotToolbarRadioButton)Context.getCurrentWidget(SWTBotToolbarRadioButton.class);
    		toolbarRadioButton.toggle();
    	}
	
}