package org.lcx.robotframework.swtbot.swt.finder;


import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.*;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;


public class SWTBot extends SWTBotFactory {

	public SWTBot(Object o) throws SWTBotBridgeException {
		super(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.buttonInGroup(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton buttonInGroup(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "buttonInGroup", param0);
		SWTBotButton w = new SWTBotButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.buttonInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton buttonInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "buttonInGroup", param0, param1, param2);
		SWTBotButton w = new SWTBotButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.buttonInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton buttonInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "buttonInGroup", param0, param1);
		SWTBotButton w = new SWTBotButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.buttonInGroup(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton buttonInGroup(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "buttonInGroup", param0, param1);
		SWTBotButton w = new SWTBotButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.buttonWithId(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton buttonWithId(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "buttonWithId", param0, param1);
		SWTBotButton w = new SWTBotButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.buttonWithId(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton buttonWithId(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "buttonWithId", param0, param1, param2);
		SWTBotButton w = new SWTBotButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.buttonWithId(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton buttonWithId(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "buttonWithId", param0, param1);
		SWTBotButton w = new SWTBotButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.buttonWithId(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton buttonWithId(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "buttonWithId", param0);
		SWTBotButton w = new SWTBotButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.buttonWithLabel(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton buttonWithLabel(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "buttonWithLabel", param0);
		SWTBotButton w = new SWTBotButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.buttonWithLabel(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton buttonWithLabel(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "buttonWithLabel", param0, param1);
		SWTBotButton w = new SWTBotButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.buttonWithLabelInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton buttonWithLabelInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "buttonWithLabelInGroup", param0, param1, param2);
		SWTBotButton w = new SWTBotButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.buttonWithLabelInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton buttonWithLabelInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "buttonWithLabelInGroup", param0, param1);
		SWTBotButton w = new SWTBotButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.buttonWithTooltip(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton buttonWithTooltip(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "buttonWithTooltip", param0);
		SWTBotButton w = new SWTBotButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.buttonWithTooltip(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton buttonWithTooltip(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "buttonWithTooltip", param0, param1);
		SWTBotButton w = new SWTBotButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.buttonWithTooltipInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton buttonWithTooltipInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "buttonWithTooltipInGroup", param0, param1);
		SWTBotButton w = new SWTBotButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.buttonWithTooltipInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton buttonWithTooltipInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "buttonWithTooltipInGroup", param0, param1, param2);
		SWTBotButton w = new SWTBotButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem org.lcx.robotframework.swtbot.swt.finder.SWTBot.cTabItem(int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem cTabItem(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "cTabItem", param0);
		SWTBotCTabItem w = new SWTBotCTabItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem org.lcx.robotframework.swtbot.swt.finder.SWTBot.cTabItem(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem cTabItem(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "cTabItem", param0, param1);
		SWTBotCTabItem w = new SWTBotCTabItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem org.lcx.robotframework.swtbot.swt.finder.SWTBot.cTabItem()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem cTabItem() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "cTabItem");
		SWTBotCTabItem w = new SWTBotCTabItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem org.lcx.robotframework.swtbot.swt.finder.SWTBot.cTabItem(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem cTabItem(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "cTabItem", param0);
		SWTBotCTabItem w = new SWTBotCTabItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem org.lcx.robotframework.swtbot.swt.finder.SWTBot.cTabItemInGroup(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem cTabItemInGroup(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "cTabItemInGroup", param0, param1);
		SWTBotCTabItem w = new SWTBotCTabItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem org.lcx.robotframework.swtbot.swt.finder.SWTBot.cTabItemInGroup(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem cTabItemInGroup(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "cTabItemInGroup", param0);
		SWTBotCTabItem w = new SWTBotCTabItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem org.lcx.robotframework.swtbot.swt.finder.SWTBot.cTabItemInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem cTabItemInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "cTabItemInGroup", param0, param1, param2);
		SWTBotCTabItem w = new SWTBotCTabItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem org.lcx.robotframework.swtbot.swt.finder.SWTBot.cTabItemInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem cTabItemInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "cTabItemInGroup", param0, param1);
		SWTBotCTabItem w = new SWTBotCTabItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem org.lcx.robotframework.swtbot.swt.finder.SWTBot.cTabItemWithId(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem cTabItemWithId(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "cTabItemWithId", param0, param1);
		SWTBotCTabItem w = new SWTBotCTabItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem org.lcx.robotframework.swtbot.swt.finder.SWTBot.cTabItemWithId(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem cTabItemWithId(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "cTabItemWithId", param0, param1);
		SWTBotCTabItem w = new SWTBotCTabItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem org.lcx.robotframework.swtbot.swt.finder.SWTBot.cTabItemWithId(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem cTabItemWithId(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "cTabItemWithId", param0);
		SWTBotCTabItem w = new SWTBotCTabItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem org.lcx.robotframework.swtbot.swt.finder.SWTBot.cTabItemWithId(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCTabItem cTabItemWithId(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "cTabItemWithId", param0, param1, param2);
		SWTBotCTabItem w = new SWTBotCTabItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.ccomboBox(int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo ccomboBox(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "ccomboBox", param0);
		SWTBotCCombo w = new SWTBotCCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.ccomboBox()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo ccomboBox() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "ccomboBox");
		SWTBotCCombo w = new SWTBotCCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.ccomboBox(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo ccomboBox(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "ccomboBox", param0, param1);
		SWTBotCCombo w = new SWTBotCCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.ccomboBox(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo ccomboBox(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "ccomboBox", param0);
		SWTBotCCombo w = new SWTBotCCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.ccomboBoxInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo ccomboBoxInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "ccomboBoxInGroup", param0, param1);
		SWTBotCCombo w = new SWTBotCCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.ccomboBoxInGroup(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo ccomboBoxInGroup(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "ccomboBoxInGroup", param0, param1);
		SWTBotCCombo w = new SWTBotCCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.ccomboBoxInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo ccomboBoxInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "ccomboBoxInGroup", param0, param1, param2);
		SWTBotCCombo w = new SWTBotCCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.ccomboBoxInGroup(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo ccomboBoxInGroup(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "ccomboBoxInGroup", param0);
		SWTBotCCombo w = new SWTBotCCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.ccomboBoxWithId(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo ccomboBoxWithId(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "ccomboBoxWithId", param0);
		SWTBotCCombo w = new SWTBotCCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.ccomboBoxWithId(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo ccomboBoxWithId(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "ccomboBoxWithId", param0, param1);
		SWTBotCCombo w = new SWTBotCCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.ccomboBoxWithId(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo ccomboBoxWithId(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "ccomboBoxWithId", param0, param1, param2);
		SWTBotCCombo w = new SWTBotCCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.ccomboBoxWithId(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo ccomboBoxWithId(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "ccomboBoxWithId", param0, param1);
		SWTBotCCombo w = new SWTBotCCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.ccomboBoxWithLabel(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo ccomboBoxWithLabel(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "ccomboBoxWithLabel", param0, param1);
		SWTBotCCombo w = new SWTBotCCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.ccomboBoxWithLabel(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo ccomboBoxWithLabel(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "ccomboBoxWithLabel", param0);
		SWTBotCCombo w = new SWTBotCCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.ccomboBoxWithLabelInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo ccomboBoxWithLabelInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "ccomboBoxWithLabelInGroup", param0, param1, param2);
		SWTBotCCombo w = new SWTBotCCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.ccomboBoxWithLabelInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo ccomboBoxWithLabelInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "ccomboBoxWithLabelInGroup", param0, param1);
		SWTBotCCombo w = new SWTBotCCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox org.lcx.robotframework.swtbot.swt.finder.SWTBot.checkBox(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox checkBox(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "checkBox", param0);
		SWTBotCheckBox w = new SWTBotCheckBox(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox org.lcx.robotframework.swtbot.swt.finder.SWTBot.checkBox(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox checkBox(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "checkBox", param0, param1);
		SWTBotCheckBox w = new SWTBotCheckBox(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox org.lcx.robotframework.swtbot.swt.finder.SWTBot.checkBox(int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox checkBox(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "checkBox", param0);
		SWTBotCheckBox w = new SWTBotCheckBox(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox org.lcx.robotframework.swtbot.swt.finder.SWTBot.checkBox()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox checkBox() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "checkBox");
		SWTBotCheckBox w = new SWTBotCheckBox(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox org.lcx.robotframework.swtbot.swt.finder.SWTBot.checkBoxInGroup(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox checkBoxInGroup(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "checkBoxInGroup", param0, param1);
		SWTBotCheckBox w = new SWTBotCheckBox(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox org.lcx.robotframework.swtbot.swt.finder.SWTBot.checkBoxInGroup(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox checkBoxInGroup(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "checkBoxInGroup", param0);
		SWTBotCheckBox w = new SWTBotCheckBox(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox org.lcx.robotframework.swtbot.swt.finder.SWTBot.checkBoxInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox checkBoxInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "checkBoxInGroup", param0, param1);
		SWTBotCheckBox w = new SWTBotCheckBox(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox org.lcx.robotframework.swtbot.swt.finder.SWTBot.checkBoxInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox checkBoxInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "checkBoxInGroup", param0, param1, param2);
		SWTBotCheckBox w = new SWTBotCheckBox(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox org.lcx.robotframework.swtbot.swt.finder.SWTBot.checkBoxWithId(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox checkBoxWithId(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "checkBoxWithId", param0, param1);
		SWTBotCheckBox w = new SWTBotCheckBox(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox org.lcx.robotframework.swtbot.swt.finder.SWTBot.checkBoxWithId(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox checkBoxWithId(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "checkBoxWithId", param0, param1, param2);
		SWTBotCheckBox w = new SWTBotCheckBox(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox org.lcx.robotframework.swtbot.swt.finder.SWTBot.checkBoxWithId(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox checkBoxWithId(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "checkBoxWithId", param0, param1);
		SWTBotCheckBox w = new SWTBotCheckBox(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox org.lcx.robotframework.swtbot.swt.finder.SWTBot.checkBoxWithId(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox checkBoxWithId(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "checkBoxWithId", param0);
		SWTBotCheckBox w = new SWTBotCheckBox(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox org.lcx.robotframework.swtbot.swt.finder.SWTBot.checkBoxWithLabel(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox checkBoxWithLabel(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "checkBoxWithLabel", param0, param1);
		SWTBotCheckBox w = new SWTBotCheckBox(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox org.lcx.robotframework.swtbot.swt.finder.SWTBot.checkBoxWithLabel(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox checkBoxWithLabel(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "checkBoxWithLabel", param0);
		SWTBotCheckBox w = new SWTBotCheckBox(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox org.lcx.robotframework.swtbot.swt.finder.SWTBot.checkBoxWithLabelInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox checkBoxWithLabelInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "checkBoxWithLabelInGroup", param0, param1, param2);
		SWTBotCheckBox w = new SWTBotCheckBox(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox org.lcx.robotframework.swtbot.swt.finder.SWTBot.checkBoxWithLabelInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox checkBoxWithLabelInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "checkBoxWithLabelInGroup", param0, param1);
		SWTBotCheckBox w = new SWTBotCheckBox(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox org.lcx.robotframework.swtbot.swt.finder.SWTBot.checkBoxWithTooltip(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox checkBoxWithTooltip(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "checkBoxWithTooltip", param0, param1);
		SWTBotCheckBox w = new SWTBotCheckBox(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox org.lcx.robotframework.swtbot.swt.finder.SWTBot.checkBoxWithTooltip(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox checkBoxWithTooltip(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "checkBoxWithTooltip", param0);
		SWTBotCheckBox w = new SWTBotCheckBox(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox org.lcx.robotframework.swtbot.swt.finder.SWTBot.checkBoxWithTooltipInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox checkBoxWithTooltipInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "checkBoxWithTooltipInGroup", param0, param1);
		SWTBotCheckBox w = new SWTBotCheckBox(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox org.lcx.robotframework.swtbot.swt.finder.SWTBot.checkBoxWithTooltipInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCheckBox checkBoxWithTooltipInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "checkBoxWithTooltipInGroup", param0, param1, param2);
		SWTBotCheckBox w = new SWTBotCheckBox(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel org.lcx.robotframework.swtbot.swt.finder.SWTBot.clabel(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel clabel(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "clabel", param0);
		SWTBotCLabel w = new SWTBotCLabel(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel org.lcx.robotframework.swtbot.swt.finder.SWTBot.clabel(int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel clabel(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "clabel", param0);
		SWTBotCLabel w = new SWTBotCLabel(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel org.lcx.robotframework.swtbot.swt.finder.SWTBot.clabel()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel clabel() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "clabel");
		SWTBotCLabel w = new SWTBotCLabel(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel org.lcx.robotframework.swtbot.swt.finder.SWTBot.clabel(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel clabel(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "clabel", param0, param1);
		SWTBotCLabel w = new SWTBotCLabel(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel org.lcx.robotframework.swtbot.swt.finder.SWTBot.clabelInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel clabelInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "clabelInGroup", param0, param1);
		SWTBotCLabel w = new SWTBotCLabel(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel org.lcx.robotframework.swtbot.swt.finder.SWTBot.clabelInGroup(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel clabelInGroup(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "clabelInGroup", param0);
		SWTBotCLabel w = new SWTBotCLabel(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel org.lcx.robotframework.swtbot.swt.finder.SWTBot.clabelInGroup(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel clabelInGroup(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "clabelInGroup", param0, param1);
		SWTBotCLabel w = new SWTBotCLabel(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel org.lcx.robotframework.swtbot.swt.finder.SWTBot.clabelInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel clabelInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "clabelInGroup", param0, param1, param2);
		SWTBotCLabel w = new SWTBotCLabel(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel org.lcx.robotframework.swtbot.swt.finder.SWTBot.clabelWithId(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel clabelWithId(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "clabelWithId", param0, param1, param2);
		SWTBotCLabel w = new SWTBotCLabel(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel org.lcx.robotframework.swtbot.swt.finder.SWTBot.clabelWithId(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel clabelWithId(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "clabelWithId", param0, param1);
		SWTBotCLabel w = new SWTBotCLabel(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel org.lcx.robotframework.swtbot.swt.finder.SWTBot.clabelWithId(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel clabelWithId(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "clabelWithId", param0, param1);
		SWTBotCLabel w = new SWTBotCLabel(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel org.lcx.robotframework.swtbot.swt.finder.SWTBot.clabelWithId(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel clabelWithId(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "clabelWithId", param0);
		SWTBotCLabel w = new SWTBotCLabel(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.comboBoxInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo comboBoxInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "comboBoxInGroup", param0, param1, param2);
		SWTBotCombo w = new SWTBotCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.comboBoxInGroup(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo comboBoxInGroup(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "comboBoxInGroup", param0, param1);
		SWTBotCombo w = new SWTBotCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.comboBoxInGroup(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo comboBoxInGroup(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "comboBoxInGroup", param0);
		SWTBotCombo w = new SWTBotCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.comboBoxInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo comboBoxInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "comboBoxInGroup", param0, param1);
		SWTBotCombo w = new SWTBotCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.comboBoxWithId(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo comboBoxWithId(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "comboBoxWithId", param0, param1);
		SWTBotCombo w = new SWTBotCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.comboBoxWithId(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo comboBoxWithId(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "comboBoxWithId", param0, param1);
		SWTBotCombo w = new SWTBotCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.comboBoxWithId(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo comboBoxWithId(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "comboBoxWithId", param0);
		SWTBotCombo w = new SWTBotCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.comboBoxWithId(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo comboBoxWithId(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "comboBoxWithId", param0, param1, param2);
		SWTBotCombo w = new SWTBotCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.comboBoxWithLabel(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo comboBoxWithLabel(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "comboBoxWithLabel", param0, param1);
		SWTBotCombo w = new SWTBotCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.comboBoxWithLabel(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo comboBoxWithLabel(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "comboBoxWithLabel", param0);
		SWTBotCombo w = new SWTBotCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.comboBoxWithLabelInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo comboBoxWithLabelInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "comboBoxWithLabelInGroup", param0, param1);
		SWTBotCombo w = new SWTBotCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.comboBoxWithLabelInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo comboBoxWithLabelInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "comboBoxWithLabelInGroup", param0, param1, param2);
		SWTBotCombo w = new SWTBotCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime org.lcx.robotframework.swtbot.swt.finder.SWTBot.dateTime(int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime dateTime(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "dateTime", param0);
		SWTBotDateTime w = new SWTBotDateTime(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime org.lcx.robotframework.swtbot.swt.finder.SWTBot.dateTime()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime dateTime() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "dateTime");
		SWTBotDateTime w = new SWTBotDateTime(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime org.lcx.robotframework.swtbot.swt.finder.SWTBot.dateTimeInGroup(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime dateTimeInGroup(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "dateTimeInGroup", param0);
		SWTBotDateTime w = new SWTBotDateTime(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime org.lcx.robotframework.swtbot.swt.finder.SWTBot.dateTimeInGroup(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime dateTimeInGroup(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "dateTimeInGroup", param0, param1);
		SWTBotDateTime w = new SWTBotDateTime(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime org.lcx.robotframework.swtbot.swt.finder.SWTBot.dateTimeWithId(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime dateTimeWithId(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "dateTimeWithId", param0, param1);
		SWTBotDateTime w = new SWTBotDateTime(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime org.lcx.robotframework.swtbot.swt.finder.SWTBot.dateTimeWithId(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime dateTimeWithId(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "dateTimeWithId", param0, param1);
		SWTBotDateTime w = new SWTBotDateTime(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime org.lcx.robotframework.swtbot.swt.finder.SWTBot.dateTimeWithId(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime dateTimeWithId(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "dateTimeWithId", param0, param1, param2);
		SWTBotDateTime w = new SWTBotDateTime(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime org.lcx.robotframework.swtbot.swt.finder.SWTBot.dateTimeWithId(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime dateTimeWithId(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "dateTimeWithId", param0);
		SWTBotDateTime w = new SWTBotDateTime(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime org.lcx.robotframework.swtbot.swt.finder.SWTBot.dateTimeWithLabel(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime dateTimeWithLabel(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "dateTimeWithLabel", param0);
		SWTBotDateTime w = new SWTBotDateTime(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime org.lcx.robotframework.swtbot.swt.finder.SWTBot.dateTimeWithLabel(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime dateTimeWithLabel(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "dateTimeWithLabel", param0, param1);
		SWTBotDateTime w = new SWTBotDateTime(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime org.lcx.robotframework.swtbot.swt.finder.SWTBot.dateTimeWithLabelInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime dateTimeWithLabelInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "dateTimeWithLabelInGroup", param0, param1, param2);
		SWTBotDateTime w = new SWTBotDateTime(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime org.lcx.robotframework.swtbot.swt.finder.SWTBot.dateTimeWithLabelInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime dateTimeWithLabelInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "dateTimeWithLabelInGroup", param0, param1);
		SWTBotDateTime w = new SWTBotDateTime(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel org.lcx.robotframework.swtbot.swt.finder.SWTBot.labelInGroup(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel labelInGroup(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "labelInGroup", param0);
		SWTBotLabel w = new SWTBotLabel(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel org.lcx.robotframework.swtbot.swt.finder.SWTBot.labelInGroup(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel labelInGroup(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "labelInGroup", param0, param1);
		SWTBotLabel w = new SWTBotLabel(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel org.lcx.robotframework.swtbot.swt.finder.SWTBot.labelInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel labelInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "labelInGroup", param0, param1);
		SWTBotLabel w = new SWTBotLabel(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel org.lcx.robotframework.swtbot.swt.finder.SWTBot.labelInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel labelInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "labelInGroup", param0, param1, param2);
		SWTBotLabel w = new SWTBotLabel(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel org.lcx.robotframework.swtbot.swt.finder.SWTBot.labelWithId(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel labelWithId(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "labelWithId", param0);
		SWTBotLabel w = new SWTBotLabel(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel org.lcx.robotframework.swtbot.swt.finder.SWTBot.labelWithId(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel labelWithId(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "labelWithId", param0, param1, param2);
		SWTBotLabel w = new SWTBotLabel(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel org.lcx.robotframework.swtbot.swt.finder.SWTBot.labelWithId(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel labelWithId(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "labelWithId", param0, param1);
		SWTBotLabel w = new SWTBotLabel(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel org.lcx.robotframework.swtbot.swt.finder.SWTBot.labelWithId(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel labelWithId(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "labelWithId", param0, param1);
		SWTBotLabel w = new SWTBotLabel(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink org.lcx.robotframework.swtbot.swt.finder.SWTBot.linkInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink linkInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "linkInGroup", param0, param1);
		SWTBotLink w = new SWTBotLink(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink org.lcx.robotframework.swtbot.swt.finder.SWTBot.linkInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink linkInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "linkInGroup", param0, param1, param2);
		SWTBotLink w = new SWTBotLink(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink org.lcx.robotframework.swtbot.swt.finder.SWTBot.linkInGroup(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink linkInGroup(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "linkInGroup", param0, param1);
		SWTBotLink w = new SWTBotLink(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink org.lcx.robotframework.swtbot.swt.finder.SWTBot.linkInGroup(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink linkInGroup(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "linkInGroup", param0);
		SWTBotLink w = new SWTBotLink(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink org.lcx.robotframework.swtbot.swt.finder.SWTBot.linkWithId(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink linkWithId(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "linkWithId", param0, param1);
		SWTBotLink w = new SWTBotLink(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink org.lcx.robotframework.swtbot.swt.finder.SWTBot.linkWithId(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink linkWithId(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "linkWithId", param0, param1);
		SWTBotLink w = new SWTBotLink(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink org.lcx.robotframework.swtbot.swt.finder.SWTBot.linkWithId(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink linkWithId(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "linkWithId", param0);
		SWTBotLink w = new SWTBotLink(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink org.lcx.robotframework.swtbot.swt.finder.SWTBot.linkWithId(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink linkWithId(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "linkWithId", param0, param1, param2);
		SWTBotLink w = new SWTBotLink(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList org.lcx.robotframework.swtbot.swt.finder.SWTBot.listInGroup(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList listInGroup(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "listInGroup", param0);
		SWTBotList w = new SWTBotList(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList org.lcx.robotframework.swtbot.swt.finder.SWTBot.listInGroup(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList listInGroup(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "listInGroup", param0, param1);
		SWTBotList w = new SWTBotList(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList org.lcx.robotframework.swtbot.swt.finder.SWTBot.listWithId(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList listWithId(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "listWithId", param0, param1);
		SWTBotList w = new SWTBotList(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList org.lcx.robotframework.swtbot.swt.finder.SWTBot.listWithId(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList listWithId(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "listWithId", param0, param1);
		SWTBotList w = new SWTBotList(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList org.lcx.robotframework.swtbot.swt.finder.SWTBot.listWithId(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList listWithId(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "listWithId", param0);
		SWTBotList w = new SWTBotList(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList org.lcx.robotframework.swtbot.swt.finder.SWTBot.listWithId(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList listWithId(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "listWithId", param0, param1, param2);
		SWTBotList w = new SWTBotList(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList org.lcx.robotframework.swtbot.swt.finder.SWTBot.listWithLabel(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList listWithLabel(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "listWithLabel", param0);
		SWTBotList w = new SWTBotList(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList org.lcx.robotframework.swtbot.swt.finder.SWTBot.listWithLabel(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList listWithLabel(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "listWithLabel", param0, param1);
		SWTBotList w = new SWTBotList(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList org.lcx.robotframework.swtbot.swt.finder.SWTBot.listWithLabelInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList listWithLabelInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "listWithLabelInGroup", param0, param1, param2);
		SWTBotList w = new SWTBotList(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList org.lcx.robotframework.swtbot.swt.finder.SWTBot.listWithLabelInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList listWithLabelInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "listWithLabelInGroup", param0, param1);
		SWTBotList w = new SWTBotList(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio org.lcx.robotframework.swtbot.swt.finder.SWTBot.radio()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio radio() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "radio");
		SWTBotRadio w = new SWTBotRadio(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio org.lcx.robotframework.swtbot.swt.finder.SWTBot.radio(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio radio(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "radio", param0);
		SWTBotRadio w = new SWTBotRadio(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio org.lcx.robotframework.swtbot.swt.finder.SWTBot.radio(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio radio(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "radio", param0, param1);
		SWTBotRadio w = new SWTBotRadio(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio org.lcx.robotframework.swtbot.swt.finder.SWTBot.radio(int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio radio(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "radio", param0);
		SWTBotRadio w = new SWTBotRadio(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio org.lcx.robotframework.swtbot.swt.finder.SWTBot.radioInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio radioInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "radioInGroup", param0, param1, param2);
		SWTBotRadio w = new SWTBotRadio(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio org.lcx.robotframework.swtbot.swt.finder.SWTBot.radioInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio radioInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "radioInGroup", param0, param1);
		SWTBotRadio w = new SWTBotRadio(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio org.lcx.robotframework.swtbot.swt.finder.SWTBot.radioInGroup(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio radioInGroup(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "radioInGroup", param0, param1);
		SWTBotRadio w = new SWTBotRadio(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio org.lcx.robotframework.swtbot.swt.finder.SWTBot.radioInGroup(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio radioInGroup(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "radioInGroup", param0);
		SWTBotRadio w = new SWTBotRadio(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio org.lcx.robotframework.swtbot.swt.finder.SWTBot.radioWithId(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio radioWithId(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "radioWithId", param0);
		SWTBotRadio w = new SWTBotRadio(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio org.lcx.robotframework.swtbot.swt.finder.SWTBot.radioWithId(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio radioWithId(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "radioWithId", param0, param1);
		SWTBotRadio w = new SWTBotRadio(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio org.lcx.robotframework.swtbot.swt.finder.SWTBot.radioWithId(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio radioWithId(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "radioWithId", param0, param1, param2);
		SWTBotRadio w = new SWTBotRadio(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio org.lcx.robotframework.swtbot.swt.finder.SWTBot.radioWithId(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio radioWithId(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "radioWithId", param0, param1);
		SWTBotRadio w = new SWTBotRadio(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio org.lcx.robotframework.swtbot.swt.finder.SWTBot.radioWithLabel(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio radioWithLabel(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "radioWithLabel", param0, param1);
		SWTBotRadio w = new SWTBotRadio(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio org.lcx.robotframework.swtbot.swt.finder.SWTBot.radioWithLabel(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio radioWithLabel(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "radioWithLabel", param0);
		SWTBotRadio w = new SWTBotRadio(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio org.lcx.robotframework.swtbot.swt.finder.SWTBot.radioWithLabelInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio radioWithLabelInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "radioWithLabelInGroup", param0, param1, param2);
		SWTBotRadio w = new SWTBotRadio(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio org.lcx.robotframework.swtbot.swt.finder.SWTBot.radioWithLabelInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio radioWithLabelInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "radioWithLabelInGroup", param0, param1);
		SWTBotRadio w = new SWTBotRadio(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio org.lcx.robotframework.swtbot.swt.finder.SWTBot.radioWithTooltip(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio radioWithTooltip(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "radioWithTooltip", param0);
		SWTBotRadio w = new SWTBotRadio(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio org.lcx.robotframework.swtbot.swt.finder.SWTBot.radioWithTooltip(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio radioWithTooltip(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "radioWithTooltip", param0, param1);
		SWTBotRadio w = new SWTBotRadio(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio org.lcx.robotframework.swtbot.swt.finder.SWTBot.radioWithTooltipInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio radioWithTooltipInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "radioWithTooltipInGroup", param0, param1, param2);
		SWTBotRadio w = new SWTBotRadio(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio org.lcx.robotframework.swtbot.swt.finder.SWTBot.radioWithTooltipInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio radioWithTooltipInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "radioWithTooltipInGroup", param0, param1);
		SWTBotRadio w = new SWTBotRadio(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider org.lcx.robotframework.swtbot.swt.finder.SWTBot.sliderInGroup(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider sliderInGroup(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "sliderInGroup", param0, param1);
		SWTBotSlider w = new SWTBotSlider(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider org.lcx.robotframework.swtbot.swt.finder.SWTBot.sliderInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider sliderInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "sliderInGroup", param0, param1, param2);
		SWTBotSlider w = new SWTBotSlider(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider org.lcx.robotframework.swtbot.swt.finder.SWTBot.sliderInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider sliderInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "sliderInGroup", param0, param1);
		SWTBotSlider w = new SWTBotSlider(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider org.lcx.robotframework.swtbot.swt.finder.SWTBot.sliderInGroup(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider sliderInGroup(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "sliderInGroup", param0);
		SWTBotSlider w = new SWTBotSlider(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider org.lcx.robotframework.swtbot.swt.finder.SWTBot.sliderWithId(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider sliderWithId(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "sliderWithId", param0, param1, param2);
		SWTBotSlider w = new SWTBotSlider(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider org.lcx.robotframework.swtbot.swt.finder.SWTBot.sliderWithId(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider sliderWithId(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "sliderWithId", param0, param1);
		SWTBotSlider w = new SWTBotSlider(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider org.lcx.robotframework.swtbot.swt.finder.SWTBot.sliderWithId(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider sliderWithId(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "sliderWithId", param0, param1);
		SWTBotSlider w = new SWTBotSlider(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider org.lcx.robotframework.swtbot.swt.finder.SWTBot.sliderWithId(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider sliderWithId(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "sliderWithId", param0);
		SWTBotSlider w = new SWTBotSlider(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider org.lcx.robotframework.swtbot.swt.finder.SWTBot.sliderWithLabel(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider sliderWithLabel(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "sliderWithLabel", param0);
		SWTBotSlider w = new SWTBotSlider(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider org.lcx.robotframework.swtbot.swt.finder.SWTBot.sliderWithLabel(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider sliderWithLabel(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "sliderWithLabel", param0, param1);
		SWTBotSlider w = new SWTBotSlider(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider org.lcx.robotframework.swtbot.swt.finder.SWTBot.sliderWithLabelInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider sliderWithLabelInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "sliderWithLabelInGroup", param0, param1);
		SWTBotSlider w = new SWTBotSlider(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider org.lcx.robotframework.swtbot.swt.finder.SWTBot.sliderWithLabelInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider sliderWithLabelInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "sliderWithLabelInGroup", param0, param1, param2);
		SWTBotSlider w = new SWTBotSlider(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider org.lcx.robotframework.swtbot.swt.finder.SWTBot.sliderWithTooltip(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider sliderWithTooltip(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "sliderWithTooltip", param0);
		SWTBotSlider w = new SWTBotSlider(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider org.lcx.robotframework.swtbot.swt.finder.SWTBot.sliderWithTooltip(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider sliderWithTooltip(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "sliderWithTooltip", param0, param1);
		SWTBotSlider w = new SWTBotSlider(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider org.lcx.robotframework.swtbot.swt.finder.SWTBot.sliderWithTooltipInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider sliderWithTooltipInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "sliderWithTooltipInGroup", param0, param1);
		SWTBotSlider w = new SWTBotSlider(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider org.lcx.robotframework.swtbot.swt.finder.SWTBot.sliderWithTooltipInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider sliderWithTooltipInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "sliderWithTooltipInGroup", param0, param1, param2);
		SWTBotSlider w = new SWTBotSlider(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner org.lcx.robotframework.swtbot.swt.finder.SWTBot.spinner(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner spinner(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "spinner", param0);
		SWTBotSpinner w = new SWTBotSpinner(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner org.lcx.robotframework.swtbot.swt.finder.SWTBot.spinner()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner spinner() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "spinner");
		SWTBotSpinner w = new SWTBotSpinner(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner org.lcx.robotframework.swtbot.swt.finder.SWTBot.spinner(int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner spinner(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "spinner", param0);
		SWTBotSpinner w = new SWTBotSpinner(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner org.lcx.robotframework.swtbot.swt.finder.SWTBot.spinner(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner spinner(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "spinner", param0, param1);
		SWTBotSpinner w = new SWTBotSpinner(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner org.lcx.robotframework.swtbot.swt.finder.SWTBot.spinnerInGroup(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner spinnerInGroup(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "spinnerInGroup", param0);
		SWTBotSpinner w = new SWTBotSpinner(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner org.lcx.robotframework.swtbot.swt.finder.SWTBot.spinnerInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner spinnerInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "spinnerInGroup", param0, param1, param2);
		SWTBotSpinner w = new SWTBotSpinner(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner org.lcx.robotframework.swtbot.swt.finder.SWTBot.spinnerInGroup(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner spinnerInGroup(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "spinnerInGroup", param0, param1);
		SWTBotSpinner w = new SWTBotSpinner(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner org.lcx.robotframework.swtbot.swt.finder.SWTBot.spinnerInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner spinnerInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "spinnerInGroup", param0, param1);
		SWTBotSpinner w = new SWTBotSpinner(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner org.lcx.robotframework.swtbot.swt.finder.SWTBot.spinnerWithId(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner spinnerWithId(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "spinnerWithId", param0, param1);
		SWTBotSpinner w = new SWTBotSpinner(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner org.lcx.robotframework.swtbot.swt.finder.SWTBot.spinnerWithId(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner spinnerWithId(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "spinnerWithId", param0, param1);
		SWTBotSpinner w = new SWTBotSpinner(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner org.lcx.robotframework.swtbot.swt.finder.SWTBot.spinnerWithId(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner spinnerWithId(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "spinnerWithId", param0, param1, param2);
		SWTBotSpinner w = new SWTBotSpinner(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner org.lcx.robotframework.swtbot.swt.finder.SWTBot.spinnerWithId(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner spinnerWithId(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "spinnerWithId", param0);
		SWTBotSpinner w = new SWTBotSpinner(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner org.lcx.robotframework.swtbot.swt.finder.SWTBot.spinnerWithLabel(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner spinnerWithLabel(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "spinnerWithLabel", param0, param1);
		SWTBotSpinner w = new SWTBotSpinner(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner org.lcx.robotframework.swtbot.swt.finder.SWTBot.spinnerWithLabel(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner spinnerWithLabel(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "spinnerWithLabel", param0);
		SWTBotSpinner w = new SWTBotSpinner(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner org.lcx.robotframework.swtbot.swt.finder.SWTBot.spinnerWithLabelInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner spinnerWithLabelInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "spinnerWithLabelInGroup", param0, param1);
		SWTBotSpinner w = new SWTBotSpinner(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner org.lcx.robotframework.swtbot.swt.finder.SWTBot.spinnerWithLabelInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner spinnerWithLabelInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "spinnerWithLabelInGroup", param0, param1, param2);
		SWTBotSpinner w = new SWTBotSpinner(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner org.lcx.robotframework.swtbot.swt.finder.SWTBot.spinnerWithTooltip(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner spinnerWithTooltip(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "spinnerWithTooltip", param0);
		SWTBotSpinner w = new SWTBotSpinner(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner org.lcx.robotframework.swtbot.swt.finder.SWTBot.spinnerWithTooltip(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner spinnerWithTooltip(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "spinnerWithTooltip", param0, param1);
		SWTBotSpinner w = new SWTBotSpinner(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner org.lcx.robotframework.swtbot.swt.finder.SWTBot.spinnerWithTooltipInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner spinnerWithTooltipInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "spinnerWithTooltipInGroup", param0, param1, param2);
		SWTBotSpinner w = new SWTBotSpinner(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner org.lcx.robotframework.swtbot.swt.finder.SWTBot.spinnerWithTooltipInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner spinnerWithTooltipInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "spinnerWithTooltipInGroup", param0, param1);
		SWTBotSpinner w = new SWTBotSpinner(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText org.lcx.robotframework.swtbot.swt.finder.SWTBot.styledText(int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText styledText(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "styledText", param0);
		SWTBotStyledText w = new SWTBotStyledText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText org.lcx.robotframework.swtbot.swt.finder.SWTBot.styledText()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText styledText() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "styledText");
		SWTBotStyledText w = new SWTBotStyledText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText org.lcx.robotframework.swtbot.swt.finder.SWTBot.styledText(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText styledText(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "styledText", param0, param1);
		SWTBotStyledText w = new SWTBotStyledText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText org.lcx.robotframework.swtbot.swt.finder.SWTBot.styledText(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText styledText(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "styledText", param0);
		SWTBotStyledText w = new SWTBotStyledText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText org.lcx.robotframework.swtbot.swt.finder.SWTBot.styledTextInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText styledTextInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "styledTextInGroup", param0, param1, param2);
		SWTBotStyledText w = new SWTBotStyledText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText org.lcx.robotframework.swtbot.swt.finder.SWTBot.styledTextInGroup(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText styledTextInGroup(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "styledTextInGroup", param0);
		SWTBotStyledText w = new SWTBotStyledText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText org.lcx.robotframework.swtbot.swt.finder.SWTBot.styledTextInGroup(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText styledTextInGroup(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "styledTextInGroup", param0, param1);
		SWTBotStyledText w = new SWTBotStyledText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText org.lcx.robotframework.swtbot.swt.finder.SWTBot.styledTextInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText styledTextInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "styledTextInGroup", param0, param1);
		SWTBotStyledText w = new SWTBotStyledText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText org.lcx.robotframework.swtbot.swt.finder.SWTBot.styledTextWithId(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText styledTextWithId(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "styledTextWithId", param0);
		SWTBotStyledText w = new SWTBotStyledText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText org.lcx.robotframework.swtbot.swt.finder.SWTBot.styledTextWithId(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText styledTextWithId(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "styledTextWithId", param0, param1);
		SWTBotStyledText w = new SWTBotStyledText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText org.lcx.robotframework.swtbot.swt.finder.SWTBot.styledTextWithId(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText styledTextWithId(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "styledTextWithId", param0, param1, param2);
		SWTBotStyledText w = new SWTBotStyledText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText org.lcx.robotframework.swtbot.swt.finder.SWTBot.styledTextWithId(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText styledTextWithId(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "styledTextWithId", param0, param1);
		SWTBotStyledText w = new SWTBotStyledText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText org.lcx.robotframework.swtbot.swt.finder.SWTBot.styledTextWithLabel(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText styledTextWithLabel(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "styledTextWithLabel", param0, param1);
		SWTBotStyledText w = new SWTBotStyledText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText org.lcx.robotframework.swtbot.swt.finder.SWTBot.styledTextWithLabel(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText styledTextWithLabel(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "styledTextWithLabel", param0);
		SWTBotStyledText w = new SWTBotStyledText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText org.lcx.robotframework.swtbot.swt.finder.SWTBot.styledTextWithLabelInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText styledTextWithLabelInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "styledTextWithLabelInGroup", param0, param1);
		SWTBotStyledText w = new SWTBotStyledText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText org.lcx.robotframework.swtbot.swt.finder.SWTBot.styledTextWithLabelInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText styledTextWithLabelInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "styledTextWithLabelInGroup", param0, param1, param2);
		SWTBotStyledText w = new SWTBotStyledText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem org.lcx.robotframework.swtbot.swt.finder.SWTBot.tabItem(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem tabItem(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "tabItem", param0, param1);
		SWTBotTabItem w = new SWTBotTabItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem org.lcx.robotframework.swtbot.swt.finder.SWTBot.tabItem(int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem tabItem(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "tabItem", param0);
		SWTBotTabItem w = new SWTBotTabItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem org.lcx.robotframework.swtbot.swt.finder.SWTBot.tabItem(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem tabItem(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "tabItem", param0);
		SWTBotTabItem w = new SWTBotTabItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem org.lcx.robotframework.swtbot.swt.finder.SWTBot.tabItem()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem tabItem() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "tabItem");
		SWTBotTabItem w = new SWTBotTabItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem org.lcx.robotframework.swtbot.swt.finder.SWTBot.tabItemInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem tabItemInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "tabItemInGroup", param0, param1, param2);
		SWTBotTabItem w = new SWTBotTabItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem org.lcx.robotframework.swtbot.swt.finder.SWTBot.tabItemInGroup(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem tabItemInGroup(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "tabItemInGroup", param0);
		SWTBotTabItem w = new SWTBotTabItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem org.lcx.robotframework.swtbot.swt.finder.SWTBot.tabItemInGroup(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem tabItemInGroup(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "tabItemInGroup", param0, param1);
		SWTBotTabItem w = new SWTBotTabItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem org.lcx.robotframework.swtbot.swt.finder.SWTBot.tabItemInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem tabItemInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "tabItemInGroup", param0, param1);
		SWTBotTabItem w = new SWTBotTabItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem org.lcx.robotframework.swtbot.swt.finder.SWTBot.tabItemWithId(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem tabItemWithId(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "tabItemWithId", param0, param1, param2);
		SWTBotTabItem w = new SWTBotTabItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem org.lcx.robotframework.swtbot.swt.finder.SWTBot.tabItemWithId(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem tabItemWithId(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "tabItemWithId", param0, param1);
		SWTBotTabItem w = new SWTBotTabItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem org.lcx.robotframework.swtbot.swt.finder.SWTBot.tabItemWithId(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem tabItemWithId(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "tabItemWithId", param0);
		SWTBotTabItem w = new SWTBotTabItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem org.lcx.robotframework.swtbot.swt.finder.SWTBot.tabItemWithId(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTabItem tabItemWithId(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "tabItemWithId", param0, param1);
		SWTBotTabItem w = new SWTBotTabItem(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable org.lcx.robotframework.swtbot.swt.finder.SWTBot.tableInGroup(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable tableInGroup(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "tableInGroup", param0, param1);
		SWTBotTable w = new SWTBotTable(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable org.lcx.robotframework.swtbot.swt.finder.SWTBot.tableInGroup(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable tableInGroup(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "tableInGroup", param0);
		SWTBotTable w = new SWTBotTable(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable org.lcx.robotframework.swtbot.swt.finder.SWTBot.tableWithId(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable tableWithId(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "tableWithId", param0, param1);
		SWTBotTable w = new SWTBotTable(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable org.lcx.robotframework.swtbot.swt.finder.SWTBot.tableWithId(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable tableWithId(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "tableWithId", param0);
		SWTBotTable w = new SWTBotTable(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable org.lcx.robotframework.swtbot.swt.finder.SWTBot.tableWithId(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable tableWithId(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "tableWithId", param0, param1, param2);
		SWTBotTable w = new SWTBotTable(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable org.lcx.robotframework.swtbot.swt.finder.SWTBot.tableWithId(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable tableWithId(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "tableWithId", param0, param1);
		SWTBotTable w = new SWTBotTable(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable org.lcx.robotframework.swtbot.swt.finder.SWTBot.tableWithLabel(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable tableWithLabel(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "tableWithLabel", param0, param1);
		SWTBotTable w = new SWTBotTable(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable org.lcx.robotframework.swtbot.swt.finder.SWTBot.tableWithLabel(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable tableWithLabel(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "tableWithLabel", param0);
		SWTBotTable w = new SWTBotTable(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable org.lcx.robotframework.swtbot.swt.finder.SWTBot.tableWithLabelInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable tableWithLabelInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "tableWithLabelInGroup", param0, param1);
		SWTBotTable w = new SWTBotTable(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable org.lcx.robotframework.swtbot.swt.finder.SWTBot.tableWithLabelInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable tableWithLabelInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "tableWithLabelInGroup", param0, param1, param2);
		SWTBotTable w = new SWTBotTable(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText org.lcx.robotframework.swtbot.swt.finder.SWTBot.textInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText textInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "textInGroup", param0, param1, param2);
		SWTBotText w = new SWTBotText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText org.lcx.robotframework.swtbot.swt.finder.SWTBot.textInGroup(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText textInGroup(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "textInGroup", param0);
		SWTBotText w = new SWTBotText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText org.lcx.robotframework.swtbot.swt.finder.SWTBot.textInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText textInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "textInGroup", param0, param1);
		SWTBotText w = new SWTBotText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText org.lcx.robotframework.swtbot.swt.finder.SWTBot.textInGroup(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText textInGroup(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "textInGroup", param0, param1);
		SWTBotText w = new SWTBotText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText org.lcx.robotframework.swtbot.swt.finder.SWTBot.textWithId(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText textWithId(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "textWithId", param0, param1);
		SWTBotText w = new SWTBotText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText org.lcx.robotframework.swtbot.swt.finder.SWTBot.textWithId(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText textWithId(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "textWithId", param0);
		SWTBotText w = new SWTBotText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText org.lcx.robotframework.swtbot.swt.finder.SWTBot.textWithId(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText textWithId(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "textWithId", param0, param1);
		SWTBotText w = new SWTBotText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText org.lcx.robotframework.swtbot.swt.finder.SWTBot.textWithId(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText textWithId(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "textWithId", param0, param1, param2);
		SWTBotText w = new SWTBotText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText org.lcx.robotframework.swtbot.swt.finder.SWTBot.textWithLabel(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText textWithLabel(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "textWithLabel", param0, param1);
		SWTBotText w = new SWTBotText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText org.lcx.robotframework.swtbot.swt.finder.SWTBot.textWithLabel(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText textWithLabel(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "textWithLabel", param0);
		SWTBotText w = new SWTBotText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText org.lcx.robotframework.swtbot.swt.finder.SWTBot.textWithLabelInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText textWithLabelInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "textWithLabelInGroup", param0, param1, param2);
		SWTBotText w = new SWTBotText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText org.lcx.robotframework.swtbot.swt.finder.SWTBot.textWithLabelInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText textWithLabelInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "textWithLabelInGroup", param0, param1);
		SWTBotText w = new SWTBotText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText org.lcx.robotframework.swtbot.swt.finder.SWTBot.textWithMessage(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText textWithMessage(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "textWithMessage", param0);
		SWTBotText w = new SWTBotText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText org.lcx.robotframework.swtbot.swt.finder.SWTBot.textWithMessage(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText textWithMessage(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "textWithMessage", param0, param1);
		SWTBotText w = new SWTBotText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText org.lcx.robotframework.swtbot.swt.finder.SWTBot.textWithTooltip(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText textWithTooltip(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "textWithTooltip", param0, param1);
		SWTBotText w = new SWTBotText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText org.lcx.robotframework.swtbot.swt.finder.SWTBot.textWithTooltip(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText textWithTooltip(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "textWithTooltip", param0);
		SWTBotText w = new SWTBotText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText org.lcx.robotframework.swtbot.swt.finder.SWTBot.textWithTooltipInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText textWithTooltipInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "textWithTooltipInGroup", param0, param1);
		SWTBotText w = new SWTBotText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText org.lcx.robotframework.swtbot.swt.finder.SWTBot.textWithTooltipInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText textWithTooltipInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "textWithTooltipInGroup", param0, param1, param2);
		SWTBotText w = new SWTBotText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toggleButton(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton toggleButton(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toggleButton", param0);
		SWTBotToggleButton w = new SWTBotToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toggleButton()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton toggleButton() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toggleButton");
		SWTBotToggleButton w = new SWTBotToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toggleButton(int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton toggleButton(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toggleButton", param0);
		SWTBotToggleButton w = new SWTBotToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toggleButton(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton toggleButton(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toggleButton", param0, param1);
		SWTBotToggleButton w = new SWTBotToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toggleButtonInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton toggleButtonInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toggleButtonInGroup", param0, param1, param2);
		SWTBotToggleButton w = new SWTBotToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toggleButtonInGroup(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton toggleButtonInGroup(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toggleButtonInGroup", param0, param1);
		SWTBotToggleButton w = new SWTBotToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toggleButtonInGroup(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton toggleButtonInGroup(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toggleButtonInGroup", param0);
		SWTBotToggleButton w = new SWTBotToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toggleButtonInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton toggleButtonInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toggleButtonInGroup", param0, param1);
		SWTBotToggleButton w = new SWTBotToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toggleButtonWithId(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton toggleButtonWithId(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toggleButtonWithId", param0, param1, param2);
		SWTBotToggleButton w = new SWTBotToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toggleButtonWithId(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton toggleButtonWithId(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toggleButtonWithId", param0, param1);
		SWTBotToggleButton w = new SWTBotToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toggleButtonWithId(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton toggleButtonWithId(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toggleButtonWithId", param0);
		SWTBotToggleButton w = new SWTBotToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toggleButtonWithId(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton toggleButtonWithId(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toggleButtonWithId", param0, param1);
		SWTBotToggleButton w = new SWTBotToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toggleButtonWithLabel(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton toggleButtonWithLabel(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toggleButtonWithLabel", param0, param1);
		SWTBotToggleButton w = new SWTBotToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toggleButtonWithLabel(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton toggleButtonWithLabel(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toggleButtonWithLabel", param0);
		SWTBotToggleButton w = new SWTBotToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toggleButtonWithLabelInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton toggleButtonWithLabelInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toggleButtonWithLabelInGroup", param0, param1, param2);
		SWTBotToggleButton w = new SWTBotToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toggleButtonWithLabelInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton toggleButtonWithLabelInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toggleButtonWithLabelInGroup", param0, param1);
		SWTBotToggleButton w = new SWTBotToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toggleButtonWithTooltip(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton toggleButtonWithTooltip(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toggleButtonWithTooltip", param0);
		SWTBotToggleButton w = new SWTBotToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toggleButtonWithTooltip(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton toggleButtonWithTooltip(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toggleButtonWithTooltip", param0, param1);
		SWTBotToggleButton w = new SWTBotToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toggleButtonWithTooltipInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton toggleButtonWithTooltipInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toggleButtonWithTooltipInGroup", param0, param1);
		SWTBotToggleButton w = new SWTBotToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toggleButtonWithTooltipInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToggleButton toggleButtonWithTooltipInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toggleButtonWithTooltipInGroup", param0, param1, param2);
		SWTBotToggleButton w = new SWTBotToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarButton(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton toolbarButton(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarButton", param0);
		SWTBotToolbarButton w = new SWTBotToolbarButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarButton(int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton toolbarButton(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarButton", param0);
		SWTBotToolbarButton w = new SWTBotToolbarButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarButton()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton toolbarButton() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarButton");
		SWTBotToolbarButton w = new SWTBotToolbarButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarButton(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton toolbarButton(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarButton", param0, param1);
		SWTBotToolbarButton w = new SWTBotToolbarButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarButtonInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton toolbarButtonInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarButtonInGroup", param0, param1, param2);
		SWTBotToolbarButton w = new SWTBotToolbarButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarButtonInGroup(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton toolbarButtonInGroup(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarButtonInGroup", param0);
		SWTBotToolbarButton w = new SWTBotToolbarButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarButtonInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton toolbarButtonInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarButtonInGroup", param0, param1);
		SWTBotToolbarButton w = new SWTBotToolbarButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarButtonInGroup(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton toolbarButtonInGroup(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarButtonInGroup", param0, param1);
		SWTBotToolbarButton w = new SWTBotToolbarButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarButtonWithId(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton toolbarButtonWithId(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarButtonWithId", param0);
		SWTBotToolbarButton w = new SWTBotToolbarButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarButtonWithId(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton toolbarButtonWithId(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarButtonWithId", param0, param1);
		SWTBotToolbarButton w = new SWTBotToolbarButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarButtonWithId(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton toolbarButtonWithId(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarButtonWithId", param0, param1);
		SWTBotToolbarButton w = new SWTBotToolbarButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarButtonWithId(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton toolbarButtonWithId(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarButtonWithId", param0, param1, param2);
		SWTBotToolbarButton w = new SWTBotToolbarButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarButtonWithTooltip(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton toolbarButtonWithTooltip(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarButtonWithTooltip", param0);
		SWTBotToolbarButton w = new SWTBotToolbarButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarButtonWithTooltip(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton toolbarButtonWithTooltip(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarButtonWithTooltip", param0, param1);
		SWTBotToolbarButton w = new SWTBotToolbarButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarButtonWithTooltipInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton toolbarButtonWithTooltipInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarButtonWithTooltipInGroup", param0, param1, param2);
		SWTBotToolbarButton w = new SWTBotToolbarButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarButtonWithTooltipInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton toolbarButtonWithTooltipInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarButtonWithTooltipInGroup", param0, param1);
		SWTBotToolbarButton w = new SWTBotToolbarButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarDropDownButton()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton toolbarDropDownButton() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarDropDownButton");
		SWTBotToolbarDropDownButton w = new SWTBotToolbarDropDownButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarDropDownButton(int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton toolbarDropDownButton(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarDropDownButton", param0);
		SWTBotToolbarDropDownButton w = new SWTBotToolbarDropDownButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarDropDownButton(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton toolbarDropDownButton(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarDropDownButton", param0);
		SWTBotToolbarDropDownButton w = new SWTBotToolbarDropDownButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarDropDownButton(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton toolbarDropDownButton(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarDropDownButton", param0, param1);
		SWTBotToolbarDropDownButton w = new SWTBotToolbarDropDownButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarDropDownButtonInGroup(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton toolbarDropDownButtonInGroup(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarDropDownButtonInGroup", param0);
		SWTBotToolbarDropDownButton w = new SWTBotToolbarDropDownButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarDropDownButtonInGroup(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton toolbarDropDownButtonInGroup(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarDropDownButtonInGroup", param0, param1);
		SWTBotToolbarDropDownButton w = new SWTBotToolbarDropDownButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarDropDownButtonInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton toolbarDropDownButtonInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarDropDownButtonInGroup", param0, param1, param2);
		SWTBotToolbarDropDownButton w = new SWTBotToolbarDropDownButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarDropDownButtonInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton toolbarDropDownButtonInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarDropDownButtonInGroup", param0, param1);
		SWTBotToolbarDropDownButton w = new SWTBotToolbarDropDownButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarDropDownButtonWithId(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton toolbarDropDownButtonWithId(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarDropDownButtonWithId", param0, param1, param2);
		SWTBotToolbarDropDownButton w = new SWTBotToolbarDropDownButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarDropDownButtonWithId(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton toolbarDropDownButtonWithId(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarDropDownButtonWithId", param0);
		SWTBotToolbarDropDownButton w = new SWTBotToolbarDropDownButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarDropDownButtonWithId(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton toolbarDropDownButtonWithId(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarDropDownButtonWithId", param0, param1);
		SWTBotToolbarDropDownButton w = new SWTBotToolbarDropDownButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarDropDownButtonWithId(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton toolbarDropDownButtonWithId(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarDropDownButtonWithId", param0, param1);
		SWTBotToolbarDropDownButton w = new SWTBotToolbarDropDownButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarDropDownButtonWithTooltip(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton toolbarDropDownButtonWithTooltip(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarDropDownButtonWithTooltip", param0);
		SWTBotToolbarDropDownButton w = new SWTBotToolbarDropDownButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarDropDownButtonWithTooltip(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton toolbarDropDownButtonWithTooltip(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarDropDownButtonWithTooltip", param0, param1);
		SWTBotToolbarDropDownButton w = new SWTBotToolbarDropDownButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarDropDownButtonWithTooltipInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton toolbarDropDownButtonWithTooltipInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarDropDownButtonWithTooltipInGroup", param0, param1);
		SWTBotToolbarDropDownButton w = new SWTBotToolbarDropDownButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarDropDownButtonWithTooltipInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton toolbarDropDownButtonWithTooltipInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarDropDownButtonWithTooltipInGroup", param0, param1, param2);
		SWTBotToolbarDropDownButton w = new SWTBotToolbarDropDownButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarRadioButton(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton toolbarRadioButton(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarRadioButton", param0, param1);
		SWTBotToolbarRadioButton w = new SWTBotToolbarRadioButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarRadioButton()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton toolbarRadioButton() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarRadioButton");
		SWTBotToolbarRadioButton w = new SWTBotToolbarRadioButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarRadioButton(int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton toolbarRadioButton(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarRadioButton", param0);
		SWTBotToolbarRadioButton w = new SWTBotToolbarRadioButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarRadioButton(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton toolbarRadioButton(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarRadioButton", param0);
		SWTBotToolbarRadioButton w = new SWTBotToolbarRadioButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarRadioButtonInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton toolbarRadioButtonInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarRadioButtonInGroup", param0, param1);
		SWTBotToolbarRadioButton w = new SWTBotToolbarRadioButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarRadioButtonInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton toolbarRadioButtonInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarRadioButtonInGroup", param0, param1, param2);
		SWTBotToolbarRadioButton w = new SWTBotToolbarRadioButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarRadioButtonInGroup(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton toolbarRadioButtonInGroup(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarRadioButtonInGroup", param0, param1);
		SWTBotToolbarRadioButton w = new SWTBotToolbarRadioButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarRadioButtonInGroup(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton toolbarRadioButtonInGroup(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarRadioButtonInGroup", param0);
		SWTBotToolbarRadioButton w = new SWTBotToolbarRadioButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarRadioButtonWithId(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton toolbarRadioButtonWithId(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarRadioButtonWithId", param0);
		SWTBotToolbarRadioButton w = new SWTBotToolbarRadioButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarRadioButtonWithId(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton toolbarRadioButtonWithId(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarRadioButtonWithId", param0, param1, param2);
		SWTBotToolbarRadioButton w = new SWTBotToolbarRadioButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarRadioButtonWithId(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton toolbarRadioButtonWithId(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarRadioButtonWithId", param0, param1);
		SWTBotToolbarRadioButton w = new SWTBotToolbarRadioButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarRadioButtonWithId(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton toolbarRadioButtonWithId(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarRadioButtonWithId", param0, param1);
		SWTBotToolbarRadioButton w = new SWTBotToolbarRadioButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarRadioButtonWithTooltip(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton toolbarRadioButtonWithTooltip(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarRadioButtonWithTooltip", param0, param1);
		SWTBotToolbarRadioButton w = new SWTBotToolbarRadioButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarRadioButtonWithTooltip(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton toolbarRadioButtonWithTooltip(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarRadioButtonWithTooltip", param0);
		SWTBotToolbarRadioButton w = new SWTBotToolbarRadioButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarRadioButtonWithTooltipInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton toolbarRadioButtonWithTooltipInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarRadioButtonWithTooltipInGroup", param0, param1, param2);
		SWTBotToolbarRadioButton w = new SWTBotToolbarRadioButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarRadioButtonWithTooltipInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton toolbarRadioButtonWithTooltipInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarRadioButtonWithTooltipInGroup", param0, param1);
		SWTBotToolbarRadioButton w = new SWTBotToolbarRadioButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarToggleButton(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton toolbarToggleButton(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarToggleButton", param0, param1);
		SWTBotToolbarToggleButton w = new SWTBotToolbarToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarToggleButton(int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton toolbarToggleButton(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarToggleButton", param0);
		SWTBotToolbarToggleButton w = new SWTBotToolbarToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarToggleButton()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton toolbarToggleButton() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarToggleButton");
		SWTBotToolbarToggleButton w = new SWTBotToolbarToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarToggleButton(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton toolbarToggleButton(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarToggleButton", param0);
		SWTBotToolbarToggleButton w = new SWTBotToolbarToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarToggleButtonInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton toolbarToggleButtonInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarToggleButtonInGroup", param0, param1);
		SWTBotToolbarToggleButton w = new SWTBotToolbarToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarToggleButtonInGroup(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton toolbarToggleButtonInGroup(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarToggleButtonInGroup", param0, param1);
		SWTBotToolbarToggleButton w = new SWTBotToolbarToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarToggleButtonInGroup(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton toolbarToggleButtonInGroup(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarToggleButtonInGroup", param0);
		SWTBotToolbarToggleButton w = new SWTBotToolbarToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarToggleButtonInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton toolbarToggleButtonInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarToggleButtonInGroup", param0, param1, param2);
		SWTBotToolbarToggleButton w = new SWTBotToolbarToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarToggleButtonWithId(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton toolbarToggleButtonWithId(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarToggleButtonWithId", param0, param1, param2);
		SWTBotToolbarToggleButton w = new SWTBotToolbarToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarToggleButtonWithId(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton toolbarToggleButtonWithId(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarToggleButtonWithId", param0, param1);
		SWTBotToolbarToggleButton w = new SWTBotToolbarToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarToggleButtonWithId(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton toolbarToggleButtonWithId(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarToggleButtonWithId", param0, param1);
		SWTBotToolbarToggleButton w = new SWTBotToolbarToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarToggleButtonWithId(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton toolbarToggleButtonWithId(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarToggleButtonWithId", param0);
		SWTBotToolbarToggleButton w = new SWTBotToolbarToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarToggleButtonWithTooltip(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton toolbarToggleButtonWithTooltip(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarToggleButtonWithTooltip", param0);
		SWTBotToolbarToggleButton w = new SWTBotToolbarToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarToggleButtonWithTooltip(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton toolbarToggleButtonWithTooltip(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarToggleButtonWithTooltip", param0, param1);
		SWTBotToolbarToggleButton w = new SWTBotToolbarToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarToggleButtonWithTooltipInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton toolbarToggleButtonWithTooltipInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarToggleButtonWithTooltipInGroup", param0, param1, param2);
		SWTBotToolbarToggleButton w = new SWTBotToolbarToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.toolbarToggleButtonWithTooltipInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton toolbarToggleButtonWithTooltipInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toolbarToggleButtonWithTooltipInGroup", param0, param1);
		SWTBotToolbarToggleButton w = new SWTBotToolbarToggleButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree org.lcx.robotframework.swtbot.swt.finder.SWTBot.treeInGroup(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree treeInGroup(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "treeInGroup", param0, param1);
		SWTBotTree w = new SWTBotTree(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree org.lcx.robotframework.swtbot.swt.finder.SWTBot.treeInGroup(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree treeInGroup(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "treeInGroup", param0);
		SWTBotTree w = new SWTBotTree(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree org.lcx.robotframework.swtbot.swt.finder.SWTBot.treeWithId(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree treeWithId(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "treeWithId", param0);
		SWTBotTree w = new SWTBotTree(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree org.lcx.robotframework.swtbot.swt.finder.SWTBot.treeWithId(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree treeWithId(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "treeWithId", param0, param1);
		SWTBotTree w = new SWTBotTree(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree org.lcx.robotframework.swtbot.swt.finder.SWTBot.treeWithId(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree treeWithId(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "treeWithId", param0, param1, param2);
		SWTBotTree w = new SWTBotTree(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree org.lcx.robotframework.swtbot.swt.finder.SWTBot.treeWithId(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree treeWithId(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "treeWithId", param0, param1);
		SWTBotTree w = new SWTBotTree(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree org.lcx.robotframework.swtbot.swt.finder.SWTBot.treeWithLabel(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree treeWithLabel(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "treeWithLabel", param0, param1);
		SWTBotTree w = new SWTBotTree(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree org.lcx.robotframework.swtbot.swt.finder.SWTBot.treeWithLabel(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree treeWithLabel(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "treeWithLabel", param0);
		SWTBotTree w = new SWTBotTree(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree org.lcx.robotframework.swtbot.swt.finder.SWTBot.treeWithLabelInGroup(java.lang.String,java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree treeWithLabelInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "treeWithLabelInGroup", param0, param1);
		SWTBotTree w = new SWTBotTree(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree org.lcx.robotframework.swtbot.swt.finder.SWTBot.treeWithLabelInGroup(java.lang.String,java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree treeWithLabelInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "treeWithLabelInGroup", param0, param1, param2);
		SWTBotTree w = new SWTBotTree(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList org.lcx.robotframework.swtbot.swt.finder.SWTBot.list()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList list() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "list");
		SWTBotList w = new SWTBotList(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList org.lcx.robotframework.swtbot.swt.finder.SWTBot.list(int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotList list(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "list", param0);
		SWTBotList w = new SWTBotList(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable org.lcx.robotframework.swtbot.swt.finder.SWTBot.table(int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable table(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "table", param0);
		SWTBotTable w = new SWTBotTable(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable org.lcx.robotframework.swtbot.swt.finder.SWTBot.table()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTable table() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "table");
		SWTBotTable w = new SWTBotTable(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel org.lcx.robotframework.swtbot.swt.finder.SWTBot.label()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel label() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "label");
		SWTBotLabel w = new SWTBotLabel(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel org.lcx.robotframework.swtbot.swt.finder.SWTBot.label(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel label(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "label", param0, param1);
		SWTBotLabel w = new SWTBotLabel(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel org.lcx.robotframework.swtbot.swt.finder.SWTBot.label(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel label(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "label", param0);
		SWTBotLabel w = new SWTBotLabel(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel org.lcx.robotframework.swtbot.swt.finder.SWTBot.label(int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel label(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "label", param0);
		SWTBotLabel w = new SWTBotLabel(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText org.lcx.robotframework.swtbot.swt.finder.SWTBot.text(int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText text(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "text", param0);
		SWTBotText w = new SWTBotText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText org.lcx.robotframework.swtbot.swt.finder.SWTBot.text(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText text(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "text", param0);
		SWTBotText w = new SWTBotText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText org.lcx.robotframework.swtbot.swt.finder.SWTBot.text()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText text() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "text");
		SWTBotText w = new SWTBotText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText org.lcx.robotframework.swtbot.swt.finder.SWTBot.text(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText text(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "text", param0, param1);
		SWTBotText w = new SWTBotText(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.button(int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton button(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "button", param0);
		SWTBotButton w = new SWTBotButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.button()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton button() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "button");
		SWTBotButton w = new SWTBotButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.button(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton button(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "button", param0);
		SWTBotButton w = new SWTBotButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton org.lcx.robotframework.swtbot.swt.finder.SWTBot.button(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotButton button(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "button", param0, param1);
		SWTBotButton w = new SWTBotButton(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.comboBox(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo comboBox(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "comboBox", param0, param1);
		SWTBotCombo w = new SWTBotCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.comboBox(int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo comboBox(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "comboBox", param0);
		SWTBotCombo w = new SWTBotCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.comboBox()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo comboBox() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "comboBox");
		SWTBotCombo w = new SWTBotCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo org.lcx.robotframework.swtbot.swt.finder.SWTBot.comboBox(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCombo comboBox(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "comboBox", param0);
		SWTBotCombo w = new SWTBotCombo(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree org.lcx.robotframework.swtbot.swt.finder.SWTBot.tree(int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree tree(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "tree", param0);
		SWTBotTree w = new SWTBotTree(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree org.lcx.robotframework.swtbot.swt.finder.SWTBot.tree()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTree tree() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "tree");
		SWTBotTree w = new SWTBotTree(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider org.lcx.robotframework.swtbot.swt.finder.SWTBot.slider(int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider slider(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "slider", param0);
		SWTBotSlider w = new SWTBotSlider(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider org.lcx.robotframework.swtbot.swt.finder.SWTBot.slider()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider slider() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "slider");
		SWTBotSlider w = new SWTBotSlider(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider org.lcx.robotframework.swtbot.swt.finder.SWTBot.slider(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider slider(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "slider", param0, param1);
		SWTBotSlider w = new SWTBotSlider(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider org.lcx.robotframework.swtbot.swt.finder.SWTBot.slider(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider slider(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "slider", param0);
		SWTBotSlider w = new SWTBotSlider(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink org.lcx.robotframework.swtbot.swt.finder.SWTBot.link(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink link(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "link", param0, param1);
		SWTBotLink w = new SWTBotLink(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink org.lcx.robotframework.swtbot.swt.finder.SWTBot.link()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink link() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "link");
		SWTBotLink w = new SWTBotLink(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink org.lcx.robotframework.swtbot.swt.finder.SWTBot.link(int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink link(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "link", param0);
		SWTBotLink w = new SWTBotLink(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink org.lcx.robotframework.swtbot.swt.finder.SWTBot.link(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink link(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "link", param0);
		SWTBotLink w = new SWTBotLink(o);
		Context.setCurrentWidget(w);
		return w;
	}


}
