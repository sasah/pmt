package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>click</b>
 * <p>
 * fired when a button in the dialog is clicked
 */
public interface TitaniumUIAlertDialogClickHandler {
	/**
	 * <b>click</b>
	 * <p>
	 * fired when a button in the dialog is clicked
	 * @param index the button index that was pressed
	 * @param source the source object that fired the event
	 * @param cancel boolean to indicate if the cancel button was pressed
	 * @param type the name of the event fired
	 */
	void click(JavaScriptObject index, JavaScriptObject source, JavaScriptObject cancel, JavaScriptObject type);
}
