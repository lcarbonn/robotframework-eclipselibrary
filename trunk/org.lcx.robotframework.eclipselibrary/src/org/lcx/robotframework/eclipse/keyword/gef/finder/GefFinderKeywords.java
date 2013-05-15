/*
 * Copyright 2013 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.gef.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.gef.finder.SWTGefBot;
import org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor;
import org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefView;
import org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefViewer;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class GefFinderKeywords {

	
	@RobotKeyword("Find the GEF Editor with the given optionals fileName and index\n\n"
            + "Example:\n"
            + "| Find GEF Editor | fileName | index |\n"
            + "| Find GEF Editor | fileName |  |\n")
    @ArgumentNames({"*params"})
    public SWTBotGefEditor findGEFEditor(String... params) throws SWTBotBridgeException{
		
    	String fileName = null;
    	int index = -1;
    	
    	int nbParam = params.length;
    	if (nbParam==1) {
    		try {
    			index = Integer.valueOf(params[0]).intValue();
			} catch (NumberFormatException e) {
				// param is not numeric, so considered as mnemonic
				fileName = params[0];
			}
    	}
    	if(nbParam==2) {
			fileName = params[0];
    		try {
    			index = Integer.valueOf(params[1]).intValue();
			} catch (NumberFormatException e) {
				// nothing to do
			}
    	}
		
    	SWTGefBot bot = SWTGefBot.getSWTWorkbenchBot();
		if(fileName!=null && index != -1) {
			return bot.gefEditor(fileName, index);
		} else {
			return bot.gefEditor(fileName);
		}
	}

	@RobotKeyword("Find the GEF View with the given optionals fileName and index\n\n"
            + "Example:\n"
            + "| Find GEF View | fileName | index |\n"
            + "| Find GEF View | fileName |  |\n")
    @ArgumentNames({"*params"})
    public SWTBotGefView findGEFView(String... params) throws SWTBotBridgeException{
		
    	String fileName = null;
    	int index = -1;
    	
    	int nbParam = params.length;
    	if (nbParam==1) {
    		try {
    			index = Integer.valueOf(params[0]).intValue();
			} catch (NumberFormatException e) {
				// param is not numeric, so considered as mnemonic
				fileName = params[0];
			}
    	}
    	if(nbParam==2) {
			fileName = params[0];
    		try {
    			index = Integer.valueOf(params[1]).intValue();
			} catch (NumberFormatException e) {
				// nothing to do
			}
    	}
		
    	SWTGefBot bot = SWTGefBot.getSWTWorkbenchBot();
		if(fileName!=null && index != -1) {
			return bot.gefView(fileName, index);
		} else {
			return bot.gefView(fileName);
		}
	}

	@RobotKeyword("Find the GEF Viewer with the given optionals partTitle\n\n"
            + "Example:\n"
            + "| Find GEF View | partTitle |\n")
    @ArgumentNames({"partTitle"})
    public SWTBotGefViewer findGEFViewer(String partTitle) throws SWTBotBridgeException{
		
    	SWTGefBot bot = SWTGefBot.getSWTWorkbenchBot();
		return bot.gefViewer(partTitle);
	}

}