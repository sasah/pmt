package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>location</b>
 * <p>
 * fired when a location event is received
 */
public interface TitaniumGeolocationLocationHandler {
	/**
	 * <b>location</b>
	 * <p>
	 * fired when a location event is received
	 * @param coords location coordinates dictionary with the following sub-properties: latitude, longitude, altitude, accuracy, altitudeAccuracy, heading, speed, timestamp.
	 * @param source the source object that fired the event
	 * @param error if success is false, returns a string of the error description
	 * @param provider (Android only) location provider dictionary with the following sub-properties: name, accuracy, power, and provider.
	 * @param code if success is false, the error code if available (iOS only)
	 * @param type the name of the event fired
	 * @param success boolean to indicate if the location event was successfully received or an error occurred
	 */
	void location(JavaScriptObject coords, JavaScriptObject source, JavaScriptObject error, JavaScriptObject provider, JavaScriptObject code, JavaScriptObject type, JavaScriptObject success);
}
