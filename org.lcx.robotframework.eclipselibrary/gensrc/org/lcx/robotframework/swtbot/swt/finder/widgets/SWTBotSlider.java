/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;


public class SWTBotSlider extends AbstractSWTBotControl {

	public SWTBotSlider(Object o) {
		super(o);
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider.getIncrement()
	public int getIncrement() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "getIncrement");
		return i.intValue();
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider.getMaximum()
	public int getMaximum() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "getMaximum");
		return i.intValue();
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider.getMinimum()
	public int getMinimum() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "getMinimum");
		return i.intValue();
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider.getPageIncrement()
	public int getPageIncrement() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "getPageIncrement");
		return i.intValue();
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider.getSelection()
	public int getSelection() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "getSelection");
		return i.intValue();
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider.getThumb()
	public int getThumb() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "getThumb");
		return i.intValue();
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider.setSelection(int)
	public void setSelection(int param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "setSelection", param0);
	}


}
