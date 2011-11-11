package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>android:back</b>
 * <p>
 * fired when the back button is released. Setting a listener is interpreted as the handler for that button. To restore default behavior, remove the listener. It is recommended that you only have one handler per heavyweight window (Android Only)
 */
public interface TitaniumUIWindowAndroidBackHandler {
	/**
	 * <b>android:back</b>
	 * <p>
	 * fired when the back button is released. Setting a listener is interpreted as the handler for that button. To restore default behavior, remove the listener. It is recommended that you only have one handler per heavyweight window (Android Only)
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void androidBack(JavaScriptObject source, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x);
}
