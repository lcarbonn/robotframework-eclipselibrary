/*
 * Copyright 2013 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.gef.action;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefView;
import org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefViewer;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class GefViewActionKeywords {

	@RobotKeyword("Find the wrapped SWTBotGefViewer instance of the current Gef View\n\n"
            + "Example:\n"
            + "| Find SWTBotGefViewer Of Gef View |\n")
    public SWTBotGefViewer findSWTBotGefViewerOfGefView() throws SWTBotBridgeException{
		SWTBotGefView view = (SWTBotGefView)Context.getCurrentWidget(SWTBotGefView.class);
		SWTBotGefViewer ep = view.getSWTBotGefViewer();
		Context.setCurrentWidget(ep);
    	return ep;
	}

}