package com.pmt.wrap.titanium.ui.iphone;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.iPhone.ScrollIndicatorStyle</b>
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
public class ScrollIndicatorStyle {

	private JavaScriptObject handler;

	public ScrollIndicatorStyle(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>BLACK</b> (int) static
	 * <p>
	 * A style of indicator which is black smaller than the default style. This style is good against a white content background.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int BLACK() /*-{
		return Titanium.UI.iPhone.ScrollIndicatorStyle.BLACK;
	}-*/;

	/**
	 * <b>DEFAULT</b> (int) static
	 * <p>
	 * The default style of scroll indicator, which is black with a white border. This style is good against any content background.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int DEFAULT() /*-{
		return Titanium.UI.iPhone.ScrollIndicatorStyle.DEFAULT;
	}-*/;

	/**
	 * <b>WHITE</b> (int) static
	 * <p>
	 * A style of indicator is white and smaller than the default style. This style is good against a black content background.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int WHITE() /*-{
		return Titanium.UI.iPhone.ScrollIndicatorStyle.WHITE;
	}-*/;
}
