/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.actionfact;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTrayItem;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class TrayItemActionKeywords {

	@RobotKeyword("Is the trayItem active\n\n"
            + "Example:\n"
            + "| Is TrayItem Active |\n")
        public boolean isTrayItemActive() throws Exception {
    		SWTBotTrayItem trayItem = (SWTBotTrayItem)Context.getCurrentWidget(SWTBotTrayItem.class);
    		return trayItem.isActive();
    	}

	@RobotKeyword("Is the trayItem enabled\n\n"
            + "Example:\n"
            + "| Is TrayItem Enabled |\n")
        public boolean isTrayItemEnabled() throws Exception {
    		SWTBotTrayItem trayItem = (SWTBotTrayItem)Context.getCurrentWidget(SWTBotTrayItem.class);
    		return trayItem.isEnabled();
    	}

	@RobotKeyword("Is the trayItem visible\n\n"
            + "Example:\n"
            + "| Is TrayItem Visible |\n")
        public boolean isTrayItemVisible() throws Exception {
    		SWTBotTrayItem trayItem = (SWTBotTrayItem)Context.getCurrentWidget(SWTBotTrayItem.class);
    		return trayItem.isVisible();
    	}

	@RobotKeyword("Get the text of the trayItem\n\n"
            + "Example:\n"
            + "| Get TrayItem Text |\n")
//    @ArgumentNames({"text"})
        public String getTrayItemText() throws Exception {
    		SWTBotTrayItem trayItem = (SWTBotTrayItem)Context.getCurrentWidget(SWTBotTrayItem.class);
    		return trayItem.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the trayItem\n\n"
            + "Example:\n"
            + "| Get TrayItem Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getTrayItemTooltipText() throws Exception {
    		SWTBotTrayItem trayItem = (SWTBotTrayItem)Context.getCurrentWidget(SWTBotTrayItem.class);
    		return trayItem.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the trayItem\n\n"
            + "Example:\n"
            + "| Set Focus On TrayItem |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnTrayItem() throws Exception {
    		SWTBotTrayItem trayItem = (SWTBotTrayItem)Context.getCurrentWidget(SWTBotTrayItem.class);
    		trayItem.setFocus();
    	}

	@RobotKeyword("Get the trayItem menu with the given name\n\n"
            + "Example:\n"
            + "| Get TrayItem Menu With Name | name |\n")
    @ArgumentNames({"name"})
        public void getTrayItemMenuWithName(String name) throws Exception {
    		SWTBotTrayItem trayItem = (SWTBotTrayItem)Context.getCurrentWidget(SWTBotTrayItem.class);
    		Context.setCurrentWidget(trayItem.menu(name));
    	}
}