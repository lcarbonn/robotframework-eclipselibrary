package org.robotframework.jybuiltin;

import org.python.core.Py;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;
import org.robotframework.jybuiltin.interfaces.JyBuiltIn;

public class JyBuiltInFactory {

	
    private PyObject builtinClass = null;
    private static JyBuiltIn JYBUILTIN = null;

    public JyBuiltInFactory() {
        builtinClass = importBuiltInClass();
    }

    /**
     * Get the path of the jar from which the factory is loaded
     * @param cls
     * @return
     */
    private String getPath(Class<?> cls) {
    	String cn = cls.getName();
    	String rn = cn.replace('.', '/') + ".class";
    	String path = getClass().getClassLoader().getResource(rn).getPath();
    	if(path.startsWith("file:/")) {
    		path = path.substring("file:/".length());
    	}
    	int ix = path.indexOf("!");
    	if(ix >= 0) {
    		return path.substring(0, ix);
    	} else {
    		return path;
    	}
    }
    
    private PyObject importBuiltInClass() {
        PythonInterpreter interpreter = new PythonInterpreter();
        // add the jar to the jython path
        String libfolder = getPath(this.getClass())+"/Lib";
    	Py.getSystemState().path.insert(0, Py.newString(libfolder));
        
        interpreter.exec("from jyrobot.JyBuiltIn import JyBuiltIn");
        return interpreter.get("JyBuiltIn");
    }

    /**
     * Creates and returns an instance of the robot.librairies.BuiltIn (implemented in
     * Python), which can be used to execute tests.
     */
    public JyBuiltIn createBuiltIn() {
        PyObject builtinObject = builtinClass.__call__();
        return (JyBuiltIn) builtinObject.__tojava__(JyBuiltIn.class);
    }

    public static JyBuiltIn getJyBuiltIn() {
    	if(JYBUILTIN == null) {
    		JYBUILTIN = new JyBuiltInFactory().createBuiltIn();
    	}
    	return JYBUILTIN; 
    }
}
