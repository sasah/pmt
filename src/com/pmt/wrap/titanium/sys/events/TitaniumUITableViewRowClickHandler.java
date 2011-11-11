package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>click</b>
 * <p>
 * fired when the device detects a click (longer than touch) against the view
 */
public interface TitaniumUITableViewRowClickHandler {
	/**
	 * <b>click</b>
	 * <p>
	 * fired when the device detects a click (longer than touch) against the view
	 * @param index table view row index
	 * @param detail boolean to indicate if the right area was clicked
	 * @param source the source object that fired the event
	 * @param rowData table view row data object
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param section table view section object
	 * @param searchMode boolean to indicate if the table is in search mode
	 * @param row table view row object
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void click(JavaScriptObject index, JavaScriptObject detail, JavaScriptObject source, JavaScriptObject rowData, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject section, JavaScriptObject searchMode, JavaScriptObject row, JavaScriptObject x);
}
