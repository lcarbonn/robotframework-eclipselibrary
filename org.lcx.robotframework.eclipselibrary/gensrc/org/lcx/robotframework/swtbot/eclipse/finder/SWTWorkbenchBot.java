/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.eclipse.finder;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.SWTBot;
import org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView;
import java.util.List;
import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotPerspective;


public class SWTWorkbenchBot extends SWTBot {

	private static SWTWorkbenchBot instance;

	public static SWTWorkbenchBot getSWTWorkbenchBot() throws SWTBotBridgeException {
		if(instance==null) {
			instance = new SWTWorkbenchBot();
		}
		return instance;
	}

	public SWTWorkbenchBot() throws SWTBotBridgeException {
		super(null);
		System.out.println("Instanciation of SWTWorkbenchBot");
		
		distantObject = SWTBotBridge.getSWTWORKBENCHBOT();
		//TODO if eclipse is not started, throw a nupexcep
		Object o = SWTBotBridge.callMethod(distantObject, "getFinder");
		SWTBotBridge.callMethod(o, "setShouldFindInvisibleControls", true);
		SWTBotBridge.setStaticField("org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences",
				"SCREENSHOTS_DIR", "./screenshots/");
		
	}

	public SWTWorkbenchBot(Object o) throws SWTBotBridgeException {
		super(o);
	}

	//public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEditor org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.activeEditor()
	public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEditor activeEditor() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "activeEditor");
		org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEditor w = new SWTBotEditor(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotPerspective org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.activePerspective()
	public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotPerspective activePerspective() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "activePerspective");
		org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotPerspective w = new SWTBotPerspective(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.activeView()
	public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView activeView() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "activeView");
		org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView w = new SWTBotView(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.activePart()
	public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView activePart() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "activePart");
		org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView w = new SWTBotView(o);
		Context.setCurrentWidget(w);
		return w;
	}
		
	//public void org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.closeAllEditors()
	public void closeAllEditors() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "closeAllEditors");
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.closeAllShells()
	public void closeAllShells() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "closeAllShells");
	}

	//public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotPerspective org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.defaultPerspective()
	public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotPerspective defaultPerspective() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "defaultPerspective");
		org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotPerspective w = new SWTBotPerspective(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEditor org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.editorById(java.lang.String)
	public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEditor editorById(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "editorById", param0);
		org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEditor w = new SWTBotEditor(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEditor org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.editorByTitle(java.lang.String)
	public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEditor editorByTitle(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "editorByTitle", param0);
		org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEditor w = new SWTBotEditor(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEditor org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.editor(org.hamcrest.Matcher)
	//public java.util.List org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.editors()
	@SuppressWarnings("unchecked")
	public java.util.List<? extends org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEditor> editors() throws SWTBotBridgeException {
		return (List)SWTBotBridge.callMethodReturnSWTBotList(distantObject, "editors", org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEditor.class);

	}

	//public java.util.List org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.editors(org.hamcrest.Matcher)
	//public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotPerspective org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.perspectiveById(java.lang.String)
	public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotPerspective perspectiveById(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "perspectiveById", param0);
		org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotPerspective w = new SWTBotPerspective(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotPerspective org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.perspectiveByLabel(java.lang.String)
	public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotPerspective perspectiveByLabel(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "perspectiveByLabel", param0);
		org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotPerspective w = new SWTBotPerspective(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotPerspective org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.perspective(org.hamcrest.Matcher)
	//public java.util.List org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.perspectives()
	@SuppressWarnings("unchecked")
	public java.util.List<org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotPerspective> perspectives() throws SWTBotBridgeException {
		return (List)SWTBotBridge.callMethodReturnSWTBotList(distantObject, "perspectives", org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotPerspective.class);

	}

	//public java.util.List org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.perspectives(org.hamcrest.Matcher)
	//public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotPerspective org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.resetActivePerspective()
	public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotPerspective resetActivePerspective() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "resetActivePerspective");
		org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotPerspective w = new SWTBotPerspective(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.resetWorkbench()
	public void resetWorkbench() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "resetWorkbench");
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.saveAllEditors()
	public void saveAllEditors() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "saveAllEditors");
	}

	//public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.viewById(java.lang.String)
	public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView viewById(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "viewById", param0);
		org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView w = new SWTBotView(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.viewByTitle(java.lang.String)
	public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView viewByTitle(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "viewByTitle", param0);
		org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView w = new SWTBotView(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.viewByTitle(java.lang.String)
		public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView viewByPartName(java.lang.String param0) throws SWTBotBridgeException {
			Object o = SWTBotBridge.callMethod(distantObject, "viewByPartName", param0);
			org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView w = new SWTBotView(o);
			Context.setCurrentWidget(w);
			return w;
		}
	//public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.partById(java.lang.String)
	public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView partById(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "partById", param0);
		org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView w = new SWTBotView(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.partByTitle(java.lang.String)
	public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView partByTitle(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "partByTitle", param0);
		org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView w = new SWTBotView(o);
		Context.setCurrentWidget(w);
		return w;
	}

	//public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.view(org.hamcrest.Matcher)
	//public java.util.List org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.views()
	@SuppressWarnings("unchecked")
	public java.util.List<org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView> views() throws SWTBotBridgeException {
		return (List)SWTBotBridge.callMethodReturnSWTBotList(distantObject, "views", org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView.class);

	}

	//public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.part(org.hamcrest.Matcher)
	//public java.util.List org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.parts()
	@SuppressWarnings("unchecked")
	public java.util.List<org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView> parts() throws SWTBotBridgeException {
		return (List)SWTBotBridge.callMethodReturnSWTBotList(distantObject, "parts", org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView.class);

	}

}
