/*
 * Copyright 2011 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.utils;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.lcx.robotframework.eclipse.LibraryLogger;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class LogKeywords {

	@RobotKeyword("Set the eclipse library log level\n"
    		+ "Use the log4j levels = OFF, FATAL, TRACE, ERROR, DEBUG, WARN, INFO, ALL.\n\n"
            + "Example:\n"
            + "| Set EclipseLibrary Log Level | DEBUG |\n")
    @ArgumentNames({"level"})
        public void setEclipseLibraryLogLevel(String level) throws Exception {
		Level l = Level.toLevel(level);
		if(l!=null) {
			LibraryLogger.getLogger().info("Set EclipseLibrary log level to "+level);
			Logger.getRootLogger().setLevel(Level.toLevel(level));
		}
    }
    
}
