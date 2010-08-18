package org.lcx.robotframework.swtbot.swt.finder.widgets;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.commons.AbstractSWTBotObject;
import org.lcx.robotframework.swtbot.commons.Color;


public class AbstractSWTBot extends AbstractSWTBotObject {

	
	public AbstractSWTBot(Object o) {
		super(o);
	}

	public void setFocus() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "setFocus");
	}
	
	public SWTBotMenu contextMenu(String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "contextMenu", param0);
		SWTBotMenu menu = new SWTBotMenu(o);
		return menu;
	}
	
//	public AbstractSWTBot pressShortcut(int param0,int param1,char param2) {
//		
//	}
//	
//	public AbstractSWTBot pressShortcut(org.eclipse.jface.bindings.keys.KeyStroke[]) {
//		
//	}
	
//	public AbstractSWTBot pressShortcut(int param0,char param1) {
//		
//	}

	public boolean isEnabled() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isEnabled");
		return b.booleanValue();
	}
	
	public boolean isVisible() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isVisible");
		return b.booleanValue();
	}
	
	public boolean isActive() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isActive");
		return b.booleanValue();
	}
	
	public String getText() throws SWTBotBridgeException {
		String s = (String)SWTBotBridge.callMethod(distantObject, "getText");
		return s;
	}
	
	public Color backgroundColor() throws SWTBotBridgeException {
		Object color = SWTBotBridge.callMethod(distantObject, "backgroundColor");
		Integer red = (Integer)SWTBotBridge.callMethod(color, "getRed");
		Integer green = (Integer)SWTBotBridge.callMethod(color, "getGreen");
		Integer blue = (Integer)SWTBotBridge.callMethod(color, "getBlue");
		Color oColor = new Color(red.intValue(), green.intValue(), blue.intValue());
		return oColor;
	}
	
	public Color foregroundColor() throws SWTBotBridgeException {
		Object color = SWTBotBridge.callMethod(distantObject, "foregroundColor");
		Integer red = (Integer)SWTBotBridge.callMethod(color, "getRed");
		Integer green = (Integer)SWTBotBridge.callMethod(color, "getGreen");
		Integer blue = (Integer)SWTBotBridge.callMethod(color, "getBlue");
		Color oColor = new Color(red.intValue(), green.intValue(), blue.intValue());
		return oColor;
	}
	
	public String getToolTipText() throws SWTBotBridgeException {
		String s = (String)SWTBotBridge.callMethod(distantObject, "getToolTipText");
		return s;
	}
	
//	public boolean traverse(org.eclipse.swtbot.swt.finder.utils.Traverse) {
//		
//	}
	
}
