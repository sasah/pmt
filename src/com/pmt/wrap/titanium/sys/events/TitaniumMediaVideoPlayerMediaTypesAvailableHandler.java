package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>mediaTypesAvailable</b>
 * <p>
 * fired when the media types is available
 */
public interface TitaniumMediaVideoPlayerMediaTypesAvailableHandler {
	/**
	 * <b>mediaTypesAvailable</b>
	 * <p>
	 * fired when the media types is available
	 * @param source the source object that fired the event
	 * @param mediaTypes media types
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void mediaTypesAvailable(JavaScriptObject source, JavaScriptObject mediaTypes, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x);
}
