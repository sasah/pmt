package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>stop</b>
 * <p>
 * Fired from the Activity's onStop
 */
public interface TitaniumAndroidActivityStopHandler {
	/**
	 * <b>stop</b>
	 * <p>
	 * Fired from the Activity's onStop
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 */
	void stop(JavaScriptObject source, JavaScriptObject type);
}
