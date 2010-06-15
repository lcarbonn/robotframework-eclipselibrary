package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;


public class SWTBotToolbarPushButton extends AbstractSWTBotControl {

	public SWTBotToolbarPushButton(Object o) {
		super(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarPushButton org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarPushButton.click()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarPushButton click() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "click");
		return this;
	}


}
