package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>scroll</b>
 * <p>
 * fired when the view is scrolled
 */
public interface TitaniumUIScrollViewScrollHandler {
	/**
	 * <b>scroll</b>
	 * <p>
	 * fired when the view is scrolled
	 * @param dragging boolean to indicate if the scroll is based on a dragging gesture
	 * @param source the source object that fired the event
	 * @param decelerating boolean to indicate if the scroll is decelerating
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void scroll(JavaScriptObject dragging, JavaScriptObject source, JavaScriptObject decelerating, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x);
}
