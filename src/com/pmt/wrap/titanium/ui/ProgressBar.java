package com.pmt.wrap.titanium.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.ProgressBar</b>
 * <p>
 * A Progress Bar is created by the method Titanium.UI.createProgressBar.
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
public class ProgressBar {

	private JavaScriptObject handler;

	public ProgressBar(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>color</b> (string)
	 * <p>
	 * the color of the progress bar text
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.ProgressBar::handler.color;
	}-*/;

	/**
	 * <b>color</b> (string)
	 * <p>
	 * the color of the progress bar text
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setColor(String color) /*-{
		this.@com.pmt.wrap.titanium.ui.ProgressBar::handler.color = color;
	}-*/;

	/**
	 * <b>font</b> (object)
	 * <p>
	 * the font object for the progress bar text
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getFont() /*-{
		return this.@com.pmt.wrap.titanium.ui.ProgressBar::handler.font;
	}-*/;

	/**
	 * <b>font</b> (object)
	 * <p>
	 * the font object for the progress bar text
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setFont(JavaScriptObject font) /*-{
		this.@com.pmt.wrap.titanium.ui.ProgressBar::handler.font = font;
	}-*/;

	/**
	 * <b>max</b> (float)
	 * <p>
	 * the maximum value of the progress bar
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getMax() /*-{
		return this.@com.pmt.wrap.titanium.ui.ProgressBar::handler.max;
	}-*/;

	/**
	 * <b>max</b> (float)
	 * <p>
	 * the maximum value of the progress bar
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setMax(double max) /*-{
		this.@com.pmt.wrap.titanium.ui.ProgressBar::handler.max = max;
	}-*/;

	/**
	 * <b>message</b> (string)
	 * <p>
	 * the progress bar message
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getMessage() /*-{
		return this.@com.pmt.wrap.titanium.ui.ProgressBar::handler.message;
	}-*/;

	/**
	 * <b>message</b> (string)
	 * <p>
	 * the progress bar message
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setMessage(String message) /*-{
		this.@com.pmt.wrap.titanium.ui.ProgressBar::handler.message = message;
	}-*/;

	/**
	 * <b>min</b> (float)
	 * <p>
	 * the minimum value of the progress bar
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getMin() /*-{
		return this.@com.pmt.wrap.titanium.ui.ProgressBar::handler.min;
	}-*/;

	/**
	 * <b>min</b> (float)
	 * <p>
	 * the minimum value of the progress bar
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setMin(double min) /*-{
		this.@com.pmt.wrap.titanium.ui.ProgressBar::handler.min = min;
	}-*/;

	/**
	 * <b>style</b> (int)
	 * <p>
	 * the style of the progress bar
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getStyle() /*-{
		return this.@com.pmt.wrap.titanium.ui.ProgressBar::handler.style;
	}-*/;

	/**
	 * <b>style</b> (int)
	 * <p>
	 * the style of the progress bar
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setStyle(int style) /*-{
		this.@com.pmt.wrap.titanium.ui.ProgressBar::handler.style = style;
	}-*/;

	/**
	 * <b>value</b> (float)
	 * <p>
	 * the current value of the progress bar
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getValue() /*-{
		return this.@com.pmt.wrap.titanium.ui.ProgressBar::handler.value;
	}-*/;

	/**
	 * <b>value</b> (float)
	 * <p>
	 * the current value of the progress bar
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setValue(double value) /*-{
		this.@com.pmt.wrap.titanium.ui.ProgressBar::handler.value = value;
	}-*/;
}
