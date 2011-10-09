/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ListFinderKeywords {

	
	@RobotKeyword("Find the list with the given optional index\n\n"
            + "Example:\n"
            + "| Find List | index |\n"
            + "| Find List | |\n")
    @ArgumentNames({"*params"})
    public SWTBotList findList(String... params) throws SWTBotBridgeException{
		
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
			return bot.list(index);
		} else {
			return bot.list();
		}
	}
	
	@RobotKeyword("Find the list in the given group with optional index\n\n"
            + "Example:\n"
            + "| Find List In Group | group | index |\n"
            + "| Find List In Group | group | |\n")
    @ArgumentNames({"group", "*params"})
    public SWTBotList findListInGroup(String group, String... params) throws SWTBotBridgeException{
		
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
			return bot.listInGroup(group, index);
		} else {
			return bot.listInGroup(group);
		}
	}

	@RobotKeyword("Find the list with the given value and optionals key and index\n\n"
            + "Examples:\n"
            + "| Find List With Id | value | key | index |\n"
            + "| Find List With Id | value | index | |\n"
            + "| Find List With Id | value | key | |\n"
            + "| Find List With Id | value | | |\n")
    @ArgumentNames({"value", "*params"})
    public SWTBotList findListWithId(String value, String... params) throws SWTBotBridgeException{
		
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
			return bot.listWithId(value, key, index);
		} else if(key!=null && index==-1) {
			return bot.listWithId(value, key);
		} else if (key==null && index!=-1) {
			return bot.listWithId(value, index);
		} else {
			return bot.listWithId(value);
		}
	}
    
	@RobotKeyword("Find the list with the given label and optional index\n\n"
            + "Examples:\n"
            + "| Find List With Label | label | index |\n"
            + "| Find List With Label | label | |\n")
    @ArgumentNames({"label", "*index"})
    public SWTBotList findListWithLabel(String label, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.listWithLabel(label, indexI);
		} else {
			return bot.listWithLabel(label);
		}
	}
    
	@RobotKeyword("Find the list with the given label and group and optional index\n\n"
            + "Examples:\n"
            + "| Find List With Label In Group | label | group | index |\n"
            + "| Find List With Label In Group | label | group | |\n")
    @ArgumentNames({"label", "group", "*index"})
   	public SWTBotList findListWithLabelInGroup(String label, String group,  String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.listWithLabelInGroup(label, group, indexI);
		} else {
			return bot.listWithLabelInGroup(label, group);
		}
	}

}