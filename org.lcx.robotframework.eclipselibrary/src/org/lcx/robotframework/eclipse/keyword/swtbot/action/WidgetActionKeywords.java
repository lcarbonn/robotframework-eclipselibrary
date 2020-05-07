/*
 * Copyright 2010 L. Carbonnaux
 * 2020 - Widget Extension Refactor AbstractSWTBot capabilities J. Beaumont
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBot;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class WidgetActionKeywords {

	@RobotKeyword("Is the widget active\n\n"
            + "Example:\n"
            + "| Is Active |\n")
        public boolean isActive() throws SWTBotBridgeException {
			AbstractSWTBot widget = (AbstractSWTBot)Context.getCurrentWidget(AbstractSWTBot.class);
    		return widget.isActive();
    	}

	@RobotKeyword("Is the widget enabled\n\n"
            + "Example:\n"
            + "| Is Enabled |\n")
        public boolean isEnabled() throws SWTBotBridgeException {
			AbstractSWTBot widget = (AbstractSWTBot)Context.getCurrentWidget(AbstractSWTBot.class);
    		return widget.isEnabled();
    	}

	@RobotKeyword("Is visible\n\n"
            + "Example:\n"
            + "| Is Visible |\n")
        public boolean isVisible() throws SWTBotBridgeException {
			AbstractSWTBot widget = (AbstractSWTBot)Context.getCurrentWidget(AbstractSWTBot.class);
    		return widget.isVisible();
    	}

	@RobotKeyword("Get the text of the widget\n\n"
            + "Example:\n"
            + "| Get Text |\n")
//    @ArgumentNames({"text"})
        public String getText() throws SWTBotBridgeException {
			AbstractSWTBot widget = (AbstractSWTBot)Context.getCurrentWidget(AbstractSWTBot.class);
    		return widget.getText();
    	}
	
	@RobotKeyword("Get the Id of the widget\n\n"
            + "Example:\n"
            + "| Get Id |\n")
//    @ArgumentNames({"text"})
        public String getId() throws SWTBotBridgeException {
			AbstractSWTBot widget = (AbstractSWTBot)Context.getCurrentWidget(AbstractSWTBot.class);
    		return widget.getId();
    	}
	
	@RobotKeyword("Get the tooltip text of the widget\n\n"
            + "Example:\n"
            + "| Get Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getTooltipText() throws SWTBotBridgeException {
			AbstractSWTBot widget = (AbstractSWTBot)Context.getCurrentWidget(AbstractSWTBot.class);
    		return widget.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the widget\n\n"
            + "Example:\n"
            + "| Set Focus |\n")
//    @ArgumentNames({"text"})
        public void setFocus() throws SWTBotBridgeException {
			AbstractSWTBot widget = (AbstractSWTBot)Context.getCurrentWidget(AbstractSWTBot.class);
    		widget.setFocus();
    	}
	
}