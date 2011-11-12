package com.pmt.wrap.titanium.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.ActivityIndicator</b>
 * <p>
 * An Activity Indicator is created by the method Titanium.UI.createActivityIndicator.  An activity indicator can be used to show the progress of an operation in the UI to let the user know some action is taking place.
 * <p>
 * <b>Platforms:</b> android iphone ipad 
 * <p>
 * <b>Since:</b> 0.8
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class ActivityIndicator {

	private JavaScriptObject handler;

	public ActivityIndicator(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>color</b> (string)
	 * <p>
	 * the color of the message label
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.ActivityIndicator::handler.color;
	}-*/;

	/**
	 * <b>color</b> (string)
	 * <p>
	 * the color of the message label
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setColor(String color) /*-{
		this.@com.pmt.wrap.titanium.ui.ActivityIndicator::handler.color = color;
	}-*/;

	/**
	 * <b>font</b> (object)
	 * <p>
	 * the font object for the activity message label
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getFont() /*-{
		return this.@com.pmt.wrap.titanium.ui.ActivityIndicator::handler.font;
	}-*/;

	/**
	 * <b>font</b> (object)
	 * <p>
	 * the font object for the activity message label
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setFont(JavaScriptObject font) /*-{
		this.@com.pmt.wrap.titanium.ui.ActivityIndicator::handler.font = font;
	}-*/;

	/**
	 * <b>message</b> (string)
	 * <p>
	 * the activity message label text
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getMessage() /*-{
		return this.@com.pmt.wrap.titanium.ui.ActivityIndicator::handler.message;
	}-*/;

	/**
	 * <b>message</b> (string)
	 * <p>
	 * the activity message label text
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setMessage(String message) /*-{
		this.@com.pmt.wrap.titanium.ui.ActivityIndicator::handler.message = message;
	}-*/;

	/**
	 * <b>messageid</b> (string)
	 * <p>
	 * the key in the locale file to use for the message property
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getMessageid() /*-{
		return this.@com.pmt.wrap.titanium.ui.ActivityIndicator::handler.messageid;
	}-*/;

	/**
	 * <b>messageid</b> (string)
	 * <p>
	 * the key in the locale file to use for the message property
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setMessageid(String messageid) /*-{
		this.@com.pmt.wrap.titanium.ui.ActivityIndicator::handler.messageid = messageid;
	}-*/;

	/**
	 * <b>style</b> (int)
	 * <p>
	 * the style constant of the activity indicator
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getStyle() /*-{
		return this.@com.pmt.wrap.titanium.ui.ActivityIndicator::handler.style;
	}-*/;

	/**
	 * <b>style</b> (int)
	 * <p>
	 * the style constant of the activity indicator
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setStyle(int style) /*-{
		this.@com.pmt.wrap.titanium.ui.ActivityIndicator::handler.style = style;
	}-*/;

	/**
	 * <b>hide</b>
	 * <p>
	 * call hide to make the activity indicator hidden and stop spinning
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @return void
	 */
	 public native void hide() /*-{
		this.@com.pmt.wrap.titanium.ui.ActivityIndicator::handler.hide();
	}-*/;

	/**
	 * <b>show</b>
	 * <p>
	 * call show to make the activity indicator visible and start spinning
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @return void
	 */
	 public native void show() /*-{
		this.@com.pmt.wrap.titanium.ui.ActivityIndicator::handler.show();
	}-*/;
}
