package com.pmt.wrap.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Buffer</b>
 * <p>
 * Buffer is a container for raw data. A buffer is created by the method Titanium.createBuffer.
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
public class Buffer {

	private JavaScriptObject handler;

	public Buffer(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>byteOrder</b> (Number)
	 * <p>
	 * The byte order of this buffer. The OS native byte order is used by default.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native int getByteOrderI() /*-{
		return this.@com.pmt.wrap.titanium.Buffer::handler.byteOrder;
	}-*/;

	/**
	 * <b>byteOrder</b> (Number)
	 * <p>
	 * The byte order of this buffer. The OS native byte order is used by default.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native void setByteOrder(int byteOrder) /*-{
		this.@com.pmt.wrap.titanium.Buffer::handler.byteOrder = byteOrder;
	}-*/;

	/**
	 * <b>byteOrder</b> (Number)
	 * <p>
	 * The byte order of this buffer. The OS native byte order is used by default.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native double getByteOrderF() /*-{
		return this.@com.pmt.wrap.titanium.Buffer::handler.byteOrder;
	}-*/;

	/**
	 * <b>byteOrder</b> (Number)
	 * <p>
	 * The byte order of this buffer. The OS native byte order is used by default.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native void setByteOrder(double byteOrder) /*-{
		this.@com.pmt.wrap.titanium.Buffer::handler.byteOrder = byteOrder;
	}-*/;

	/**
	 * <b>length</b> (Number)
	 * <p>
	 * The length of the buffer in bytes. When length is modified the buffer will be re-sized while preserving existing data where possible. If the new buffer length is smaller than the length of the existing data then the existing data will be truncated down to the size of the new buffer.  Resizing the buffer via setting length should be used sparingly due to the associated overhead.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native int getLengthI() /*-{
		return this.@com.pmt.wrap.titanium.Buffer::handler.length;
	}-*/;

	/**
	 * <b>length</b> (Number)
	 * <p>
	 * The length of the buffer in bytes. When length is modified the buffer will be re-sized while preserving existing data where possible. If the new buffer length is smaller than the length of the existing data then the existing data will be truncated down to the size of the new buffer.  Resizing the buffer via setting length should be used sparingly due to the associated overhead.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native void setLength(int length) /*-{
		this.@com.pmt.wrap.titanium.Buffer::handler.length = length;
	}-*/;

	/**
	 * <b>length</b> (Number)
	 * <p>
	 * The length of the buffer in bytes. When length is modified the buffer will be re-sized while preserving existing data where possible. If the new buffer length is smaller than the length of the existing data then the existing data will be truncated down to the size of the new buffer.  Resizing the buffer via setting length should be used sparingly due to the associated overhead.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native double getLengthF() /*-{
		return this.@com.pmt.wrap.titanium.Buffer::handler.length;
	}-*/;

	/**
	 * <b>length</b> (Number)
	 * <p>
	 * The length of the buffer in bytes. When length is modified the buffer will be re-sized while preserving existing data where possible. If the new buffer length is smaller than the length of the existing data then the existing data will be truncated down to the size of the new buffer.  Resizing the buffer via setting length should be used sparingly due to the associated overhead.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native void setLength(double length) /*-{
		this.@com.pmt.wrap.titanium.Buffer::handler.length = length;
	}-*/;

	/**
	 * <b>type</b> (String)
	 * <p>
	 * The type of data encoding to use with value. Required when value is a Number. When value is a String, Titanium.Codec.CHARSET_UTF8 is the default.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native String getType() /*-{
		return this.@com.pmt.wrap.titanium.Buffer::handler.type;
	}-*/;

	/**
	 * <b>type</b> (String)
	 * <p>
	 * The type of data encoding to use with value. Required when value is a Number. When value is a String, Titanium.Codec.CHARSET_UTF8 is the default.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native void setType(String type) /*-{
		this.@com.pmt.wrap.titanium.Buffer::handler.type = type;
	}-*/;

	/**
	 * <b>value</b> (Number, String)
	 * <p>
	 * Data to be encoded. If value is a Number, type must also be set. (this is simply a convenient way of calling Titanium.Codec.encodeString or Titanium.Codec.encodeNumber).
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native int getValueI() /*-{
		return this.@com.pmt.wrap.titanium.Buffer::handler.value;
	}-*/;

	/**
	 * <b>value</b> (Number, String)
	 * <p>
	 * Data to be encoded. If value is a Number, type must also be set. (this is simply a convenient way of calling Titanium.Codec.encodeString or Titanium.Codec.encodeNumber).
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native void setValue(int value) /*-{
		this.@com.pmt.wrap.titanium.Buffer::handler.value = value;
	}-*/;

	/**
	 * <b>value</b> (Number, String)
	 * <p>
	 * Data to be encoded. If value is a Number, type must also be set. (this is simply a convenient way of calling Titanium.Codec.encodeString or Titanium.Codec.encodeNumber).
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native double getValueF() /*-{
		return this.@com.pmt.wrap.titanium.Buffer::handler.value;
	}-*/;

	/**
	 * <b>value</b> (Number, String)
	 * <p>
	 * Data to be encoded. If value is a Number, type must also be set. (this is simply a convenient way of calling Titanium.Codec.encodeString or Titanium.Codec.encodeNumber).
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native void setValue(double value) /*-{
		this.@com.pmt.wrap.titanium.Buffer::handler.value = value;
	}-*/;

	/**
	 * <b>value</b> (Number, String)
	 * <p>
	 * Data to be encoded. If value is a Number, type must also be set. (this is simply a convenient way of calling Titanium.Codec.encodeString or Titanium.Codec.encodeNumber).
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native String getValueS() /*-{
		return this.@com.pmt.wrap.titanium.Buffer::handler.value;
	}-*/;

	/**
	 * <b>value</b> (Number, String)
	 * <p>
	 * Data to be encoded. If value is a Number, type must also be set. (this is simply a convenient way of calling Titanium.Codec.encodeString or Titanium.Codec.encodeNumber).
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native void setValue(String value) /*-{
		this.@com.pmt.wrap.titanium.Buffer::handler.value = value;
	}-*/;

	/**
	 * <b>append</b>
	 * <p>
	 * appends sourceBuffer to the current buffer.  Buffer is grown dynamically to accommodate the additional data if need be.  returns the number of bytes appended. Optional offset and length arguments to specify from where in -- and how much of -- source buffer to take.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @param sourceBuffer (Titanium.Buffer) buffer to append to current buffer
	 * @param sourceOffset (Number) (Optional) offset to start reading buffer data from
	 * @param sourceLength (Number) (Optional) length of data to read from buffer
	 * @return Number
	 */
	 public native double append(JavaScriptObject sourceBuffer, double sourceOffset, double sourceLength) /*-{
		return this.@com.pmt.wrap.titanium.Buffer::handler.append(sourceBuffer, sourceOffset, sourceLength);
	}-*/;

	/**
	 * <b>clear</b>
	 * <p>
	 * Clears buffer contents but does not change the size of the buffer
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @return void
	 */
	 public native void clear() /*-{
		return this.@com.pmt.wrap.titanium.Buffer::handler.clear();
	}-*/;

	/**
	 * <b>clone</b>
	 * <p>
	 * create new copy of the current buffer.  Optional offset and length arguments to specify from where in -- and how much of -- source buffer to take.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @param offset (Number) (Optional) offset of buffer to start clone
	 * @param length (Number) (Optional) length of buffer data starting at offset to clone
	 * @return <a href="Titanium.Buffer-object.html">Titanium.Buffer</a>
	 */
	 public native JavaScriptObject clone(double offset, double length) /*-{
		return this.@com.pmt.wrap.titanium.Buffer::handler.clone(offset, length);
	}-*/;

	/**
	 * <b>copy</b>
	 * <p>
	 * copies the contents of sourceBuffer into the current buffer at offset.  will not expand buffer if there is not enough room in the current buffer to accomodate all the requested data from sourceBuffer.  returns the number of bytes copied.  Optional sourceOffset and length arguments to specify from where in -- and how much of -- source buffer to take.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @param sourceBuffer (Titanium.Buffer) buffer to copy into current buffer
	 * @param offset (Number) offset to copy new buffer at
	 * @param sourceOffset (Number) (Optional) offset of sourceBuffer to copy data from
	 * @param sourceLength (Number) (Optional) length of data from sourceBuffer to copy
	 * @return Number
	 */
	 public native double copy(JavaScriptObject sourceBuffer, double offset, double sourceOffset, double sourceLength) /*-{
		return this.@com.pmt.wrap.titanium.Buffer::handler.copy(sourceBuffer, offset, sourceOffset, sourceLength);
	}-*/;

	/**
	 * <b>fill</b>
	 * <p>
	 * fills buffer with fillByte.  Optional offset and length arguments to specify that filling should occur starting at particular offset and finish when length bytes have been written or the end of the buffer is reached.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @param fillByte (Number) byte to fill buffer with
	 * @param offset (Number) (Optional) offset of where to start fill
	 * @param length (Number) (Optional) number of bytes to fill
	 * @return void
	 */
	 public native void fill(double fillByte, double offset, double length) /*-{
		return this.@com.pmt.wrap.titanium.Buffer::handler.fill(fillByte, offset, length);
	}-*/;

	/**
	 * <b>insert</b>
	 * <p>
	 * inserts sourceBuffer into the current buffer at offset.  Buffer is grown to accommodate the new data.  returns the number of bytes inserted.  Optional sourceOffset and length arguments to specify from where in -- and how much of -- source buffer to take.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @param sourceBuffer (Titanium.Buffer) buffer to insert into current buffer
	 * @param offset (Number) offset to insert new buffer at
	 * @param sourceOffset (Number) (Optional) offset of sourceBuffer to insert data from
	 * @param sourceLength (Number) (Optional) length of data from sourceBuffer to insert
	 * @return Number
	 */
	 public native double insert(JavaScriptObject sourceBuffer, double offset, double sourceOffset, double sourceLength) /*-{
		return this.@com.pmt.wrap.titanium.Buffer::handler.insert(sourceBuffer, offset, sourceOffset, sourceLength);
	}-*/;

	/**
	 * <b>release</b>
	 * <p>
	 * Releases the space allocated to the buffer, sets length to 0.  This is effectively the same as buffer.length = 0
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @return void
	 */
	 public native void release() /*-{
		return this.@com.pmt.wrap.titanium.Buffer::handler.release();
	}-*/;

	/**
	 * <b>toBlob</b>
	 * <p>
	 * Converts this buffer to a Titanium.Blob
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @return <a href="Titanium.Blob-object.html">Titanium.Blob</a>
	 */
	 public native JavaScriptObject toBlob() /*-{
		return this.@com.pmt.wrap.titanium.Buffer::handler.toBlob();
	}-*/;

	/**
	 * <b>toString</b>
	 * <p>
	 * Converts this buffer to a String
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @return String
	 */
	 public native String toString() /*-{
		return this.@com.pmt.wrap.titanium.Buffer::handler.toString();
	}-*/;
}
