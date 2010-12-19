/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.eclipse.finder;

import java.util.List;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarPushButton;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ToolbarsFinderKeywords {

	
	@RobotKeyword("List all the toolbarButtons tooltip for the workbench part in context\n\n"
            + "Example:\n"
            + "| List Part All Toolbar Buttons Tooltip | \n")
//    @ArgumentNames({"tooltip"})
        public String[] listPartAllToolbarButtonsTooltip() throws SWTBotBridgeException {
    		SWTBotWorkbenchPart part = (SWTBotWorkbenchPart)Context.getCurrentWidget();
   		
        	List<SWTBotToolbarButton> tbs = part.getToolbarButtons();
    		String[] a = new String[tbs.size()];
    		int i = 0;
        	for (SWTBotToolbarButton p : tbs) {
        		a[i]=p.getToolTipText();
        		i++;
    		}
    		return a;
    	}
	
	@RobotKeyword("Find the toolbarButton with the given tooltip for the workbench part in context\n\n"
            + "Example:\n"
            + "| Find Part Toolbar Button | tooltip | \n")
    @ArgumentNames({"tooltip"})
        public SWTBotToolbarButton findPartToolbarButton(String tooltip) throws SWTBotBridgeException {
    		SWTBotWorkbenchPart part = (SWTBotWorkbenchPart)Context.getCurrentWidget();
    		SWTBotToolbarButton b = part.toolbarButton(tooltip);
    		Context.setCurrentWidget(b);
    		return b;
    	}

	@RobotKeyword("Find the toolbar drop down Button with the given tooltip for the workbench part in context\n\n"
            + "Example:\n"
            + "| Find Part Toolbar Drop Down Button | tooltip | \n")
    @ArgumentNames({"tooltip"})
        public SWTBotToolbarDropDownButton findPartToolbarDropDownButton(String tooltip) throws SWTBotBridgeException {
    		SWTBotWorkbenchPart part = (SWTBotWorkbenchPart)Context.getCurrentWidget();
    		SWTBotToolbarDropDownButton b = part.toolbarDropDownButton(tooltip);
    		Context.setCurrentWidget(b);
    		return b;
    	}

	@RobotKeyword("Find the toolbar push Button with the given tooltip for the workbench part in context\n\n"
            + "Example:\n"
            + "| Find Part Toolbar Push Button | tooltip | \n")
    @ArgumentNames({"tooltip"})
        public SWTBotToolbarPushButton findPartToolbarPushButton(String tooltip) throws SWTBotBridgeException {
    		SWTBotWorkbenchPart part = (SWTBotWorkbenchPart)Context.getCurrentWidget();
    		SWTBotToolbarPushButton b = part.toolbarPushButton(tooltip);
    		Context.setCurrentWidget(b);
    		return b;
    	}

	@RobotKeyword("Find the toolbar radio Button with the given tooltip for the workbench part in context\n\n"
            + "Example:\n"
            + "| Find Part Toolbar Radio Button | tooltip | \n")
    @ArgumentNames({"tooltip"})
        public SWTBotToolbarRadioButton findPartToolbarRadioButton(String tooltip) throws SWTBotBridgeException {
    		SWTBotWorkbenchPart part = (SWTBotWorkbenchPart)Context.getCurrentWidget();
    		SWTBotToolbarRadioButton b = part.toolbarRadioButton(tooltip);
    		Context.setCurrentWidget(b);
    		return b;
    	}

	@RobotKeyword("Find the toolbar toggle Button with the given tooltip for the workbench part in context\n\n"
            + "Example:\n"
            + "| Find Part Toolbar Toggle Button | tooltip | \n")
    @ArgumentNames({"tooltip"})
        public SWTBotToolbarToggleButton findPartToolbarToggleButton(String tooltip) throws SWTBotBridgeException {
    		SWTBotWorkbenchPart part = (SWTBotWorkbenchPart)Context.getCurrentWidget();
    		SWTBotToolbarToggleButton b = part.toolbarToggleButton(tooltip);
    		Context.setCurrentWidget(b);
    		return b;
    	}

}