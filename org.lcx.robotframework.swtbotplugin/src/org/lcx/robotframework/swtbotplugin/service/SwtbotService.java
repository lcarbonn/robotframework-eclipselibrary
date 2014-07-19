/*
 * Copyright 2014 L. Carbonnaux
 */
package org.lcx.robotframework.swtbotplugin.service;

import org.eclipse.swtbot.eclipse.gef.finder.SWTGefBot;
import org.eclipse.swtbot.swt.finder.SWTBot;

public class SwtbotService {

	/**
	 * Method used by StartBridge keyword for SWT application (non RCP)
	 * @return
	 */
	public static SWTBot getSWTBot() {
		SWTBot bot = new SWTBot();
		return bot;
	}

	/**
	 * Method used by StartBridge keyword for SWT application (non RCP)
	 * @return
	 */
	public static SWTBot getSWTGefBot() {
		SWTGefBot bot = new SWTGefBot();
		return bot;
	}
	
}
