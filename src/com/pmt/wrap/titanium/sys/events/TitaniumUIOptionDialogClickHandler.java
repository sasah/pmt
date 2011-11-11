package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>click</b>
 * <p>
 * fired when a button in the dialog is clicked
 */
public interface TitaniumUIOptionDialogClickHandler {
	/**
	 * <b>click</b>
	 * <p>
	 * fired when a button in the dialog is clicked
	 * @param index the button index that was pressed
	 * @param source the source object that fired the event
	 * @param button boolean to indicate that the index refers to a button on the dialog and not an item. (Android)
	 * @param destructive the index of the destructive button
	 * @param cancel the index of the cancel button
	 * @param type the name of the event fired
	 */
	void click(JavaScriptObject index, JavaScriptObject source, JavaScriptObject button, JavaScriptObject destructive, JavaScriptObject cancel, JavaScriptObject type);
}
