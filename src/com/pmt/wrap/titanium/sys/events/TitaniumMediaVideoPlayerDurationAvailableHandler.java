package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>durationAvailable</b>
 * <p>
 * fired when the duration is available
 */
public interface TitaniumMediaVideoPlayerDurationAvailableHandler {
	/**
	 * <b>durationAvailable</b>
	 * <p>
	 * fired when the duration is available
	 * @param duration duration
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void durationAvailable(JavaScriptObject duration, JavaScriptObject source, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x);
}
