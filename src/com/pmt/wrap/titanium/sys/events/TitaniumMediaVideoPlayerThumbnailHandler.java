package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>thumbnail</b>
 * <p>
 * fired when a movie thumbnail is available from requestThumbnailImagesAtTimes
 */
public interface TitaniumMediaVideoPlayerThumbnailHandler {
	/**
	 * <b>thumbnail</b>
	 * <p>
	 * fired when a movie thumbnail is available from requestThumbnailImagesAtTimes
	 * @param time time
	 * @param source the source object that fired the event
	 * @param error if success is false, error message as string for reason
	 * @param image blob of the thumbnail image
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param success boolean to indicate success or failure
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void thumbnail(JavaScriptObject time, JavaScriptObject source, JavaScriptObject error, JavaScriptObject image, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject success, JavaScriptObject y, JavaScriptObject x);
}
