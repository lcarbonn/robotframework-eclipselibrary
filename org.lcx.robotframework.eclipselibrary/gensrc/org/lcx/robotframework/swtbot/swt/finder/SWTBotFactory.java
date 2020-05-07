/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.swt.finder;


import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTrayItem;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell;
import java.util.List;
import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.eclipse.finder.AbstractSWTBotFactory;


public class SWTBotFactory extends AbstractSWTBotFactory {

	public SWTBotFactory(Object o) throws SWTBotBridgeException {
		super(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.activeShell() throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell activeShell() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "activeShell");
		org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell w = new SWTBotShell(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.captureScreenshot(java.lang.String)
	public boolean captureScreenshot(java.lang.String param0) throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "captureScreenshot", param0);
		return b.booleanValue();
	}

	//public org.eclipse.swt.widgets.Display org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.getDisplay()
	//public org.lcx.robotframework.swtbot.swt.finder.finders.Finder org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.getFinder()
	//public org.eclipse.swt.widgets.Control org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.getFocusedWidget()
	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.menuWithId(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu menuWithId(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "menuWithId", param0);
		org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu w = new SWTBotMenu(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.menuWithId(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu menuWithId(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "menuWithId", param0, param1);
		org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu w = new SWTBotMenu(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.menuWithId(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu menuWithId(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "menuWithId", param0, param1, param2);
		org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu w = new SWTBotMenu(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.menuWithId(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu menuWithId(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "menuWithId", param0, param1);
		org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu w = new SWTBotMenu(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.menu(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu menu(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "menu", param0);
		org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu w = new SWTBotMenu(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.menu(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu menu(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "menu", param0, param1);
		org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu w = new SWTBotMenu(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.menu(org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell,org.hamcrest.Matcher,int)
	//public void org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.performWithTimeout(org.lcx.robotframework.swtbot.swt.finder.results.VoidResult,long)
	//public java.lang.Object org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.performWithTimeout(org.lcx.robotframework.swtbot.swt.finder.results.Result,long)
	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.shellWithId(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell shellWithId(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "shellWithId", param0);
		org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell w = new SWTBotShell(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.shellWithId(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell shellWithId(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "shellWithId", param0, param1);
		org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell w = new SWTBotShell(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.shellWithId(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell shellWithId(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "shellWithId", param0, param1, param2);
		org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell w = new SWTBotShell(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.shellWithId(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell shellWithId(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "shellWithId", param0, param1);
		org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell w = new SWTBotShell(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.shell(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell shell(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "shell", param0);
		org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell w = new SWTBotShell(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.shell(java.lang.String,org.eclipse.swt.widgets.Shell)
	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.shell(java.lang.String,org.eclipse.swt.widgets.Shell,int)
	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.shell(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell shell(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "shell", param0, param1);
		org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell w = new SWTBotShell(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell[] org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.shells()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell[] shells() throws SWTBotBridgeException {
		return (org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell[]) SWTBotBridge.callMethodReturnSWTBotArray(distantObject, "shells", SWTBotShell.class);

	}

	//public java.util.List org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.shells(java.lang.String)
//	@SuppressWarnings("unchecked")
//	public java.util.List<org.eclipse.swt.widgets.Shell> shells(java.lang.String param0) throws SWTBotBridgeException {
//		return (List)SWTBotBridge.callMethodReturnPrimitiveList(distantObject, "shells", param0);
//
//	}

	//public java.util.List org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.shells(java.lang.String,org.eclipse.swt.widgets.Shell)
	//public void org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.sleep(long)
	public void sleep(long param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "sleep", param0);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTrayItem org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.trayItem()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTrayItem trayItem() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "trayItem");
		org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTrayItem w = new SWTBotTrayItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTrayItem org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.trayItemWithTooltip(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTrayItem trayItemWithTooltip(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "trayItemWithTooltip", param0);
		org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTrayItem w = new SWTBotTrayItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTrayItem org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.trayItemWithTooltip(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTrayItem trayItemWithTooltip(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "trayItemWithTooltip", param0, param1);
		org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTrayItem w = new SWTBotTrayItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTrayItem org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.trayItem(int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTrayItem trayItem(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "trayItem", param0);
		org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTrayItem w = new SWTBotTrayItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public java.util.List org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.trayItems()
	@SuppressWarnings("unchecked")
	public java.util.List<org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTrayItem> trayItems() throws SWTBotBridgeException {
		return (List)SWTBotBridge.callMethodReturnSWTBotList(distantObject, "trayItems", org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTrayItem.class);

	}

	//public java.util.List org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.trayItems(org.hamcrest.Matcher)
	//public void org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.waitUntilWidgetAppears(org.lcx.robotframework.swtbot.swt.finder.waits.ICondition)
	public void waitUntilWidgetAppears(org.lcx.robotframework.swtbot.swt.finder.waits.ICondition param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "waitUntilWidgetAppears", param0);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.waitUntil(org.lcx.robotframework.swtbot.swt.finder.waits.ICondition) throws org.lcx.robotframework.swtbot.swt.finder.widgets.TimeoutException
	public void waitUntil(org.lcx.robotframework.swtbot.swt.finder.waits.ICondition param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "waitUntil", param0);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.waitUntil(org.lcx.robotframework.swtbot.swt.finder.waits.ICondition,long) throws org.lcx.robotframework.swtbot.swt.finder.widgets.TimeoutException
	public void waitUntil(org.lcx.robotframework.swtbot.swt.finder.waits.ICondition param0, long param1) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "waitUntil", param0, param1);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.waitUntil(org.lcx.robotframework.swtbot.swt.finder.waits.ICondition,long,long) throws org.lcx.robotframework.swtbot.swt.finder.widgets.TimeoutException
	public void waitUntil(org.lcx.robotframework.swtbot.swt.finder.waits.ICondition param0, long param1, long param2) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "waitUntil", param0, param1, param2);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.waitWhile(org.lcx.robotframework.swtbot.swt.finder.waits.ICondition) throws org.lcx.robotframework.swtbot.swt.finder.widgets.TimeoutException
	public void waitWhile(org.lcx.robotframework.swtbot.swt.finder.waits.ICondition param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "waitWhile", param0);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.waitWhile(org.lcx.robotframework.swtbot.swt.finder.waits.ICondition,long) throws org.lcx.robotframework.swtbot.swt.finder.widgets.TimeoutException
	public void waitWhile(org.lcx.robotframework.swtbot.swt.finder.waits.ICondition param0, long param1) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "waitWhile", param0, param1);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.waitWhile(org.lcx.robotframework.swtbot.swt.finder.waits.ICondition,long,long) throws org.lcx.robotframework.swtbot.swt.finder.widgets.TimeoutException
	public void waitWhile(org.lcx.robotframework.swtbot.swt.finder.waits.ICondition param0, long param1, long param2) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "waitWhile", param0, param1, param2);
	}

	//public org.eclipse.swt.widgets.Widget org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.widget(org.hamcrest.Matcher)
	//public org.eclipse.swt.widgets.Widget org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.widget(org.hamcrest.Matcher,org.eclipse.swt.widgets.Widget)
	//public org.eclipse.swt.widgets.Widget org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.widget(org.hamcrest.Matcher,org.eclipse.swt.widgets.Widget,int)
	//public org.eclipse.swt.widgets.Widget org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.widget(org.hamcrest.Matcher,int)
	//public java.util.List org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.widgets(org.hamcrest.Matcher)
	//public java.util.List org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory.widgets(org.hamcrest.Matcher,org.eclipse.swt.widgets.Widget)

}
