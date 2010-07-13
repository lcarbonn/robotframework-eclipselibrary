package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.utils.Position;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;
import java.util.List;


public class SWTBotStyledText extends AbstractSWTBotControl {

	public SWTBotStyledText(Object o) {
		super(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.utils.Position org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText.cursorPosition()
	public org.lcx.robotframework.swtbot.swt.finder.utils.Position cursorPosition() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "cursorPosition");
		return new Position(o);
	}

	//public org.eclipse.swt.custom.Bullet org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText.getBulletOnCurrentLine()
	//public org.eclipse.swt.custom.Bullet org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText.getBulletOnLine(int)
	//public org.eclipse.swt.graphics.RGB org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText.getLineBackground(int)
	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText.getLineCount()
	public int getLineCount() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "getLineCount");
		return i.intValue();
	}

	//public java.util.List org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText.getLines()
	@SuppressWarnings("unchecked")
	public java.util.List<java.lang.String> getLines() throws SWTBotBridgeException {
		return (List)SWTBotBridge.callMethodReturnPrimitiveList(distantObject, "getLines");

	}

	//public java.lang.String org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText.getSelection()
	public java.lang.String getSelection() throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "getSelection");
	}

	//public org.eclipse.swt.custom.StyleRange org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText.getStyle(int,int)
	//public org.eclipse.swt.custom.StyleRange[] org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText.getStyles(int,int,int)
	//public java.lang.String org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText.getTextOnCurrentLine()
	public java.lang.String getTextOnCurrentLine() throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "getTextOnCurrentLine");
	}

	//public java.lang.String org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText.getTextOnLine(int)
	public java.lang.String getTextOnLine(int param0) throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "getTextOnLine", param0);
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText.hasBulletOnCurrentLine()
	public boolean hasBulletOnCurrentLine() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "hasBulletOnCurrentLine");
		return b.booleanValue();
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText.hasBulletOnLine(int)
	public boolean hasBulletOnLine(int param0) throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "hasBulletOnLine", param0);
		return b.booleanValue();
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText.insertText(java.lang.String)
	public void insertText(java.lang.String param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "insertText", param0);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText.insertText(int,int,java.lang.String)
	public void insertText(int param0, int param1, java.lang.String param2) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "insertText", param0, param1, param2);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText.navigateTo(org.lcx.robotframework.swtbot.swt.finder.utils.Position)
	public void navigateTo(org.lcx.robotframework.swtbot.swt.finder.utils.Position param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "navigateTo", param0);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText.navigateTo(int,int)
	public void navigateTo(int param0, int param1) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "navigateTo", param0, param1);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText.notifyKeyboardEvent(int,char)
	@Deprecated
	public void notifyKeyboardEvent(int param0, char param1) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "notifyKeyboardEvent", param0, param1);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText.notifyKeyboardEvent(int,char,int)
	@Deprecated
	public void notifyKeyboardEvent(int param0, char param1, int param2) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "notifyKeyboardEvent", param0, param1, param2);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText.selectCurrentLine()
	public void selectCurrentLine() throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "selectCurrentLine");
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText.selectLine(int)
	public void selectLine(int param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "selectLine", param0);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText.selectRange(int,int,int)
	public void selectRange(int param0, int param1, int param2) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "selectRange", param0, param1, param2);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText.setText(java.lang.String)
	public void setText(java.lang.String param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "setText", param0);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText.typeText(java.lang.String)
	public void typeText(java.lang.String param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "typeText", param0);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText.typeText(java.lang.String,int)
	public void typeText(java.lang.String param0, int param1) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "typeText", param0, param1);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText.typeText(int,int,java.lang.String)
	public void typeText(int param0, int param1, java.lang.String param2) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "typeText", param0, param1, param2);
	}


}
