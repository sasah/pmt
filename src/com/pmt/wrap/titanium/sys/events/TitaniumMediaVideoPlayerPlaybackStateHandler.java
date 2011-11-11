package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>playbackState</b>
 * <p>
 * fired when the playbackState changes
 */
public interface TitaniumMediaVideoPlayerPlaybackStateHandler {
	/**
	 * <b>playbackState</b>
	 * <p>
	 * fired when the playbackState changes
	 * @param source the source object that fired the event
	 * @param playbackState playbackState
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void playbackState(JavaScriptObject source, JavaScriptObject playbackState, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x);
}
