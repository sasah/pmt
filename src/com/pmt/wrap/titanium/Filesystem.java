package com.pmt.wrap.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Filesystem</b>
 * <p>
 * The top level Filesystem module.  The Filesystem module is used for reading and saving files and directories on the device.
 * <p>
 * <b>Platforms:</b> android iphone ipad 
 * <p>
 * <b>Since:</b> 0.1
 * <p>
 * <b>Type:</b> module
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> object
 */
public class Filesystem {

	private JavaScriptObject handler;

	public Filesystem(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>MODE_APPEND</b> (int) static
	 * <p>
	 * constant for append mode for file operations
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int MODE_APPEND() /*-{
		return Titanium.Filesystem.MODE_APPEND;
	}-*/;

	/**
	 * <b>MODE_READ</b> (int) static
	 * <p>
	 * constant for read mode for file operations
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int MODE_READ() /*-{
		return Titanium.Filesystem.MODE_READ;
	}-*/;

	/**
	 * <b>MODE_WRITE</b> (int) static
	 * <p>
	 * constant for write mode for file operations
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int MODE_WRITE() /*-{
		return Titanium.Filesystem.MODE_WRITE;
	}-*/;

	/**
	 * <b>applicationDataDirectory</b> (string) static
	 * <p>
	 * readonly constant where your application data directory is located. this directory should be used to place applications-specific files. on iPhone, this directory is also backed up.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getApplicationDataDirectory() /*-{
		return Titanium.Filesystem.applicationDataDirectory;
	}-*/;

	/**
	 * <b>applicationDataDirectory</b> (string) static
	 * <p>
	 * readonly constant where your application data directory is located. this directory should be used to place applications-specific files. on iPhone, this directory is also backed up.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setApplicationDataDirectory(String applicationDataDirectory) /*-{
		Titanium.Filesystem.applicationDataDirectory = applicationDataDirectory;
	}-*/;

	/**
	 * <b>applicationDirectory</b> (string) static
	 * <p>
	 * readonly constant where your application is located
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getApplicationDirectory() /*-{
		return Titanium.Filesystem.applicationDirectory;
	}-*/;

	/**
	 * <b>applicationDirectory</b> (string) static
	 * <p>
	 * readonly constant where your application is located
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setApplicationDirectory(String applicationDirectory) /*-{
		Titanium.Filesystem.applicationDirectory = applicationDirectory;
	}-*/;

	/**
	 * <b>lineEnding</b> (string) static
	 * <p>
	 * readonly platform specific line ending constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getLineEnding() /*-{
		return Titanium.Filesystem.lineEnding;
	}-*/;

	/**
	 * <b>lineEnding</b> (string) static
	 * <p>
	 * readonly platform specific line ending constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setLineEnding(String lineEnding) /*-{
		Titanium.Filesystem.lineEnding = lineEnding;
	}-*/;

	/**
	 * <b>resourcesDirectory</b> (string) static
	 * <p>
	 * readonly constant where your application resources are located
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getResourcesDirectory() /*-{
		return Titanium.Filesystem.resourcesDirectory;
	}-*/;

	/**
	 * <b>resourcesDirectory</b> (string) static
	 * <p>
	 * readonly constant where your application resources are located
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setResourcesDirectory(String resourcesDirectory) /*-{
		Titanium.Filesystem.resourcesDirectory = resourcesDirectory;
	}-*/;

	/**
	 * <b>separator</b> (string) static
	 * <p>
	 * readonly path separator constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getSeparator() /*-{
		return Titanium.Filesystem.separator;
	}-*/;

	/**
	 * <b>separator</b> (string) static
	 * <p>
	 * readonly path separator constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setSeparator(String separator) /*-{
		Titanium.Filesystem.separator = separator;
	}-*/;

	/**
	 * <b>tempDirectory</b> (string) static
	 * <p>
	 * readonly constant where your application can place temporary files
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getTempDirectory() /*-{
		return Titanium.Filesystem.tempDirectory;
	}-*/;

	/**
	 * <b>tempDirectory</b> (string) static
	 * <p>
	 * readonly constant where your application can place temporary files
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setTempDirectory(String tempDirectory) /*-{
		Titanium.Filesystem.tempDirectory = tempDirectory;
	}-*/;

	/**
	 * <b>addEventListener</b>
	 * <p>
	 * add an event listener for the instance to receive view triggered events
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public static native void addEventListener(String name, JavaScriptObject callback) /*-{
		return Titanium.Filesystem.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>createFile</b>
	 * <p>
	 * create and return an instance of Titanium.Filesystem.File
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.Filesystem.File
	 * @return object
	 */
	 public static native JavaScriptObject createFile(JavaScriptObject parameters) /*-{
		return Titanium.Filesystem.createFile(parameters);
	}-*/;

	/**
	 * <b>createTempDirectory</b>
	 * <p>
	 * create temp file and return a Titanium.Filesystem.File
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return Titanium.Filesystem.File
	 */
	 public static native JavaScriptObject createTempDirectory() /*-{
		return Titanium.Filesystem.createTempDirectory();
	}-*/;

	/**
	 * <b>createTempFile</b>
	 * <p>
	 * create a temp file and return a Titanium.Filesystem.File
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return Titanium.Filesystem.File
	 */
	 public static native JavaScriptObject createTempFile() /*-{
		return Titanium.Filesystem.createTempFile();
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public static native void fireEvent(String name, JavaScriptObject event) /*-{
		return Titanium.Filesystem.fireEvent(name, event);
	}-*/;

	/**
	 * <b>getFile</b>
	 * <p>
	 * return a fully formed file path as a Titanium.Filesystem.File object
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param path (string) one or more path arguments to form the full path joined together with the platform specific path separator. if a relative path is passed, the full path will be relative to the application resource folder.
	 * @return Titanium.Filesystem.File
	 */
	 public static native JavaScriptObject getFile(String path) /*-{
		return Titanium.Filesystem.getFile(path);
	}-*/;

	/**
	 * <b>isExternalStoragePresent</b>
	 * <p>
	 * returns true if the android device supports external storage such as an SD card. Returns false on iOS.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return boolean
	 */
	 public static native boolean isExternalStoragePresent() /*-{
		return Titanium.Filesystem.isExternalStoragePresent();
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public static native void removeEventListener(String name, JavaScriptObject callback) /*-{
		return Titanium.Filesystem.removeEventListener(name, callback);
	}-*/;
}
