package com.pmt.wrap.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.App</b>
 * <p>
 * The top level App module.  The App module is mainly used for accessing information about the application at runtime.
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
public class App {

	private JavaScriptObject handler;

	public App(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>copyright</b> (string) static
	 * <p>
	 * the application's copyright
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getCopyright() /*-{
		return Titanium.App.copyright;
	}-*/;

	/**
	 * <b>copyright</b> (string) static
	 * <p>
	 * the application's copyright
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setCopyright(String copyright) /*-{
		Titanium.App.copyright = copyright;
	}-*/;

	/**
	 * <b>description</b> (string) static
	 * <p>
	 * the application's description
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getDescription() /*-{
		return Titanium.App.description;
	}-*/;

	/**
	 * <b>description</b> (string) static
	 * <p>
	 * the application's description
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setDescription(String description) /*-{
		Titanium.App.description = description;
	}-*/;

	/**
	 * <b>guid</b> (string) static
	 * <p>
	 * the application's globally unique id (this is system generated and consistent through all versions)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getGuid() /*-{
		return Titanium.App.guid;
	}-*/;

	/**
	 * <b>guid</b> (string) static
	 * <p>
	 * the application's globally unique id (this is system generated and consistent through all versions)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setGuid(String guid) /*-{
		Titanium.App.guid = guid;
	}-*/;

	/**
	 * <b>id</b> (string) static
	 * <p>
	 * the application's app id as specified in Titanium Developer
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getId() /*-{
		return Titanium.App.id;
	}-*/;

	/**
	 * <b>id</b> (string) static
	 * <p>
	 * the application's app id as specified in Titanium Developer
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setId(String id) /*-{
		Titanium.App.id = id;
	}-*/;

	/**
	 * <b>idleTimerDisabled</b> (boolean) static
	 * <p>
	 * property for controlling whether the phone screen will be locked on idle time. Can be set to true to disable the timer
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native boolean getIdleTimerDisabled() /*-{
		return Titanium.App.idleTimerDisabled;
	}-*/;

	/**
	 * <b>idleTimerDisabled</b> (boolean) static
	 * <p>
	 * property for controlling whether the phone screen will be locked on idle time. Can be set to true to disable the timer
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setIdleTimerDisabled(boolean idleTimerDisabled) /*-{
		Titanium.App.idleTimerDisabled = idleTimerDisabled;
	}-*/;

	/**
	 * <b>name</b> (string) static
	 * <p>
	 * the application's name
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getName() /*-{
		return Titanium.App.name;
	}-*/;

	/**
	 * <b>name</b> (string) static
	 * <p>
	 * the application's name
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setName(String name) /*-{
		Titanium.App.name = name;
	}-*/;

	/**
	 * <b>proximityDetection</b> (boolean) static
	 * <p>
	 * a boolean to indicate whether proximity detection is enabled
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native boolean getProximityDetection() /*-{
		return Titanium.App.proximityDetection;
	}-*/;

	/**
	 * <b>proximityDetection</b> (boolean) static
	 * <p>
	 * a boolean to indicate whether proximity detection is enabled
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setProximityDetection(boolean proximityDetection) /*-{
		Titanium.App.proximityDetection = proximityDetection;
	}-*/;

	/**
	 * <b>proximityState</b> (int) static
	 * <p>
	 * the state of the device's proximity detector
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int getProximityState() /*-{
		return Titanium.App.proximityState;
	}-*/;

	/**
	 * <b>proximityState</b> (int) static
	 * <p>
	 * the state of the device's proximity detector
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setProximityState(int proximityState) /*-{
		Titanium.App.proximityState = proximityState;
	}-*/;

	/**
	 * <b>publisher</b> (string) static
	 * <p>
	 * the application's publisher
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getPublisher() /*-{
		return Titanium.App.publisher;
	}-*/;

	/**
	 * <b>publisher</b> (string) static
	 * <p>
	 * the application's publisher
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setPublisher(String publisher) /*-{
		Titanium.App.publisher = publisher;
	}-*/;

	/**
	 * <b>url</b> (string) static
	 * <p>
	 * the application url
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getUrl() /*-{
		return Titanium.App.url;
	}-*/;

	/**
	 * <b>url</b> (string) static
	 * <p>
	 * the application url
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setUrl(String url) /*-{
		Titanium.App.url = url;
	}-*/;

	/**
	 * <b>version</b> (string) static
	 * <p>
	 * the application's version
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getVersion() /*-{
		return Titanium.App.version;
	}-*/;

	/**
	 * <b>version</b> (string) static
	 * <p>
	 * the application's version
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setVersion(String version) /*-{
		Titanium.App.version = version;
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
		return Titanium.App.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param name (string) the event name
	 * @param data (object) optional data payload for the event. NOTE: you can only pass JSON serializable data since the data must be transportable between contexts.
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public static native void fireEvent(String name, JavaScriptObject data, String name2, JavaScriptObject event) /*-{
		return Titanium.App.fireEvent(name, data, name2, event);
	}-*/;

	/**
	 * <b>getArguments</b>
	 * <p>
	 * return the arguments passed to the application on startup as a dictionary
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return object
	 */
	 public static native JavaScriptObject getArguments() /*-{
		return Titanium.App.getArguments();
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
		return Titanium.App.removeEventListener(name, callback);
	}-*/;
	

	/**
	 * <b>proximity</b>
	 * <p>
	 * fired when a proximity state changes
	 * @param proximity event handler
	 */
	public native void addProximity(com.pmt.wrap.titanium.sys.events.TitaniumAppProximityHandler proximity) /*-{
		this.@com.pmt.wrap.titanium.App::handler.addEventListener('proximity', function(source, state, type) {
			proximity.@com.pmt.wrap.titanium.sys.events.TitaniumAppProximityHandler::proximity(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, state, type);
		});
	}-*/;
}
