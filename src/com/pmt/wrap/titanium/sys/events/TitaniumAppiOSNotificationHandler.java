package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>notification</b>
 * <p>
 * fired when a local notification is received by the app.  the following event properties are available: date, timezone, alertBody, alertAction, alertLaunchImage, sound, bound, userInfo.
 */
public interface TitaniumAppiOSNotificationHandler {
	/**
	 * <b>notification</b>
	 * <p>
	 * fired when a local notification is received by the app.  the following event properties are available: date, timezone, alertBody, alertAction, alertLaunchImage, sound, bound, userInfo.
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 */
	void notification(JavaScriptObject source, JavaScriptObject type);
}
