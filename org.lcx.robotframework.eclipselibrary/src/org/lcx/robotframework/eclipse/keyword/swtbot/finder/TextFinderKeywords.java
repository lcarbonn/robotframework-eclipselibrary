package org.lcx.robotframework.eclipse.keyword.swtbot.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class TextFinderKeywords {

	
	@RobotKeyword("Find the text with the given optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find Text | mnemonicText | index |\n"
            + "| Find Text | mnemonicText |  |\n"
            + "| Find Text | index |  |\n"
            + "| Find Text | |  |\n")
    @ArgumentNames({"*params"})
    public SWTBotText findText(String... params) throws SWTBotBridgeException{
		
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
			return bot.text(mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.text(mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.text(index);
		} else {
			return bot.text();
		}
	}
	
	@RobotKeyword("Find the text in the given group with optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find Text In Group | group | mnemonicText | index |\n"
            + "| Find Text In Group | group | mnemonicText | |\n"
            + "| Find Text In Group | group | index | |\n"
            + "| Find Text In Group | group | |  |\n")
    @ArgumentNames({"group", "*params"})
    public SWTBotText findTextInGroup(String group, String... params) throws SWTBotBridgeException{
		
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
			return bot.textInGroup(group, mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.textInGroup(group, mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.textInGroup(group, index);
		} else {
			return bot.textInGroup(group);
		}
	}

	@RobotKeyword("Find the text with the given value and optionals key and index\n\n"
            + "Examples:\n"
            + "| Find Text With Id | value | key | index |\n"
            + "| Find Text With Id | value | index | |\n"
            + "| Find Text With Id | value | key | |\n"
            + "| Find Text With Id | value | | |\n")
    @ArgumentNames({"value", "*params"})
    public SWTBotText findTextWithId(String value, String... params) throws SWTBotBridgeException{
		
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
			return bot.textWithId(value, key, index);
		} else if(key!=null && index==-1) {
			return bot.textWithId(value, key);
		} else if (key==null && index!=-1) {
			return bot.textWithId(value, index);
		} else {
			return bot.textWithId(value);
		}
	}
    
	@RobotKeyword("Find the text with the given label and optional index\n\n"
            + "Examples:\n"
            + "| Find Text With Label | label | index |\n"
            + "| Find Text With Label | label | |\n")
    @ArgumentNames({"label", "*index"})
    public SWTBotText findTextWithLabel(String label, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.textWithLabel(label, indexI);
		} else {
			return bot.textWithLabel(label);
		}
	}
    
	@RobotKeyword("Find the text with the given label and group and optional index\n\n"
            + "Examples:\n"
            + "| Find Text With Label In Group | label | group | index |\n"
            + "| Find Text With Label In Group | label | group | |\n")
    @ArgumentNames({"label", "group", "*index"})
   	public SWTBotText findTextWithLabelInGroup(String label, String group,  String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.textWithLabelInGroup(label, group, indexI);
		} else {
			return bot.textWithLabelInGroup(label, group);
		}
	}

	@RobotKeyword("Find the text with the given tooltip and optional index\n\n"
            + "Examples:\n"
            + "| Find Text With Tooltip | tooltip | index |\n")
    @ArgumentNames({"tooltip", "*index"})
	public SWTBotText findTextWithTooltip(String tooltip, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.textWithTooltip(tooltip, indexI);
		} else {
			return bot.textWithTooltip(tooltip);
		}
	}
    
   	
	@RobotKeyword("Find the text with the given tooltip and group and optional index\n\n"
            + "Examples:\n"
            + "| Find Text With Tooltip In Group | tooltip | group | index | \n"
            + "| Find Text With Tooltip In Group | tooltip | group | | \n")
    @ArgumentNames({"tooltip", "group", "*index"})
    public SWTBotText findTextWithTooltipInGroup(String tooltip, String group,  String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.textWithTooltipInGroup(tooltip, group, indexI);
		} else {
			return bot.textWithTooltipInGroup(tooltip, group);
		}
	}
}