package org.lcx.robotframework.swtbotplugin;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class SwtbotPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.lcx.robotframework.eclplugin"; //$NON-NLS-1$

	// The shared instance
	private static SwtbotPlugin plugin;
	
	private static final boolean debug = true;

	public static boolean isDebug() {
		return debug;
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

		if(debug) System.out.println("RfPlugin for RF starting");
		try {
			
			SwtbotThread thread = new SwtbotThread();
			thread.start();

		} catch (Exception e) {
			// plugin is not started under robotframework, so not a problem
			if(debug) System.out.println("RfPlugin for RF on error");
			if(debug) e.printStackTrace();
		}

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
