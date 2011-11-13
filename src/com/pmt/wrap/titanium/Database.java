package com.pmt.wrap.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Database</b>
 * <p>
 * The top level Database module.  The Database module is used for creating and accessing the in-application Database. 
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
public class Database {

	private JavaScriptObject handler;

	public Database(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>FIELD_TYPE_DOUBLE</b> (int) static
	 * <p>
	 * constant for requesting a column's value returned in double form.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int FIELD_TYPE_DOUBLE() /*-{
		return Titanium.Database.FIELD_TYPE_DOUBLE;
	}-*/;

	/**
	 * <b>FIELD_TYPE_FLOAT</b> (int) static
	 * <p>
	 * constant for requesting a column's value returned in float form.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int FIELD_TYPE_FLOAT() /*-{
		return Titanium.Database.FIELD_TYPE_FLOAT;
	}-*/;

	/**
	 * <b>FIELD_TYPE_INT</b> (int) static
	 * <p>
	 * constant for requesting a column's value returned in integer form.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int FIELD_TYPE_INT() /*-{
		return Titanium.Database.FIELD_TYPE_INT;
	}-*/;

	/**
	 * <b>FIELD_TYPE_STRING</b> (int) static
	 * <p>
	 * constant for requesting a column's value returned in string form.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int FIELD_TYPE_STRING() /*-{
		return Titanium.Database.FIELD_TYPE_STRING;
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
		Titanium.Database.addEventListener(name, callback);
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
		Titanium.Database.fireEvent(name, event);
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
		Titanium.Database.removeEventListener(name, callback);
	}-*/;
}
