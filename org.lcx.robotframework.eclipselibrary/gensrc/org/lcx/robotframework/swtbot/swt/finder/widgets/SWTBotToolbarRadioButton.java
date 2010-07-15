package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;

public class SWTBotToolbarRadioButton extends SWTBotToolbarButton {

	public SWTBotToolbarRadioButton(Object o) {
		super(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton.click()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton click() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "click");
		return this;
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton.deselect()
	public void deselect() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "deselect");
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton.isChecked()
	public boolean isChecked() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isChecked");
		return b.booleanValue();
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton.select()
	public void select() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "select");
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton.toggle()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton toggle() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "toggle");
		return this;
	}


}
