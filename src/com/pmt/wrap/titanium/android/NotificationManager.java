package com.pmt.wrap.titanium.android;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Android.NotificationManager</b>
 * <p>
 * Module to notify users of events that happen. It is a thin wrapper on NotificationManager.
 * <p>
 * <b>Platforms:</b> android 
 * <p>
 * <b>Since:</b> 1.5
 * <p>
 * <b>Type:</b> module
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class NotificationManager {

	private JavaScriptObject handler;

	public NotificationManager(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>DEFAULT_ALL</b> (int) static
	 * <p>
	 * Use all default values (where applicable).
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int DEFAULT_ALL() /*-{
		return Titanium.Android.NotificationManager.DEFAULT_ALL;
	}-*/;

	/**
	 * <b>DEFAULT_LIGHTS</b> (int) static
	 * <p>
	 * Use the default notification lights.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int DEFAULT_LIGHTS() /*-{
		return Titanium.Android.NotificationManager.DEFAULT_LIGHTS;
	}-*/;

	/**
	 * <b>DEFAULT_SOUND</b> (int) static
	 * <p>
	 * Use the default notification sound.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int DEFAULT_SOUND() /*-{
		return Titanium.Android.NotificationManager.DEFAULT_SOUND;
	}-*/;

	/**
	 * <b>DEFAULT_VIBRATE</b> (int) static
	 * <p>
	 * Use the default notification vibrate.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int DEFAULT_VIBRATE() /*-{
		return Titanium.Android.NotificationManager.DEFAULT_VIBRATE;
	}-*/;

	/**
	 * <b>FLAG_AUTO_CANCEL</b> (int) static
	 * <p>
	 * Bit to be bitwise-ored into the flags field that should be set if the notification should be canceled when it is clicked by the user.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_AUTO_CANCEL() /*-{
		return Titanium.Android.NotificationManager.FLAG_AUTO_CANCEL;
	}-*/;

	/**
	 * <b>FLAG_INSISTENT</b> (int) static
	 * <p>
	 * Bit to be bitwise-ored into the flags field that if set, the audio will be repeated until the notification is cancelled or the notification window is opened.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_INSISTENT() /*-{
		return Titanium.Android.NotificationManager.FLAG_INSISTENT;
	}-*/;

	/**
	 * <b>FLAG_NO_CLEAR</b> (int) static
	 * <p>
	 * Bit to be bitwise-ored into the flags field that should be set if the notification should not be canceled when the user clicks the Clear all button.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_NO_CLEAR() /*-{
		return Titanium.Android.NotificationManager.FLAG_NO_CLEAR;
	}-*/;

	/**
	 * <b>FLAG_ONGOING_EVENT</b> (int) static
	 * <p>
	 * Bit to be bitwise-ored into the flags field that should be set if this notification is in reference to something that is ongoing, like a phone call.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_ONGOING_EVENT() /*-{
		return Titanium.Android.NotificationManager.FLAG_ONGOING_EVENT;
	}-*/;

	/**
	 * <b>FLAG_ONLY_ALERT_ONCE</b> (int) static
	 * <p>
	 * Bit to be bitwise-ored into the flags field that should be set if you want the sound and/or vibration play each time the notification is sent, even if it has not been canceled before that.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_ONLY_ALERT_ONCE() /*-{
		return Titanium.Android.NotificationManager.FLAG_ONLY_ALERT_ONCE;
	}-*/;

	/**
	 * <b>FLAG_SHOW_LIGHTS</b> (int) static
	 * <p>
	 * Bit to be bitwise-ored into the flags field that should be set if you want the LED on for this notification.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_SHOW_LIGHTS() /*-{
		return Titanium.Android.NotificationManager.FLAG_SHOW_LIGHTS;
	}-*/;

	/**
	 * <b>STREAM_DEFAULT</b> (int) static
	 * <p>
	 * Use this constant as the value for audioStreamType to request that the default stream type for notifications be used.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int STREAM_DEFAULT() /*-{
		return Titanium.Android.NotificationManager.STREAM_DEFAULT;
	}-*/;

	/**
	 * <b>addEventListener</b>
	 * <p>
	 * add an event listener for the instance to receive view triggered events
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public static native void addEventListener(String name, JavaScriptObject callback) /*-{
		return Titanium.Android.NotificationManager.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>cancel</b>
	 * <p>
	 * Cancel a previously shown notification.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param id (int) The id you assigned to a notification.
	 * @return void
	 */
	 public static native void cancel(int id) /*-{
		return Titanium.Android.NotificationManager.cancel(id);
	}-*/;

	/**
	 * <b>cancelAll</b>
	 * <p>
	 * Cancel all previously shown notifications.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @return void
	 */
	 public static native void cancelAll() /*-{
		return Titanium.Android.NotificationManager.cancelAll();
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public static native void fireEvent(String name, JavaScriptObject event) /*-{
		return Titanium.Android.NotificationManager.fireEvent(name, event);
	}-*/;

	/**
	 * <b>notify</b>
	 * <p>
	 * Add a persistent notification to the status bar.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param id (int) An id that may be used to cancel a shown notification.
	 * @param notification (<a href="Titanium.Android.Notification-object.html">Titanium.Android.Notification</a>) An instance of <a href="Titanium.Android.Notification-object.html">Titanium.Android.Notification</a> created with <a href="Titanium.Android.createNotification-method.html">Titanium.Android.createNotification</a>.
	 * @return void
	 */
	 public static native void notify(int id, JavaScriptObject notification) /*-{
		return Titanium.Android.NotificationManager.notify(id, notification);
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public static native void removeEventListener(String name, JavaScriptObject callback) /*-{
		return Titanium.Android.NotificationManager.removeEventListener(name, callback);
	}-*/;
}
