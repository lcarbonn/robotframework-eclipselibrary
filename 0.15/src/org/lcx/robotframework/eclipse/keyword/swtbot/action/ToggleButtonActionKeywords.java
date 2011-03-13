/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ToggleButtonActionKeywords {

	@RobotKeyword("Click on the toggleButton\n\n"
            + "Example:\n"
            + "| Click ToggleButton |\n")
        public void clickToggleButton() throws SWTBotBridgeException {
    		SWTBotToggleButton toggleButton = (SWTBotToggleButton)Context.getCurrentWidget(SWTBotToggleButton.class);
    		toggleButton.click();
    	}
	
	@RobotKeyword("Is the toggleButton active\n\n"
            + "Example:\n"
            + "| Is ToggleButton Active |\n")
        public boolean isToggleButtonActive() throws SWTBotBridgeException {
    		SWTBotToggleButton toggleButton = (SWTBotToggleButton)Context.getCurrentWidget(SWTBotToggleButton.class);
    		return toggleButton.isActive();
    	}

	@RobotKeyword("Is the toggleButton enabled\n\n"
            + "Example:\n"
            + "| Is ToggleButton Enabled |\n")
        public boolean isToggleButtonEnabled() throws SWTBotBridgeException {
    		SWTBotToggleButton toggleButton = (SWTBotToggleButton)Context.getCurrentWidget(SWTBotToggleButton.class);
    		return toggleButton.isEnabled();
    	}

	@RobotKeyword("Is the toggleButton visible\n\n"
            + "Example:\n"
            + "| Is ToggleButton Visible |\n")
        public boolean isToggleButtonVisible() throws SWTBotBridgeException {
    		SWTBotToggleButton toggleButton = (SWTBotToggleButton)Context.getCurrentWidget(SWTBotToggleButton.class);
    		return toggleButton.isVisible();
    	}

	@RobotKeyword("Get the text of the toggleButton\n\n"
            + "Example:\n"
            + "| Get ToggleButton Text |\n")
//    @ArgumentNames({"text"})
        public String getToggleButtonText() throws SWTBotBridgeException {
    		SWTBotToggleButton toggleButton = (SWTBotToggleButton)Context.getCurrentWidget(SWTBotToggleButton.class);
    		return toggleButton.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the toggleButton\n\n"
            + "Example:\n"
            + "| Get ToggleButton Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getToggleButtonTooltipText() throws SWTBotBridgeException {
    		SWTBotToggleButton toggleButton = (SWTBotToggleButton)Context.getCurrentWidget(SWTBotToggleButton.class);
    		return toggleButton.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the toggleButton\n\n"
            + "Example:\n"
            + "| Set Focus On ToggleButton |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnToggleButton() throws SWTBotBridgeException {
    		SWTBotToggleButton toggleButton = (SWTBotToggleButton)Context.getCurrentWidget(SWTBotToggleButton.class);
    		toggleButton.setFocus();
    	}
	
	@RobotKeyword("Does the toggleButton is pressed \n\n"
            + "Example:\n"
            + "| Is ToggleButton Pressed |\n")
//    @ArgumentNames({"text"})
        public boolean isToggleButtonPressed() throws SWTBotBridgeException {
    		SWTBotToggleButton toggleButton = (SWTBotToggleButton)Context.getCurrentWidget(SWTBotToggleButton.class);
    		return toggleButton.isPressed();
    	}

	@RobotKeyword("Press the toggleButton\n\n"
            + "Example:\n"
            + "| Press ToggleButton |\n")
//    @ArgumentNames({"text"})
        public void pressToggleButton() throws SWTBotBridgeException {
    		SWTBotToggleButton toggleButton = (SWTBotToggleButton)Context.getCurrentWidget(SWTBotToggleButton.class);
    		toggleButton.press();
    	}

	@RobotKeyword("Unpress the toggleButton\n\n"
            + "Example:\n"
            + "| Unpress ToggleButton |\n")
//    @ArgumentNames({"text"})
        public void unpressToggleButton() throws SWTBotBridgeException {
    		SWTBotToggleButton toggleButton = (SWTBotToggleButton)Context.getCurrentWidget(SWTBotToggleButton.class);
    		toggleButton.unpress();
    	}
}