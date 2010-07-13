package org.lcx.robotframework.eclipse.keyword.swtbot.action.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class SpinnerFinderKeywords {

	
	@RobotKeyword("Find the spinner with the given optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find Spinner | mnemonicText | index |\n"
            + "| Find Spinner | mnemonicText |  |\n"
            + "| Find Spinner | index |  |\n"
            + "| Find Spinner | |  |\n")
    @ArgumentNames({"*params"})
    public SWTBotSpinner findSpinner(String... params) throws SWTBotBridgeException{
		
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
			return bot.spinner(mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.spinner(mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.spinner(index);
		} else {
			return bot.spinner();
		}
	}
	
	@RobotKeyword("Find the spinner in the given group with optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find Spinner In Group | group | mnemonicText | index |\n"
            + "| Find Spinner In Group | group | mnemonicText | |\n"
            + "| Find Spinner In Group | group | index | |\n"
            + "| Find Spinner In Group | group | |  |\n")
    @ArgumentNames({"group", "*params"})
    public SWTBotSpinner findSpinnerInGroup(String group, String... params) throws SWTBotBridgeException{
		
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
			return bot.spinnerInGroup(group, mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.spinnerInGroup(group, mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.spinnerInGroup(group, index);
		} else {
			return bot.spinnerInGroup(group);
		}
	}

	@RobotKeyword("Find the spinner with the given value and optionals key and index\n\n"
            + "Examples:\n"
            + "| Find Spinner With Id | value | key | index |\n"
            + "| Find Spinner With Id | value | index | |\n"
            + "| Find Spinner With Id | value | key | |\n"
            + "| Find Spinner With Id | value | | |\n")
    @ArgumentNames({"value", "*params"})
    public SWTBotSpinner findSpinnerWithId(String value, String... params) throws SWTBotBridgeException{
		
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
			return bot.spinnerWithId(value, key, index);
		} else if(key!=null && index==-1) {
			return bot.spinnerWithId(value, key);
		} else if (key==null && index!=-1) {
			return bot.spinnerWithId(value, index);
		} else {
			return bot.spinnerWithId(value);
		}
	}
    
	@RobotKeyword("Find the spinner with the given label and optional index\n\n"
            + "Examples:\n"
            + "| Find Spinner With Label | label | index |\n"
            + "| Find Spinner With Label | label | |\n")
    @ArgumentNames({"label", "*index"})
    public SWTBotSpinner findSpinnerWithLabel(String label, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.spinnerWithLabel(label, indexI);
		} else {
			return bot.spinnerWithLabel(label);
		}
	}
    
	@RobotKeyword("Find the spinner with the given label and group and optional index\n\n"
            + "Examples:\n"
            + "| Find Spinner With Label In Group | label | group | index |\n"
            + "| Find Spinner With Label In Group | label | group | |\n")
    @ArgumentNames({"label", "group", "*index"})
   	public SWTBotSpinner findSpinnerWithLabelInGroup(String label, String group,  String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.spinnerWithLabelInGroup(label, group, indexI);
		} else {
			return bot.spinnerWithLabelInGroup(label, group);
		}
	}

	@RobotKeyword("Find the spinner with the given tooltip and optional index\n\n"
            + "Examples:\n"
            + "| Find Spinner With Tooltip | tooltip | index |\n")
    @ArgumentNames({"tooltip", "*index"})
	public SWTBotSpinner findSpinnerWithTooltip(String tooltip, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.spinnerWithTooltip(tooltip, indexI);
		} else {
			return bot.spinnerWithTooltip(tooltip);
		}
	}
    
   	
	@RobotKeyword("Find the spinner with the given tooltip and group and optional index\n\n"
            + "Examples:\n"
            + "| Find Spinner With Tooltip In Group | tooltip | group | index | \n"
            + "| Find Spinner With Tooltip In Group | tooltip | group | | \n")
    @ArgumentNames({"tooltip", "group", "*index"})
    public SWTBotSpinner findSpinnerWithTooltipInGroup(String tooltip, String group,  String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.spinnerWithTooltipInGroup(tooltip, group, indexI);
		} else {
			return bot.spinnerWithTooltipInGroup(tooltip, group);
		}
	}
}