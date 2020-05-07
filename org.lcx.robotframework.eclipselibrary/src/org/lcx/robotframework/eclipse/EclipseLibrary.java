/*
 * Copyright 2010 L. Carbonnaux
 * 2020 - AnnotationLibrary upgrade and remote library extension - J. Beaumont
 */
package org.lcx.robotframework.eclipse;

import org.robotframework.javalib.library.AnnotationLibrary;
import org.robotframework.remoteserver.RemoteServer;

/**
 * Eclipse Library annotation class
 * @author laurent.carbonnaux
 */
public class EclipseLibrary extends AnnotationLibrary {

	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";
    public static final String ROBOT_LIBRARY_VERSION = Configuration.getString("version"); //$NON-NLS-1$
    public static final String KEYWORD_PATTERN = "org/lcx/robotframework/eclipse/keyword/**/*.class";
    public static EclipseLibrary instance;

    public EclipseLibrary() {
        super();
        addKeywordPattern(KEYWORD_PATTERN);
        // init annotations
        createKeywordFactory();
        instance = this;
    }
    
    // ******************************
    // AnnotationLibrary overrides
    // ******************************

    @Override
    public Object runKeyword(String keywordName, Object[] args) {
        return super.runKeyword(keywordName, toStrings(args));
    }
    
    // ******************************
    // Internal Methods
    // ******************************

    /**
     * Convert all arguments in the object array to string
     *
     * @param args The arguments
     * @return The arguments converted in String
     */
     private Object[] toStrings(Object[] args) {
        Object[] newArgs = new Object[args.length];
        for (int i = 0; i < newArgs.length; i++) {
            if (args[i].getClass().isArray()) {
                newArgs[i] = args[i];
            } else {
                newArgs[i] = args[i].toString();
            }
        }
        return newArgs;
    }
    
    /**
     * Starts a server in port 8270 with the library to allow remote library in Robot Framework using jrobotremoteserver
     * this repository can be found at https://github.com/robotframework/jrobotremoteserver
     *
     * @param args
     * @throws Exception
     */
	public static void main(String[] args) throws Exception {
		// use jrobotremoteserver to start library as a server in port 8270
		RemoteServer.configureLogging();
        RemoteServer server = new RemoteServer(8270);
        server.putLibrary("/", new EclipseLibrary());
        server.start();
    }
	
}
