/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class TreeFinderKeywords {

	
	@RobotKeyword("Find the tree with the given optional index\n\n"
            + "Example:\n"
            + "| Find Tree | index |  |\n"
            + "| Find Tree | |  |\n")
    @ArgumentNames({"*params"})
    public SWTBotTree findTree(String... params) throws SWTBotBridgeException{
		
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
			return bot.tree(index);
		} else {
			return bot.tree();
		}
	}
	
	@RobotKeyword("Find the tree in the given group with optional and index\n\n"
            + "Example:\n"
            + "| Find Tree In Group | group | index | |\n"
            + "| Find Tree In Group | group | |  |\n")
    @ArgumentNames({"group", "*params"})
    public SWTBotTree findTreeInGroup(String group, String... params) throws SWTBotBridgeException{
		
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
			return bot.treeInGroup(group, index);
		} else {
			return bot.treeInGroup(group);
		}
	}

	@RobotKeyword("Find the tree with the given value and optionals key and index\n\n"
            + "Examples:\n"
            + "| Find Tree With Id | value | key | index |\n"
            + "| Find Tree With Id | value | index | |\n"
            + "| Find Tree With Id | value | key | |\n"
            + "| Find Tree With Id | value | | |\n")
    @ArgumentNames({"value", "*params"})
    public SWTBotTree findTreeWithId(String value, String... params) throws SWTBotBridgeException{
		
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
			return bot.treeWithId(value, key, index);
		} else if(key!=null && index==-1) {
			return bot.treeWithId(value, key);
		} else if (key==null && index!=-1) {
			return bot.treeWithId(value, index);
		} else {
			return bot.treeWithId(value);
		}
	}
    
	@RobotKeyword("Find the tree with the given label and optional index\n\n"
            + "Examples:\n"
            + "| Find Tree With Label | label | index |\n"
            + "| Find Tree With Label | label | |\n")
    @ArgumentNames({"label", "*index"})
    public SWTBotTree findTreeWithLabel(String label, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.treeWithLabel(label, indexI);
		} else {
			return bot.treeWithLabel(label);
		}
	}
    
	@RobotKeyword("Find the tree with the given label and group and optional index\n\n"
            + "Examples:\n"
            + "| Find Tree With Label In Group | label | group | index |\n"
            + "| Find Tree With Label In Group | label | group | |\n")
    @ArgumentNames({"label", "group", "*index"})
   	public SWTBotTree findTreeWithLabelInGroup(String label, String group,  String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.treeWithLabelInGroup(label, group, indexI);
		} else {
			return bot.treeWithLabelInGroup(label, group);
		}
	}

}