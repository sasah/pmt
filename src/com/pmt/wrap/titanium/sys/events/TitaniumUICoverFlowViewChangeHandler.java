package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>change</b>
 * <p>
 * fired when the user changes the image using a gesture
 */
public interface TitaniumUICoverFlowViewChangeHandler {
	/**
	 * <b>change</b>
	 * <p>
	 * fired when the user changes the image using a gesture
	 * @param index the index of the image that is now visible
	 * @param source the source object that fired the event
	 * @param previous the previous index of the image that was visible
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void change(JavaScriptObject index, JavaScriptObject source, JavaScriptObject previous, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x);
}