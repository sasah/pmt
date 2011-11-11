package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>click</b>
 * <p>
 * fired when the device detects a click (longer than touch) against the view
 */
public interface TitaniumMapMapViewClickHandler {
	/**
	 * <b>click</b>
	 * <p>
	 * fired when the device detects a click (longer than touch) against the view
	 * @param annotation the announce source object
	 * @param title the annotation title
	 * @param index the annotation index
	 * @param source the source object that fired the event
	 * @param map the map view instance
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param clicksource the source of either annotation, leftButton or rightButton to indicate to location of the click
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void click(JavaScriptObject annotation, JavaScriptObject title, JavaScriptObject index, JavaScriptObject source, JavaScriptObject map, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject clicksource, JavaScriptObject y, JavaScriptObject x);
}
