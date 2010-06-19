package org.lcx.robotframework.swtbot.eclipse.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;


public class SWTBotEclipseEditor extends SWTBotWorkbenchPart {

	public SWTBotEclipseEditor(Object o) {
		super(o);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.setFocus()
	public void setFocus() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "setFocus");
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.contextMenu(java.lang.String) throws org.lcx.robotframework.swtbot.swt.finder.exceptions.WidgetNotFoundException
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu contextMenu(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "contextMenu", param0);
		return new org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu(o);
	}

	//public transient void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.pressShortcut(org.eclipse.jface.bindings.keys.KeyStroke[])
	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.pressShortcut(int,int,char)
	public void pressShortcut(int param0, int param1, char param2) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "pressShortcut", param0, param1, param2);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.pressShortcut(int,char)
	public void pressShortcut(int param0, char param1) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "pressShortcut", param0, param1);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.typeText(java.lang.String)
	public void typeText(java.lang.String param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "typeText", param0);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.typeText(java.lang.String,int)
	public void typeText(java.lang.String param0, int param1) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "typeText", param0, param1);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.typeText(int,int,java.lang.String)
	public void typeText(int param0, int param1, java.lang.String param2) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "typeText", param0, param1, param2);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.utils.Position org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.cursorPosition()
	public org.lcx.robotframework.swtbot.swt.finder.utils.Position cursorPosition() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "cursorPosition");
		return new org.lcx.robotframework.swtbot.swt.finder.utils.Position(o);
	}

	//public org.eclipse.swt.custom.Bullet org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.getBulletOnCurrentLine()
	//public org.eclipse.swt.custom.Bullet org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.getBulletOnLine(int)
	//public org.eclipse.swt.graphics.RGB org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.getLineBackground(int)
	//public java.util.List org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.getLines()
	@SuppressWarnings("unchecked")
	public java.util.List<java.lang.String> getLines() throws SWTBotBridgeException {
		return (java.util.List)SWTBotBridge.callMethodReturnPrimitiveList(distantObject, "getLines");

	}

	//public org.eclipse.swt.custom.StyleRange[] org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.getStyles(int,int,int)
	//public java.lang.String org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.getTextOnCurrentLine()
	public java.lang.String getTextOnCurrentLine() throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "getTextOnCurrentLine");
	}

	//public java.lang.String org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.getTextOnLine(int)
	public java.lang.String getTextOnLine(int param0) throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "getTextOnLine", param0);
	}

	//public boolean org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.hasBulletOnCurrentLine()
	public boolean hasBulletOnCurrentLine() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "hasBulletOnCurrentLine");
		return b.booleanValue();
	}

	//public boolean org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.hasBulletOnLine(int)
	public boolean hasBulletOnLine(int param0) throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "hasBulletOnLine", param0);
		return b.booleanValue();
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.insertText(int,int,java.lang.String)
	public void insertText(int param0, int param1, java.lang.String param2) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "insertText", param0, param1, param2);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.insertText(java.lang.String)
	public void insertText(java.lang.String param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "insertText", param0);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.notifyKeyboardEvent(int,char)
	public void notifyKeyboardEvent(int param0, char param1) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "notifyKeyboardEvent", param0, param1);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.notifyKeyboardEvent(int,char,int)
	public void notifyKeyboardEvent(int param0, char param1, int param2) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "notifyKeyboardEvent", param0, param1, param2);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.selectCurrentLine()
	public void selectCurrentLine() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "selectCurrentLine");
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.selectRange(int,int,int)
	public void selectRange(int param0, int param1, int param2) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "selectRange", param0, param1, param2);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.autoCompleteProposal(java.lang.String,java.lang.String)
	public void autoCompleteProposal(java.lang.String param0, java.lang.String param1) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "autoCompleteProposal", param0, param1);
	}

	//public java.util.List org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.getAutoCompleteProposals(java.lang.String)
	@SuppressWarnings("unchecked")
	public java.util.List<java.lang.String> getAutoCompleteProposals(java.lang.String param0) throws SWTBotBridgeException {
		return (java.util.List)SWTBotBridge.callMethodReturnPrimitiveList(distantObject, "getAutoCompleteProposals", param0);

	}

	//public org.eclipse.ui.IEditorReference org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.getEditorReference()
	//public java.util.List org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.getQuickFixes()
	@SuppressWarnings("unchecked")
	public java.util.List<java.lang.String> getQuickFixes() throws SWTBotBridgeException {
		return (java.util.List)SWTBotBridge.callMethodReturnPrimitiveList(distantObject, "getQuickFixes");

	}

	//public int org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.getQuickfixListItemCount()
	public int getQuickfixListItemCount() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "getQuickfixListItemCount");
		return i.intValue();
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.getStyledText()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText getStyledText() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "getStyledText");
		return new org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText(o);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.quickfix(java.lang.String)
	public void quickfix(java.lang.String param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "quickfix", param0);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.quickfix(int)
	public void quickfix(int param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "quickfix", param0);
	}

	//public boolean org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.isEnabled()
	public boolean isEnabled() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "isEnabled");
		return b.booleanValue();
	}

	//public java.lang.String org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.getText()
	public java.lang.String getText() throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "getText");
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.setText(java.lang.String)
	public void setText(java.lang.String param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "setText", param0);
	}

	//public org.eclipse.swt.custom.StyleRange org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.getStyle(int,int)
	//public org.eclipse.swt.graphics.Color org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.backgroundColor()
	//public org.eclipse.swt.graphics.Color org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.foregroundColor()
	//public java.lang.String org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.getToolTipText()
	public java.lang.String getToolTipText() throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "getToolTipText");
	}

	//public java.lang.String org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.getSelection()
	public java.lang.String getSelection() throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "getSelection");
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.selectLine(int)
	public void selectLine(int param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "selectLine", param0);
	}

	//public int org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.getLineCount()
	public int getLineCount() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "getLineCount");
		return i.intValue();
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.navigateTo(int,int)
	public void navigateTo(int param0, int param1) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "navigateTo", param0, param1);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor.navigateTo(org.lcx.robotframework.swtbot.swt.finder.utils.Position)
	public void navigateTo(org.lcx.robotframework.swtbot.swt.finder.utils.Position param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "navigateTo", param0);
	}


}
