/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton;


public class SWTBotToolbarDropDownButton extends SWTBotToolbarButton {

	public SWTBotToolbarDropDownButton(Object o) {
		super(o);
	}

	//public volatile org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton.click()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton click() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "click");
		return new SWTBotToolbarButton(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton.menuItem(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu menuItem(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "menuItem", param0);
		return new SWTBotMenu(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton.menuItem(org.hamcrest.Matcher)
	//public java.util.List org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton.menuItems(org.hamcrest.Matcher)

}
