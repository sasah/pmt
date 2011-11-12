package com.pmt.wrap.titanium.android;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Android.MenuItem</b>
 * <p>
 * The Titanium binding of an Android MenuItem
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
public class MenuItem {

	private JavaScriptObject handler;

	public MenuItem(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>enabled</b> (boolean)
	 * <p>
	 * set the enabled state of the item
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native boolean getEnabled() /*-{
		return this.@com.pmt.wrap.titanium.android.MenuItem::handler.enabled;
	}-*/;

	/**
	 * <b>enabled</b> (boolean)
	 * <p>
	 * set the enabled state of the item
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setEnabled(boolean enabled) /*-{
		this.@com.pmt.wrap.titanium.android.MenuItem::handler.enabled = enabled;
	}-*/;

	/**
	 * <b>groupId</b> (int)
	 * <p>
	 * groupId for this item (Read-only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getGroupId() /*-{
		return this.@com.pmt.wrap.titanium.android.MenuItem::handler.groupId;
	}-*/;

	/**
	 * <b>groupId</b> (int)
	 * <p>
	 * groupId for this item (Read-only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setGroupId(int groupId) /*-{
		this.@com.pmt.wrap.titanium.android.MenuItem::handler.groupId = groupId;
	}-*/;

	/**
	 * <b>itemId</b> (int)
	 * <p>
	 * itemId for this item (Read-only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getItemId() /*-{
		return this.@com.pmt.wrap.titanium.android.MenuItem::handler.itemId;
	}-*/;

	/**
	 * <b>itemId</b> (int)
	 * <p>
	 * itemId for this item (Read-only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setItemId(int itemId) /*-{
		this.@com.pmt.wrap.titanium.android.MenuItem::handler.itemId = itemId;
	}-*/;

	/**
	 * <b>order</b> (int)
	 * <p>
	 * integer used for controlling sort order (Read-only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getOrder() /*-{
		return this.@com.pmt.wrap.titanium.android.MenuItem::handler.order;
	}-*/;

	/**
	 * <b>order</b> (int)
	 * <p>
	 * integer used for controlling sort order (Read-only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setOrder(int order) /*-{
		this.@com.pmt.wrap.titanium.android.MenuItem::handler.order = order;
	}-*/;

	/**
	 * <b>title</b> (string)
	 * <p>
	 * item title
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native String getTitle() /*-{
		return this.@com.pmt.wrap.titanium.android.MenuItem::handler.title;
	}-*/;

	/**
	 * <b>title</b> (string)
	 * <p>
	 * item title
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setTitle(String title) /*-{
		this.@com.pmt.wrap.titanium.android.MenuItem::handler.title = title;
	}-*/;

	/**
	 * <b>titleCondensed</b> (string)
	 * <p>
	 * condensed item title
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native String getTitleCondensed() /*-{
		return this.@com.pmt.wrap.titanium.android.MenuItem::handler.titleCondensed;
	}-*/;

	/**
	 * <b>titleCondensed</b> (string)
	 * <p>
	 * condensed item title
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setTitleCondensed(String titleCondensed) /*-{
		this.@com.pmt.wrap.titanium.android.MenuItem::handler.titleCondensed = titleCondensed;
	}-*/;

	/**
	 * <b>visible</b> (boolean)
	 * <p>
	 * set the visible state of the item
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native boolean getVisible() /*-{
		return this.@com.pmt.wrap.titanium.android.MenuItem::handler.visible;
	}-*/;

	/**
	 * <b>visible</b> (boolean)
	 * <p>
	 * set the visible state of the item
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setVisible(boolean visible) /*-{
		this.@com.pmt.wrap.titanium.android.MenuItem::handler.visible = visible;
	}-*/;

	/**
	 * <b>getCondensedTitle</b>
	 * <p>
	 * retrieve the condensed title of the item
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @return string
	 */
	 public native String getCondensedTitle() /*-{
		return this.@com.pmt.wrap.titanium.android.MenuItem::handler.getCondensedTitle();
	}-*/;

	/**
	 * <b>getGroupId</b>
	 * <p>
	 * retrieve the groupId for this item
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @return int
	 */
	 public native int getGroupIdMethod() /*-{
		return this.@com.pmt.wrap.titanium.android.MenuItem::handler.getGroupId();
	}-*/;

	/**
	 * <b>getItemId</b>
	 * <p>
	 * retrieve the itemId for this item
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @return int
	 */
	 public native int getItemIdMethod() /*-{
		return this.@com.pmt.wrap.titanium.android.MenuItem::handler.getItemId();
	}-*/;

	/**
	 * <b>getOrder</b>
	 * <p>
	 * retrieve the sort order
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @return int
	 */
	 public native int getOrderMethod() /*-{
		return this.@com.pmt.wrap.titanium.android.MenuItem::handler.getOrder();
	}-*/;

	/**
	 * <b>getTitle</b>
	 * <p>
	 * retrieve the title of the item
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @return string
	 */
	 public native String getTitleMethod() /*-{
		return this.@com.pmt.wrap.titanium.android.MenuItem::handler.getTitle();
	}-*/;

	/**
	 * <b>isEnabled</b>
	 * <p>
	 * retrieve the enabled state of the menu
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @return boolean
	 */
	 public native boolean isEnabled() /*-{
		return this.@com.pmt.wrap.titanium.android.MenuItem::handler.isEnabled();
	}-*/;

	/**
	 * <b>isVisible</b>
	 * <p>
	 * retrieve the visible state of the menu
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @return boolean
	 */
	 public native boolean isVisible() /*-{
		return this.@com.pmt.wrap.titanium.android.MenuItem::handler.isVisible();
	}-*/;

	/**
	 * <b>setCondensedTitle</b>
	 * <p>
	 * set the condensed title for the item
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param condensedTitle (string) new condensed title
	 * @return void
	 */
	 public native void setCondensedTitle(String condensedTitle) /*-{
		this.@com.pmt.wrap.titanium.android.MenuItem::handler.setCondensedTitle(condensedTitle);
	}-*/;

	/**
	 * <b>setEnabled</b>
	 * <p>
	 * set the enabled state of the item
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param enabled (boolean) true to enable item, false to disable
	 * @return void
	 */
	 public native void setEnabledMethod(boolean enabled) /*-{
		this.@com.pmt.wrap.titanium.android.MenuItem::handler.setEnabled(enabled);
	}-*/;

	/**
	 * <b>setIcon</b>
	 * <p>
	 * set the icon for the item
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param icon (object) icon to use with the item
	 * @return void
	 */
	 public native void setIcon(JavaScriptObject icon) /*-{
		this.@com.pmt.wrap.titanium.android.MenuItem::handler.setIcon(icon);
	}-*/;

	/**
	 * <b>setTitle</b>
	 * <p>
	 * set the title for the item
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param title (string) new title
	 * @return void
	 */
	 public native void setTitleMethod(String title) /*-{
		this.@com.pmt.wrap.titanium.android.MenuItem::handler.setTitle(title);
	}-*/;

	/**
	 * <b>setVisible</b>
	 * <p>
	 * set the visible state of the item
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param visible (boolean) true to show the item, false to hide
	 * @return void
	 */
	 public native void setVisibleMethod(boolean visible) /*-{
		this.@com.pmt.wrap.titanium.android.MenuItem::handler.setVisible(visible);
	}-*/;
	

	/**
	 * <b>click</b>
	 * <p>
	 * fired when the user presses the button
	 * @param click event handler
	 */
	public native void addClick(com.pmt.wrap.titanium.sys.events.TitaniumAndroidMenuItemClickHandler click) /*-{
		this.@com.pmt.wrap.titanium.android.MenuItem::handler.addEventListener('click', function(source, type) {
			click.@com.pmt.wrap.titanium.sys.events.TitaniumAndroidMenuItemClickHandler::click(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type);
		});
	}-*/;
}
