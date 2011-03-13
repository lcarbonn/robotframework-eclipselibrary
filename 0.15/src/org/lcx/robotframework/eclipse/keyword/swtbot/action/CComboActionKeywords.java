/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class CComboActionKeywords {

	@RobotKeyword("Get the number of items in the ccombo \n\n"
            + "Example:\n"
            + "| Count Items In CCombo |\n")
        public int countItemsInCCombo() throws SWTBotBridgeException {
    		SWTBotCCombo ccombo = (SWTBotCCombo)Context.getCurrentWidget(SWTBotCCombo.class);
    		return ccombo.itemCount();
    	}
	
	@RobotKeyword("Get the items in the ccombo \n\n"
            + "Example:\n"
            + "| Get CCombo Items |\n")
        public String[] getCComboItems() throws SWTBotBridgeException {
    		SWTBotCCombo ccombo = (SWTBotCCombo)Context.getCurrentWidget(SWTBotCCombo.class);
    		return ccombo.items();
    	}

	@RobotKeyword("Get the text of the selection in the ccombo \n\n"
            + "Example:\n"
            + "| Get Selection Text In CCombo |\n")
        public String getSelectionTextInCCombo() throws SWTBotBridgeException {
    		SWTBotCCombo ccombo = (SWTBotCCombo)Context.getCurrentWidget(SWTBotCCombo.class);
    		return ccombo.selection();
    	}

	@RobotKeyword("Get the selection index in the ccombo \n\n"
            + "Example:\n"
            + "| Get Selection Index In CCombo |\n")
        public int getSelectionIndexInCCombo() throws SWTBotBridgeException {
    		SWTBotCCombo ccombo = (SWTBotCCombo)Context.getCurrentWidget(SWTBotCCombo.class);
    		return ccombo.selectionIndex();
    	}

	@RobotKeyword("Set the focus on the ccombo \n\n"
            + "Example:\n"
            + "| Set Focus On CCombo |\n")
        public void setFocusOnCCombo() throws SWTBotBridgeException {
    		SWTBotCCombo ccombo = (SWTBotCCombo)Context.getCurrentWidget(SWTBotCCombo.class);
    		ccombo.setFocus();
    	}

	@RobotKeyword("Set the selection index in the ccombo \n\n"
            + "Example:\n"
            + "| Get Selection Index In CCombo | index |\n")
    @ArgumentNames({"index"})
        public void setSelectionIndexInCCombo(String index) throws SWTBotBridgeException {
    		SWTBotCCombo ccombo = (SWTBotCCombo)Context.getCurrentWidget(SWTBotCCombo.class);
    		int indexI = -1;
			indexI = Integer.valueOf(index).intValue();
    		if(indexI!=-1) {
    			ccombo.setSelection(indexI);
    		}
    	}

	@RobotKeyword("Set the selection text in the ccombo \n\n"
            + "Example:\n"
            + "| Set Selection Text In CCombo | text |\n")
    @ArgumentNames({"text"})
        public void setSelectionTextInCCombo(String text) throws SWTBotBridgeException {
    		SWTBotCCombo ccombo = (SWTBotCCombo)Context.getCurrentWidget(SWTBotCCombo.class);
    		if(text!=null && text.length()>0) {
    			ccombo.setSelection(text);
    		}
    	}

	@RobotKeyword("Set the text of the ccombo \n\n"
            + "Example:\n"
            + "| Set CCombo Text|\n")
    @ArgumentNames({"text"})
        public void setCComboText(String text) throws SWTBotBridgeException {
    		SWTBotCCombo ccombo = (SWTBotCCombo)Context.getCurrentWidget(SWTBotCCombo.class);
    		if(text!=null && text.length()>0) {
    			ccombo.setText(text);
    		}
    	}

	@RobotKeyword("Get the text limit of the ccombo \n\n"
            + "Example:\n"
            + "| Get CCombo Text Limit|\n")
//    @ArgumentNames({"text"})
        public int getCComboTextLimit() throws SWTBotBridgeException {
    		SWTBotCCombo ccombo = (SWTBotCCombo)Context.getCurrentWidget(SWTBotCCombo.class);
    			return ccombo.textLimit();
    	}

	@RobotKeyword("Is the ccombo active\n\n"
            + "Example:\n"
            + "| Is CCombo Active |\n")
        public boolean isCComboActive() throws SWTBotBridgeException {
    		SWTBotCCombo ccombo = (SWTBotCCombo)Context.getCurrentWidget(SWTBotCCombo.class);
    		return ccombo.isActive();
    	}

	@RobotKeyword("Is the ccombo enabled\n\n"
            + "Example:\n"
            + "| Is CCombo Enabled |\n")
        public boolean isCComboEnabled() throws SWTBotBridgeException {
    		SWTBotCCombo ccombo = (SWTBotCCombo)Context.getCurrentWidget(SWTBotCCombo.class);
    		return ccombo.isEnabled();
    	}

	@RobotKeyword("Is the ccombo visible\n\n"
            + "Example:\n"
            + "| Is CCombo Visible |\n")
        public boolean isCComboVisible() throws SWTBotBridgeException {
    		SWTBotCCombo ccombo = (SWTBotCCombo)Context.getCurrentWidget(SWTBotCCombo.class);
    		return ccombo.isVisible();
    	}

	@RobotKeyword("Get the text of the ccombo\n\n"
            + "Example:\n"
            + "| Get CCombo Text |\n")
//    @ArgumentNames({"text"})
        public String getCComboText() throws SWTBotBridgeException {
    		SWTBotCCombo ccombo = (SWTBotCCombo)Context.getCurrentWidget(SWTBotCCombo.class);
    		return ccombo.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the ccombo\n\n"
            + "Example:\n"
            + "| Get CCombo Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getCComboTooltipText() throws SWTBotBridgeException {
    		SWTBotCCombo ccombo = (SWTBotCCombo)Context.getCurrentWidget(SWTBotCCombo.class);
    		return ccombo.getToolTipText();
    	}
}