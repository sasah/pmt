package com.pmt.wrap.titanium.network;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Network.Socket</b>
 * <p>
 * Socket module
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
public class Socket {

	private JavaScriptObject handler;

	public Socket(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>CLOSED</b> (Number) static
	 * <p>
	 * state representing the closed state of a socket
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native int CLOSEDI() /*-{
		return Titanium.Network.Socket.CLOSED;
	}-*/;

	/**
	 * <b>CLOSED</b> (Number) static
	 * <p>
	 * state representing the closed state of a socket
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native double CLOSEDF() /*-{
		return Titanium.Network.Socket.CLOSED;
	}-*/;

	/**
	 * <b>CONNECTED</b> (Number) static
	 * <p>
	 * state representing the connected state of a socket
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native int CONNECTEDI() /*-{
		return Titanium.Network.Socket.CONNECTED;
	}-*/;

	/**
	 * <b>CONNECTED</b> (Number) static
	 * <p>
	 * state representing the connected state of a socket
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native double CONNECTEDF() /*-{
		return Titanium.Network.Socket.CONNECTED;
	}-*/;

	/**
	 * <b>ERROR</b> (Number) static
	 * <p>
	 * state representing the error state of a socket
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native int ERRORI() /*-{
		return Titanium.Network.Socket.ERROR;
	}-*/;

	/**
	 * <b>ERROR</b> (Number) static
	 * <p>
	 * state representing the error state of a socket
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native double ERRORF() /*-{
		return Titanium.Network.Socket.ERROR;
	}-*/;

	/**
	 * <b>INITIALIZED</b> (Number) static
	 * <p>
	 * state representing the initialized state of a socket
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native int INITIALIZEDI() /*-{
		return Titanium.Network.Socket.INITIALIZED;
	}-*/;

	/**
	 * <b>INITIALIZED</b> (Number) static
	 * <p>
	 * state representing the initialized state of a socket
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native double INITIALIZEDF() /*-{
		return Titanium.Network.Socket.INITIALIZED;
	}-*/;

	/**
	 * <b>LISTENING</b> (Number) static
	 * <p>
	 * state representing the listening state of a socket
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native int LISTENINGI() /*-{
		return Titanium.Network.Socket.LISTENING;
	}-*/;

	/**
	 * <b>LISTENING</b> (Number) static
	 * <p>
	 * state representing the listening state of a socket
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public static native double LISTENINGF() /*-{
		return Titanium.Network.Socket.LISTENING;
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
		return Titanium.Network.Socket.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>createTCP</b>
	 * <p>
	 * returns new TCP socket object, takes object containing properties list defined in Titanium.Network.Socket.TCP.  Some properties are only needed based on whether the socket will be a connecting socket or a listening socket.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @param params (Object) creation parameters
	 * @return <a href="Titanium.Network.Socket.TCP.html">Titanium.Network.Socket.TCP</a>
	 */
	 public static native JavaScriptObject createTCP(JavaScriptObject params) /*-{
		return Titanium.Network.Socket.createTCP(params);
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
		return Titanium.Network.Socket.fireEvent(name, event);
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
		return Titanium.Network.Socket.removeEventListener(name, callback);
	}-*/;
}
