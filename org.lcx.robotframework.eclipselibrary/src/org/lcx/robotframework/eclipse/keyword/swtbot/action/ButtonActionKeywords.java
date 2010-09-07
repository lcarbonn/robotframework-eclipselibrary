/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ButtonActionKeywords {

	@RobotKeyword("Click on the button\n\n"
            + "Example:\n"
            + "| Click Button |\n")
        public void clickButton() throws Exception {
    		SWTBotButton button = (SWTBotButton)Context.getCurrentWidget(SWTBotButton.class);
    		button.click();
    	}
	
	@RobotKeyword("Is the button active\n\n"
            + "Example:\n"
            + "| Is Button Active |\n")
        public boolean isButtonActive() throws Exception {
    		SWTBotButton button = (SWTBotButton)Context.getCurrentWidget(SWTBotButton.class);
    		return button.isActive();
    	}

	@RobotKeyword("Is the button enabled\n\n"
            + "Example:\n"
            + "| Is Button Enabled |\n")
        public boolean isButtonEnabled() throws Exception {
    		SWTBotButton button = (SWTBotButton)Context.getCurrentWidget(SWTBotButton.class);
    		return button.isEnabled();
    	}

	@RobotKeyword("Is the button visible\n\n"
            + "Example:\n"
            + "| Is Button Visible |\n")
        public boolean isButtonVisible() throws Exception {
    		SWTBotButton button = (SWTBotButton)Context.getCurrentWidget(SWTBotButton.class);
    		return button.isVisible();
    	}

	@RobotKeyword("Get the text of the button\n\n"
            + "Example:\n"
            + "| Get Button Text |\n")
//    @ArgumentNames({"text"})
        public String getButtonText() throws Exception {
    		SWTBotButton button = (SWTBotButton)Context.getCurrentWidget(SWTBotButton.class);
    		return button.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the button\n\n"
            + "Example:\n"
            + "| Get Button Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getButtonTooltipText() throws Exception {
    		SWTBotButton button = (SWTBotButton)Context.getCurrentWidget(SWTBotButton.class);
    		return button.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the button\n\n"
            + "Example:\n"
            + "| Set Focus On Button |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnButton() throws Exception {
    		SWTBotButton button = (SWTBotButton)Context.getCurrentWidget(SWTBotButton.class);
    		button.setFocus();
    	}
	
}