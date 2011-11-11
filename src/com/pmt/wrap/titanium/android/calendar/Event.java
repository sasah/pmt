package com.pmt.wrap.titanium.android.calendar;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Android.Calendar.Event</b>
 * <p>
 * An object which represents a single event in an Android calendar.
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
public class Event {

	private JavaScriptObject handler;

	public Event(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>alerts</b> (array)
	 * <p>
	 * An array of Titanium.Android.Calendar.Alert objects which are the alerts - if any - for this event.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native JavaScriptObject getAlerts() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Event::handler.alerts;
	}-*/;

	/**
	 * <b>alerts</b> (array)
	 * <p>
	 * An array of Titanium.Android.Calendar.Alert objects which are the alerts - if any - for this event.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setAlerts(JavaScriptObject alerts) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Event::handler.alerts = alerts;
	}-*/;

	/**
	 * <b>allDay</b> (boolean)
	 * <p>
	 * Whether the event is all day.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native boolean getAllDay() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Event::handler.allDay;
	}-*/;

	/**
	 * <b>allDay</b> (boolean)
	 * <p>
	 * Whether the event is all day.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setAllDay(boolean allDay) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Event::handler.allDay = allDay;
	}-*/;

	/**
	 * <b>begin</b> (date)
	 * <p>
	 * The date/time at which the event begins.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getBegin() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Event::handler.begin;
	}-*/;

	/**
	 * <b>begin</b> (date)
	 * <p>
	 * The date/time at which the event begins.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setBegin(int begin) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Event::handler.begin = begin;
	}-*/;

	/**
	 * <b>description</b> (string)
	 * <p>
	 * The event description.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native String getDescription() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Event::handler.description;
	}-*/;

	/**
	 * <b>description</b> (string)
	 * <p>
	 * The event description.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setDescription(String description) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Event::handler.description = description;
	}-*/;

	/**
	 * <b>end</b> (date)
	 * <p>
	 * The date/time at which the event ends.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getEnd() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Event::handler.end;
	}-*/;

	/**
	 * <b>end</b> (date)
	 * <p>
	 * The date/time at which the event ends.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setEnd(int end) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Event::handler.end = end;
	}-*/;

	/**
	 * <b>extendedProperties</b> (object)
	 * <p>
	 * An object containing extended properties of the event.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native JavaScriptObject getExtendedProperties() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Event::handler.extendedProperties;
	}-*/;

	/**
	 * <b>extendedProperties</b> (object)
	 * <p>
	 * An object containing extended properties of the event.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setExtendedProperties(JavaScriptObject extendedProperties) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Event::handler.extendedProperties = extendedProperties;
	}-*/;

	/**
	 * <b>hasAlarm</b> (boolean)
	 * <p>
	 * Whether an alarm is scheduled for the event.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native boolean getHasAlarm() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Event::handler.hasAlarm;
	}-*/;

	/**
	 * <b>hasAlarm</b> (boolean)
	 * <p>
	 * Whether an alarm is scheduled for the event.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setHasAlarm(boolean hasAlarm) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Event::handler.hasAlarm = hasAlarm;
	}-*/;

	/**
	 * <b>hasExtendedProperties</b> (boolean)
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native boolean getHasExtendedProperties() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Event::handler.hasExtendedProperties;
	}-*/;

	/**
	 * <b>hasExtendedProperties</b> (boolean)
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setHasExtendedProperties(boolean hasExtendedProperties) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Event::handler.hasExtendedProperties = hasExtendedProperties;
	}-*/;

	/**
	 * <b>id</b> (string)
	 * <p>
	 * The id of the event.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native String getId() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Event::handler.id;
	}-*/;

	/**
	 * <b>id</b> (string)
	 * <p>
	 * The id of the event.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setId(String id) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Event::handler.id = id;
	}-*/;

	/**
	 * <b>location</b> (string)
	 * <p>
	 * The event location.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native String getLocation() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Event::handler.location;
	}-*/;

	/**
	 * <b>location</b> (string)
	 * <p>
	 * The event location.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setLocation(String location) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Event::handler.location = location;
	}-*/;

	/**
	 * <b>reminders</b> (array)
	 * <p>
	 * An array of Titanium.Android.Calendar.Reminder objects which are the reminders - if any - for this event.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native JavaScriptObject getReminders() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Event::handler.reminders;
	}-*/;

	/**
	 * <b>reminders</b> (array)
	 * <p>
	 * An array of Titanium.Android.Calendar.Reminder objects which are the reminders - if any - for this event.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setReminders(JavaScriptObject reminders) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Event::handler.reminders = reminders;
	}-*/;

	/**
	 * <b>status</b> (int)
	 * <p>
	 * The status of the event.  Possible values are the STATUS constants in Titanium.Android.Calendar.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getStatus() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Event::handler.status;
	}-*/;

	/**
	 * <b>status</b> (int)
	 * <p>
	 * The status of the event.  Possible values are the STATUS constants in Titanium.Android.Calendar.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setStatus(int status) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Event::handler.status = status;
	}-*/;

	/**
	 * <b>title</b> (string)
	 * <p>
	 * The title string for the event.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native String getTitle() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Event::handler.title;
	}-*/;

	/**
	 * <b>title</b> (string)
	 * <p>
	 * The title string for the event.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setTitle(String title) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Event::handler.title = title;
	}-*/;

	/**
	 * <b>visibility</b> (int)
	 * <p>
	 * The event's visibility.  Possible values are the VISIBILITY constants in Titanium.Android.Calendar.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getVisibility() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Event::handler.visibility;
	}-*/;

	/**
	 * <b>visibility</b> (int)
	 * <p>
	 * The event's visibility.  Possible values are the VISIBILITY constants in Titanium.Android.Calendar.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setVisibility(int visibility) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Event::handler.visibility = visibility;
	}-*/;

	/**
	 * <b>createAlert</b>
	 * <p>
	 * create an alert for this event.  Pass a dictionary object containing attributes corresponding to properties of Titanium.Android.Calendar.Alert.  Returns the created alert.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param data (object) Properties for the new alert, corresponding to properties of <a href="Titanium.Android.Calendar.Alert-object.html">Titanium.Android.Calendar.Alert</a>.
	 * @return object
	 */
	 public native JavaScriptObject createAlert(JavaScriptObject data) /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Event::handler.createAlert(data);
	}-*/;

	/**
	 * <b>createReminder</b>
	 * <p>
	 * create a reminder for this event.  Pass a dictionary object containing attributes corresponding to properties of Titanium.Android.Calendar.Reminder.  Returns the created Reminder.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param data (object) Properties for the new reminder, corresponding to properties of <a href="Titanium.Android.Calendar.Reminder.html">Titanium.Android.Calendar.Reminder</a>.
	 * @return object
	 */
	 public native JavaScriptObject createReminder(JavaScriptObject data) /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Event::handler.createReminder(data);
	}-*/;

	/**
	 * <b>getExtendedProperty</b>
	 * <p>
	 * Returns the value of the given extended property key string.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param name (string) The name of the extended property whose value should be returned.
	 * @return string
	 */
	 public native String getExtendedProperty(String name) /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Event::handler.getExtendedProperty(name);
	}-*/;

	/**
	 * <b>setExtendedProperty</b>
	 * <p>
	 * Set the value of the named extended property.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param name (string) The name of the extended property whose value should be set.
	 * @param value (string) The value to which to set the named extended property.
	 * @return void
	 */
	 public native void setExtendedProperty(String name, String value) /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Event::handler.setExtendedProperty(name, value);
	}-*/;
}
