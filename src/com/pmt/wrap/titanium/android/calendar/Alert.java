package com.pmt.wrap.titanium.android.calendar;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Android.Calendar.Alert</b>
 * <p>
 * An object which represents a single alert for an event in an Android calendar.
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
public class Alert {

	private JavaScriptObject handler;

	public Alert(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>alarmTime</b> (date)
	 * <p>
	 * The date/time at which the alert's alarm is triggered.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getAlarmTime() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Alert::handler.alarmTime;
	}-*/;

	/**
	 * <b>alarmTime</b> (date)
	 * <p>
	 * The date/time at which the alert's alarm is triggered.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setAlarmTime(int alarmTime) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Alert::handler.alarmTime = alarmTime;
	}-*/;

	/**
	 * <b>begin</b> (date)
	 * <p>
	 * The date/time at which the corresponding event begins.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getBegin() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Alert::handler.begin;
	}-*/;

	/**
	 * <b>begin</b> (date)
	 * <p>
	 * The date/time at which the corresponding event begins.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setBegin(int begin) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Alert::handler.begin = begin;
	}-*/;

	/**
	 * <b>end</b> (date)
	 * <p>
	 * The date/time at which the corresponding event ends.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getEnd() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Alert::handler.end;
	}-*/;

	/**
	 * <b>end</b> (date)
	 * <p>
	 * The date/time at which the corresponding event ends.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setEnd(int end) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Alert::handler.end = end;
	}-*/;

	/**
	 * <b>eventId</b> (int)
	 * <p>
	 * The integer id of the event for which the alert is set.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getEventId() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Alert::handler.eventId;
	}-*/;

	/**
	 * <b>eventId</b> (int)
	 * <p>
	 * The integer id of the event for which the alert is set.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setEventId(int eventId) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Alert::handler.eventId = eventId;
	}-*/;

	/**
	 * <b>id</b> (string)
	 * <p>
	 * The id of the alert.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native String getId() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Alert::handler.id;
	}-*/;

	/**
	 * <b>id</b> (string)
	 * <p>
	 * The id of the alert.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setId(String id) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Alert::handler.id = id;
	}-*/;

	/**
	 * <b>minutes</b> (int)
	 * <p>
	 * The minutes before the event when the alert should trigger.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getMinutes() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Alert::handler.minutes;
	}-*/;

	/**
	 * <b>minutes</b> (int)
	 * <p>
	 * The minutes before the event when the alert should trigger.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setMinutes(int minutes) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Alert::handler.minutes = minutes;
	}-*/;

	/**
	 * <b>state</b> (int)
	 * <p>
	 * The current state of the alert.  Possible values are the STATE_ constants in Titanium.Android.Calendar.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getState() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Alert::handler.state;
	}-*/;

	/**
	 * <b>state</b> (int)
	 * <p>
	 * The current state of the alert.  Possible values are the STATE_ constants in Titanium.Android.Calendar.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setState(int state) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Alert::handler.state = state;
	}-*/;
}
