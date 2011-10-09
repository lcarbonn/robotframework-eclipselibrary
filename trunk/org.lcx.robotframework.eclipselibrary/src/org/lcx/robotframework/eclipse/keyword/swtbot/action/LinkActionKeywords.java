/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class LinkActionKeywords {

	@RobotKeyword("Click on the link\n\n"
            + "Example:\n"
            + "| Click Link |\n")
        public void clickLink() throws SWTBotBridgeException {
    		SWTBotLink link = (SWTBotLink)Context.getCurrentWidget(SWTBotLink.class);
    		link.click();
    	}
	
	@RobotKeyword("Is the link active\n\n"
            + "Example:\n"
            + "| Is Link Active |\n")
        public boolean isLinkActive() throws SWTBotBridgeException {
    		SWTBotLink link = (SWTBotLink)Context.getCurrentWidget(SWTBotLink.class);
    		return link.isActive();
    	}

	@RobotKeyword("Is the link enabled\n\n"
            + "Example:\n"
            + "| Is Link Enabled |\n")
        public boolean isLinkEnabled() throws SWTBotBridgeException {
    		SWTBotLink link = (SWTBotLink)Context.getCurrentWidget(SWTBotLink.class);
    		return link.isEnabled();
    	}

	@RobotKeyword("Is the link visible\n\n"
            + "Example:\n"
            + "| Is Link Visible |\n")
        public boolean isLinkVisible() throws SWTBotBridgeException {
    		SWTBotLink link = (SWTBotLink)Context.getCurrentWidget(SWTBotLink.class);
    		return link.isVisible();
    	}

	@RobotKeyword("Get the text of the link\n\n"
            + "Example:\n"
            + "| Get Link Text |\n")
        public String getLinkText() throws SWTBotBridgeException {
    		SWTBotLink link = (SWTBotLink)Context.getCurrentWidget(SWTBotLink.class);
    		return link.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the link\n\n"
            + "Example:\n"
            + "| Get Link Tooltip Text |\n")
        public String getLinkTooltipText() throws SWTBotBridgeException {
    		SWTBotLink link = (SWTBotLink)Context.getCurrentWidget(SWTBotLink.class);
    		return link.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the link\n\n"
            + "Example:\n"
            + "| Set Focus On Link |\n")
        public void setFocusOnLink() throws SWTBotBridgeException {
    		SWTBotLink link = (SWTBotLink)Context.getCurrentWidget(SWTBotLink.class);
    		link.setFocus();
    	}
	
	@RobotKeyword("Click on the link with given text of the hyperlink in case there are more than one hyperlinks\n\n"
            + "Example:\n"
            + "| Click On Link With HyperLink |\n")
    @ArgumentNames({"hyperLinkText"})
        public void clickOnLinkWithHyperLink(String hyperLinkText) throws SWTBotBridgeException {
    		SWTBotLink link = (SWTBotLink)Context.getCurrentWidget(SWTBotLink.class);
    		link.click(hyperLinkText);
    	}
}