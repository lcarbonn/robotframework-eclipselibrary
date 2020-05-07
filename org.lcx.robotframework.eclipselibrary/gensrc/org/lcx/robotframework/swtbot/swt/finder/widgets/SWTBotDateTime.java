/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;
import java.util.Date;


public class SWTBotDateTime extends AbstractSWTBotControl {

	public SWTBotDateTime(Object o) {
		super(o);
	}

	//public java.util.Date org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime.getDate()
	public java.util.Date getDate() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "getDate");
		Long l = (Long)SWTBotBridge.callMethod(o, "getTime");
		Date date = new Date(l.longValue());
		return date;
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime.setDate(java.util.Date)
	public void setDate(java.util.Date param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "setDate", param0);
	}


}
