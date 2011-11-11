package com.pmt.wrap.titanium.ui.iphone;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.iPhone.TableViewCellSelectionStyle</b>
 * <p>
 * A set of constants for the style that can be used for the selectionStyle property of Titanium.UI.TableViewRow.
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
public class TableViewCellSelectionStyle {

	private JavaScriptObject handler;

	public TableViewCellSelectionStyle(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>BLUE</b> (int) static
	 * <p>
	 * The cell when selected has a blue background. This is the default value.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int BLUE() /*-{
		return Titanium.UI.iPhone.TableViewCellSelectionStyle.BLUE;
	}-*/;

	/**
	 * <b>GRAY</b> (int) static
	 * <p>
	 * Then cell when selected has a gray background.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int GRAY() /*-{
		return Titanium.UI.iPhone.TableViewCellSelectionStyle.GRAY;
	}-*/;

	/**
	 * <b>NONE</b> (int) static
	 * <p>
	 * The cell has no distinct style for when it is selected.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int NONE() /*-{
		return Titanium.UI.iPhone.TableViewCellSelectionStyle.NONE;
	}-*/;
}
