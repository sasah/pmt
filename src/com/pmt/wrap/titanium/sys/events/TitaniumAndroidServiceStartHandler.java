package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>start</b>
 * <p>
 * Fired when the bound Service instance starts.  Bound service instances are created via Titanium.Android.createService.
 */
public interface TitaniumAndroidServiceStartHandler {
	/**
	 * <b>start</b>
	 * <p>
	 * Fired when the bound Service instance starts.  Bound service instances are created via Titanium.Android.createService.
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 */
	void start(JavaScriptObject source, JavaScriptObject type);
}
