package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>error</b>
 * <p>
 * fired when movie playback encounters an error
 */
public interface TitaniumMediaVideoPlayerErrorHandler {
	/**
	 * <b>error</b>
	 * <p>
	 * fired when movie playback encounters an error
	 * @param message reason for error as string
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void error(JavaScriptObject message, JavaScriptObject source, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x);
}
