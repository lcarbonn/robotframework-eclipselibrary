/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class CheckBoxActionKeywords {

	@RobotKeyword("Click on the checkbox, (does not change the state, better use Select un Deselect)\n\n"
            + "Example:\n"
            + "| Click CheckBox |\n")
        public void clickCheckBox() throws SWTBotBridgeException {
    		SWTBotCheckBox checkbox = (SWTBotCheckBox)Context.getCurrentWidget(SWTBotCheckBox.class);
    		checkbox.click();
    	}
	
	@RobotKeyword("Select the checkbox\n\n"
            + "Example:\n"
            + "| Select CheckBox |\n")
        public void selectCheckBox() throws SWTBotBridgeException {
    		SWTBotCheckBox checkbox = (SWTBotCheckBox)Context.getCurrentWidget(SWTBotCheckBox.class);
    		checkbox.select();
    	}

	@RobotKeyword("Deselect the checkbox\n\n"
            + "Example:\n"
            + "| Deselect CheckBox |\n")
        public void deselectCheckBox() throws SWTBotBridgeException {
    		SWTBotCheckBox checkbox = (SWTBotCheckBox)Context.getCurrentWidget(SWTBotCheckBox.class);
    		checkbox.deselect();
    	}

	@RobotKeyword("Is the checkbox checked\n\n"
            + "Example:\n"
            + "| Is CheckBox Checked |\n")
        public boolean isCheckBoxChecked() throws SWTBotBridgeException {
    		SWTBotCheckBox checkbox = (SWTBotCheckBox)Context.getCurrentWidget(SWTBotCheckBox.class);
    		return checkbox.isChecked();
    	}

	@RobotKeyword("Is the checkbox active\n\n"
            + "Example:\n"
            + "| Is CheckBox Active |\n")
        public boolean isCheckBoxActive() throws SWTBotBridgeException {
    		SWTBotCheckBox checkbox = (SWTBotCheckBox)Context.getCurrentWidget(SWTBotCheckBox.class);
    		return checkbox.isActive();
    	}

	@RobotKeyword("Is the checkbox enabled\n\n"
            + "Example:\n"
            + "| Is CheckBox Enabled |\n")
        public boolean isCheckBoxEnabled() throws SWTBotBridgeException {
    		SWTBotCheckBox checkbox = (SWTBotCheckBox)Context.getCurrentWidget(SWTBotCheckBox.class);
    		return checkbox.isEnabled();
    	}

	@RobotKeyword("Is the checkbox visible\n\n"
            + "Example:\n"
            + "| Is CheckBox Visible |\n")
        public boolean isCheckBoxVisible() throws SWTBotBridgeException {
    		SWTBotCheckBox checkbox = (SWTBotCheckBox)Context.getCurrentWidget(SWTBotCheckBox.class);
    		return checkbox.isVisible();
    	}

	@RobotKeyword("Get the text of the checkbox\n\n"
            + "Example:\n"
            + "| Get CheckBox Text |\n")
//    @ArgumentNames({"text"})
        public String getCheckBoxText() throws SWTBotBridgeException {
    		SWTBotCheckBox checkbox = (SWTBotCheckBox)Context.getCurrentWidget(SWTBotCheckBox.class);
    		return checkbox.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the checkbox\n\n"
            + "Example:\n"
            + "| Get CheckBox Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getCheckBoxTooltipText() throws SWTBotBridgeException {
    		SWTBotCheckBox checkbox = (SWTBotCheckBox)Context.getCurrentWidget(SWTBotCheckBox.class);
    		return checkbox.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the checkbox\n\n"
            + "Example:\n"
            + "| Set Focus On CheckBox |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnCheckBox() throws SWTBotBridgeException {
    		SWTBotCheckBox checkbox = (SWTBotCheckBox)Context.getCurrentWidget(SWTBotCheckBox.class);
    		checkbox.setFocus();
    	}
	
}