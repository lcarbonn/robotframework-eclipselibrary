package org.lcx.robotframework.swtbot.eclipse.finder;

import java.lang.reflect.Method;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.waits.ICondition;
import org.lcx.robotframework.swtbot.swt.finder.widget.SWTBotButton;
import org.lcx.robotframework.swtbot.swt.finder.widget.SWTBotCheckBox;
import org.lcx.robotframework.swtbot.swt.finder.widget.SWTBotLabel;
import org.lcx.robotframework.swtbot.swt.finder.widget.SWTBotList;
import org.lcx.robotframework.swtbot.swt.finder.widget.SWTBotShell;
import org.lcx.robotframework.swtbot.swt.finder.widget.SWTBotTable;
import org.lcx.robotframework.swtbot.swt.finder.widget.SWTBotText;
import org.lcx.robotframework.swtbot.swt.finder.widget.SWTBotToolbarButton;

public class SWTWorkbenchBot {

	private static SWTWorkbenchBot instance;
	private Object SWTWorkbenchBot;

	public static SWTWorkbenchBot getSWTWorkbenchBot() throws SWTBotBridgeException {
		if(instance==null) {
			instance = new SWTWorkbenchBot();
		}
		return instance;
	}

	public SWTWorkbenchBot() throws SWTBotBridgeException {
		System.out.println("Instanciation of SWTWorkbenchBot");
		SWTWorkbenchBot = SWTBotBridge.getSWTWorkbenchBot();
	}
	
	public SWTBotPerspective perspectiveByLabel(String label) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(SWTWorkbenchBot, "perspectiveByLabel", label);
		SWTBotPerspective w = new SWTBotPerspective(o);
		Context.setCurrentWidget(w);
		return w;
	}

	public SWTBotView viewByTitle(String label) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(SWTWorkbenchBot, "viewByTitle", label);
		SWTBotView w = new SWTBotView(o);
		Context.setCurrentWidget(w);
		return w;
	}
	
	public SWTBotShell shell(String text) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(SWTWorkbenchBot, "shell", text);
		SWTBotShell w = new SWTBotShell(o);
		Context.setCurrentWidget(w);
		return w;
	}

	public SWTBotTable table() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(SWTWorkbenchBot, "table");
		SWTBotTable w = new SWTBotTable(o);
		Context.setCurrentWidget(w);
		return w;
	}
	
	public SWTBotButton button(String mnemonicText) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(SWTWorkbenchBot, "button", mnemonicText);
		SWTBotButton w = new SWTBotButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	public SWTBotButton button(int index) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(SWTWorkbenchBot, "button", index);
		SWTBotButton w = new SWTBotButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	public SWTBotCheckBox checkBox(String mnemonicText) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(SWTWorkbenchBot, "checkBox", mnemonicText);
		SWTBotCheckBox w = new SWTBotCheckBox(o);
		Context.setCurrentWidget(w);
		return w;
	}
	
	public SWTBotText textWithLabel(String label) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(SWTWorkbenchBot, "textWithLabel", label);
		SWTBotText w = new SWTBotText(o);
		Context.setCurrentWidget(w);
		return w;
	}
	
	public SWTBotToolbarButton toolbarButton(String label) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(SWTWorkbenchBot, "toolbarButton", label);
		SWTBotToolbarButton w = new SWTBotToolbarButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	public SWTBotList list(int index) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(SWTWorkbenchBot, "list", index);
		SWTBotList w = new SWTBotList(o);
		Context.setCurrentWidget(w);
		return w;
	}

	public SWTBotLabel label(String mnemonicText) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(SWTWorkbenchBot, "label", mnemonicText);
		SWTBotLabel w = new SWTBotLabel(o);
		Context.setCurrentWidget(w);
		return w;
	}
	
	public void waitUntil(ICondition condition, long timeout) throws SWTBotBridgeException {
		try {
			Class<?> condType = SWTBotBridge.loadClass("org.eclipse.swtbot.swt.finder.waits.ICondition");
			Method method = SWTWorkbenchBot.getClass().getMethod("waitUntil", condType, long.class);
			method.setAccessible(true);
			System.out.println("condition="+condition.getCondition().getClass().getName());
			method.invoke(SWTWorkbenchBot, condition.getCondition(), timeout);
		} catch (Exception e) {
			throw new SWTBotBridgeException("Error in waitUntil method", e);
		}
	}

}
