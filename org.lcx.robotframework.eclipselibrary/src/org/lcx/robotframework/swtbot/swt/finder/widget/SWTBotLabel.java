package org.lcx.robotframework.swtbot.swt.finder.widget;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;

public class SWTBotLabel extends SWTBotWidget {

	public SWTBotLabel(Object o) throws SWTBotBridgeException {
		super(o);
		// TODO Auto-generated constructor stub
	}
	
	public void setFocus() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(widget, "setFocus");
	}
	

}
