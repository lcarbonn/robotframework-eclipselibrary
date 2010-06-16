package org.lcx.robotframework.swtbot.eclipse.finder.waits;

import java.lang.reflect.Method;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.waits.ICondition;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;

public class Conditions  {
	
	public static ICondition widgetIsEnabled(SWTWorkbenchBot SWTWorkbenchBot, AbstractSWTBotControl widget) 
		throws SWTBotBridgeException {
		try {
			Class<?> c = SWTBotBridge.loadClass("org.eclipse.swtbot.eclipse.finder.waits.Conditions");
			Class<?> paramType = SWTBotBridge.loadClass("org.eclipse.swtbot.swt.finder.widgets.AbstractSWTBot");
			Method method = c.getMethod("widgetIsEnabled", paramType);
			method.setAccessible(true);
			
			Object o = method.invoke(null, widget.getDistantObject());
			Condition cond = new Condition(o);
			return cond;
		} catch (Exception e) {
			e.printStackTrace();
			throw new SWTBotBridgeException("Error in Conditions : widgetIsEnabled", e);
		}
	}

}
