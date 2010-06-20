package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;


public class SWTBotCCombo extends AbstractSWTBotControl {

	public SWTBotCCombo(Object o) {
		super(o);
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo.itemCount()
	public int itemCount() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "itemCount");
		return i.intValue();
	}

	//public java.lang.String[] org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo.items()
	public java.lang.String[] items() throws SWTBotBridgeException {
		String[] o = (String[])SWTBotBridge.callMethod(distantObject, "items");
		return o;
	}

	//public java.lang.String org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo.selection()
	public java.lang.String selection() throws SWTBotBridgeException {
		return (String)SWTBotBridge.callMethod(distantObject, "selection");
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo.selectionIndex()
	public int selectionIndex() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "selectionIndex");
		return i.intValue();
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo.setSelection(java.lang.String)
	public void setSelection(java.lang.String param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "setSelection", param0);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo.setSelection(int)
	public void setSelection(int param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "setSelection", param0);
	}

	//public void org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo.setText(java.lang.String)
	public void setText(java.lang.String param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "setText", param0);
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotCCombo.textLimit()
	public int textLimit() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "textLimit");
		return i.intValue();
	}


}
