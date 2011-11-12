package com.pmt.wrap.titanium.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.Picker</b>
 * <p>
 * A Picker is created by the method Titanium.UI.createPicker.  A Picker can be used to select one or more fixed values.
 * <p>
 * <b>Platforms:</b> android iphone ipad 
 * <p>
 * <b>Since:</b> 0.8
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> proxy
 * <p>
 * <b>Returns:</b> null
 */
public class Picker {

	private JavaScriptObject handler;

	public Picker(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>columns</b> (array)
	 * <p>
	 * array of column values
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getColumns() /*-{
		return this.@com.pmt.wrap.titanium.ui.Picker::handler.columns;
	}-*/;

	/**
	 * <b>columns</b> (array)
	 * <p>
	 * array of column values
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setColumns(JavaScriptObject columns) /*-{
		this.@com.pmt.wrap.titanium.ui.Picker::handler.columns = columns;
	}-*/;

	/**
	 * <b>countDownDuration</b> (double)
	 * <p>
	 * the duration value in milliseconds for count down timer pickers. (Note that Titanium's Android implementation does not support the countdown timer.)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getCountDownDuration() /*-{
		return this.@com.pmt.wrap.titanium.ui.Picker::handler.countDownDuration;
	}-*/;

	/**
	 * <b>countDownDuration</b> (double)
	 * <p>
	 * the duration value in milliseconds for count down timer pickers. (Note that Titanium's Android implementation does not support the countdown timer.)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setCountDownDuration(double countDownDuration) /*-{
		this.@com.pmt.wrap.titanium.ui.Picker::handler.countDownDuration = countDownDuration;
	}-*/;

	/**
	 * <b>format24</b> (boolean)
	 * <p>
	 * (Android only, applicable only to the Titanium.UI.PICKER_TYPE_TIME picker.)  If true, a 24-hour cloc will be used, with hours 0 through 23.  If false, a 12-hour clock will be used, with hours 1 through 12 and am/pm controls.  For reasons of backward compatibility, the default value depends on the type of time picker being used.  For the native time picker (when "useSpinner" is either un-set or false), the default is false.  For the spinner-style time picker, the default is true.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getFormat24() /*-{
		return this.@com.pmt.wrap.titanium.ui.Picker::handler.format24;
	}-*/;

	/**
	 * <b>format24</b> (boolean)
	 * <p>
	 * (Android only, applicable only to the Titanium.UI.PICKER_TYPE_TIME picker.)  If true, a 24-hour cloc will be used, with hours 0 through 23.  If false, a 12-hour clock will be used, with hours 1 through 12 and am/pm controls.  For reasons of backward compatibility, the default value depends on the type of time picker being used.  For the native time picker (when "useSpinner" is either un-set or false), the default is false.  For the spinner-style time picker, the default is true.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setFormat24(boolean format24) /*-{
		this.@com.pmt.wrap.titanium.ui.Picker::handler.format24 = format24;
	}-*/;

	/**
	 * <b>locale</b> (string)
	 * <p>
	 * the locale used for displaying Date/Time pickers values
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getLocale() /*-{
		return this.@com.pmt.wrap.titanium.ui.Picker::handler.locale;
	}-*/;

	/**
	 * <b>locale</b> (string)
	 * <p>
	 * the locale used for displaying Date/Time pickers values
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setLocale(String locale) /*-{
		this.@com.pmt.wrap.titanium.ui.Picker::handler.locale = locale;
	}-*/;

	/**
	 * <b>minDate</b> (date)
	 * <p>
	 * the minimum Date/Time for value for date pickers
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getMinDate() /*-{
		return this.@com.pmt.wrap.titanium.ui.Picker::handler.minDate;
	}-*/;

	/**
	 * <b>minDate</b> (date)
	 * <p>
	 * the minimum Date/Time for value for date pickers
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setMinDate(int minDate) /*-{
		this.@com.pmt.wrap.titanium.ui.Picker::handler.minDate = minDate;
	}-*/;

	/**
	 * <b>minuteInterval</b> (int)
	 * <p>
	 * property to set the interval displayed by the minutes wheel (for example, 15 minutes). The interval value must be evenly divided into 60; if it is not, the default value is used. The default and minimum values are 1; the maximum value is 30.  (Not currently supported on Android.)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getMinuteInterval() /*-{
		return this.@com.pmt.wrap.titanium.ui.Picker::handler.minuteInterval;
	}-*/;

	/**
	 * <b>minuteInterval</b> (int)
	 * <p>
	 * property to set the interval displayed by the minutes wheel (for example, 15 minutes). The interval value must be evenly divided into 60; if it is not, the default value is used. The default and minimum values are 1; the maximum value is 30.  (Not currently supported on Android.)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setMinuteInterval(int minuteInterval) /*-{
		this.@com.pmt.wrap.titanium.ui.Picker::handler.minuteInterval = minuteInterval;
	}-*/;

	/**
	 * <b>selectionIndicator</b> (boolean)
	 * <p>
	 * for basic picker, boolean value to indicate whether the visual selection style is shown. On the iPhone, this is a blue selected bar.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getSelectionIndicator() /*-{
		return this.@com.pmt.wrap.titanium.ui.Picker::handler.selectionIndicator;
	}-*/;

	/**
	 * <b>selectionIndicator</b> (boolean)
	 * <p>
	 * for basic picker, boolean value to indicate whether the visual selection style is shown. On the iPhone, this is a blue selected bar.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setSelectionIndicator(boolean selectionIndicator) /*-{
		this.@com.pmt.wrap.titanium.ui.Picker::handler.selectionIndicator = selectionIndicator;
	}-*/;

	/**
	 * <b>type</b> (int)
	 * <p>
	 * the type constant for the picker. One of Titanium.UI.PICKER_TYPE_PLAIN (default), Titanium.UI.PICKER_TYPE_DATE_AND_TIME, Titanium.UI.PICKER_TYPE_DATE, Titanium.UI.PICKER_TYPE_TIME or Titanium.UI.PICKER_TYPE_COUNT_DOWN_TIMER. (Note that Titanium's Android implementation does not support the countdown timer or date+time varieties.)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getType() /*-{
		return this.@com.pmt.wrap.titanium.ui.Picker::handler.type;
	}-*/;

	/**
	 * <b>type</b> (int)
	 * <p>
	 * the type constant for the picker. One of Titanium.UI.PICKER_TYPE_PLAIN (default), Titanium.UI.PICKER_TYPE_DATE_AND_TIME, Titanium.UI.PICKER_TYPE_DATE, Titanium.UI.PICKER_TYPE_TIME or Titanium.UI.PICKER_TYPE_COUNT_DOWN_TIMER. (Note that Titanium's Android implementation does not support the countdown timer or date+time varieties.)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setType(int type) /*-{
		this.@com.pmt.wrap.titanium.ui.Picker::handler.type = type;
	}-*/;

	/**
	 * <b>useSpinner</b> (boolean)
	 * <p>
	 * (Android only, default false.) An indicator that you wish to use a non-native Android control that looks and behaves more like the iOS picker in the sense that the user selects values by spinning a wheel.  (The native Android spinner is more like a conventional "dropdown".)  Note that this option works both plain pickers, date pickers and time pickers.  Set it preferably immediately when creating the picker, i.e., Titanium.UI.createPicker({useSpinner:true});, but definitely before .add()ing the picker to its parent.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getUseSpinner() /*-{
		return this.@com.pmt.wrap.titanium.ui.Picker::handler.useSpinner;
	}-*/;

	/**
	 * <b>useSpinner</b> (boolean)
	 * <p>
	 * (Android only, default false.) An indicator that you wish to use a non-native Android control that looks and behaves more like the iOS picker in the sense that the user selects values by spinning a wheel.  (The native Android spinner is more like a conventional "dropdown".)  Note that this option works both plain pickers, date pickers and time pickers.  Set it preferably immediately when creating the picker, i.e., Titanium.UI.createPicker({useSpinner:true});, but definitely before .add()ing the picker to its parent.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setUseSpinner(boolean useSpinner) /*-{
		this.@com.pmt.wrap.titanium.ui.Picker::handler.useSpinner = useSpinner;
	}-*/;

	/**
	 * <b>value</b> (date)
	 * <p>
	 * the Date/Time value for date pickers
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getValue() /*-{
		return this.@com.pmt.wrap.titanium.ui.Picker::handler.value;
	}-*/;

	/**
	 * <b>value</b> (date)
	 * <p>
	 * the Date/Time value for date pickers
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setValue(int value) /*-{
		this.@com.pmt.wrap.titanium.ui.Picker::handler.value = value;
	}-*/;

	/**
	 * <b>visibleItems</b> (int)
	 * <p>
	 * (Android only.)  This is relevant only if you set useSpinner to true, and it is relevant only for the plain picker (not date/time).  By default, the spinner-style Android picker will show 5 rows: the one in the middle which is selected, and then 2 above and below.  You can set this to allow more (use an odd number to be sure the selected row is in the middle.)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getVisibleItems() /*-{
		return this.@com.pmt.wrap.titanium.ui.Picker::handler.visibleItems;
	}-*/;

	/**
	 * <b>visibleItems</b> (int)
	 * <p>
	 * (Android only.)  This is relevant only if you set useSpinner to true, and it is relevant only for the plain picker (not date/time).  By default, the spinner-style Android picker will show 5 rows: the one in the middle which is selected, and then 2 above and below.  You can set this to allow more (use an odd number to be sure the selected row is in the middle.)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setVisibleItems(int visibleItems) /*-{
		this.@com.pmt.wrap.titanium.ui.Picker::handler.visibleItems = visibleItems;
	}-*/;

	/**
	 * <b>add</b>
	 * <p>
	 * add an array of rows, a single row or a column to the picker
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param data (array,object) add an array of rows, a single row or a column to the picker
	 * @return void
	 */
	 public native void add(JavaScriptObject data) /*-{
		this.@com.pmt.wrap.titanium.ui.Picker::handler.add(data);
	}-*/;

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
	 public native void addEventListener(String name, JavaScriptObject callback) /*-{
		this.@com.pmt.wrap.titanium.ui.Picker::handler.addEventListener(name, callback);
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
	 public native void fireEvent(String name, JavaScriptObject event) /*-{
		this.@com.pmt.wrap.titanium.ui.Picker::handler.fireEvent(name, event);
	}-*/;

	/**
	 * <b>getSelectedRow</b>
	 * <p>
	 * get the selected row object for column
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param index (int) for the column index, return the row object or nil if not found
	 * @return object
	 */
	 public native JavaScriptObject getSelectedRow(int index) /*-{
		return this.@com.pmt.wrap.titanium.ui.Picker::handler.getSelectedRow(index);
	}-*/;

	/**
	 * <b>reloadColumn</b>
	 * <p>
	 * causes the picker to reload the values from the new column.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param column (object) new column to load
	 * @return void
	 */
	 public native void reloadColumn(JavaScriptObject column) /*-{
		this.@com.pmt.wrap.titanium.ui.Picker::handler.reloadColumn(column);
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
	 public native void removeEventListener(String name, JavaScriptObject callback) /*-{
		this.@com.pmt.wrap.titanium.ui.Picker::handler.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>setSelectedRow</b>
	 * <p>
	 * set the column's row to the selected state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param column (int) the column index
	 * @param row (int) the row index
	 * @param animated (boolean) boolean to indicate if the selection should be animated (default) (optional)
	 * @return void
	 */
	 public native void setSelectedRow(int column, int row, boolean animated) /*-{
		this.@com.pmt.wrap.titanium.ui.Picker::handler.setSelectedRow(column, row, animated);
	}-*/;
	

	/**
	 * <b>change</b>
	 * <p>
	 * fired when the value of a picker row and/or column changes
	 * @param change event handler
	 */
	public native void addChange(com.pmt.wrap.titanium.sys.events.TitaniumUIPickerChangeHandler change) /*-{
		this.@com.pmt.wrap.titanium.ui.Picker::handler.addEventListener('change', function(source, rowIndex, value, column, columnIndex, selectedValue, type, row) {
			change.@com.pmt.wrap.titanium.sys.events.TitaniumUIPickerChangeHandler::change(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, rowIndex, value, column, columnIndex, selectedValue, type, row);
		});
	}-*/;
}
