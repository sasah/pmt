package com.pmt.bean;

/**
 * A Gwittir ananlogue to java.lang.reflect.Method.
 */
public interface Method {

	/**
	 * Returns the name of the method
	 * 
	 * @return String value name of the method
	 */
	public String getName();

	/**
	 * Ivokes the method.
	 * 
	 * @param target
	 *            The target object on which to invoke the method
	 * @param args
	 *            Array of arguments to pass to the method, or null for no
	 *            arguments.
	 * @throws java.lang.Exception
	 *             Any exception thrown by the method.
	 * @return The return value for the method. This will always be null for
	 *         void methods.
	 */
	public abstract Object invoke(Object target, Object[] args) throws Exception;
}
