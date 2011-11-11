package com.pmt.wrap.titanium.ui.iphone;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.iPhone.TableViewSeparatorStyle</b>
 * <p>
 * A set of constants for the style that can be used for the separatorStyle property of Titanium.UI.TableView.
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
public class TableViewSeparatorStyle {

	private JavaScriptObject handler;

	public TableViewSeparatorStyle(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>NONE</b> (int) static
	 * <p>
	 * The separator cell has no distinct style.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int NONE() /*-{
		return Titanium.UI.iPhone.TableViewSeparatorStyle.NONE;
	}-*/;

	/**
	 * <b>SINGLE_LINE</b> (int) static
	 * <p>
	 * The separator cell has a single line running across its width. This is the default value.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int SINGLE_LINE() /*-{
		return Titanium.UI.iPhone.TableViewSeparatorStyle.SINGLE_LINE;
	}-*/;
}
