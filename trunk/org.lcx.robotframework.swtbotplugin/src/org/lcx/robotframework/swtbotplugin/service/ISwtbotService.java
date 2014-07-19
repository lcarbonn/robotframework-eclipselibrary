/*
 * Copyright 2014 L. Carbonnaux
 */
package org.lcx.robotframework.swtbotplugin.service;

import org.eclipse.swtbot.eclipse.gef.finder.SWTGefBot;
import org.eclipse.swtbot.swt.finder.SWTBot;

public interface ISwtbotService {

	public SWTBot getSWTBot();
	public SWTGefBot getSWTGefBot();
	
}
