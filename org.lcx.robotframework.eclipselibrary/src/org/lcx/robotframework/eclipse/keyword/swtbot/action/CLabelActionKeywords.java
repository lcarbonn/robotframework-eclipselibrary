package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class CLabelActionKeywords {

	@RobotKeyword("Get the clabel alignment\n\n"
            + "Example:\n"
            + "| Get CLAbel Alignment |\n")
        public int getCLabelAlignment() throws Exception {
    		SWTBotCLabel clabel = (SWTBotCLabel)Context.getCurrentWidget(SWTBotCLabel.class);
    		return clabel.alignment();
    	}

	@RobotKeyword("Is the clabel active\n\n"
            + "Example:\n"
            + "| Is CLAbel Active |\n")
        public boolean isCLAbelActive() throws Exception {
    		SWTBotCLabel clabel = (SWTBotCLabel)Context.getCurrentWidget(SWTBotCLabel.class);
    		return clabel.isActive();
    	}

	@RobotKeyword("Is the clabel enabled\n\n"
            + "Example:\n"
            + "| Is CLAbel Enabled |\n")
        public boolean isCLAbelEnabled() throws Exception {
    		SWTBotCLabel clabel = (SWTBotCLabel)Context.getCurrentWidget(SWTBotCLabel.class);
    		return clabel.isEnabled();
    	}

	@RobotKeyword("Is the clabel visible\n\n"
            + "Example:\n"
            + "| Is CLAbel Visible |\n")
        public boolean isCLAbelVisible() throws Exception {
    		SWTBotCLabel clabel = (SWTBotCLabel)Context.getCurrentWidget(SWTBotCLabel.class);
    		return clabel.isVisible();
    	}

	@RobotKeyword("Get the text of the clabel\n\n"
            + "Example:\n"
            + "| Get CLAbel Text |\n")
//    @ArgumentNames({"text"})
        public String getCLAbelText() throws Exception {
    		SWTBotCLabel clabel = (SWTBotCLabel)Context.getCurrentWidget(SWTBotCLabel.class);
    		return clabel.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the clabel\n\n"
            + "Example:\n"
            + "| Get CLAbel Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getCLAbelTooltipText() throws Exception {
    		SWTBotCLabel clabel = (SWTBotCLabel)Context.getCurrentWidget(SWTBotCLabel.class);
    		return clabel.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the clabel\n\n"
            + "Example:\n"
            + "| Set Focus On CLAbel |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnCLAbel() throws Exception {
    		SWTBotCLabel clabel = (SWTBotCLabel)Context.getCurrentWidget(SWTBotCLabel.class);
    		clabel.setFocus();
    	}
	
}