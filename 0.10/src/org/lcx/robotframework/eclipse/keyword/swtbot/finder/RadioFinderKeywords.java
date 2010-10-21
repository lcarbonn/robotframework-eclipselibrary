/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class RadioFinderKeywords {

	
	@RobotKeyword("Find the radio with the given optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find Radio | mnemonicText | index |\n"
            + "| Find Radio | mnemonicText |  |\n"
            + "| Find Radio | index |  |\n"
            + "| Find Radio | |  |\n")
    @ArgumentNames({"*params"})
    public SWTBotRadio findRadio(String... params) throws SWTBotBridgeException{
		
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
			return bot.radio(mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.radio(mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.radio(index);
		} else {
			return bot.radio();
		}
	}
	
	@RobotKeyword("Find the radio in the given group with optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find Radio In Group | group | mnemonicText | index |\n"
            + "| Find Radio In Group | group | mnemonicText | |\n"
            + "| Find Radio In Group | group | index | |\n"
            + "| Find Radio In Group | group | |  |\n")
    @ArgumentNames({"group", "*params"})
    public SWTBotRadio findRadioInGroup(String group, String... params) throws SWTBotBridgeException{
		
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
			return bot.radioInGroup(group, mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.radioInGroup(group, mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.radioInGroup(group, index);
		} else {
			return bot.radioInGroup(group);
		}
	}

	@RobotKeyword("Find the radio with the given value and optionals key and index\n\n"
            + "Examples:\n"
            + "| Find Radio With Id | value | key | index |\n"
            + "| Find Radio With Id | value | index | |\n"
            + "| Find Radio With Id | value | key | |\n"
            + "| Find Radio With Id | value | | |\n")
    @ArgumentNames({"value", "*params"})
    public SWTBotRadio findRadioWithId(String value, String... params) throws SWTBotBridgeException{
		
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
			return bot.radioWithId(value, key, index);
		} else if(key!=null && index==-1) {
			return bot.radioWithId(value, key);
		} else if (key==null && index!=-1) {
			return bot.radioWithId(value, index);
		} else {
			return bot.radioWithId(value);
		}
	}
    
	@RobotKeyword("Find the radio with the given label and optional index\n\n"
            + "Examples:\n"
            + "| Find Radio With Label | label | index |\n"
            + "| Find Radio With Label | label | |\n")
    @ArgumentNames({"label", "*index"})
    public SWTBotRadio findRadioWithLabel(String label, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.radioWithLabel(label, indexI);
		} else {
			return bot.radioWithLabel(label);
		}
	}
    
	@RobotKeyword("Find the radio with the given label and group and optional index\n\n"
            + "Examples:\n"
            + "| Find Radio With Label In Group | label | group | index |\n"
            + "| Find Radio With Label In Group | label | group | |\n")
    @ArgumentNames({"label", "group", "*index"})
   	public SWTBotRadio findRadioWithLabelInGroup(String label, String group,  String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.radioWithLabelInGroup(label, group, indexI);
		} else {
			return bot.radioWithLabelInGroup(label, group);
		}
	}

	@RobotKeyword("Find the radio with the given tooltip and optional index\n\n"
            + "Examples:\n"
            + "| Find Radio With Tooltip | tooltip | index |\n")
    @ArgumentNames({"tooltip", "*index"})
	public SWTBotRadio findRadioWithTooltip(String tooltip, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.radioWithTooltip(tooltip, indexI);
		} else {
			return bot.radioWithTooltip(tooltip);
		}
	}
    
   	
	@RobotKeyword("Find the radio with the given tooltip and group and optional index\n\n"
            + "Examples:\n"
            + "| Find Radio With Tooltip In Group | tooltip | group | index | \n"
            + "| Find Radio With Tooltip In Group | tooltip | group | | \n")
    @ArgumentNames({"tooltip", "group", "*index"})
    public SWTBotRadio findRadioWithTooltipInGroup(String tooltip, String group,  String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.radioWithTooltipInGroup(tooltip, group, indexI);
		} else {
			return bot.radioWithTooltipInGroup(tooltip, group);
		}
	}
}