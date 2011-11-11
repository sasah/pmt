package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>resume</b>
 * <p>
 * For Javascript-based Services which you create, resume fires each time the Javascript code executes.  For example, if your Service runs on an interval of 10000 (10 seconds), you would expect to see resume fired every 10 seconds, just as the Javascript service code you wrote is about to execute.
 */
public interface TitaniumAndroidServiceResumeHandler {
	/**
	 * <b>resume</b>
	 * <p>
	 * For Javascript-based Services which you create, resume fires each time the Javascript code executes.  For example, if your Service runs on an interval of 10000 (10 seconds), you would expect to see resume fired every 10 seconds, just as the Javascript service code you wrote is about to execute.
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 * @param iteration incrementing integer indicating which iteration of an interval-based Service is resuming.  For example, if you have an interval-based Service running every 10 seconds, iteration 3 would occur at about 30 seconds after you start the instance (assuming your service code runs quickly.)
	 */
	void resume(JavaScriptObject source, JavaScriptObject type, JavaScriptObject iteration);
}
