package org.lcx.robotframework.eclipse.keyword.swtbot.action.finderfact;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class MenuFinderKeywords {

	
	@RobotKeyword("Find the menu with the given text and optional index\n\n"
            + "Example:\n"
            + "| Find Menu | text | index |\n"
            + "| Find Menu | text |  |\n")
    @ArgumentNames({"text", "*params"})
    public SWTBotMenu findMenu(String text, String... params) throws SWTBotBridgeException{
		
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
			return bot.menu(text, index);
		} else {
			return bot.menu(text);
		}
	}
	
	@RobotKeyword("Find the menu with the given value and optionals key and index\n\n"
            + "Examples:\n"
            + "| Find Menu With Id | value | key | index |\n"
            + "| Find Menu With Id | value | index | |\n"
            + "| Find Menu With Id | value | key | |\n"
            + "| Find Menu With Id | value | | |\n")
    @ArgumentNames({"value", "*params"})
    public SWTBotMenu findMenuWithId(String value, String... params) throws SWTBotBridgeException{
		
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
			return bot.menuWithId(value, key, index);
		} else if(key!=null && index==-1) {
			return bot.menuWithId(value, key);
		} else if (key==null && index!=-1) {
			return bot.menuWithId(value, index);
		} else {
			return bot.menuWithId(value);
		}
	}
    
}