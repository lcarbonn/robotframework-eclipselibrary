/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;

public class SWTBotToolbarToggleButton extends SWTBotToolbarButton {

	public SWTBotToolbarToggleButton(Object o) {
		super(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton.click()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton click() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "click");
		return this;
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton.deselect()
	public void deselect() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "deselect");
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton.isChecked()
	public boolean isChecked() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isChecked");
		return b.booleanValue();
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton.select()
	public void select() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "select");
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton.toggle()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton toggle() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "toggle");
		return this;
	}


}
