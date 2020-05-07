/*
 * Copyright 2010 L. Carbonnaux
 * 2020 Nebula Nattable extension by J. Beaumont 
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.nebula.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.nebula.nattable.finder.SWTNatTableBot;
import org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class NatTableFinderKeywords {

	
	@RobotKeyword("Find the NatTable with the given optional index\n\n"
            + "Example:\n"
            + "| Find NatTable | index |\n"
            + "| Find NatTable | |\n")
    @ArgumentNames({"*params"})
    public SWTBotNatTable findNattable(String... params) throws SWTBotBridgeException{
		
    	int index = -1;
    	
    	int nbParam = params.length;
    	if (nbParam==1) {
    		try {
    			index = Integer.valueOf(params[0]).intValue();
			} catch (NumberFormatException e) {
				// param is not numeric, so considered as mnemonic
			}
    	}
		
    	SWTNatTableBot bot = SWTNatTableBot.getSWTNatTableBot();
		if(index!=-1) {
			return bot.nattable(index);
		} else {
			return bot.nattable();
		}
	}
	
	@RobotKeyword("Find the nattable in the given group with optional and index\n\n"
            + "Example:\n"
            + "| Find Nattable In Group | group | index |\n"
            + "| Find Nattable In Group | group | |\n")
    @ArgumentNames({"group", "*params"})
    public SWTBotNatTable findNattableInGroup(String group, String... params) throws SWTBotBridgeException{
		
    	int index = -1;
    	
    	int nbParam = params.length;
    	if (nbParam==1) {
    		try {
    			index = Integer.valueOf(params[0]).intValue();
			} catch (NumberFormatException e) {
				// param is not numeric, so considered as mnemonic
			}
    	}
    	SWTNatTableBot bot = SWTNatTableBot.getSWTNatTableBot();
		if(index!=-1) {
			return bot.nattableInGroup(group, index);
		} else {
			return bot.nattableInGroup(group);
		}
	}

	@RobotKeyword("Find the nattable with the given value and optionals key and index\n\n"
            + "Examples:\n"
            + "| Find Nattable With Id | value | key | index |\n"
            + "| Find Nattable With Id | value | index | |\n"
            + "| Find Nattable With Id | value | key | |\n"
            + "| Find Nattable With Id | value | | |\n")
    @ArgumentNames({"value", "*params"})
    public SWTBotNatTable findNattableWithId(String value, String... params) throws SWTBotBridgeException{
		
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
		
    	SWTNatTableBot bot = SWTNatTableBot.getSWTNatTableBot();
		if(key!=null && index != -1) {
			return bot.nattableWithId(value, key, index);
		} else if(key!=null && index==-1) {
			return bot.nattableWithId(value, key);
		} else if (key==null && index!=-1) {
			return bot.nattableWithId(value, index);
		} else {
			return bot.nattableWithId(value);
		}
	}
    
	@RobotKeyword("Find the nattable with the given label and optional index\n\n"
            + "Examples:\n"
            + "| Find Nattable With Label | label | index |\n"
            + "| Find Nattable With Label | label | |\n")
    @ArgumentNames({"label", "*index"})
    public SWTBotNatTable findNattableWithLabel(String label, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTNatTableBot bot = SWTNatTableBot.getSWTNatTableBot();
		if(indexI != -1) {
			return bot.nattableWithLabel(label, indexI);
		} else {
			return bot.nattableWithLabel(label);
		}
	}
    
	@RobotKeyword("Find the nattable with the given label and group and optional index\n\n"
            + "Examples:\n"
            + "| Find Nattable With Label In Group | label | group | index |\n"
            + "| Find Nattable With Label In Group | label | group | |\n")
    @ArgumentNames({"label", "group", "*index"})
   	public SWTBotNatTable findNattableWithLabelInGroup(String label, String group,  String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTNatTableBot bot = SWTNatTableBot.getSWTNatTableBot();
		if(indexI != -1) {
			return bot.nattableWithLabelInGroup(label, group, indexI);
		} else {
			return bot.nattableWithLabelInGroup(label, group);
		}
	}

}