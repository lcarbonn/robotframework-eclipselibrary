/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.robotframework.javalib.library.AnnotationLibrary;

public class EclipseLibrary extends AnnotationLibrary {

    public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";
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
