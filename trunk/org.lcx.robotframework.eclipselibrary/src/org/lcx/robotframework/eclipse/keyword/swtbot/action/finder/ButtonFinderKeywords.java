package org.lcx.robotframework.eclipse.keyword.swtbot.action.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ButtonFinderKeywords {

	
	@RobotKeyword("Find the button with the given optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find Button | mnemonicText | index |\n"
            + "| Find Button | mnemonicText |  |\n"
            + "| Find Button | index |  |\n"
            + "| Find Button | |  |\n")
    @ArgumentNames({"*params"})
    public SWTBotButton findButton(String... params) throws SWTBotBridgeException{
		
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
			return bot.button(mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.button(mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.button(index);
		} else {
			return bot.button();
		}
	}
	
	@RobotKeyword("Find the button in the given group with optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find Button In Group | group | mnemonicText | index |\n"
            + "| Find Button In Group | group | mnemonicText | |\n"
            + "| Find Button In Group | group | index | |\n"
            + "| Find Button In Group | group | |  |\n")
    @ArgumentNames({"group", "*params"})
    public SWTBotButton findButtonInGroup(String group, String... params) throws SWTBotBridgeException{
		
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
			return bot.buttonInGroup(group, mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.buttonInGroup(group, mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.buttonInGroup(group, index);
		} else {
			return bot.buttonInGroup(group);
		}
	}

	@RobotKeyword("Find the button with the given value and optionals key and index\n\n"
            + "Examples:\n"
            + "| Find Button With Id | value | key | index |\n"
            + "| Find Button With Id | value | index | |\n"
            + "| Find Button With Id | value | key | |\n"
            + "| Find Button With Id | value | | |\n")
    @ArgumentNames({"value", "*params"})
    public SWTBotButton findButtonWithId(String value, String... params) throws SWTBotBridgeException{
		
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
			return bot.buttonWithId(value, key, index);
		} else if(key!=null && index==-1) {
			return bot.buttonWithId(value, key);
		} else if (key==null && index!=-1) {
			return bot.buttonWithId(value, index);
		} else {
			return bot.buttonWithId(value);
		}
	}
    
	@RobotKeyword("Find the button with the given label and optional index\n\n"
            + "Examples:\n"
            + "| Find Button With Label | label | index |\n"
            + "| Find Button With Label | label | |\n")
    @ArgumentNames({"label", "*index"})
    public SWTBotButton findButtonWithLabel(String label, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.buttonWithLabel(label, indexI);
		} else {
			return bot.buttonWithLabel(label);
		}
	}
    
	@RobotKeyword("Find the button with the given label and group and optional index\n\n"
            + "Examples:\n"
            + "| Find Button With Label In Group | label | group | index |\n"
            + "| Find Button With Label In Group | label | group | |\n")
    @ArgumentNames({"label", "group", "*index"})
   	public SWTBotButton findButtonWithLabelInGroup(String label, String group,  String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.buttonWithLabelInGroup(label, group, indexI);
		} else {
			return bot.buttonWithLabelInGroup(label, group);
		}
	}

	@RobotKeyword("Find the button with the given tooltip and optional index\n\n"
            + "Examples:\n"
            + "| Find Button With Tooltip | tooltip | index |\n")
    @ArgumentNames({"tooltip", "*index"})
	public SWTBotButton findButtonWithTooltip(String tooltip, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.buttonWithTooltip(tooltip, indexI);
		} else {
			return bot.buttonWithTooltip(tooltip);
		}
	}
    
   	
	@RobotKeyword("Find the button with the given tooltip and group and optional index\n\n"
            + "Examples:\n"
            + "| Find Button With Tooltip In Group | tooltip | group | index | \n"
            + "| Find Button With Tooltip In Group | tooltip | group | | \n")
    @ArgumentNames({"tooltip", "group", "*index"})
    public SWTBotButton findButtonWithTooltipInGroup(String tooltip, String group,  String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.buttonWithTooltipInGroup(tooltip, group, indexI);
		} else {
			return bot.buttonWithTooltipInGroup(tooltip, group);
		}
	}
}