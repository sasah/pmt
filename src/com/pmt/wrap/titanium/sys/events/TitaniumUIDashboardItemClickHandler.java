package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>click</b>
 * <p>
 * fired when a Titanium.UI.DashboardItem is clicked
 */
public interface TitaniumUIDashboardItemClickHandler {
	/**
	 * <b>click</b>
	 * <p>
	 * fired when a Titanium.UI.DashboardItem is clicked
	 * @param source the source object that fired the event
	 * @param location the location object with the properties x and y of where in the parent view the click was
	 * @param item the Titanium.UI.DashboardItem that was clicked
	 * @param type the name of the event fired
	 */
	void click(JavaScriptObject source, JavaScriptObject location, JavaScriptObject item, JavaScriptObject type);
}
