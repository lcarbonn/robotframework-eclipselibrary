/*
 * Copyright 2011 L. Carbonnaux
 */
package org.lcx.robotframework.jybuiltin;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Logger used into the JUnitLibrary
 * Interact with log4j at the moment
 * @author laurent.carbonnaux
 *
 */
public abstract class LibraryLogger {
	
	private static Logger logger = Logger.getLogger(JyBuiltInLibrary.class);
    private static String log4jConfig = "log4j.properties";

    static {
    	String logfile = Configuration.getString("logfile");
    	Properties prop = null;
    	if(logfile!=null) {
        	prop = loadProperties( logfile );

    	} else {
    		prop = loadProperties( log4jConfig );
    	}
    	if(prop!=null) {
    		PropertyConfigurator.configure( prop );
    	}

    }
    
    
	public static Logger getLogger() {
		return logger;
	}
	
    private static Properties loadProperties(String name) {
        Properties properties = new Properties();
        InputStream resourceAsStream = LibraryLogger.class.getResourceAsStream(name);
        if (resourceAsStream != null)
            return loadProperties(properties, resourceAsStream);
        else
            return properties;
    }

    private static Properties loadProperties(Properties properties, InputStream resourceAsStream) {
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }
    
//	public void debug(Object message) {
//		logger.debug(message);
//	}
//
//	public void warn(Object message) {
//		logger.warn(message);
//	}
}
