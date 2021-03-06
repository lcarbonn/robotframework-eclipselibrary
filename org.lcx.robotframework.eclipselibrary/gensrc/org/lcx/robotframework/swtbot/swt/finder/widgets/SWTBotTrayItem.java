/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;


public class SWTBotTrayItem extends AbstractSWTBotControl {

	public SWTBotTrayItem(Object o) {
		super(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTrayItem.contextMenu(java.lang.String) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu contextMenu(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "contextMenu", param0);
		return new SWTBotMenu(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotTrayItem.menu(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu menu(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "menu", param0);
		return new SWTBotMenu(o);
	}


}
