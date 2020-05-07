/*
 * Copyright 2010 L. Carbonnaux
 * 2020 Nebula Nattable extension by J. Beaumont
 */
package org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;
import org.eclipse.swtbot.nebula.nattable.finder.widgets.Position;


public class SWTBotNatTable extends AbstractSWTBotControl {

	public SWTBotNatTable(Object o) {
		super(o);
	}

	//public java.lang.String org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable.getCellDataValueByPosition(int,int)
	public java.lang.String getCellDataValueByPosition(int param0, int param1) throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "getCellDataValueByPosition", param0, param1);
	}

	//public java.lang.String org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable.getCellDataValueByPosition(int,int)
	public java.lang.String setCellDataValueByPosition(int param0, int param1, String param2) throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "setCellDataValueByPosition", param0, param1, param2);
	}

	//public java.lang.String org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable.click(int,int)
	public void click(int param0, int param1) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "click", param0, param1);
	}
	
	//public java.lang.String org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable.doubleClick(int,int)
	public void doubleClick(int param0, int param1) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "doubleClick", param0, param1);
	}

	//public java.lang.String org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable.rightClick(int,int)
	public void rightClick(int param0, int param1) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "rightClick", param0, param1);
	}
	
	//public java.lang.String org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable.rightClick(int,int)
	public void scrollToColumnHeader(int param0, int param1, int param2, int param3) throws SWTBotBridgeException {
		Position position = new Position(param0, param1);
		Position returnPos = (Position)SWTBotBridge.callMethod(distantObject, "scrollToColumnHeader", position, param2, param3);
	}
	
	public void scrollViewport(int param0, int param1, int param2, int param3) throws SWTBotBridgeException {
		Position position = new Position(param0, param1);
		Position returnPos = (Position)SWTBotBridge.callMethod(distantObject, "scrollViewport", position, param2, param3);
	}
	
	//public java.lang.String org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable.preferredColumnCount()
	public int columnCount() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "columnCount");
		return i.intValue();
	}

	//public java.lang.String org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable.preferredRowCount()
	public int rowCount() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "rowCount");
		return i.intValue();
	}

	//public java.lang.String org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable.preferredColumnCount()
	public int preferredColumnCount() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "preferredColumnCount");
		return i.intValue();
	}

	//public java.lang.String org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable.preferredRowCount()
	public int preferredRowCount() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "preferredRowCount");
		return i.intValue();
	}
		
}
