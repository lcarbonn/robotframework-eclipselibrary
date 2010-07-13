package org.lcx.robotframework.eclipse.keyword.swtbot.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class StyledTextFinderKeywords {

	
	@RobotKeyword("Find the styleText with the given optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find StyledText | mnemonicText | index |\n"
            + "| Find StyledText | mnemonicText |  |\n"
            + "| Find StyledText | index |  |\n"
            + "| Find StyledText | |  |\n")
    @ArgumentNames({"*params"})
    public SWTBotStyledText findStyledText(String... params) throws SWTBotBridgeException{
		
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
			return bot.styledText(mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.styledText(mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.styledText(index);
		} else {
			return bot.styledText();
		}
	}
	
	@RobotKeyword("Find the styledText in the given group with optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find StyledText In Group | group | mnemonicText | index |\n"
            + "| Find StyledText In Group | group | mnemonicText | |\n"
            + "| Find StyledText In Group | group | index | |\n"
            + "| Find StyledText In Group | group | |  |\n")
    @ArgumentNames({"group", "*params"})
    public SWTBotStyledText findStyledTextInGroup(String group, String... params) throws SWTBotBridgeException{
		
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
			return bot.styledTextInGroup(group, mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.styledTextInGroup(group, mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.styledTextInGroup(group, index);
		} else {
			return bot.styledTextInGroup(group);
		}
	}

	@RobotKeyword("Find the styledText with the given value and optionals key and index\n\n"
            + "Examples:\n"
            + "| Find StyledText With Id | value | key | index |\n"
            + "| Find StyledText With Id | value | index | |\n"
            + "| Find StyledText With Id | value | key | |\n"
            + "| Find StyledText With Id | value | | |\n")
    @ArgumentNames({"value", "*params"})
    public SWTBotStyledText findStyledTextWithId(String value, String... params) throws SWTBotBridgeException{
		
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
			return bot.styledTextWithId(value, key, index);
		} else if(key!=null && index==-1) {
			return bot.styledTextWithId(value, key);
		} else if (key==null && index!=-1) {
			return bot.styledTextWithId(value, index);
		} else {
			return bot.styledTextWithId(value);
		}
	}
    
	@RobotKeyword("Find the styledText with the given label and optional index\n\n"
            + "Examples:\n"
            + "| Find StyledText With Label | label | index |\n"
            + "| Find StyledText With Label | label | |\n")
    @ArgumentNames({"label", "*index"})
    public SWTBotStyledText findStyledTextWithLabel(String label, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.styledTextWithLabel(label, indexI);
		} else {
			return bot.styledTextWithLabel(label);
		}
	}
    
	@RobotKeyword("Find the styledText with the given label and group and optional index\n\n"
            + "Examples:\n"
            + "| Find StyledText With Label In Group | label | group | index |\n"
            + "| Find StyledText With Label In Group | label | group | |\n")
    @ArgumentNames({"label", "group", "*index"})
   	public SWTBotStyledText findStyledTextWithLabelInGroup(String label, String group,  String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.styledTextWithLabelInGroup(label, group, indexI);
		} else {
			return bot.styledTextWithLabelInGroup(label, group);
		}
	}

}