/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.utils;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.eclipse.utils.TimeParser;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.eclipse.finder.waits.Conditions;
import org.lcx.robotframework.swtbot.swt.finder.waits.ICondition;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class WaitKeywords {

	private void waitUntil(ICondition condition, String... params) throws SWTBotBridgeException {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	boolean isTimout = false;
    	boolean isInterval = false;
    	long timeoutL = -1;
    	long intervalL = -1;
    	
    	if(params!=null && params.length>0) {
	    	try {
		    	if(params.length>0 && params[0]!=null) {
		    		timeoutL = TimeParser.parseMillisecond(params[0]);
		    		isTimout=true;
		    	}
			} catch (NumberFormatException e) {
				throw new SWTBotBridgeException("Given 'timeout' parameter is not in a robotframework time format", e);
			}
			
	    	try {
		    	if(params.length>1 && params[1]!=null) {
		    		intervalL = TimeParser.parseMillisecond(params[1]);
		    		isInterval=true;
		    	}
			} catch (NumberFormatException e) {
				throw new SWTBotBridgeException("Given 'interval' parameter is not in a robotframework time format", e);
			}
    	}
    	
		if(isTimout && isInterval) {
			bot.waitUntil(condition, timeoutL, intervalL);
		} else if (isTimout && !isInterval) {
			bot.waitUntil(condition, timeoutL);
		} else {
			bot.waitUntil(condition);
		}
		
	}
	
	private void waitWhile(ICondition condition, String... params) throws SWTBotBridgeException {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	boolean isTimout = false;
    	boolean isInterval = false;
    	long timeoutL = -1;
    	long intervalL = -1;
    	
    	if(params!=null && params.length>0) {
	    	try {
		    	if(params.length>0 && params[0]!=null) {
		    		timeoutL = TimeParser.parseMillisecond(params[0]);
		    		isTimout=true;
		    	}
			} catch (NumberFormatException e) {
				throw new SWTBotBridgeException("Given 'timeout' parameter is not in a robotframework time format", e);
			}
			
	    	try {
		    	if(params.length>1 && params[1]!=null) {
		    		intervalL = TimeParser.parseMillisecond(params[1]);
		    		isInterval=true;
		    	}
			} catch (NumberFormatException e) {
				throw new SWTBotBridgeException("Given 'interval' parameter is not in a robotframework time format", e);
			}
    	}
    	
		if(isTimout && isInterval) {
			bot.waitWhile(condition, timeoutL, intervalL);
		} else if (isTimout && !isInterval) {
			bot.waitWhile(condition, timeoutL);
		} else {
			bot.waitWhile(condition);
		}
	}

	@RobotKeyword("Wait until the last selected widget is enabled\n"
    		+ "or the optional timeout is reached.\n"
    		+ "The optional interval is the delay between evaluating the condition after it has failed\n\n"
            + "Example:\n"
            + "| Wait Until Last Widget Is Enabled | 5 s | 10 ms |\n")
    @ArgumentNames({"*params"})
        public void waitUntilLastWidgetIsEnabled(String... params) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	AbstractSWTBotControl widget = (AbstractSWTBotControl)Context.getCurrentWidget();
		ICondition condition = Conditions.widgetIsEnabled(bot, widget);
		waitUntil(condition, params);
    }
    
    @RobotKeyword("Wait until the last selected shell widget closes\n"
    		+ "or the optional timeout is reached.\n"
    		+ "The optional interval is the delay between evaluating the condition after it has failed\n\n"
            + "Example:\n"
            + "| Wait Until Shell Closes | 5 s | 10 ms |\n")
    @ArgumentNames({"timeout", "interval"})
        public void waitUntilShellCloses(String... params) throws SWTBotBridgeException {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	SWTBotShell shell = (SWTBotShell)Context.getCurrentWidget(SWTBotShell.class);
		ICondition condition = Conditions.shellCloses(bot, shell);
		waitUntil(condition, params);
    }
    
    @RobotKeyword("Wait until shell with given text is active\n"
    		+ "or the optional timeout is reached.\n"
    		+ "The optional interval is the delay between evaluating the condition after it has failed\n\n"
            + "Example:\n"
            + "| Wait Until Shell Is Active | This is the shell text | 5 s | 10 ms |\n")
    @ArgumentNames({"text", "*params"})
        public void waitUntilShellIsActive(String text, String... params) throws SWTBotBridgeException {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		ICondition condition = Conditions.shellIsActive(bot, text);
		waitUntil(condition, params);
    }

    @RobotKeyword("Wait until the last selected table have the proper number of rows\n"
    		+ "or the optional timeout is reached.\n"
    		+ "The optional interval is the delay between evaluating the condition after it has failed\n\n"
            + "Example:\n"
            + "| Wait Until Table Has Rows | 5 s | 10 ms |\n")
    @ArgumentNames({"rowCount", "*params"})
        public void waitUntilTableHasRows(String rowCount, String... params) throws SWTBotBridgeException {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	int rowCountI = Integer.valueOf(rowCount).intValue();
    	SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
		ICondition condition = Conditions.tableHasRows(bot, table, rowCountI);
		waitUntil(condition, params);
    }
    
	@RobotKeyword("Wait while the last selected widget is enabled\n"
    		+ "or the optional timeout is reached.\n"
    		+ "The optional interval is the delay between evaluating the condition after it has failed\n\n"
            + "Example:\n"
            + "| Wait While Last Widget Is Enabled | 5 s | 10 ms |\n")
    @ArgumentNames({"*params"})
        public void waitWhileLastWidgetIsEnabled(String... params) throws SWTBotBridgeException {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	AbstractSWTBotControl widget = (AbstractSWTBotControl)Context.getCurrentWidget();
		ICondition condition = Conditions.widgetIsEnabled(bot, widget);
		waitWhile(condition, params);
    }
    
    @RobotKeyword("Wait while the last selected shell widget closes\n"
    		+ "or the optional timeout is reached.\n"
    		+ "The optional interval is the delay between evaluating the condition after it has failed\n\n"
            + "Example:\n"
            + "| Wait While Shell Closes | 5 s | 10 ms |\n")
    @ArgumentNames({"*params"})
        public void waitWhileShellCloses(String... params) throws SWTBotBridgeException {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	SWTBotShell shell = (SWTBotShell)Context.getCurrentWidget(SWTBotShell.class);
		ICondition condition = Conditions.shellCloses(bot, shell);
		waitWhile(condition, params);
    }
    
    @RobotKeyword("Wait while shell with given text is active\n"
    		+ "or the optional timeout is reached.\n"
    		+ "The optional interval is the delay between evaluating the condition after it has failed\n\n"
            + "Example:\n"
            + "| Wait While Shell Is Active | This is the shell text | 5 s | 10 s | \n")
    @ArgumentNames({"text", "*params"})
        public void waitWhileShellIsActive(String text, String... params) throws SWTBotBridgeException {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		ICondition condition = Conditions.shellIsActive(bot, text);
		waitWhile(condition, params);
    }

    @RobotKeyword("Wait while the last selected table have the proper number of rows\n"
    		+ "or the optional timeout is reached.\n"
    		+ "The optional interval is the delay between evaluating the condition after it has failed\n\n"
            + "Example:\n"
            + "| Wait While Table Has Rows | 5 s | 10 ms |\n")
    @ArgumentNames({"rowCount", "*params"})
        public void waitWhileTableHasRows(String rowCount, String... params) throws SWTBotBridgeException {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	int rowCountI = Integer.valueOf(rowCount).intValue();
    	SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
		ICondition condition = Conditions.tableHasRows(bot, table, rowCountI);
		waitWhile(condition, params);
    }

}
