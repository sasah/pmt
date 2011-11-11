package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>selected</b>
 * <p>
 * fired when the text in the field is selected
 */
public interface TitaniumUITextAreaSelectedHandler {
	/**
	 * <b>selected</b>
	 * <p>
	 * fired when the text in the field is selected
	 * @param source the source object that fired the event
	 * @param range the range of text. range is an object with the properties location and length.
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void selected(JavaScriptObject source, JavaScriptObject range, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x);
}
