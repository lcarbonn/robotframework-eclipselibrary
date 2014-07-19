/*
 * Copyright 2014 L. Carbonnaux
 */

package org.lcx.robotframework.swtbotplugin;

import java.lang.reflect.Method;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.gef.finder.SWTGefBot;

public class SwtbotThread extends Thread {

	public SwtbotThread() {
		super();
	}
	
	@Override
	public void run() {
		super.run();
		SWTWorkbenchBot bot = null;
		try {
			// find the bot
			Exception exc = null;
			for (int i = 0; i < 10; i++) {
				exc=null;
				try {
					if(SwtbotPlugin.isDebug())System.out.println("SwtbotPlugin loop "+i);
					bot = new SWTWorkbenchBot();
					if(bot!=null) break;
				} catch (Exception e) {
					exc = e;
				}
				Thread.sleep(500);
			}
			
			if(exc!=null) throw exc;
			if(SwtbotPlugin.isDebug())System.out.println("SwtbotPlugin bot "+bot);
			
			ClassLoader syscl = ClassLoader.getSystemClassLoader();
			Class<?> bridge = syscl.loadClass("org.lcx.robotframework.eclipse.bridge.SWTBotBridge");
			Class<?> clclass = syscl.loadClass("java.lang.ClassLoader");
			Method m = bridge.getDeclaredMethod("setSWTBOTCLASSLOADER", clclass);
			m.invoke(null, this.getClass().getClassLoader());
			
			// set the SWTWorkbenchBot reference to the eclipse library bridge
			//SWTWorkbenchBot bot = new SWTWorkbenchBot();
			Class<?> oclass = syscl.loadClass("java.lang.Object");
			Method ms = bridge.getDeclaredMethod("setSWTWORKBENCHBOT", oclass);
			ms.invoke(null, bot);
			
			// set the SWTGefBot reference to the eclipse library bridge
			SWTGefBot gefbot = new SWTGefBot();
			Class<?> gclass = syscl.loadClass("java.lang.Object");
			Method gs = bridge.getDeclaredMethod("setSWTGEFBOT", gclass);
			gs.invoke(null, gefbot);

			if(SwtbotPlugin.isDebug())System.out.println("SwtbotPlugin for RF started");

		} catch (Exception e) {
			// plugin is not started under robotframework, so not a problem
			if(SwtbotPlugin.isDebug())System.out.println("SwtbotPlugin for RF on error (thread)");
			e.printStackTrace();
		}

	}

}
