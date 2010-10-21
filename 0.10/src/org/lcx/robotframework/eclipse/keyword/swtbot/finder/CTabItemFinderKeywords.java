/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class CTabItemFinderKeywords {

	
	@RobotKeyword("Find the cTabItem with the given optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find CTabItem | mnemonicText | index |\n"
            + "| Find CTabItem | mnemonicText |  |\n"
            + "| Find CTabItem | index |  |\n"
            + "| Find CTabItem | |  |\n")
    @ArgumentNames({"*params"})
    public SWTBotCTabItem findCTabItem(String... params) throws SWTBotBridgeException{
		
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
			return bot.cTabItem(mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.cTabItem(mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.cTabItem(index);
		} else {
			return bot.cTabItem();
		}
	}
	
	@RobotKeyword("Find the cTabItem in the given group with optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find CTabItem In Group | group | mnemonicText | index |\n"
            + "| Find CTabItem In Group | group | mnemonicText | |\n"
            + "| Find CTabItem In Group | group | index | |\n"
            + "| Find CTabItem In Group | group | |  |\n")
    @ArgumentNames({"group", "*params"})
    public SWTBotCTabItem findCTabItemInGroup(String group, String... params) throws SWTBotBridgeException{
		
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
			return bot.cTabItemInGroup(group, mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.cTabItemInGroup(group, mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.cTabItemInGroup(group, index);
		} else {
			return bot.cTabItemInGroup(group);
		}
	}

	@RobotKeyword("Find the cTabItem with the given value and optionals key and index\n\n"
            + "Examples:\n"
            + "| Find CTabItem With Id | value | key | index |\n"
            + "| Find CTabItem With Id | value | index | |\n"
            + "| Find CTabItem With Id | value | key | |\n"
            + "| Find CTabItem With Id | value | | |\n")
    @ArgumentNames({"value", "*params"})
    public SWTBotCTabItem findCTabItemWithId(String value, String... params) throws SWTBotBridgeException{
		
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
			return bot.cTabItemWithId(value, key, index);
		} else if(key!=null && index==-1) {
			return bot.cTabItemWithId(value, key);
		} else if (key==null && index!=-1) {
			return bot.cTabItemWithId(value, index);
		} else {
			return bot.cTabItemWithId(value);
		}
	}
    
}