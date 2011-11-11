package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>visible</b>
 * <p>
 * fired when the masterView or detailView becomes visible.
 */
public interface TitaniumUIiPadSplitWindowVisibleHandler {
	/**
	 * <b>visible</b>
	 * <p>
	 * fired when the masterView or detailView becomes visible.
	 * @param source the source object that fired the event
	 * @param button for view view type, the button that is automatically wired to control the master view popover
	 * @param popover for either popover or detail view types, the popover instance
	 * @param view the type of view becoming visible. either master, popover or detail.
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void visible(JavaScriptObject source, JavaScriptObject button, JavaScriptObject popover, JavaScriptObject view, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x);
}
