/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class RadioActionKeywords {

	@RobotKeyword("Click on the radio\n\n"
            + "Example:\n"
            + "| Click Radio |\n")
        public void clickRadio() throws SWTBotBridgeException {
    		SWTBotRadio radio = (SWTBotRadio)Context.getCurrentWidget(SWTBotRadio.class);
    		radio.click();
    	}
	
	@RobotKeyword("Is the radio active\n\n"
            + "Example:\n"
            + "| Is Radio Active |\n")
        public boolean isRadioActive() throws SWTBotBridgeException {
    		SWTBotRadio radio = (SWTBotRadio)Context.getCurrentWidget(SWTBotRadio.class);
    		return radio.isActive();
    	}

	@RobotKeyword("Is the radio enabled\n\n"
            + "Example:\n"
            + "| Is Radio Enabled |\n")
        public boolean isRadioEnabled() throws SWTBotBridgeException {
    		SWTBotRadio radio = (SWTBotRadio)Context.getCurrentWidget(SWTBotRadio.class);
    		return radio.isEnabled();
    	}

	@RobotKeyword("Is the radio visible\n\n"
            + "Example:\n"
            + "| Is Radio Visible |\n")
        public boolean isRadioVisible() throws SWTBotBridgeException {
    		SWTBotRadio radio = (SWTBotRadio)Context.getCurrentWidget(SWTBotRadio.class);
    		return radio.isVisible();
    	}

	@RobotKeyword("Get the text of the radio\n\n"
            + "Example:\n"
            + "| Get Radio Text |\n")
//    @ArgumentNames({"text"})
        public String getRadioText() throws SWTBotBridgeException {
    		SWTBotRadio radio = (SWTBotRadio)Context.getCurrentWidget(SWTBotRadio.class);
    		return radio.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the radio\n\n"
            + "Example:\n"
            + "| Get Radio Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getRadioTooltipText() throws SWTBotBridgeException {
    		SWTBotRadio radio = (SWTBotRadio)Context.getCurrentWidget(SWTBotRadio.class);
    		return radio.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the radio\n\n"
            + "Example:\n"
            + "| Set Focus On Radio |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnRadio() throws SWTBotBridgeException {
    		SWTBotRadio radio = (SWTBotRadio)Context.getCurrentWidget(SWTBotRadio.class);
    		radio.setFocus();
    	}

	@RobotKeyword("Is the radio selected\n\n"
            + "Example:\n"
            + "| Is Radio Selected |\n")
        public boolean isRadioSelected() throws SWTBotBridgeException {
    		SWTBotRadio radio = (SWTBotRadio)Context.getCurrentWidget(SWTBotRadio.class);
    		return radio.isSelected();
    	}
	
}