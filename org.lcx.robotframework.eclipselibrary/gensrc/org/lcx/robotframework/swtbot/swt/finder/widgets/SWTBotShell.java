/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.swtbot.swt.finder.SWTBot;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;


public class SWTBotShell extends AbstractSWTBotControl {

	public SWTBotShell(Object o) {
		super(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell.activate() throws org.lcx.robotframework.swtbot.swt.finder.widgets.TimeoutException
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell activate() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "activate");
		return this;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.SWTBot org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell.bot()
	public org.lcx.robotframework.swtbot.swt.finder.SWTBot bot() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "bot");
		return new SWTBot(o);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell.close() throws org.lcx.robotframework.swtbot.swt.finder.widgets.TimeoutException
	public void close() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "close");
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell.isActive()
	public boolean isActive() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isActive");
		return b.booleanValue();
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell.isOpen()
	public boolean isOpen() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isOpen");
		return b.booleanValue();
	}


}
