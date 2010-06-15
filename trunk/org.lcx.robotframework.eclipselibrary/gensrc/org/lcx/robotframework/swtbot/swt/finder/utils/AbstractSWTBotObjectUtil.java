package org.lcx.robotframework.swtbot.swt.finder.utils;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.commons.AbstractSWTBotObject;


public abstract class AbstractSWTBotObjectUtil extends AbstractSWTBotObject {

	public AbstractSWTBotObjectUtil(Object o) {
		super(o);
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.utils.Position.hashCode()
	@Override
	public int hashCode() {
		try {
			Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "hashCode");
			return i.intValue();
		} catch (SWTBotBridgeException e) {
			// TODO: handle exception
		}
		return 0;
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.utils.Position.equals(java.lang.Object)
	public boolean equals(java.lang.Object param0) { 
		try {
			Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "equals", param0);
			return b.booleanValue();
		} catch (SWTBotBridgeException e) {
			// TODO: handle exception
		}
		return false;
	}

	//public java.lang.String org.lcx.robotframework.swtbot.swt.finder.utils.Position.toString()
	public java.lang.String toString() {
		try {
			return (String)SWTBotBridge.callMethod(distantObject, "toString");
		} catch (SWTBotBridgeException e) {
			// TODO: handle exception
		}
		return null;
	}


}
