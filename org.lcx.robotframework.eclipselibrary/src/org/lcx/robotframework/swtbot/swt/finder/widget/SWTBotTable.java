package org.lcx.robotframework.swtbot.swt.finder.widget;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;

public class SWTBotTable extends SWTBotWidget {

	public SWTBotTable(Object o) {
		super(o);
	}
	
	public void select(String... items) throws SWTBotBridgeException {
		SWTBotBridge.callMethodWithArray(widget, "select", (Object[])items);
	}

}
