package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>change</b>
 * <p>
 * fired when the switch value is changed
 */
public interface TitaniumUISwitchChangeHandler {
	/**
	 * <b>change</b>
	 * <p>
	 * fired when the switch value is changed
	 * @param source the source object that fired the event
	 * @param value the new value of the switch
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void change(JavaScriptObject source, JavaScriptObject value, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x);
}
