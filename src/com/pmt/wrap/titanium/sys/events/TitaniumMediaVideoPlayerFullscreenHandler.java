package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>fullscreen</b>
 * <p>
 * fired when a movie changes from fullscreen view
 */
public interface TitaniumMediaVideoPlayerFullscreenHandler {
	/**
	 * <b>fullscreen</b>
	 * <p>
	 * fired when a movie changes from fullscreen view
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 * @param entering true to indicate entering fullscreen, false to indicate leaving fullscreen
	 */
	void fullscreen(JavaScriptObject source, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x, JavaScriptObject entering);
}
