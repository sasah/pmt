package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>shake</b>
 * <p>
 * fired when the device is shaken
 */
public interface TitaniumGestureShakeHandler {
	/**
	 * <b>shake</b>
	 * <p>
	 * fired when the device is shaken
	 * @param timestamp timestamp reference since previous shake
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 */
	void shake(JavaScriptObject timestamp, JavaScriptObject source, JavaScriptObject type);
}
