package com.pmt.wrap.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Utils</b>
 * <p>
 * The top level Utils module.  The Utils module is a set of common JavaScript functions that are useful for applications.
 * <p>
 * <b>Platforms:</b> android iphone ipad 
 * <p>
 * <b>Since:</b> 0.9
 * <p>
 * <b>Type:</b> module
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class Utils {

	private JavaScriptObject handler;

	public Utils(JavaScriptObject handler) {
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
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public static native void addEventListener(String name, JavaScriptObject callback) /*-{
		Titanium.Utils.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>base64decode</b>
	 * <p>
	 * decode a Base64 string
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param str (string) the string to use for the input
	 * @return string
	 */
	 public static native String base64decode(String str) /*-{
		return Titanium.Utils.base64decode(str);
	}-*/;

	/**
	 * <b>base64encode</b>
	 * <p>
	 * encode a string into Base64
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param str (string) the string to use for the input
	 * @return string
	 */
	 public static native String base64encode(String str) /*-{
		return Titanium.Utils.base64encode(str);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public static native void fireEvent(String name, JavaScriptObject event) /*-{
		Titanium.Utils.fireEvent(name, event);
	}-*/;

	/**
	 * <b>md5HexDigest</b>
	 * <p>
	 * compute a MD5 hash algorithm against the input and return a hex-based string
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param str (string) the string to use for the input
	 * @return string
	 */
	 public static native String md5HexDigest(String str) /*-{
		return Titanium.Utils.md5HexDigest(str);
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public static native void removeEventListener(String name, JavaScriptObject callback) /*-{
		Titanium.Utils.removeEventListener(name, callback);
	}-*/;
}
