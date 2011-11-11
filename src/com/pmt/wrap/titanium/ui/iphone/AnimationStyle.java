package com.pmt.wrap.titanium.ui.iphone;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.iPhone.AnimationStyle</b>
 * <p>
 * A set of constants for the Animation Styles used for transitions.
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
public class AnimationStyle {

	private JavaScriptObject handler;

	public AnimationStyle(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>CURL_DOWN</b> (int) static
	 * <p>
	 * Curl downwards during a transition animation
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int CURL_DOWN() /*-{
		return Titanium.UI.iPhone.AnimationStyle.CURL_DOWN;
	}-*/;

	/**
	 * <b>CURL_UP</b> (int) static
	 * <p>
	 * Curl upwards during a transition animation
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int CURL_UP() /*-{
		return Titanium.UI.iPhone.AnimationStyle.CURL_UP;
	}-*/;

	/**
	 * <b>FLIP_FROM_LEFT</b> (int) static
	 * <p>
	 * Flip from left to right during a transition animation
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int FLIP_FROM_LEFT() /*-{
		return Titanium.UI.iPhone.AnimationStyle.FLIP_FROM_LEFT;
	}-*/;

	/**
	 * <b>FLIP_FROM_RIGHT</b> (int) static
	 * <p>
	 * Flip from right to left during a transition animation
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int FLIP_FROM_RIGHT() /*-{
		return Titanium.UI.iPhone.AnimationStyle.FLIP_FROM_RIGHT;
	}-*/;

	/**
	 * <b>NONE</b> (int) static
	 * <p>
	 * No animation
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int NONE() /*-{
		return Titanium.UI.iPhone.AnimationStyle.NONE;
	}-*/;
}
