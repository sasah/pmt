package com.pmt.wrap.titanium.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.iPhone</b>
 * <p>
 * The iPhone/iPad specific UI capabilities.  All properties, methods and events in this namespace will only work on the Apple iPhone or iPad related devices.
 * <p>
 * <b>Platforms:</b> iphone ipad 
 * <p>
 * <b>Since:</b> 0.5
 * <p>
 * <b>Type:</b> module
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> object
 */
public class iPhone {

	private JavaScriptObject handler;

	public iPhone(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>MODAL_PRESENTATION_CURRENT_CONTEXT</b> (int) static
	 * <p>
	 * The view is presented using the same style as its parent window. This is currently only available currently on iPhone/iPad and SDK 3.2+.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.5
	 */
	public static native int MODAL_PRESENTATION_CURRENT_CONTEXT() /*-{
		return Titanium.UI.iPhone.MODAL_PRESENTATION_CURRENT_CONTEXT;
	}-*/;

	/**
	 * <b>MODAL_PRESENTATION_FORMSHEET</b> (int) static
	 * <p>
	 * The width and height of the presented window are smaller than those of the screen and the view is centered on the screen. If the device is in a landscape orientation and the keyboard is visible, the position of the view is adjusted upward so that the view remains visible. All uncovered areas are dimmed to prevent the user from interacting with them. This is currently only available currently on iPhone/iPad and SDK 3.2+.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.5
	 */
	public static native int MODAL_PRESENTATION_FORMSHEET() /*-{
		return Titanium.UI.iPhone.MODAL_PRESENTATION_FORMSHEET;
	}-*/;

	/**
	 * <b>MODAL_PRESENTATION_FULLSCREEN</b> (int) static
	 * <p>
	 * The presented window covers the screen. This is currently only available currently on iPhone/iPad and SDK 3.2+.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.5
	 */
	public static native int MODAL_PRESENTATION_FULLSCREEN() /*-{
		return Titanium.UI.iPhone.MODAL_PRESENTATION_FULLSCREEN;
	}-*/;

	/**
	 * <b>MODAL_PRESENTATION_PAGESHEET</b> (int) static
	 * <p>
	 * The height of the presented window is set to the height of the screen and the view's width is set to the width of the screen in a portrait orientation. Any uncovered areas are dimmed to prevent the user from interacting with them. (In portrait orientations, this option is essentially the same as Titanium.UI.iPhone.MODAL_PRESENTATION_FULLSCREEN). This is currently only available currently on iPhone/iPad and SDK 3.2+.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.5
	 */
	public static native int MODAL_PRESENTATION_PAGESHEET() /*-{
		return Titanium.UI.iPhone.MODAL_PRESENTATION_PAGESHEET;
	}-*/;

	/**
	 * <b>MODAL_TRANSITION_STYLE_COVER_VERTICAL</b> (int) static
	 * <p>
	 * When the window is presented, its view slides up from the bottom of the screen. On dismissal, the view slides back down. This is the default transition style. This is currently only available currently on iPhone/iPad.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.5
	 */
	public static native int MODAL_TRANSITION_STYLE_COVER_VERTICAL() /*-{
		return Titanium.UI.iPhone.MODAL_TRANSITION_STYLE_COVER_VERTICAL;
	}-*/;

	/**
	 * <b>MODAL_TRANSITION_STYLE_CROSS_DISSOLVE</b> (int) static
	 * <p>
	 * When the window is presented, the current view fades out while the new view fades in at the same time. On dismissal, a similar type of cross-fade is used to return to the original view. This is currently only available currently on iPhone/iPad.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.5
	 */
	public static native int MODAL_TRANSITION_STYLE_CROSS_DISSOLVE() /*-{
		return Titanium.UI.iPhone.MODAL_TRANSITION_STYLE_CROSS_DISSOLVE;
	}-*/;

	/**
	 * <b>MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL</b> (int) static
	 * <p>
	 * When the window is presented, the current view initiates a horizontal 3D flip from right-to-left, resulting in the revealing of the new view as if it were on the back of the previous view. On dismissal, the flip occurs from left-to-right, returning to the original view. This is currently only available currently on iPhone/iPad.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.5
	 */
	public static native int MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL() /*-{
		return Titanium.UI.iPhone.MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL;
	}-*/;

	/**
	 * <b>MODAL_TRANSITION_STYLE_PARTIAL_CURL</b> (int) static
	 * <p>
	 * When the window is presented, one corner of the current view curls up to reveal the modal view underneath. On dismissal, the curled up page unfurls itself back on top of the modal view. A modal view presented using this transition is itself prevented from presenting any additional modal views. This transition style is supported only if the window is presenting a Titanium.UI.iPhone.MODAL_PRESENTATION_FULLSCREEN modal presentation style.  This is currently only available currently on iPhone/iPad and SDK 3.2+.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.5
	 */
	public static native int MODAL_TRANSITION_STYLE_PARTIAL_CURL() /*-{
		return Titanium.UI.iPhone.MODAL_TRANSITION_STYLE_PARTIAL_CURL;
	}-*/;

	/**
	 * <b>appBadge</b> (string) static
	 * <p>
	 * set the application badge for the application's icon in the springboard
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.5
	 */
	public static native String getAppBadge() /*-{
		return Titanium.UI.iPhone.appBadge;
	}-*/;

	/**
	 * <b>appBadge</b> (string) static
	 * <p>
	 * set the application badge for the application's icon in the springboard
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.5
	 */
	public static native void setAppBadge(String appBadge) /*-{
		Titanium.UI.iPhone.appBadge = appBadge;
	}-*/;

	/**
	 * <b>appSupportsShakeToEdit</b> (boolean) static
	 * <p>
	 * control whether the shake to edit system wide capability is enabled
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.5
	 */
	public static native boolean getAppSupportsShakeToEdit() /*-{
		return Titanium.UI.iPhone.appSupportsShakeToEdit;
	}-*/;

	/**
	 * <b>appSupportsShakeToEdit</b> (boolean) static
	 * <p>
	 * control whether the shake to edit system wide capability is enabled
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.5
	 */
	public static native void setAppSupportsShakeToEdit(boolean appSupportsShakeToEdit) /*-{
		Titanium.UI.iPhone.appSupportsShakeToEdit = appSupportsShakeToEdit;
	}-*/;

	/**
	 * <b>statusBarHidden</b> (boolean) static
	 * <p>
	 * control the status bar visibility
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.5
	 */
	public static native boolean getStatusBarHidden() /*-{
		return Titanium.UI.iPhone.statusBarHidden;
	}-*/;

	/**
	 * <b>statusBarHidden</b> (boolean) static
	 * <p>
	 * control the status bar visibility
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.5
	 */
	public static native void setStatusBarHidden(boolean statusBarHidden) /*-{
		Titanium.UI.iPhone.statusBarHidden = statusBarHidden;
	}-*/;

	/**
	 * <b>statusBarStyle</b> (int) static
	 * <p>
	 * constant that controls the status bar color style
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.5
	 */
	public static native int getStatusBarStyle() /*-{
		return Titanium.UI.iPhone.statusBarStyle;
	}-*/;

	/**
	 * <b>statusBarStyle</b> (int) static
	 * <p>
	 * constant that controls the status bar color style
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.5
	 */
	public static native void setStatusBarStyle(int statusBarStyle) /*-{
		Titanium.UI.iPhone.statusBarStyle = statusBarStyle;
	}-*/;

	/**
	 * <b>addEventListener</b>
	 * <p>
	 * add an event listener for the instance to receive view triggered events
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.5
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public static native void addEventListener(String name, JavaScriptObject callback) /*-{
		Titanium.UI.iPhone.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>createNavigationGroup</b>
	 * <p>
	 * create and return an instance of Titanium.UI.iPhone.NavigationGroup
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.5
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.iPhone.NavigationGroup
	 * @return object
	 */
	 public static native JavaScriptObject createNavigationGroup(JavaScriptObject parameters) /*-{
		return Titanium.UI.iPhone.createNavigationGroup(parameters);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.5
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public static native void fireEvent(String name, JavaScriptObject event) /*-{
		Titanium.UI.iPhone.fireEvent(name, event);
	}-*/;

	/**
	 * <b>hideStatusBar</b>
	 * <p>
	 * convenience method to hide the status bar
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.5
	 * @param animated (boolean) boolean to indicate if the action should be animated
	 * @param animationStyle (int) the animation style
	 * @return void
	 */
	 public static native void hideStatusBar(boolean animated, int animationStyle) /*-{
		Titanium.UI.iPhone.hideStatusBar(animated, animationStyle);
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.5
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public static native void removeEventListener(String name, JavaScriptObject callback) /*-{
		Titanium.UI.iPhone.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>showStatusBar</b>
	 * <p>
	 * convenience method to show the status bar
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.5
	 * @param animated (boolean) boolean to indicate if the action should be animated
	 * @param animationStyle (int) the animation style
	 * @return void
	 */
	 public static native void showStatusBar(boolean animated, int animationStyle) /*-{
		Titanium.UI.iPhone.showStatusBar(animated, animationStyle);
	}-*/;
}
