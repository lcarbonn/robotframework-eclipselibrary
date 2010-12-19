/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class TextActionKeywords {

	@RobotKeyword("Is the text active\n\n"
            + "Example:\n"
            + "| Is Text Active |\n")
        public boolean isTextActive() throws SWTBotBridgeException {
    		SWTBotText text = (SWTBotText)Context.getCurrentWidget(SWTBotText.class);
    		return text.isActive();
    	}

	@RobotKeyword("Is the text enabled\n\n"
            + "Example:\n"
            + "| Is Text Enabled |\n")
        public boolean isTextEnabled() throws SWTBotBridgeException {
    		SWTBotText text = (SWTBotText)Context.getCurrentWidget(SWTBotText.class);
    		return text.isEnabled();
    	}

	@RobotKeyword("Is the text visible\n\n"
            + "Example:\n"
            + "| Is Text Visible |\n")
        public boolean isTextVisible() throws SWTBotBridgeException {
    		SWTBotText text = (SWTBotText)Context.getCurrentWidget(SWTBotText.class);
    		return text.isVisible();
    	}

	@RobotKeyword("Get the text of the text\n\n"
            + "Example:\n"
            + "| Get Text Text |\n")
//    @ArgumentNames({"text"})
        public String getTextText() throws SWTBotBridgeException {
    		SWTBotText text = (SWTBotText)Context.getCurrentWidget(SWTBotText.class);
    		return text.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the text\n\n"
            + "Example:\n"
            + "| Get Text Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getTextTooltipText() throws SWTBotBridgeException {
    		SWTBotText text = (SWTBotText)Context.getCurrentWidget(SWTBotText.class);
    		return text.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the text\n\n"
            + "Example:\n"
            + "| Set Focus On Text |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnText() throws SWTBotBridgeException {
    		SWTBotText text = (SWTBotText)Context.getCurrentWidget(SWTBotText.class);
    		text.setFocus();
    	}

	@RobotKeyword("Set text into text\n\n"
			+ "Example:\n"
            + "| Set Text Text | text | \n")
    @ArgumentNames({"text"})
        public void setTextText(String text) throws SWTBotBridgeException {
    		SWTBotText t = (SWTBotText)Context.getCurrentWidget(SWTBotText.class);
			t.setText(text);
    	}


	/*
	@RobotKeyword("Type text into text\n\n"
			+ "Example:\n"
            + "| Type Text Text | text | \n")
    @ArgumentNames({"text"})
        public void typeTextText(String text) throws SWTBotBridgeException {
    		SWTBotText t = (SWTBotText)Context.getCurrentWidget(SWTBotText.class);
			t.typeText(text);
    	}

 	@RobotKeyword("Type text into text with the interval between consecutive key strokes\n\n"
			+ "Example:\n"
            + "| Type Text Text With Interval | text | \n")
    @ArgumentNames({"text", "interval"})
        public void typeTextTextWithInterval(String text, String interval) throws SWTBotBridgeException {
    		SWTBotText t = (SWTBotText)Context.getCurrentWidget(SWTBotText.class);
    		Integer i = Integer.valueOf(interval).intValue();
			t.typeText(text, i);
    	}
*/
 	@RobotKeyword("Select the contents of the entire widget\n\n"
			+ "Example:\n"
            + "| Select All Text | \n")
//    @ArgumentNames({"text", "interval"})
        public void selectAllText() throws SWTBotBridgeException {
    		SWTBotText t = (SWTBotText)Context.getCurrentWidget(SWTBotText.class);
			t.selectAll();
    	}

}