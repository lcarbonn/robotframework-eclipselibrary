/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class CheckBoxFinderKeywords {

	
	@RobotKeyword("Find the checkbox with the given optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find CheckBox | mnemonicText | index |\n"
            + "| Find CheckBox | mnemonicText |  |\n"
            + "| Find CheckBox | index |  |\n"
            + "| Find CheckBox | |  |\n")
    @ArgumentNames({"*params"})
    public SWTBotCheckBox findCheckBox(String... params) throws SWTBotBridgeException{
		
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
			return bot.checkBox(mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.checkBox(mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.checkBox(index);
		} else {
			return bot.checkBox();
		}
	}
	
	@RobotKeyword("Find the checkbox in the given group with optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find CheckBox In Group | group | mnemonicText | index |\n"
            + "| Find CheckBox In Group | group | mnemonicText | |\n"
            + "| Find CheckBox In Group | group | index | |\n"
            + "| Find CheckBox In Group | group | |  |\n")
    @ArgumentNames({"group", "*params"})
    public SWTBotCheckBox findCheckBoxInGroup(String group, String... params) throws SWTBotBridgeException{
		
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
			return bot.checkBoxInGroup(group, mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.checkBoxInGroup(group, mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.checkBoxInGroup(group, index);
		} else {
			return bot.checkBoxInGroup(group);
		}
	}

	@RobotKeyword("Find the checkbox with the given value and optionals key and index\n\n"
            + "Examples:\n"
            + "| Find CheckBox With Id | value | key | index |\n"
            + "| Find CheckBox With Id | value | index | |\n"
            + "| Find CheckBox With Id | value | key | |\n"
            + "| Find CheckBox With Id | value | | |\n")
    @ArgumentNames({"value", "*params"})
    public SWTBotCheckBox findCheckBoxWithId(String value, String... params) throws SWTBotBridgeException{
		
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
			return bot.checkBoxWithId(value, key, index);
		} else if(key!=null && index==-1) {
			return bot.checkBoxWithId(value, key);
		} else if (key==null && index!=-1) {
			return bot.checkBoxWithId(value, index);
		} else {
			return bot.checkBoxWithId(value);
		}
	}
    
	@RobotKeyword("Find the checkbox with the given label and optional index\n\n"
            + "Examples:\n"
            + "| Find CheckBox With Label | label | index |\n"
            + "| Find CheckBox With Label | label | |\n")
    @ArgumentNames({"label", "*index"})
    public SWTBotCheckBox findCheckBoxWithLabel(String label, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.checkBoxWithLabel(label, indexI);
		} else {
			return bot.checkBoxWithLabel(label);
		}
	}
    
	@RobotKeyword("Find the checkbox with the given label and group and optional index\n\n"
            + "Examples:\n"
            + "| Find CheckBox With Label In Group | label | group | index |\n"
            + "| Find CheckBox With Label In Group | label | group | |\n")
    @ArgumentNames({"label", "group", "*index"})
   	public SWTBotCheckBox findCheckBoxWithLabelInGroup(String label, String group,  String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.checkBoxWithLabelInGroup(label, group, indexI);
		} else {
			return bot.checkBoxWithLabelInGroup(label, group);
		}
	}

	@RobotKeyword("Find the checkbox with the given tooltip and optional index\n\n"
            + "Examples:\n"
            + "| Find CheckBox With Tooltip | tooltip | index |\n")
    @ArgumentNames({"tooltip", "*index"})
	public SWTBotCheckBox findCheckBoxWithTooltip(String tooltip, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.checkBoxWithTooltip(tooltip, indexI);
		} else {
			return bot.checkBoxWithTooltip(tooltip);
		}
	}
    
   	
	@RobotKeyword("Find the checkbox with the given tooltip and group and optional index\n\n"
            + "Examples:\n"
            + "| Find CheckBox With Tooltip In Group | tooltip | group | index | \n"
            + "| Find CheckBox With Tooltip In Group | tooltip | group | | \n")
    @ArgumentNames({"tooltip", "group", "*index"})
    public SWTBotCheckBox findCheckBoxWithTooltipInGroup(String tooltip, String group,  String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.checkBoxWithTooltipInGroup(tooltip, group, indexI);
		} else {
			return bot.checkBoxWithTooltipInGroup(tooltip, group);
		}
	}
}