/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;


public class SWTBotCombo extends AbstractSWTBotControl {

	public SWTBotCombo(Object o) {
		super(o);
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo.itemCount()
	public int itemCount() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "itemCount");
		return i.intValue();
	}

	//public java.lang.String[] org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo.items()
	public java.lang.String[] items() throws SWTBotBridgeException {
		String[] o = (String[])SWTBotBridge.callMethod(distantObject, "items");
		return o;
	}

	//public java.lang.String org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo.selection()
	public java.lang.String selection() throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "selection");
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo.selectionIndex()
	public int selectionIndex() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "selectionIndex");
		return i.intValue();
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo.setSelection(java.lang.String)
	public void setSelection(java.lang.String param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "setSelection", param0);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo.setSelection(int)
	public void setSelection(int param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "setSelection", param0);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo.setText(java.lang.String)
	public void setText(java.lang.String param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "setText", param0);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo.typeText(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo typeText(java.lang.String param0) throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "typeText", param0);
		return this;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo.typeText(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo typeText(java.lang.String param0, int param1) throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "typeText", param0, param1);
		return this;
	}


}
