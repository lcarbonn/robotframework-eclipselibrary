package org.lcx.robotframework.swtbot.swt.finder.widget;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;

public class SWTBotShell extends SWTBotWidget {
	

	public SWTBotShell(Object o) {
		super(o);
	}

	public void activate() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(widget, "activate");
	}

}
