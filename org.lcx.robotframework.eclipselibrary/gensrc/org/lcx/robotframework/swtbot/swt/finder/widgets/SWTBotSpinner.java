package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;


public class SWTBotSpinner extends AbstractSWTBotControl {

	public SWTBotSpinner(Object o) {
		super(o);
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner.getDigits()
	public int getDigits() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "getDigits");
		return i.intValue();
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner.getIncrement()
	public int getIncrement() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "getIncrement");
		return i.intValue();
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner.getMaximum()
	public int getMaximum() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "getMaximum");
		return i.intValue();
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner.getMinimum()
	public int getMinimum() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "getMinimum");
		return i.intValue();
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner.getPageIncrement()
	public int getPageIncrement() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "getPageIncrement");
		return i.intValue();
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner.getSelection()
	public int getSelection() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "getSelection");
		return i.intValue();
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSpinner.setSelection(int)
	public void setSelection(int param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "setSelection", param0);
	}


}
