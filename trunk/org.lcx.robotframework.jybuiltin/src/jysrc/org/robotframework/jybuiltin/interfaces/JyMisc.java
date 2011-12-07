/*
 * Copyright 2011 L. Carbonnaux
 */
package org.robotframework.jybuiltin.interfaces;

import org.python.core.PyObject;

public interface JyMisc {

	
    /**
     * def no_operation(self):
     *  """Does absolutely nothing."""
     */
	public void no_operation();
    
	/**
	 * 	def sleep(self, time_, reason=None):
	 * """Pauses the test executed for the given time.
	 * @param time
	 * @param reason
	 */
	public void sleep(String time, String reason);

	/**
	 * 	def sleep(self, time_, reason=None):
	 * """Pauses the test executed for the given time.
	 * @param time
	 */
	public void sleep(String time);

	/**
	 * def catenate(self, *items):
	 * """Catenates the given items together and returns the resulted string."""
	 * @param items
	 * @return
	 */
	public String catenate(String...items);

	/**
	 * def log(self, message, level="INFO"):
	 * """Logs the given message with the given level."""
	 * @param message
	 * @param Level
	 */
	public void log(String message, String Level);
    
	/**
	 * def log(self, message, level="INFO"):
	 * """Logs the given message with the given level."""
	 * @param message
	 * @param Level
	 */
	public void log(String message);
    
	/**
	 * def log_many(self, *messages):
	 * """Logs the given messages as separate entries with the INFO level."""
	 * @param messages
	 */
	public void log_many(String... messages);

	/**
	 * def comment(self, *messages):
	 * """Displays the given messages in the log file as keyword arguments.
	 * @param messages
	 */
	public void comment(String... messages);

	/**
	 * def set_log_level(self, level):
	 * """Sets the log threshold to the specified level and returns the old level.
	 * @param level
	 * @return
	 */
	public String set_log_level(String level);

	/**
	 * def import_library(self, name, *args):
	 * """Imports a library with the given name and optional arguments.
	 * @param name
	 * @param args
	 */
	public void import_library(String name, String... args);
    
        
	/**
	 * def import_variables(self, path, *args):
	 * """Imports a variable file with the given path and optional arguments.
	 * @param path
	 * @param args
	 */
	public void import_variables(String path, String... args);
	
	/**
	 * def import_resource(self, path):
	 * """Imports a resource file with the given path.
	 * @param path
	 */
	public void import_resource(String path);
    
	/**
	 * def set_library_search_order(self, *libraries):
	 * """Sets the resolution order to use when a name matches multiple keywords.
	 * @param libraries
	 * @return
	 */
	public String[] set_library_search_order(String... libraries);

	/**
	 * def get_time(self, format='timestamp', time_='NOW'):
	 * """Returns the given time in the requested format.
	 * @param format
	 * @param time
	 * @return
	 */
//	public String get_time(String format, String time);
    
	/**
	 * def evaluate(self, expression, modules=None):
	 * """Evaluates the given expression in Python and returns the results.
	 * @param expression
	 * @param modules
	 * @return
	 */
	public PyObject evaluate(String expression, String modules);

	/**
	 * def evaluate(self, expression, modules=None):
	 * """Evaluates the given expression in Python and returns the results.
	 * @param expression
	 * @return
	 */
	public PyObject evaluate(String expression);

	/**
	 * def call_method(self, object, method_name, *args):
	 * """Calls the named method of the given object with the provided arguments.
	 * @param object
	 * @param method_name
	 * @param args
	 * @return
	 */
	public PyObject call_method(PyObject object, String method_name, String... args);
    
	/*
	 * def regexp_escape(self, *patterns):
	 * """Returns each argument string escaped for use as a regular expression.
	 * Not implemented
     */
    
	/**
	 * def set_test_message(self, message):
	 *  """Sets message for for the current test.
	 * @param message
	 */
	public void set_test_message(String message);
	
	/**
	 * def set_tags(self, *tags):
	 * """Adds given `tags` for the current test or all tests in a suite. 
	 * @param tags
	 */
	public void set_tags(String... tags);
	
	/**
	 * def remove_tags(self, *tags):
	 * """Removes given `tags` from the current test or all tests in a suite.
	 * @param tags
	 */
	public void remove_tags(String... tags);
    
	/**
	 * def get_library_instance(self, name):
	 * """Returns the currently active instance of the specified test library.
	 * @param name
	 * @return
	 */
	public PyObject get_library_instance(String name);

}
