/*
 * Copyright 2011 L. Carbonnaux
 */
package org.lcx.robotframework.jybuiltin;

import org.apache.log4j.Logger;
import org.robotframework.javalib.library.AnnotationLibrary;

/**
 * JUnit Library annotation class
 * @author laurent.carbonnaux
 */
public class JyBuiltInLibrary extends AnnotationLibrary {

	private Logger log = LibraryLogger.getLogger();
	
    public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL"; //$NON-NLS-1$
    public static final String ROBOT_LIBRARY_VERSION = Configuration.getString("version"); //$NON-NLS-1$

    public JyBuiltInLibrary() {
        super("org/lcx/robotframework/jybuiltin/keyword/**/*.class");
    }
    
    public Object runKeyword(String keywordName, Object[] args) {
    	if(log.isDebugEnabled()) {
    		log.debug("runKeyword:"+keywordName); //$NON-NLS-1$
    		log.debug("\targs:"+args.length); //$NON-NLS-1$
    		int i=0;
    		for (Object object : args) {
    			log.debug("\t\targ["+i+"]:"+object+", of class="+object.getClass().getName()); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    			i++;
			}
    	}
        return super.runKeyword(keywordName, toStrings(args));
    }

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

}
