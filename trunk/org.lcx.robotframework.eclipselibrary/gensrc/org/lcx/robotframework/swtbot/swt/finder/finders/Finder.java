package org.lcx.robotframework.swtbot.swt.finder.finders;


import org.lcx.robotframework.swtbot.commons.AbstractSWTBotObject;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;


public class Finder extends AbstractSWTBotObject {

	public Finder(Object o) {
		super(o);
	}

	//public org.eclipse.swt.widgets.Shell org.lcx.robotframework.swtbot.swt.finder.finders.Finder.activeShell()
	//public java.util.List org.lcx.robotframework.swtbot.swt.finder.finders.Finder.findControls(java.util.List,org.hamcrest.Matcher,boolean)
//	public java.util.List<T> findControls(java.util.List<org.eclipse.swt.widgets.Widget> param0, org.hamcrest.Matcher<T> param1, boolean param2) throws SWTBotBridgeException {
//		//TODO: type=java.util.List<T>
//		 return null;
//	}

	//public java.util.List org.lcx.robotframework.swtbot.swt.finder.finders.Finder.findControls(org.hamcrest.Matcher)
//	public java.util.List<T> findControls(org.hamcrest.Matcher<T> param0) throws SWTBotBridgeException {
//		//TODO: type=java.util.List<T>
//		 return null;
//	}

	//public java.util.List org.lcx.robotframework.swtbot.swt.finder.finders.Finder.findControls(org.eclipse.swt.widgets.Widget,org.hamcrest.Matcher,boolean)
	//public java.util.List org.lcx.robotframework.swtbot.swt.finder.finders.Finder.findMenus(org.eclipse.swt.widgets.Shell[],org.hamcrest.Matcher,boolean)
	//public java.util.List org.lcx.robotframework.swtbot.swt.finder.finders.Finder.findMenus(org.eclipse.swt.widgets.Shell,org.hamcrest.Matcher,boolean)
	//public java.util.List org.lcx.robotframework.swtbot.swt.finder.finders.Finder.findMenus(org.eclipse.swt.widgets.Menu,org.hamcrest.Matcher,boolean)
	//public java.util.List org.lcx.robotframework.swtbot.swt.finder.finders.Finder.findMenus(org.hamcrest.Matcher)
//	public java.util.List<org.eclipse.swt.widgets.MenuItem> findMenus(org.hamcrest.Matcher<org.eclipse.swt.widgets.MenuItem> param0) throws SWTBotBridgeException {
//		//TODO: type=java.util.List<org.eclipse.swt.widgets.MenuItem>
//		 return null;
//	}

	//public java.util.List org.lcx.robotframework.swtbot.swt.finder.finders.Finder.findShells(java.lang.String)
//	public java.util.List<org.eclipse.swt.widgets.Shell> findShells(java.lang.String param0) throws SWTBotBridgeException {
//		//TODO: type=java.util.List<org.eclipse.swt.widgets.Shell>
//		 return null;
//	}

	//public org.eclipse.swt.widgets.Display org.lcx.robotframework.swtbot.swt.finder.finders.Finder.getDisplay()
	//public org.eclipse.swt.widgets.Shell[] org.lcx.robotframework.swtbot.swt.finder.finders.Finder.getShells()
	//public void org.lcx.robotframework.swtbot.swt.finder.finders.Finder.setShouldFindInvisibleControls(boolean)
	public void setShouldFindInvisibleControls(boolean param0) throws SWTBotBridgeException {
		SWTBotBridge.callMethod(distantObject, "setShouldFindInvisibleControls", param0);
	}

	//public boolean org.lcx.robotframework.swtbot.swt.finder.finders.Finder.shouldFindInvisibleControls()
	public boolean shouldFindInvisibleControls() throws SWTBotBridgeException {
		Boolean b = (Boolean)SWTBotBridge.callMethod(distantObject, "shouldFindInvisibleControls");
		return b.booleanValue();
	}


}
