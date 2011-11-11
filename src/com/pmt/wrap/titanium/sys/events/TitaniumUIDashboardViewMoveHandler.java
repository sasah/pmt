package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>move</b>
 * <p>
 * fired when a  Titanium.UI.DashboardItem is moved during editing
 */
public interface TitaniumUIDashboardViewMoveHandler {
	/**
	 * <b>move</b>
	 * <p>
	 * fired when a  Titanium.UI.DashboardItem is moved during editing
	 * @param source the source object that fired the event
	 * @param items the pending data array in the new order (uncommitted)
	 * @param item the Titanium.UI.DashboardItem that was moved
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void move(JavaScriptObject source, JavaScriptObject items, JavaScriptObject item, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x);
}
