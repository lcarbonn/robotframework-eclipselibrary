package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class LabelActionKeywords {

	@RobotKeyword("Get the label alignment\n\n"
            + "Example:\n"
            + "| Get Label Alignment |\n")
        public int getLabelAlignment() throws Exception {
    		SWTBotLabel label = (SWTBotLabel)Context.getCurrentWidget(SWTBotLabel.class);
    		return label.alignment();
    	}

	@RobotKeyword("Is the label active\n\n"
            + "Example:\n"
            + "| Is Label Active |\n")
        public boolean isLabelActive() throws Exception {
    		SWTBotLabel label = (SWTBotLabel)Context.getCurrentWidget(SWTBotLabel.class);
    		return label.isActive();
    	}

	@RobotKeyword("Is the label enabled\n\n"
            + "Example:\n"
            + "| Is Label Enabled |\n")
        public boolean isLabelEnabled() throws Exception {
    		SWTBotLabel label = (SWTBotLabel)Context.getCurrentWidget(SWTBotLabel.class);
    		return label.isEnabled();
    	}

	@RobotKeyword("Is the label visible\n\n"
            + "Example:\n"
            + "| Is Label Visible |\n")
        public boolean isLabelVisible() throws Exception {
    		SWTBotLabel label = (SWTBotLabel)Context.getCurrentWidget(SWTBotLabel.class);
    		return label.isVisible();
    	}

	@RobotKeyword("Get the text of the label\n\n"
            + "Example:\n"
            + "| Get Label Text |\n")
//    @ArgumentNames({"text"})
        public String getLabelText() throws Exception {
    		SWTBotLabel label = (SWTBotLabel)Context.getCurrentWidget(SWTBotLabel.class);
    		return label.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the label\n\n"
            + "Example:\n"
            + "| Get Label Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getLabelTooltipText() throws Exception {
    		SWTBotLabel label = (SWTBotLabel)Context.getCurrentWidget(SWTBotLabel.class);
    		return label.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the label\n\n"
            + "Example:\n"
            + "| Set Focus On Label |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnLabel() throws Exception {
    		SWTBotLabel label = (SWTBotLabel)Context.getCurrentWidget(SWTBotLabel.class);
    		label.setFocus();
    	}
	
}