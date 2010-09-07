/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;


public class SWTBotTableItem extends AbstractSWTBotControl {

	public SWTBotTableItem(Object o) {
		super(o);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableItem.check()
	public void check() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "check");
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableItem org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableItem.click()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableItem click() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "click");
		return this;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableItem.contextMenu(java.lang.String) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu contextMenu(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "contextMenu", param0);
		return new SWTBotMenu(o);
	}

	//public java.lang.String org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableItem.getText()
	public java.lang.String getText() throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "getText");
	}

	//public java.lang.String org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableItem.getText(int)
	public java.lang.String getText(int param0) throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "getText", param0);
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableItem.isChecked()
	public boolean isChecked() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isChecked");
		return b.booleanValue();
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableItem.isEnabled()
	public boolean isEnabled() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isEnabled");
		return b.booleanValue();
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableItem.isGrayed()
	public boolean isGrayed() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isGrayed");
		return b.booleanValue();
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableItem org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableItem.select()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableItem select() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "select");
		return this;
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableItem.toggleCheck()
	public void toggleCheck() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "toggleCheck");
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableItem.uncheck()
	public void uncheck() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "uncheck");
	}


}
