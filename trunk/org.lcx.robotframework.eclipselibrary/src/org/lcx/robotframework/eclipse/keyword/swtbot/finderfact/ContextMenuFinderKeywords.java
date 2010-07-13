package org.lcx.robotframework.eclipse.keyword.swtbot.finderfact;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ContextMenuFinderKeywords {
	
    @RobotKeyword("Find the context menu with the given text\n\n"
            + "Example:\n"
            + "| Find Context Menu | text | \n")
    @ArgumentNames({"text"})
        public void findContextMenu(String text) throws Exception {
    	AbstractSWTBotControl widget = Context.getCurrentWidget();
    	Context.setCurrentWidget(widget.contextMenu(text));
    }
    }
