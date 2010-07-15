package org.lcx.robotframework.eclipse.keyword.eclipse.finder;

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

	@RobotKeyword("Find the toolbarButton with the given tooltip for the workbench part in context\n\n"
            + "Example:\n"
            + "| Find Toolbar Button | tooltip | \n")
    @ArgumentNames({"tooltip"})
        public SWTBotToolbarButton findToolbarButton(String tooltip) throws Exception {
    		SWTBotWorkbenchPart part = (SWTBotWorkbenchPart)Context.getCurrentWidget();
    		SWTBotToolbarButton b = part.toolbarButton(tooltip);
    		Context.setCurrentWidget(b);
    		return b;
    	}

	@RobotKeyword("Find the toolbar drop down Button with the given tooltip for the workbench part in context\n\n"
            + "Example:\n"
            + "| Find Toolbar Drop Down Button | tooltip | \n")
    @ArgumentNames({"tooltip"})
        public SWTBotToolbarDropDownButton findToolbarDropDownButton(String tooltip) throws Exception {
    		SWTBotWorkbenchPart part = (SWTBotWorkbenchPart)Context.getCurrentWidget();
    		SWTBotToolbarDropDownButton b = part.toolbarDropDownButton(tooltip);
    		Context.setCurrentWidget(b);
    		return b;
    	}

	@RobotKeyword("Find the toolbar push Button with the given tooltip for the workbench part in context\n\n"
            + "Example:\n"
            + "| Find Toolbar Push Button | tooltip | \n")
    @ArgumentNames({"tooltip"})
        public SWTBotToolbarPushButton findToolbarPushButton(String tooltip) throws Exception {
    		SWTBotWorkbenchPart part = (SWTBotWorkbenchPart)Context.getCurrentWidget();
    		SWTBotToolbarPushButton b = part.toolbarPushButton(tooltip);
    		Context.setCurrentWidget(b);
    		return b;
    	}

	@RobotKeyword("Find the toolbar radio Button with the given tooltip for the workbench part in context\n\n"
            + "Example:\n"
            + "| Find Toolbar Radio Button | tooltip | \n")
    @ArgumentNames({"tooltip"})
        public SWTBotToolbarRadioButton findToolbarRadioButton(String tooltip) throws Exception {
    		SWTBotWorkbenchPart part = (SWTBotWorkbenchPart)Context.getCurrentWidget();
    		SWTBotToolbarRadioButton b = part.toolbarRadioButton(tooltip);
    		Context.setCurrentWidget(b);
    		return b;
    	}

	@RobotKeyword("Find the toolbar toggle Button with the given tooltip for the workbench part in context\n\n"
            + "Example:\n"
            + "| Find Toolbar Toggle Button | tooltip | \n")
    @ArgumentNames({"tooltip"})
        public SWTBotToolbarToggleButton findToolbarToggleButton(String tooltip) throws Exception {
    		SWTBotWorkbenchPart part = (SWTBotWorkbenchPart)Context.getCurrentWidget();
    		SWTBotToolbarToggleButton b = part.toolbarToggleButton(tooltip);
    		Context.setCurrentWidget(b);
    		return b;
    	}

}