package org.lcx.robotframework.eclipse.keyword.swtbot.action.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class CComboFinderKeywords {

	
	@RobotKeyword("Find the ccombo with the given optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find CCombo | mnemonicText | index |\n"
            + "| Find CCombo | mnemonicText |  |\n"
            + "| Find CCombo | index |  |\n"
            + "| Find CCombo | |  |\n")
    @ArgumentNames({"*params"})
    public SWTBotCCombo findCCombo(String... params) throws SWTBotBridgeException{
		
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
			return bot.ccomboBox(mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.ccomboBox(mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.ccomboBox(index);
		} else {
			return bot.ccomboBox();
		}
	}
	
	@RobotKeyword("Find the ccombo in the given group with optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find CCombo In Group | group | mnemonicText | index |\n"
            + "| Find CCombo In Group | group | mnemonicText | |\n"
            + "| Find CCombo In Group | group | index | |\n"
            + "| Find CCombo In Group | group | |  |\n")
    @ArgumentNames({"group", "*params"})
    public SWTBotCCombo findCComboInGroup(String group, String... params) throws SWTBotBridgeException{
		
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
			return bot.ccomboBoxInGroup(group, mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.ccomboBoxInGroup(group, mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.ccomboBoxInGroup(group, index);
		} else {
			return bot.ccomboBoxInGroup(group);
		}
	}

	@RobotKeyword("Find the ccombo with the given value and optionals key and index\n\n"
            + "Examples:\n"
            + "| Find CCombo With Id | value | key | index |\n"
            + "| Find CCombo With Id | value | index | |\n"
            + "| Find CCombo With Id | value | key | |\n"
            + "| Find CCombo With Id | value | | |\n")
    @ArgumentNames({"value", "*params"})
    public SWTBotCCombo findCComboWithId(String value, String... params) throws SWTBotBridgeException{
		
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
			return bot.ccomboBoxWithId(value, key, index);
		} else if(key!=null && index==-1) {
			return bot.ccomboBoxWithId(value, key);
		} else if (key==null && index!=-1) {
			return bot.ccomboBoxWithId(value, index);
		} else {
			return bot.ccomboBoxWithId(value);
		}
	}
    
	@RobotKeyword("Find the ccombo with the given label and optional index\n\n"
            + "Examples:\n"
            + "| Find CCombo With Label | label | index |\n"
            + "| Find CCombo With Label | label | |\n")
    @ArgumentNames({"label", "*index"})
    public SWTBotCCombo findCComboWithLabel(String label, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.ccomboBoxWithLabel(label, indexI);
		} else {
			return bot.ccomboBoxWithLabel(label);
		}
	}
    
	@RobotKeyword("Find the ccombo with the given label and group and optional index\n\n"
            + "Examples:\n"
            + "| Find CCombo With Label In Group | label | group | index |\n"
            + "| Find CCombo With Label In Group | label | group | |\n")
    @ArgumentNames({"label", "group", "*index"})
   	public SWTBotCCombo findCComboWithLabelInGroup(String label, String group,  String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.ccomboBoxWithLabelInGroup(label, group, indexI);
		} else {
			return bot.ccomboBoxWithLabelInGroup(label, group);
		}
	}

}