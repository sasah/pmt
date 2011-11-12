package com.pmt.wrap.titanium.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.iOS</b>
 * <p>
 * The Apple iOS specific UI capabilities.  All properties, methods and events in this namespace will only work on the Apple iOS related devices.
 * <p>
 * <b>Platforms:</b> iphone ipad 
 * <p>
 * <b>Since:</b> 1.4
 * <p>
 * <b>Type:</b> module
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> object
 */
public class iOS {

	private JavaScriptObject handler;

	public iOS(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>addEventListener</b>
	 * <p>
	 * add an event listener for the instance to receive view triggered events
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public static native void addEventListener(String name, JavaScriptObject callback) /*-{
		Titanium.UI.iOS.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>createAdView</b>
	 * <p>
	 * create and return an instance of Titanium.UI.iOS.AdView
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.iOS.AdView
	 * @return object
	 */
	 public static native JavaScriptObject createAdView(JavaScriptObject parameters) /*-{
		return Titanium.UI.iOS.createAdView(parameters);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public static native void fireEvent(String name, JavaScriptObject event) /*-{
		Titanium.UI.iOS.fireEvent(name, event);
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public static native void removeEventListener(String name, JavaScriptObject callback) /*-{
		Titanium.UI.iOS.removeEventListener(name, callback);
	}-*/;
}
