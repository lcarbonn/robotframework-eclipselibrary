/*
 * Copyright 2013 L. Carbonnaux
 * 2020 Nebula Nattable extension by J. Beaumont
 */
package org.lcx.robotframework.swtbot.nebula.nattable.finder;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable;


public class SWTNatTableBot extends SWTWorkbenchBot {

	private static SWTNatTableBot instance;

	public static SWTNatTableBot getSWTNatTableBot() throws SWTBotBridgeException {
		if(instance==null) {
			instance = new SWTNatTableBot();
		}
		return instance;
	}

	public SWTNatTableBot() throws SWTBotBridgeException {
		super(null);
		System.out.println("Instanciation of SWTNatTableBot");
		
		distantObject = SWTBotBridge.getSWTNATTABLEBOT();
		Object o = SWTBotBridge.callMethod(distantObject, "getFinder");
		SWTBotBridge.callMethod(o, "setShouldFindInvisibleControls", true);
		SWTBotBridge.setStaticField("org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences",
				"SCREENSHOTS_DIR", "./screenshots/");
		
	}
	
	public SWTNatTableBot(Object o) throws SWTBotBridgeException {
		super(o);
	}

	//public org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable org.lcx.robotframework.swtbot.nebula.nattable.finder.SWTNatTableBot.nattable(int) throws org.lcx.robotframework.swtbot.nebula.nattable.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable nattable(int param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "nattable", param0);
		org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable w = new SWTBotNatTable(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable org.lcx.robotframework.swtbot.nebula.nattable.finder.SWTNatTableBot.nattable() throws org.lcx.robotframework.swtbot.nebula.nattable.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable nattable() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "nattable");
		org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable w = new SWTBotNatTable(o);
		Context.setCurrentWidget(w);
		return w;
	}
	
	//public org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable org.lcx.robotframework.swtbot.nebula.nattable.finder.SWTNatTableBot.nattableInGroup(java.lang.String)
		public org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable nattableInGroup(java.lang.String param0) throws SWTBotBridgeException {
			Object o = SWTBotBridge.callMethod(distantObject, "nattableInGroup", param0);
			org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable w = new SWTBotNatTable(o);
			Context.setCurrentWidget(w);
			return w;
		}

		//public org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable org.lcx.robotframework.swtbot.nebula.nattable.finder.SWTNatTableBot.nattableInGroup(java.lang.String,int)
		public org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable nattableInGroup(java.lang.String param0, int param1) throws SWTBotBridgeException {
			Object o = SWTBotBridge.callMethod(distantObject, "nattableInGroup", param0, param1);
			org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable w = new SWTBotNatTable(o);
			Context.setCurrentWidget(w);
			return w;
		}

		//public org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable org.lcx.robotframework.swtbot.nebula.nattable.finder.SWTNatTableBot.nattableWithId(java.lang.String)
		public org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable nattableWithId(java.lang.String param0) throws SWTBotBridgeException {
			Object o = SWTBotBridge.callMethod(distantObject, "nattableWithId", param0);
			org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable w = new SWTBotNatTable(o);
			Context.setCurrentWidget(w);
			return w;
		}

		//public org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable org.lcx.robotframework.swtbot.nebula.nattable.finder.SWTNatTableBot.nattableWithId(java.lang.String,java.lang.String)
		public org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable nattableWithId(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
			Object o = SWTBotBridge.callMethod(distantObject, "nattableWithId", param0, param1);
			org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable w = new SWTBotNatTable(o);
			Context.setCurrentWidget(w);
			return w;
		}

		//public org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable org.lcx.robotframework.swtbot.nebula.nattable.finder.SWTNatTableBot.nattableWithId(java.lang.String,java.lang.String,int)
		public org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable nattableWithId(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
			Object o = SWTBotBridge.callMethod(distantObject, "nattableWithId", param0, param1, param2);
			org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable w = new SWTBotNatTable(o);
			Context.setCurrentWidget(w);
			return w;
		}

		//public org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable org.lcx.robotframework.swtbot.nebula.nattable.finder.SWTNatTableBot.nattableWithId(java.lang.String,int)
		public org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable nattableWithId(java.lang.String param0, int param1) throws SWTBotBridgeException {
			Object o = SWTBotBridge.callMethod(distantObject, "nattableWithId", param0, param1);
			org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable w = new SWTBotNatTable(o);
			Context.setCurrentWidget(w);
			return w;
		}

		//public org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable org.lcx.robotframework.swtbot.nebula.nattable.finder.SWTNatTableBot.nattableWithLabelInGroup(java.lang.String,java.lang.String)
		public org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable nattableWithLabelInGroup(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
			Object o = SWTBotBridge.callMethod(distantObject, "nattableWithLabelInGroup", param0, param1);
			org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable w = new SWTBotNatTable(o);
			Context.setCurrentWidget(w);
			return w;
		}

		//public org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable org.lcx.robotframework.swtbot.nebula.nattable.finder.SWTNatTableBot.nattableWithLabelInGroup(java.lang.String,java.lang.String,int)
		public org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable nattableWithLabelInGroup(java.lang.String param0, java.lang.String param1, int param2) throws SWTBotBridgeException {
			Object o = SWTBotBridge.callMethod(distantObject, "nattableWithLabelInGroup", param0, param1, param2);
			org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable w = new SWTBotNatTable(o);
			Context.setCurrentWidget(w);
			return w;
		}

		//public org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable org.lcx.robotframework.swtbot.nebula.nattable.finder.SWTNatTableBot.nattableWithLabel(java.lang.String)
		public org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable nattableWithLabel(java.lang.String param0) throws SWTBotBridgeException {
			Object o = SWTBotBridge.callMethod(distantObject, "nattableWithLabel", param0);
			org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable w = new SWTBotNatTable(o);
			Context.setCurrentWidget(w);
			return w;
		}

		//public org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable org.lcx.robotframework.swtbot.nebula.nattable.finder.SWTNatTableBot.nattableWithLabel(java.lang.String,int)
		public org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable nattableWithLabel(java.lang.String param0, int param1) throws SWTBotBridgeException {
			Object o = SWTBotBridge.callMethod(distantObject, "nattableWithLabel", param0, param1);
			org.lcx.robotframework.swtbot.nebula.nattable.finder.widgets.SWTBotNatTable w = new SWTBotNatTable(o);
			Context.setCurrentWidget(w);
			return w;
		}

}
