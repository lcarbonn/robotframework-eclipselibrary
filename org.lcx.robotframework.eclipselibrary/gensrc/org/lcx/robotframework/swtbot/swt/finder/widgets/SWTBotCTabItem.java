/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;


public class SWTBotCTabItem extends AbstractSWTBotControl {

	public SWTBotCTabItem(Object o) {
		super(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem.activate() throws org.lcx.robotframework.swtbot.swt.finder.widgets.TimeoutException
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem activate() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "activate");
		return this;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem.close()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem close() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "close");
		return this;
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem.isActive()
	public boolean isActive() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isActive");
		return b.booleanValue();
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem.isEnabled()
	public boolean isEnabled() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isEnabled");
		return b.booleanValue();
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem.show()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem show() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "show");
		return this;
	}


}
