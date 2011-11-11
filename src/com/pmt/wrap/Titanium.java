package com.pmt.wrap;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium</b>
 * <p>
 * The top level Titanium module.
 * <p>
 * <b>Platforms:</b> android iphone ipad 
 * <p>
 * <b>Since:</b> 0.1
 * <p>
 * <b>Type:</b> module
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class Titanium {

	private JavaScriptObject handler;

	public Titanium(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>userAgent</b> (string) static
	 * <p>
	 * the user-agent string used by Titanium
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getUserAgent() /*-{
		return Titanium.userAgent;
	}-*/;

	/**
	 * <b>userAgent</b> (string) static
	 * <p>
	 * the user-agent string used by Titanium
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setUserAgent(String userAgent) /*-{
		Titanium.userAgent = userAgent;
	}-*/;

	/**
	 * <b>version</b> (string) static
	 * <p>
	 * the version of Titanium that is executing
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getVersion() /*-{
		return Titanium.version;
	}-*/;

	/**
	 * <b>version</b> (string) static
	 * <p>
	 * the version of Titanium that is executing
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setVersion(String version) /*-{
		Titanium.version = version;
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
		return Titanium.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>createBlob</b>
	 * <p>
	 * create and return an instance of Titanium.Blob
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param parameters (object) (optional) a dictionary object properties defined in <a href="Titanium.Blob.html">Titanium.Blob</a>
	 * @return object
	 */
	 public static native JavaScriptObject createBlob(JavaScriptObject parameters) /*-{
		return Titanium.createBlob(parameters);
	}-*/;

	/**
	 * <b>createBuffer</b>
	 * <p>
	 * creates a new buffer based on the params
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param params (object) Key value pairs.  You can include: <tt>value</tt>, an optional initial value which will be encoded and placed in the buffer.  If value is a Number, <tt>type</tt> must also be set. This is simply a convenient way of calling <a href="Titanium.Codec.encodeString.html">Titanium.Codec.encodeString</a> or <a href="Titanium.Codec.encodeNumber.html">Titanium.Codec.encodeNumber</a> and placing the encoded value in the returned buffer.  <tt>length</tt>: the length of the buffer, with a default of 0 unless <tt>value</tt> is specified, in which case the length of the encoded <tt>value</tt>.  <tt>type</tt>, the type of data encoding to use with <tt>value</tt>, with <a href="Titanium.Codec.CHARSET_UTF8.html">Titanium.Codec.CHARSET_UTF8</a> being the default if <tt>value</tt> is a String, else this argument is required in the case of <tt>value</tt> being a number.  <tt>byteOrder</tt>, the byte order of this buffer, with the default being the OS native byte order is used by default (see <a href="Titanium.Codec.getNativeByteOrder.html">Titanium.Codec.getNativeByteOrder</a>).
	 * @return <a href="Titanium.Buffer-object.html">Titanium.Buffer</a>
	 */
	 public static native JavaScriptObject createBuffer(JavaScriptObject params) /*-{
		return Titanium.createBuffer(params);
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
		return Titanium.fireEvent(name, event);
	}-*/;

	/**
	 * <b>include</b>
	 * <p>
	 * one or more filenames to include as if the Javascript code was written in place.  This is similar to a C #include function.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param name (string) filename to include
	 * @return void
	 */
	 public static native void include(String name) /*-{
		return Titanium.include(name);
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
		return Titanium.removeEventListener(name, callback);
	}-*/;
}
