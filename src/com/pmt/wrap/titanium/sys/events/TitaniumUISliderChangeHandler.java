package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>change</b>
 * <p>
 * fired when the value of the slider changes
 */
public interface TitaniumUISliderChangeHandler {
	/**
	 * <b>change</b>
	 * <p>
	 * fired when the value of the slider changes
	 * @param thumbOffset a dictionary with properties x and y of the thumbs left-top corner in the control Available with custom thumb image. (Android)
	 * @param source the source object that fired the event
	 * @param thumbSize a dictionary with properties width and height of the size of the thumb. Available with custom thumb image.  (Android)
	 * @param value the new value of the slider
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void change(JavaScriptObject thumbOffset, JavaScriptObject source, JavaScriptObject thumbSize, JavaScriptObject value, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x);
}
