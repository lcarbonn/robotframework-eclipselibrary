package org.lcx.robotframework.swtbot.eclipse.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;


public class SWTBotCommand extends SWTBotWorkbenchPart {

	public SWTBotCommand(Object o) {
		super(o);
	}

	//public java.lang.Object org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotCommand.getClickResult()
	public java.lang.Object getClickResult() throws SWTBotBridgeException {
		//TODO: class=class java.lang.Object
		 return null;
	}

	//public boolean org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotCommand.isEnabled()
	public boolean isEnabled() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isEnabled");
		return b.booleanValue();
	}

	//public java.lang.String org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotCommand.getText() throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public java.lang.String getText() throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "getText");
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotCommand.click() throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public void click() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "click");
	}


}
