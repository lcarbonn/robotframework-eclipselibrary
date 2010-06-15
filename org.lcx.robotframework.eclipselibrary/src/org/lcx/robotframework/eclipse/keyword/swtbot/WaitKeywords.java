package org.lcx.robotframework.eclipse.keyword.swtbot;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.eclipse.finder.waits.Conditions;
import org.lcx.robotframework.swtbot.swt.finder.waits.ICondition;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class WaitKeywords {

    @RobotKeyword("Wait until the last selected widget is enabled with timeout milliseconds\n\n"
            + "Example:\n"
            + "| Wait Until Last Widget Is Enabled | timeout | \n")
    @ArgumentNames({"timeout"})
        public void waitUntilLastWidgetIsEnabled(String timeout) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	long timeoutL = Long.valueOf(timeout).longValue();
    	AbstractSWTBotControl widget = Context.getCurrentWidget();
		ICondition condition = Conditions.widgetIsEnabled(bot, widget);
		bot.waitUntil(condition, timeoutL);
    }
}
