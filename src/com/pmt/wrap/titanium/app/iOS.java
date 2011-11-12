package com.pmt.wrap.titanium.app;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.App.iOS</b>
 * <p>
 * The top level App iOS module.  The App iOS module is only available on iOS based devices.
 * <p>
 * <b>Platforms:</b> iphone ipad 
 * <p>
 * <b>Since:</b> 1.5
 * <p>
 * <b>Type:</b> module
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> object
 */
public class iOS {

	private JavaScriptObject handler;

	public iOS(JavaScriptObject handler) {
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
	 public static native void addEventListener(String name, JavaScriptObject callback) /*-{
		Titanium.App.iOS.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>cancelAllLocalNotifications</b>
	 * <p>
	 * cancel all scheduled local notifications
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.5
	 * @return void
	 */
	 public static native void cancelAllLocalNotifications() /*-{
		Titanium.App.iOS.cancelAllLocalNotifications();
	}-*/;

	/**
	 * <b>cancelLocalNotification</b>
	 * <p>
	 * cancel a specific local notification
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.5
	 * @return void
	 */
	 public static native void cancelLocalNotification() /*-{
		Titanium.App.iOS.cancelLocalNotification();
	}-*/;

	/**
	 * <b>createBackgroundService</b>
	 * <p>
	 * create and return an instance of Titanium.App.iOS.BackgroundService
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.5
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.App.iOS.BackgroundService
	 * @return object
	 */
	 public static native JavaScriptObject createBackgroundService(JavaScriptObject parameters) /*-{
		return Titanium.App.iOS.createBackgroundService(parameters);
	}-*/;

	/**
	 * <b>createLocalNotification</b>
	 * <p>
	 * create and return an instance of Titanium.App.iOS.LocalNotification
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.5
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.App.iOS.LocalNotification
	 * @return object
	 */
	 public static native JavaScriptObject createLocalNotification(JavaScriptObject parameters) /*-{
		return Titanium.App.iOS.createLocalNotification(parameters);
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
	 public static native void fireEvent(String name, JavaScriptObject event) /*-{
		Titanium.App.iOS.fireEvent(name, event);
	}-*/;

	/**
	 * <b>registerBackgroundService</b>
	 * <p>
	 * register a background service to run when the app is backgrounded
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.5
	 * @param params (object) dictionary of key/values that are used to create the service. the url property should point to a local JavaScript url that will be executed when the app is backgrounded.
	 * @return object
	 */
	 public static native JavaScriptObject registerBackgroundService(JavaScriptObject params) /*-{
		return Titanium.App.iOS.registerBackgroundService(params);
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
	 public static native void removeEventListener(String name, JavaScriptObject callback) /*-{
		Titanium.App.iOS.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>scheduleLocalNotification</b>
	 * <p>
	 * schedule a local notification
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.5
	 * @param params (object) dictionary of key/values that are used to create the notification. the date property is when the notification should fire, repeat is an optional property of one of: weekly, daily, yearly, monthly, alertBody is an optional property that is the body of the alert when the notification is displayed, alertAction is an optional property that represents the alert button text or the 'slide to unlock...' slider in place of unlock, alertLaunchImage is an optional property that specifies the launch image to display instead of Default.png when launching the application, badge is the optional badge value for the application, sound is the optional property to specify the sound to play when the notification is triggered and userInfo is the optional property which specifies data passed to the application upon launch when the notification is triggered.
	 * @return object
	 */
	 public static native JavaScriptObject scheduleLocalNotification(JavaScriptObject params) /*-{
		return Titanium.App.iOS.scheduleLocalNotification(params);
	}-*/;
	

	/**
	 * <b>notification</b>
	 * <p>
	 * fired when a local notification is received by the app.  the following event properties are available: date, timezone, alertBody, alertAction, alertLaunchImage, sound, bound, userInfo.
	 * @param notification event handler
	 */
	public native void addNotification(com.pmt.wrap.titanium.sys.events.TitaniumAppiOSNotificationHandler notification) /*-{
		this.@com.pmt.wrap.titanium.app.iOS::handler.addEventListener('notification', function(source, type) {
			notification.@com.pmt.wrap.titanium.sys.events.TitaniumAppiOSNotificationHandler::notification(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type);
		});
	}-*/;
}
