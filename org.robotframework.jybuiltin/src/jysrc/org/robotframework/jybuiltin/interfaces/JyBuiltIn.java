package org.robotframework.jybuiltin.interfaces;

public interface JyBuiltIn extends JyMisc, JyVariables {

    /**
     * Executes the given keyword with the given arguments.
     * @param name
     * @param args
     * @return
     */
    public Object run_keyword(String name, String...args);

	
}
