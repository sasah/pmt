package com.pmt.wrap.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.API</b>
 * <p>
 * The top level API module.  The API module is mainly used for logging.
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
public class API {

	private JavaScriptObject handler;

	public API(JavaScriptObject handler) {
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
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public static native void addEventListener(String name, JavaScriptObject callback) /*-{
		Titanium.API.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>debug</b>
	 * <p>
	 * function for logging debug messages
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param message (string) the message to log
	 * @return void
	 */
	 public static native void debug(String message) /*-{
		Titanium.API.debug(message);
	}-*/;

	/**
	 * <b>error</b>
	 * <p>
	 * function for logging error messages
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param message (string) the message to log
	 * @return void
	 */
	 public static native void error(String message) /*-{
		Titanium.API.error(message);
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
		Titanium.API.fireEvent(name, event);
	}-*/;

	/**
	 * <b>info</b>
	 * <p>
	 * function for logging informational messages
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param message (string) the message to log
	 * @return void
	 */
	 public static native void info(String message) /*-{
		Titanium.API.info(message);
	}-*/;

	/**
	 * <b>log</b>
	 * <p>
	 * function for logging custom severity messages
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param level (string) the log level
	 * @param message (string) the message to log
	 * @return void
	 */
	 public static native void log(String level, String message) /*-{
		Titanium.API.log(level, message);
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
		Titanium.API.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>warn</b>
	 * <p>
	 * function for logging warning messages
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param message (string) the message to log
	 * @return void
	 */
	 public static native void warn(String message) /*-{
		Titanium.API.warn(message);
	}-*/;
}
