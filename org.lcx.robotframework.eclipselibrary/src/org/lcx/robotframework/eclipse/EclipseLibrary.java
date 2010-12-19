/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.apache.log4j.Logger;
import org.robotframework.javalib.library.AnnotationLibrary;

/**
 * Eclipse Library annotation class
 * @author laurent.carbonnaux
 */
public class EclipseLibrary extends AnnotationLibrary {

	private Logger log = LibraryLogger.getLogger();
	
    public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";
    public static final String ROBOT_LIBRARY_VERSION = Configuration.getString("version"); //$NON-NLS-1$

    private final AnnotationLibrary annotationLibrary = new AnnotationLibrary("org/lcx/robotframework/eclipse/keyword/**/*.class");
    public static EclipseLibrary instance;

    public EclipseLibrary() {
        this(Collections.<String>emptyList());
    }
    
    @SuppressWarnings("serial")
	protected EclipseLibrary(final String keywordPattern) {
        this(new ArrayList<String>() {{ add(keywordPattern); }});
    }

    protected EclipseLibrary(Collection<String>  keywordPatterns) {
        addKeywordPatterns(keywordPatterns);
//        disableOutput();
//        setDefaultTimeouts();
        instance = this;
    }

    private void addKeywordPatterns(Collection<String> keywordPatterns) {
        for (String pattern : keywordPatterns) {
            annotationLibrary.addKeywordPattern(pattern);
        }
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
        return annotationLibrary.runKeyword(keywordName, toStrings(args));
    }

    public String[] getKeywordArguments(String keywordName) {
        return annotationLibrary.getKeywordArguments(keywordName);
    }

    public String getKeywordDocumentation(String keywordName) {
        return annotationLibrary.getKeywordDocumentation(keywordName);
    }

    public String[] getKeywordNames() {
        return annotationLibrary.getKeywordNames();
    }

//    private void setDefaultTimeouts() {
//        new TimeoutKeywords().setJemmyTimeouts("10");
//    }

//    private void disableOutput() {
//        JemmyProperties.setCurrentOutput(TestOut.getNullOutput());
//    }

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
