package com.pmt.wrap.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Codec</b>
 * <p>
 * A module for converting Numbers and Strings to and from a Titanium.Buffer.
 * <p>
 * <b>Platforms:</b> iphone android ipad 
 * <p>
 * <b>Since:</b> 1.7
 * <p>
 * <b>Type:</b> module
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class Codec {

	private JavaScriptObject handler;

	public Codec(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>BIG_ENDIAN</b> (Number) static
	 * <p>
	 * Big Endian (network) byte order, i.e. most significant byte first.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native int BIG_ENDIANI() /*-{
		return Titanium.Codec.BIG_ENDIAN;
	}-*/;

	/**
	 * <b>BIG_ENDIAN</b> (Number) static
	 * <p>
	 * Big Endian (network) byte order, i.e. most significant byte first.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native double BIG_ENDIANF() /*-{
		return Titanium.Codec.BIG_ENDIAN;
	}-*/;

	/**
	 * <b>CHARSET_ASCII</b> (String) static
	 * <p>
	 * The ASCII Character Set
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native String CHARSET_ASCII() /*-{
		return Titanium.Codec.CHARSET_ASCII;
	}-*/;

	/**
	 * <b>CHARSET_ISO_LATIN1</b> (String) static
	 * <p>
	 * The ISO 8859-1 (LATIN-1) Character Set
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native String CHARSET_ISO_LATIN1() /*-{
		return Titanium.Codec.CHARSET_ISO_LATIN1;
	}-*/;

	/**
	 * <b>CHARSET_UTF16</b> (String) static
	 * <p>
	 * The UTF-16 Character Set
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native String CHARSET_UTF16() /*-{
		return Titanium.Codec.CHARSET_UTF16;
	}-*/;

	/**
	 * <b>CHARSET_UTF16BE</b> (String) static
	 * <p>
	 * The UTF-16 Character Set with Big Endian byte order
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native String CHARSET_UTF16BE() /*-{
		return Titanium.Codec.CHARSET_UTF16BE;
	}-*/;

	/**
	 * <b>CHARSET_UTF16LE</b> (String) static
	 * <p>
	 * The UTF-16 Character Set with Little Endian byte order
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native String CHARSET_UTF16LE() /*-{
		return Titanium.Codec.CHARSET_UTF16LE;
	}-*/;

	/**
	 * <b>CHARSET_UTF8</b> (String) static
	 * <p>
	 * The UTF-8 Character Set
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native String CHARSET_UTF8() /*-{
		return Titanium.Codec.CHARSET_UTF8;
	}-*/;

	/**
	 * <b>LITTLE_ENDIAN</b> (Number) static
	 * <p>
	 * Little Endian byte order, i.e. least significant byte first.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native int LITTLE_ENDIANI() /*-{
		return Titanium.Codec.LITTLE_ENDIAN;
	}-*/;

	/**
	 * <b>LITTLE_ENDIAN</b> (Number) static
	 * <p>
	 * Little Endian byte order, i.e. least significant byte first.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native double LITTLE_ENDIANF() /*-{
		return Titanium.Codec.LITTLE_ENDIAN;
	}-*/;

	/**
	 * <b>TYPE_BYTE</b> (String) static
	 * <p>
	 * 8 bit integer encoding type
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native String TYPE_BYTE() /*-{
		return Titanium.Codec.TYPE_BYTE;
	}-*/;

	/**
	 * <b>TYPE_DOUBLE</b> (String) static
	 * <p>
	 * 64 bit double precision floating-point type
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native String TYPE_DOUBLE() /*-{
		return Titanium.Codec.TYPE_DOUBLE;
	}-*/;

	/**
	 * <b>TYPE_FLOAT</b> (String) static
	 * <p>
	 * 32 bit single precision floating-point type
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native String TYPE_FLOAT() /*-{
		return Titanium.Codec.TYPE_FLOAT;
	}-*/;

	/**
	 * <b>TYPE_INT</b> (String) static
	 * <p>
	 * 32 bit integer encoding type
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native String TYPE_INT() /*-{
		return Titanium.Codec.TYPE_INT;
	}-*/;

	/**
	 * <b>TYPE_LONG</b> (String) static
	 * <p>
	 * 64 bit integer encoding type
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native String TYPE_LONG() /*-{
		return Titanium.Codec.TYPE_LONG;
	}-*/;

	/**
	 * <b>TYPE_SHORT</b> (String) static
	 * <p>
	 * 16 bit integer encoding type
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native String TYPE_SHORT() /*-{
		return Titanium.Codec.TYPE_SHORT;
	}-*/;

	/**
	 * <b>addEventListener</b>
	 * <p>
	 * add an event listener for the instance to receive view triggered events
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public static native void addEventListener(String name, JavaScriptObject callback) /*-{
		Titanium.Codec.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>decodeNumber</b>
	 * <p>
	 * Decodes the source buffer (starting at the optional position) into a number using the passed in data type.  Throws an Exception if source is null, or position is greater than source.length
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @param options (Object) decodeNumber named options.  These are: source, the Titanium.Buffer to decode.  type, the encoding type to use, which must be one of Titanium.Codec.TYPE_BYTE, Titanium.Codec.TYPE_SHORT, Titanium.Codec.TYPE_INT, Titanium.Codec.TYPE_FLOAT, Titanium.Codec.TYPE_LONG, or Titanium.Codec.TYPE_DOUBLE.  position, the position in source to start at (optional, default is 0).  byteOrder, the byte order to decode with (optional, default is Titanium.Codec.getNativeByteOrder).
	 * @return Number
	 */
	 public static native double decodeNumber(JavaScriptObject options) /*-{
		return Titanium.Codec.decodeNumber(options);
	}-*/;

	/**
	 * <b>decodeString</b>
	 * <p>
	 * Decodes the source buffer into a String starting at position, with length bytes, using the supplied character set charset. Throws an Exception if charset is not a valid character set, source is null, or either position, length, or position+length is greater than source.length.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @param options (Object) decodeString named options.  These are: source, the Titanium.Buffer to decode.  position, the position to start decoding (optional, default is 0).  length, the number of bytes to decode (optional, default is the length of the source buffer).  charset, the character set to decode from (optional, default is Titanium.Codec.CHARSET_UTF8).
	 * @return String
	 */
	 public static native String decodeString(JavaScriptObject options) /*-{
		return Titanium.Codec.decodeString(options);
	}-*/;

	/**
	 * <b>encodeNumber</b>
	 * <p>
	 * Encodes the Number source into dest using the passed in data type.  Returns the position after the encoded number in dest.'
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @param options (Object) encodeNumber named options.  These are: source, the number to be encoded.  dest, the destination Titanium.Buffer into which the encoded number will be written.  type, the encoding type to use, which must be one of Titanium.Codec.TYPE_BYTE, Titanium.Codec.TYPE_SHORT, Titanium.Codec.TYPE_INT, Titanium.Codec.TYPE_FLOAT, Titanium.Codec.TYPE_LONG, or Titanium.Codec.TYPE_DOUBLE.  position, the position in dest to set the encoded data (optional, default is 0).  byteOrder, the byte order to encode with (optional, default is Titanium.Codec.getNativeByteOrder).
	 * @return Number
	 */
	 public static native double encodeNumber(JavaScriptObject options) /*-{
		return Titanium.Codec.encodeNumber(options);
	}-*/;

	/**
	 * <b>encodeString</b>
	 * <p>
	 * Encodes the String source into dest using charset. Returns the position after the encoded String inside dest.' Throws an Exception if charset is not a valid character set, source is null, or either sourcePosition, sourceLength, or sourcePosition+sourceLength is greater than source.length.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @param options (Object) encodeString named options.  These are: source, the source string to encode.  dest, the destination Titanium.Buffer.  destPosition, the position in dest to set the encoded string (optional, default is 0).  sourcePosition, the position in source to start encoding (optional, default is 0).  sourceLength, the number of characters in source to encode (optional, default is the length of the source).  charset, the character set to use when encoding this string to bytes (optional, default is Titanium.Codec.CHARSET_UTF8).
	 * @return Number
	 */
	 public static native double encodeString(JavaScriptObject options) /*-{
		return Titanium.Codec.encodeString(options);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public static native void fireEvent(String name, JavaScriptObject event) /*-{
		Titanium.Codec.fireEvent(name, event);
	}-*/;

	/**
	 * <b>getNativeByteOrder</b>
	 * <p>
	 * Get the OS native byte order (either Titanium.Codec.BIG_ENDIAN or Titanium.Codec.LITTLE_ENDIAN)
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @return Number
	 */
	 public static native double getNativeByteOrder() /*-{
		return Titanium.Codec.getNativeByteOrder();
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public static native void removeEventListener(String name, JavaScriptObject callback) /*-{
		Titanium.Codec.removeEventListener(name, callback);
	}-*/;
}
