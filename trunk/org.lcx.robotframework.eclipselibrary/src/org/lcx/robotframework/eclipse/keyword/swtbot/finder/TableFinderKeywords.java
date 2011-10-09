/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class TableFinderKeywords {

	
	@RobotKeyword("Find the table with the given optional index\n\n"
            + "Example:\n"
            + "| Find Table | index |\n"
            + "| Find Table | |\n")
    @ArgumentNames({"*params"})
    public SWTBotTable findTable(String... params) throws SWTBotBridgeException{
		
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
			return bot.table(index);
		} else {
			return bot.table();
		}
	}
	
	@RobotKeyword("Find the table in the given group with optional and index\n\n"
            + "Example:\n"
            + "| Find Table In Group | group | index |\n"
            + "| Find Table In Group | group | |\n")
    @ArgumentNames({"group", "*params"})
    public SWTBotTable findTableInGroup(String group, String... params) throws SWTBotBridgeException{
		
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
			return bot.tableInGroup(group, index);
		} else {
			return bot.tableInGroup(group);
		}
	}

	@RobotKeyword("Find the table with the given value and optionals key and index\n\n"
            + "Examples:\n"
            + "| Find Table With Id | value | key | index |\n"
            + "| Find Table With Id | value | index | |\n"
            + "| Find Table With Id | value | key | |\n"
            + "| Find Table With Id | value | | |\n")
    @ArgumentNames({"value", "*params"})
    public SWTBotTable findTableWithId(String value, String... params) throws SWTBotBridgeException{
		
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
			return bot.tableWithId(value, key, index);
		} else if(key!=null && index==-1) {
			return bot.tableWithId(value, key);
		} else if (key==null && index!=-1) {
			return bot.tableWithId(value, index);
		} else {
			return bot.tableWithId(value);
		}
	}
    
	@RobotKeyword("Find the table with the given label and optional index\n\n"
            + "Examples:\n"
            + "| Find Table With Label | label | index |\n"
            + "| Find Table With Label | label | |\n")
    @ArgumentNames({"label", "*index"})
    public SWTBotTable findTableWithLabel(String label, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.tableWithLabel(label, indexI);
		} else {
			return bot.tableWithLabel(label);
		}
	}
    
	@RobotKeyword("Find the table with the given label and group and optional index\n\n"
            + "Examples:\n"
            + "| Find Table With Label In Group | label | group | index |\n"
            + "| Find Table With Label In Group | label | group | |\n")
    @ArgumentNames({"label", "group", "*index"})
   	public SWTBotTable findTableWithLabelInGroup(String label, String group,  String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.tableWithLabelInGroup(label, group, indexI);
		} else {
			return bot.tableWithLabelInGroup(label, group);
		}
	}

}