package org.lcx.robotframework.swtbot.eclipse.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;


public class SWTBotView extends SWTBotWorkbenchPart {

	public SWTBotView(Object o) {
		super(o);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView.setFocus()
	public void setFocus() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "setFocus");
	}

	//public org.eclipse.ui.IViewReference org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView.getViewReference()
	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView.close()
	public void close() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "close");
	}

	//public boolean org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView.isActive()
	public boolean isActive() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isActive");
		return b.booleanValue();
	}

	//public java.util.List org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView.menus()
	@SuppressWarnings("unchecked")
	public java.util.List<org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotViewMenu> menus() throws SWTBotBridgeException {
		return (java.util.List)SWTBotBridge.callMethodReturnPrimitiveList(distantObject, "menus");

	}

	//public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotViewMenu org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView.menu(java.lang.String,int) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotViewMenu menu(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "menu", param0, param1);
		return new org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotViewMenu(o);
	}

	//public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotViewMenu org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView.menu(java.lang.String) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotViewMenu menu(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "menu", param0);
		return new org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotViewMenu(o);
	}


}
