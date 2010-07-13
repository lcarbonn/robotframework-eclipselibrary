package org.lcx.robotframework.eclipse.keyword.swtbot.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class SliderFinderKeywords {

	
	@RobotKeyword("Find the slider with the given optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find Slider | mnemonicText | index |\n"
            + "| Find Slider | mnemonicText |  |\n"
            + "| Find Slider | index |  |\n"
            + "| Find Slider | |  |\n")
    @ArgumentNames({"*params"})
    public SWTBotSlider findSlider(String... params) throws SWTBotBridgeException{
		
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
			return bot.slider(mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.slider(mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.slider(index);
		} else {
			return bot.slider();
		}
	}
	
	@RobotKeyword("Find the slider in the given group with optionals mnemonic and index\n\n"
            + "Example:\n"
            + "| Find Slider In Group | group | mnemonicText | index |\n"
            + "| Find Slider In Group | group | mnemonicText | |\n"
            + "| Find Slider In Group | group | index | |\n"
            + "| Find Slider In Group | group | |  |\n")
    @ArgumentNames({"group", "*params"})
    public SWTBotSlider findSliderInGroup(String group, String... params) throws SWTBotBridgeException{
		
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
			return bot.sliderInGroup(group, mnemonicText, index);
		} else if(mnemonicText!=null && index==-1) {
			return bot.sliderInGroup(group, mnemonicText);
		} else if (mnemonicText==null && index!=-1) {
			return bot.sliderInGroup(group, index);
		} else {
			return bot.sliderInGroup(group);
		}
	}

	@RobotKeyword("Find the slider with the given value and optionals key and index\n\n"
            + "Examples:\n"
            + "| Find Slider With Id | value | key | index |\n"
            + "| Find Slider With Id | value | index | |\n"
            + "| Find Slider With Id | value | key | |\n"
            + "| Find Slider With Id | value | | |\n")
    @ArgumentNames({"value", "*params"})
    public SWTBotSlider findSliderWithId(String value, String... params) throws SWTBotBridgeException{
		
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
			return bot.sliderWithId(value, key, index);
		} else if(key!=null && index==-1) {
			return bot.sliderWithId(value, key);
		} else if (key==null && index!=-1) {
			return bot.sliderWithId(value, index);
		} else {
			return bot.sliderWithId(value);
		}
	}
    
	@RobotKeyword("Find the slider with the given label and optional index\n\n"
            + "Examples:\n"
            + "| Find Slider With Label | label | index |\n"
            + "| Find Slider With Label | label | |\n")
    @ArgumentNames({"label", "*index"})
    public SWTBotSlider findSliderWithLabel(String label, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.sliderWithLabel(label, indexI);
		} else {
			return bot.sliderWithLabel(label);
		}
	}
    
	@RobotKeyword("Find the slider with the given label and group and optional index\n\n"
            + "Examples:\n"
            + "| Find Slider With Label In Group | label | group | index |\n"
            + "| Find Slider With Label In Group | label | group | |\n")
    @ArgumentNames({"label", "group", "*index"})
   	public SWTBotSlider findSliderWithLabelInGroup(String label, String group,  String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.sliderWithLabelInGroup(label, group, indexI);
		} else {
			return bot.sliderWithLabelInGroup(label, group);
		}
	}

	@RobotKeyword("Find the slider with the given tooltip and optional index\n\n"
            + "Examples:\n"
            + "| Find Slider With Tooltip | tooltip | index |\n")
    @ArgumentNames({"tooltip", "*index"})
	public SWTBotSlider findSliderWithTooltip(String tooltip, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.sliderWithTooltip(tooltip, indexI);
		} else {
			return bot.sliderWithTooltip(tooltip);
		}
	}
    
   	
	@RobotKeyword("Find the slider with the given tooltip and group and optional index\n\n"
            + "Examples:\n"
            + "| Find Slider With Tooltip In Group | tooltip | group | index | \n"
            + "| Find Slider With Tooltip In Group | tooltip | group | | \n")
    @ArgumentNames({"tooltip", "group", "*index"})
    public SWTBotSlider findSliderWithTooltipInGroup(String tooltip, String group,  String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.sliderWithTooltipInGroup(tooltip, group, indexI);
		} else {
			return bot.sliderWithTooltipInGroup(tooltip, group);
		}
	}
}