package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>click</b>
 * <p>
 * fired when the device detects a click (longer than touch) against the view
 */
public interface TitaniumUIScrollableViewClickHandler {
	/**
	 * <b>click</b>
	 * <p>
	 * fired when the device detects a click (longer than touch) against the view
	 * @param source the source object that fired the event
	 * @param view the current page view
	 * @param currentPage the current page index
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void click(JavaScriptObject source, JavaScriptObject view, JavaScriptObject currentPage, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x);
}
