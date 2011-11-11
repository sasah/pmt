package com.pmt.wrap.titanium.network;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Network.TCPSocket</b>
 * <p>
 * DEPRECATED: USE Titanium.Network.Socket.TCP WHERE POSSIBLE.  The TCPSocket instance returned from Titanium.Network.createTCPSocket.  This object represents a socket which either listens locally on the device for connections, or connects to a remote machine.
 * <p>
 * <b>Platforms:</b> iphone ipad 
 * <p>
 * <b>Since:</b> 1.2.0
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class TCPSocket {

	private JavaScriptObject handler;

	public TCPSocket(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>hostName</b> (string)
	 * <p>
	 * the host name to connect to.  Must be Titanium.Network.INADDR_ANY or an identifier for the local device in order to listen
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 */
	public native String getHostName() /*-{
		return this.@com.pmt.wrap.titanium.network.TCPSocket::handler.hostName;
	}-*/;

	/**
	 * <b>hostName</b> (string)
	 * <p>
	 * the host name to connect to.  Must be Titanium.Network.INADDR_ANY or an identifier for the local device in order to listen
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 */
	public native void setHostName(String hostName) /*-{
		this.@com.pmt.wrap.titanium.network.TCPSocket::handler.hostName = hostName;
	}-*/;

	/**
	 * <b>isValid</b> (boolean)
	 * <p>
	 * whether or not the socket is valid
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 */
	public native boolean getIsValid() /*-{
		return this.@com.pmt.wrap.titanium.network.TCPSocket::handler.isValid;
	}-*/;

	/**
	 * <b>isValid</b> (boolean)
	 * <p>
	 * whether or not the socket is valid
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 */
	public native void setIsValid(boolean isValid) /*-{
		this.@com.pmt.wrap.titanium.network.TCPSocket::handler.isValid = isValid;
	}-*/;

	/**
	 * <b>mode</b> (int)
	 * <p>
	 * the socket's mode
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 */
	public native int getMode() /*-{
		return this.@com.pmt.wrap.titanium.network.TCPSocket::handler.mode;
	}-*/;

	/**
	 * <b>mode</b> (int)
	 * <p>
	 * the socket's mode
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 */
	public native void setMode(int mode) /*-{
		this.@com.pmt.wrap.titanium.network.TCPSocket::handler.mode = mode;
	}-*/;

	/**
	 * <b>port</b> (int)
	 * <p>
	 * the port to connect/listen on
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 */
	public native int getPort() /*-{
		return this.@com.pmt.wrap.titanium.network.TCPSocket::handler.port;
	}-*/;

	/**
	 * <b>port</b> (int)
	 * <p>
	 * the port to connect/listen on
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 */
	public native void setPort(int port) /*-{
		this.@com.pmt.wrap.titanium.network.TCPSocket::handler.port = port;
	}-*/;

	/**
	 * <b>stripTerminator</b> (boolean)
	 * <p>
	 * strip terminating null character when sending string data; default is false
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 */
	public native boolean getStripTerminator() /*-{
		return this.@com.pmt.wrap.titanium.network.TCPSocket::handler.stripTerminator;
	}-*/;

	/**
	 * <b>stripTerminator</b> (boolean)
	 * <p>
	 * strip terminating null character when sending string data; default is false
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 */
	public native void setStripTerminator(boolean stripTerminator) /*-{
		this.@com.pmt.wrap.titanium.network.TCPSocket::handler.stripTerminator = stripTerminator;
	}-*/;

	/**
	 * <b>close</b>
	 * <p>
	 * close the socket
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 * @return void
	 */
	 public native void close() /*-{
		return this.@com.pmt.wrap.titanium.network.TCPSocket::handler.close();
	}-*/;

	/**
	 * <b>connect</b>
	 * <p>
	 * connect the scocket to a TCP server
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 * @return void
	 */
	 public native void connect() /*-{
		return this.@com.pmt.wrap.titanium.network.TCPSocket::handler.connect();
	}-*/;

	/**
	 * <b>listen</b>
	 * <p>
	 * set up the socket to receive connections
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 * @return void
	 */
	 public native void listen() /*-{
		return this.@com.pmt.wrap.titanium.network.TCPSocket::handler.listen();
	}-*/;

	/**
	 * <b>write</b>
	 * <p>
	 * write data to the socket, if the mode is WRITE_MODE or READ_WRITE_MODE
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 * @param data (object,string) either a string or blob object representing the data to be transferred
	 * @param sendTo (int) the socket reference to send the data to.  Default is to send to all connected sockets
	 * @return void
	 */
	 public native void write(JavaScriptObject data, int sendTo) /*-{
		return this.@com.pmt.wrap.titanium.network.TCPSocket::handler.write(data, sendTo);
	}-*/;
	

	/**
	 * <b>read</b>
	 * <p>
	 * new data was read off the socket
	 * @param read event handler
	 */
	public native void addRead(com.pmt.wrap.titanium.sys.events.TitaniumNetworkTCPSocketReadHandler read) /*-{
		this.@com.pmt.wrap.titanium.network.TCPSocket::handler.addEventListener('read', function(source, data, from, type) {
			read.@com.pmt.wrap.titanium.sys.events.TitaniumNetworkTCPSocketReadHandler::read(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, data, from, type);
		});
	}-*/;
	

	/**
	 * <b>readError</b>
	 * <p>
	 * an error occured when reading
	 * @param readError event handler
	 */
	public native void addReadError(com.pmt.wrap.titanium.sys.events.TitaniumNetworkTCPSocketReadErrorHandler readError) /*-{
		this.@com.pmt.wrap.titanium.network.TCPSocket::handler.addEventListener('readError', function(source, error, code, type) {
			readError.@com.pmt.wrap.titanium.sys.events.TitaniumNetworkTCPSocketReadErrorHandler::readError(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, error, code, type);
		});
	}-*/;
	

	/**
	 * <b>writeError</b>
	 * <p>
	 * an error occured when writing
	 * @param writeError event handler
	 */
	public native void addWriteError(com.pmt.wrap.titanium.sys.events.TitaniumNetworkTCPSocketWriteErrorHandler writeError) /*-{
		this.@com.pmt.wrap.titanium.network.TCPSocket::handler.addEventListener('writeError', function(source, error, code, type) {
			writeError.@com.pmt.wrap.titanium.sys.events.TitaniumNetworkTCPSocketWriteErrorHandler::writeError(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, error, code, type);
		});
	}-*/;
}
