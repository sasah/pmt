package com.pmt.wrap.titanium.android;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Android.Menu</b>
 * <p>
 * The Titanium binding of an Android Menu
 * <p>
 * <b>Platforms:</b> android 
 * <p>
 * <b>Since:</b> 1.5
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class Menu {

	private JavaScriptObject handler;

	public Menu(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>items</b> (array)
	 * <p>
	 * array of Titanium.Android.MenuItem
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native JavaScriptObject getItems() /*-{
		return this.@com.pmt.wrap.titanium.android.Menu::handler.items;
	}-*/;

	/**
	 * <b>items</b> (array)
	 * <p>
	 * array of Titanium.Android.MenuItem
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setItems(JavaScriptObject items) /*-{
		this.@com.pmt.wrap.titanium.android.Menu::handler.items = items;
	}-*/;

	/**
	 * <b>add</b>
	 * <p>
	 * creates a Titanium.Android.MenuItem from the passed creation options.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param options (object) creation options. Supported options are itemId, groupId, title, and order.
	 * @return <a href="Titanium.Android.MenuItem.html">Titanium.Android.MenuItem</a>
	 */
	 public native JavaScriptObject add(JavaScriptObject options) /*-{
		return this.@com.pmt.wrap.titanium.android.Menu::handler.add(options);
	}-*/;

	/**
	 * <b>clear</b>
	 * <p>
	 * clear all items from the menu. You should release all references you have retained to Titanium.Android.MenuItem previously created.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @return void
	 */
	 public native void clear() /*-{
		return this.@com.pmt.wrap.titanium.android.Menu::handler.clear();
	}-*/;

	/**
	 * <b>close</b>
	 * <p>
	 * close the menu if visible
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @return void
	 */
	 public native void close() /*-{
		return this.@com.pmt.wrap.titanium.android.Menu::handler.close();
	}-*/;

	/**
	 * <b>findItem</b>
	 * <p>
	 * locate a Titanium.Android.MenuItem
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param item (object) integer itemId or Titanium.Android.MenuItem
	 * @return <a href="Titanium.Android.MenuItem.html">Titanium.Android.MenuItem</a>
	 */
	 public native JavaScriptObject findItem(JavaScriptObject item) /*-{
		return this.@com.pmt.wrap.titanium.android.Menu::handler.findItem(item);
	}-*/;

	/**
	 * <b>getItem</b>
	 * <p>
	 * return the Titanium.Android.MenuItem at a specific index
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param index (int) item at index where index < size()
	 * @return <a href="Titanium.Android.MenuItem.html">Titanium.Android.MenuItem</a>
	 */
	 public native JavaScriptObject getItem(int index) /*-{
		return this.@com.pmt.wrap.titanium.android.Menu::handler.getItem(index);
	}-*/;

	/**
	 * <b>hasVisibleItems</b>
	 * <p>
	 * query for any visible menu items
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @return boolean
	 */
	 public native boolean hasVisibleItems() /*-{
		return this.@com.pmt.wrap.titanium.android.Menu::handler.hasVisibleItems();
	}-*/;

	/**
	 * <b>removeGroup</b>
	 * <p>
	 * remove all Titanium.Android.MenuItem with the specified groupId
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param groupId (int) groupId of items to remove.
	 * @return void
	 */
	 public native void removeGroup(int groupId) /*-{
		return this.@com.pmt.wrap.titanium.android.Menu::handler.removeGroup(groupId);
	}-*/;

	/**
	 * <b>removeItem</b>
	 * <p>
	 * remove a specific Titanium.Android.MenuItem by the specified itemId
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param itemId (int) itemId of item to remove.
	 * @return void
	 */
	 public native void removeItem(int itemId) /*-{
		return this.@com.pmt.wrap.titanium.android.Menu::handler.removeItem(itemId);
	}-*/;

	/**
	 * <b>setGroupEnabled</b>
	 * <p>
	 * enable or disable a group of Titanium.Android.MenuItem by groupId
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param groupId (int) groupId to enable or disable
	 * @param enabled (boolean) true to enable, false to disable.
	 * @return void
	 */
	 public native void setGroupEnabled(int groupId, boolean enabled) /*-{
		return this.@com.pmt.wrap.titanium.android.Menu::handler.setGroupEnabled(groupId, enabled);
	}-*/;

	/**
	 * <b>setGroupVisible</b>
	 * <p>
	 * show or hide a group of Titanium.Android.MenuItem by groupId
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param groupId (int) groupId to enable or disable
	 * @param visible (boolean) true to show, false to hide
	 * @return void
	 */
	 public native void setGroupVisible(int groupId, boolean visible) /*-{
		return this.@com.pmt.wrap.titanium.android.Menu::handler.setGroupVisible(groupId, visible);
	}-*/;

	/**
	 * <b>size</b>
	 * <p>
	 * number of Titanium.Android.MenuItem in this menu
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @return int
	 */
	 public native int size() /*-{
		return this.@com.pmt.wrap.titanium.android.Menu::handler.size();
	}-*/;
}
