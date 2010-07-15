package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;

public class SWTBotToolbarPushButton extends SWTBotToolbarButton {

	public SWTBotToolbarPushButton(Object o) {
		super(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarPushButton org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarPushButton.click()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarPushButton click() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "click");
		return this;
	}


}
