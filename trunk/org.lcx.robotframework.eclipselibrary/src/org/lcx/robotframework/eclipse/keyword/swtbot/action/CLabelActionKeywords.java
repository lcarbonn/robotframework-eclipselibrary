/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class CLabelActionKeywords {

	@RobotKeyword("Get the clabel alignment\n\n"
            + "Example:\n"
            + "| Get CLabel Alignment |\n")
        public int getCLabelAlignment() throws SWTBotBridgeException {
    		SWTBotCLabel clabel = (SWTBotCLabel)Context.getCurrentWidget(SWTBotCLabel.class);
    		return clabel.alignment();
    	}

	@RobotKeyword("Is the clabel active\n\n"
            + "Example:\n"
            + "| Is CLabel Active |\n")
        public boolean isCLabelActive() throws SWTBotBridgeException {
    		SWTBotCLabel clabel = (SWTBotCLabel)Context.getCurrentWidget(SWTBotCLabel.class);
    		return clabel.isActive();
    	}

	@RobotKeyword("Is the clabel enabled\n\n"
            + "Example:\n"
            + "| Is CLabel Enabled |\n")
        public boolean isCLabelEnabled() throws SWTBotBridgeException {
    		SWTBotCLabel clabel = (SWTBotCLabel)Context.getCurrentWidget(SWTBotCLabel.class);
    		return clabel.isEnabled();
    	}

	@RobotKeyword("Is the clabel visible\n\n"
            + "Example:\n"
            + "| Is CLabel Visible |\n")
        public boolean isCLabelVisible() throws SWTBotBridgeException {
    		SWTBotCLabel clabel = (SWTBotCLabel)Context.getCurrentWidget(SWTBotCLabel.class);
    		return clabel.isVisible();
    	}

	@RobotKeyword("Get the text of the clabel\n\n"
            + "Example:\n"
            + "| Get CLabel Text |\n")
//    @ArgumentNames({"text"})
        public String getCLabelText() throws SWTBotBridgeException {
    		SWTBotCLabel clabel = (SWTBotCLabel)Context.getCurrentWidget(SWTBotCLabel.class);
    		return clabel.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the clabel\n\n"
            + "Example:\n"
            + "| Get CLabel Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getCLabelTooltipText() throws SWTBotBridgeException {
    		SWTBotCLabel clabel = (SWTBotCLabel)Context.getCurrentWidget(SWTBotCLabel.class);
    		return clabel.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the clabel\n\n"
            + "Example:\n"
            + "| Set Focus On CLabel |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnCLabel() throws SWTBotBridgeException {
    		SWTBotCLabel clabel = (SWTBotCLabel)Context.getCurrentWidget(SWTBotCLabel.class);
    		clabel.setFocus();
    	}
	
}