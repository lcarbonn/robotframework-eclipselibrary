package org.lcx.robotframework.eclipse.keyword.swtbot.action.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ToolbarToggleButtonFinderKeywords {

	
	@RobotKeyword("Find the toolbarToggleButton with the given optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find ToolbarToggleButton | mnemonicText | index |\n"
            + "| Find ToolbarToggleButton | mnemonicText |  |\n"
            + "| Find ToolbarToggleButton | index |  |\n"
            + "| Find ToolbarToggleButton | |  |\n")
    @ArgumentNames({"*params"})
    public SWTBotToolbarToggleButton findToolbarToggleButton(String... params) throws SWTBotBridgeException{
		
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
			return bot.toolbarToggleButton(mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.toolbarToggleButton(mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.toolbarToggleButton(index);
		} else {
			return bot.toolbarToggleButton();
		}
	}
	
	@RobotKeyword("Find the toolbarToggleButton in the given group with optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find ToolbarToggleButton In Group | group | mnemonicText | index |\n"
            + "| Find ToolbarToggleButton In Group | group | mnemonicText | |\n"
            + "| Find ToolbarToggleButton In Group | group | index | |\n"
            + "| Find ToolbarToggleButton In Group | group | |  |\n")
    @ArgumentNames({"group", "*params"})
    public SWTBotToolbarToggleButton findToolbarToggleButtonInGroup(String group, String... params) throws SWTBotBridgeException{
		
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
			return bot.toolbarToggleButtonInGroup(group, mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.toolbarToggleButtonInGroup(group, mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.toolbarToggleButtonInGroup(group, index);
		} else {
			return bot.toolbarToggleButtonInGroup(group);
		}
	}

	@RobotKeyword("Find the toolbarToggleButton with the given value and optionals key and index\n\n"
            + "Examples:\n"
            + "| Find ToolbarToggleButton With Id | value | key | index |\n"
            + "| Find ToolbarToggleButton With Id | value | index | |\n"
            + "| Find ToolbarToggleButton With Id | value | key | |\n"
            + "| Find ToolbarToggleButton With Id | value | | |\n")
    @ArgumentNames({"value", "*params"})
    public SWTBotToolbarToggleButton findToolbarToggleButtonWithId(String value, String... params) throws SWTBotBridgeException{
		
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
			return bot.toolbarToggleButtonWithId(value, key, index);
		} else if(key!=null && index==-1) {
			return bot.toolbarToggleButtonWithId(value, key);
		} else if (key==null && index!=-1) {
			return bot.toolbarToggleButtonWithId(value, index);
		} else {
			return bot.toolbarToggleButtonWithId(value);
		}
	}
    
	@RobotKeyword("Find the toolbarToggleButton with the given tooltip and optional index\n\n"
            + "Examples:\n"
            + "| Find ToolbarToggleButton With Tooltip | tooltip | index |\n")
    @ArgumentNames({"tooltip", "*index"})
	public SWTBotToolbarToggleButton findToolbarToggleButtonWithTooltip(String tooltip, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.toolbarToggleButtonWithTooltip(tooltip, indexI);
		} else {
			return bot.toolbarToggleButtonWithTooltip(tooltip);
		}
	}
    
   	
	@RobotKeyword("Find the toolbarToggleButton with the given tooltip and group and optional index\n\n"
            + "Examples:\n"
            + "| Find ToolbarToggleButton With Tooltip In Group | tooltip | group | index | \n"
            + "| Find ToolbarToggleButton With Tooltip In Group | tooltip | group | | \n")
    @ArgumentNames({"tooltip", "group", "*index"})
    public SWTBotToolbarToggleButton findToolbarToggleButtonWithTooltipInGroup(String tooltip, String group,  String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.toolbarToggleButtonWithTooltipInGroup(tooltip, group, indexI);
		} else {
			return bot.toolbarToggleButtonWithTooltipInGroup(tooltip, group);
		}
	}
}