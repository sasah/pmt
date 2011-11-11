package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>battery</b>
 * <p>
 * fired when the battery state changes.  the battery state changes are only tracked on iPhone/iPad at 5% increments.
 */
public interface TitaniumPlatformBatteryHandler {
	/**
	 * <b>battery</b>
	 * <p>
	 * fired when the battery state changes.  the battery state changes are only tracked on iPhone/iPad at 5% increments.
	 * @param level the new battery level
	 * @param source the source object that fired the event
	 * @param state the new battery state
	 * @param type the name of the event fired
	 */
	void battery(JavaScriptObject level, JavaScriptObject source, JavaScriptObject state, JavaScriptObject type);
}
