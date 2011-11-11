package com.pmt.wrap.titanium.app;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.App.Properties</b>
 * <p>
 * The App Properties module is used for storing application related property/value pairs which persist beyond application sessions.
 * <p>
 * <b>Platforms:</b> iphone android ipad 
 * <p>
 * <b>Since:</b> 0.5
 * <p>
 * <b>Type:</b> module
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> object
 */
public class Properties {

	private JavaScriptObject handler;

	public Properties(JavaScriptObject handler) {
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
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 0.5
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public static native void addEventListener(String name, JavaScriptObject callback) /*-{
		return Titanium.App.Properties.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 0.5
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public static native void fireEvent(String name, JavaScriptObject event) /*-{
		return Titanium.App.Properties.fireEvent(name, event);
	}-*/;

	/**
	 * <b>getBool</b>
	 * <p>
	 * return a boolean value
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 0.5
	 * @param property (string) return a boolean value for property
	 * @param default (boolean) optional default value if property is not found
	 * @return boolean
	 */
	 public static native boolean getBool(String property, boolean defaultValue) /*-{
		return Titanium.App.Properties.getBool(property, defaultValue);
	}-*/;

	/**
	 * <b>getDouble</b>
	 * <p>
	 * return a double value
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 0.5
	 * @param property (string) return a double value for property
	 * @param default (double) optional default value if property is not found
	 * @return double
	 */
	 public static native double getDouble(String property, double defaultValue) /*-{
		return Titanium.App.Properties.getDouble(property, defaultValue);
	}-*/;

	/**
	 * <b>getInt</b>
	 * <p>
	 * return an integer value
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 0.5
	 * @param property (string) return a integer value for property
	 * @param default (int) optional default value if property is not found
	 * @return int
	 */
	 public static native int getInt(String property, int defaultValue) /*-{
		return Titanium.App.Properties.getInt(property, defaultValue);
	}-*/;

	/**
	 * <b>getList</b>
	 * <p>
	 * return a value as an array
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 0.5
	 * @param property (string) return an array value for property
	 * @param default (array) optional default value if property is not found
	 * @return array
	 */
	 public static native JavaScriptObject getList(String property, JavaScriptObject defaultValue) /*-{
		return Titanium.App.Properties.getList(property, defaultValue);
	}-*/;

	/**
	 * <b>getString</b>
	 * <p>
	 * return a string value
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 0.5
	 * @param property (string) return a string value for property
	 * @param default (string) optional default value if property is not found
	 * @return string
	 */
	 public static native String getString(String property, String defaultValue) /*-{
		return Titanium.App.Properties.getString(property, defaultValue);
	}-*/;

	/**
	 * <b>hasProperty</b>
	 * <p>
	 * returns true if the property exists
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 0.5
	 * @param property (string) property name to check
	 * @return boolean
	 */
	 public static native boolean hasProperty(String property) /*-{
		return Titanium.App.Properties.hasProperty(property);
	}-*/;

	/**
	 * <b>listProperties</b>
	 * <p>
	 * return an array of property propertys
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 0.5
	 * @return array
	 */
	 public static native JavaScriptObject listProperties() /*-{
		return Titanium.App.Properties.listProperties();
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 0.5
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public static native void removeEventListener(String name, JavaScriptObject callback) /*-{
		return Titanium.App.Properties.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>removeProperty</b>
	 * <p>
	 * remove an existing property
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 0.5
	 * @param property (string) property name to remove
	 * @return void
	 */
	 public static native void removeProperty(String property) /*-{
		return Titanium.App.Properties.removeProperty(property);
	}-*/;

	/**
	 * <b>setBool</b>
	 * <p>
	 * set a property as a boolean value
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 0.5
	 * @param property (string) property name
	 * @param value (boolean) value
	 * @return void
	 */
	 public static native void setBool(String property, boolean value) /*-{
		return Titanium.App.Properties.setBool(property, value);
	}-*/;

	/**
	 * <b>setDouble</b>
	 * <p>
	 * set a property as a double value
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 0.5
	 * @param property (string) property name
	 * @param value (double) value
	 * @return void
	 */
	 public static native void setDouble(String property, double value) /*-{
		return Titanium.App.Properties.setDouble(property, value);
	}-*/;

	/**
	 * <b>setInt</b>
	 * <p>
	 * set a property as an integer value
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 0.5
	 * @param property (string) property name
	 * @param value (int) value
	 * @return void
	 */
	 public static native void setInt(String property, int value) /*-{
		return Titanium.App.Properties.setInt(property, value);
	}-*/;

	/**
	 * <b>setList</b>
	 * <p>
	 * set a property as an array value
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 0.5
	 * @param property (string) property name
	 * @param value (array) value
	 * @return void
	 */
	 public static native void setList(String property, JavaScriptObject value) /*-{
		return Titanium.App.Properties.setList(property, value);
	}-*/;

	/**
	 * <b>setString</b>
	 * <p>
	 * set a property as a string value
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 0.5
	 * @param property (string) property name
	 * @param value (string) value
	 * @return void
	 */
	 public static native void setString(String property, String value) /*-{
		return Titanium.App.Properties.setString(property, value);
	}-*/;
}
