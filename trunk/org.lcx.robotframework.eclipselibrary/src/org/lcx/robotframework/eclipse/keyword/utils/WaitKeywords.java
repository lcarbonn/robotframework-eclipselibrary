package org.lcx.robotframework.eclipse.keyword.utils;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.context.Context;
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

	
	private void waitUntil(ICondition condition, String timeout, String interval) throws SWTBotBridgeException {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	boolean isTimout = false;
    	boolean isInterval = false;
    	long timeoutL = -1;
    	long intervalL = -1;
    	
    	try {
	    	if(timeout!=null) {
	    		timeoutL = Long.valueOf(timeout).longValue();
	    		isTimout=true;
	    	}
		} catch (NumberFormatException e) {
			//nothing to do
		}
		
    	try {
	    	if(interval!=null) {
	    		intervalL = Long.valueOf(timeout).longValue();
	    		isInterval=true;
	    	}
		} catch (NumberFormatException e) {
			//nothing to do
		}
		
		if(isTimout && isInterval) {
			bot.waitUntil(condition, timeoutL, intervalL);
		} else if (isTimout && !isInterval) {
			bot.waitUntil(condition, timeoutL);
		} else {
			bot.waitUntil(condition);
		}
		
	}
	
	private void waitWhile(ICondition condition, String timeout, String interval) throws SWTBotBridgeException {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	boolean isTimout = false;
    	boolean isInterval = false;
    	long timeoutL = -1;
    	long intervalL = -1;
    	
    	try {
	    	if(timeout!=null) {
	    		timeoutL = Long.valueOf(timeout).longValue();
	    		isTimout=true;
	    	}
		} catch (NumberFormatException e) {
			//nothing to do
		}
		
    	try {
	    	if(interval!=null) {
	    		intervalL = Long.valueOf(timeout).longValue();
	    		isInterval=true;
	    	}
		} catch (NumberFormatException e) {
			//nothing to do
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
    		+ "or the optional timeout is reached (millisecond).\n"
    		+ "The optional interval is the delay between evaluating the condition after it has failed (millisecond)\n\n"
            + "Example:\n"
            + "| Wait Until Last Widget Is Enabled | 500 | 10 |\n")
    @ArgumentNames({"timeout", "interval"})
        public void waitUntilLastWidgetIsEnabled(String timeout, String interval) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	AbstractSWTBotControl widget = (AbstractSWTBotControl)Context.getCurrentWidget();
		ICondition condition = Conditions.widgetIsEnabled(bot, widget);
		waitUntil(condition, timeout, interval);
    }
    
    @RobotKeyword("Wait until the last selected shell widget closes\n"
    		+ "or the optional timeout is reached (millisecond).\n"
    		+ "The optional interval is the delay between evaluating the condition after it has failed (millisecond)\n\n"
            + "Example:\n"
            + "| Wait Until Shell Closes | 500 | 10 |\n")
    @ArgumentNames({"timeout", "interval"})
        public void waitUntilShellCloses(String timeout, String interval) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	SWTBotShell shell = (SWTBotShell)Context.getCurrentWidget(SWTBotShell.class);
		ICondition condition = Conditions.shellCloses(bot, shell);
		waitUntil(condition, timeout, interval);
    }
    
    @RobotKeyword("Wait until shell with given text is active\n"
    		+ "or the optional timeout is reached (millisecond).\n"
    		+ "The optional interval is the delay between evaluating the condition after it has failed (millisecond)\n\n"
            + "Example:\n"
            + "| Wait Until Shell Closes | This is the shell text | 500 | 0 \n")
    @ArgumentNames({"text", "timeout", "interval"})
        public void waitUntilShellIsActive(String text, String timeout, String interval) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		ICondition condition = Conditions.shellIsActive(bot, text);
		waitUntil(condition, timeout, interval);
    }

    @RobotKeyword("Wait until the last selected table have the proper number of rows\n"
    		+ "or the optional timeout is reached (millisecond).\n"
    		+ "The optional interval is the delay between evaluating the condition after it has failed (millisecond)\n\n"
            + "Example:\n"
            + "| Wait Until Table Has Rows | 500 | 10 |\n")
    @ArgumentNames({"rowCount", "timeout", "interval"})
        public void waitUntilTableHasRows(String rowCount, String timeout, String interval) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	int rowCountI = Integer.valueOf(rowCount).intValue();
    	SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
		ICondition condition = Conditions.tableHasRows(bot, table, rowCountI);
		waitUntil(condition, timeout, interval);
    }
    
	@RobotKeyword("Wait while the last selected widget is enabled\n"
    		+ "or the optional timeout is reached (millisecond).\n"
    		+ "The optional interval is the delay between evaluating the condition after it has failed (millisecond)\n\n"
            + "Example:\n"
            + "| Wait While Last Widget Is Enabled | 500 | 10 |\n")
    @ArgumentNames({"timeout", "interval"})
        public void waitWhileLastWidgetIsEnabled(String timeout, String interval) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	AbstractSWTBotControl widget = (AbstractSWTBotControl)Context.getCurrentWidget();
		ICondition condition = Conditions.widgetIsEnabled(bot, widget);
		waitWhile(condition, timeout, interval);
    }
    
    @RobotKeyword("Wait while the last selected shell widget closes\n"
    		+ "or the optional timeout is reached (millisecond).\n"
    		+ "The optional interval is the delay between evaluating the condition after it has failed (millisecond)\n\n"
            + "Example:\n"
            + "| Wait While Shell Closes | 500 | 10 |\n")
    @ArgumentNames({"timeout", "interval"})
        public void waitWhileShellCloses(String timeout, String interval) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	SWTBotShell shell = (SWTBotShell)Context.getCurrentWidget(SWTBotShell.class);
		ICondition condition = Conditions.shellCloses(bot, shell);
		waitWhile(condition, timeout, interval);
    }
    
    @RobotKeyword("Wait while shell with given text is active\n"
    		+ "or the optional timeout is reached (millisecond).\n"
    		+ "The optional interval is the delay between evaluating the condition after it has failed (millisecond)\n\n"
            + "Example:\n"
            + "| Wait While Shell Closes | This is the shell text | 500 | 0 \n")
    @ArgumentNames({"text", "timeout", "interval"})
        public void waitWhileShellIsActive(String text, String timeout, String interval) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		ICondition condition = Conditions.shellIsActive(bot, text);
		waitWhile(condition, timeout, interval);
    }

    @RobotKeyword("Wait while the last selected table have the proper number of rows\n"
    		+ "or the optional timeout is reached (millisecond).\n"
    		+ "The optional interval is the delay between evaluating the condition after it has failed (millisecond)\n\n"
            + "Example:\n"
            + "| Wait While Table Has Rows | 500 | 10 |\n")
    @ArgumentNames({"rowCount", "timeout", "interval"})
        public void waitWhileTableHasRows(String rowCount, String timeout, String interval) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	int rowCountI = Integer.valueOf(rowCount).intValue();
    	SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
		ICondition condition = Conditions.tableHasRows(bot, table, rowCountI);
		waitWhile(condition, timeout, interval);
    }
}
