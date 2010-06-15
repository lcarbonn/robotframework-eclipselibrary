package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;


public class SWTBotLabel extends AbstractSWTBotControl {

	public SWTBotLabel(Object o) {
		super(o);
	}

	//public int org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel.alignment()
	public int alignment() throws SWTBotBridgeException {
		Integer i = (Integer)SWTBotBridge.callMethod(distantObject, "alignment");
		return i.intValue();
	}

	//public org.eclipse.swt.graphics.Image org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotLabel.image()

}
