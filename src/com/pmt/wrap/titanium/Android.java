package com.pmt.wrap.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Android</b>
 * <p>
 * The top level Android module. Ti.Android.currentActivity provides each context an Activity. This object cannot be created directly.
 * <p>
 * <b>Platforms:</b> android 
 * <p>
 * <b>Since:</b> 1.5
 * <p>
 * <b>Type:</b> module
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
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
	 * <b>ACTION_AIRPLANE_MODE_CHANGED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_AIRPLANE_MODE_CHANGED() /*-{
		return Titanium.Android.ACTION_AIRPLANE_MODE_CHANGED;
	}-*/;

	/**
	 * <b>ACTION_ALL_APPS</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_ALL_APPS() /*-{
		return Titanium.Android.ACTION_ALL_APPS;
	}-*/;

	/**
	 * <b>ACTION_ANSWER</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_ANSWER() /*-{
		return Titanium.Android.ACTION_ANSWER;
	}-*/;

	/**
	 * <b>ACTION_ATTACH_DATA</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_ATTACH_DATA() /*-{
		return Titanium.Android.ACTION_ATTACH_DATA;
	}-*/;

	/**
	 * <b>ACTION_BATTERY_CHANGED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_BATTERY_CHANGED() /*-{
		return Titanium.Android.ACTION_BATTERY_CHANGED;
	}-*/;

	/**
	 * <b>ACTION_BATTERY_LOW</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_BATTERY_LOW() /*-{
		return Titanium.Android.ACTION_BATTERY_LOW;
	}-*/;

	/**
	 * <b>ACTION_BATTERY_OKAY</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_BATTERY_OKAY() /*-{
		return Titanium.Android.ACTION_BATTERY_OKAY;
	}-*/;

	/**
	 * <b>ACTION_BOOT_COMPLETED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_BOOT_COMPLETED() /*-{
		return Titanium.Android.ACTION_BOOT_COMPLETED;
	}-*/;

	/**
	 * <b>ACTION_BUG_REPORT</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_BUG_REPORT() /*-{
		return Titanium.Android.ACTION_BUG_REPORT;
	}-*/;

	/**
	 * <b>ACTION_CALL</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_CALL() /*-{
		return Titanium.Android.ACTION_CALL;
	}-*/;

	/**
	 * <b>ACTION_CALL_BUTTON</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_CALL_BUTTON() /*-{
		return Titanium.Android.ACTION_CALL_BUTTON;
	}-*/;

	/**
	 * <b>ACTION_CAMERA_BUTTON</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_CAMERA_BUTTON() /*-{
		return Titanium.Android.ACTION_CAMERA_BUTTON;
	}-*/;

	/**
	 * <b>ACTION_CHOOSER</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_CHOOSER() /*-{
		return Titanium.Android.ACTION_CHOOSER;
	}-*/;

	/**
	 * <b>ACTION_CLOSE_SYSTEM_DIALOGS</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_CLOSE_SYSTEM_DIALOGS() /*-{
		return Titanium.Android.ACTION_CLOSE_SYSTEM_DIALOGS;
	}-*/;

	/**
	 * <b>ACTION_CONFIGURATION_CHANGED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_CONFIGURATION_CHANGED() /*-{
		return Titanium.Android.ACTION_CONFIGURATION_CHANGED;
	}-*/;

	/**
	 * <b>ACTION_CREATE_SHORTCUT</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_CREATE_SHORTCUT() /*-{
		return Titanium.Android.ACTION_CREATE_SHORTCUT;
	}-*/;

	/**
	 * <b>ACTION_DATE_CHANGED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_DATE_CHANGED() /*-{
		return Titanium.Android.ACTION_DATE_CHANGED;
	}-*/;

	/**
	 * <b>ACTION_DEFAULT</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_DEFAULT() /*-{
		return Titanium.Android.ACTION_DEFAULT;
	}-*/;

	/**
	 * <b>ACTION_DELETE</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_DELETE() /*-{
		return Titanium.Android.ACTION_DELETE;
	}-*/;

	/**
	 * <b>ACTION_DEVICE_STORAGE_LOW</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_DEVICE_STORAGE_LOW() /*-{
		return Titanium.Android.ACTION_DEVICE_STORAGE_LOW;
	}-*/;

	/**
	 * <b>ACTION_DIAL</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_DIAL() /*-{
		return Titanium.Android.ACTION_DIAL;
	}-*/;

	/**
	 * <b>ACTION_EDIT</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_EDIT() /*-{
		return Titanium.Android.ACTION_EDIT;
	}-*/;

	/**
	 * <b>ACTION_GET_CONTENT</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_GET_CONTENT() /*-{
		return Titanium.Android.ACTION_GET_CONTENT;
	}-*/;

	/**
	 * <b>ACTION_GTALK_SERVICE_CONNECTED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_GTALK_SERVICE_CONNECTED() /*-{
		return Titanium.Android.ACTION_GTALK_SERVICE_CONNECTED;
	}-*/;

	/**
	 * <b>ACTION_GTALK_SERVICE_DISCONNECTED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_GTALK_SERVICE_DISCONNECTED() /*-{
		return Titanium.Android.ACTION_GTALK_SERVICE_DISCONNECTED;
	}-*/;

	/**
	 * <b>ACTION_HEADSET_PLUG</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_HEADSET_PLUG() /*-{
		return Titanium.Android.ACTION_HEADSET_PLUG;
	}-*/;

	/**
	 * <b>ACTION_INPUT_METHOD_CHANGED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_INPUT_METHOD_CHANGED() /*-{
		return Titanium.Android.ACTION_INPUT_METHOD_CHANGED;
	}-*/;

	/**
	 * <b>ACTION_INSERT</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_INSERT() /*-{
		return Titanium.Android.ACTION_INSERT;
	}-*/;

	/**
	 * <b>ACTION_INSERT_OR_EDIT</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_INSERT_OR_EDIT() /*-{
		return Titanium.Android.ACTION_INSERT_OR_EDIT;
	}-*/;

	/**
	 * <b>ACTION_MAIN</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_MAIN() /*-{
		return Titanium.Android.ACTION_MAIN;
	}-*/;

	/**
	 * <b>ACTION_MANAGE_PACKAGE_STORAGE</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_MANAGE_PACKAGE_STORAGE() /*-{
		return Titanium.Android.ACTION_MANAGE_PACKAGE_STORAGE;
	}-*/;

	/**
	 * <b>ACTION_MEDIA_BAD_REMOVAL</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_MEDIA_BAD_REMOVAL() /*-{
		return Titanium.Android.ACTION_MEDIA_BAD_REMOVAL;
	}-*/;

	/**
	 * <b>ACTION_MEDIA_BUTTON</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_MEDIA_BUTTON() /*-{
		return Titanium.Android.ACTION_MEDIA_BUTTON;
	}-*/;

	/**
	 * <b>ACTION_MEDIA_CHECKING</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_MEDIA_CHECKING() /*-{
		return Titanium.Android.ACTION_MEDIA_CHECKING;
	}-*/;

	/**
	 * <b>ACTION_MEDIA_EJECT</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_MEDIA_EJECT() /*-{
		return Titanium.Android.ACTION_MEDIA_EJECT;
	}-*/;

	/**
	 * <b>ACTION_MEDIA_MOUNTED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_MEDIA_MOUNTED() /*-{
		return Titanium.Android.ACTION_MEDIA_MOUNTED;
	}-*/;

	/**
	 * <b>ACTION_MEDIA_NOFS</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_MEDIA_NOFS() /*-{
		return Titanium.Android.ACTION_MEDIA_NOFS;
	}-*/;

	/**
	 * <b>ACTION_MEDIA_REMOVED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_MEDIA_REMOVED() /*-{
		return Titanium.Android.ACTION_MEDIA_REMOVED;
	}-*/;

	/**
	 * <b>ACTION_MEDIA_SCANNER_FINISHED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_MEDIA_SCANNER_FINISHED() /*-{
		return Titanium.Android.ACTION_MEDIA_SCANNER_FINISHED;
	}-*/;

	/**
	 * <b>ACTION_MEDIA_SCANNER_SCAN_FILE</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_MEDIA_SCANNER_SCAN_FILE() /*-{
		return Titanium.Android.ACTION_MEDIA_SCANNER_SCAN_FILE;
	}-*/;

	/**
	 * <b>ACTION_MEDIA_SCANNER_STARTED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_MEDIA_SCANNER_STARTED() /*-{
		return Titanium.Android.ACTION_MEDIA_SCANNER_STARTED;
	}-*/;

	/**
	 * <b>ACTION_MEDIA_SHARED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_MEDIA_SHARED() /*-{
		return Titanium.Android.ACTION_MEDIA_SHARED;
	}-*/;

	/**
	 * <b>ACTION_MEDIA_UNMOUNTABLE</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_MEDIA_UNMOUNTABLE() /*-{
		return Titanium.Android.ACTION_MEDIA_UNMOUNTABLE;
	}-*/;

	/**
	 * <b>ACTION_MEDIA_UNMOUNTED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_MEDIA_UNMOUNTED() /*-{
		return Titanium.Android.ACTION_MEDIA_UNMOUNTED;
	}-*/;

	/**
	 * <b>ACTION_NEW_OUTGOING_CALL</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_NEW_OUTGOING_CALL() /*-{
		return Titanium.Android.ACTION_NEW_OUTGOING_CALL;
	}-*/;

	/**
	 * <b>ACTION_PACKAGE_ADDED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_PACKAGE_ADDED() /*-{
		return Titanium.Android.ACTION_PACKAGE_ADDED;
	}-*/;

	/**
	 * <b>ACTION_PACKAGE_CHANGED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_PACKAGE_CHANGED() /*-{
		return Titanium.Android.ACTION_PACKAGE_CHANGED;
	}-*/;

	/**
	 * <b>ACTION_PACKAGE_DATA_CLEARED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_PACKAGE_DATA_CLEARED() /*-{
		return Titanium.Android.ACTION_PACKAGE_DATA_CLEARED;
	}-*/;

	/**
	 * <b>ACTION_PACKAGE_INSTALL</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_PACKAGE_INSTALL() /*-{
		return Titanium.Android.ACTION_PACKAGE_INSTALL;
	}-*/;

	/**
	 * <b>ACTION_PACKAGE_REMOVED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_PACKAGE_REMOVED() /*-{
		return Titanium.Android.ACTION_PACKAGE_REMOVED;
	}-*/;

	/**
	 * <b>ACTION_PACKAGE_REPLACED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_PACKAGE_REPLACED() /*-{
		return Titanium.Android.ACTION_PACKAGE_REPLACED;
	}-*/;

	/**
	 * <b>ACTION_PACKAGE_RESTARTED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_PACKAGE_RESTARTED() /*-{
		return Titanium.Android.ACTION_PACKAGE_RESTARTED;
	}-*/;

	/**
	 * <b>ACTION_PICK</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_PICK() /*-{
		return Titanium.Android.ACTION_PICK;
	}-*/;

	/**
	 * <b>ACTION_PICK_ACTIVITY</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_PICK_ACTIVITY() /*-{
		return Titanium.Android.ACTION_PICK_ACTIVITY;
	}-*/;

	/**
	 * <b>ACTION_POWER_CONNECTED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_POWER_CONNECTED() /*-{
		return Titanium.Android.ACTION_POWER_CONNECTED;
	}-*/;

	/**
	 * <b>ACTION_POWER_DISCONNECTED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_POWER_DISCONNECTED() /*-{
		return Titanium.Android.ACTION_POWER_DISCONNECTED;
	}-*/;

	/**
	 * <b>ACTION_POWER_USAGE_SUMMARY</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_POWER_USAGE_SUMMARY() /*-{
		return Titanium.Android.ACTION_POWER_USAGE_SUMMARY;
	}-*/;

	/**
	 * <b>ACTION_PROVIDER_CHANGED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_PROVIDER_CHANGED() /*-{
		return Titanium.Android.ACTION_PROVIDER_CHANGED;
	}-*/;

	/**
	 * <b>ACTION_REBOOT</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_REBOOT() /*-{
		return Titanium.Android.ACTION_REBOOT;
	}-*/;

	/**
	 * <b>ACTION_RUN</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_RUN() /*-{
		return Titanium.Android.ACTION_RUN;
	}-*/;

	/**
	 * <b>ACTION_SCREEN_OFF</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_SCREEN_OFF() /*-{
		return Titanium.Android.ACTION_SCREEN_OFF;
	}-*/;

	/**
	 * <b>ACTION_SCREEN_ON</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_SCREEN_ON() /*-{
		return Titanium.Android.ACTION_SCREEN_ON;
	}-*/;

	/**
	 * <b>ACTION_SEARCH</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_SEARCH() /*-{
		return Titanium.Android.ACTION_SEARCH;
	}-*/;

	/**
	 * <b>ACTION_SEARCH_LONG_PRESS</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_SEARCH_LONG_PRESS() /*-{
		return Titanium.Android.ACTION_SEARCH_LONG_PRESS;
	}-*/;

	/**
	 * <b>ACTION_SEND</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_SEND() /*-{
		return Titanium.Android.ACTION_SEND;
	}-*/;

	/**
	 * <b>ACTION_SENDTO</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_SENDTO() /*-{
		return Titanium.Android.ACTION_SENDTO;
	}-*/;

	/**
	 * <b>ACTION_SEND_MULTIPLE</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_SEND_MULTIPLE() /*-{
		return Titanium.Android.ACTION_SEND_MULTIPLE;
	}-*/;

	/**
	 * <b>ACTION_SET_WALLPAPER</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_SET_WALLPAPER() /*-{
		return Titanium.Android.ACTION_SET_WALLPAPER;
	}-*/;

	/**
	 * <b>ACTION_SHUTDOWN</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_SHUTDOWN() /*-{
		return Titanium.Android.ACTION_SHUTDOWN;
	}-*/;

	/**
	 * <b>ACTION_SYNC</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_SYNC() /*-{
		return Titanium.Android.ACTION_SYNC;
	}-*/;

	/**
	 * <b>ACTION_SYSTEM_TUTORIAL</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_SYSTEM_TUTORIAL() /*-{
		return Titanium.Android.ACTION_SYSTEM_TUTORIAL;
	}-*/;

	/**
	 * <b>ACTION_TIME_CHANGED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_TIME_CHANGED() /*-{
		return Titanium.Android.ACTION_TIME_CHANGED;
	}-*/;

	/**
	 * <b>ACTION_TIME_TICK</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_TIME_TICK() /*-{
		return Titanium.Android.ACTION_TIME_TICK;
	}-*/;

	/**
	 * <b>ACTION_UID_REMOVED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_UID_REMOVED() /*-{
		return Titanium.Android.ACTION_UID_REMOVED;
	}-*/;

	/**
	 * <b>ACTION_UMS_CONNECTED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_UMS_CONNECTED() /*-{
		return Titanium.Android.ACTION_UMS_CONNECTED;
	}-*/;

	/**
	 * <b>ACTION_UMS_DISCONNECTED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_UMS_DISCONNECTED() /*-{
		return Titanium.Android.ACTION_UMS_DISCONNECTED;
	}-*/;

	/**
	 * <b>ACTION_USER_PRESENT</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_USER_PRESENT() /*-{
		return Titanium.Android.ACTION_USER_PRESENT;
	}-*/;

	/**
	 * <b>ACTION_VIEW</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_VIEW() /*-{
		return Titanium.Android.ACTION_VIEW;
	}-*/;

	/**
	 * <b>ACTION_VOICE_COMMAND</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_VOICE_COMMAND() /*-{
		return Titanium.Android.ACTION_VOICE_COMMAND;
	}-*/;

	/**
	 * <b>ACTION_WALLPAPER_CHANGED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_WALLPAPER_CHANGED() /*-{
		return Titanium.Android.ACTION_WALLPAPER_CHANGED;
	}-*/;

	/**
	 * <b>ACTION_WEB_SEARCH</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String ACTION_WEB_SEARCH() /*-{
		return Titanium.Android.ACTION_WEB_SEARCH;
	}-*/;

	/**
	 * <b>CATEGORY_ALTERNATIVE</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String CATEGORY_ALTERNATIVE() /*-{
		return Titanium.Android.CATEGORY_ALTERNATIVE;
	}-*/;

	/**
	 * <b>CATEGORY_BROWSABLE</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String CATEGORY_BROWSABLE() /*-{
		return Titanium.Android.CATEGORY_BROWSABLE;
	}-*/;

	/**
	 * <b>CATEGORY_DEFAULT</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String CATEGORY_DEFAULT() /*-{
		return Titanium.Android.CATEGORY_DEFAULT;
	}-*/;

	/**
	 * <b>CATEGORY_DEVELOPMENT_PREFERENCE</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String CATEGORY_DEVELOPMENT_PREFERENCE() /*-{
		return Titanium.Android.CATEGORY_DEVELOPMENT_PREFERENCE;
	}-*/;

	/**
	 * <b>CATEGORY_EMBED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String CATEGORY_EMBED() /*-{
		return Titanium.Android.CATEGORY_EMBED;
	}-*/;

	/**
	 * <b>CATEGORY_FRAMEWORK_INSTRUMENTATION_TEST</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String CATEGORY_FRAMEWORK_INSTRUMENTATION_TEST() /*-{
		return Titanium.Android.CATEGORY_FRAMEWORK_INSTRUMENTATION_TEST;
	}-*/;

	/**
	 * <b>CATEGORY_HOME</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String CATEGORY_HOME() /*-{
		return Titanium.Android.CATEGORY_HOME;
	}-*/;

	/**
	 * <b>CATEGORY_INFO</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String CATEGORY_INFO() /*-{
		return Titanium.Android.CATEGORY_INFO;
	}-*/;

	/**
	 * <b>CATEGORY_LAUNCHER</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String CATEGORY_LAUNCHER() /*-{
		return Titanium.Android.CATEGORY_LAUNCHER;
	}-*/;

	/**
	 * <b>CATEGORY_MONKEY</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String CATEGORY_MONKEY() /*-{
		return Titanium.Android.CATEGORY_MONKEY;
	}-*/;

	/**
	 * <b>CATEGORY_OPENABLE</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String CATEGORY_OPENABLE() /*-{
		return Titanium.Android.CATEGORY_OPENABLE;
	}-*/;

	/**
	 * <b>CATEGORY_PREFERENCE</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String CATEGORY_PREFERENCE() /*-{
		return Titanium.Android.CATEGORY_PREFERENCE;
	}-*/;

	/**
	 * <b>CATEGORY_SAMPLE_CODE</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String CATEGORY_SAMPLE_CODE() /*-{
		return Titanium.Android.CATEGORY_SAMPLE_CODE;
	}-*/;

	/**
	 * <b>CATEGORY_SELECTED_ALTERNATIVE</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String CATEGORY_SELECTED_ALTERNATIVE() /*-{
		return Titanium.Android.CATEGORY_SELECTED_ALTERNATIVE;
	}-*/;

	/**
	 * <b>CATEGORY_TAB</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String CATEGORY_TAB() /*-{
		return Titanium.Android.CATEGORY_TAB;
	}-*/;

	/**
	 * <b>CATEGORY_TEST</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String CATEGORY_TEST() /*-{
		return Titanium.Android.CATEGORY_TEST;
	}-*/;

	/**
	 * <b>CATEGORY_UNIT_TEST</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String CATEGORY_UNIT_TEST() /*-{
		return Titanium.Android.CATEGORY_UNIT_TEST;
	}-*/;

	/**
	 * <b>DEFAULT_ALL</b> (int) static
	 * <p>
	 * Use all default values (where applicable).
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int DEFAULT_ALL() /*-{
		return Titanium.Android.DEFAULT_ALL;
	}-*/;

	/**
	 * <b>DEFAULT_LIGHTS</b> (int) static
	 * <p>
	 * Use the default notification lights.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int DEFAULT_LIGHTS() /*-{
		return Titanium.Android.DEFAULT_LIGHTS;
	}-*/;

	/**
	 * <b>DEFAULT_SOUND</b> (int) static
	 * <p>
	 * Use the default notification sound.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int DEFAULT_SOUND() /*-{
		return Titanium.Android.DEFAULT_SOUND;
	}-*/;

	/**
	 * <b>DEFAULT_VIBRATE</b> (int) static
	 * <p>
	 * Use the default notification vibrate.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int DEFAULT_VIBRATE() /*-{
		return Titanium.Android.DEFAULT_VIBRATE;
	}-*/;

	/**
	 * <b>EXTRA_ALARM_COUNT</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String EXTRA_ALARM_COUNT() /*-{
		return Titanium.Android.EXTRA_ALARM_COUNT;
	}-*/;

	/**
	 * <b>EXTRA_BCC</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String EXTRA_BCC() /*-{
		return Titanium.Android.EXTRA_BCC;
	}-*/;

	/**
	 * <b>EXTRA_CC</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String EXTRA_CC() /*-{
		return Titanium.Android.EXTRA_CC;
	}-*/;

	/**
	 * <b>EXTRA_DATA_REMOVED</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String EXTRA_DATA_REMOVED() /*-{
		return Titanium.Android.EXTRA_DATA_REMOVED;
	}-*/;

	/**
	 * <b>EXTRA_DONT_KILL_APP</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String EXTRA_DONT_KILL_APP() /*-{
		return Titanium.Android.EXTRA_DONT_KILL_APP;
	}-*/;

	/**
	 * <b>EXTRA_EMAIL</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String EXTRA_EMAIL() /*-{
		return Titanium.Android.EXTRA_EMAIL;
	}-*/;

	/**
	 * <b>EXTRA_INTENT</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String EXTRA_INTENT() /*-{
		return Titanium.Android.EXTRA_INTENT;
	}-*/;

	/**
	 * <b>EXTRA_KEY_EVENT</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String EXTRA_KEY_EVENT() /*-{
		return Titanium.Android.EXTRA_KEY_EVENT;
	}-*/;

	/**
	 * <b>EXTRA_PHONE_NUMBER</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String EXTRA_PHONE_NUMBER() /*-{
		return Titanium.Android.EXTRA_PHONE_NUMBER;
	}-*/;

	/**
	 * <b>EXTRA_REPLACING</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String EXTRA_REPLACING() /*-{
		return Titanium.Android.EXTRA_REPLACING;
	}-*/;

	/**
	 * <b>EXTRA_SHORTCUT_ICON</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String EXTRA_SHORTCUT_ICON() /*-{
		return Titanium.Android.EXTRA_SHORTCUT_ICON;
	}-*/;

	/**
	 * <b>EXTRA_SHORTCUT_ICON_RESOURCE</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String EXTRA_SHORTCUT_ICON_RESOURCE() /*-{
		return Titanium.Android.EXTRA_SHORTCUT_ICON_RESOURCE;
	}-*/;

	/**
	 * <b>EXTRA_SHORTCUT_INTENT</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String EXTRA_SHORTCUT_INTENT() /*-{
		return Titanium.Android.EXTRA_SHORTCUT_INTENT;
	}-*/;

	/**
	 * <b>EXTRA_SHORTCUT_NAME</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String EXTRA_SHORTCUT_NAME() /*-{
		return Titanium.Android.EXTRA_SHORTCUT_NAME;
	}-*/;

	/**
	 * <b>EXTRA_STREAM</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String EXTRA_STREAM() /*-{
		return Titanium.Android.EXTRA_STREAM;
	}-*/;

	/**
	 * <b>EXTRA_SUBJECT</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String EXTRA_SUBJECT() /*-{
		return Titanium.Android.EXTRA_SUBJECT;
	}-*/;

	/**
	 * <b>EXTRA_TEMPLATE</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String EXTRA_TEMPLATE() /*-{
		return Titanium.Android.EXTRA_TEMPLATE;
	}-*/;

	/**
	 * <b>EXTRA_TEXT</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String EXTRA_TEXT() /*-{
		return Titanium.Android.EXTRA_TEXT;
	}-*/;

	/**
	 * <b>EXTRA_TITLE</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String EXTRA_TITLE() /*-{
		return Titanium.Android.EXTRA_TITLE;
	}-*/;

	/**
	 * <b>EXTRA_UID</b> (string) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native String EXTRA_UID() /*-{
		return Titanium.Android.EXTRA_UID;
	}-*/;

	/**
	 * <b>FILL_IN_ACTION</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FILL_IN_ACTION() /*-{
		return Titanium.Android.FILL_IN_ACTION;
	}-*/;

	/**
	 * <b>FILL_IN_CATEGORIES</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FILL_IN_CATEGORIES() /*-{
		return Titanium.Android.FILL_IN_CATEGORIES;
	}-*/;

	/**
	 * <b>FILL_IN_COMPONENT</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FILL_IN_COMPONENT() /*-{
		return Titanium.Android.FILL_IN_COMPONENT;
	}-*/;

	/**
	 * <b>FILL_IN_DATA</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FILL_IN_DATA() /*-{
		return Titanium.Android.FILL_IN_DATA;
	}-*/;

	/**
	 * <b>FILL_IN_PACKAGE</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FILL_IN_PACKAGE() /*-{
		return Titanium.Android.FILL_IN_PACKAGE;
	}-*/;

	/**
	 * <b>FLAG_ACTIVITY_BROUGHT_TO_FRONT</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_ACTIVITY_BROUGHT_TO_FRONT() /*-{
		return Titanium.Android.FLAG_ACTIVITY_BROUGHT_TO_FRONT;
	}-*/;

	/**
	 * <b>FLAG_ACTIVITY_CLEAR_TOP</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_ACTIVITY_CLEAR_TOP() /*-{
		return Titanium.Android.FLAG_ACTIVITY_CLEAR_TOP;
	}-*/;

	/**
	 * <b>FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET() /*-{
		return Titanium.Android.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET;
	}-*/;

	/**
	 * <b>FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS() /*-{
		return Titanium.Android.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS;
	}-*/;

	/**
	 * <b>FLAG_ACTIVITY_FORWARD_RESULT</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_ACTIVITY_FORWARD_RESULT() /*-{
		return Titanium.Android.FLAG_ACTIVITY_FORWARD_RESULT;
	}-*/;

	/**
	 * <b>FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY() /*-{
		return Titanium.Android.FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY;
	}-*/;

	/**
	 * <b>FLAG_ACTIVITY_MULTIPLE_TASK</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_ACTIVITY_MULTIPLE_TASK() /*-{
		return Titanium.Android.FLAG_ACTIVITY_MULTIPLE_TASK;
	}-*/;

	/**
	 * <b>FLAG_ACTIVITY_NEW_TASK</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_ACTIVITY_NEW_TASK() /*-{
		return Titanium.Android.FLAG_ACTIVITY_NEW_TASK;
	}-*/;

	/**
	 * <b>FLAG_ACTIVITY_NO_ANIMATION</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_ACTIVITY_NO_ANIMATION() /*-{
		return Titanium.Android.FLAG_ACTIVITY_NO_ANIMATION;
	}-*/;

	/**
	 * <b>FLAG_ACTIVITY_NO_HISTORY</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_ACTIVITY_NO_HISTORY() /*-{
		return Titanium.Android.FLAG_ACTIVITY_NO_HISTORY;
	}-*/;

	/**
	 * <b>FLAG_ACTIVITY_NO_USER_ACTION</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_ACTIVITY_NO_USER_ACTION() /*-{
		return Titanium.Android.FLAG_ACTIVITY_NO_USER_ACTION;
	}-*/;

	/**
	 * <b>FLAG_ACTIVITY_PREVIOUS_IS_TOP</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_ACTIVITY_PREVIOUS_IS_TOP() /*-{
		return Titanium.Android.FLAG_ACTIVITY_PREVIOUS_IS_TOP;
	}-*/;

	/**
	 * <b>FLAG_ACTIVITY_REORDER_TO_FRONT</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_ACTIVITY_REORDER_TO_FRONT() /*-{
		return Titanium.Android.FLAG_ACTIVITY_REORDER_TO_FRONT;
	}-*/;

	/**
	 * <b>FLAG_ACTIVITY_RESET_TASK_IF_NEEDED</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_ACTIVITY_RESET_TASK_IF_NEEDED() /*-{
		return Titanium.Android.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED;
	}-*/;

	/**
	 * <b>FLAG_ACTIVITY_SINGLE_TOP</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_ACTIVITY_SINGLE_TOP() /*-{
		return Titanium.Android.FLAG_ACTIVITY_SINGLE_TOP;
	}-*/;

	/**
	 * <b>FLAG_AUTO_CANCEL</b> (int) static
	 * <p>
	 * Bit to be bitwise-ored into the flags field that should be set if the notification should be canceled when it is clicked by the user.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_AUTO_CANCEL() /*-{
		return Titanium.Android.FLAG_AUTO_CANCEL;
	}-*/;

	/**
	 * <b>FLAG_CANCEL_CURRENT</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_CANCEL_CURRENT() /*-{
		return Titanium.Android.FLAG_CANCEL_CURRENT;
	}-*/;

	/**
	 * <b>FLAG_DEBUG_LOG_RESOLUTION</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_DEBUG_LOG_RESOLUTION() /*-{
		return Titanium.Android.FLAG_DEBUG_LOG_RESOLUTION;
	}-*/;

	/**
	 * <b>FLAG_FROM_BACKGROUND</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_FROM_BACKGROUND() /*-{
		return Titanium.Android.FLAG_FROM_BACKGROUND;
	}-*/;

	/**
	 * <b>FLAG_GRANT_READ_URI_PERMISSION</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_GRANT_READ_URI_PERMISSION() /*-{
		return Titanium.Android.FLAG_GRANT_READ_URI_PERMISSION;
	}-*/;

	/**
	 * <b>FLAG_GRANT_WRITE_URI_PERMISSION</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_GRANT_WRITE_URI_PERMISSION() /*-{
		return Titanium.Android.FLAG_GRANT_WRITE_URI_PERMISSION;
	}-*/;

	/**
	 * <b>FLAG_INSISTENT</b> (int) static
	 * <p>
	 * Bit to be bitwise-ored into the flags field that if set, the audio will be repeated until the notification is cancelled or the notification window is opened.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_INSISTENT() /*-{
		return Titanium.Android.FLAG_INSISTENT;
	}-*/;

	/**
	 * <b>FLAG_NO_CLEAR</b> (int) static
	 * <p>
	 * Bit to be bitwise-ored into the flags field that should be set if the notification should not be canceled when the user clicks the Clear all button.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_NO_CLEAR() /*-{
		return Titanium.Android.FLAG_NO_CLEAR;
	}-*/;

	/**
	 * <b>FLAG_NO_CREATE</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_NO_CREATE() /*-{
		return Titanium.Android.FLAG_NO_CREATE;
	}-*/;

	/**
	 * <b>FLAG_ONE_SHOT</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_ONE_SHOT() /*-{
		return Titanium.Android.FLAG_ONE_SHOT;
	}-*/;

	/**
	 * <b>FLAG_ONGOING_EVENT</b> (int) static
	 * <p>
	 * Bit to be bitwise-ored into the flags field that should be set if this notification is in reference to something that is ongoing, like a phone call.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_ONGOING_EVENT() /*-{
		return Titanium.Android.FLAG_ONGOING_EVENT;
	}-*/;

	/**
	 * <b>FLAG_ONLY_ALERT_ONCE</b> (int) static
	 * <p>
	 * Bit to be bitwise-ored into the flags field that should be set if you want the sound and/or vibration play each time the notification is sent, even if it has not been canceled before that.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_ONLY_ALERT_ONCE() /*-{
		return Titanium.Android.FLAG_ONLY_ALERT_ONCE;
	}-*/;

	/**
	 * <b>FLAG_RECEIVER_REGISTERED_ONLY</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_RECEIVER_REGISTERED_ONLY() /*-{
		return Titanium.Android.FLAG_RECEIVER_REGISTERED_ONLY;
	}-*/;

	/**
	 * <b>FLAG_SHOW_LIGHTS</b> (int) static
	 * <p>
	 * Bit to be bitwise-ored into the flags field that should be set if you want the LED on for this notification.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_SHOW_LIGHTS() /*-{
		return Titanium.Android.FLAG_SHOW_LIGHTS;
	}-*/;

	/**
	 * <b>FLAG_UPDATE_CURRENT</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int FLAG_UPDATE_CURRENT() /*-{
		return Titanium.Android.FLAG_UPDATE_CURRENT;
	}-*/;

	/**
	 * <b>PENDING_INTENT_FOR_ACTIVITY</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int PENDING_INTENT_FOR_ACTIVITY() /*-{
		return Titanium.Android.PENDING_INTENT_FOR_ACTIVITY;
	}-*/;

	/**
	 * <b>PENDING_INTENT_FOR_BROADCAST</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int PENDING_INTENT_FOR_BROADCAST() /*-{
		return Titanium.Android.PENDING_INTENT_FOR_BROADCAST;
	}-*/;

	/**
	 * <b>PENDING_INTENT_FOR_SERVICE</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int PENDING_INTENT_FOR_SERVICE() /*-{
		return Titanium.Android.PENDING_INTENT_FOR_SERVICE;
	}-*/;

	/**
	 * <b>PENDING_INTENT_MAX_VALUE</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int PENDING_INTENT_MAX_VALUE() /*-{
		return Titanium.Android.PENDING_INTENT_MAX_VALUE;
	}-*/;

	/**
	 * <b>R</b> (object) static
	 * <p>
	 * Accessor for android resources
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native JavaScriptObject R() /*-{
		return Titanium.Android.R;
	}-*/;

	/**
	 * <b>RESULT_CANCELED</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int RESULT_CANCELED() /*-{
		return Titanium.Android.RESULT_CANCELED;
	}-*/;

	/**
	 * <b>RESULT_FIRST_USER</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int RESULT_FIRST_USER() /*-{
		return Titanium.Android.RESULT_FIRST_USER;
	}-*/;

	/**
	 * <b>RESULT_OK</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int RESULT_OK() /*-{
		return Titanium.Android.RESULT_OK;
	}-*/;

	/**
	 * <b>SCREEN_ORIENTATION_BEHIND</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int SCREEN_ORIENTATION_BEHIND() /*-{
		return Titanium.Android.SCREEN_ORIENTATION_BEHIND;
	}-*/;

	/**
	 * <b>SCREEN_ORIENTATION_LANDSCAPE</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int SCREEN_ORIENTATION_LANDSCAPE() /*-{
		return Titanium.Android.SCREEN_ORIENTATION_LANDSCAPE;
	}-*/;

	/**
	 * <b>SCREEN_ORIENTATION_NOSENSOR</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int SCREEN_ORIENTATION_NOSENSOR() /*-{
		return Titanium.Android.SCREEN_ORIENTATION_NOSENSOR;
	}-*/;

	/**
	 * <b>SCREEN_ORIENTATION_PORTRAIT</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int SCREEN_ORIENTATION_PORTRAIT() /*-{
		return Titanium.Android.SCREEN_ORIENTATION_PORTRAIT;
	}-*/;

	/**
	 * <b>SCREEN_ORIENTATION_SENSOR</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int SCREEN_ORIENTATION_SENSOR() /*-{
		return Titanium.Android.SCREEN_ORIENTATION_SENSOR;
	}-*/;

	/**
	 * <b>SCREEN_ORIENTATION_UNSPECIFIED</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int SCREEN_ORIENTATION_UNSPECIFIED() /*-{
		return Titanium.Android.SCREEN_ORIENTATION_UNSPECIFIED;
	}-*/;

	/**
	 * <b>SCREEN_ORIENTATION_USER</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int SCREEN_ORIENTATION_USER() /*-{
		return Titanium.Android.SCREEN_ORIENTATION_USER;
	}-*/;

	/**
	 * <b>STREAM_DEFAULT</b> (int) static
	 * <p>
	 * Use this constant as the value for audioStreamType to request that the default stream type for notifications be used.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int STREAM_DEFAULT() /*-{
		return Titanium.Android.STREAM_DEFAULT;
	}-*/;

	/**
	 * <b>URI_INTENT_SCHEME</b> (int) static
	 * <p>
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public static native int URI_INTENT_SCHEME() /*-{
		return Titanium.Android.URI_INTENT_SCHEME;
	}-*/;

	/**
	 * <b>addEventListener</b>
	 * <p>
	 * add an event listener for the instance to receive view triggered events
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public static native void addEventListener(String name, JavaScriptObject callback) /*-{
		return Titanium.Android.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>createBroadcastIntent</b>
	 * <p>
	 * Create a Titanium.Android.Intent to be used to start a Broadcast.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @return <a href="Titanium.Android.Intent.html">Titanium.Android.Intent</a>
	 */
	 public static native JavaScriptObject createBroadcastIntent() /*-{
		return Titanium.Android.createBroadcastIntent();
	}-*/;

	/**
	 * <b>createIntent</b>
	 * <p>
	 * Create a Titanium.Android.Intent. Used to start other Activities and for marshaling data.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @return <a href="Titanium.Android.Intent.html">Titanium.Android.Intent</a>
	 */
	 public static native JavaScriptObject createIntent() /*-{
		return Titanium.Android.createIntent();
	}-*/;

	/**
	 * <b>createIntentChooser</b>
	 * <p>
	 * Display chooser interface to allow selection of desired target.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @return <a href="Titanium.Android.Intent.html">Titanium.Android.Intent</a>
	 */
	 public static native JavaScriptObject createIntentChooser() /*-{
		return Titanium.Android.createIntentChooser();
	}-*/;

	/**
	 * <b>createNotification</b>
	 * <p>
	 * Crate a Titanium.Android.Notification. Used to notify the user of an event.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param options (object) Options dictionary
	 * @return <a href="Titanium.Android.Notification.html">Titanium.Android.Notification</a>
	 */
	 public static native JavaScriptObject createNotification(JavaScriptObject options) /*-{
		return Titanium.Android.createNotification(options);
	}-*/;

	/**
	 * <b>createPendingIntent</b>
	 * <p>
	 * Create a Titanium.Android.PendingIntent to be used inside a Titanium.Android.Notification
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param intent (<a href="Titanium.Android.Intent.html">Titanium.Android.Intent</a>) The Intent that will be executed
	 * @param flags (int) (optional, default: 0) Can be any of <a href="Titanium.Android.FLAG_CANCEL_CURRENT.html">Titanium.Android.FLAG_CANCEL_CURRENT</a>, <a href="Titanium.Android.FLAG_NO_CREATE.html">Titanium.Android.FLAG_NO_CREATE</a>, <a href="Titanium.Android.FLAG_ONE_SHOT.html">Titanium.Android.FLAG_ONE_SHOT</a>, <a href="Titanium.Android.FLAG_UPDATE_CURRENT.html">Titanium.Android.FLAG_UPDATE_CURRENT</a>
	 * @return <a href="Titanium.Android.PendingIntent.html">Titanium.Android.PendingIntent</a>
	 */
	 public static native JavaScriptObject createPendingIntent(JavaScriptObject intent, int flags) /*-{
		return Titanium.Android.createPendingIntent(intent, flags);
	}-*/;

	/**
	 * <b>createService</b>
	 * <p>
	 * Create a Titanium.Android.Service so you can start/stop it and listen for events from it.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param intent (<a href="Titanium.Android.Intent.html">Titanium.Android.Intent</a>) An Intent created with <a href="Titanium.Android.createServiceIntent-method.html">Titanium.Android.createServiceIntent</a> which specifies the service to be instantiated.
	 * @return <a href="Titanium.Android.Service.html">Titanium.Android.Service</a>
	 */
	 public static native JavaScriptObject createService(JavaScriptObject intent) /*-{
		return Titanium.Android.createService(intent);
	}-*/;

	/**
	 * <b>createServiceIntent</b>
	 * <p>
	 * Create an Titanium.Android.Intent to be used to start a Service.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param options (object) Options dictionary -- pass in a <tt>url</tt> option to specify the path to a javascript-based service you create.
	 * @return <a href="Titanium.Android.Intent.html">Titanium.Android.Intent</a>
	 */
	 public static native JavaScriptObject createServiceIntent(JavaScriptObject options) /*-{
		return Titanium.Android.createServiceIntent(options);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public static native void fireEvent(String name, JavaScriptObject event) /*-{
		return Titanium.Android.fireEvent(name, event);
	}-*/;

	/**
	 * <b>isServiceRunning</b>
	 * <p>
	 * Check on state of Service.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param intent (<a href="Titanium.Android.Intent.html">Titanium.Android.Intent</a>) An Intent created with <a href="Titanium.Android.createServiceIntent-method.html">Titanium.Android.createServiceIntent</a> which specifies the service to check.
	 * @return boolean
	 */
	 public static native boolean isServiceRunning(JavaScriptObject intent) /*-{
		return Titanium.Android.isServiceRunning(intent);
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public static native void removeEventListener(String name, JavaScriptObject callback) /*-{
		return Titanium.Android.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>startService</b>
	 * <p>
	 * Start a simple service
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param intent (<a href="Titanium.Android.Intent.html">Titanium.Android.Intent</a>) An Intent created with <a href="Titanium.Android.createServiceIntent-method.html">Titanium.Android.createServiceIntent</a> which specifies the service to start.
	 * @return void
	 */
	 public static native void startService(JavaScriptObject intent) /*-{
		return Titanium.Android.startService(intent);
	}-*/;

	/**
	 * <b>stopService</b>
	 * <p>
	 * Stop a simple service that was started with startService.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param intent (<a href="Titanium.Android.Intent.html">Titanium.Android.Intent</a>) An Intent created with <a href="Titanium.Android.createServiceIntent-method.html">Titanium.Android.createServiceIntent</a> which specifies the service to stop.
	 * @return void
	 */
	 public static native void stopService(JavaScriptObject intent) /*-{
		return Titanium.Android.stopService(intent);
	}-*/;
}
