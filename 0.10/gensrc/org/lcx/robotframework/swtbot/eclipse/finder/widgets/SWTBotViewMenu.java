/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.eclipse.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.commons.AbstractSWTBotObject;

public class SWTBotViewMenu extends AbstractSWTBotObject {

	public SWTBotViewMenu(Object o) {
		super(o);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotViewMenu.click() throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public void click() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "click");
	}

	//public java.lang.Object org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotViewMenu.getClickResult()
	public java.lang.Object getClickResult() throws SWTBotBridgeException {
		//TODO: class=class java.lang.Object
		 return null;
	}

	//public java.lang.String org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotViewMenu.getText() throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public java.lang.String getText() throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "getText");
	}

	//public boolean org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotViewMenu.isChecked()
	public boolean isChecked() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isChecked");
		return b.booleanValue();
	}


}
