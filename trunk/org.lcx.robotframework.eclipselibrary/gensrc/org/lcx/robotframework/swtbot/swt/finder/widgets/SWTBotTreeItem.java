package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.swtbot.swt.finder.utils.TableRow;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;


public class SWTBotTreeItem extends AbstractSWTBotControl {

	public SWTBotTreeItem(Object o) {
		super(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.contextMenu(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu contextMenu(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "contextMenu", param0);
		return new SWTBotMenu(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem[] org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.getItems()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem[] getItems() throws SWTBotBridgeException {
//TODO: class=class [Lorg.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem;
		 return null;
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.isChecked()
	public boolean isChecked() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isChecked");
		return b.booleanValue();
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.doubleClick()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem doubleClick() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "doubleClick");
		return this;
	}

	//public java.lang.String org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.cell(int,int)
	public java.lang.String cell(int param0, int param1) throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "cell", param0, param1);
	}

	//public java.lang.String org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.cell(int)
	public java.lang.String cell(int param0) throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "cell", param0);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.utils.TableRow org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.row()
	public org.lcx.robotframework.swtbot.swt.finder.utils.TableRow row() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "row");
		return new TableRow(o);
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.rowCount()
	public int rowCount() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "rowCount");
		return i.intValue();
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.toggleCheck()
	public void toggleCheck() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "toggleCheck");
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.uncheck()
	public void uncheck() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "uncheck");
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.collapseNode(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem collapseNode(java.lang.String param0) throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "collapseNode", param0);
		return this;
	}

	//public transient org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.expandNode(java.lang.String[])
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem expandNode(java.lang.String[] param0) throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "expandNode", (Object[])param0);
		return this;
	}

	//public java.util.List org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.getNodes(java.lang.String)
	public java.util.List<org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem> getNodes(java.lang.String param0) throws SWTBotBridgeException {
//TODO: type=java.util.List<org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem>
		 return null;
	}

	//public java.util.List org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.getNodes()
	public java.util.List<java.lang.String> getNodes() throws SWTBotBridgeException {
//TODO: type=java.util.List<java.lang.String>
		 return null;
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.check()
	public void check() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "check");
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.isEnabled()
	public boolean isEnabled() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isEnabled");
		return b.booleanValue();
	}

	//public java.lang.String org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.getText()
	public java.lang.String getText() throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "getText");
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.collapse()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem collapse() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "collapse");
		return this;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.expand()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem expand() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "expand");
		return this;
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.isSelected()
	public boolean isSelected() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isSelected");
		return b.booleanValue();
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.select()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem select() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "select");
		return this;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.select(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem select(java.lang.String param0) throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "select", param0);
		return this;
	}

	//public transient org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.select(java.lang.String[])
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem select(java.lang.String[] param0) throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "select", (Object[])param0);
		return this;
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.isExpanded()
	public boolean isExpanded() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isExpanded");
		return b.booleanValue();
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.getNode(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem getNode(java.lang.String param0) throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "getNode", param0);
		return this;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.getNode(int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem getNode(int param0) throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "getNode", param0);
		return this;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.getNode(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem getNode(java.lang.String param0, int param1) throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "getNode", param0, param1);
		return this;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem.click()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTreeItem click() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "click");
		return this;
	}


}
