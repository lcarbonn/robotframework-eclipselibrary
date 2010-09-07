/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;


public class SWTBotTabItem extends AbstractSWTBotControl {

	public SWTBotTabItem(Object o) {
		super(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem.activate() throws org.lcx.robotframework.swtbot.swt.finder.widgets.TimeoutException
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem activate() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "activate");
		return this;
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem.isActive()
	public boolean isActive() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isActive");
		return b.booleanValue();
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem.isEnabled()
	public boolean isEnabled() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isEnabled");
		return b.booleanValue();
	}


}
