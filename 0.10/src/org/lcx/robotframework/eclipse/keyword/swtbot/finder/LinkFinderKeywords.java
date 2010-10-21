/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class LinkFinderKeywords {

	
	@RobotKeyword("Find the link with the given optionals index\n\n"
            + "Example:\n"
            + "| Find Link | index |  |\n"
            + "| Find Link | |  |\n")
    @ArgumentNames({"*params"})
    public SWTBotLink findLink(String... params) throws SWTBotBridgeException{
		
    	int index = -1;
    	
    	int nbParam = params.length;
    	if (nbParam==1) {
    		try {
    			index = Integer.valueOf(params[0]).intValue();
			} catch (NumberFormatException e) {
				// param is not numeric, so considered as mnemonic
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	if (index!=-1) {
			return bot.link(index);
		} else {
			return bot.link();
		}
	}
	
	@RobotKeyword("Find the link in the given group with optionals index\n\n"
            + "Example:\n"
            + "| Find Link In Group | group | index | |\n"
            + "| Find Link In Group | group | |  |\n")
    @ArgumentNames({"group", "*params"})
    public SWTBotLink findLinkInGroup(String group, String... params) throws SWTBotBridgeException{
		
    	int index = -1;
    	
    	int nbParam = params.length;
    	if (nbParam==1) {
    		try {
    			index = Integer.valueOf(params[0]).intValue();
			} catch (NumberFormatException e) {
				// param is not numeric, so considered as mnemonic
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	if(index!=-1) {
			return bot.linkInGroup(group, index);
		} else {
			return bot.linkInGroup(group);
		}
	}

	@RobotKeyword("Find the link with the given value and optionals key and index\n\n"
            + "Examples:\n"
            + "| Find Link With Id | value | key | index |\n"
            + "| Find Link With Id | value | index | |\n"
            + "| Find Link With Id | value | key | |\n"
            + "| Find Link With Id | value | | |\n")
    @ArgumentNames({"value", "*params"})
    public SWTBotLink findLinkWithId(String value, String... params) throws SWTBotBridgeException{
		
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
			return bot.linkWithId(value, key, index);
		} else if(key!=null && index==-1) {
			return bot.linkWithId(value, key);
		} else if (key==null && index!=-1) {
			return bot.linkWithId(value, index);
		} else {
			return bot.linkWithId(value);
		}
	}
    

}