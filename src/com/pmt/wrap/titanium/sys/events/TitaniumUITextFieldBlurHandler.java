package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>blur</b>
 * <p>
 * fired when the field loses focus
 */
public interface TitaniumUITextFieldBlurHandler {
	/**
	 * <b>blur</b>
	 * <p>
	 * fired when the field loses focus
	 * @param source the source object that fired the event
	 * @param value the value of the field upon blur
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void blur(JavaScriptObject source, JavaScriptObject value, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x);
}
