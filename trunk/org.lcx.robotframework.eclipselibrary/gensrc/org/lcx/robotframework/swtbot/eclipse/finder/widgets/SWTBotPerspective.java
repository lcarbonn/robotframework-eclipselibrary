package org.lcx.robotframework.swtbot.eclipse.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;


public class SWTBotPerspective extends AbstractSWTBotControl {

	public SWTBotPerspective(Object o) {
		super(o);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotPerspective.activate()
	public void activate() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "activate");
	}

	//public java.lang.String org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotPerspective.getLabel()
	public java.lang.String getLabel() throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "getLabel");
	}

	//public boolean org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotPerspective.isActive()
	public boolean isActive() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isActive");
		return b.booleanValue();
	}

	//public java.lang.String org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotPerspective.toString()

}
