/*
 * Copyright 2013 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;
import java.util.List;


public class SWTBotGefEditPart extends AbstractSWTBotControl {

	public SWTBotGefEditPart(Object o) {
		super(o);
	}

	//public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart.activateDirectEdit()
	public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart activateDirectEdit() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "activateDirectEdit");
		return this;
	}

	//public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart.activateDirectEdit(java.lang.Object)
	public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart activateDirectEdit(java.lang.Object param0) throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "activateDirectEdit", param0);
		return this;
	}

	//public java.util.List org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart.children()
	@SuppressWarnings("unchecked")
	public java.util.List<org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart> children() throws SWTBotBridgeException {
		return (List)SWTBotBridge.callMethodReturnPrimitiveList(distantObject, "children");

	}

	//public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart.click()
	public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart click() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "click");
		return this;
	}

	//public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart.click(org.eclipse.draw2d.geometry.Point)
	// TODO : To Complete
//	public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart click(org.eclipse.draw2d.geometry.Point param0) throws SWTBotBridgeException {
//		distantObject = SWTBotBridge.callMethod(distantObject, "click", param0);
//		return this;
//	}

	//public java.util.List org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart.descendants(org.hamcrest.Matcher)
	//public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart.doubleClick()
	public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart doubleClick() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "doubleClick");
		return this;
	}

	//public void org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart.focus()
	public void focus() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "focus");
	}

	//public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart.parent()
	public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart parent() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "parent");
		return this;
	}

	//public org.eclipse.gef.EditPart org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart.part()
	// TODO : To Complete
//	public org.eclipse.gef.EditPart part() throws SWTBotBridgeException {
//		//TODO: class=interface org.eclipse.gef.EditPart
//		 return null;
//	}

	//public void org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart.resize(int,int,int)
	public void resize(int param0, int param1, int param2) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "resize", param0, param1, param2);
	}

	//public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart.select()
	public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart select() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "select");
		return this;
	}

	//public java.util.List org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart.sourceConnections()
	@SuppressWarnings("unchecked")
	public java.util.List<org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefConnectionEditPart> sourceConnections() throws SWTBotBridgeException {
		return (List)SWTBotBridge.callMethodReturnPrimitiveList(distantObject, "sourceConnections");

	}

	//public java.util.List org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart.targetConnections()
	@SuppressWarnings("unchecked")
	public java.util.List<org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefConnectionEditPart> targetConnections() throws SWTBotBridgeException {
		return (List)SWTBotBridge.callMethodReturnPrimitiveList(distantObject, "targetConnections");

	}

	//public java.lang.String org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart.toString()

}
