package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;

public class SWTBotToolbarSeparatorButton extends SWTBotToolbarButton {

	public SWTBotToolbarSeparatorButton(Object o) {
		super(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarSeparatorButton org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarSeparatorButton.click()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarSeparatorButton click() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "click");
		return this;
	}


}
