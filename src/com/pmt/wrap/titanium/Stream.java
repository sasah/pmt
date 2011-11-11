package com.pmt.wrap.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Stream</b>
 * <p>
 * Stream module containing stream utility methods
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
public class Stream {

	private JavaScriptObject handler;

	public Stream(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>MODE_APPEND</b> (Number) static
	 * <p>
	 * append mode value.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native int MODE_APPENDI() /*-{
		return Titanium.Stream.MODE_APPEND;
	}-*/;

	/**
	 * <b>MODE_APPEND</b> (Number) static
	 * <p>
	 * append mode value.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native double MODE_APPENDF() /*-{
		return Titanium.Stream.MODE_APPEND;
	}-*/;

	/**
	 * <b>MODE_READ</b> (Number) static
	 * <p>
	 * read only mode value
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native int MODE_READI() /*-{
		return Titanium.Stream.MODE_READ;
	}-*/;

	/**
	 * <b>MODE_READ</b> (Number) static
	 * <p>
	 * read only mode value
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native double MODE_READF() /*-{
		return Titanium.Stream.MODE_READ;
	}-*/;

	/**
	 * <b>MODE_WRITE</b> (Number) static
	 * <p>
	 * write mode value
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native int MODE_WRITEI() /*-{
		return Titanium.Stream.MODE_WRITE;
	}-*/;

	/**
	 * <b>MODE_WRITE</b> (Number) static
	 * <p>
	 * write mode value
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native double MODE_WRITEF() /*-{
		return Titanium.Stream.MODE_WRITE;
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
		return Titanium.Stream.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>createStream</b>
	 * <p>
	 * Creates stream from specified container.  Returns Titanium.BufferStream or Titanium.BlobStream depending on whether a Buffer or Blob is provided as the 'source' property in params.  Write and append mode only applies to Buffer as Blob is read only.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @param params (Object) creation arguments, which are: source, a Titanium.Buffer or Titanium.Blob on which to base the stream.  mode,  mode for the stream to be opened in, which can be Titanium.Stream.MODE_READ,  Titanium.Stream.MODE_WRITE or Titanium.Stream.MODE_APPEND.
	 * @return <a href="Titanium.IOStream-object.html">Titanium.IOStream</a>
	 */
	 public static native JavaScriptObject createStream(JavaScriptObject params) /*-{
		return Titanium.Stream.createStream(params);
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
		return Titanium.Stream.fireEvent(name, event);
	}-*/;

	/**
	 * <b>pump</b>
	 * <p>
	 * Pumps data from input stream to handler method
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @param inputStream (Titanium.IOStream) Stream to pump from
	 * @param handler (Function) handler method that will receive the pumped data.  The function takes a single parameter, which in turn contains the following members: source, the stream being read from.  buffer, the Titanium.Buffer holding the data currently being pumped to the handler method (i.e., the current chunk).  bytesProcessed, the number of bytes in the current pump segment.  totalBytesProcessed, total number of bytes processed in the overall pump operation so far.  errorState, an error state if any.  errorDescription, an error description if any.
	 * @param maxChunkSize (Number) max size of data to pump from inputStream to the handler method at once
	 * @param isAsync (Boolean) true is pump operation should be async, false is not.  (Optional, default is false).
	 * @return void
	 */
	 public static native void pump(JavaScriptObject inputStream, JavaScriptObject handler, double maxChunkSize, boolean isAsync) /*-{
		return Titanium.Stream.pump(inputStream, handler, maxChunkSize, isAsync);
	}-*/;

	/**
	 * <b>read</b>
	 * <p>
	 * Async version of read on Titanium.IOStream
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @param sourceStream (Titanium.IOStream) Stream to read from
	 * @param buffer (Titanium.Buffer) Buffer to read into
	 * @param offset (Number) (optional) offset to start reading buffer data from.  Default = 0.
	 * @param length (Number) (optional) length of data to read from buffer.  Default is buffer length.
	 * @param resultsCallback (Function) called with result of the read operation.  Callback parameter has these members: source, the stream being read.  bytesProcessed, the number of bytes read.  errorState, an error state if any.  errorDescription, an error description if any.
	 * @return void
	 */
	 public static native void read(JavaScriptObject sourceStream, JavaScriptObject buffer, double offset, double length, JavaScriptObject resultsCallback) /*-{
		return Titanium.Stream.read(sourceStream, buffer, offset, length, resultsCallback);
	}-*/;

	/**
	 * <b>readAll</b>
	 * <p>
	 * reads all data from Titanium.IOStream.  If you pass a buffer and callback, the read will be asynchronous and readAll won't return anything.  If you don't pass a buffer and callback, the read will be synchronous and a Titanium.Buffer with the read data will be returned.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @param sourceStream (Titanium.IOStream) Stream to read from
	 * @param buffer (Titanium.Buffer) Buffer to read into.  OPTIONAL: use only if you want an asynchronous read.
	 * @param resultsCallback (Function) called with result of the read operation.  OPTIONAL: use only if you want an asynchronous read.  Callback parameter has these members: source, the stream being read.  bytesProcessed, the number of bytes read.  errorState, an error state if any.  errorDescription, an error description if any.
	 * @return void
	 */
	 public static native void readAll(JavaScriptObject sourceStream, JavaScriptObject buffer, JavaScriptObject resultsCallback) /*-{
		return Titanium.Stream.readAll(sourceStream, buffer, resultsCallback);
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
		return Titanium.Stream.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>write</b>
	 * <p>
	 * Async version of write on Titanium.IOStream that takes offset and length
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @param outputStream (Titanium.IOStream) Stream to write to
	 * @param buffer (Titanium.Buffer) Buffer to write from
	 * @param offset (Number) offset to start writing buffer data from. (Optional, default is 0).
	 * @param length (Number) length of data to write from buffer.  (Optional, default is buffer.length).
	 * @param resultsCallback (Function) called with result of the write operation. Callback parameter has these members: source, the stream being written to.  bytesProcessed, the number of bytes written.  errorState, an error state if any.  errorDescription, an error description if any.
	 * @return void
	 */
	 public static native void write(JavaScriptObject outputStream, JavaScriptObject buffer, double offset, double length, JavaScriptObject resultsCallback) /*-{
		return Titanium.Stream.write(outputStream, buffer, offset, length, resultsCallback);
	}-*/;

	/**
	 * <b>writeStream</b>
	 * <p>
	 * Writes all data from input stream to output stream.  Pass a callback function as the final argument if you wish for the write operation to be asynchronous.  The synchronous version will return a number indicating the number of bytes written.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @param inputStream (Titanium.IOStream) Stream to read from
	 * @param outputStream (Titanium.IOStream) Stream to write to
	 * @param maxChunkSize (Number) max size of data to write from inputStream to ouputStream at once
	 * @param resultsCallback (Function) called with result of the writeStream operation.  (OPTIONAL: use only if you want the write operation to be asynchronous).  The callback parameter has these members: fromStream, the stream being read from.  toStream, the stream being written to.  bytesProcessed, the number of bytes read and written.  errorState, an error state if any.  errorDescription, an error description if any.
	 * @return void
	 */
	 public static native void writeStream(JavaScriptObject inputStream, JavaScriptObject outputStream, double maxChunkSize, JavaScriptObject resultsCallback) /*-{
		return Titanium.Stream.writeStream(inputStream, outputStream, maxChunkSize, resultsCallback);
	}-*/;
}
