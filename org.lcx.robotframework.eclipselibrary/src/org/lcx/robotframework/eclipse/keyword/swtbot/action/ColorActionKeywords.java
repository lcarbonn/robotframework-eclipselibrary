package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBot;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ColorActionKeywords {

	@RobotKeyword("Get widget background color in RGB format\n\n"
            + "Example:\n"
            + "| ${color} | Get Background Color |\n"
            + "| Should Be Equal | ${color} | #FF00CC\n")
        public String getBackgroundColor() throws Exception {
		AbstractSWTBot object = (AbstractSWTBot)Context.getCurrentWidget();
    		return object.backgroundColor().toString();
    	}

	@RobotKeyword("Get widget foreground color in RGB format\n\n"
            + "Example:\n"
            + "| ${color} | Get Foreground Color |\n"
            + "| Should Be Equal | ${color} | #FF00CC\n")
        public String getForegroundColor() throws Exception {
		AbstractSWTBot object = (AbstractSWTBot)Context.getCurrentWidget();
    		return object.foregroundColor().toString();
    	}
	
}