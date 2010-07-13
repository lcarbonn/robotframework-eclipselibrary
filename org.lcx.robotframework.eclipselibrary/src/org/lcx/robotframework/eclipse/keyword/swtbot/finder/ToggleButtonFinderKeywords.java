package org.lcx.robotframework.eclipse.keyword.swtbot.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ToggleButtonFinderKeywords {

	
	@RobotKeyword("Find the toggleButton with the given optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find ToggleButton | mnemonicText | index |\n"
            + "| Find ToggleButton | mnemonicText |  |\n"
            + "| Find ToggleButton | index |  |\n"
            + "| Find ToggleButton | |  |\n")
    @ArgumentNames({"*params"})
    public SWTBotToggleButton findToggleButton(String... params) throws SWTBotBridgeException{
		
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
			return bot.toggleButton(mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.toggleButton(mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.toggleButton(index);
		} else {
			return bot.toggleButton();
		}
	}
	
	@RobotKeyword("Find the toggleButton in the given group with optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find ToggleButton In Group | group | mnemonicText | index |\n"
            + "| Find ToggleButton In Group | group | mnemonicText | |\n"
            + "| Find ToggleButton In Group | group | index | |\n"
            + "| Find ToggleButton In Group | group | |  |\n")
    @ArgumentNames({"group", "*params"})
    public SWTBotToggleButton findToggleButtonInGroup(String group, String... params) throws SWTBotBridgeException{
		
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
			return bot.toggleButtonInGroup(group, mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.toggleButtonInGroup(group, mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.toggleButtonInGroup(group, index);
		} else {
			return bot.toggleButtonInGroup(group);
		}
	}

	@RobotKeyword("Find the toggleButton with the given value and optionals key and index\n\n"
            + "Examples:\n"
            + "| Find ToggleButton With Id | value | key | index |\n"
            + "| Find ToggleButton With Id | value | index | |\n"
            + "| Find ToggleButton With Id | value | key | |\n"
            + "| Find ToggleButton With Id | value | | |\n")
    @ArgumentNames({"value", "*params"})
    public SWTBotToggleButton findToggleButtonWithId(String value, String... params) throws SWTBotBridgeException{
		
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
			return bot.toggleButtonWithId(value, key, index);
		} else if(key!=null && index==-1) {
			return bot.toggleButtonWithId(value, key);
		} else if (key==null && index!=-1) {
			return bot.toggleButtonWithId(value, index);
		} else {
			return bot.toggleButtonWithId(value);
		}
	}
    
	@RobotKeyword("Find the toggleButton with the given label and optional index\n\n"
            + "Examples:\n"
            + "| Find ToggleButton With Label | label | index |\n"
            + "| Find ToggleButton With Label | label | |\n")
    @ArgumentNames({"label", "*index"})
    public SWTBotToggleButton findToggleButtonWithLabel(String label, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.toggleButtonWithLabel(label, indexI);
		} else {
			return bot.toggleButtonWithLabel(label);
		}
	}
    
	@RobotKeyword("Find the toggleButton with the given label and group and optional index\n\n"
            + "Examples:\n"
            + "| Find ToggleButton With Label In Group | label | group | index |\n"
            + "| Find ToggleButton With Label In Group | label | group | |\n")
    @ArgumentNames({"label", "group", "*index"})
   	public SWTBotToggleButton findToggleButtonWithLabelInGroup(String label, String group,  String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.toggleButtonWithLabelInGroup(label, group, indexI);
		} else {
			return bot.toggleButtonWithLabelInGroup(label, group);
		}
	}

	@RobotKeyword("Find the toggleButton with the given tooltip and optional index\n\n"
            + "Examples:\n"
            + "| Find ToggleButton With Tooltip | tooltip | index |\n")
    @ArgumentNames({"tooltip", "*index"})
	public SWTBotToggleButton findToggleButtonWithTooltip(String tooltip, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.toggleButtonWithTooltip(tooltip, indexI);
		} else {
			return bot.toggleButtonWithTooltip(tooltip);
		}
	}
    
   	
	@RobotKeyword("Find the toggleButton with the given tooltip and group and optional index\n\n"
            + "Examples:\n"
            + "| Find ToggleButton With Tooltip In Group | tooltip | group | index | \n"
            + "| Find ToggleButton With Tooltip In Group | tooltip | group | | \n")
    @ArgumentNames({"tooltip", "group", "*index"})
    public SWTBotToggleButton findToggleButtonWithTooltipInGroup(String tooltip, String group,  String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.toggleButtonWithTooltipInGroup(tooltip, group, indexI);
		} else {
			return bot.toggleButtonWithTooltipInGroup(tooltip, group);
		}
	}
}