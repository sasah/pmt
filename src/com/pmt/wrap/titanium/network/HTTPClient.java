package com.pmt.wrap.titanium.network;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Network.HTTPClient</b>
 * <p>
 * The HttpClient instance returned from Titanium.Network.createHTTPClient. This object (mostly) implements the XMLHttpRequest specification.
 * <p>
 * <b>Platforms:</b> android iphone ipad 
 * <p>
 * <b>Since:</b> 0.1
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class HTTPClient {

	private JavaScriptObject handler;

	public HTTPClient(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>DONE</b> (int) static
	 * <p>
	 * the DONE readyState constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int DONE() /*-{
		return Titanium.Network.HTTPClient.DONE;
	}-*/;

	/**
	 * <b>HEADERS_RECEIVED</b> (int) static
	 * <p>
	 * the HEADERS_RECEIVED readyState constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int HEADERS_RECEIVED() /*-{
		return Titanium.Network.HTTPClient.HEADERS_RECEIVED;
	}-*/;

	/**
	 * <b>LOADING</b> (int) static
	 * <p>
	 * the LOADING readyState constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int LOADING() /*-{
		return Titanium.Network.HTTPClient.LOADING;
	}-*/;

	/**
	 * <b>OPENED</b> (int) static
	 * <p>
	 * the OPENED readyState constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int OPENED() /*-{
		return Titanium.Network.HTTPClient.OPENED;
	}-*/;

	/**
	 * <b>UNSENT</b> (int) static
	 * <p>
	 * the UNSET readyState constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int UNSENT() /*-{
		return Titanium.Network.HTTPClient.UNSENT;
	}-*/;

	/**
	 * <b>connected</b> (boolean)
	 * <p>
	 * boolean to indicate that the response was successful
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native boolean getConnected() /*-{
		return this.@com.pmt.wrap.titanium.network.HTTPClient::handler.connected;
	}-*/;

	/**
	 * <b>connected</b> (boolean)
	 * <p>
	 * boolean to indicate that the response was successful
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setConnected(boolean connected) /*-{
		this.@com.pmt.wrap.titanium.network.HTTPClient::handler.connected = connected;
	}-*/;

	/**
	 * <b>connectionType</b> (string)
	 * <p>
	 * the connection type, normally either GET or POST.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native String getConnectionType() /*-{
		return this.@com.pmt.wrap.titanium.network.HTTPClient::handler.connectionType;
	}-*/;

	/**
	 * <b>connectionType</b> (string)
	 * <p>
	 * the connection type, normally either GET or POST.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setConnectionType(String connectionType) /*-{
		this.@com.pmt.wrap.titanium.network.HTTPClient::handler.connectionType = connectionType;
	}-*/;

	/**
	 * <b>file</b> (string)
	 * <p>
	 * file to download contents to.  Can only be set after calling open.  iOS only
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native String getFile() /*-{
		return this.@com.pmt.wrap.titanium.network.HTTPClient::handler.file;
	}-*/;

	/**
	 * <b>file</b> (string)
	 * <p>
	 * file to download contents to.  Can only be set after calling open.  iOS only
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setFile(String file) /*-{
		this.@com.pmt.wrap.titanium.network.HTTPClient::handler.file = file;
	}-*/;

	/**
	 * <b>location</b> (string)
	 * <p>
	 * the absolute URL of the request
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native String getLocation() /*-{
		return this.@com.pmt.wrap.titanium.network.HTTPClient::handler.location;
	}-*/;

	/**
	 * <b>location</b> (string)
	 * <p>
	 * the absolute URL of the request
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setLocation(String location) /*-{
		this.@com.pmt.wrap.titanium.network.HTTPClient::handler.location = location;
	}-*/;

	/**
	 * <b>ondatastream</b> (function)
	 * <p>
	 * set this to a function before calling open to cause the function to be called at regular intervals as the request data is being received. the progress property of the event will contain a value from 0.0-1.0 with the progress.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native JavaScriptObject getOndatastream() /*-{
		return this.@com.pmt.wrap.titanium.network.HTTPClient::handler.ondatastream;
	}-*/;

	/**
	 * <b>ondatastream</b> (function)
	 * <p>
	 * set this to a function before calling open to cause the function to be called at regular intervals as the request data is being received. the progress property of the event will contain a value from 0.0-1.0 with the progress.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setOndatastream(JavaScriptObject ondatastream) /*-{
		this.@com.pmt.wrap.titanium.network.HTTPClient::handler.ondatastream = ondatastream;
	}-*/;

	/**
	 * <b>onerror</b> (function)
	 * <p>
	 * set this to a function before calling open to cause the function to be called upon a error response
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native JavaScriptObject getOnerror() /*-{
		return this.@com.pmt.wrap.titanium.network.HTTPClient::handler.onerror;
	}-*/;

	/**
	 * <b>onerror</b> (function)
	 * <p>
	 * set this to a function before calling open to cause the function to be called upon a error response
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setOnerror(JavaScriptObject onerror) /*-{
		this.@com.pmt.wrap.titanium.network.HTTPClient::handler.onerror = onerror;
	}-*/;

	/**
	 * <b>onload</b> (function)
	 * <p>
	 * set this to a function before calling open to cause the function to be called upon a successful response
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native JavaScriptObject getOnload() /*-{
		return this.@com.pmt.wrap.titanium.network.HTTPClient::handler.onload;
	}-*/;

	/**
	 * <b>onload</b> (function)
	 * <p>
	 * set this to a function before calling open to cause the function to be called upon a successful response
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setOnload(JavaScriptObject onload) /*-{
		this.@com.pmt.wrap.titanium.network.HTTPClient::handler.onload = onload;
	}-*/;

	/**
	 * <b>onreadystatechange</b> (function)
	 * <p>
	 * set this to a function before calling open to cause the function to be called for each readyState change
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native JavaScriptObject getOnreadystatechange() /*-{
		return this.@com.pmt.wrap.titanium.network.HTTPClient::handler.onreadystatechange;
	}-*/;

	/**
	 * <b>onreadystatechange</b> (function)
	 * <p>
	 * set this to a function before calling open to cause the function to be called for each readyState change
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setOnreadystatechange(JavaScriptObject onreadystatechange) /*-{
		this.@com.pmt.wrap.titanium.network.HTTPClient::handler.onreadystatechange = onreadystatechange;
	}-*/;

	/**
	 * <b>onsendstream</b> (function)
	 * <p>
	 * set this to a function before calling open to cause the function to be called at regular intervals as the request data is being transmitted. the progress property of the event will contain a value from 0.0-1.0 with the progress.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native JavaScriptObject getOnsendstream() /*-{
		return this.@com.pmt.wrap.titanium.network.HTTPClient::handler.onsendstream;
	}-*/;

	/**
	 * <b>onsendstream</b> (function)
	 * <p>
	 * set this to a function before calling open to cause the function to be called at regular intervals as the request data is being transmitted. the progress property of the event will contain a value from 0.0-1.0 with the progress.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setOnsendstream(JavaScriptObject onsendstream) /*-{
		this.@com.pmt.wrap.titanium.network.HTTPClient::handler.onsendstream = onsendstream;
	}-*/;

	/**
	 * <b>readyState</b> (int)
	 * <p>
	 * the readyState value
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native int getReadyState() /*-{
		return this.@com.pmt.wrap.titanium.network.HTTPClient::handler.readyState;
	}-*/;

	/**
	 * <b>readyState</b> (int)
	 * <p>
	 * the readyState value
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setReadyState(int readyState) /*-{
		this.@com.pmt.wrap.titanium.network.HTTPClient::handler.readyState = readyState;
	}-*/;

	/**
	 * <b>responseData</b> (object)
	 * <p>
	 * the response data as a Blob object.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native JavaScriptObject getResponseData() /*-{
		return this.@com.pmt.wrap.titanium.network.HTTPClient::handler.responseData;
	}-*/;

	/**
	 * <b>responseData</b> (object)
	 * <p>
	 * the response data as a Blob object.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setResponseData(JavaScriptObject responseData) /*-{
		this.@com.pmt.wrap.titanium.network.HTTPClient::handler.responseData = responseData;
	}-*/;

	/**
	 * <b>responseText</b> (string)
	 * <p>
	 * the response as text or null if an error was received or no data was returned
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native String getResponseText() /*-{
		return this.@com.pmt.wrap.titanium.network.HTTPClient::handler.responseText;
	}-*/;

	/**
	 * <b>responseText</b> (string)
	 * <p>
	 * the response as text or null if an error was received or no data was returned
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setResponseText(String responseText) /*-{
		this.@com.pmt.wrap.titanium.network.HTTPClient::handler.responseText = responseText;
	}-*/;

	/**
	 * <b>responseXML</b> (object)
	 * <p>
	 * the response object as an XML DOMDocument object. returns null if the content type returned by the server was not XML or the content could not be parsed
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native JavaScriptObject getResponseXML() /*-{
		return this.@com.pmt.wrap.titanium.network.HTTPClient::handler.responseXML;
	}-*/;

	/**
	 * <b>responseXML</b> (object)
	 * <p>
	 * the response object as an XML DOMDocument object. returns null if the content type returned by the server was not XML or the content could not be parsed
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setResponseXML(JavaScriptObject responseXML) /*-{
		this.@com.pmt.wrap.titanium.network.HTTPClient::handler.responseXML = responseXML;
	}-*/;

	/**
	 * <b>status</b> (int)
	 * <p>
	 * the response HTTP status code
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native int getStatus() /*-{
		return this.@com.pmt.wrap.titanium.network.HTTPClient::handler.status;
	}-*/;

	/**
	 * <b>status</b> (int)
	 * <p>
	 * the response HTTP status code
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setStatus(int status) /*-{
		this.@com.pmt.wrap.titanium.network.HTTPClient::handler.status = status;
	}-*/;

	/**
	 * <b>timeout</b> (int)
	 * <p>
	 * timeout is milliseconds when the connection should be aborted
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native int getTimeout() /*-{
		return this.@com.pmt.wrap.titanium.network.HTTPClient::handler.timeout;
	}-*/;

	/**
	 * <b>timeout</b> (int)
	 * <p>
	 * timeout is milliseconds when the connection should be aborted
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setTimeout(int timeout) /*-{
		this.@com.pmt.wrap.titanium.network.HTTPClient::handler.timeout = timeout;
	}-*/;

	/**
	 * <b>validatesSecureCertificate</b> (boolean)
	 * <p>
	 * set this to control how SSL certification validation is performed on connection.  defaults to false if in simulator or device testing and true if release for distribution mode.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native boolean getValidatesSecureCertificate() /*-{
		return this.@com.pmt.wrap.titanium.network.HTTPClient::handler.validatesSecureCertificate;
	}-*/;

	/**
	 * <b>validatesSecureCertificate</b> (boolean)
	 * <p>
	 * set this to control how SSL certification validation is performed on connection.  defaults to false if in simulator or device testing and true if release for distribution mode.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setValidatesSecureCertificate(boolean validatesSecureCertificate) /*-{
		this.@com.pmt.wrap.titanium.network.HTTPClient::handler.validatesSecureCertificate = validatesSecureCertificate;
	}-*/;

	/**
	 * <b>abort</b>
	 * <p>
	 * abort a pending request
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return void
	 */
	 public native void abort() /*-{
		return this.@com.pmt.wrap.titanium.network.HTTPClient::handler.abort();
	}-*/;

	/**
	 * <b>getResponseHeader</b>
	 * <p>
	 * return the response header.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param name (string) the header name
	 * @return string
	 */
	 public native String getResponseHeader(String name) /*-{
		return this.@com.pmt.wrap.titanium.network.HTTPClient::handler.getResponseHeader(name);
	}-*/;

	/**
	 * <b>open</b>
	 * <p>
	 * open the request and ready the connection
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param method (string) the HTTP method
	 * @param url (string) the URL for the request
	 * @param async (boolean) optional property to indicate if asynchronous (default) or not
	 * @return void
	 */
	 public native void open(String method, String url, boolean async) /*-{
		return this.@com.pmt.wrap.titanium.network.HTTPClient::handler.open(method, url, async);
	}-*/;

	/**
	 * <b>send</b>
	 * <p>
	 * send the request (Only async is currently supported)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param data (object) the data to send in the request. can either be null, dictionary, string, File object or Blob.
	 * @return void
	 */
	 public native void send(JavaScriptObject data) /*-{
		return this.@com.pmt.wrap.titanium.network.HTTPClient::handler.send(data);
	}-*/;

	/**
	 * <b>setRequestHeader</b>
	 * <p>
	 * set the request header. Must be called after open but before send.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param name (string) name of the header
	 * @param value (string) value of the header. May be null to clearing out a property, such as X-Requested-With
	 * @return void
	 */
	 public native void setRequestHeader(String name, String value) /*-{
		return this.@com.pmt.wrap.titanium.network.HTTPClient::handler.setRequestHeader(name, value);
	}-*/;

	/**
	 * <b>setTimeout</b>
	 * <p>
	 * set the request timeout
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param timeout (double) the timeout in milliseconds
	 * @return void
	 */
	 public native void setTimeoutMethod(double timeout) /*-{
		return this.@com.pmt.wrap.titanium.network.HTTPClient::handler.setTimeoutMethod(timeout);
	}-*/;
}
