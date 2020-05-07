/*
 * Copyright 2014 L. Carbonnaux
 * 2020 Nebula Nattable extension by J. Beaumont
 */

package org.lcx.robotframework.swtbotplugin;

import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.swtbot.eclipse.gef.finder.SWTGefBot;
import org.eclipse.swtbot.nebula.nattable.finder.SWTNatTableBot;
import org.osgi.framework.FrameworkUtil;

public class SwtbotThread extends Thread {

	public SwtbotThread() {
		super();
	}
	
	@Override
	public void run() {
		super.run();
		Object bot = null;
		try {
			// find the bot
			Exception exc = null;
			for (int i = 0; i < 10; i++) {
				exc=null;
				try {
					if(SwtbotPlugin.isDebug())System.out.println("SwtbotPlugin loop "+i);
					bot = instantiateBot();
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
			Class<?> oclass = syscl.loadClass("java.lang.Object");
			Method ms = bridge.getDeclaredMethod("setSWTWORKBENCHBOT", oclass);
			ms.invoke(null, bot);
			
			// set the SWTGefBot reference to the eclipse library bridge
			SWTGefBot gefbot = new SWTGefBot();
			Class<?> gclass = syscl.loadClass("java.lang.Object");
			Method gs = bridge.getDeclaredMethod("setSWTGEFBOT", gclass);
			gs.invoke(null, gefbot);

			// set the SWTNattableBot reference to the eclipse library bridge
			SWTNatTableBot nattablebot = new SWTNatTableBot();
			Class<?> nclass = syscl.loadClass("java.lang.Object");
			Method ns = bridge.getDeclaredMethod("setSWTNATTABLEBOT", nclass);
			ns.invoke(null, nattablebot);
						
			if(SwtbotPlugin.isDebug())System.out.println("SwtbotPlugin for RF started");

		} catch (Exception e) {
			// plugin is not started under robotframework, so not a problem
			if(SwtbotPlugin.isDebug())System.out.println("SwtbotPlugin for RF on error (thread)");
			e.printStackTrace();
		}

	}
	
	// get E4 Context
	protected static IEclipseContext getEclipseContext() {
        final IEclipseContext serviceContext = EclipseContextFactory.getServiceContext(FrameworkUtil.getBundle(SwtbotThread.class).getBundleContext());
        return serviceContext.get(IWorkbench.class).getApplication().getContext();
    }
	
	// instantiate SWTWorkbenchBot
	protected static Object instantiateBot() {
		
		try {
			if(SwtbotPlugin.isDebug())System.out.println("SwtbotPlugin trying E4...");
			final IEclipseContext serviceContext = EclipseContextFactory.getServiceContext(FrameworkUtil.getBundle(SwtbotThread.class).getBundleContext());
			if(SwtbotPlugin.isDebug())System.out.println("serviceContext="+serviceContext);
			IWorkbench workbench = null;
			for (int i = 0; i < 10; i++) {
				try {
					if(SwtbotPlugin.isDebug())System.out.println("SwtbotPlugin workbench loop "+i);
					workbench =  serviceContext.get(IWorkbench.class);
					if(workbench!=null) break;
				} catch (Exception e) {
					if(SwtbotPlugin.isDebug())System.out.println("e="+e);
				}
				Thread.sleep(500);
			}
			if(SwtbotPlugin.isDebug())System.out.println("workbench="+workbench);
			MApplication application = 	workbench.getApplication();
			if(SwtbotPlugin.isDebug())System.out.println("application="+application);
			IEclipseContext E4context = application.getContext();
			if(SwtbotPlugin.isDebug())System.out.println("E4context="+E4context);
			Class<?> E4BotClass = Class.forName("org.eclipse.swtbot.e4.finder.widgets.SWTWorkbenchBot");
			if(SwtbotPlugin.isDebug())System.out.println("E4BotClass="+E4BotClass);
			Constructor<?> constructor = E4BotClass.getConstructor(IEclipseContext.class);
			if(SwtbotPlugin.isDebug())System.out.println("constructor="+constructor);
			return (constructor.newInstance(E4context));
		}
		catch (Exception e) {
			// Unable to instantiate E4Context so switch to E3
			if(SwtbotPlugin.isDebug())System.out.println(e);
			if(SwtbotPlugin.isDebug())System.out.println("SwtbotPlugin switching to E3");
			try {
				Class<?> E3BotClass = Class.forName("org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot");
				Constructor<?> constructor = E3BotClass.getConstructor();
				return (constructor.newInstance());
			}
			catch (Exception e2) {
				if(SwtbotPlugin.isDebug())System.out.println("SwtbotPlugin fail to instantiate SWTWorkbenchBot");
				if(SwtbotPlugin.isDebug())System.out.println(e);
				return null;
			}
		}

	}

}
