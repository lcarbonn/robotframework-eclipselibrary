/*
 * Copyright 2013 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart;
import java.util.List;
import org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefViewer;


public class SWTBotGefEditor extends SWTBotEditor {

	public SWTBotGefEditor(Object o) {
		super(o);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.activateDefaultTool()
	public void activateDefaultTool() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "activateDefaultTool");
	}

	//public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.activateTool(java.lang.String) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor activateTool(java.lang.String param0) throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "activateTool", param0);
		return this;
	}

	//public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.activateTool(java.lang.String,int) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor activateTool(java.lang.String param0, int param1) throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "activateTool", param0, param1);
		return this;
	}

	//public void org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.clear()
	public void clear() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "clear");
	}

	//public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.clickContextMenu(java.lang.String) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor clickContextMenu(java.lang.String param0) throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "clickContextMenu", param0);
		return this;
	}

	//public void org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.click(java.lang.String)
	public void click(java.lang.String param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "click", param0);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.click(org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart)
	public void click(org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "click", param0);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.click(int,int)
	public void click(int param0, int param1) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "click", param0, param1);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.directEditType(java.lang.String) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public void directEditType(java.lang.String param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "directEditType", param0);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.doubleClick(java.lang.String)
	public void doubleClick(java.lang.String param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "doubleClick", param0);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.doubleClick(org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart)
	public void doubleClick(org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "doubleClick", param0);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.doubleClick(int,int)
	public void doubleClick(int param0, int param1) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "doubleClick", param0, param1);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.drag(java.lang.String,int,int)
	public void drag(java.lang.String param0, int param1, int param2) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "drag", param0, param1, param2);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.drag(org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart,int,int)
	public void drag(org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart param0, int param1, int param2) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "drag", param0, param1, param2);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.drag(int,int,int,int)
	public void drag(int param0, int param1, int param2, int param3) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "drag", param0, param1, param2, param3);
	}

	//public java.util.List org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.editParts(org.hamcrest.Matcher) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	//public org.eclipse.gef.palette.ToolEntry org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.getActiveTool()
	// TODO : To Complete
//	public org.eclipse.gef.palette.ToolEntry getActiveTool() throws SWTBotBridgeException {
//		//TODO: class=class org.eclipse.gef.palette.ToolEntry
//		 return null;
//	}

	//public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.getEditPart(java.lang.String)
	public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart getEditPart(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "getEditPart", param0);
		return new SWTBotGefEditPart(o);
	}

	//public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.getEditpart(java.lang.String,java.util.List)
	public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart getEditpart(java.lang.String param0, java.util.List<org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart> param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "getEditpart", param0, param1);
		return new SWTBotGefEditPart(o);
	}

	//public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefViewer org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.getSWTBotGefViewer()
	public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefViewer getSWTBotGefViewer() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "getSWTBotGefViewer");
		return new SWTBotGefViewer(o);
	}

	//public boolean org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.isActive()
	public boolean isActive() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isActive");
		return b.booleanValue();
	}

	//public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.mainEditPart() throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart mainEditPart() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "mainEditPart");
		return new SWTBotGefEditPart(o);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.mouseDrag(java.lang.String,int,int)
	public void mouseDrag(java.lang.String param0, int param1, int param2) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "mouseDrag", param0, param1, param2);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.mouseDrag(int,int,int,int)
	public void mouseDrag(int param0, int param1, int param2, int param3) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "mouseDrag", param0, param1, param2, param3);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.mouseMoveDoubleClick(java.lang.String)
	public void mouseMoveDoubleClick(java.lang.String param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "mouseMoveDoubleClick", param0);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.mouseMoveDoubleClick(int,int)
	public void mouseMoveDoubleClick(int param0, int param1) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "mouseMoveDoubleClick", param0, param1);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.mouseMoveLeftClick(java.lang.String)
	public void mouseMoveLeftClick(java.lang.String param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "mouseMoveLeftClick", param0);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.mouseMoveLeftClick(int,int)
	public void mouseMoveLeftClick(int param0, int param1) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "mouseMoveLeftClick", param0, param1);
	}

	//public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.rootEditPart() throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart rootEditPart() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "rootEditPart");
		return new SWTBotGefEditPart(o);
	}

	//public transient org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.select(org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart[])
	public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor select(org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart[] param0) throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethodWithArray(distantObject, "select", (Object[])param0);
		return this;
	}

	//public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.select(java.lang.String)
	public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor select(java.lang.String param0) throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "select", param0);
		return this;
	}

	//public java.util.List org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.selectedEditParts()
	@SuppressWarnings("unchecked")
	public java.util.List<org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart> selectedEditParts() throws SWTBotBridgeException {
		return (List)SWTBotBridge.callMethodReturnPrimitiveList(distantObject, "selectedEditParts");

	}

	//public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.select(java.util.Collection)
	public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor select(java.util.Collection<org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart> param0) throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "select", param0);
		return this;
	}

	//public void org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor.setFocus()
	public void setFocus() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "setFocus");
	}


}
