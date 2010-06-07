package org.lcx.robotframework.swtbotplugin;

import org.eclipse.ui.IStartup;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class SwtbotPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.lcx.robotframework.swtbotplugin";

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
