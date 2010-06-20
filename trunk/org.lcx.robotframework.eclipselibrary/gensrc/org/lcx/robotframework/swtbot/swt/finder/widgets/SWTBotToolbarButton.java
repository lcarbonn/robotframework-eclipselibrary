package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;


public class SWTBotToolbarButton extends AbstractSWTBotControl {

	public SWTBotToolbarButton(Object o) {
		super(o);
	}

	//public abstract org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton.click()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton click() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "click");
		return this;
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton.isEnabled()
	public boolean isEnabled() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isEnabled");
		return b.booleanValue();
	}


}
