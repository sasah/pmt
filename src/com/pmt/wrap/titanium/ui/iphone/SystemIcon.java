package com.pmt.wrap.titanium.ui.iphone;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.iPhone.SystemIcon</b>
 * <p>
 * A set of constants for the system icon styles that can be used on a tab group tab.
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
public class SystemIcon {

	private JavaScriptObject handler;

	public SystemIcon(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>BOOKMARKS</b> (int) static
	 * <p>
	 * Bookmark style icon
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int BOOKMARKS() /*-{
		return Titanium.UI.iPhone.SystemIcon.BOOKMARKS;
	}-*/;

	/**
	 * <b>CONTACTS</b> (int) static
	 * <p>
	 * Contacts style icon
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int CONTACTS() /*-{
		return Titanium.UI.iPhone.SystemIcon.CONTACTS;
	}-*/;

	/**
	 * <b>DOWNLOADS</b> (int) static
	 * <p>
	 * Downloads style icon
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int DOWNLOADS() /*-{
		return Titanium.UI.iPhone.SystemIcon.DOWNLOADS;
	}-*/;

	/**
	 * <b>FAVORITES</b> (int) static
	 * <p>
	 * Favorites style icon
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int FAVORITES() /*-{
		return Titanium.UI.iPhone.SystemIcon.FAVORITES;
	}-*/;

	/**
	 * <b>FEATURED</b> (int) static
	 * <p>
	 * Featured style icon
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int FEATURED() /*-{
		return Titanium.UI.iPhone.SystemIcon.FEATURED;
	}-*/;

	/**
	 * <b>HISTORY</b> (int) static
	 * <p>
	 * History style icon
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int HISTORY() /*-{
		return Titanium.UI.iPhone.SystemIcon.HISTORY;
	}-*/;

	/**
	 * <b>MORE</b> (int) static
	 * <p>
	 * More style icon
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int MORE() /*-{
		return Titanium.UI.iPhone.SystemIcon.MORE;
	}-*/;

	/**
	 * <b>MOST_RECENT</b> (int) static
	 * <p>
	 * Most recent style icon
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int MOST_RECENT() /*-{
		return Titanium.UI.iPhone.SystemIcon.MOST_RECENT;
	}-*/;

	/**
	 * <b>MOST_VIEWED</b> (int) static
	 * <p>
	 * Most viewed style icon
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int MOST_VIEWED() /*-{
		return Titanium.UI.iPhone.SystemIcon.MOST_VIEWED;
	}-*/;

	/**
	 * <b>RECENTS</b> (int) static
	 * <p>
	 * Recents style icon
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int RECENTS() /*-{
		return Titanium.UI.iPhone.SystemIcon.RECENTS;
	}-*/;

	/**
	 * <b>SEARCH</b> (int) static
	 * <p>
	 * Search style icon
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int SEARCH() /*-{
		return Titanium.UI.iPhone.SystemIcon.SEARCH;
	}-*/;

	/**
	 * <b>TOP_RATED</b> (int) static
	 * <p>
	 * Top rated style icon
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int TOP_RATED() /*-{
		return Titanium.UI.iPhone.SystemIcon.TOP_RATED;
	}-*/;
}
