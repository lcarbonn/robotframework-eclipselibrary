/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.swt.finder.utils;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.utils.TableRow;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;


public class TableCollection extends AbstractSWTBotControl {

	public TableCollection(Object o) {
		super(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.utils.TableCollection org.lcx.robotframework.swtbot.swt.finder.utils.TableCollection.add(org.lcx.robotframework.swtbot.swt.finder.utils.TableRow)
	public org.lcx.robotframework.swtbot.swt.finder.utils.TableCollection add(org.lcx.robotframework.swtbot.swt.finder.utils.TableRow param0) throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "add", param0);
		return this;
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.utils.TableCollection.columnCount()
	public int columnCount() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "columnCount");
		return i.intValue();
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.utils.TableCollection.equals(java.lang.Object)
	//public org.lcx.robotframework.swtbot.swt.finder.utils.TableRow org.lcx.robotframework.swtbot.swt.finder.utils.TableCollection.get(int)
	public org.lcx.robotframework.swtbot.swt.finder.utils.TableRow get(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "get", param0);
		return new TableRow(o);
	}

	//public java.lang.String org.lcx.robotframework.swtbot.swt.finder.utils.TableCollection.get(int,int)
	public java.lang.String get(int param0, int param1) throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "get", param0, param1);
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.utils.TableCollection.hashCode()
	//public int org.lcx.robotframework.swtbot.swt.finder.utils.TableCollection.rowCount()
	public int rowCount() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "rowCount");
		return i.intValue();
	}

	//public java.lang.String org.lcx.robotframework.swtbot.swt.finder.utils.TableCollection.toString()

}
