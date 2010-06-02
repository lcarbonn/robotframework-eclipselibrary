package org.lcx.robotframework.swtbot.eclipse.finder.waits;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.waits.ICondition;
import org.lcx.robotframework.swtbot.swt.finder.widget.SWTBotWidget;

public class Conditions  {
	
	public static ICondition widgetIsEnabled(SWTWorkbenchBot SWTWorkbenchBot, SWTBotWidget widget) 
		throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(SWTWorkbenchBot, "widgetIsEnabled", widget.getWidget());
		Condition cond = new Condition(o);
		return cond;
	}

}
