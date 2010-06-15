package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;


public class SWTBotRadio extends AbstractSWTBotControl {

	public SWTBotRadio(Object o) {
		super(o);
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio.isSelected()
	public boolean isSelected() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isSelected");
		return b.booleanValue();
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio.click()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotRadio click() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "click");
		return this;
	}


}
