package org.lcx.robotframework.swtbot.eclipse.finder.widgets;


import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;


public class SWTBotWorkbenchPart extends AbstractSWTBotControl {

	public SWTBotWorkbenchPart(Object o) {
		super(o);
	}

	//public abstract void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.setFocus()
	public void setFocus() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "setFocus");
	}

	//public org.lcx.robotframework.swtbot.swt.finder.SWTBot org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.bot()
	public org.lcx.robotframework.swtbot.swt.finder.SWTBot bot() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "bot");
		return new org.lcx.robotframework.swtbot.swt.finder.SWTBot(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.toolbarButton(java.lang.String) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton toolbarButton(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarButton", param0);
		return new org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.toolbarDropDownButton(java.lang.String) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton toolbarDropDownButton(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarDropDownButton", param0);
		return new org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.toolbarRadioButton(java.lang.String) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton toolbarRadioButton(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarRadioButton", param0);
		return new org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.toolbarToggleButton(java.lang.String) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton toolbarToggleButton(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarToggleButton", param0);
		return new org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton(o);
	}

	//public org.eclipse.ui.IWorkbenchPartReference org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.getReference()
	//public java.util.List org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.getToolbarButtons()
	@SuppressWarnings("unchecked")
	public java.util.List<org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton> getToolbarButtons() throws SWTBotBridgeException {
		return (java.util.List)SWTBotBridge.callMethodReturnPrimitiveList(distantObject, "getToolbarButtons");

	}

	//public org.eclipse.swt.widgets.Widget org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.getWidget()
	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarPushButton org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.toolbarPushButton(java.lang.String) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarPushButton toolbarPushButton(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarPushButton", param0);
		return new org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarPushButton(o);
	}

	//public abstract void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.close()
	public void close() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "close");
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.show()
	public void show() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "show");
	}

	//public abstract boolean org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.isActive()
	public boolean isActive() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isActive");
		return b.booleanValue();
	}

	//public java.lang.String org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart.getTitle()
	public java.lang.String getTitle() throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "getTitle");
	}


}
