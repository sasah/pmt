package com.pmt.wrap.titanium.ui.iphone;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.iPhone.SystemButtonStyle</b>
 * <p>
 * A set of constants for the system button styles that can be used for the button style property.
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
public class SystemButtonStyle {

	private JavaScriptObject handler;

	public SystemButtonStyle(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>BAR</b> (int) static
	 * <p>
	 * Used by tabbed bar and button bar only to use the more condensed style used in nav bars and tool bars.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int BAR() /*-{
		return Titanium.UI.iPhone.SystemButtonStyle.BAR;
	}-*/;

	/**
	 * <b>BORDERED</b> (int) static
	 * <p>
	 * A simple button style with a border.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int BORDERED() /*-{
		return Titanium.UI.iPhone.SystemButtonStyle.BORDERED;
	}-*/;

	/**
	 * <b>DONE</b> (int) static
	 * <p>
	 * The style for a done button - for example, a button that completes some task and returns to the previous view.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int DONE() /*-{
		return Titanium.UI.iPhone.SystemButtonStyle.DONE;
	}-*/;

	/**
	 * <b>PLAIN</b> (int) static
	 * <p>
	 * Glows when tapped. The default item style.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int PLAIN() /*-{
		return Titanium.UI.iPhone.SystemButtonStyle.PLAIN;
	}-*/;
}
