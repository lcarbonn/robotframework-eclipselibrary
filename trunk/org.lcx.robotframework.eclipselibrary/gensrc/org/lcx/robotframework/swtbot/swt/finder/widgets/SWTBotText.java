package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;


public class SWTBotText extends AbstractSWTBotControl {

	public SWTBotText(Object o) {
		super(o);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText.notifyKeyboardEvent(int,char)
	public void notifyKeyboardEvent(int param0, char param1) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "notifyKeyboardEvent", param0, param1);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText.notifyKeyboardEvent(int,char,int)
	public void notifyKeyboardEvent(int param0, char param1, int param2) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "notifyKeyboardEvent", param0, param1, param2);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText.selectAll()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText selectAll() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "selectAll");
		return this;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText.setText(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText setText(java.lang.String param0) throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "setText", param0);
		return this;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText.typeText(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText typeText(java.lang.String param0) throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "typeText", param0);
		return this;
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText.typeText(java.lang.String,int)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotText typeText(java.lang.String param0, int param1) throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "typeText", param0, param1);
		return this;
	}


}
