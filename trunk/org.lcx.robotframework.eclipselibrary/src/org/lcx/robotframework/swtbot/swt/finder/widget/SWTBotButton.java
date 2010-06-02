package org.lcx.robotframework.swtbot.swt.finder.widget;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;

public class SWTBotButton extends SWTBotWidget {

	public SWTBotButton(Object o) {
		super(o);
	}
	
	public SWTBotButton click() throws SWTBotBridgeException {
		widget = SWTBotBridge.callMethod(widget, "click");
		return this;
	}

}
