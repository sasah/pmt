package com.pmt.wrap.titanium.ui.iphone;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.iPhone.ProgressBarStyle</b>
 * <p>
 * A set of constants for the bar styles used on the style property of Titanium.UI.ProgressBar.
 * <p>
 * <b>Platforms:</b> iphone ipad 
 * <p>
 * <b>Since:</b> 0.8
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class ProgressBarStyle {

	private JavaScriptObject handler;

	public ProgressBarStyle(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>BAR</b> (int) static
	 * <p>
	 * The style of progress view that is used in a toolbar.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int BAR() /*-{
		return Titanium.UI.iPhone.ProgressBarStyle.BAR;
	}-*/;

	/**
	 * <b>DEFAULT</b> (int) static
	 * <p>
	 * he standard progress-view style. This is the default.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int DEFAULT() /*-{
		return Titanium.UI.iPhone.ProgressBarStyle.DEFAULT;
	}-*/;

	/**
	 * <b>PLAIN</b> (int) static
	 * <p>
	 * The standard progress-view style. Same as DEFAULT.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int PLAIN() /*-{
		return Titanium.UI.iPhone.ProgressBarStyle.PLAIN;
	}-*/;
}
