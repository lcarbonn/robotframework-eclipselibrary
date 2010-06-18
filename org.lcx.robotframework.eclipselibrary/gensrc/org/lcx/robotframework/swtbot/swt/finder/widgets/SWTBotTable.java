package org.lcx.robotframework.swtbot.swt.finder.widgets;


import java.util.List;

import org.lcx.robotframework.swtbot.swt.finder.utils.TableCollection;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;


public class SWTBotTable extends AbstractSWTBotControl {

	public SWTBotTable(Object o) {
		super(o);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable.doubleClick(int,int)
	public void doubleClick(int param0, int param1) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "doubleClick", param0, param1);
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable.selectionCount()
	public int selectionCount() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "selectionCount");
		return i.intValue();
	}

	//public java.lang.String org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable.cell(int,java.lang.String)
	public java.lang.String cell(int param0, java.lang.String param1) throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "cell", param0, param1);
	}

	//public java.lang.String org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable.cell(int,int)
	public java.lang.String cell(int param0, int param1) throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "cell", param0, param1);
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable.containsItem(java.lang.String)
	public boolean containsItem(java.lang.String param0) throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "containsItem", param0);
		return b.booleanValue();
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableItem org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable.getTableItem(java.lang.String) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableItem getTableItem(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "getTableItem", param0);
		return new SWTBotTableItem(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableItem org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable.getTableItem(int) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableItem getTableItem(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "getTableItem", param0);
		return new SWTBotTableItem(o);
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable.indexOfColumn(java.lang.String)
	public int indexOfColumn(java.lang.String param0) throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "indexOfColumn", param0);
		return i.intValue();
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable.rowCount()
	public int rowCount() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "rowCount");
		return i.intValue();
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable.indexOf(java.lang.String)
	public int indexOf(java.lang.String param0) throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "indexOf", param0);
		return i.intValue();
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable.indexOf(java.lang.String,int)
	public int indexOf(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "indexOf", param0, param1);
		return i.intValue();
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable.indexOf(java.lang.String,java.lang.String)
	public int indexOf(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "indexOf", param0, param1);
		return i.intValue();
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableColumn org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable.header(java.lang.String) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTableColumn header(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "header", param0);
		return new SWTBotTableColumn(o);
	}

	//public transient void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable.select(int[])
	public void select(int[] param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethodWithArray(distantObject, "select", (int[])param0);
	}

	//public transient void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable.select(java.lang.String[])
	public void select(java.lang.String[] param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethodWithArray(distantObject, "select", (Object[])param0);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.utils.TableCollection org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable.selection()
	public org.lcx.robotframework.swtbot.swt.finder.utils.TableCollection selection() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "selection");
		return new TableCollection(o);
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable.columnCount()
	public int columnCount() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "columnCount");
		return i.intValue();
	}

	//public java.util.List org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable.columns()
	@SuppressWarnings("unchecked")
	public java.util.List<java.lang.String> columns() throws SWTBotBridgeException {
		return (List)SWTBotBridge.callMethodReturnPrimitiveList(distantObject, "columns");
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable.unselect()
	public void unselect() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "unselect");
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable.click(int,int)
	public void click(int param0, int param1) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "click", param0, param1);
	}


}
