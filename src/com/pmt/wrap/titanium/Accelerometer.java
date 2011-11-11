package com.pmt.wrap.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Accelerometer</b>
 * <p>
 * The top level Accelerometer module.  The Accelerometer modules contains methods and properties for using the device accelerometer.
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
public class Accelerometer {

	private JavaScriptObject handler;

	public Accelerometer(JavaScriptObject handler) {
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
		return Titanium.Accelerometer.addEventListener(name, callback);
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
		return Titanium.Accelerometer.fireEvent(name, event);
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
		return Titanium.Accelerometer.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>update</b>
	 * <p>
	 * fired when the accelerometer changes
	 */
	public interface UpdateHandler {
		/**
		 * <b>update</b>
		 * <p>
		 * fired when the accelerometer changes
		 * @param timestamp reference timestamp since the previous change. this is not a valid timestamp and should simply be used to determine the time between events and not an exact timestamp.
		 * @param source the source object that fired the event
		 * @param type the name of the event fired
		 * @param z the z axis of the device
		 * @param y the y axis of the device
		 * @param x the x axis of the device
		 */
		void update(JavaScriptObject timestamp, JavaScriptObject source, JavaScriptObject type, JavaScriptObject z, JavaScriptObject y, JavaScriptObject x);
	}

	/**
	 * <b>update</b>
	 * <p>
	 * fired when the accelerometer changes
	 * @param update event handler
	 */
	public native void addUpdate(UpdateHandler update) /*-{
		this.@com.pmt.wrap.titanium.Accelerometer::handler.addEventListener('update', function(timestamp, source, type, z, y, x) {
			update.@com.pmt.wrap.titanium.Accelerometer.UpdateHandler::update(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(timestamp, source, type, z, y, x);
		});
	}-*/;
}
