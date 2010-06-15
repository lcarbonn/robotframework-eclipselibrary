package org.lcx.robotframework.swtbot.swt.finder.widgets;


import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;


public class SWTBotToolbarDropDownButton extends AbstractSWTBotControl {

	public SWTBotToolbarDropDownButton(Object o) {
		super(o);
	}

	//public java.util.List org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton.menuItems(org.hamcrest.Matcher)
//	public java.util.List<? extends org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu> menuItems(org.hamcrest.Matcher<org.eclipse.swt.widgets.MenuItem> param0) throws SWTBotBridgeException {
//		//TODO: type=java.util.List<? extends org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu>
//		 return null;
//	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton.menuItem(org.hamcrest.Matcher)
//	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu menuItem(org.hamcrest.Matcher<org.eclipse.swt.widgets.MenuItem> param0) throws SWTBotBridgeException {
//		Object o = SWTBotBridge.callMethod(distantObject, "menuItem", param0);
//		return new SWTBotMenu(o);
//	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton.menuItem(java.lang.String)
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotMenu menuItem(java.lang.String param0) throws SWTBotBridgeException {
		Object o = SWTBotBridge.callMethod(distantObject, "menuItem", param0);
		return new SWTBotMenu(o);
	}

	//public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton.click()
	public org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton click() throws SWTBotBridgeException {
		distantObject = SWTBotBridge.callMethod(distantObject, "click");
		return this;
	}


}
