package com.pmt.wrap.titanium.android.calendar;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Android.Calendar.Reminder</b>
 * <p>
 * An object which represents a single reminder for an event in an Android calendar.  Reminders should not be created directly, but rather by using the createReminder method of Titanium.Android.Calendar.Event.
 * <p>
 * <b>Platforms:</b> android 
 * <p>
 * <b>Since:</b> 1.5
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class Reminder {

	private JavaScriptObject handler;

	public Reminder(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>id</b> (string)
	 * <p>
	 * The id of the reminder.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native String getId() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Reminder::handler.id;
	}-*/;

	/**
	 * <b>id</b> (string)
	 * <p>
	 * The id of the reminder.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setId(String id) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Reminder::handler.id = id;
	}-*/;

	/**
	 * <b>method</b> (int)
	 * <p>
	 * The reminder method.  Possible values are the METHOD constants in Titanium.Android.Calendar.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getMethod() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Reminder::handler.method;
	}-*/;

	/**
	 * <b>method</b> (int)
	 * <p>
	 * The reminder method.  Possible values are the METHOD constants in Titanium.Android.Calendar.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setMethod(int method) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Reminder::handler.method = method;
	}-*/;

	/**
	 * <b>minutes</b> (int)
	 * <p>
	 * The minutes before the event when the reminder should occur.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getMinutes() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Reminder::handler.minutes;
	}-*/;

	/**
	 * <b>minutes</b> (int)
	 * <p>
	 * The minutes before the event when the reminder should occur.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setMinutes(int minutes) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Reminder::handler.minutes = minutes;
	}-*/;
}
