package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>heading</b>
 * <p>
 * fired when a heading event is received
 */
public interface TitaniumGeolocationHeadingHandler {
	/**
	 * <b>heading</b>
	 * <p>
	 * fired when a heading event is received
	 * @param source the source object that fired the event
	 * @param error if success is false, returns a string of the error description
	 * @param code if success is false, the error code if available (iOS only)
	 * @param type the name of the event fired
	 * @param success boolean to indicate if the heading event was successfully received or an error occurred
	 * @param heading heading results dictionary with the following sub-properties: magneticHeading, trueHeading, accuracy, x, y, z, timestamp.
	 */
	void heading(JavaScriptObject source, JavaScriptObject error, JavaScriptObject code, JavaScriptObject type, JavaScriptObject success, JavaScriptObject heading);
}
