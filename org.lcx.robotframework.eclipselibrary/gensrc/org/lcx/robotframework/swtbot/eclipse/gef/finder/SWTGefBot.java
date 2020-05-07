/*
 * Copyright 2013 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.eclipse.gef.finder;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefViewer;
import org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefView;
import org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor;


public class SWTGefBot extends SWTWorkbenchBot {

	private static SWTGefBot instance;

	public static SWTGefBot getSWTWorkbenchBot() throws SWTBotBridgeException {
		if(instance==null) {
			instance = new SWTGefBot();
		}
		return instance;
	}

	public SWTGefBot() throws SWTBotBridgeException {
		super(null);
		System.out.println("Instanciation of SWTGefBot");
		
		distantObject = SWTBotBridge.getSWTGEFBOT();
		Object o = SWTBotBridge.callMethod(distantObject, "getFinder");
		SWTBotBridge.callMethod(o, "setShouldFindInvisibleControls", true);
		SWTBotBridge.setStaticField("org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences",
				"SCREENSHOTS_DIR", "./screenshots/");
		
	}
	
	public SWTGefBot(Object o) throws SWTBotBridgeException {
		super(o);
	}

	//public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor org.lcx.robotframework.swtbot.eclipse.gef.finder.SWTGefBot.gefEditor(java.lang.String) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor gefEditor(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "gefEditor", param0);
		org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor w = new SWTBotGefEditor(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor org.lcx.robotframework.swtbot.eclipse.gef.finder.SWTGefBot.gefEditor(java.lang.String,int) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor gefEditor(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "gefEditor", param0, param1);
		org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor w = new SWTBotGefEditor(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefView org.lcx.robotframework.swtbot.eclipse.gef.finder.SWTGefBot.gefView(java.lang.String) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefView gefView(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "gefView", param0);
		org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefView w = new SWTBotGefView(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefView org.lcx.robotframework.swtbot.eclipse.gef.finder.SWTGefBot.gefView(java.lang.String,int) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefView gefView(java.lang.String param0, int param1) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "gefView", param0, param1);
		org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefView w = new SWTBotGefView(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefViewer org.lcx.robotframework.swtbot.eclipse.gef.finder.SWTGefBot.gefViewer(java.lang.String) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefViewer gefViewer(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "gefViewer", param0);
		org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefViewer w = new SWTBotGefViewer(o);
		Context.setCurrentWidget(w);
		return w;
	}


}
