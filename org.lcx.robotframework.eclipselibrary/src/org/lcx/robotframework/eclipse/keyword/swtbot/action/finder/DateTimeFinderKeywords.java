package org.lcx.robotframework.eclipse.keyword.swtbot.action.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class DateTimeFinderKeywords {

	
	@RobotKeyword("Find the dateTime with the given optionals index\n\n"
            + "Example:\n"
            + "| Find DateTime | index |  |\n"
            + "| Find DateTime | |  |\n")
    @ArgumentNames({"*params"})
    public SWTBotDateTime findDateTime(String... params) throws SWTBotBridgeException{
		
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
			return bot.dateTime(index);
		} else {
			return bot.dateTime();
		}
	}
	
	@RobotKeyword("Find the dateTime in the given group with optionals index\n\n"
            + "Example:\n"
            + "| Find DateTime In Group | group | index | |\n"
            + "| Find DateTime In Group | group | |  |\n")
    @ArgumentNames({"group", "*params"})
    public SWTBotDateTime findDateTimeInGroup(String group, String... params) throws SWTBotBridgeException{
		
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
			return bot.dateTimeInGroup(group, index);
		} else {
			return bot.dateTimeInGroup(group);
		}
	}

	@RobotKeyword("Find the dateTime with the given value and optionals key and index\n\n"
            + "Examples:\n"
            + "| Find DateTime With Id | value | key | index |\n"
            + "| Find DateTime With Id | value | index | |\n"
            + "| Find DateTime With Id | value | key | |\n"
            + "| Find DateTime With Id | value | | |\n")
    @ArgumentNames({"value", "*params"})
    public SWTBotDateTime findDateTimeWithId(String value, String... params) throws SWTBotBridgeException{
		
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
			return bot.dateTimeWithId(value, key, index);
		} else if(key!=null && index==-1) {
			return bot.dateTimeWithId(value, key);
		} else if (key==null && index!=-1) {
			return bot.dateTimeWithId(value, index);
		} else {
			return bot.dateTimeWithId(value);
		}
	}
    
	@RobotKeyword("Find the dateTime with the given label and optional index\n\n"
            + "Examples:\n"
            + "| Find DateTime With Label | label | index |\n"
            + "| Find DateTime With Label | label | |\n")
    @ArgumentNames({"label", "*index"})
    public SWTBotDateTime findDateTimeWithLabel(String label, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.dateTimeWithLabel(label, indexI);
		} else {
			return bot.dateTimeWithLabel(label);
		}
	}
    
	@RobotKeyword("Find the dateTime with the given label and group and optional index\n\n"
            + "Examples:\n"
            + "| Find DateTime With Label In Group | label | group | index |\n"
            + "| Find DateTime With Label In Group | label | group | |\n")
    @ArgumentNames({"label", "group", "*index"})
   	public SWTBotDateTime findDateTimeWithLabelInGroup(String label, String group,  String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.dateTimeWithLabelInGroup(label, group, indexI);
		} else {
			return bot.dateTimeWithLabelInGroup(label, group);
		}
	}

}