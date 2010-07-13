package org.lcx.robotframework.eclipse.keyword.swtbot.actionfact;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ShellActionKeywords {

	@RobotKeyword("Activate the shell\n\n"
            + "Example:\n"
            + "| Activate Shell |\n")
        public void activateShell() throws Exception {
    		SWTBotShell shell = (SWTBotShell)Context.getCurrentWidget(SWTBotShell.class);
    		shell.activate();
    	}
	
	@RobotKeyword("Is the shell active\n\n"
            + "Example:\n"
            + "| Is Shell Active |\n")
        public boolean isShellActive() throws Exception {
    		SWTBotShell shell = (SWTBotShell)Context.getCurrentWidget(SWTBotShell.class);
    		return shell.isActive();
    	}

	@RobotKeyword("Is the shell enabled\n\n"
            + "Example:\n"
            + "| Is Shell Enabled |\n")
        public boolean isShellEnabled() throws Exception {
    		SWTBotShell shell = (SWTBotShell)Context.getCurrentWidget(SWTBotShell.class);
    		return shell.isEnabled();
    	}

	@RobotKeyword("Is the shell visible\n\n"
            + "Example:\n"
            + "| Is Shell Visible |\n")
        public boolean isShellVisible() throws Exception {
    		SWTBotShell shell = (SWTBotShell)Context.getCurrentWidget(SWTBotShell.class);
    		return shell.isVisible();
    	}

	@RobotKeyword("Get the text of the shell\n\n"
            + "Example:\n"
            + "| Get Shell Text |\n")
//    @ArgumentNames({"text"})
        public String getShellText() throws Exception {
    		SWTBotShell shell = (SWTBotShell)Context.getCurrentWidget(SWTBotShell.class);
    		return shell.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the shell\n\n"
            + "Example:\n"
            + "| Get Shell Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getShellTooltipText() throws Exception {
    		SWTBotShell shell = (SWTBotShell)Context.getCurrentWidget(SWTBotShell.class);
    		return shell.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the shell\n\n"
            + "Example:\n"
            + "| Set Focus On Shell |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnShell() throws Exception {
    		SWTBotShell shell = (SWTBotShell)Context.getCurrentWidget(SWTBotShell.class);
    		shell.setFocus();
    	}
	
	@RobotKeyword("Is the shell open\n\n"
            + "Example:\n"
            + "| Is Shell Open |\n")
        public boolean isShellOpen() throws Exception {
    		SWTBotShell shell = (SWTBotShell)Context.getCurrentWidget(SWTBotShell.class);
    		return shell.isOpen();
    	}

	@RobotKeyword("Close the shell\n\n"
            + "Example:\n"
            + "| Close Shell |\n")
        public void closeShell() throws Exception {
    		SWTBotShell shell = (SWTBotShell)Context.getCurrentWidget(SWTBotShell.class);
    		shell.close();
    	}

}