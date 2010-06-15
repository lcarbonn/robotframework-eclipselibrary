package org.lcx.robotframework.swtbot.commons;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;

public class AbstractSWTBotObject {

	// the distant object on which reflection is made
	protected Object distantObject;
	
	public AbstractSWTBotObject(Object o) {
		distantObject = o;
	}

	public Object getWidget() {
		return distantObject;
	}
	
	public String toString() {
		try {
			String s = (String)SWTBotBridge.callMethod(distantObject, "toString");
			return s;
		} catch (Exception e) {
			return e.toString();
		}
	}
	
	
}
