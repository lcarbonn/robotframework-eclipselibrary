package org.lcx.robotframework.swtbot.swt.finder.widget;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;

public class SWTBotText extends SWTBotWidget {

	public SWTBotText(Object o) {
		super(o);
	}
	
	public SWTBotText setText(String text) throws SWTBotBridgeException {
		widget = SWTBotBridge.callMethod(widget, "setText", text);
		return this;
	}
	

}
