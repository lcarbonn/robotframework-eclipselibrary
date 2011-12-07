/*
 * Copyright 2011 L. Carbonnaux
 */
package org.robotframework.jybuiltin.interfaces;

import java.util.Map;

public interface JyVariables {

	/**
	 * def get_variables(self):
	 * """Returns a dictionary containing all variables in the current scope."""
	 * Does not return java converted values, use get_variable(String name) instead
	 * @return
	 */
	public Map<String, Object> get_variables();

	/**
	 * Get the value of the variable with the given name
	 * @return
	 */
	public Object get_variable(String name);

	/**
	 * def log_variables(self, level='INFO'):
	 * """Logs all variables in the current scope with given log level."""
	 * @param level
	 */
	public void log_variables(String level);

	/**
	 * def log_variables(self, level='INFO'):
	 * """Logs all variables in the current scope with default INFO log level."""
	 */
	public void log_variables();
	
	/**
	 * def variable_should_exist(self, name, msg=None):
	 * """Fails unless the given variable exists within the current scope.
	 * @param name
	 * @param msg
	 */
	public void variable_should_exist(String name, String msg);
	/**
	 * def variable_should_exist(self, name, msg=None):
	 * """Fails unless the given variable exists within the current scope.
	 * @param name
	 */
	public void variable_should_exist(String name);

	/**
	 * def variable_should_not_exist(self, name, msg=None):
	 * """Fails if the given variable exists within the current scope.
	 * @param name
	 * @param msg
	 */
	public void variable_should_not_exist(String name, String msg);

	/**
	 * def variable_should_not_exist(self, name, msg=None):
	 * """Fails if the given variable exists within the current scope.
	 * @param name
	 */
	public void variable_should_not_exist(String name);

	/**
	 * def replace_variables(self, text):
	 * """Replaces variables in the given text with their current values.
	 * if text is a single variable, the value is converted as String
	 * use get_variable(String name) to retrieve the value
	 * @param test
	 * @return
	 */
	public String replace_variables(String test);
	
	/*
	 * def set_variable(self, *values):
	 * NOT IMPLEMETED, replace by simple set_variable
	 */

	/**
	 * def set_test_variable(self, name, *values):
	 * """Makes a variable available everywhere within the scope of the current test.
	 * @param name
	 * @param values
	 */
	public void set_test_variable(String name, Object... values);

	/**
	 * def set_suite_variable(self, name, *values):
	 * """Makes a variable available everywhere within the scope of the current suite.
	 * @param name
	 * @param values
	 */
	public void set_suite_variable(String name, Object... values);

	/**
	 * def set_global_variable(self, name, *values):
	 * """Makes a variable available globally in all tests and suites.
	 * @param name
	 * @param values
	 */
	public void set_global_variable(String name, Object... values);

}
