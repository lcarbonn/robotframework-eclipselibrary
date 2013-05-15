/*
 * Copyright 2013 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;
import org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart;


public class SWTBotGefConnectionEditPart extends AbstractSWTBotControl {

	public SWTBotGefConnectionEditPart(Object o) {
		super(o);
	}

	//public void org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefConnectionEditPart.createBenpoint(int,int)
	public void createBenpoint(int param0, int param1) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "createBenpoint", param0, param1);
	}

	//public volatile org.eclipse.gef.EditPart org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefConnectionEditPart.part()
	// TODO : To Complete
//	public org.eclipse.gef.EditPart part() throws SWTBotBridgeException {
//		//TODO: class=interface org.eclipse.gef.EditPart
//		 return null;
//	}

	//public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefConnectionEditPart.source()
	public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart source() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "source");
		return new SWTBotGefEditPart(o);
	}

	//public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefConnectionEditPart.target()
	public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart target() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "target");
		return new SWTBotGefEditPart(o);
	}


}
