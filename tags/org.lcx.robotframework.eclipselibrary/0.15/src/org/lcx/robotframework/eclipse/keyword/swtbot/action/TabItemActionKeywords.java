/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class TabItemActionKeywords {

	@RobotKeyword("Is the tabItem active\n\n"
            + "Example:\n"
            + "| Is TabItem Active |\n")
        public boolean isTabItemActive() throws SWTBotBridgeException {
    		SWTBotTabItem tabItem = (SWTBotTabItem)Context.getCurrentWidget(SWTBotTabItem.class);
    		return tabItem.isActive();
    	}

	@RobotKeyword("Is the tabItem enabled\n\n"
            + "Example:\n"
            + "| Is TabItem Enabled |\n")
        public boolean isTabItemEnabled() throws SWTBotBridgeException {
    		SWTBotTabItem tabItem = (SWTBotTabItem)Context.getCurrentWidget(SWTBotTabItem.class);
    		return tabItem.isEnabled();
    	}

	@RobotKeyword("Is the tabItem visible\n\n"
            + "Example:\n"
            + "| Is TabItem Visible |\n")
        public boolean isTabItemVisible() throws SWTBotBridgeException {
    		SWTBotTabItem tabItem = (SWTBotTabItem)Context.getCurrentWidget(SWTBotTabItem.class);
    		return tabItem.isVisible();
    	}

	@RobotKeyword("Get the text of the tabItem\n\n"
            + "Example:\n"
            + "| Get TabItem Text |\n")
//    @ArgumentNames({"text"})
        public String getTabItemText() throws SWTBotBridgeException {
    		SWTBotTabItem tabItem = (SWTBotTabItem)Context.getCurrentWidget(SWTBotTabItem.class);
    		return tabItem.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the tabItem\n\n"
            + "Example:\n"
            + "| Get TabItem Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getTabItemTooltipText() throws SWTBotBridgeException {
    		SWTBotTabItem tabItem = (SWTBotTabItem)Context.getCurrentWidget(SWTBotTabItem.class);
    		return tabItem.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the tabItem\n\n"
            + "Example:\n"
            + "| Set Focus On TabItem |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnTabItem() throws SWTBotBridgeException {
    		SWTBotTabItem tabItem = (SWTBotTabItem)Context.getCurrentWidget(SWTBotTabItem.class);
    		tabItem.setFocus();
    	}
	
	@RobotKeyword("Activate the tabItem\n\n"
            + "Example:\n"
            + "| Activate TabItem |\n")
//    @ArgumentNames({"text"})
        public void activateTabItem() throws SWTBotBridgeException {
    		SWTBotTabItem tabItem = (SWTBotTabItem)Context.getCurrentWidget(SWTBotTabItem.class);
    		tabItem.activate();
    	}

}