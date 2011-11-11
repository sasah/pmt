package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>delete</b>
 * <p>
 * fired when a  Titanium.UI.DashboardItem is deleted during editings
 */
public interface TitaniumUIDashboardItemDeleteHandler {
	/**
	 * <b>delete</b>
	 * <p>
	 * fired when a  Titanium.UI.DashboardItem is deleted during editings
	 * @param source the source object that fired the event
	 * @param item the Titanium.UI.DashboardItem that was deleted
	 * @param type the name of the event fired
	 */
	void delete(JavaScriptObject source, JavaScriptObject item, JavaScriptObject type);
}
