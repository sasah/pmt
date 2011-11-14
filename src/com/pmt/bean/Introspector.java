package com.pmt.bean;

import com.google.gwt.core.client.GWT;

/**
 * The Introspector allows property inspection of Bean-Type classes marked with
 * the Introspectable interface.
 */
public interface Introspector {

	/**
	 * The Singleton instance of the Introspector you should use from your
	 * classes.
	 */
	public static final Introspector INSTANCE = (Introspector) GWT.create(Introspector.class);

	/**
	 * Gets the BeanDescriptor for an object.
	 * 
	 * @param object
	 *            Object to introspect.
	 * @return BeanDescriptor for the object.
	 */
	public BeanDescriptor getDescriptor(Object object);

	/**
	 * Resolves an object to its most specific Introspectable type.
	 * 
	 * @param instance
	 *            Instance of an object
	 * @return Class literal for the most specific Introspectable type.
	 */
	@SuppressWarnings("rawtypes")
	public Class resolveClass(Object instance);
}
