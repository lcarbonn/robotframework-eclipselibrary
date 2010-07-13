package org.lcx.robotframework.eclipse.keyword.swtbot.action.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ToolbarButtonFinderKeywords {

	
	@RobotKeyword("Find the toolbarToolbarButton with the given optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find ToolbarButton | mnemonicText | index |\n"
            + "| Find ToolbarButton | mnemonicText |  |\n"
            + "| Find ToolbarButton | index |  |\n"
            + "| Find ToolbarButton | |  |\n")
    @ArgumentNames({"*params"})
    public SWTBotToolbarButton findToolbarButton(String... params) throws SWTBotBridgeException{
		
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
			return bot.toolbarButton(mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.toolbarButton(mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.toolbarButton(index);
		} else {
			return bot.toolbarButton();
		}
	}
	
	@RobotKeyword("Find the toolbarButton in the given group with optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find ToolbarButton In Group | group | mnemonicText | index |\n"
            + "| Find ToolbarButton In Group | group | mnemonicText | |\n"
            + "| Find ToolbarButton In Group | group | index | |\n"
            + "| Find ToolbarButton In Group | group | |  |\n")
    @ArgumentNames({"group", "*params"})
    public SWTBotToolbarButton findToolbarButtonInGroup(String group, String... params) throws SWTBotBridgeException{
		
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
			return bot.toolbarButtonInGroup(group, mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.toolbarButtonInGroup(group, mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.toolbarButtonInGroup(group, index);
		} else {
			return bot.toolbarButtonInGroup(group);
		}
	}

	@RobotKeyword("Find the toolbarButton with the given value and optionals key and index\n\n"
            + "Examples:\n"
            + "| Find ToolbarButton With Id | value | key | index |\n"
            + "| Find ToolbarButton With Id | value | index | |\n"
            + "| Find ToolbarButton With Id | value | key | |\n"
            + "| Find ToolbarButton With Id | value | | |\n")
    @ArgumentNames({"value", "*params"})
    public SWTBotToolbarButton findToolbarButtonWithId(String value, String... params) throws SWTBotBridgeException{
		
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
			return bot.toolbarButtonWithId(value, key, index);
		} else if(key!=null && index==-1) {
			return bot.toolbarButtonWithId(value, key);
		} else if (key==null && index!=-1) {
			return bot.toolbarButtonWithId(value, index);
		} else {
			return bot.toolbarButtonWithId(value);
		}
	}

	@RobotKeyword("Find the toolbarButton with the given tooltip and optional index\n\n"
            + "Examples:\n"
            + "| Find ToolbarButton With Tooltip | tooltip | index |\n")
    @ArgumentNames({"tooltip", "*index"})
	public SWTBotToolbarButton findToolbarButtonWithTooltip(String tooltip, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.toolbarButtonWithTooltip(tooltip, indexI);
		} else {
			return bot.toolbarButtonWithTooltip(tooltip);
		}
	}
    
   	
	@RobotKeyword("Find the toolbarButton with the given tooltip and group and optional index\n\n"
            + "Examples:\n"
            + "| Find ToolbarButton With Tooltip In Group | tooltip | group | index | \n"
            + "| Find ToolbarButton With Tooltip In Group | tooltip | group | | \n")
    @ArgumentNames({"tooltip", "group", "*index"})
    public SWTBotToolbarButton findToolbarButtonWithTooltipInGroup(String tooltip, String group,  String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.toolbarButtonWithTooltipInGroup(tooltip, group, indexI);
		} else {
			return bot.toolbarButtonWithTooltipInGroup(tooltip, group);
		}
	}
}