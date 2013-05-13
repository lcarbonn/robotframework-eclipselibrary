package org.lcx.robotframework.eclipse.utils;

import java.io.File;
import java.io.FilenameFilter;

public class EclipseFileNameFilter implements FilenameFilter {

	protected String reference = null;
	
	public boolean accept(File dir, String name) {
		// get file name
		return name.startsWith(reference);
	}
	
	public void setReference(String reference){
		this.reference = reference;
	}

}
