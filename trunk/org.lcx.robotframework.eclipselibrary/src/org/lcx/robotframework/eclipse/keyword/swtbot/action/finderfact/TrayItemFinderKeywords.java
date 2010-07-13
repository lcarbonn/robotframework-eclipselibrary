package org.lcx.robotframework.eclipse.keyword.swtbot.action.finderfact;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTrayItem;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class TrayItemFinderKeywords {

	
	@RobotKeyword("Find the trayItem with the given index\n\n"
            + "Example:\n"
            + "| Find TrayItem | 0 |\n")
    @ArgumentNames({"index"})
    public SWTBotTrayItem findTrayItem(String index) throws SWTBotBridgeException{

    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(index!=null) {
			int i = Integer.valueOf(index).intValue();
			return bot.trayItem(i);
		} else {
			return bot.trayItem();
		}
	}
	
	@RobotKeyword("Find the trayItem with the given tooltip and optional index\n\n"
            + "Examples:\n"
            + "| Find TrayItem With Tooltip | tooltip | index |\n")
    @ArgumentNames({"tooltip", "*index"})
	public SWTBotTrayItem findTrayItemWithTooltip(String tooltip, String... index) throws SWTBotBridgeException{
		
    	int indexI = -1;
    	
    	if (index.length==1) {
    		try {
    			indexI = Integer.valueOf(index[0]).intValue();
			} catch (NumberFormatException e) {
			}
    	}
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		if(indexI != -1) {
			return bot.trayItemWithTooltip(tooltip, indexI);
		} else {
			return bot.trayItemWithTooltip(tooltip);
		}
	}
}