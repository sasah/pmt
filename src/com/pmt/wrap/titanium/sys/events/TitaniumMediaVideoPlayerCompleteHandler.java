package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>complete</b>
 * <p>
 * fired when movie playback ends or a user exits playback
 */
public interface TitaniumMediaVideoPlayerCompleteHandler {
	/**
	 * <b>complete</b>
	 * <p>
	 * fired when movie playback ends or a user exits playback
	 * @param source the source object that fired the event
	 * @param reason the completion reason. One of Titanium.Media.VIDEO_FINISH_REASON_PLAYBACK_ENDED, Titanium.Media.VIDEO_FINISH_REASON_PLAYBACK_ERROR or Titanium.Media.VIDEO_FINISH_REASON_USER_EXITED.
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void complete(JavaScriptObject source, JavaScriptObject reason, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x);
}
