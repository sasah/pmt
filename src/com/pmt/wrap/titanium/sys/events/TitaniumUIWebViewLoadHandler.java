package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>load</b>
 * <p>
 * fired when the webview is loaded
 */
public interface TitaniumUIWebViewLoadHandler {
	/**
	 * <b>load</b>
	 * <p>
	 * fired when the webview is loaded
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param url the url of the web document
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void load(JavaScriptObject source, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject url, JavaScriptObject x);
}
