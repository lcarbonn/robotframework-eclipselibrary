package org.lcx.robotframework.swtbot.eclipse.finder;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
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

	private Object SWTWorkbenchBot;

	//TODO : make it a singleton
	public SWTWorkbenchBot() throws SWTBotBridgeException {
		SWTWorkbenchBot = SWTBotBridge.getSWTWorkbenchBot();
	}
	
	public SWTBotPerspective perspectiveByLabel(String label) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(SWTWorkbenchBot, "perspectiveByLabel", label);
		return new SWTBotPerspective(o);
	}

	public SWTBotView viewByTitle(String label) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(SWTWorkbenchBot, "viewByTitle", label);
		return new SWTBotView(o);
	}
	
	public SWTBotShell shell(String text) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(SWTWorkbenchBot, "shell", text);
		return new SWTBotShell(o);
	}

	public SWTBotTable table() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(SWTWorkbenchBot, "table");
		return new SWTBotTable(o);
	}
	
	public SWTBotButton button(String mnemonicText) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(SWTWorkbenchBot, "button", mnemonicText);
		return new SWTBotButton(o);
	}

	public SWTBotButton button(int index) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(SWTWorkbenchBot, "button", index);
		return new SWTBotButton(o);
	}

	public SWTBotCheckBox checkBox(String mnemonicText) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(SWTWorkbenchBot, "checkBox", mnemonicText);
		return new SWTBotCheckBox(o);
	}
	
	public SWTBotText text(String text) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(SWTWorkbenchBot, "text", text);
		return new SWTBotText(o);
	}
	
	public SWTBotToolbarButton toolbarButton(String label) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(SWTWorkbenchBot, "toolbarButton", label);
		return new SWTBotToolbarButton(o);
	}

	public SWTBotList list(int index) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(SWTWorkbenchBot, "list", index);
		return new SWTBotList(o);
	}

	public SWTBotLabel label(String mnemonicText) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(SWTWorkbenchBot, "label", mnemonicText);
		return new SWTBotLabel(o);
	}
	
	public void waitUntil(ICondition condition, long timeout) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(SWTWorkbenchBot, "waitUntil", new Object[] {condition, timeout});
	}

}
