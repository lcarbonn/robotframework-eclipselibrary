package org.lcx.robotframework.swtbotplugin.service;

import org.eclipse.swtbot.swt.finder.SWTBot;

public class SwtbotService {

	public static SWTBot getSWTBot() {
		SWTBot bot = new SWTBot();
		return bot;
	}
}
