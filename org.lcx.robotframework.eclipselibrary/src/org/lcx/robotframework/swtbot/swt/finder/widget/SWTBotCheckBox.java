package org.lcx.robotframework.swtbot.swt.finder.widget;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;

public class SWTBotCheckBox extends SWTBotWidget {

	public SWTBotCheckBox(Object o) {
		super(o);
		// TODO Auto-generated constructor stub
	}
	
	public SWTBotCheckBox click() throws SWTBotBridgeException {
		widget = SWTBotBridge.callMethod(widget, "click");
		return this;
	}


}
