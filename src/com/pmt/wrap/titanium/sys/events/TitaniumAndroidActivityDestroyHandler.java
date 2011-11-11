package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>destroy</b>
 * <p>
 * Fired from the Activity's onDestroy
 */
public interface TitaniumAndroidActivityDestroyHandler {
	/**
	 * <b>destroy</b>
	 * <p>
	 * Fired from the Activity's onDestroy
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 */
	void destroy(JavaScriptObject source, JavaScriptObject type);
}
