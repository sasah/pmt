package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>change</b>
 * <p>
 * fired for each frame changed during an animation
 */
public interface TitaniumUIImageViewChangeHandler {
	/**
	 * <b>change</b>
	 * <p>
	 * fired for each frame changed during an animation
	 * @param index the index of the image frame being displayed
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void change(JavaScriptObject index, JavaScriptObject source, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x);
}
