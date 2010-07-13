package org.lcx.robotframework.eclipse.keyword.swtbot.finderfact;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ShellFinderKeywords {

	
	@RobotKeyword("Find the shell with the given text and optional index\n\n"
            + "Example:\n"
            + "| Find Shell | text | index |\n"
            + "| Find Shell | text |  |\n")
    @ArgumentNames({"text", "*params"})
    public SWTBotShell findShell(String text, String... params) throws SWTBotBridgeException{
		
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
			return bot.shell(text, index);
		} else {
			return bot.shell(text);
		}
	}
	
	@RobotKeyword("Find the shell with the given value and optionals key and index\n\n"
            + "Examples:\n"
            + "| Find Shell With Id | value | key | index |\n"
            + "| Find Shell With Id | value | index | |\n"
            + "| Find Shell With Id | value | key | |\n"
            + "| Find Shell With Id | value | | |\n")
    @ArgumentNames({"value", "*params"})
    public SWTBotShell findShellWithId(String value, String... params) throws SWTBotBridgeException{
		
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
			return bot.shellWithId(value, key, index);
		} else if(key!=null && index==-1) {
			return bot.shellWithId(value, key);
		} else if (key==null && index!=-1) {
			return bot.shellWithId(value, index);
		} else {
			return bot.shellWithId(value);
		}
	}
    
}