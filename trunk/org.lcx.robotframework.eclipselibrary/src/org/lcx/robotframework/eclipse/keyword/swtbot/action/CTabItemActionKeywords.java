/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class CTabItemActionKeywords {

	@RobotKeyword("Is the cTabItem active\n\n"
            + "Example:\n"
            + "| Is CTabItem Active |\n")
        public boolean isCTabItemActive() throws Exception {
    		SWTBotCTabItem cTabItem = (SWTBotCTabItem)Context.getCurrentWidget(SWTBotCTabItem.class);
    		return cTabItem.isActive();
    	}

	@RobotKeyword("Is the cTabItem enabled\n\n"
            + "Example:\n"
            + "| Is CTabItem Enabled |\n")
        public boolean isCTabItemEnabled() throws Exception {
    		SWTBotCTabItem cTabItem = (SWTBotCTabItem)Context.getCurrentWidget(SWTBotCTabItem.class);
    		return cTabItem.isEnabled();
    	}

	@RobotKeyword("Is the cTabItem visible\n\n"
            + "Example:\n"
            + "| Is CTabItem Visible |\n")
        public boolean isCTabItemVisible() throws Exception {
    		SWTBotCTabItem cTabItem = (SWTBotCTabItem)Context.getCurrentWidget(SWTBotCTabItem.class);
    		return cTabItem.isVisible();
    	}

	@RobotKeyword("Get the text of the cTabItem\n\n"
            + "Example:\n"
            + "| Get CTabItem Text |\n")
//    @ArgumentNames({"text"})
        public String getCTabItemText() throws Exception {
    		SWTBotCTabItem cTabItem = (SWTBotCTabItem)Context.getCurrentWidget(SWTBotCTabItem.class);
    		return cTabItem.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the cTabItem\n\n"
            + "Example:\n"
            + "| Get CTabItem Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getCTabItemTooltipText() throws Exception {
    		SWTBotCTabItem cTabItem = (SWTBotCTabItem)Context.getCurrentWidget(SWTBotCTabItem.class);
    		return cTabItem.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the cTabItem\n\n"
            + "Example:\n"
            + "| Set Focus On CTabItem |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnCTabItem() throws Exception {
    		SWTBotCTabItem cTabItem = (SWTBotCTabItem)Context.getCurrentWidget(SWTBotCTabItem.class);
    		cTabItem.setFocus();
    	}
	
	@RobotKeyword("Activate the cTabItem\n\n"
            + "Example:\n"
            + "| Activate CTabItem |\n")
//    @ArgumentNames({"text"})
        public void activateCTabItem() throws Exception {
    		SWTBotCTabItem cTabItem = (SWTBotCTabItem)Context.getCurrentWidget(SWTBotCTabItem.class);
    		cTabItem.activate();
    	}
	
	@RobotKeyword("Close the cTabItem\n\n"
            + "Example:\n"
            + "| Close CTabItem |\n")
//    @ArgumentNames({"text"})
        public void closeCTabItem() throws Exception {
    		SWTBotCTabItem cTabItem = (SWTBotCTabItem)Context.getCurrentWidget(SWTBotCTabItem.class);
    		cTabItem.close();
    	}
	
	@RobotKeyword("Show the cTabItem\n\n"
            + "Example:\n"
            + "| Show CTabItem |\n")
//    @ArgumentNames({"text"})
        public void showCTabItem() throws Exception {
    		SWTBotCTabItem cTabItem = (SWTBotCTabItem)Context.getCurrentWidget(SWTBotCTabItem.class);
    		cTabItem.show();
    	}
}