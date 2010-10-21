/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class SpinnerActionKeywords {

	@RobotKeyword("Is the spinner active\n\n"
            + "Example:\n"
            + "| Is Spinner Active |\n")
        public boolean isSpinnerActive() throws Exception {
    		SWTBotSpinner spinner = (SWTBotSpinner)Context.getCurrentWidget(SWTBotSpinner.class);
    		return spinner.isActive();
    	}

	@RobotKeyword("Is the spinner enabled\n\n"
            + "Example:\n"
            + "| Is Spinner Enabled |\n")
        public boolean isSpinnerEnabled() throws Exception {
    		SWTBotSpinner spinner = (SWTBotSpinner)Context.getCurrentWidget(SWTBotSpinner.class);
    		return spinner.isEnabled();
    	}

	@RobotKeyword("Is the spinner visible\n\n"
            + "Example:\n"
            + "| Is Spinner Visible |\n")
        public boolean isSpinnerVisible() throws Exception {
    		SWTBotSpinner spinner = (SWTBotSpinner)Context.getCurrentWidget(SWTBotSpinner.class);
    		return spinner.isVisible();
    	}

	@RobotKeyword("Get the text of the spinner\n\n"
            + "Example:\n"
            + "| Get Spinner Text |\n")
//    @ArgumentNames({"text"})
        public String getSpinnerText() throws Exception {
    		SWTBotSpinner spinner = (SWTBotSpinner)Context.getCurrentWidget(SWTBotSpinner.class);
    		return spinner.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the spinner\n\n"
            + "Example:\n"
            + "| Get Spinner Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getSpinnerTooltipText() throws Exception {
    		SWTBotSpinner spinner = (SWTBotSpinner)Context.getCurrentWidget(SWTBotSpinner.class);
    		return spinner.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the spinner\n\n"
            + "Example:\n"
            + "| Set Focus On Spinner |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnSpinner() throws Exception {
    		SWTBotSpinner spinner = (SWTBotSpinner)Context.getCurrentWidget(SWTBotSpinner.class);
    		spinner.setFocus();
    	}
	
	@RobotKeyword("Get the spinner digits\n\n"
            + "Example:\n"
            + "| Get Spinner Digits |\n")
//    @ArgumentNames({"text"})
        public int getSpinnerDigits() throws Exception {
    		SWTBotSpinner spinner = (SWTBotSpinner)Context.getCurrentWidget(SWTBotSpinner.class);
    		return spinner.getDigits();
    	}

	@RobotKeyword("Get the spinner maximum\n\n"
            + "Example:\n"
            + "| Get Spinner Maximum |\n")
//    @ArgumentNames({"text"})
        public int getSpinnerMaximum() throws Exception {
    		SWTBotSpinner spinner = (SWTBotSpinner)Context.getCurrentWidget(SWTBotSpinner.class);
    		return spinner.getMaximum();
    	}

	@RobotKeyword("Get the spinner minimum\n\n"
            + "Example:\n"
            + "| Get Spinner Minimum |\n")
//    @ArgumentNames({"text"})
        public int getSpinnerMinimum() throws Exception {
    		SWTBotSpinner spinner = (SWTBotSpinner)Context.getCurrentWidget(SWTBotSpinner.class);
    		return spinner.getMinimum();
    	}

	@RobotKeyword("Get the spinner page increment\n\n"
            + "Example:\n"
            + "| Get Spinner Page Increment |\n")
//    @ArgumentNames({"text"})
        public int getSpinnerPageIncrement() throws Exception {
    		SWTBotSpinner spinner = (SWTBotSpinner)Context.getCurrentWidget(SWTBotSpinner.class);
    		return spinner.getPageIncrement();
    	}

	@RobotKeyword("Get the spinner selection\n\n"
            + "Example:\n"
            + "| Get Spinner Selection |\n")
//    @ArgumentNames({"text"})
        public int getSpinnerSelection() throws Exception {
    		SWTBotSpinner spinner = (SWTBotSpinner)Context.getCurrentWidget(SWTBotSpinner.class);
    		return spinner.getSelection();
    	}

	@RobotKeyword("Set the spinner selection\n\n"
            + "Example:\n"
            + "| Set Spinner Selection | 0 |\n")
    @ArgumentNames({"index"})
        public void setSpinnerSelection(String index) throws Exception {
    		SWTBotSpinner spinner = (SWTBotSpinner)Context.getCurrentWidget(SWTBotSpinner.class);
			Integer i = Integer.valueOf(index).intValue();
			spinner.setSelection(i);
    	}

}