package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>delete</b>
 * <p>
 * fired when a  Titanium.UI.DashboardItem is deleted during editings
 */
public interface TitaniumUIDashboardViewDeleteHandler {
	/**
	 * <b>delete</b>
	 * <p>
	 * fired when a  Titanium.UI.DashboardItem is deleted during editings
	 * @param source the source object that fired the event
	 * @param item the Titanium.UI.DashboardItem that was deleted
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void delete(JavaScriptObject source, JavaScriptObject item, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x);
}
