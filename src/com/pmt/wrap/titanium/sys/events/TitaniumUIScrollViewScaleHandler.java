package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>scale</b>
 * <p>
 * fired when the zoom scale factor changes
 */
public interface TitaniumUIScrollViewScaleHandler {
	/**
	 * <b>scale</b>
	 * <p>
	 * fired when the zoom scale factor changes
	 * @param scale the new scale as a float
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void scale(JavaScriptObject scale, JavaScriptObject source, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x);
}
