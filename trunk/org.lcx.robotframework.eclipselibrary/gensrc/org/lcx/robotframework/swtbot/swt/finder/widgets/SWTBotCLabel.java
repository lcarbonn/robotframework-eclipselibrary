/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;


public class SWTBotCLabel extends AbstractSWTBotControl {

	public SWTBotCLabel(Object o) {
		super(o);
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel.alignment()
	public int alignment() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "alignment");
		return i.intValue();
	}

	//public org.eclipse.swt.graphics.Image org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCLabel.image()

}
