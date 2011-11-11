package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>move</b>
 * <p>
 * fired when a  Titanium.UI.DashboardItem is moved during editing
 */
public interface TitaniumUIDashboardItemMoveHandler {
	/**
	 * <b>move</b>
	 * <p>
	 * fired when a  Titanium.UI.DashboardItem is moved during editing
	 * @param source the source object that fired the event
	 * @param items the pending data array in the new order (uncommitted)
	 * @param item the Titanium.UI.DashboardItem that was moved
	 * @param type the name of the event fired
	 */
	void move(JavaScriptObject source, JavaScriptObject items, JavaScriptObject item, JavaScriptObject type);
}
