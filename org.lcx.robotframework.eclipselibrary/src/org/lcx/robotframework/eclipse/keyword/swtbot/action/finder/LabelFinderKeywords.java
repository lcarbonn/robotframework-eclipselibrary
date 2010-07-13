package org.lcx.robotframework.eclipse.keyword.swtbot.action.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class LabelFinderKeywords {

	
	@RobotKeyword("Find the label with the given optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find Label | mnemonicText | index |\n"
            + "| Find Label | mnemonicText |  |\n"
            + "| Find Label | index |  |\n"
            + "| Find Label | |  |\n")
    @ArgumentNames({"*params"})
    public SWTBotLabel findLabel(String... params) throws SWTBotBridgeException{
		
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
			return bot.label(mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.label(mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.label(index);
		} else {
			return bot.label();
		}
	}
	
	@RobotKeyword("Find the label in the given group with optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find Label In Group | group | mnemonicText | index |\n"
            + "| Find Label In Group | group | mnemonicText | |\n"
            + "| Find Label In Group | group | index | |\n"
            + "| Find Label In Group | group | |  |\n")
    @ArgumentNames({"group", "*params"})
    public SWTBotLabel findLabelInGroup(String group, String... params) throws SWTBotBridgeException{
		
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
			return bot.labelInGroup(group, mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.labelInGroup(group, mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.labelInGroup(group, index);
		} else {
			return bot.labelInGroup(group);
		}
	}

	@RobotKeyword("Find the label with the given value and optionals key and index\n\n"
            + "Examples:\n"
            + "| Find Label With Id | value | key | index |\n"
            + "| Find Label With Id | value | index | |\n"
            + "| Find Label With Id | value | key | |\n"
            + "| Find Label With Id | value | | |\n")
    @ArgumentNames({"value", "*params"})
    public SWTBotLabel findLabelWithId(String value, String... params) throws SWTBotBridgeException{
		
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
			return bot.labelWithId(value, key, index);
		} else if(key!=null && index==-1) {
			return bot.labelWithId(value, key);
		} else if (key==null && index!=-1) {
			return bot.labelWithId(value, index);
		} else {
			return bot.labelWithId(value);
		}
	}
    
}