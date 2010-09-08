package org.lcx.robotframework.swtbotplugin.service;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;

public class SwtbotService implements ISwtbotService {

	public SWTWorkbenchBot getSWTWorkbenchBot() {
		SWTWorkbenchBot bot = new SWTWorkbenchBot();
		return bot;
	}
	
}
