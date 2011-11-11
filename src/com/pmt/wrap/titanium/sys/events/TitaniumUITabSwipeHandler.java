package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>swipe</b>
 * <p>
 * fired when the device detects a swipe (left or right) against the view
 */
public interface TitaniumUITabSwipeHandler {
	/**
	 * <b>swipe</b>
	 * <p>
	 * fired when the device detects a swipe (left or right) against the view
	 * @param source the source object that fired the event
	 * @param direction direction of the swipe - either left or right
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void swipe(JavaScriptObject source, JavaScriptObject direction, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x);
}
