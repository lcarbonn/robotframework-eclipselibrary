/*
 * Copyright 2013 L. Carbonnaux
 */
package org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets;


import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView;
import org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefViewer;


public class SWTBotGefView extends SWTBotView {

	public SWTBotGefView(Object o) {
		super(o);
	}

	//public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefViewer org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefView.getSWTBotGefViewer()
	public org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefViewer getSWTBotGefViewer() throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "getSWTBotGefViewer");
		return new SWTBotGefViewer(o);
	}


}
