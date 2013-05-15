package org.lcx.robotframework.eclipse;

import org.junit.Test;

public class DocuTest {

	@Test
	public void getDoc() {
	    EclipseLibrary lib = new EclipseLibrary ();
	    try {
	    	lib.getKeywordDocumentation("__intro__");
		    for (String keyword : lib.getKeywordNames()) {
		    	System.out.println("__________________");
		        System.out.println(keyword);
		        for (String arg : lib.getKeywordArguments(keyword)){
		        	System.out.println(arg);
		        }
		        System.out.println(lib.getKeywordDocumentation(keyword));
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
