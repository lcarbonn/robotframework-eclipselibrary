/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.eclipse.action;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotViewMenu;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ViewMenuActionKeywords {

	@RobotKeyword("Is the viewMenu checked\n\n"
            + "Example:\n"
            + "| Is ViewMenu Checked |\n")
        public boolean isViewMenuChecked() throws SWTBotBridgeException {
    		SWTBotViewMenu viewMenu = (SWTBotViewMenu)Context.getCurrentWidget(SWTBotViewMenu.class);
    		return viewMenu.isChecked();
    	}

	@RobotKeyword("Click the viewMenu\n\n"
            + "Example:\n"
            + "| click ViewMenu |\n")
        public void clickViewMenu() throws SWTBotBridgeException {
    		SWTBotViewMenu viewMenu = (SWTBotViewMenu)Context.getCurrentWidget(SWTBotViewMenu.class);
    		viewMenu.click();
    	}

	@RobotKeyword("Get the text of the viewMenu\n\n"
            + "Example:\n"
            + "| Get ViewMenu Text |\n")
        public String getViewMenuText() throws SWTBotBridgeException {
    		SWTBotViewMenu viewMenu = (SWTBotViewMenu)Context.getCurrentWidget(SWTBotViewMenu.class);
    		return viewMenu.getText();
    	}

}