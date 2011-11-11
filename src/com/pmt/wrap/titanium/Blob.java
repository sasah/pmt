package com.pmt.wrap.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Blob</b>
 * <p>
 * The blob is an abstract data type that represents binary information, often obtained through HTTPClient or via files. It often is used to store text or the actual data of an image.
 * <p>
 * <b>Platforms:</b> android iphone ipad 
 * <p>
 * <b>Since:</b> 0.9
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class Blob {

	private JavaScriptObject handler;

	public Blob(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>imageAsThumbnail</b>
	 * <p>
	 * Generate a thumbnail version of an image, optionally with a border and rounded corners (currently iPhone/iPad only)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param size (int) the size of the thumbnail, in either width or height
	 * @param borderSize (int) the optional width of the thumbnail's border. The default is 1.
	 * @param cornerRadius (int) the radius of the thumbnail's corners. The default is 0.
	 * @return object
	 */
	 public native JavaScriptObject imageAsThumbnail(int size, int borderSize, int cornerRadius) /*-{
		return this.@com.pmt.wrap.titanium.Blob::handler.imageAsThumbnail(size, borderSize, cornerRadius);
	}-*/;
}
