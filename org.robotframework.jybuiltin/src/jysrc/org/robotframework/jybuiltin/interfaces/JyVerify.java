/*
 * Copyright 2011 L. Carbonnaux
 */
package org.robotframework.jybuiltin.interfaces;

import org.python.core.PyObject;

public interface JyVerify {

	
    /**
     * def fail(self, msg=None):
     * """Fails the test immediately with the given (optional) message.
	 * @param msg
     */
	public boolean fail(String msg);
    
	/**
	 * def fatal_error(self, msg=None):
     * """Stops the whole test execution.
	 * @param msg
	 */
	public void fatal_error(String msg);

	/**
     * def exit_for_loop(self):
     *  """Immediately stops executing the enclosing for loop.
     */
   	public void exit_for_loop();

    /**
     * def should_not_be_true(self, condition, msg=None):
     * """Fails if the given condition is true.
     * @param condition
     * @param msg
     */
    public void should_not_be_true(String condition, String msg);

    /**
     * def should_not_be_true(self, condition, msg=None):
     * """Fails if the given condition is true.
     * @param condition
     */
    public void should_not_be_true(String condition);

    /**
	 * def should_be_true(self, condition, msg=None):
	 * """Fails if the given condition is not true.
	 * @param condition
	 * @param msg
	 */
    public void should_be_true(String condition, String msg);

    /**
	 * def should_be_true(self, condition, msg=None):
	 * """Fails if the given condition is not true.
	 * @param condition
	 */
    public void should_be_true(String condition);

    /**
     * def should_be_equal(self, first, second, msg=None, values=True):
     * """Fails if the given objects are unequal.
     * @param first
     * @param second
     * @param msg
     * @param values
     */
    public void should_be_equal(PyObject first, PyObject second, String msg, boolean values);
    
    /**
     * def should_be_equal(self, first, second, msg=None, values=True):
     * """Fails if the given objects are unequal.
     * @param first
     * @param second
     * @param msg
     */
    public void should_be_equal(PyObject first, PyObject second, String msg);

    /**
     * def should_not_be_equal(self, first, second, msg=None, values=True):
     * """Fails if the given objects are equal.
     * @param first
     * @param second
     * @param msg
     * @param values
     */
    public void should_not_be_equal(PyObject first, PyObject second, String msg, boolean values);
    
    /**
     * def should_not_be_equal(self, first, second, msg=None, values=True):
     * """Fails if the given objects are equal.
     * @param first
     * @param second
     * @param msg
     */
    public void should_not_be_equal(PyObject first, PyObject second, String msg);
}
