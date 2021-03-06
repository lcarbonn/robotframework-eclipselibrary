/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ComboActionKeywords {

	@RobotKeyword("Get the number of items in the combo \n\n"
            + "Example:\n"
            + "| Count Items In Combo |\n")
        public int countItemsInCombo() throws SWTBotBridgeException {
    		SWTBotCombo combo = (SWTBotCombo)Context.getCurrentWidget(SWTBotCombo.class);
    		return combo.itemCount();
    	}
	
	@RobotKeyword("Get the items in the combo \n\n"
            + "Example:\n"
            + "| Get Combo Items |\n")
        public String[] getComboItems() throws SWTBotBridgeException {
    		SWTBotCombo combo = (SWTBotCombo)Context.getCurrentWidget(SWTBotCombo.class);
    		return combo.items();
    	}

	@RobotKeyword("Get the text of the selection in the combo \n\n"
            + "Example:\n"
            + "| Get Selection Text In Combo |\n")
        public String getSelectionTextInCombo() throws SWTBotBridgeException {
    		SWTBotCombo combo = (SWTBotCombo)Context.getCurrentWidget(SWTBotCombo.class);
    		return combo.selection();
    	}

	@RobotKeyword("Get the selection index in the combo \n\n"
            + "Example:\n"
            + "| Get Selection Index In Combo |\n")
        public int getSelectionIndexInCombo() throws SWTBotBridgeException {
    		SWTBotCombo combo = (SWTBotCombo)Context.getCurrentWidget(SWTBotCombo.class);
    		return combo.selectionIndex();
    	}

	@RobotKeyword("Set the focus on the combo \n\n"
            + "Example:\n"
            + "| Set Focus On Combo |\n")
        public void setFocusOnCombo() throws SWTBotBridgeException {
    		SWTBotCombo combo = (SWTBotCombo)Context.getCurrentWidget(SWTBotCombo.class);
    		combo.setFocus();
    	}

	@RobotKeyword("Set the selection index in the combo \n\n"
            + "Example:\n"
            + "| Get Selection Index In Combo | index |\n")
    @ArgumentNames({"index"})
        public void setSelectionIndexInCombo(String index) throws SWTBotBridgeException {
    		SWTBotCombo combo = (SWTBotCombo)Context.getCurrentWidget(SWTBotCombo.class);
    		int indexI = -1;
			indexI = Integer.valueOf(index).intValue();
    		if(indexI!=-1) {
    			combo.setSelection(indexI);
    		}
    	}

	@RobotKeyword("Set the selection text in the combo \n\n"
            + "Example:\n"
            + "| Set Selection Text In Combo | text |\n")
    @ArgumentNames({"text"})
        public void setSelectionTextInCombo(String text) throws SWTBotBridgeException {
    		SWTBotCombo combo = (SWTBotCombo)Context.getCurrentWidget(SWTBotCombo.class);
    		if(text!=null && text.length()>0) {
    			combo.setSelection(text);
    		}
    	}

	@RobotKeyword("Set the text of the combo \n\n"
            + "Example:\n"
            + "| Set Combo Text|\n")
    @ArgumentNames({"text"})
        public void setComboText(String text) throws SWTBotBridgeException {
    		SWTBotCombo combo = (SWTBotCombo)Context.getCurrentWidget(SWTBotCombo.class);
    		if(text!=null && text.length()>0) {
    			combo.setText(text);
    		}
    	}

	/* TODO : keyboard layout for text typing
	@RobotKeyword("Type the text of the combo with optional interval between consecutives stroke\n\n"
            + "Example:\n"
            + "| Type Combo Text | text | 10 \n")
    @ArgumentNames({"text", "*interval"})
        public void typeComboText(String text, String... interval) throws SWTBotBridgeException {
    		SWTBotCombo combo = (SWTBotCombo)Context.getCurrentWidget(SWTBotCombo.class);
    		int intervalI = -1;
    		try {
    			intervalI = Integer.valueOf(interval[0]).intValue();
    		}
    		catch (Exception e) {
				// nothing to do
			}
    		
    		if(text!=null && text.length()>0) {
    			if(intervalI!=-1) {
    				combo.typeText(text, intervalI);
    			} else {
    				combo.typeText(text);
    			}
    		}
    	}
*/
	
	@RobotKeyword("Is the combo active\n\n"
            + "Example:\n"
            + "| Is Combo Active |\n")
        public boolean isComboActive() throws SWTBotBridgeException {
    		SWTBotCombo combo = (SWTBotCombo)Context.getCurrentWidget(SWTBotCombo.class);
    		return combo.isActive();
    	}

	@RobotKeyword("Is the combo enabled\n\n"
            + "Example:\n"
            + "| Is Combo Enabled |\n")
        public boolean isComboEnabled() throws SWTBotBridgeException {
    		SWTBotCombo combo = (SWTBotCombo)Context.getCurrentWidget(SWTBotCombo.class);
    		return combo.isEnabled();
    	}

	@RobotKeyword("Is the combo visible\n\n"
            + "Example:\n"
            + "| Is Combo Visible |\n")
        public boolean isComboVisible() throws SWTBotBridgeException {
    		SWTBotCombo combo = (SWTBotCombo)Context.getCurrentWidget(SWTBotCombo.class);
    		return combo.isVisible();
    	}

	@RobotKeyword("Get the text of the combo\n\n"
            + "Example:\n"
            + "| Get Combo Text |\n")
//    @ArgumentNames({"text"})
        public String getComboText() throws SWTBotBridgeException {
    		SWTBotCombo combo = (SWTBotCombo)Context.getCurrentWidget(SWTBotCombo.class);
    		return combo.getText();
    	}
	
	@RobotKeyword("Get the Id of the combo\n\n"
            + "Example:\n"
            + "| Get Combo Id |\n")
//    @ArgumentNames({"text"})
        public String getComboId() throws SWTBotBridgeException {
    		SWTBotCombo combo = (SWTBotCombo)Context.getCurrentWidget(SWTBotCombo.class);
    		return combo.getId();
    	}
	
	@RobotKeyword("Get the tooltip text of the combo\n\n"
            + "Example:\n"
            + "| Get Combo Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getComboTooltipText() throws SWTBotBridgeException {
    		SWTBotCombo combo = (SWTBotCombo)Context.getCurrentWidget(SWTBotCombo.class);
    		return combo.getToolTipText();
    	}
}