package com.pmt.wrap.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.XML</b>
 * <p>
 * The top level XML module.  The XML module is used parsing and processing XML-based content.
 * <p>
 * <b>Platforms:</b> android iphone ipad 
 * <p>
 * <b>Since:</b> 0.9
 * <p>
 * <b>Type:</b> module
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class XML {

	private JavaScriptObject handler;

	public XML(JavaScriptObject handler) {
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
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public static native void addEventListener(String name, JavaScriptObject callback) /*-{
		Titanium.XML.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public static native void fireEvent(String name, JavaScriptObject event) /*-{
		Titanium.XML.fireEvent(name, event);
	}-*/;

	/**
	 * <b>parseString</b>
	 * <p>
	 * parse an XML string into a DOMDocument
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param xml (string) the XML content as a string
	 * @return object
	 */
	 public static native JavaScriptObject parseString(String xml) /*-{
		return Titanium.XML.parseString(xml);
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public static native void removeEventListener(String name, JavaScriptObject callback) /*-{
		Titanium.XML.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>serializeToString</b>
	 * <p>
	 * serialize a DOMDocument or DOMNode and its descendants into an XML string
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param node (DOMNode) the XML DOMNode or DOMDocument to serialize
	 * @return string
	 */
	 public static native String serializeToString(JavaScriptObject node) /*-{
		return Titanium.XML.serializeToString(node);
	}-*/;
}
