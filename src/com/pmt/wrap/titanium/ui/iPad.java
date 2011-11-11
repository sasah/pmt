package com.pmt.wrap.titanium.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.iPad</b>
 * <p>
 * The iPad specific UI capabilities.  All properties, methods and events in this namespace will only work on the Apple iPad related devices.  To develop for iPad, you will need the Apple iPhone SDK 3.2 or later and Titanium Mobile SDK 1.2 or later. For iPad UI programming guidelines, please review the iPad Human Interface Guidelines. 
 * <p>
 * <b>Platforms:</b> ipad 
 * <p>
 * <b>Since:</b> 1.2
 * <p>
 * <b>Type:</b> module
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> object
 */
public class iPad {

	private JavaScriptObject handler;

	public iPad(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>POPOVER_ARROW_DIRECTION_ANY</b> (int) static
	 * <p>
	 * An arrow that points in any direction.
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public static native int POPOVER_ARROW_DIRECTION_ANY() /*-{
		return Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_ANY;
	}-*/;

	/**
	 * <b>POPOVER_ARROW_DIRECTION_DOWN</b> (int) static
	 * <p>
	 * An arrow that points downward.
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public static native int POPOVER_ARROW_DIRECTION_DOWN() /*-{
		return Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_DOWN;
	}-*/;

	/**
	 * <b>POPOVER_ARROW_DIRECTION_LEFT</b> (int) static
	 * <p>
	 * An arrow that points toward the left.
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public static native int POPOVER_ARROW_DIRECTION_LEFT() /*-{
		return Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_LEFT;
	}-*/;

	/**
	 * <b>POPOVER_ARROW_DIRECTION_RIGHT</b> (int) static
	 * <p>
	 * An arrow that points toward the right.
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public static native int POPOVER_ARROW_DIRECTION_RIGHT() /*-{
		return Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_RIGHT;
	}-*/;

	/**
	 * <b>POPOVER_ARROW_DIRECTION_UNKNOWN</b> (int) static
	 * <p>
	 * The status of the arrow is currently unknown.
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public static native int POPOVER_ARROW_DIRECTION_UNKNOWN() /*-{
		return Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_UNKNOWN;
	}-*/;

	/**
	 * <b>POPOVER_ARROW_DIRECTION_UP</b> (int) static
	 * <p>
	 * An arrow that points upward.
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public static native int POPOVER_ARROW_DIRECTION_UP() /*-{
		return Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_UP;
	}-*/;

	/**
	 * <b>addEventListener</b>
	 * <p>
	 * add an event listener for the instance to receive view triggered events
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public static native void addEventListener(String name, JavaScriptObject callback) /*-{
		return Titanium.UI.iPad.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>createPopover</b>
	 * <p>
	 * create and return an instance of Titanium.UI.iPad.Popover
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.iPad.Popover
	 * @return object
	 */
	 public static native JavaScriptObject createPopover(JavaScriptObject parameters) /*-{
		return Titanium.UI.iPad.createPopover(parameters);
	}-*/;

	/**
	 * <b>createSplitWindow</b>
	 * <p>
	 * create and return an instance of Titanium.UI.iPad.SplitWindow
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.iPad.SplitWindow
	 * @return object
	 */
	 public static native JavaScriptObject createSplitWindow(JavaScriptObject parameters) /*-{
		return Titanium.UI.iPad.createSplitWindow(parameters);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public static native void fireEvent(String name, JavaScriptObject event) /*-{
		return Titanium.UI.iPad.fireEvent(name, event);
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public static native void removeEventListener(String name, JavaScriptObject callback) /*-{
		return Titanium.UI.iPad.removeEventListener(name, callback);
	}-*/;
}
