package org.lcx.robotframework.eclipse.keyword.swtbot.action.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ToolbarRadioButtonFinderKeywords {

	
	@RobotKeyword("Find the toolbarRadioButton with the given optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find ToolbarRadioButton | mnemonicText | index |\n"
            + "| Find ToolbarRadioButton | mnemonicText |  |\n"
            + "| Find ToolbarRadioButton | index |  |\n"
            + "| Find ToolbarRadioButton | |  |\n")
    @ArgumentNames({"*params"})
    public SWTBotToolbarRadioButton findToolbarRadioButton(String... params) throws SWTBotBridgeException{
		
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
			return bot.toolbarRadioButton(mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.toolbarRadioButton(mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.toolbarRadioButton(index);
		} else {
			return bot.toolbarRadioButton();
		}
	}
	
	@RobotKeyword("Find the toolbarRadioButton in the given group with optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find ToolbarRadioButton In Group | group | mnemonicText | index |\n"
            + "| Find ToolbarRadioButton In Group | group | mnemonicText | |\n"
            + "| Find ToolbarRadioButton In Group | group | index | |\n"
            + "| Find ToolbarRadioButton In Group | group | |  |\n")
    @ArgumentNames({"group", "*params"})
    public SWTBotToolbarRadioButton findToolbarRadioButtonInGroup(String group, String... params) throws SWTBotBridgeException{
		
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
			return bot.toolbarRadioButtonInGroup(group, mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.toolbarRadioButtonInGroup(group, mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.toolbarRadioButtonInGroup(group, index);
		} else {
			return bot.toolbarRadioButtonInGroup(group);
		}
	}

	@RobotKeyword("Find the toolbarRadioButton with the given value and optionals key and index\n\n"
            + "Examples:\n"
            + "| Find ToolbarRadioButton With Id | value | key | index |\n"
            + "| Find ToolbarRadioButton With Id | value | index | |\n"
            + "| Find ToolbarRadioButton With Id | value | key | |\n"
            + "| Find ToolbarRadioButton With Id | value | | |\n")
    @ArgumentNames({"value", "*params"})
    public SWTBotToolbarRadioButton findToolbarRadioButtonWithId(String value, String... params) throws SWTBotBridgeException{
		
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
			return bot.toolbarRadioButtonWithId(value, key, index);
		} else if(key!=null && index==-1) {
			return bot.toolbarRadioButtonWithId(value, key);
		} else if (key==null && index!=-1) {
			return bot.toolbarRadioButtonWithId(value, index);
		} else {
			return bot.toolbarRadioButtonWithId(value);
		}
	}
    
	@RobotKeyword("Find the toolbarRadioButton with the given tooltip and optional index\n\n"
            + "Examples:\n"
            + "| Find ToolbarRadioButton With Tooltip | tooltip | index |\n")
    @ArgumentNames({"tooltip", "*index"})
	public SWTBotToolbarRadioButton findToolbarRadioButtonWithTooltip(String tooltip, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.toolbarRadioButtonWithTooltip(tooltip, indexI);
		} else {
			return bot.toolbarRadioButtonWithTooltip(tooltip);
		}
	}
    
   	
	@RobotKeyword("Find the toolbarRadioButton with the given tooltip and group and optional index\n\n"
            + "Examples:\n"
            + "| Find ToolbarRadioButton With Tooltip In Group | tooltip | group | index | \n"
            + "| Find ToolbarRadioButton With Tooltip In Group | tooltip | group | | \n")
    @ArgumentNames({"tooltip", "group", "*index"})
    public SWTBotToolbarRadioButton findToolbarRadioButtonWithTooltipInGroup(String tooltip, String group,  String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.toolbarRadioButtonWithTooltipInGroup(tooltip, group, indexI);
		} else {
			return bot.toolbarRadioButtonWithTooltipInGroup(tooltip, group);
		}
	}
}