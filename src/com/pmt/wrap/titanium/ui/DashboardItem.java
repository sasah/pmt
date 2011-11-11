package com.pmt.wrap.titanium.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.DashboardItem</b>
 * <p>
 * An item that represents a visual icon in the Titanium.UI.DashboardView. The Dashboard Item is created by the method Titanium.UI.createDashboardItem.
 * <p>
 * <b>Platforms:</b> iphone ipad 
 * <p>
 * <b>Since:</b> 1.2
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> proxy
 * <p>
 * <b>Returns:</b> null
 */
public class DashboardItem {

	private JavaScriptObject handler;

	public DashboardItem(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>badge</b> (int)
	 * <p>
	 * the badge value or 0 to remove the badge
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native int getBadge() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardItem::handler.badge;
	}-*/;

	/**
	 * <b>badge</b> (int)
	 * <p>
	 * the badge value or 0 to remove the badge
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setBadge(int badge) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardItem::handler.badge = badge;
	}-*/;

	/**
	 * <b>canDelete</b> (boolean)
	 * <p>
	 * a boolean to indicate if this item can be deleted when it edit mode
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native boolean getCanDelete() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardItem::handler.canDelete;
	}-*/;

	/**
	 * <b>canDelete</b> (boolean)
	 * <p>
	 * a boolean to indicate if this item can be deleted when it edit mode
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setCanDelete(boolean canDelete) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardItem::handler.canDelete = canDelete;
	}-*/;

	/**
	 * <b>image</b> (string)
	 * <p>
	 * the URL to the image
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native String getImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardItem::handler.image;
	}-*/;

	/**
	 * <b>image</b> (string)
	 * <p>
	 * the URL to the image
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setImage(String image) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardItem::handler.image = image;
	}-*/;

	/**
	 * <b>selectedImage</b> (string)
	 * <p>
	 * the URL to the image to display when the item is depressed (clicked)
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native String getSelectedImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardItem::handler.selectedImage;
	}-*/;

	/**
	 * <b>selectedImage</b> (string)
	 * <p>
	 * the URL to the image to display when the item is depressed (clicked)
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setSelectedImage(String selectedImage) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardItem::handler.selectedImage = selectedImage;
	}-*/;

	/**
	 * <b>addEventListener</b>
	 * <p>
	 * add an event listener for the instance to receive view triggered events
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public native void addEventListener(String name, JavaScriptObject callback) /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardItem::handler.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public native void fireEvent(String name, JavaScriptObject event) /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardItem::handler.fireEvent(name, event);
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public native void removeEventListener(String name, JavaScriptObject callback) /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardItem::handler.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>click</b>
	 * <p>
	 * fired when a Titanium.UI.DashboardItem is clicked
	 */
	public interface ClickHandler {
		/**
		 * <b>click</b>
		 * <p>
		 * fired when a Titanium.UI.DashboardItem is clicked
		 * @param source the source object that fired the event
		 * @param location the location object with the properties x and y of where in the parent view the click was
		 * @param item the Titanium.UI.DashboardItem that was clicked
		 * @param type the name of the event fired
		 */
		void click(JavaScriptObject source, JavaScriptObject location, JavaScriptObject item, JavaScriptObject type);
	}

	/**
	 * <b>click</b>
	 * <p>
	 * fired when a Titanium.UI.DashboardItem is clicked
	 * @param click event handler
	 */
	public native void addClick(ClickHandler click) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardItem::handler.addEventListener('click', function(source, location, item, type) {
			click.@com.pmt.wrap.titanium.ui.DashboardItem.ClickHandler::click(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, location, item, type);
		});
	}-*/;

	/**
	 * <b>delete</b>
	 * <p>
	 * fired when a  Titanium.UI.DashboardItem is deleted during editings
	 */
	public interface DeleteHandler {
		/**
		 * <b>delete</b>
		 * <p>
		 * fired when a  Titanium.UI.DashboardItem is deleted during editings
		 * @param source the source object that fired the event
		 * @param item the Titanium.UI.DashboardItem that was deleted
		 * @param type the name of the event fired
		 */
		void delete(JavaScriptObject source, JavaScriptObject item, JavaScriptObject type);
	}

	/**
	 * <b>delete</b>
	 * <p>
	 * fired when a  Titanium.UI.DashboardItem is deleted during editings
	 * @param deleteEvent event handler
	 */
	public native void addDelete(DeleteHandler deleteEvent) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardItem::handler.addEventListener('delete', function(source, item, type) {
			deleteEvent.@com.pmt.wrap.titanium.ui.DashboardItem.DeleteHandler::delete(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, item, type);
		});
	}-*/;

	/**
	 * <b>move</b>
	 * <p>
	 * fired when a  Titanium.UI.DashboardItem is moved during editing
	 */
	public interface MoveHandler {
		/**
		 * <b>move</b>
		 * <p>
		 * fired when a  Titanium.UI.DashboardItem is moved during editing
		 * @param source the source object that fired the event
		 * @param items the pending data array in the new order (uncommitted)
		 * @param item the Titanium.UI.DashboardItem that was moved
		 * @param type the name of the event fired
		 */
		void move(JavaScriptObject source, JavaScriptObject items, JavaScriptObject item, JavaScriptObject type);
	}

	/**
	 * <b>move</b>
	 * <p>
	 * fired when a  Titanium.UI.DashboardItem is moved during editing
	 * @param move event handler
	 */
	public native void addMove(MoveHandler move) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardItem::handler.addEventListener('move', function(source, items, item, type) {
			move.@com.pmt.wrap.titanium.ui.DashboardItem.MoveHandler::move(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, items, item, type);
		});
	}-*/;
}
