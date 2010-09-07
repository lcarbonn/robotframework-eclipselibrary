/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.swt.finder.utils;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;


public class TableRow extends AbstractSWTBotControl {

	public TableRow(Object o) {
		super(o);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.utils.TableRow.add(java.lang.String)
	public void add(java.lang.String param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "add", param0);
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.utils.TableRow.columnCount()
	public int columnCount() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "columnCount");
		return i.intValue();
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.utils.TableRow.equals(java.lang.Object)
	//public java.lang.String org.lcx.robotframework.swtbot.swt.finder.utils.TableRow.get(int)
	public java.lang.String get(int param0) throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "get", param0);
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.utils.TableRow.hashCode()
	//public java.lang.String org.lcx.robotframework.swtbot.swt.finder.utils.TableRow.toString()

}
