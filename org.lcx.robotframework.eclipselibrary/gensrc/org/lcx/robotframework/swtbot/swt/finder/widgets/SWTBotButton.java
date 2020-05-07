/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;


public class SWTBotButton extends AbstractSWTBotControl {

	public SWTBotButton(Object o) {
		super(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton.click()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton click() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "click");
		return this;
	}


}
