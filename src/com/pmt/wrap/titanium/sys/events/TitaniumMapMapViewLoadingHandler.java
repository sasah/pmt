package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>loading</b>
 * <p>
 * fired when the map begins loading
 */
public interface TitaniumMapMapViewLoadingHandler {
	/**
	 * <b>loading</b>
	 * <p>
	 * fired when the map begins loading
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void loading(JavaScriptObject source, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x);
}
