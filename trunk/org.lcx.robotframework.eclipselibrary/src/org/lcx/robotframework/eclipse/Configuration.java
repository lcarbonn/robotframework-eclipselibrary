/*
 * Copyright 2011 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Configuration {
	private static final String BUNDLE_NAME = "conf"; //$NON-NLS-1$

	private static ResourceBundle RESOURCE_BUNDLE = null;

	private Configuration() {
	}

	public static String getString(String key) {
		try {
			if(getResource_Bundle()!=null){
				return getResource_Bundle().getString(key);
			}
			return '!' + key + '!';
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}

	private static ResourceBundle getResource_Bundle() {
		if(RESOURCE_BUNDLE==null) {
			RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);
		}
		return RESOURCE_BUNDLE;
	}
}
