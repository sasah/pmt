package com.pmt.wrap.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Gesture</b>
 * <p>
 * The top level Gestures module.  The Gesture module is responsible for high level device gestures that are device-wide.
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
public class Gesture {

	private JavaScriptObject handler;

	public Gesture(JavaScriptObject handler) {
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
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public static native void addEventListener(String name, JavaScriptObject callback) /*-{
		return Titanium.Gesture.addEventListener(name, callback);
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
		return Titanium.Gesture.fireEvent(name, event);
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
		return Titanium.Gesture.removeEventListener(name, callback);
	}-*/;
	

	/**
	 * <b>orientationchange</b>
	 * <p>
	 * fired when the device orientation changes
	 * @param orientationchange event handler
	 */
	public native void addOrientationchange(com.pmt.wrap.titanium.sys.events.TitaniumGestureOrientationchangeHandler orientationchange) /*-{
		this.@com.pmt.wrap.titanium.Gesture::handler.addEventListener('orientationchange', function(orientation, source, type) {
			orientationchange.@com.pmt.wrap.titanium.sys.events.TitaniumGestureOrientationchangeHandler::orientationchange(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(orientation, source, type);
		});
	}-*/;
	

	/**
	 * <b>shake</b>
	 * <p>
	 * fired when the device is shaken
	 * @param shake event handler
	 */
	public native void addShake(com.pmt.wrap.titanium.sys.events.TitaniumGestureShakeHandler shake) /*-{
		this.@com.pmt.wrap.titanium.Gesture::handler.addEventListener('shake', function(timestamp, source, type) {
			shake.@com.pmt.wrap.titanium.sys.events.TitaniumGestureShakeHandler::shake(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(timestamp, source, type);
		});
	}-*/;
}
