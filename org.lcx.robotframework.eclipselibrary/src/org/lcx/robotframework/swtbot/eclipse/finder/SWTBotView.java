package org.lcx.robotframework.swtbot.eclipse.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widget.SWTBotToolbarButton;
import org.lcx.robotframework.swtbot.swt.finder.widget.SWTBotWidget;

public class SWTBotView extends SWTBotWidget {

	public SWTBotView(Object o) {
		super(o);
	}
	
	public SWTBotToolbarButton toolbarButton(String label) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(widget, "toolbarButton",label);
		return new SWTBotToolbarButton(o);
	}
	
}
