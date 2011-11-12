package com.pmt.network;

import com.google.gwt.core.client.JavaScriptObject;
import com.pmt.network.events.DataStreamHandler;
import com.pmt.network.events.ErrorHandler;
import com.pmt.network.events.LoadHandler;
import com.pmt.network.events.ReadyStateChangeHandler;
import com.pmt.network.events.SendStreamHandler;

/**
 * <b>Titanium.Network.HTTPClient</b>
 * <p>
 * The HttpClient instance returned from Titanium.Network.createHTTPClient. This
 * object (mostly) implements the XMLHttpRequest specification.
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

	private final JavaScriptObject handler;

	public enum ReadyState {
		/**
		 * <b>DONE</b> (int) static
		 * <p>
		 * the DONE readyState constant
		 * <p>
		 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
		 */
		DONE,

		/**
		 * <b>HEADERS_RECEIVED</b> (int) static
		 * <p>
		 * the HEADERS_RECEIVED readyState constant
		 * <p>
		 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
		 */
		HEADERS_RECEIVED,

		/**
		 * <b>LOADING</b> (int) static
		 * <p>
		 * the LOADING readyState constant
		 * <p>
		 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
		 */
		LOADING,

		/**
		 * <b>OPENED</b> (int) static
		 * <p>
		 * the OPENED readyState constant
		 * <p>
		 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
		 */
		OPENED,

		/**
		 * <b>UNSENT</b> (int) static
		 * <p>
		 * the UNSET readyState constant
		 * <p>
		 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
		 */
		UNSENT, UNKNOW
	}

	public enum Method {
		GET, POST, PUT, DELETE
	}

	public HTTPClient() {
		this.handler = createHTTPClient();
	}

	/**
	 * <b>createHTTPClient</b>
	 * <p>
	 * create and return an instance of Titanium.Network.HTTPClient
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * 
	 * @param parameters
	 *            (object) (optional) a dictionary object properties defined in
	 *            Titanium.Network.HTTPClient
	 * @return object
	 */
	private native JavaScriptObject createHTTPClient() /*-{
		return Titanium.Network.createHTTPClient({
			pointer : this
		});
	}-*/;

	/**
	 * <b>DONE</b> (int) static
	 * <p>
	 * the DONE readyState constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	private native int DONE() /*-{
		return this.@com.pmt.network.HTTPClient::handler.DONE;
	}-*/;

	/**
	 * <b>HEADERS_RECEIVED</b> (int) static
	 * <p>
	 * the HEADERS_RECEIVED readyState constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	private native int HEADERS_RECEIVED() /*-{
		return this.@com.pmt.network.HTTPClient::handler.HEADERS_RECEIVED;
	}-*/;

	/**
	 * <b>LOADING</b> (int) static
	 * <p>
	 * the LOADING readyState constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	private native int LOADING() /*-{
		return this.@com.pmt.network.HTTPClient::handler.LOADING;
	}-*/;

	/**
	 * <b>OPENED</b> (int) static
	 * <p>
	 * the OPENED readyState constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	private native int OPENED() /*-{
		return this.@com.pmt.network.HTTPClient::handler.OPENED;
	}-*/;

	/**
	 * <b>UNSENT</b> (int) static
	 * <p>
	 * the UNSET readyState constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	private native int UNSENT() /*-{
		return this.@com.pmt.network.HTTPClient::handler.UNSENT;
	}-*/;

	/**
	 * <b>connected</b> (boolean)
	 * <p>
	 * boolean to indicate that the response was successful
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native boolean getConnected() /*-{
		return this.@com.pmt.network.HTTPClient::handler.connected;
	}-*/;

	/**
	 * <b>connectionType</b> (string)
	 * <p>
	 * the connection type, normally either GET or POST.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native String getConnectionType() /*-{
		return this.@com.pmt.network.HTTPClient::handler.connectionType;
	}-*/;

	/**
	 * <b>location</b> (string)
	 * <p>
	 * the absolute URL of the request
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native String getLocation() /*-{
		return this.@com.pmt.network.HTTPClient::handler.location;
	}-*/;

	/**
	 * <b>ondatastream</b> (function)
	 * <p>
	 * set this to a function before calling open to cause the function to be
	 * called at regular intervals as the request data is being received. the
	 * progress property of the event will contain a value from 0.0-1.0 with the
	 * progress.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setOnDataStream(DataStreamHandler onDataStream) /*-{
		this.@com.pmt.network.HTTPClient::handler.ondatastream = function(e) {
			onDataStream.@com.pmt.network.events.DataStreamHandler::onDataStream(IIILcom/google/gwt/core/client/JavaScriptObject;D)(e.totalCount, e.totalSize, e.size, e.blob, e.progress);
		};
	}-*/;

	/**
	 * <b>onerror</b> (function)
	 * <p>
	 * set this to a function before calling open to cause the function to be
	 * called upon a error response
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setOnError(ErrorHandler onError) /*-{
		this.@com.pmt.network.HTTPClient::handler.onerror = function(e) {
			onError.@com.pmt.network.events.ErrorHandler::onError(Lcom/pmt/network/HTTPClient;Ljava/lang/String;)(e.source.pointer, e.error);
		};
	}-*/;

	/**
	 * <b>onload</b> (function)
	 * <p>
	 * set this to a function before calling open to cause the function to be
	 * called upon a successful response
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setOnLoad(LoadHandler onLoad) /*-{
		this.@com.pmt.network.HTTPClient::handler.onload = function(e) {
			onLoad.@com.pmt.network.events.LoadHandler::onLoad(Lcom/pmt/network/HTTPClient;)(e.source.pointer);
		};
	}-*/;

	/**
	 * <b>onreadystatechange</b> (function)
	 * <p>
	 * set this to a function before calling open to cause the function to be
	 * called for each readyState change
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setOnReadyStateChange(ReadyStateChangeHandler onReadyStateChange) /*-{
		this.@com.pmt.network.HTTPClient::handler.onreadystatechange = function(
				e) {
			onReadyStateChange.@com.pmt.network.events.ReadyStateChangeHandler::onReadyStateChange(Lcom/pmt/network/HTTPClient;)(e.source.pointer);
		};
	}-*/;

	/**
	 * <b>onsendstream</b> (function)
	 * <p>
	 * set this to a function before calling open to cause the function to be
	 * called at regular intervals as the request data is being transmitted. the
	 * progress property of the event will contain a value from 0.0-1.0 with the
	 * progress.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setOnSendStream(SendStreamHandler onSendStream) /*-{
		this.@com.pmt.network.HTTPClient::handler.onsendstream = function(e) {
			onSendStream.@com.pmt.network.events.SendStreamHandler::onSendStream(Lcom/pmt/network/HTTPClient;D)(e.source.pointer, e.progress);
		};
	}-*/;

	/**
	 * <b>readyState</b> (int)
	 * <p>
	 * the readyState value
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public ReadyState getReadyState() {
		int i = getReadyStateInternal();
		if (i == DONE()) {
			return ReadyState.DONE;
		} else if (i == HEADERS_RECEIVED()) {
			return ReadyState.HEADERS_RECEIVED;
		} else if (i == LOADING()) {
			return ReadyState.LOADING;
		} else if (i == OPENED()) {
			return ReadyState.OPENED;
		} else if (i == UNSENT()) {
			return ReadyState.UNSENT;
		}
		return ReadyState.UNKNOW;
	}

	/**
	 * <b>readyState</b> (int)
	 * <p>
	 * the readyState value
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	private native int getReadyStateInternal() /*-{
		return this.@com.pmt.network.HTTPClient::handler.readyState;
	}-*/;

	/**
	 * <b>responseData</b> (object)
	 * <p>
	 * the response data as a Blob object.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native JavaScriptObject getResponseData() /*-{
		return this.@com.pmt.network.HTTPClient::handler.responseData;
	}-*/;

	/**
	 * <b>responseText</b> (string)
	 * <p>
	 * the response as text or null if an error was received or no data was
	 * returned
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native String getResponseText() /*-{
		return this.@com.pmt.network.HTTPClient::handler.responseText;
	}-*/;

	/**
	 * <b>responseXML</b> (object)
	 * <p>
	 * the response object as an XML DOMDocument object. returns null if the
	 * content type returned by the server was not XML or the content could not
	 * be parsed
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native JavaScriptObject getResponseXML() /*-{
		return this.@com.pmt.network.HTTPClient::handler.responseXML;
	}-*/;

	/**
	 * <b>status</b> (int)
	 * <p>
	 * the response HTTP status code
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native int getStatus() /*-{
		return this.@com.pmt.network.HTTPClient::handler.status;
	}-*/;

	/**
	 * <b>timeout</b> (int)
	 * <p>
	 * timeout is milliseconds when the connection should be aborted
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setTimeout(int timeout) /*-{
		this.@com.pmt.network.HTTPClient::handler.setTimeout(timeout);
	}-*/;

	/**
	 * <b>validatesSecureCertificate</b> (boolean)
	 * <p>
	 * set this to control how SSL certification validation is performed on
	 * connection. defaults to false if in simulator or device testing and true
	 * if release for distribution mode.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native boolean getValidatesSecureCertificate() /*-{
		return this.@com.pmt.network.HTTPClient::handler.validatesSecureCertificate;
	}-*/;

	/**
	 * <b>validatesSecureCertificate</b> (boolean)
	 * <p>
	 * set this to control how SSL certification validation is performed on
	 * connection. defaults to false if in simulator or device testing and true
	 * if release for distribution mode.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setValidatesSecureCertificate(boolean validatesSecureCertificate) /*-{
		this.@com.pmt.network.HTTPClient::handler.validatesSecureCertificate = validatesSecureCertificate;
	}-*/;

	/**
	 * <b>abort</b>
	 * <p>
	 * abort a pending request
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * 
	 * @return void
	 */
	public native void abort() /*-{
		this.@com.pmt.network.HTTPClient::handler.abort();
	}-*/;

	/**
	 * <b>getResponseHeader</b>
	 * <p>
	 * return the response header.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * 
	 * @param name
	 *            (string) the header name
	 * @return string
	 */
	public native String getResponseHeader(String name) /*-{
		return this.@com.pmt.network.HTTPClient::handler
				.getResponseHeader(name);
	}-*/;

	/**
	 * <b>open</b>
	 * <p>
	 * open GET the request and ready the connection
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * 
	 * @param url
	 *            (string) the URL for the request
	 * @return void
	 */
	public void open(String url) {
		open(Method.GET, url);
	}

	/**
	 * <b>open</b>
	 * <p>
	 * open the request and ready the connection
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * 
	 * @param method
	 *            (string) the HTTP method
	 * @param url
	 *            (string) the URL for the request
	 * @return void
	 */
	public native void open(Method method, String url) /*-{
		this.@com.pmt.network.HTTPClient::handler.open(
				method.@com.pmt.network.HTTPClient.Method::toString()(), url);
	}-*/;

	/**
	 * <b>send</b>
	 * <p>
	 * send the request (Only async is currently supported)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * 
	 * @return void
	 */
	public native void send() /*-{
		this.@com.pmt.network.HTTPClient::handler.send();
	}-*/;

	/**
	 * <b>send</b>
	 * <p>
	 * send the request (Only async is currently supported)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * 
	 * @param data
	 *            (object) the data to send in the request. can either be null,
	 *            dictionary, string, File object or Blob.
	 * @return void
	 */
	public native void send(JavaScriptObject data) /*-{
		this.@com.pmt.network.HTTPClient::handler.send(data);
	}-*/;

	/**
	 * <b>setRequestHeader</b>
	 * <p>
	 * set the request header. Must be called after open but before send.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * 
	 * @param name
	 *            (string) name of the header
	 * @param value
	 *            (string) value of the header. May be null to clearing out a
	 *            property, such as X-Requested-With
	 * @return void
	 */
	public native void setRequestHeader(String name, String value) /*-{
		this.@com.pmt.network.HTTPClient::handler.setRequestHeader(name, value);
	}-*/;
}
