package com.pmt.wrap.titanium.app.ios;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.App.iOS.BackgroundService</b>
 * <p>
 * The BackgroundService is created by Titanium.App.iOS.registerBackgroundService.
 * <p>
 * <b>Platforms:</b> iphone ipad 
 * <p>
 * <b>Since:</b> 1.5
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> proxy
 * <p>
 * <b>Returns:</b> null
 */
public class BackgroundService {

	private JavaScriptObject handler;

	public BackgroundService(JavaScriptObject handler) {
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
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.5
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public native void addEventListener(String name, JavaScriptObject callback) /*-{
		this.@com.pmt.wrap.titanium.app.ios.BackgroundService::handler.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.5
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public native void fireEvent(String name, JavaScriptObject event) /*-{
		this.@com.pmt.wrap.titanium.app.ios.BackgroundService::handler.fireEvent(name, event);
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.5
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public native void removeEventListener(String name, JavaScriptObject callback) /*-{
		this.@com.pmt.wrap.titanium.app.ios.BackgroundService::handler.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>stop</b>
	 * <p>
	 * stop the service from the current background session to conserve resources
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.5
	 * @return void
	 */
	 public native void stop() /*-{
		this.@com.pmt.wrap.titanium.app.ios.BackgroundService::handler.stop();
	}-*/;

	/**
	 * <b>unregister</b>
	 * <p>
	 * unregister the background service
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.5
	 * @return void
	 */
	 public native void unregister() /*-{
		this.@com.pmt.wrap.titanium.app.ios.BackgroundService::handler.unregister();
	}-*/;
}
