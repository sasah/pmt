package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>regionChanged</b>
 * <p>
 * fired when the mapping region changes
 */
public interface TitaniumMapMapViewRegionChangedHandler {
	/**
	 * <b>regionChanged</b>
	 * <p>
	 * fired when the mapping region changes
	 * @param latitudeDelta the new latitude delta
	 * @param longitudeDelta the new longitude delta
	 * @param source the source object that fired the event
	 * @param longitude the new longitude
	 * @param latitude the new latitude
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void regionChanged(JavaScriptObject latitudeDelta, JavaScriptObject longitudeDelta, JavaScriptObject source, JavaScriptObject longitude, JavaScriptObject latitude, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x);
}
