package com.pmt.wrap.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Analytics</b>
 * <p>
 * The top level Analytics module.  The Analytics module is used for transmitting developer-defined Analytics event for your application to the Appcelerator Analytics product. It can be used to augment additional context or application-specific information which can then be accessed during analysis using Analytics.
 * <p>
 * <b>Platforms:</b> android iphone ipad 
 * <p>
 * <b>Since:</b> 0.1
 * <p>
 * <b>Type:</b> module
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> object
 */
public class Analytics {

	private JavaScriptObject handler;

	public Analytics(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>addEvent</b>
	 * <p>
	 * send a generic event for the application session
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param type (string) the event type
	 * @param name (string) the event name
	 * @param data (object) event data or null if not specified. the object must be serializable as JSON
	 * @return void
	 */
	 public static native void addEvent(String type, String name, JavaScriptObject data) /*-{
		return Titanium.Analytics.addEvent(type, name, data);
	}-*/;

	/**
	 * <b>addEventListener</b>
	 * <p>
	 * add an event listener for the instance to receive view triggered events
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public static native void addEventListener(String name, JavaScriptObject callback) /*-{
		return Titanium.Analytics.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>featureEvent</b>
	 * <p>
	 * send an analytics feature event for the application session
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param name (string) the event name
	 * @param data (object) event data or null if not specified. the object must be serializable as JSON
	 * @return void
	 */
	 public static native void featureEvent(String name, JavaScriptObject data) /*-{
		return Titanium.Analytics.featureEvent(name, data);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public static native void fireEvent(String name, JavaScriptObject event) /*-{
		return Titanium.Analytics.fireEvent(name, event);
	}-*/;

	/**
	 * <b>navEvent</b>
	 * <p>
	 * send an analytics nav event for the application session
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param from (string) the <tt>from</tt> location in the nav event
	 * @param to (string) the <tt>to</tt> location in the nav event
	 * @param name (string) the event name
	 * @param data (object) event data or null if not specified. the object must be serializable as JSON
	 * @return void
	 */
	 public static native void navEvent(String from, String to, String name, JavaScriptObject data) /*-{
		return Titanium.Analytics.navEvent(from, to, name, data);
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public static native void removeEventListener(String name, JavaScriptObject callback) /*-{
		return Titanium.Analytics.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>settingsEvent</b>
	 * <p>
	 * send a analytics settings event for the application session
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param name (string) the event name
	 * @param data (object) event data or null if not specified. the object must be serializable as JSON
	 * @return void
	 */
	 public static native void settingsEvent(String name, JavaScriptObject data) /*-{
		return Titanium.Analytics.settingsEvent(name, data);
	}-*/;

	/**
	 * <b>timedEvent</b>
	 * <p>
	 * send an analytics timed event for the application session
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param name (string) the event name
	 * @param start (date) the event start as a Date object
	 * @param stop (date) the event end as a Date object
	 * @param duration (float) the event duration
	 * @param data (object) event data or null if not specified. the object must be serializable as JSON
	 * @return void
	 */
	 public static native void timedEvent(String name, JavaScriptObject start, JavaScriptObject stop, double duration, JavaScriptObject data) /*-{
		return Titanium.Analytics.timedEvent(name, start, stop, duration, data);
	}-*/;

	/**
	 * <b>userEvent</b>
	 * <p>
	 * send an analytics user event for the application session
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param name (string) the event name
	 * @param data (object) event data or null if not specified. the object must be serializable as JSON
	 * @return void
	 */
	 public static native void userEvent(String name, JavaScriptObject data) /*-{
		return Titanium.Analytics.userEvent(name, data);
	}-*/;
}
