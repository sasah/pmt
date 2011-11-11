package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>sourceChange</b>
 * <p>
 * fired when the movieSourceType is Titanium.Media.VIDEO_SOURCE_TYPE_UNKNOWN when preparing for playback.
 */
public interface TitaniumMediaVideoPlayerSourceChangeHandler {
	/**
	 * <b>sourceChange</b>
	 * <p>
	 * fired when the movieSourceType is Titanium.Media.VIDEO_SOURCE_TYPE_UNKNOWN when preparing for playback.
	 * @param sourceChange the new sourceType
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void sourceChange(JavaScriptObject sourceChange, JavaScriptObject source, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x);
}
