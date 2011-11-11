package com.pmt.wrap.titanium.ui.iphone;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.iPhone.ActivityIndicatorStyle</b>
 * <p>
 * A set of constants for the styles available for Titanium.UI.ActivityIndicator objects.
 * <p>
 * <b>Platforms:</b> iphone ipad 
 * <p>
 * <b>Since:</b> 0.9
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class ActivityIndicatorStyle {

	private JavaScriptObject handler;

	public ActivityIndicatorStyle(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>BIG</b> (int) static
	 * <p>
	 * The large white style of indicator.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int BIG() /*-{
		return Titanium.UI.iPhone.ActivityIndicatorStyle.BIG;
	}-*/;

	/**
	 * <b>DARK</b> (int) static
	 * <p>
	 * The standard gray style of indicator.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int DARK() /*-{
		return Titanium.UI.iPhone.ActivityIndicatorStyle.DARK;
	}-*/;

	/**
	 * <b>PLAIN</b> (int) static
	 * <p>
	 * The standard white style of indicator (the default).
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int PLAIN() /*-{
		return Titanium.UI.iPhone.ActivityIndicatorStyle.PLAIN;
	}-*/;
}
