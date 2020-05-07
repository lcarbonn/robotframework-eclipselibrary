/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBot;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;


public class SWTBotCheckBox extends AbstractSWTBotControl {

	public SWTBotCheckBox(Object o) {
		super(o);
	}

	//public volatile org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBot org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox.click()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBot click() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "click");
		return new AbstractSWTBot(o);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox.deselect()
	public void deselect() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "deselect");
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox.isChecked()
	public boolean isChecked() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isChecked");
		return b.booleanValue();
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox.select()
	public void select() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "select");
	}


}
