/*
 * Copyright 2010 L. Carbonnaux
 * 2020 - E4 part extension by J. Beaumont
 */
package org.lcx.robotframework.eclipse.keyword.eclipse.finder;

import java.util.List;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class PartFinderKeywords {

	@RobotKeyword("Find the active part\n\n"
            + "Example:\n"
            + "| Find Active Part |\n")
//    @ArgumentNames({"*params"})
    public SWTBotView findActivePart() throws SWTBotBridgeException {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		return bot.activePart();
	}
	
	@RobotKeyword("Find the part by its id\n\n"
            + "Example:\n"
            + "| Find Part By Id | id |\n")
    @ArgumentNames({"id"})
    public SWTBotView findPartById(String id) throws SWTBotBridgeException {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		return bot.partById(id);
	}

	@RobotKeyword("Find the part by its title\n\n"
            + "Example:\n"
            + "| Find Part By Title | title |\n")
    @ArgumentNames({"tile"})
    public SWTBotView findPartByTitle(String title) throws SWTBotBridgeException {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		return bot.partByTitle(title);
	}
	
	@RobotKeyword("List all the parts title\n\n"
            + "Example:\n"
            + "| List All Parts Title | \n")
//    @ArgumentNames({"label"})
    public String[] listAllPartsTitle() throws SWTBotBridgeException {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	List<SWTBotView> parts = bot.parts();
		String[] a = new String[parts.size()];
		int i = 0;
    	for (SWTBotView p : parts) {
    		a[i]=p.getTitle();
    		i++;
		}
		return a;
	}
	
	
}