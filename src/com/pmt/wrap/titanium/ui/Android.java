package com.pmt.wrap.titanium.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.Android</b>
 * <p>
 * The Android specific UI capabilities. All properties, methods and events in this namespace will only work on Android related devices.
 * <p>
 * <b>Platforms:</b> android 
 * <p>
 * <b>Since:</b> 1.0
 * <p>
 * <b>Type:</b> module
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> object
 */
public class Android {

	private JavaScriptObject handler;

	public Android(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>LINKIFY_ALL</b> (int) static
	 * <p>
	 * Auto link all supported types.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.0
	 */
	public static native int LINKIFY_ALL() /*-{
		return Titanium.UI.Android.LINKIFY_ALL;
	}-*/;

	/**
	 * <b>LINKIFY_EMAIL_ADDRESSES</b> (int) static
	 * <p>
	 * Auto link email addresses.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.0
	 */
	public static native int LINKIFY_EMAIL_ADDRESSES() /*-{
		return Titanium.UI.Android.LINKIFY_EMAIL_ADDRESSES;
	}-*/;

	/**
	 * <b>LINKIFY_MAP_ADDRESSES</b> (int) static
	 * <p>
	 * Auto link physical addresses.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.0
	 */
	public static native int LINKIFY_MAP_ADDRESSES() /*-{
		return Titanium.UI.Android.LINKIFY_MAP_ADDRESSES;
	}-*/;

	/**
	 * <b>LINKIFY_MAP_LINKS</b> (int) static
	 * <p>
	 * Convert all street addresses to clickable links
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.0
	 */
	public static native int LINKIFY_MAP_LINKS() /*-{
		return Titanium.UI.Android.LINKIFY_MAP_LINKS;
	}-*/;

	/**
	 * <b>LINKIFY_PHONE_NUMBERS</b> (int) static
	 * <p>
	 * Auto link phone numbers.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.0
	 */
	public static native int LINKIFY_PHONE_NUMBERS() /*-{
		return Titanium.UI.Android.LINKIFY_PHONE_NUMBERS;
	}-*/;

	/**
	 * <b>LINKIFY_WEB_URLS</b> (int) static
	 * <p>
	 * Auto link web urls.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.0
	 */
	public static native int LINKIFY_WEB_URLS() /*-{
		return Titanium.UI.Android.LINKIFY_WEB_URLS;
	}-*/;

	/**
	 * <b>SOFT_INPUT_ADJUST_PAN</b> (int) static
	 * <p>
	 * Pan contents when soft keyboard is visible. Use on Activity ("heavy weight window") to suggest how the virtual keyboard should treat the window contents. Must be specified in creation options.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.0
	 */
	public static native int SOFT_INPUT_ADJUST_PAN() /*-{
		return Titanium.UI.Android.SOFT_INPUT_ADJUST_PAN;
	}-*/;

	/**
	 * <b>SOFT_INPUT_ADJUST_RESIZE</b> (int) static
	 * <p>
	 * Resize contents when soft keyboard is visible. Use on Activity ("heavy weight window") to suggest how the virtual keyboard should treat the window contents. Must be specified in creation options.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.0
	 */
	public static native int SOFT_INPUT_ADJUST_RESIZE() /*-{
		return Titanium.UI.Android.SOFT_INPUT_ADJUST_RESIZE;
	}-*/;

	/**
	 * <b>SOFT_INPUT_ADJUST_UNSPECIFIED</b> (int) static
	 * <p>
	 * (default) If set in the AndroidManifest.xml use that setting. Otherwise, let the keyboard decided. Must be specified in creation options.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.0
	 */
	public static native int SOFT_INPUT_ADJUST_UNSPECIFIED() /*-{
		return Titanium.UI.Android.SOFT_INPUT_ADJUST_UNSPECIFIED;
	}-*/;

	/**
	 * <b>SOFT_INPUT_STATE_HIDDEN</b> (int) static
	 * <p>
	 * Attempt to hide the soft keyboard when control receives keyboard focus.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.0
	 */
	public static native int SOFT_INPUT_STATE_HIDDEN() /*-{
		return Titanium.UI.Android.SOFT_INPUT_STATE_HIDDEN;
	}-*/;

	/**
	 * <b>SOFT_INPUT_STATE_UNSPECIFIED</b> (int) static
	 * <p>
	 * Use OS default behavior for keyboard focus.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.0
	 */
	public static native int SOFT_INPUT_STATE_UNSPECIFIED() /*-{
		return Titanium.UI.Android.SOFT_INPUT_STATE_UNSPECIFIED;
	}-*/;

	/**
	 * <b>SOFT_INPUT_STATE_VISIBLE</b> (int) static
	 * <p>
	 * Attempt to show the soft keyboard when control receives keyboard focus.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.0
	 */
	public static native int SOFT_INPUT_STATE_VISIBLE() /*-{
		return Titanium.UI.Android.SOFT_INPUT_STATE_VISIBLE;
	}-*/;

	/**
	 * <b>SOFT_KEYBOARD_DEFAULT_ON_FOCUS</b> (int) static
	 * <p>
	 * Use Android default soft keyboard handling. Same as not specifying a value.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.0
	 */
	public static native int SOFT_KEYBOARD_DEFAULT_ON_FOCUS() /*-{
		return Titanium.UI.Android.SOFT_KEYBOARD_DEFAULT_ON_FOCUS;
	}-*/;

	/**
	 * <b>SOFT_KEYBOARD_HIDE_ON_FOCUS</b> (int) static
	 * <p>
	 * Request hide soft keyboard on focus. Note: OS can override request.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.0
	 */
	public static native int SOFT_KEYBOARD_HIDE_ON_FOCUS() /*-{
		return Titanium.UI.Android.SOFT_KEYBOARD_HIDE_ON_FOCUS;
	}-*/;

	/**
	 * <b>SOFT_KEYBOARD_SHOW_ON_FOCUS</b> (int) static
	 * <p>
	 * Request show soft keyboard on focus. Note: OS can override request.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.0
	 */
	public static native int SOFT_KEYBOARD_SHOW_ON_FOCUS() /*-{
		return Titanium.UI.Android.SOFT_KEYBOARD_SHOW_ON_FOCUS;
	}-*/;

	/**
	 * <b>SWITCH_STYLE_CHECKBOX</b> (int) static
	 * <p>
	 * Display Switch as an Android Checkbox
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.0
	 */
	public static native int SWITCH_STYLE_CHECKBOX() /*-{
		return Titanium.UI.Android.SWITCH_STYLE_CHECKBOX;
	}-*/;

	/**
	 * <b>SWITCH_STYLE_TOGGLEBUTTON</b> (int) static
	 * <p>
	 * Display Switch as an Android Toggle Button (default)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.0
	 */
	public static native int SWITCH_STYLE_TOGGLEBUTTON() /*-{
		return Titanium.UI.Android.SWITCH_STYLE_TOGGLEBUTTON;
	}-*/;

	/**
	 * <b>addEventListener</b>
	 * <p>
	 * add an event listener for the instance to receive view triggered events
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.0
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public static native void addEventListener(String name, JavaScriptObject callback) /*-{
		Titanium.UI.Android.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.0
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public static native void fireEvent(String name, JavaScriptObject event) /*-{
		Titanium.UI.Android.fireEvent(name, event);
	}-*/;

	/**
	 * <b>hideSoftKeyboard</b>
	 * <p>
	 * request that the soft keyboard hide. Note: It is not currently possible in the native Android API to detect that the keyboard is already visible. Note: It is not possible to globally show the keyboard at this point.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.0
	 * @return void
	 */
	 public static native void hideSoftKeyboard() /*-{
		Titanium.UI.Android.hideSoftKeyboard();
	}-*/;

	/**
	 * <b>openPreferences</b>
	 * <p>
	 * open Android native preferences UI activity. You need to place your preferences.xml file in the platform/android/res/xml/ folder of your project. Documentation on the file format may be found in the Android documentation http://developer.android.com/resources/samples/ApiDemos/res/xml/preferences.html
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.0
	 * @return void
	 */
	 public static native void openPreferences() /*-{
		Titanium.UI.Android.openPreferences();
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.0
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public static native void removeEventListener(String name, JavaScriptObject callback) /*-{
		Titanium.UI.Android.removeEventListener(name, callback);
	}-*/;
}
