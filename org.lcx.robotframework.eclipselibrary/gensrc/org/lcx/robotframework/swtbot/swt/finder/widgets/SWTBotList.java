/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;


public class SWTBotList extends AbstractSWTBotControl {

	public SWTBotList(Object o) {
		super(o);
	}

	//public java.lang.String[] org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList.getItems()
	public java.lang.String[] getItems() throws SWTBotBridgeException {
		String[] o = (String[])SWTBotBridge.callMethod(distantObject, "getItems");
		return o;
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList.indexOf(java.lang.String)
	public int indexOf(java.lang.String param0) throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "indexOf", param0);
		return i.intValue();
	}

	//public java.lang.String org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList.itemAt(int)
	public java.lang.String itemAt(int param0) throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "itemAt", param0);
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList.itemCount()
	public int itemCount() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "itemCount");
		return i.intValue();
	}

	//public transient void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList.select(int[])
	public void select(int[] param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethodWithArray(distantObject, "select", (int[])param0);
	}

	//public transient void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList.select(java.lang.String[])
	public void select(java.lang.String[] param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethodWithArray(distantObject, "select", (Object[])param0);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList.select(java.lang.String)
	public void select(java.lang.String param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "select", param0);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList.select(int)
	public void select(int param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "select", param0);
	}

	//public java.lang.String[] org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList.selection()
	public java.lang.String[] selection() throws SWTBotBridgeException {
		String[] o = (String[])SWTBotBridge.callMethod(distantObject, "selection");
		return o;
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList.selectionCount()
	public int selectionCount() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "selectionCount");
		return i.intValue();
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList.unselect()
	public void unselect() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "unselect");
	}


}
