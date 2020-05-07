/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.eclipse.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.swtbot.commons.AbstractSWTBotObject;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarPushButton;
import org.lcx.robotframework.swtbot.swt.finder.SWTBot;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton;
import java.util.List;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton;


public class SWTBotWorkbenchPart extends AbstractSWTBotObject {

	public SWTBotWorkbenchPart(Object o) {
		super(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.SWTBot org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.bot()
	public org.lcx.robotframework.swtbot.swt.finder.SWTBot bot() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "bot");
		return new SWTBot(o);
	}

	//public abstract void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.close()
	public void close() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "close");
	}

	//public org.eclipse.ui.IWorkbenchPartReference org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.getReference()
	//public java.lang.String org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.getTitle()
	public java.lang.String getTitle() throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "getTitle");
	}

	//public org.eclipse.ui.IWorkbenchPartReference org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.getReference()
	//public java.lang.String org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.getTitle()
	public java.lang.String getId() throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "getId");
	}
		
	//public java.util.List org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.getToolbarButtons()
	@SuppressWarnings("unchecked")
	public java.util.List<org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton> getToolbarButtons() throws SWTBotBridgeException {
		return (List)SWTBotBridge.callMethodReturnSWTBotList(distantObject, "getToolbarButtons", org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton.class);

	}

	//public org.eclipse.swt.widgets.Widget org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.getWidget()
	//public abstract boolean org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.isActive()
	public boolean isActive() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isActive");
		return b.booleanValue();
	}

	//public abstract void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.setFocus()
	public void setFocus() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "setFocus");
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.show()
	public void show() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "show");
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.toolbarButton(java.lang.String) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton toolbarButton(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarButton", param0);
		return new SWTBotToolbarButton(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.toolbarDropDownButton(java.lang.String) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton toolbarDropDownButton(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarDropDownButton", param0);
		return new SWTBotToolbarDropDownButton(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarPushButton org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.toolbarPushButton(java.lang.String) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarPushButton toolbarPushButton(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarPushButton", param0);
		return new SWTBotToolbarPushButton(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.toolbarRadioButton(java.lang.String) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton toolbarRadioButton(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarRadioButton", param0);
		return new SWTBotToolbarRadioButton(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.toolbarToggleButton(java.lang.String) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton toolbarToggleButton(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarToggleButton", param0);
		return new SWTBotToolbarToggleButton(o);
	}


}
