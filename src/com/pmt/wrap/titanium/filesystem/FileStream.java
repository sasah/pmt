package com.pmt.wrap.titanium.filesystem;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Filesystem.FileStream</b>
 * <p>
 * Wrapper around Titanium.Filesystem.File that implements the Titanium.IOStream interface.
 * <p>
 * <b>Platforms:</b> iphone android ipad 
 * <p>
 * <b>Since:</b> 1.7
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class FileStream {

	private JavaScriptObject handler;

	public FileStream(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>close</b>
	 * <p>
	 * closes stream and throws exception on error
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @return void
	 */
	 public native void close() /*-{
		return this.@com.pmt.wrap.titanium.filesystem.FileStream::handler.close();
	}-*/;

	/**
	 * <b>isReadable</b>
	 * <p>
	 * reads true if stream is readable, false otherwise
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @return Boolean
	 */
	 public native boolean isReadable() /*-{
		return this.@com.pmt.wrap.titanium.filesystem.FileStream::handler.isReadable();
	}-*/;

	/**
	 * <b>isWriteable</b>
	 * <p>
	 * reads true if stream is writeable, false otherwise
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @return Boolean
	 */
	 public native boolean isWriteable() /*-{
		return this.@com.pmt.wrap.titanium.filesystem.FileStream::handler.isWriteable();
	}-*/;

	/**
	 * <b>read</b>
	 * <p>
	 * reads data from stream into a buffer.  Optional offset and length arguments to specify position in buffer in whichto start writing the read data, and the amount of data to read.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @param buffer (<a href="Titanium.Buffer-object.html">Titanium.Buffer</a>) buffer to read stream data into
	 * @param offset (Number) (Optional) offset to start reading buffer data from
	 * @param length (Number) (Optional) length of data to read from buffer
	 * @return Number
	 */
	 public native double read(JavaScriptObject buffer, double offset, double length) /*-{
		return this.@com.pmt.wrap.titanium.filesystem.FileStream::handler.read(buffer, offset, length);
	}-*/;

	/**
	 * <b>write</b>
	 * <p>
	 * writes data from buffer to stream. Optional offset and length arguments to specify position in buffer in which to start reading data that is written to the stream, and the length of the data to take from the buffer.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @param buffer (<a href="Titanium.Buffer-object.html">Titanium.Buffer</a>) buffer to write to stream
	 * @param offset (Number) (Optional) offset to start writing buffer data from
	 * @param length (Number) (Optional) length of data to write from buffer
	 * @return Number
	 */
	 public native double write(JavaScriptObject buffer, double offset, double length) /*-{
		return this.@com.pmt.wrap.titanium.filesystem.FileStream::handler.write(buffer, offset, length);
	}-*/;
}
