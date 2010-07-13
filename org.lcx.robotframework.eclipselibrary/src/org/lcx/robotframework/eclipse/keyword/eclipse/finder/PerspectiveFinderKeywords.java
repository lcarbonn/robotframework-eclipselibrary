package org.lcx.robotframework.eclipse.keyword.eclipse.finder;

import java.util.List;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotPerspective;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class PerspectiveFinderKeywords {

	
	@RobotKeyword("Find the active perspective\n\n"
            + "Example:\n"
            + "| Find Active Perspective |\n")
//    @ArgumentNames({"*params"})
    public SWTBotPerspective findActivePerspective() throws SWTBotBridgeException{
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		return bot.activePerspective();
	}
	
	@RobotKeyword("Reset the active perspective\n\n"
            + "Example:\n"
            + "| Reset Active Perspective |\n")
//    @ArgumentNames({"*params"})
    public SWTBotPerspective resetActivePerspective() throws SWTBotBridgeException{
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		return bot.resetActivePerspective();
	}

	@RobotKeyword("Find the default perspective\n\n"
            + "Example:\n"
            + "| Find Default Perspective |\n")
//    @ArgumentNames({"*params"})
    public SWTBotPerspective findDefaultPerspective() throws SWTBotBridgeException{
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		return bot.defaultPerspective();
	}

	@RobotKeyword("Find the perspective by its id\n\n"
            + "Example:\n"
            + "| Find Perspective By Id | id |\n")
    @ArgumentNames({"id"})
    public SWTBotPerspective findPerspectiveById(String id) throws SWTBotBridgeException{
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		return bot.perspectiveById(id);
	}

	@RobotKeyword("Find the perspective by its label\n\n"
            + "Example:\n"
            + "| Find Perspective By Label | label |\n")
    @ArgumentNames({"label"})
    public SWTBotPerspective findPerspectiveByLabel(String label) throws SWTBotBridgeException{
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		return bot.perspectiveByLabel(label);
	}

	@RobotKeyword("List all the perspectives label\n\n"
            + "Example:\n"
            + "| List All Perspective Label | \n")
    @ArgumentNames({"label"})
    public String[] listAllPerspectiveLabel() throws SWTBotBridgeException{
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	List<SWTBotPerspective> perspectives = bot.perspectives();
		String[] a = new String[perspectives.size()];
		int i = 0;
    	for (SWTBotPerspective p : perspectives) {
    		a[i]=p.getLabel();
    		i++;
		}
		return a;
	}
}