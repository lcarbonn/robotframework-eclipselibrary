package org.lcx.robotframework.swtbot.swt.finder.widget;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;

public class SWTBotList extends SWTBotWidget {

	public SWTBotList(Object o) {
		super(o);
	}
	
	public void select(String... items) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(widget, "select", (Object[])items);
	}
}
