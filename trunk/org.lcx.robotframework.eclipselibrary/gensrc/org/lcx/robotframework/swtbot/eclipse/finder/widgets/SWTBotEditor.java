package org.lcx.robotframework.swtbot.eclipse.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor;
import org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart;


public class SWTBotEditor extends SWTBotWorkbenchPart {

	public SWTBotEditor(Object o) {
		super(o);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEditor.close()
	public void close() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "close");
	}

	//public boolean org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEditor.isActive()
	public boolean isActive() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isActive");
		return b.booleanValue();
	}

	//public boolean org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEditor.isDirty()
	public boolean isDirty() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isDirty");
		return b.booleanValue();
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEditor.save()
	public void save() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "save");
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEditor.saveAndClose()
	public void saveAndClose() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "saveAndClose");
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEditor.setFocus()
	public void setFocus() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "setFocus");
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEditor.show()
	public void show() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "show");
	}

	//public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEditor.toTextEditor()
	public org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor toTextEditor() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "toTextEditor");
		return new SWTBotEclipseEditor(o);
	}


}
