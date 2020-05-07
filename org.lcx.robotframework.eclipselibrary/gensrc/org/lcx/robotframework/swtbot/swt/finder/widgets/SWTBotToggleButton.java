/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBot;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;


public class SWTBotToggleButton extends AbstractSWTBotControl {

	public SWTBotToggleButton(Object o) {
		super(o);
	}

	//public volatile org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBot org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton.click()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBot click() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "click");
		return new AbstractSWTBot(o);
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

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton.unpress()
	public void unpress() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "unpress");
	}


}
