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

	//TODO : change timeout and interval parameters to optional 
	
	private void waitUntil(ICondition condition, Long... params) throws SWTBotBridgeException {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	boolean isTimout = false;
    	boolean isInterval = false;
    	long timeoutL = -1;
    	long intervalL = -1;
    	
    	try {
	    	if(params[0]!=null) {
	    		timeoutL = Long.valueOf(params[0]).longValue();
	    		isTimout=true;
	    	}
		} catch (NumberFormatException e) {
			//nothing to do
		}
		
    	try {
	    	if(params[1]!=null) {
	    		intervalL = Long.valueOf(params[1]).longValue();
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
	
	private void waitWhile(ICondition condition, Long... params) throws SWTBotBridgeException {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	boolean isTimout = false;
    	boolean isInterval = false;
    	long timeoutL = -1;
    	long intervalL = -1;
    	
    	try {
	    	if(params[0]!=null) {
	    		timeoutL = Long.valueOf(params[0]).longValue();
	    		isTimout=true;
	    	}
		} catch (NumberFormatException e) {
			//nothing to do
		}
		
    	try {
	    	if(params[1]!=null) {
	    		intervalL = Long.valueOf(params[1]).longValue();
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
    @ArgumentNames({"*params"})
        public void waitUntilLastWidgetIsEnabled(Long... params) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	AbstractSWTBotControl widget = (AbstractSWTBotControl)Context.getCurrentWidget();
		ICondition condition = Conditions.widgetIsEnabled(bot, widget);
		waitUntil(condition, params);
    }
    
    @RobotKeyword("Wait until the last selected shell widget closes\n"
    		+ "or the optional timeout is reached (millisecond).\n"
    		+ "The optional interval is the delay between evaluating the condition after it has failed (millisecond)\n\n"
            + "Example:\n"
            + "| Wait Until Shell Closes | 500 | 10 |\n")
    @ArgumentNames({"timeout", "interval"})
        public void waitUntilShellCloses(Long... params) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	SWTBotShell shell = (SWTBotShell)Context.getCurrentWidget(SWTBotShell.class);
		ICondition condition = Conditions.shellCloses(bot, shell);
		waitUntil(condition, params);
    }
    
    @RobotKeyword("Wait until shell with given text is active\n"
    		+ "or the optional timeout is reached (millisecond).\n"
    		+ "The optional interval is the delay between evaluating the condition after it has failed (millisecond)\n\n"
            + "Example:\n"
            + "| Wait Until Shell Is Active | This is the shell text | 500 | 0 \n")
    @ArgumentNames({"text", "*params"})
        public void waitUntilShellIsActive(String text, Long... params) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		ICondition condition = Conditions.shellIsActive(bot, text);
		waitUntil(condition, params);
    }

    @RobotKeyword("Wait until the last selected table have the proper number of rows\n"
    		+ "or the optional timeout is reached (millisecond).\n"
    		+ "The optional interval is the delay between evaluating the condition after it has failed (millisecond)\n\n"
            + "Example:\n"
            + "| Wait Until Table Has Rows | 500 | 10 |\n")
    @ArgumentNames({"rowCount", "*params"})
        public void waitUntilTableHasRows(String rowCount, Long... params) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	int rowCountI = Integer.valueOf(rowCount).intValue();
    	SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
		ICondition condition = Conditions.tableHasRows(bot, table, rowCountI);
		waitUntil(condition, params);
    }
    
	@RobotKeyword("Wait while the last selected widget is enabled\n"
    		+ "or the optional timeout is reached (millisecond).\n"
    		+ "The optional interval is the delay between evaluating the condition after it has failed (millisecond)\n\n"
            + "Example:\n"
            + "| Wait While Last Widget Is Enabled | 500 | 10 |\n")
    @ArgumentNames({"*params"})
        public void waitWhileLastWidgetIsEnabled(Long... params) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	AbstractSWTBotControl widget = (AbstractSWTBotControl)Context.getCurrentWidget();
		ICondition condition = Conditions.widgetIsEnabled(bot, widget);
		waitWhile(condition, params);
    }
    
    @RobotKeyword("Wait while the last selected shell widget closes\n"
    		+ "or the optional timeout is reached (millisecond).\n"
    		+ "The optional interval is the delay between evaluating the condition after it has failed (millisecond)\n\n"
            + "Example:\n"
            + "| Wait While Shell Closes | 500 | 10 |\n")
    @ArgumentNames({"*params"})
        public void waitWhileShellCloses(Long... params) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	SWTBotShell shell = (SWTBotShell)Context.getCurrentWidget(SWTBotShell.class);
		ICondition condition = Conditions.shellCloses(bot, shell);
		waitWhile(condition, params);
    }
    
    @RobotKeyword("Wait while shell with given text is active\n"
    		+ "or the optional timeout is reached (millisecond).\n"
    		+ "The optional interval is the delay between evaluating the condition after it has failed (millisecond)\n\n"
            + "Example:\n"
            + "| Wait While Shell Is Active | This is the shell text | 500 | 0 \n")
    @ArgumentNames({"text", "*params"})
        public void waitWhileShellIsActive(String text, Long... params) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		ICondition condition = Conditions.shellIsActive(bot, text);
		waitWhile(condition, params);
    }

    @RobotKeyword("Wait while the last selected table have the proper number of rows\n"
    		+ "or the optional timeout is reached (millisecond).\n"
    		+ "The optional interval is the delay between evaluating the condition after it has failed (millisecond)\n\n"
            + "Example:\n"
            + "| Wait While Table Has Rows | 500 | 10 |\n")
    @ArgumentNames({"rowCount", "*params"})
        public void waitWhileTableHasRows(String rowCount, Long... params) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	int rowCountI = Integer.valueOf(rowCount).intValue();
    	SWTBotTable table = (SWTBotTable)Context.getCurrentWidget(SWTBotTable.class);
		ICondition condition = Conditions.tableHasRows(bot, table, rowCountI);
		waitWhile(condition, params);
    }

    @RobotKeyword("Wait until shell with given text is active\n"
    		+ "or the optional timeout is reached (millisecond).\n"
    		+ "The optional interval is the delay between evaluating the condition after it has failed (millisecond)\n\n"
            + "Example:\n"
            + "| Wait Until Shell Closes | This is the shell text | 500 | 0 \n")
    @ArgumentNames({"text", "timeout", "interval"})
        public void waitUntilShellIsActiveBis(String text, long timeout, long interval) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		ICondition condition = Conditions.shellIsActive(bot, text);
		waitUntil(condition, timeout, interval);
    }

}
