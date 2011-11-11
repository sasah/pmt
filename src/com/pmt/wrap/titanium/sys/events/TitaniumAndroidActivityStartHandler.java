package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>start</b>
 * <p>
 * Fired from the Activity's onStart
 */
public interface TitaniumAndroidActivityStartHandler {
	/**
	 * <b>start</b>
	 * <p>
	 * Fired from the Activity's onStart
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 */
	void start(JavaScriptObject source, JavaScriptObject type);
}
