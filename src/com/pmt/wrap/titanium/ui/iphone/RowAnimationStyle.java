package com.pmt.wrap.titanium.ui.iphone;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.iPhone.RowAnimationStyle</b>
 * <p>
 * A set of constants for the Animation Styles used for transition on table view rows.
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
public class RowAnimationStyle {

	private JavaScriptObject handler;

	public RowAnimationStyle(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>BOTTOM</b> (int) static
	 * <p>
	 * The inserted row or rows slides in from the bottom; the deleted row or rows slides out toward the bottom.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int BOTTOM() /*-{
		return Titanium.UI.iPhone.RowAnimationStyle.BOTTOM;
	}-*/;

	/**
	 * <b>FADE</b> (int) static
	 * <p>
	 * The inserted or deleted row or rows fades into or out of the table view.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int FADE() /*-{
		return Titanium.UI.iPhone.RowAnimationStyle.FADE;
	}-*/;

	/**
	 * <b>LEFT</b> (int) static
	 * <p>
	 * The inserted row or rows slides in from the left; the deleted row or rows slides out to the left.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int LEFT() /*-{
		return Titanium.UI.iPhone.RowAnimationStyle.LEFT;
	}-*/;

	/**
	 * <b>NONE</b> (int) static
	 * <p>
	 * No animation is performed. The new cell value appears as if the cell had just been reloaded.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int NONE() /*-{
		return Titanium.UI.iPhone.RowAnimationStyle.NONE;
	}-*/;

	/**
	 * <b>RIGHT</b> (int) static
	 * <p>
	 * The inserted row or rows slides in from the right; the deleted row or rows slides out to the right.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int RIGHT() /*-{
		return Titanium.UI.iPhone.RowAnimationStyle.RIGHT;
	}-*/;

	/**
	 * <b>TOP</b> (int) static
	 * <p>
	 * The inserted row or rows slides in from the top; the deleted row or rows slides out toward the top.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int TOP() /*-{
		return Titanium.UI.iPhone.RowAnimationStyle.TOP;
	}-*/;
}
