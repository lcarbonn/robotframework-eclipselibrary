package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;


public class SWTBotToggleButton extends AbstractSWTBotControl {

	public SWTBotToggleButton(Object o) {
		super(o);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton.unpress()
	public void unpress() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "unpress");
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton.isPressed()
	public boolean isPressed() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isPressed");
		return b.booleanValue();
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton.press()
	public void press() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "press");
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton.click()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton click() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "click");
		return this;
	}


}
