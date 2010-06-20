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
		distantObject = SWTBotBridge.getSWTWorkbenchBot();
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
		return (List)SWTBotBridge.callMethodReturnPrimitiveList(distantObject, "editors");

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
		return (List)SWTBotBridge.callMethodReturnPrimitiveList(distantObject, "perspectives");

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

	//public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.view(org.hamcrest.Matcher)
	//public java.util.List org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.views()
	@SuppressWarnings("unchecked")
	public java.util.List<org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView> views() throws SWTBotBridgeException {
		return (List)SWTBotBridge.callMethodReturnPrimitiveList(distantObject, "views");

	}

	//public java.util.List org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot.views(org.hamcrest.Matcher)

}
