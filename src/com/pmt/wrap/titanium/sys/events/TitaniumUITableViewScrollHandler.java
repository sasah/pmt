package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>scroll</b>
 * <p>
 * fired when the table view is scrolled
 */
public interface TitaniumUITableViewScrollHandler {
	/**
	 * <b>scroll</b>
	 * <p>
	 * fired when the table view is scrolled
	 * @param source the source object that fired the event
	 * @param contentSize dictionary with width and height properties containing the size of the content (regardless of the display size in the case of scrolling) (iOS only)
	 * @param totalItemCount the total number of rows in the view (Android only)
	 * @param contentOffset dictionary with x and y properties containing the content offset (iOS only)
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param visibleItemCount the number of rows currently visible in the view (Android only)
	 * @param firstVisibleItem the row index of the topmost visible row in the view (Android only)
	 * @param x the x point of the event in receiving view coordiantes
	 * @param size dictionary with width and height properties containing the size of the visible table view
	 */
	void scroll(JavaScriptObject source, JavaScriptObject contentSize, JavaScriptObject totalItemCount, JavaScriptObject contentOffset, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject visibleItemCount, JavaScriptObject firstVisibleItem, JavaScriptObject x, JavaScriptObject size);
}
