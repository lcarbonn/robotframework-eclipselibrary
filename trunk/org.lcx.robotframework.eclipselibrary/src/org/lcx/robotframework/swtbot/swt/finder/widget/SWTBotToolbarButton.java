package org.lcx.robotframework.swtbot.swt.finder.widget;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;

public class SWTBotToolbarButton extends SWTBotWidget {

	public SWTBotToolbarButton(Object o) {
		super(o);
	}
	
	public SWTBotToolbarButton click() throws SWTBotBridgeException {
		widget = SWTBotBridge.callMethod(widget, "click");
		return this;
	}
	
}
