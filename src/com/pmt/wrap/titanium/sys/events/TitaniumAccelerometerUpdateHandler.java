package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>update</b>
 * <p>
 * fired when the accelerometer changes
 */
public interface TitaniumAccelerometerUpdateHandler {
	/**
	 * <b>update</b>
	 * <p>
	 * fired when the accelerometer changes
	 * @param timestamp reference timestamp since the previous change. this is not a valid timestamp and should simply be used to determine the time between events and not an exact timestamp.
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 * @param z the z axis of the device
	 * @param y the y axis of the device
	 * @param x the x axis of the device
	 */
	void update(JavaScriptObject timestamp, JavaScriptObject source, JavaScriptObject type, JavaScriptObject z, JavaScriptObject y, JavaScriptObject x);
}
