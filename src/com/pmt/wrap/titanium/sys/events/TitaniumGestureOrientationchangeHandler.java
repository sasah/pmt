package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>orientationchange</b>
 * <p>
 * fired when the device orientation changes
 */
public interface TitaniumGestureOrientationchangeHandler {
	/**
	 * <b>orientationchange</b>
	 * <p>
	 * fired when the device orientation changes
	 * @param orientation the orientation constant
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 */
	void orientationchange(JavaScriptObject orientation, JavaScriptObject source, JavaScriptObject type);
}
