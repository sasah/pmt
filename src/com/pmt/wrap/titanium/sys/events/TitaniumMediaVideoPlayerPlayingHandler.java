package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>playing</b>
 * <p>
 * fired when the currently playing movie changes
 */
public interface TitaniumMediaVideoPlayerPlayingHandler {
	/**
	 * <b>playing</b>
	 * <p>
	 * fired when the currently playing movie changes
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param url url of the media
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void playing(JavaScriptObject source, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject url, JavaScriptObject x);
}
