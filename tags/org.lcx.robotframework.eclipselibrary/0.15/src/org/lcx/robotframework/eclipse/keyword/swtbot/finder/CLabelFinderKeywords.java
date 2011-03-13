/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class CLabelFinderKeywords {

	
	@RobotKeyword("Find the clabel with the given optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find CLabel | mnemonicText | index |\n"
            + "| Find CLabel | mnemonicText |  |\n"
            + "| Find CLabel | index |  |\n"
            + "| Find CLabel | |  |\n")
    @ArgumentNames({"*params"})
    public SWTBotCLabel findCLabel(String... params) throws SWTBotBridgeException{
		
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
			return bot.clabel(mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.clabel(mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.clabel(index);
		} else {
			return bot.clabel();
		}
	}
	
	@RobotKeyword("Find the clabel in the given group with optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find CLabel In Group | group | mnemonicText | index |\n"
            + "| Find CLabel In Group | group | mnemonicText | |\n"
            + "| Find CLabel In Group | group | index | |\n"
            + "| Find CLabel In Group | group | |  |\n")
    @ArgumentNames({"group", "*params"})
    public SWTBotCLabel findCLabelInGroup(String group, String... params) throws SWTBotBridgeException{
		
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
			return bot.clabelInGroup(group, mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.clabelInGroup(group, mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.clabelInGroup(group, index);
		} else {
			return bot.clabelInGroup(group);
		}
	}

	@RobotKeyword("Find the clabel with the given value and optionals key and index\n\n"
            + "Examples:\n"
            + "| Find CLabel With Id | value | key | index |\n"
            + "| Find CLabel With Id | value | index | |\n"
            + "| Find CLabel With Id | value | key | |\n"
            + "| Find CLabel With Id | value | | |\n")
    @ArgumentNames({"value", "*params"})
    public SWTBotCLabel findCLabelWithId(String value, String... params) throws SWTBotBridgeException{
		
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
			return bot.clabelWithId(value, key, index);
		} else if(key!=null && index==-1) {
			return bot.clabelWithId(value, key);
		} else if (key==null && index!=-1) {
			return bot.clabelWithId(value, index);
		} else {
			return bot.clabelWithId(value);
		}
	}
    
}