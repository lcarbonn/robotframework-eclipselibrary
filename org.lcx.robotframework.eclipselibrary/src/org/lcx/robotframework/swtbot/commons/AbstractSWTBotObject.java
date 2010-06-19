package org.lcx.robotframework.swtbot.commons;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;

public class AbstractSWTBotObject implements ISWTBotObject {

	// the distant object on which reflection is made
	protected Object distantObject;
	
	public AbstractSWTBotObject(Object o) {
		distantObject = o;
	}

	public Object getDistantObject() {
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
	
	public int hashCode() {
		try {
			Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "hashCode");
			return i.intValue();
		} catch (Exception e) {
			return -1;
		}
	}

	public boolean equals(java.lang.Object param0) {
		try {
			Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "equals", param0);
			return b.booleanValue();
		} catch (Exception e) {
			return false;
		}
	}
	
	
}
