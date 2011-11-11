package com.pmt.wrap.titanium.ui.iphone;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.iPhone.TableViewScrollPosition</b>
 * <p>
 * A set of constants for the position value that can be used for the position property of Titanium.UI.TableView when invoking scrollToIndex.
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
public class TableViewScrollPosition {

	private JavaScriptObject handler;

	public TableViewScrollPosition(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>BOTTOM</b> (int) static
	 * <p>
	 * The table view scrolls the row of interest to the bottom of the visible table view.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int BOTTOM() /*-{
		return Titanium.UI.iPhone.TableViewScrollPosition.BOTTOM;
	}-*/;

	/**
	 * <b>MIDDLE</b> (int) static
	 * <p>
	 * The table view scrolls the row of interest to the middle of the visible table view.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int MIDDLE() /*-{
		return Titanium.UI.iPhone.TableViewScrollPosition.MIDDLE;
	}-*/;

	/**
	 * <b>NONE</b> (int) static
	 * <p>
	 * The table view scrolls the row of interest to be fully visible with a minimum of movement. If the row is already fully visible, no scrolling occurs. For example, if the row is above the visible area, the behavior is identical to that specified by TOP. This is the default.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int NONE() /*-{
		return Titanium.UI.iPhone.TableViewScrollPosition.NONE;
	}-*/;

	/**
	 * <b>TOP</b> (int) static
	 * <p>
	 * The table view scrolls the row of interest to the top of the visible table view.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int TOP() /*-{
		return Titanium.UI.iPhone.TableViewScrollPosition.TOP;
	}-*/;
}
