package org.lcx.robotframework.eclipse.keyword.swtbot.action.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ToolbarDropDownButtonFinderKeywords {

	
	@RobotKeyword("Find the toolbarDropDownButton with the given optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find ToolbarDropDownButton | mnemonicText | index |\n"
            + "| Find ToolbarDropDownButton | mnemonicText |  |\n"
            + "| Find ToolbarDropDownButton | index |  |\n"
            + "| Find ToolbarDropDownButton | |  |\n")
    @ArgumentNames({"*params"})
    public SWTBotToolbarDropDownButton findToolbarDropDownButton(String... params) throws SWTBotBridgeException{
		
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
			return bot.toolbarDropDownButton(mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.toolbarDropDownButton(mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.toolbarDropDownButton(index);
		} else {
			return bot.toolbarDropDownButton();
		}
	}
	
	@RobotKeyword("Find the toolbarDropDownButton in the given group with optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find ToolbarDropDownButton In Group | group | mnemonicText | index |\n"
            + "| Find ToolbarDropDownButton In Group | group | mnemonicText | |\n"
            + "| Find ToolbarDropDownButton In Group | group | index | |\n"
            + "| Find ToolbarDropDownButton In Group | group | |  |\n")
    @ArgumentNames({"group", "*params"})
    public SWTBotToolbarDropDownButton findToolbarDropDownButtonInGroup(String group, String... params) throws SWTBotBridgeException{
		
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
			return bot.toolbarDropDownButtonInGroup(group, mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.toolbarDropDownButtonInGroup(group, mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.toolbarDropDownButtonInGroup(group, index);
		} else {
			return bot.toolbarDropDownButtonInGroup(group);
		}
	}

	@RobotKeyword("Find the toolbarDropDownButton with the given value and optionals key and index\n\n"
            + "Examples:\n"
            + "| Find ToolbarDropDownButton With Id | value | key | index |\n"
            + "| Find ToolbarDropDownButton With Id | value | index | |\n"
            + "| Find ToolbarDropDownButton With Id | value | key | |\n"
            + "| Find ToolbarDropDownButton With Id | value | | |\n")
    @ArgumentNames({"value", "*params"})
    public SWTBotToolbarDropDownButton findToolbarDropDownButtonWithId(String value, String... params) throws SWTBotBridgeException{
		
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
			return bot.toolbarDropDownButtonWithId(value, key, index);
		} else if(key!=null && index==-1) {
			return bot.toolbarDropDownButtonWithId(value, key);
		} else if (key==null && index!=-1) {
			return bot.toolbarDropDownButtonWithId(value, index);
		} else {
			return bot.toolbarDropDownButtonWithId(value);
		}
	}
    
	@RobotKeyword("Find the toolbarDropDownButton with the given tooltip and optional index\n\n"
            + "Examples:\n"
            + "| Find ToolbarDropDownButton With Tooltip | tooltip | index |\n")
    @ArgumentNames({"tooltip", "*index"})
	public SWTBotToolbarDropDownButton findToolbarDropDownButtonWithTooltip(String tooltip, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.toolbarDropDownButtonWithTooltip(tooltip, indexI);
		} else {
			return bot.toolbarDropDownButtonWithTooltip(tooltip);
		}
	}
    
   	
	@RobotKeyword("Find the toolbarDropDownButton with the given tooltip and group and optional index\n\n"
            + "Examples:\n"
            + "| Find ToolbarDropDownButton With Tooltip In Group | tooltip | group | index | \n"
            + "| Find ToolbarDropDownButton With Tooltip In Group | tooltip | group | | \n")
    @ArgumentNames({"tooltip", "group", "*index"})
    public SWTBotToolbarDropDownButton findToolbarDropDownButtonWithTooltipInGroup(String tooltip, String group,  String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.toolbarDropDownButtonWithTooltipInGroup(tooltip, group, indexI);
		} else {
			return bot.toolbarDropDownButtonWithTooltipInGroup(tooltip, group);
		}
	}
}