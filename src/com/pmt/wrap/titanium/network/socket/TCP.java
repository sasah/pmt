package com.pmt.wrap.titanium.network.socket;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Network.Socket.TCP</b>
 * <p>
 * TCP socket that implements the Titanium.IOStream interface.  Created by Titanium.Network.Socket.createTCP
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
public class TCP {

	private JavaScriptObject handler;

	public TCP(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>accepted</b> (Function)
	 * <p>
	 * The callback to be fired when a listener accepts a connection.  The callback parameter's socket member contains the socket that is receiving the connection, and its inbound member contains the connecting socket.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native JavaScriptObject getAccepted() /*-{
		return this.@com.pmt.wrap.titanium.network.socket.TCP::handler.accepted;
	}-*/;

	/**
	 * <b>accepted</b> (Function)
	 * <p>
	 * The callback to be fired when a listener accepts a connection.  The callback parameter's socket member contains the socket that is receiving the connection, and its inbound member contains the connecting socket.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native void setAccepted(JavaScriptObject accepted) /*-{
		this.@com.pmt.wrap.titanium.network.socket.TCP::handler.accepted = accepted;
	}-*/;

	/**
	 * <b>connected</b> (Function)
	 * <p>
	 * The callback to be fired after the socket enters the "connected" state. Only invoked following a successful connect() call. The callback parameter's socket member contains the socket that connected.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native JavaScriptObject getConnected() /*-{
		return this.@com.pmt.wrap.titanium.network.socket.TCP::handler.connected;
	}-*/;

	/**
	 * <b>connected</b> (Function)
	 * <p>
	 * The callback to be fired after the socket enters the "connected" state. Only invoked following a successful connect() call. The callback parameter's socket member contains the socket that connected.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native void setConnected(JavaScriptObject connected) /*-{
		this.@com.pmt.wrap.titanium.network.socket.TCP::handler.connected = connected;
	}-*/;

	/**
	 * <b>error</b> (Function)
	 * <p>
	 * The callback to be fired after the socket enters the ERROR state.  The callback parameter's socket member contains the erring socket, and its error (string) and errorCode (number) members contain error information.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native JavaScriptObject getError() /*-{
		return this.@com.pmt.wrap.titanium.network.socket.TCP::handler.error;
	}-*/;

	/**
	 * <b>error</b> (Function)
	 * <p>
	 * The callback to be fired after the socket enters the ERROR state.  The callback parameter's socket member contains the erring socket, and its error (string) and errorCode (number) members contain error information.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native void setError(JavaScriptObject error) /*-{
		this.@com.pmt.wrap.titanium.network.socket.TCP::handler.error = error;
	}-*/;

	/**
	 * <b>host</b> (String)
	 * <p>
	 * The host to connect to or listen on. Cannot be modified when not in the INITIALIZED state. Supports both IPv4 and IPv6
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native String getHost() /*-{
		return this.@com.pmt.wrap.titanium.network.socket.TCP::handler.host;
	}-*/;

	/**
	 * <b>host</b> (String)
	 * <p>
	 * The host to connect to or listen on. Cannot be modified when not in the INITIALIZED state. Supports both IPv4 and IPv6
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native void setHost(String host) /*-{
		this.@com.pmt.wrap.titanium.network.socket.TCP::handler.host = host;
	}-*/;

	/**
	 * <b>listenQueueSize</b> (Number)
	 * <p>
	 * Max number of pending incoming connections to be allowed when listen() is called. Any incoming connections received while the max number of pending connections has been reached will be rejected.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native int getListenQueueSizeI() /*-{
		return this.@com.pmt.wrap.titanium.network.socket.TCP::handler.listenQueueSize;
	}-*/;

	/**
	 * <b>listenQueueSize</b> (Number)
	 * <p>
	 * Max number of pending incoming connections to be allowed when listen() is called. Any incoming connections received while the max number of pending connections has been reached will be rejected.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native void setListenQueueSize(int listenQueueSize) /*-{
		this.@com.pmt.wrap.titanium.network.socket.TCP::handler.listenQueueSize = listenQueueSize;
	}-*/;

	/**
	 * <b>listenQueueSize</b> (Number)
	 * <p>
	 * Max number of pending incoming connections to be allowed when listen() is called. Any incoming connections received while the max number of pending connections has been reached will be rejected.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native double getListenQueueSizeF() /*-{
		return this.@com.pmt.wrap.titanium.network.socket.TCP::handler.listenQueueSize;
	}-*/;

	/**
	 * <b>listenQueueSize</b> (Number)
	 * <p>
	 * Max number of pending incoming connections to be allowed when listen() is called. Any incoming connections received while the max number of pending connections has been reached will be rejected.
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native void setListenQueueSize(double listenQueueSize) /*-{
		this.@com.pmt.wrap.titanium.network.socket.TCP::handler.listenQueueSize = listenQueueSize;
	}-*/;

	/**
	 * <b>port</b> (Number)
	 * <p>
	 * The port to connect to or listen on. Cannot be modified when not in the INITIALIZED state
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native int getPortI() /*-{
		return this.@com.pmt.wrap.titanium.network.socket.TCP::handler.port;
	}-*/;

	/**
	 * <b>port</b> (Number)
	 * <p>
	 * The port to connect to or listen on. Cannot be modified when not in the INITIALIZED state
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native void setPort(int port) /*-{
		this.@com.pmt.wrap.titanium.network.socket.TCP::handler.port = port;
	}-*/;

	/**
	 * <b>port</b> (Number)
	 * <p>
	 * The port to connect to or listen on. Cannot be modified when not in the INITIALIZED state
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native double getPortF() /*-{
		return this.@com.pmt.wrap.titanium.network.socket.TCP::handler.port;
	}-*/;

	/**
	 * <b>port</b> (Number)
	 * <p>
	 * The port to connect to or listen on. Cannot be modified when not in the INITIALIZED state
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native void setPort(double port) /*-{
		this.@com.pmt.wrap.titanium.network.socket.TCP::handler.port = port;
	}-*/;

	/**
	 * <b>state</b> (Number)
	 * <p>
	 * current state of the socket
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native int getStateI() /*-{
		return this.@com.pmt.wrap.titanium.network.socket.TCP::handler.state;
	}-*/;

	/**
	 * <b>state</b> (Number)
	 * <p>
	 * current state of the socket
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native void setState(int state) /*-{
		this.@com.pmt.wrap.titanium.network.socket.TCP::handler.state = state;
	}-*/;

	/**
	 * <b>state</b> (Number)
	 * <p>
	 * current state of the socket
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native double getStateF() /*-{
		return this.@com.pmt.wrap.titanium.network.socket.TCP::handler.state;
	}-*/;

	/**
	 * <b>state</b> (Number)
	 * <p>
	 * current state of the socket
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native void setState(double state) /*-{
		this.@com.pmt.wrap.titanium.network.socket.TCP::handler.state = state;
	}-*/;

	/**
	 * <b>timeout</b> (Number)
	 * <p>
	 * The timeout for connect() and all I/O write() operations. Cannot be modified when not in the INITIALIZED state
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native int getTimeoutI() /*-{
		return this.@com.pmt.wrap.titanium.network.socket.TCP::handler.timeout;
	}-*/;

	/**
	 * <b>timeout</b> (Number)
	 * <p>
	 * The timeout for connect() and all I/O write() operations. Cannot be modified when not in the INITIALIZED state
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native void setTimeout(int timeout) /*-{
		this.@com.pmt.wrap.titanium.network.socket.TCP::handler.timeout = timeout;
	}-*/;

	/**
	 * <b>timeout</b> (Number)
	 * <p>
	 * The timeout for connect() and all I/O write() operations. Cannot be modified when not in the INITIALIZED state
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native double getTimeoutF() /*-{
		return this.@com.pmt.wrap.titanium.network.socket.TCP::handler.timeout;
	}-*/;

	/**
	 * <b>timeout</b> (Number)
	 * <p>
	 * The timeout for connect() and all I/O write() operations. Cannot be modified when not in the INITIALIZED state
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 */
	public native void setTimeout(double timeout) /*-{
		this.@com.pmt.wrap.titanium.network.socket.TCP::handler.timeout = timeout;
	}-*/;

	/**
	 * <b>accept</b>
	 * <p>
	 * Tells a LISTENING socket to accept a connection request at the top of a listener's request queue when one becomes available. Takes an argument, a box object which assigns callbacks to the created socket. Note that the connected callback is not called (the socket does not "transition to" the CONNECTED state - it's created in the CONNECTED state) on the newly created socket.  The accepted callback is called when a new connection is accepted as a result of calling accept().  If the socket is already flagged to accept the next connection, the existing accept options will be update to use the newly specified options object. Throws an exception if the socket is not in a LISTENING state
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @param params (Object) parameters that contain callbacks to be set on next accepted socket. The <tt>timeout</tt> member specifies timeout for connect and write operations.  The <tt>error</tt> member specifies a callback to be invoked if an error occurs.  See the <tt>error</tt> property for details of the callback.
	 * @return void
	 */
	 public native void accept(JavaScriptObject params) /*-{
		return this.@com.pmt.wrap.titanium.network.socket.TCP::handler.accept(params);
	}-*/;

	/**
	 * <b>close</b>
	 * <p>
	 * Closes a socket. Throws exception if the socket is not in a CONNECTED or LISTENING state. Blocking
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @return void
	 */
	 public native void close() /*-{
		return this.@com.pmt.wrap.titanium.network.socket.TCP::handler.close();
	}-*/;

	/**
	 * <b>connect</b>
	 * <p>
	 * Attempts to connect the socket to its host/port. Throws exception if the socket is in a CONNECTED or LISTENING state. Throws exception if a valid host and port has not been set on the proxy. Nonblocking; connection attempts are asynchronous
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @return void
	 */
	 public native void connect() /*-{
		return this.@com.pmt.wrap.titanium.network.socket.TCP::handler.connect();
	}-*/;

	/**
	 * <b>listen</b>
	 * <p>
	 * Attempts to start listening on the socket's host/port. listen() call will attempt to listen on the specified host and/or port property for the socket if they are set. This function blocks execution and throws an exception on error (and sets the socket state to ERROR) but does not fire the error callback in this event. Throws exception if the socket is in a LISTENING or CONNECTED state
	 * <p>
	 * <b>Platforms:</b> iphone android ipad, <b>Since:</b> 1.7
	 * @return void
	 */
	 public native void listen() /*-{
		return this.@com.pmt.wrap.titanium.network.socket.TCP::handler.listen();
	}-*/;
}
