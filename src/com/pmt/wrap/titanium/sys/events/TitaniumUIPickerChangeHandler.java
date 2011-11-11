package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>change</b>
 * <p>
 * fired when the value of a picker row and/or column changes
 */
public interface TitaniumUIPickerChangeHandler {
	/**
	 * <b>change</b>
	 * <p>
	 * fired when the value of a picker row and/or column changes
	 * @param source the source object that fired the event
	 * @param rowIndex the selected row index
	 * @param value (date/time pickers only) the selected date/time value.
	 * @param column the column object
	 * @param columnIndex the selected column index
	 * @param selectedValue (plain picker only) the array of selected values, one element per column in the picker.
	 * @param type the name of the event fired
	 * @param row the row object
	 */
	void change(JavaScriptObject source, JavaScriptObject rowIndex, JavaScriptObject value, JavaScriptObject column, JavaScriptObject columnIndex, JavaScriptObject selectedValue, JavaScriptObject type, JavaScriptObject row);
}
