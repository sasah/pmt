package com.pmt.wrap.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Map</b>
 * <p>
 * The top level Map module.  The Map module is used for creating in-application native maps.
 * <p>
 * <b>Platforms:</b> android iphone ipad 
 * <p>
 * <b>Since:</b> 0.8
 * <p>
 * <b>Type:</b> module
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> object
 */
public class Map {

	private JavaScriptObject handler;

	public Map(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>HYBRID_TYPE</b> (int) static
	 * <p>
	 * Displays a satellite image of the area with road and road name information layered on top.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int HYBRID_TYPE() /*-{
		return Titanium.Map.HYBRID_TYPE;
	}-*/;

	/**
	 * <b>SATELLITE_TYPE</b> (int) static
	 * <p>
	 * Displays satellite imagery of the area.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int SATELLITE_TYPE() /*-{
		return Titanium.Map.SATELLITE_TYPE;
	}-*/;

	/**
	 * <b>STANDARD_TYPE</b> (int) static
	 * <p>
	 * Displays a street map that shows the position of all roads and some road names.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int STANDARD_TYPE() /*-{
		return Titanium.Map.STANDARD_TYPE;
	}-*/;

	/**
	 * <b>addEventListener</b>
	 * <p>
	 * add an event listener for the instance to receive view triggered events
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public static native void addEventListener(String name, JavaScriptObject callback) /*-{
		return Titanium.Map.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>createAnnotation</b>
	 * <p>
	 * create and return an instance of Titanium.Map.Annotation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.Map.Annotation
	 * @return object
	 */
	 public static native JavaScriptObject createAnnotation(JavaScriptObject parameters) /*-{
		return Titanium.Map.createAnnotation(parameters);
	}-*/;

	/**
	 * <b>createMapView</b>
	 * <p>
	 * create and return an instance of Titanium.Map.MapView
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.Map.MapView
	 * @return object
	 */
	 public static native JavaScriptObject createMapView(JavaScriptObject parameters) /*-{
		return Titanium.Map.createMapView(parameters);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public static native void fireEvent(String name, JavaScriptObject event) /*-{
		return Titanium.Map.fireEvent(name, event);
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public static native void removeEventListener(String name, JavaScriptObject callback) /*-{
		return Titanium.Map.removeEventListener(name, callback);
	}-*/;
}
