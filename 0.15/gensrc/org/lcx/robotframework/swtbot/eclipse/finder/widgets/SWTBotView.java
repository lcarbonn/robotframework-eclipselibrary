/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.eclipse.finder.widgets;


import org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotViewMenu;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import java.util.List;
import org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart;


public class SWTBotView extends SWTBotWorkbenchPart {

	public SWTBotView(Object o) {
		super(o);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView.close()
	public void close() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "close");
	}

	//public org.eclipse.ui.IViewReference org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView.getViewReference()
	//public boolean org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView.isActive()
	public boolean isActive() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isActive");
		return b.booleanValue();
	}

	//public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotViewMenu org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView.menu(java.lang.String) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotViewMenu menu(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "menu", param0);
		return new SWTBotViewMenu(o);
	}

	//public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotViewMenu org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView.menu(java.lang.String,int) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotViewMenu menu(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "menu", param0, param1);
		return new SWTBotViewMenu(o);
	}

	//public java.util.List org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView.menus()
	@SuppressWarnings("unchecked")
	public java.util.List<org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotViewMenu> menus() throws SWTBotBridgeException {
		return (List)SWTBotBridge.callMethodReturnSWTBotList(distantObject, "menus", org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotViewMenu.class);

	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView.setFocus()
	public void setFocus() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "setFocus");
	}


}
