package com.pmt.wrap.titanium.android;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Android.Calendar</b>
 * <p>
 * The Android.Calendar module provides proxies and methods for accessing the native Android calendar functionality.
 * <p>
 * <b>Platforms:</b> android 
 * <p>
 * <b>Since:</b> 1.5
 * <p>
 * <b>Type:</b> module
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> object
 */
public class Calendar {

	private JavaScriptObject handler;

	public Calendar(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>METHOD_ALERT</b> (int) static
	 * <p>
	 * constant for the Titanium.Android.Calendar.Reminder method property.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int METHOD_ALERT() /*-{
		return Titanium.Android.Calendar.METHOD_ALERT;
	}-*/;

	/**
	 * <b>METHOD_DEFAULT</b> (int) static
	 * <p>
	 * constant for the Titanium.Android.Calendar.Reminder method property.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int METHOD_DEFAULT() /*-{
		return Titanium.Android.Calendar.METHOD_DEFAULT;
	}-*/;

	/**
	 * <b>METHOD_EMAIL</b> (int) static
	 * <p>
	 * constant for the Titanium.Android.Calendar.Reminder method property.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int METHOD_EMAIL() /*-{
		return Titanium.Android.Calendar.METHOD_EMAIL;
	}-*/;

	/**
	 * <b>METHOD_SMS</b> (int) static
	 * <p>
	 * constant for the Titanium.Android.Calendar.Reminder method property.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int METHOD_SMS() /*-{
		return Titanium.Android.Calendar.METHOD_SMS;
	}-*/;

	/**
	 * <b>STATE_DISMISSED</b> (int) static
	 * <p>
	 * constant for the Titanium.Android.Calendar.Alert state property.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int STATE_DISMISSED() /*-{
		return Titanium.Android.Calendar.STATE_DISMISSED;
	}-*/;

	/**
	 * <b>STATE_FIRED</b> (int) static
	 * <p>
	 * constant for the Titanium.Android.Calendar.Alert state property.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int STATE_FIRED() /*-{
		return Titanium.Android.Calendar.STATE_FIRED;
	}-*/;

	/**
	 * <b>STATE_SCHEDULED</b> (int) static
	 * <p>
	 * constant for the Titanium.Android.Calendar.Alert state property.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int STATE_SCHEDULED() /*-{
		return Titanium.Android.Calendar.STATE_SCHEDULED;
	}-*/;

	/**
	 * <b>STATUS_CANCELED</b> (int) static
	 * <p>
	 * constant for the Titanium.Android.Calendar.Event status property.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int STATUS_CANCELED() /*-{
		return Titanium.Android.Calendar.STATUS_CANCELED;
	}-*/;

	/**
	 * <b>STATUS_CONFIRMED</b> (int) static
	 * <p>
	 * constant for the Titanium.Android.Calendar.Event status property.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int STATUS_CONFIRMED() /*-{
		return Titanium.Android.Calendar.STATUS_CONFIRMED;
	}-*/;

	/**
	 * <b>STATUS_TENTATIVE</b> (int) static
	 * <p>
	 * constant for the Titanium.Android.Calendar.Event status property.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int STATUS_TENTATIVE() /*-{
		return Titanium.Android.Calendar.STATUS_TENTATIVE;
	}-*/;

	/**
	 * <b>VISIBILITY_CONFIDENTIAL</b> (int) static
	 * <p>
	 * constant for the Titanium.Android.Calendar.Event visibility property.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int VISIBILITY_CONFIDENTIAL() /*-{
		return Titanium.Android.Calendar.VISIBILITY_CONFIDENTIAL;
	}-*/;

	/**
	 * <b>VISIBILITY_DEFAULT</b> (int) static
	 * <p>
	 * constant for the Titanium.Android.Calendar.Event visibility property.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int VISIBILITY_DEFAULT() /*-{
		return Titanium.Android.Calendar.VISIBILITY_DEFAULT;
	}-*/;

	/**
	 * <b>VISIBILITY_PRIVATE</b> (int) static
	 * <p>
	 * constant for the Titanium.Android.Calendar.Event visibility property.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int VISIBILITY_PRIVATE() /*-{
		return Titanium.Android.Calendar.VISIBILITY_PRIVATE;
	}-*/;

	/**
	 * <b>VISIBILITY_PUBLIC</b> (int) static
	 * <p>
	 * constant for the Titanium.Android.Calendar.Event visibility property.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int VISIBILITY_PUBLIC() /*-{
		return Titanium.Android.Calendar.VISIBILITY_PUBLIC;
	}-*/;

	/**
	 * <b>allAlerts</b> (array) static
	 * <p>
	 * Array of Titanium.Android.Calendar.Alert objects representing all alerts.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native JavaScriptObject getAllAlerts() /*-{
		return Titanium.Android.Calendar.allAlerts;
	}-*/;

	/**
	 * <b>allAlerts</b> (array) static
	 * <p>
	 * Array of Titanium.Android.Calendar.Alert objects representing all alerts.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native void setAllAlerts(JavaScriptObject allAlerts) /*-{
		Titanium.Android.Calendar.allAlerts = allAlerts;
	}-*/;

	/**
	 * <b>allCalendars</b> (array) static
	 * <p>
	 * Array of Titanium.Android.Calendar.Calendar objects representing all the calendars known to the native calendar app.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native JavaScriptObject getAllCalendars() /*-{
		return Titanium.Android.Calendar.allCalendars;
	}-*/;

	/**
	 * <b>allCalendars</b> (array) static
	 * <p>
	 * Array of Titanium.Android.Calendar.Calendar objects representing all the calendars known to the native calendar app.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native void setAllCalendars(JavaScriptObject allCalendars) /*-{
		Titanium.Android.Calendar.allCalendars = allCalendars;
	}-*/;

	/**
	 * <b>selectableCalendars</b> (array) static
	 * <p>
	 * Array of Titanium.Android.Calendar.Calendar objects representing calendars selected within the native calendar app. This may be a subset of allCalendars; for example, the native calendar application may know -- via your Gooogle account -- about calendars that you have access to but have not selected to be displayed in the native calendar app.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native JavaScriptObject getSelectableCalendars() /*-{
		return Titanium.Android.Calendar.selectableCalendars;
	}-*/;

	/**
	 * <b>selectableCalendars</b> (array) static
	 * <p>
	 * Array of Titanium.Android.Calendar.Calendar objects representing calendars selected within the native calendar app. This may be a subset of allCalendars; for example, the native calendar application may know -- via your Gooogle account -- about calendars that you have access to but have not selected to be displayed in the native calendar app.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native void setSelectableCalendars(JavaScriptObject selectableCalendars) /*-{
		Titanium.Android.Calendar.selectableCalendars = selectableCalendars;
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
		Titanium.Android.Calendar.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>createAlert</b>
	 * <p>
	 * create and return an instance of Titanium.Android.Calendar.Alert
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.Android.Calendar.Alert
	 * @return object
	 */
	 public static native JavaScriptObject createAlert(JavaScriptObject parameters) /*-{
		return Titanium.Android.Calendar.createAlert(parameters);
	}-*/;

	/**
	 * <b>createCalendar</b>
	 * <p>
	 * create and return an instance of Titanium.Android.Calendar.Calendar
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.Android.Calendar.Calendar
	 * @return object
	 */
	 public static native JavaScriptObject createCalendar(JavaScriptObject parameters) /*-{
		return Titanium.Android.Calendar.createCalendar(parameters);
	}-*/;

	/**
	 * <b>createEvent</b>
	 * <p>
	 * create and return an instance of Titanium.Android.Calendar.Event
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.Android.Calendar.Event
	 * @return object
	 */
	 public static native JavaScriptObject createEvent(JavaScriptObject parameters) /*-{
		return Titanium.Android.Calendar.createEvent(parameters);
	}-*/;

	/**
	 * <b>createReminder</b>
	 * <p>
	 * create and return an instance of Titanium.Android.Calendar.Reminder
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.Android.Calendar.Reminder
	 * @return object
	 */
	 public static native JavaScriptObject createReminder(JavaScriptObject parameters) /*-{
		return Titanium.Android.Calendar.createReminder(parameters);
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
		Titanium.Android.Calendar.fireEvent(name, event);
	}-*/;

	/**
	 * <b>getCalendarById</b>
	 * <p>
	 * Returns the Titanium.Android.Calendar.Calendar object specified by the given integer id.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param id (int) The system id of the calendar to be retrieved.
	 * @return object
	 */
	 public static native JavaScriptObject getCalendarById(int id) /*-{
		return Titanium.Android.Calendar.getCalendarById(id);
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
		Titanium.Android.Calendar.removeEventListener(name, callback);
	}-*/;
}
