package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>load</b>
 * <p>
 * fired when either the initial image and/or all of the images in an animation are loaded
 */
public interface TitaniumUIImageViewLoadHandler {
	/**
	 * <b>load</b>
	 * <p>
	 * fired when either the initial image and/or all of the images in an animation are loaded
	 * @param source the source object that fired the event
	 * @param state either url to indicate the url property is loaded or images when all the images are loaded
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void load(JavaScriptObject source, JavaScriptObject state, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x);
}
