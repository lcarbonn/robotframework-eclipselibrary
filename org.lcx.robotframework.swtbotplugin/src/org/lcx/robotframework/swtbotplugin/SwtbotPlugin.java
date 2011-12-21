package org.lcx.robotframework.swtbotplugin;

import java.lang.reflect.Method;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class SwtbotPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.lcx.robotframework.swtbotplugin";
	
	private static final boolean debug = false;

	// The shared instance
	private static SwtbotPlugin plugin;
	
	
	// XXX reconsider if this is necessary
	public static class SwtbotPluginStartup implements IStartup {

		public void earlyStartup() {
			// ignore
		}
	}
	
	/**
	 * The constructor
	 */
	public SwtbotPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
		if(debug) System.out.println("SwtbotPlugin for RF starting");
		// set the plugin class loader to the eclipse library bridge
		try {
			ClassLoader syscl = ClassLoader.getSystemClassLoader();
			Class<?> bridge = syscl.loadClass("org.lcx.robotframework.eclipse.bridge.SWTBotBridge");
			Class<?> clclass = syscl.loadClass("java.lang.ClassLoader");
			Method m = bridge.getDeclaredMethod("setSWTBOTCLASSLOADER", clclass);
			m.invoke(null, this.getClass().getClassLoader());
			
			// set the SWTWorkbenchBot reference to the eclipse library bridge
			SWTWorkbenchBot bot = new SWTWorkbenchBot();
			Class<?> oclass = syscl.loadClass("java.lang.Object");
			Method ms = bridge.getDeclaredMethod("setSWTWORKBENCHBOT", oclass);
			ms.invoke(null, bot);
			
		} catch (ClassNotFoundException e) {
			// plugin is not started under robotframework, so not a problem
			if(debug) System.out.println("SwtbotPlugin for RF on error");
			if(debug) e.printStackTrace();
		}
		if(debug) System.out.println("SwtbotPlugin for RF started");
		
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static SwtbotPlugin getDefault() {
		return plugin;
	}
}
