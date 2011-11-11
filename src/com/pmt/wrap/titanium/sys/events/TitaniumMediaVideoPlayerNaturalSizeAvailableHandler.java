package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>naturalSizeAvailable</b>
 * <p>
 * fired when the natural size is available
 */
public interface TitaniumMediaVideoPlayerNaturalSizeAvailableHandler {
	/**
	 * <b>naturalSizeAvailable</b>
	 * <p>
	 * fired when the natural size is available
	 * @param source the source object that fired the event
	 * @param naturalSize natural size as a dictionary. see naturalSize property.
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void naturalSizeAvailable(JavaScriptObject source, JavaScriptObject naturalSize, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x);
}
