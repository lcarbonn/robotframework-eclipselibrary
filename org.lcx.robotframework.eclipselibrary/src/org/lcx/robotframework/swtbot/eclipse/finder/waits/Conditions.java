package org.lcx.robotframework.swtbot.eclipse.finder.waits;

import java.lang.reflect.Method;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.waits.ICondition;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotShell;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable;

public class Conditions  {
	
	public static ICondition widgetIsEnabled(SWTWorkbenchBot SWTWorkbenchBot, AbstractSWTBotControl widget) 
		throws SWTBotBridgeException {
		try {
			Class<?> c = SWTBotBridge.loadClass("org.eclipse.swtbot.eclipse.finder.waits.Conditions");
			Class<?> paramType = SWTBotBridge.loadClass("org.eclipse.swtbot.swt.finder.widgets.AbstractSWTBot");
			Method method = c.getMethod("widgetIsEnabled", paramType);
			method.setAccessible(true);
			
			Object o = method.invoke(null, widget.getDistantObject());
			Condition cond = new Condition(o);
			return cond;
		} catch (Exception e) {
			e.printStackTrace();
			throw new SWTBotBridgeException("Error in Conditions : widgetIsEnabled", e);
		}
	}
	
	public static ICondition shellCloses(SWTWorkbenchBot SWTWorkbenchBot, SWTBotShell shell)
	throws SWTBotBridgeException {
		try {
			Class<?> c = SWTBotBridge.loadClass("org.eclipse.swtbot.eclipse.finder.waits.Conditions");
			Class<?> paramType = SWTBotBridge.loadClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotShell");
			Method method = c.getMethod("shellCloses", paramType);
			method.setAccessible(true);
			
			Object o = method.invoke(null, shell.getDistantObject());
			Condition cond = new Condition(o);
			return cond;
		} catch (Exception e) {
			e.printStackTrace();
			throw new SWTBotBridgeException("Error in Conditions : shellCloses", e);
		}
	}

	public static ICondition shellIsActive(SWTWorkbenchBot SWTWorkbenchBot, String text)
	throws SWTBotBridgeException {
		try {
			Class<?> c = SWTBotBridge.loadClass("org.eclipse.swtbot.eclipse.finder.waits.Conditions");
			Class<?> paramType = SWTBotBridge.loadClass("java.lang.String");
			Method method = c.getMethod("shellIsActive", paramType);
			method.setAccessible(true);
			
			Object o = method.invoke(null, text);
			Condition cond = new Condition(o);
			return cond;
		} catch (Exception e) {
			e.printStackTrace();
			throw new SWTBotBridgeException("Error in Conditions : shellIsActive", e);
		}
	}

	public static ICondition tableHasRows(SWTWorkbenchBot SWTWorkbenchBot, SWTBotTable table, int rowCount)
	throws SWTBotBridgeException {
		try {
			Class<?> c = SWTBotBridge.loadClass("org.eclipse.swtbot.eclipse.finder.waits.Conditions");
			Class<?> paramType = SWTBotBridge.loadClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotTable");
			Method method = c.getMethod("shellIsActive", paramType, int.class);
			method.setAccessible(true);
			
			Object o = method.invoke(null, table.getDistantObject(), rowCount);
			Condition cond = new Condition(o);
			return cond;
		} catch (Exception e) {
			e.printStackTrace();
			throw new SWTBotBridgeException("Error in Conditions : shellIsActive", e);
		}
	}
}
