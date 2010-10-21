/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ComboBoxFinderKeywords {

	
	@RobotKeyword("Find the combo with the given optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find Combo | mnemonicText | index |\n"
            + "| Find Combo | mnemonicText |  |\n"
            + "| Find Combo | index |  |\n"
            + "| Find Combo | |  |\n")
    @ArgumentNames({"*params"})
    public SWTBotCombo findCombo(String... params) throws SWTBotBridgeException{
		
    	String mnemonicText = null;
    	int index = -1;
    	
    	int nbParam = params.length;
    	if (nbParam==1) {
    		try {
    			index = Integer.valueOf(params[0]).intValue();
			} catch (NumberFormatException e) {
				// param is not numeric, so considered as mnemonic
				mnemonicText = params[0];
			}
    	}
    	if(nbParam==2) {
			mnemonicText = params[0];
    		try {
    			index = Integer.valueOf(params[1]).intValue();
			} catch (NumberFormatException e) {
				// nothing to do
			}
    	}
		
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(mnemonicText!=null && index != -1) {
			return bot.comboBox(mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.comboBox(mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.comboBox(index);
		} else {
			return bot.comboBox();
		}
	}
	
	@RobotKeyword("Find the combo in the given group with optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find Combo In Group | group | mnemonicText | index |\n"
            + "| Find Combo In Group | group | mnemonicText | |\n"
            + "| Find Combo In Group | group | index | |\n"
            + "| Find Combo In Group | group | |  |\n")
    @ArgumentNames({"group", "*params"})
    public SWTBotCombo findComboInGroup(String group, String... params) throws SWTBotBridgeException{
		
    	String mnemonicText = null;
    	int index = -1;
    	
    	int nbParam = params.length;
    	if (nbParam==1) {
    		try {
    			index = Integer.valueOf(params[0]).intValue();
			} catch (NumberFormatException e) {
				// param is not numeric, so considered as mnemonic
				mnemonicText = params[0];
			}
    	}
    	if(nbParam==2) {
			mnemonicText = params[0];
    		try {
    			index = Integer.valueOf(params[1]).intValue();
			} catch (NumberFormatException e) {
				// nothing to do
			}
    	}
		
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(mnemonicText!=null && index != -1) {
			return bot.comboBoxInGroup(group, mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.comboBoxInGroup(group, mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.comboBoxInGroup(group, index);
		} else {
			return bot.comboBoxInGroup(group);
		}
	}

	@RobotKeyword("Find the combo with the given value and optionals key and index\n\n"
            + "Examples:\n"
            + "| Find Combo With Id | value | key | index |\n"
            + "| Find Combo With Id | value | index | |\n"
            + "| Find Combo With Id | value | key | |\n"
            + "| Find Combo With Id | value | | |\n")
    @ArgumentNames({"value", "*params"})
    public SWTBotCombo findComboWithId(String value, String... params) throws SWTBotBridgeException{
		
    	String key = null;
    	int index = -1;
    	
    	int nbParam = params.length;
    	if (nbParam==1) {
    		try {
    			index = Integer.valueOf(params[0]).intValue();
			} catch (NumberFormatException e) {
				// param is not numeric, so considered as mnemonic
				key = params[0];
			}
    	}
    	if(nbParam==2) {
			key = params[0];
    		try {
    			index = Integer.valueOf(params[1]).intValue();
			} catch (NumberFormatException e) {
				// nothing to do
			}
    	}
		
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(key!=null && index != -1) {
			return bot.comboBoxWithId(value, key, index);
		} else if(key!=null && index==-1) {
			return bot.comboBoxWithId(value, key);
		} else if (key==null && index!=-1) {
			return bot.comboBoxWithId(value, index);
		} else {
			return bot.comboBoxWithId(value);
		}
	}
    
	@RobotKeyword("Find the combo with the given label and optional index\n\n"
            + "Examples:\n"
            + "| Find Combo With Label | label | index |\n"
            + "| Find Combo With Label | label | |\n")
    @ArgumentNames({"label", "*index"})
    public SWTBotCombo findComboWithLabel(String label, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.comboBoxWithLabel(label, indexI);
		} else {
			return bot.comboBoxWithLabel(label);
		}
	}
    
	@RobotKeyword("Find the combo with the given label and group and optional index\n\n"
            + "Examples:\n"
            + "| Find Combo With Label In Group | label | group | index |\n"
            + "| Find Combo With Label In Group | label | group | |\n")
    @ArgumentNames({"label", "group", "*index"})
   	public SWTBotCombo findComboWithLabelInGroup(String label, String group,  String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.comboBoxWithLabelInGroup(label, group, indexI);
		} else {
			return bot.comboBoxWithLabelInGroup(label, group);
		}
	}

}