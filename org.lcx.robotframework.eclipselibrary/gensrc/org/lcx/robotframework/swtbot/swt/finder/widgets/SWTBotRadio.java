package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;


public class SWTBotRadio extends AbstractSWTBotControl {

	public SWTBotRadio(Object o) {
		super(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio.click()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio click() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "click");
		return this;
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio.isSelected()
	public boolean isSelected() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isSelected");
		return b.booleanValue();
	}


}
