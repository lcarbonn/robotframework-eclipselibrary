package org.lcx.robotframework.swtbot.eclipse.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widget.SWTBotWidget;

public class SWTBotPerspective extends SWTBotWidget {

	public SWTBotPerspective(Object o) {
		super(o);
	}
	
	public void activate() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(widget, "activate");
	}
}
