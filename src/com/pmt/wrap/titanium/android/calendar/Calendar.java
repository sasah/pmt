package com.pmt.wrap.titanium.android.calendar;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Android.Calendar.Calendar</b>
 * <p>
 * An object which represents a single calendar in Android.
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
public class Calendar {

	private JavaScriptObject handler;

	public Calendar(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>hidden</b> (boolean)
	 * <p>
	 * Whether the calendar is hidden.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native boolean getHidden() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Calendar::handler.hidden;
	}-*/;

	/**
	 * <b>hidden</b> (boolean)
	 * <p>
	 * Whether the calendar is hidden.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setHidden(boolean hidden) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Calendar::handler.hidden = hidden;
	}-*/;

	/**
	 * <b>id</b> (string)
	 * <p>
	 * The id of the calendar.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native String getId() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Calendar::handler.id;
	}-*/;

	/**
	 * <b>id</b> (string)
	 * <p>
	 * The id of the calendar.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setId(String id) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Calendar::handler.id = id;
	}-*/;

	/**
	 * <b>name</b> (string)
	 * <p>
	 * The display name of the calendar.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native String getName() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Calendar::handler.name;
	}-*/;

	/**
	 * <b>name</b> (string)
	 * <p>
	 * The display name of the calendar.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setName(String name) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Calendar::handler.name = name;
	}-*/;

	/**
	 * <b>selected</b> (boolean)
	 * <p>
	 * Whether the calendar is selected.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native boolean getSelected() /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Calendar::handler.selected;
	}-*/;

	/**
	 * <b>selected</b> (boolean)
	 * <p>
	 * Whether the calendar is selected.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setSelected(boolean selected) /*-{
		this.@com.pmt.wrap.titanium.android.calendar.Calendar::handler.selected = selected;
	}-*/;

	/**
	 * <b>createEvent</b>
	 * <p>
	 * Add an event to the calendar. Returns the created Titanium.Android.Calendar.Event.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param properties (object) An object defining the properties of the event.  These correspond to properties of Titanium.Android.Calendar.Event.
	 * @return object
	 */
	 public native JavaScriptObject createEvent(JavaScriptObject properties) /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Calendar::handler.createEvent(properties);
	}-*/;

	/**
	 * <b>getEventById</b>
	 * <p>
	 * Returns the Titanium.Android.Calendar.Event object for the event with the given integer id.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param id (int) The integer id of the event to return.
	 * @return object
	 */
	 public native JavaScriptObject getEventById(int id) /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Calendar::handler.getEventById(id);
	}-*/;

	/**
	 * <b>getEventsBetweenDates</b>
	 * <p>
	 * Returns an array of Titanium.Android.Calendar.Event objects with all events in the given date range.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param date1 (date) The start date.
	 * @param date2 (date) The end date.
	 * @return array
	 */
	 public native JavaScriptObject getEventsBetweenDates(JavaScriptObject date1, JavaScriptObject date2) /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Calendar::handler.getEventsBetweenDates(date1, date2);
	}-*/;

	/**
	 * <b>getEventsInDate</b>
	 * <p>
	 * Returns an array of Titanium.Android.Calendar.Event objects with all events on the given date.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param year (int) The year of the desired date.
	 * @param month (int) The month of the desired date.  The month is zero-based, therefore January is 0 and December is 11.
	 * @param day (int) The day for which events should be returned.
	 * @return array
	 */
	 public native JavaScriptObject getEventsInDate(int year, int month, int day) /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Calendar::handler.getEventsInDate(year, month, day);
	}-*/;

	/**
	 * <b>getEventsInMonth</b>
	 * <p>
	 * Returns an array of Titanium.Android.Calendar.Event objects with all events in the given month.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param year (int) The year of the desired month.
	 * @param month (int) The month for which events should be returned.  The month is zero-based, therefore January is 0 and December is 11.
	 * @return array
	 */
	 public native JavaScriptObject getEventsInMonth(int year, int month) /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Calendar::handler.getEventsInMonth(year, month);
	}-*/;

	/**
	 * <b>getEventsInYear</b>
	 * <p>
	 * Returns an array of Titanium.Android.Calendar.Event objects with all events in the given year.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param year (int) The year for which all events should be returned.
	 * @return array
	 */
	 public native JavaScriptObject getEventsInYear(int year) /*-{
		return this.@com.pmt.wrap.titanium.android.calendar.Calendar::handler.getEventsInYear(year);
	}-*/;
}
