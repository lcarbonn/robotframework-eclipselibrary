package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ToolbarDropDownButtonActionKeywords {

	@RobotKeyword("Click on the toolbarDropDownButton\n\n"
            + "Example:\n"
            + "| Click ToolbarDropDownButton |\n")
        public void clickToolbarDropDownButton() throws Exception {
    		SWTBotToolbarDropDownButton toolbarDropDownButton = (SWTBotToolbarDropDownButton)Context.getCurrentWidget(SWTBotToolbarDropDownButton.class);
    		toolbarDropDownButton.click();
    	}
	
	@RobotKeyword("Is the toolbarDropDownButton active\n\n"
            + "Example:\n"
            + "| Is ToolbarDropDownButton Active |\n")
        public boolean isToolbarDropDownButtonActive() throws Exception {
    		SWTBotToolbarDropDownButton toolbarDropDownButton = (SWTBotToolbarDropDownButton)Context.getCurrentWidget(SWTBotToolbarDropDownButton.class);
    		return toolbarDropDownButton.isActive();
    	}

	@RobotKeyword("Is the toolbarDropDownButton enabled\n\n"
            + "Example:\n"
            + "| Is ToolbarDropDownButton Enabled |\n")
        public boolean isToolbarDropDownButtonEnabled() throws Exception {
    		SWTBotToolbarDropDownButton toolbarDropDownButton = (SWTBotToolbarDropDownButton)Context.getCurrentWidget(SWTBotToolbarDropDownButton.class);
    		return toolbarDropDownButton.isEnabled();
    	}

	@RobotKeyword("Is the toolbarDropDownButton visible\n\n"
            + "Example:\n"
            + "| Is ToolbarDropDownButton Visible |\n")
        public boolean isToolbarDropDownButtonVisible() throws Exception {
    		SWTBotToolbarDropDownButton toolbarDropDownButton = (SWTBotToolbarDropDownButton)Context.getCurrentWidget(SWTBotToolbarDropDownButton.class);
    		return toolbarDropDownButton.isVisible();
    	}

	@RobotKeyword("Get the text of the toolbarDropDownButton\n\n"
            + "Example:\n"
            + "| Get ToolbarDropDownButton Text |\n")
//    @ArgumentNames({"text"})
        public String getToolbarDropDownButtonText() throws Exception {
    		SWTBotToolbarDropDownButton toolbarDropDownButton = (SWTBotToolbarDropDownButton)Context.getCurrentWidget(SWTBotToolbarDropDownButton.class);
    		return toolbarDropDownButton.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the toolbarDropDownButton\n\n"
            + "Example:\n"
            + "| Get ToolbarDropDownButton Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getToolbarDropDownButtonTooltipText() throws Exception {
    		SWTBotToolbarDropDownButton toolbarDropDownButton = (SWTBotToolbarDropDownButton)Context.getCurrentWidget(SWTBotToolbarDropDownButton.class);
    		return toolbarDropDownButton.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the toolbarDropDownButton\n\n"
            + "Example:\n"
            + "| Set Focus On ToolbarDropDownButton |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnToolbarDropDownButton() throws Exception {
    		SWTBotToolbarDropDownButton toolbarDropDownButton = (SWTBotToolbarDropDownButton)Context.getCurrentWidget(SWTBotToolbarDropDownButton.class);
    		toolbarDropDownButton.setFocus();
    	}
	
	@RobotKeyword("Select the submenu inside this menu item on the toolbarDropDownButton\n\n"
            + "Example:\n"
            + "| Select Menu In ToolbarDropDownButton | text | \n")
    @ArgumentNames({"text"})
        public void setFocusOnToolbarDropDownButton(String text) throws Exception {
    		SWTBotToolbarDropDownButton toolbarDropDownButton = (SWTBotToolbarDropDownButton)Context.getCurrentWidget(SWTBotToolbarDropDownButton.class);
    		Context.setCurrentWidget(toolbarDropDownButton.menuItem(text));
    	}

}