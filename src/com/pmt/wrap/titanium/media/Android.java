package com.pmt.wrap.titanium.media;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Media.Android</b>
 * <p>
 * Android-specific media-related functionality.
 * <p>
 * <b>Platforms:</b> android 
 * <p>
 * <b>Since:</b> 1.7.0
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
	 * <b>addEventListener</b>
	 * <p>
	 * add an event listener for the instance to receive view triggered events
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.7.0
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public static native void addEventListener(String name, JavaScriptObject callback) /*-{
		Titanium.Media.Android.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.7.0
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public static native void fireEvent(String name, JavaScriptObject event) /*-{
		Titanium.Media.Android.fireEvent(name, event);
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.7.0
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public static native void removeEventListener(String name, JavaScriptObject callback) /*-{
		Titanium.Media.Android.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>scanMediaFiles</b>
	 * <p>
	 * Use the Android MediaScannerConnection to request immediate scan of particular files so that they become available to the appropriate media providers (Gallery, etc.).
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.7.0
	 * @param paths (Array) Array of paths to the files you want to be scanned.
	 * @param mimeTypes (Array) Array of mime types for the files in the paths parameter.  Can be null, in which case the mime type will be inferred at scan time.
	 * @param callback (function) A function that will be called when each file is finished being scanned.  Check the callback argument's "path" and "uri" properties to see the path that was scanned and the resulting content uri.
	 * @return void
	 */
	 public static native void scanMediaFiles(JavaScriptObject paths, JavaScriptObject mimeTypes, JavaScriptObject callback) /*-{
		Titanium.Media.Android.scanMediaFiles(paths, mimeTypes, callback);
	}-*/;

	/**
	 * <b>setSystemWallpaper</b>
	 * <p>
	 * (Android only) Set the system homescreen wallpaper
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.7.0
	 * @param image (object) Image blob such as what can be retrieved via callbacks for Titanium.Media.openPhotoGallery and Titanium.Media.showCamera, as well as from the return value of Titanium.Filesystem.File.read.
	 * @param scale (boolean) Set to true if you want the image to be scaled with respect to the system wallpaper desired width, or false to leave it as-is.
	 * @return void
	 */
	 public static native void setSystemWallpaper(JavaScriptObject image, boolean scale) /*-{
		Titanium.Media.Android.setSystemWallpaper(image, scale);
	}-*/;
}
