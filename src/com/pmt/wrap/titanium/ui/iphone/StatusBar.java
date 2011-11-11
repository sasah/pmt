package com.pmt.wrap.titanium.ui.iphone;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.iPhone.StatusBar</b>
 * <p>
 * A set of constants for the status bar style.
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
public class StatusBar {

	private JavaScriptObject handler;

	public StatusBar(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>DEFAULT</b> (int) static
	 * <p>
	 * The default status bar style
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int DEFAULT() /*-{
		return Titanium.UI.iPhone.StatusBar.DEFAULT;
	}-*/;

	/**
	 * <b>GRAY</b> (int) static
	 * <p>
	 * The gray colored status bar style
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int GRAY() /*-{
		return Titanium.UI.iPhone.StatusBar.GRAY;
	}-*/;

	/**
	 * <b>OPAQUE_BLACK</b> (int) static
	 * <p>
	 * The opaque black status bar style.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int OPAQUE_BLACK() /*-{
		return Titanium.UI.iPhone.StatusBar.OPAQUE_BLACK;
	}-*/;

	/**
	 * <b>TRANSLUCENT_BLACK</b> (int) static
	 * <p>
	 * The translucent black status bar style. This style provides some level of transparency to the device background.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int TRANSLUCENT_BLACK() /*-{
		return Titanium.UI.iPhone.StatusBar.TRANSLUCENT_BLACK;
	}-*/;
}
