package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>pause</b>
 * <p>
 * For Javascript-based Services which you create, pause fires after each time the Javascript code executes.  resume and pause happen in pairs, with resume firing just before your Javascript service code executes, and pause just after.
 */
public interface TitaniumAndroidServicePauseHandler {
	/**
	 * <b>pause</b>
	 * <p>
	 * For Javascript-based Services which you create, pause fires after each time the Javascript code executes.  resume and pause happen in pairs, with resume firing just before your Javascript service code executes, and pause just after.
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 * @param iteration incrementing integer indicating which iteration of an interval-based Service is pausing.  For example, if you have an interval-based Service running every 10 seconds, iteration 3 would occur at about 30 seconds after you start the instance (assuming your service code runs quickly.)
	 */
	void pause(JavaScriptObject source, JavaScriptObject type, JavaScriptObject iteration);
}
