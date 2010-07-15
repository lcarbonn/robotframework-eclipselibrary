package org.lcx.robotframework.eclipse.keyword.eclipse.finder;

import java.util.List;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ViewFinderKeywords {

	
	@RobotKeyword("Find the active view\n\n"
            + "Example:\n"
            + "| Find Active View |\n")
//    @ArgumentNames({"*params"})
    public SWTBotView findActiveView() throws SWTBotBridgeException{
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		return bot.activeView();
	}
	
	@RobotKeyword("Find the view by its id\n\n"
            + "Example:\n"
            + "| Find View By Id | id |\n")
    @ArgumentNames({"id"})
    public SWTBotView findViewById(String id) throws SWTBotBridgeException{
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		return bot.viewById(id);
	}

	@RobotKeyword("Find the view by its title\n\n"
            + "Example:\n"
            + "| Find View By Title | title |\n")
    @ArgumentNames({"tile"})
    public SWTBotView findViewByTitle(String title) throws SWTBotBridgeException{
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		return bot.viewByTitle(title);
	}

	@RobotKeyword("List all the views title\n\n"
            + "Example:\n"
            + "| List All Views Title | \n")
//    @ArgumentNames({"label"})
    public String[] listAllViewsTitle() throws SWTBotBridgeException{
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	List<SWTBotView> views = bot.views();
		String[] a = new String[views.size()];
		int i = 0;
    	for (SWTBotView p : views) {
    		a[i]=p.getTitle();
    		i++;
		}
		return a;
	}
	
}