package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>calibration</b>
 * <p>
 * fired only on iPhone/iPad when the device detects interface and requires calibration. when this event is fired, the calibration UI is being displayed to the end user.
 */
public interface TitaniumGeolocationCalibrationHandler {
	/**
	 * <b>calibration</b>
	 * <p>
	 * fired only on iPhone/iPad when the device detects interface and requires calibration. when this event is fired, the calibration UI is being displayed to the end user.
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 */
	void calibration(JavaScriptObject source, JavaScriptObject type);
}
