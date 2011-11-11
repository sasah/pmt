package com.pmt.wrap.titanium.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.Clipboard</b>
 * <p>
 * A module used for accessing clipboard data.
 * <p>
 * <b>Platforms:</b> iphone android ipad 
 * <p>
 * <b>Since:</b> 1.5
 * <p>
 * <b>Type:</b> module
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> object
 */
public class Clipboard {

	private JavaScriptObject handler;

	public Clipboard(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>addEventListener</b>
	 * <p>
	 * add an event listener for the instance to receive view triggered events
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.5
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public static native void addEventListener(String name, JavaScriptObject callback) /*-{
		return Titanium.UI.Clipboard.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>clearData</b>
	 * <p>
	 * Clear data of the given mime-type from the clipboard. If no mime-type is given, clear all data from the clipboard.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.5
	 * @param type (string) (optional) The mime-type of the data to clear.
	 * @return void
	 */
	 public static native void clearData(String type) /*-{
		return Titanium.UI.Clipboard.clearData(type);
	}-*/;

	/**
	 * <b>clearText</b>
	 * <p>
	 * Clear the text portion of the clipboard.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.5
	 * @return void
	 */
	 public static native void clearText() /*-{
		return Titanium.UI.Clipboard.clearText();
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.5
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public static native void fireEvent(String name, JavaScriptObject event) /*-{
		return Titanium.UI.Clipboard.fireEvent(name, event);
	}-*/;

	/**
	 * <b>getData</b>
	 * <p>
	 * Get the data on the clipboard from the portion which contains data of the given mime-type.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.5
	 * @param type (string) The mime-type of the data to get.
	 * @return void
	 */
	 public static native void getData(String type) /*-{
		return Titanium.UI.Clipboard.getData(type);
	}-*/;

	/**
	 * <b>getText</b>
	 * <p>
	 * Get the current text on the clipboard.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.5
	 * @return void
	 */
	 public static native void getText() /*-{
		return Titanium.UI.Clipboard.getText();
	}-*/;

	/**
	 * <b>hasData</b>
	 * <p>
	 * Return true if there is any content of the given mime-type on the clipboard.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.5
	 * @param type (string) (optional) The mime-type of the data to check.
	 * @return void
	 */
	 public static native void hasData(String type) /*-{
		return Titanium.UI.Clipboard.hasData(type);
	}-*/;

	/**
	 * <b>hasText</b>
	 * <p>
	 * Return true if there is any content in the text portion of the clipboard.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.5
	 * @return void
	 */
	 public static native void hasText() /*-{
		return Titanium.UI.Clipboard.hasText();
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.5
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public static native void removeEventListener(String name, JavaScriptObject callback) /*-{
		return Titanium.UI.Clipboard.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>setData</b>
	 * <p>
	 * Set the data on the clipboard given a mime-type and the new data. This method will set data on the appropriate portion of the clipboard for the given mime-type.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.5
	 * @param type (string) The mime-type of the data to set.
	 * @param data (object) The new clipboard text.
	 * @return void
	 */
	 public static native void setData(String type, JavaScriptObject data) /*-{
		return Titanium.UI.Clipboard.setData(type, data);
	}-*/;

	/**
	 * <b>setText</b>
	 * <p>
	 * Set the text on the clipboard. This will overwrite the current contents of the clipboard.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.5
	 * @param text (string) The new clipboard text. If the text is an empty string
	 * @return void
	 */
	 public static native void setText(String text) /*-{
		return Titanium.UI.Clipboard.setText(text);
	}-*/;
}
