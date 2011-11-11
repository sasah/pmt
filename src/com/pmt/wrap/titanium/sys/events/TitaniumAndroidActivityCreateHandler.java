package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>create</b>
 * <p>
 * Fired from the Activity's onCreate
 */
public interface TitaniumAndroidActivityCreateHandler {
	/**
	 * <b>create</b>
	 * <p>
	 * Fired from the Activity's onCreate
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 */
	void create(JavaScriptObject source, JavaScriptObject type);
}
