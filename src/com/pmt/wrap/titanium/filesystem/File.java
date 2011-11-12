package com.pmt.wrap.titanium.filesystem;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Filesystem.File</b>
 * <p>
 * The File object which support various filesystem based operations.
 * <p>
 * <b>Platforms:</b> android iphone ipad 
 * <p>
 * <b>Since:</b> 0.1
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> proxy
 * <p>
 * <b>Returns:</b> null
 */
public class File {

	private JavaScriptObject handler;

	public File(JavaScriptObject handler) {
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
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public native void addEventListener(String name, JavaScriptObject callback) /*-{
		this.@com.pmt.wrap.titanium.filesystem.File::handler.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>createDirectory</b>
	 * <p>
	 * create a directory at the path for the file object
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return boolean
	 */
	 public native boolean createDirectory() /*-{
		return this.@com.pmt.wrap.titanium.filesystem.File::handler.createDirectory();
	}-*/;

	/**
	 * <b>createFile</b>
	 * <p>
	 * create a file path at the path for the file object
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return boolean
	 */
	 public native boolean createFile() /*-{
		return this.@com.pmt.wrap.titanium.filesystem.File::handler.createFile();
	}-*/;

	/**
	 * <b>createTimestamp</b>
	 * <p>
	 * return the created timestamp for the file
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return long
	 */
	 public native int createTimestamp() /*-{
		return this.@com.pmt.wrap.titanium.filesystem.File::handler.createTimestamp();
	}-*/;

	/**
	 * <b>deleteDirectory</b>
	 * <p>
	 * delete the file directory path
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param recursive (boolean) pass true to recursively delete any contents. defaults to false
	 * @return boolean
	 */
	 public native boolean deleteDirectory(boolean recursive) /*-{
		return this.@com.pmt.wrap.titanium.filesystem.File::handler.deleteDirectory(recursive);
	}-*/;

	/**
	 * <b>deleteFile</b>
	 * <p>
	 * delete the file
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return boolean
	 */
	 public native boolean deleteFile() /*-{
		return this.@com.pmt.wrap.titanium.filesystem.File::handler.deleteFile();
	}-*/;

	/**
	 * <b>executable</b>
	 * <p>
	 * returns true if the file is executable
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return boolean
	 */
	 public native boolean executable() /*-{
		return this.@com.pmt.wrap.titanium.filesystem.File::handler.executable();
	}-*/;

	/**
	 * <b>exists</b>
	 * <p>
	 * returns true if the file or directory exists on the device
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return boolean
	 */
	 public native boolean exists() /*-{
		return this.@com.pmt.wrap.titanium.filesystem.File::handler.exists();
	}-*/;

	/**
	 * <b>extension</b>
	 * <p>
	 * return the file extension
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return string
	 */
	 public native String extension() /*-{
		return this.@com.pmt.wrap.titanium.filesystem.File::handler.extension();
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
	 public native void fireEvent(String name, JavaScriptObject event) /*-{
		this.@com.pmt.wrap.titanium.filesystem.File::handler.fireEvent(name, event);
	}-*/;

	/**
	 * <b>getDirectoryListing</b>
	 * <p>
	 * return an array of paths in the directory of the file object
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return array
	 */
	 public native JavaScriptObject getDirectoryListing() /*-{
		return this.@com.pmt.wrap.titanium.filesystem.File::handler.getDirectoryListing();
	}-*/;

	/**
	 * <b>getParent</b>
	 * <p>
	 * return the file parent
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return Titanium.Filesystem.File
	 */
	 public native JavaScriptObject getParent() /*-{
		return this.@com.pmt.wrap.titanium.filesystem.File::handler.getParent();
	}-*/;

	/**
	 * <b>hidden</b>
	 * <p>
	 * returns true if the file is hidden
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return boolean
	 */
	 public native boolean hidden() /*-{
		return this.@com.pmt.wrap.titanium.filesystem.File::handler.hidden();
	}-*/;

	/**
	 * <b>modificationTimestamp</b>
	 * <p>
	 * return the last modification timestamp for the file
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return long
	 */
	 public native int modificationTimestamp() /*-{
		return this.@com.pmt.wrap.titanium.filesystem.File::handler.modificationTimestamp();
	}-*/;

	/**
	 * <b>move</b>
	 * <p>
	 * move the file to another path
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param newpath (string|object) new location
	 * @return boolean
	 */
	 public native boolean move(JavaScriptObject newpath) /*-{
		return this.@com.pmt.wrap.titanium.filesystem.File::handler.move(newpath);
	}-*/;

	/**
	 * <b>name</b>
	 * <p>
	 * the name of the file
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return string
	 */
	 public native String name() /*-{
		return this.@com.pmt.wrap.titanium.filesystem.File::handler.name();
	}-*/;

	/**
	 * <b>nativePath</b>
	 * <p>
	 * returns the fully resolved native path
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return string
	 */
	 public native String nativePath() /*-{
		return this.@com.pmt.wrap.titanium.filesystem.File::handler.nativePath();
	}-*/;

	/**
	 * <b>read</b>
	 * <p>
	 * return the contents of file as blob
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return Titanium.Blob
	 */
	 public native JavaScriptObject read() /*-{
		return this.@com.pmt.wrap.titanium.filesystem.File::handler.read();
	}-*/;

	/**
	 * <b>readonly</b>
	 * <p>
	 * returns true if the file is readonly
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return boolean
	 */
	 public native boolean readonly() /*-{
		return this.@com.pmt.wrap.titanium.filesystem.File::handler.readonly();
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
	 public native void removeEventListener(String name, JavaScriptObject callback) /*-{
		this.@com.pmt.wrap.titanium.filesystem.File::handler.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>rename</b>
	 * <p>
	 * rename the file
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param newname (string) new name
	 * @return boolean
	 */
	 public native boolean rename(String newname) /*-{
		return this.@com.pmt.wrap.titanium.filesystem.File::handler.rename(newname);
	}-*/;

	/**
	 * <b>setExecutable</b>
	 * <p>
	 * make the file executable
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return void
	 */
	 public native void setExecutable() /*-{
		this.@com.pmt.wrap.titanium.filesystem.File::handler.setExecutable();
	}-*/;

	/**
	 * <b>setHidden</b>
	 * <p>
	 * make the file hidden
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return void
	 */
	 public native void setHidden() /*-{
		this.@com.pmt.wrap.titanium.filesystem.File::handler.setHidden();
	}-*/;

	/**
	 * <b>setReadonly</b>
	 * <p>
	 * make the file readonly
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return void
	 */
	 public native void setReadonly() /*-{
		this.@com.pmt.wrap.titanium.filesystem.File::handler.setReadonly();
	}-*/;

	/**
	 * <b>spaceAvailable</b>
	 * <p>
	 * return boolean to indicate if the path has space available for storage
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return boolean
	 */
	 public native boolean spaceAvailable() /*-{
		return this.@com.pmt.wrap.titanium.filesystem.File::handler.spaceAvailable();
	}-*/;

	/**
	 * <b>symbolicLink</b>
	 * <p>
	 * returns true if the file points to a symbolic link
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return boolean
	 */
	 public native boolean symbolicLink() /*-{
		return this.@com.pmt.wrap.titanium.filesystem.File::handler.symbolicLink();
	}-*/;

	/**
	 * <b>write</b>
	 * <p>
	 * write the contents to file.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param contents (string|object) write the contents of string, blob or [[Titanium.Filesystem.File]] to file
	 * @param append (boolean) (optional) append the string to the end of the file.
	 * @return boolean
	 */
	 public native boolean write(JavaScriptObject contents, boolean append) /*-{
		return this.@com.pmt.wrap.titanium.filesystem.File::handler.write(contents, append);
	}-*/;

	/**
	 * <b>writeable</b>
	 * <p>
	 * returns true if the file is writeable
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return boolean
	 */
	 public native boolean writeable() /*-{
		return this.@com.pmt.wrap.titanium.filesystem.File::handler.writeable();
	}-*/;
}
