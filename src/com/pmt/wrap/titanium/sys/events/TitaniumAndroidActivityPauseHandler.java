package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>pause</b>
 * <p>
 * Fired from the Activity's onPause
 */
public interface TitaniumAndroidActivityPauseHandler {
	/**
	 * <b>pause</b>
	 * <p>
	 * Fired from the Activity's onPause
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 */
	void pause(JavaScriptObject source, JavaScriptObject type);
}
