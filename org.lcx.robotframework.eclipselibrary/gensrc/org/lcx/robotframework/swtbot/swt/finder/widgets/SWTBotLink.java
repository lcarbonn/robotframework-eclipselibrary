/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;


public class SWTBotLink extends AbstractSWTBotControl {

	public SWTBotLink(Object o) {
		super(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBot org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink.click(java.lang.String)
	public void click(java.lang.String param0) throws SWTBotBridgeException {
		//TODO: type=org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBot<org.eclipse.swt.widgets.Link>
		SWTBotBridge.callMethod(distantObject, "click", param0);
//		 return null;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBot org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLink.click()
	public void click() throws SWTBotBridgeException {
		//TODO: type=org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBot<org.eclipse.swt.widgets.Link>
		SWTBotBridge.callMethod(distantObject, "click");
//		 return null;
	}


}
