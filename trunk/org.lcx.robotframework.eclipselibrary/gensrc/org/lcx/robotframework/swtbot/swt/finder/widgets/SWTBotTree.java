package org.lcx.robotframework.swtbot.swt.finder.widgets;


import java.util.List;

import org.lcx.robotframework.swtbot.swt.finder.utils.TableCollection;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;


public class SWTBotTree extends AbstractSWTBotControl {

	public SWTBotTree(Object o) {
		super(o);
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree.selectionCount()
	public int selectionCount() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "selectionCount");
		return i.intValue();
	}

	//public java.lang.String org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree.cell(int,java.lang.String)
	public java.lang.String cell(int param0, java.lang.String param1) throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "cell", param0, param1);
	}

	//public java.lang.String org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree.cell(int,int)
	public java.lang.String cell(int param0, int param1) throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "cell", param0, param1);
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree.rowCount()
	public int rowCount() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "rowCount");
		return i.intValue();
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree.collapseNode(java.lang.String) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem collapseNode(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "collapseNode", param0);
		return new SWTBotTreeItem(o);
	}

	//public transient org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree.expandNode(java.lang.String[]) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem expandNode(java.lang.String[] param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethodWithArray(distantObject, "expandNode", (Object[])param0);
		return new SWTBotTreeItem(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree.expandNode(java.lang.String,boolean) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem expandNode(java.lang.String param0, boolean param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "expandNode", param0, param1);
		return new SWTBotTreeItem(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem[] org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree.getAllItems()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem[] getAllItems() throws SWTBotBridgeException {
		SWTBotTreeItem[] o = (SWTBotTreeItem[])SWTBotBridge.callMethodReturnSWTBotArray(distantObject, "getItems", SWTBotTreeItem.class);
		return o;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree.getTreeItem(java.lang.String) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem getTreeItem(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "getTreeItem", param0);
		return new SWTBotTreeItem(o);
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree.hasItems()
	public boolean hasItems() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "hasItems");
		return b.booleanValue();
	}

	//public transient org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree.select(org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem[])
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree select(org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem[] param0) throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethodWithArray(distantObject, "select", (Object[])param0);
		return this;
	}

	//public transient org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree.select(java.lang.String[])
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree select(java.lang.String[] param0) throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethodWithArray(distantObject, "select", (Object[])param0);
		return this;
	}

	//public transient org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree.select(int[])
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree select(int[] param0) throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethodWithArray(distantObject, "select", (int[])param0);
		return this;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.utils.TableCollection org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree.selection()
	public org.lcx.robotframework.swtbot.swt.finder.utils.TableCollection selection() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "selection");
		return new TableCollection(o);
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree.visibleRowCount()
	public int visibleRowCount() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "visibleRowCount");
		return i.intValue();
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree.columnCount()
	public int columnCount() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "columnCount");
		return i.intValue();
	}

	//public java.util.List org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree.columns()
	@SuppressWarnings("unchecked")
	public java.util.List<java.lang.String> columns() throws SWTBotBridgeException {
		return (List)SWTBotBridge.callMethodReturnPrimitiveList(distantObject, "columns");
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree.unselect()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree unselect() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "unselect");
		return this;
	}


}
