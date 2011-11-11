package com.pmt.wrap.titanium.ui.iphone;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.iPhone.TableViewStyle</b>
 * <p>
 * A set of constants for the style that can be used for the button style property of Titanium.UI.TableView.
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
public class TableViewStyle {

	private JavaScriptObject handler;

	public TableViewStyle(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>GROUPED</b> (int) static
	 * <p>
	 * A table view whose sections present distinct groups of rows. The section headers and footers do not float.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int GROUPED() /*-{
		return Titanium.UI.iPhone.TableViewStyle.GROUPED;
	}-*/;

	/**
	 * <b>PLAIN</b> (int) static
	 * <p>
	 * A plain table view. Any section headers or footers are displayed as inline separators and float when the table view is scrolled.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int PLAIN() /*-{
		return Titanium.UI.iPhone.TableViewStyle.PLAIN;
	}-*/;
}
