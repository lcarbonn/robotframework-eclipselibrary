/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ToolbarButtonActionKeywords {

	@RobotKeyword("Click on the toolbarButton\n\n"
            + "Example:\n"
            + "| Click ToolbarButton |\n")
        public void clickToolbarButton() throws Exception {
    		SWTBotToolbarButton toolbarButton = (SWTBotToolbarButton)Context.getCurrentWidget(SWTBotToolbarButton.class);
    		toolbarButton.click();
    	}
	
	@RobotKeyword("Is the toolbarButton active\n\n"
            + "Example:\n"
            + "| Is ToolbarButton Active |\n")
        public boolean isToolbarButtonActive() throws Exception {
    		SWTBotToolbarButton toolbarButton = (SWTBotToolbarButton)Context.getCurrentWidget(SWTBotToolbarButton.class);
    		return toolbarButton.isActive();
    	}

	@RobotKeyword("Is the toolbarButton enabled\n\n"
            + "Example:\n"
            + "| Is ToolbarButton Enabled |\n")
        public boolean isToolbarButtonEnabled() throws Exception {
    		SWTBotToolbarButton toolbarButton = (SWTBotToolbarButton)Context.getCurrentWidget(SWTBotToolbarButton.class);
    		return toolbarButton.isEnabled();
    	}

	@RobotKeyword("Is the toolbarButton visible\n\n"
            + "Example:\n"
            + "| Is ToolbarButton Visible |\n")
        public boolean isToolbarButtonVisible() throws Exception {
    		SWTBotToolbarButton toolbarButton = (SWTBotToolbarButton)Context.getCurrentWidget(SWTBotToolbarButton.class);
    		return toolbarButton.isVisible();
    	}

	@RobotKeyword("Get the text of the toolbarButton\n\n"
            + "Example:\n"
            + "| Get ToolbarButton Text |\n")
//    @ArgumentNames({"text"})
        public String getToolbarButtonText() throws Exception {
    		SWTBotToolbarButton toolbarButton = (SWTBotToolbarButton)Context.getCurrentWidget(SWTBotToolbarButton.class);
    		return toolbarButton.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the toolbarButton\n\n"
            + "Example:\n"
            + "| Get ToolbarButton Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getToolbarButtonTooltipText() throws Exception {
    		SWTBotToolbarButton toolbarButton = (SWTBotToolbarButton)Context.getCurrentWidget(SWTBotToolbarButton.class);
    		return toolbarButton.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the toolbarButton\n\n"
            + "Example:\n"
            + "| Set Focus On ToolbarButton |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnToolbarButton() throws Exception {
    		SWTBotToolbarButton toolbarButton = (SWTBotToolbarButton)Context.getCurrentWidget(SWTBotToolbarButton.class);
    		toolbarButton.setFocus();
    	}
	
}