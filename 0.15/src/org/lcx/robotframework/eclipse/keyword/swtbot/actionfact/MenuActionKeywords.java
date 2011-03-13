/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.actionfact;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class MenuActionKeywords {

	@RobotKeyword("Click on the menu\n\n"
            + "Example:\n"
            + "| Click Menu |\n")
        public void clickMenu() throws SWTBotBridgeException {
    		SWTBotMenu menu = (SWTBotMenu)Context.getCurrentWidget(SWTBotMenu.class);
    		menu.click();
    	}
	
	@RobotKeyword("Is the menu active\n\n"
            + "Example:\n"
            + "| Is Menu Active |\n")
        public boolean isMenuActive() throws SWTBotBridgeException {
    		SWTBotMenu menu = (SWTBotMenu)Context.getCurrentWidget(SWTBotMenu.class);
    		return menu.isActive();
    	}

	@RobotKeyword("Is the menu enabled\n\n"
            + "Example:\n"
            + "| Is Menu Enabled |\n")
        public boolean isMenuEnabled() throws SWTBotBridgeException {
    		SWTBotMenu menu = (SWTBotMenu)Context.getCurrentWidget(SWTBotMenu.class);
    		return menu.isEnabled();
    	}

	@RobotKeyword("Is the menu visible\n\n"
            + "Example:\n"
            + "| Is Menu Visible |\n")
        public boolean isMenuVisible() throws SWTBotBridgeException {
    		SWTBotMenu menu = (SWTBotMenu)Context.getCurrentWidget(SWTBotMenu.class);
    		return menu.isVisible();
    	}

	@RobotKeyword("Get the text of the menu\n\n"
            + "Example:\n"
            + "| Get Menu Text |\n")
//    @ArgumentNames({"text"})
        public String getMenuText() throws SWTBotBridgeException {
    		SWTBotMenu menu = (SWTBotMenu)Context.getCurrentWidget(SWTBotMenu.class);
    		return menu.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the menu\n\n"
            + "Example:\n"
            + "| Get Menu Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getMenuTooltipText() throws SWTBotBridgeException {
    		SWTBotMenu menu = (SWTBotMenu)Context.getCurrentWidget(SWTBotMenu.class);
    		return menu.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the menu\n\n"
            + "Example:\n"
            + "| Set Focus On Menu |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnMenu() throws SWTBotBridgeException {
    		SWTBotMenu menu = (SWTBotMenu)Context.getCurrentWidget(SWTBotMenu.class);
    		menu.setFocus();
    	}
	
	@RobotKeyword("Find the sub menu with the given name\n\n"
            + "Example:\n"
            + "| Find Sub Menu |\n")
    @ArgumentNames({"name"})
        public void findSubMenu(String name) throws SWTBotBridgeException {
    		SWTBotMenu menu = (SWTBotMenu)Context.getCurrentWidget(SWTBotMenu.class);
    		Context.setCurrentWidget(menu.menu(name));
    	}

	@RobotKeyword("Is the menu checked\n\n"
            + "Example:\n"
            + "| Is Menu Checked |\n")
        public boolean isMenuChecked() throws SWTBotBridgeException {
    		SWTBotMenu menu = (SWTBotMenu)Context.getCurrentWidget(SWTBotMenu.class);
    		return menu.isChecked();
    	}


}