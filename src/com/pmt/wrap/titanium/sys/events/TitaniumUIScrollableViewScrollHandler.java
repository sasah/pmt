package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>scroll</b>
 * <p>
 * fired when the scroll view is scrolled
 */
public interface TitaniumUIScrollableViewScrollHandler {
	/**
	 * <b>scroll</b>
	 * <p>
	 * fired when the scroll view is scrolled
	 * @param source the source object that fired the event
	 * @param view the current page view
	 * @param currentPage the current page index
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void scroll(JavaScriptObject source, JavaScriptObject view, JavaScriptObject currentPage, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x);
}
