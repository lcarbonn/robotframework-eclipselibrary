/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class TabItemFinderKeywords {

	
	@RobotKeyword("Find the tabItem with the given optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find TabItem | mnemonicText | index |\n"
            + "| Find TabItem | mnemonicText |  |\n"
            + "| Find TabItem | index |  |\n"
            + "| Find TabItem | |  |\n")
    @ArgumentNames({"*params"})
    public SWTBotTabItem findTabItem(String... params) throws SWTBotBridgeException{
		
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
			return bot.tabItem(mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.tabItem(mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.tabItem(index);
		} else {
			return bot.tabItem();
		}
	}
	
	@RobotKeyword("Find the tabItem in the given group with optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find TabItem In Group | group | mnemonicText | index |\n"
            + "| Find TabItem In Group | group | mnemonicText | |\n"
            + "| Find TabItem In Group | group | index | |\n"
            + "| Find TabItem In Group | group | |  |\n")
    @ArgumentNames({"group", "*params"})
    public SWTBotTabItem findTabItemInGroup(String group, String... params) throws SWTBotBridgeException{
		
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
			return bot.tabItemInGroup(group, mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.tabItemInGroup(group, mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.tabItemInGroup(group, index);
		} else {
			return bot.tabItemInGroup(group);
		}
	}

	@RobotKeyword("Find the tabItem with the given value and optionals key and index\n\n"
            + "Examples:\n"
            + "| Find TabItem With Id | value | key | index |\n"
            + "| Find TabItem With Id | value | index | |\n"
            + "| Find TabItem With Id | value | key | |\n"
            + "| Find TabItem With Id | value | | |\n")
    @ArgumentNames({"value", "*params"})
    public SWTBotTabItem findTabItemWithId(String value, String... params) throws SWTBotBridgeException{
		
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
			return bot.tabItemWithId(value, key, index);
		} else if(key!=null && index==-1) {
			return bot.tabItemWithId(value, key);
		} else if (key==null && index!=-1) {
			return bot.tabItemWithId(value, index);
		} else {
			return bot.tabItemWithId(value);
		}
	}
    
}