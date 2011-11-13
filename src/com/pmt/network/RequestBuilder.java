package com.pmt.network;

import com.google.gwt.core.client.JavaScriptObject;

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
public class RequestBuilder {

	private final JavaScriptObject handler;

	private Request request;
	private Response response;

	/**
	 * readyStates constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public enum ReadyState {
		/**
		 * the DONE readyState constant
		 */
		DONE,

		/**
		 * the HEADERS_RECEIVED readyState constant
		 */
		HEADERS_RECEIVED,

		/**
		 * the LOADING readyState constant
		 */
		LOADING,

		/**
		 * the OPENED readyState constant
		 */
		OPENED,

		/**
		 * the UNSET readyState constant
		 */
		UNSENT, UNKNOW
	}

	public enum Method {
		GET, POST, PUT, DELETE
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
	public RequestBuilder(Method method, String url) {
		this.handler = createHTTPClient();
		open(method, url);
	}

	private native JavaScriptObject createHTTPClient() /*-{
		return Titanium.Network.createHTTPClient({
			pointer : this
		});
	}-*/;

	private native void open(Method method, String url) /*-{
		this.@com.pmt.network.RequestBuilder::handler.open(
				method.@com.pmt.network.RequestBuilder.Method::toString()(),
				url);
	}-*/;

	/**
	 * <b>timeout</b> (int)
	 * <p>
	 * timeout is milliseconds when the connection should be aborted
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setTimeout(int timeout) /*-{
		this.@com.pmt.network.RequestBuilder::handler.setTimeout(timeout);
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
		this.@com.pmt.network.RequestBuilder::handler.validatesSecureCertificate = validatesSecureCertificate;
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
		return this.@com.pmt.network.RequestBuilder::handler.validatesSecureCertificate;
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
		this.@com.pmt.network.RequestBuilder::handler.setRequestHeader(name,
				value);
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
	public Request doSend(JavaScriptObject data, RequestCallback callback) {

		request = new Request() {

			@Override
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

			@Override
			public void cancel() {
				cancelInternal();
			}

			@Override
			public Method getConnectionType() {
				return Method.valueOf(getConnectionTypeInternal());
			}

			@Override
			public String getLocation() {
				return getLocationInternal();
			}

			@Override
			public boolean getConnected() {
				return getConnectedInternal();
			}

		};

		response = new Response() {

			@Override
			public int getStatus() {
				return getStatusInternal();
			}

			@Override
			public String getResponseHeader(String name) {
				return getResponseHeaderInternal(name);
			}

			@Override
			public JavaScriptObject getData() {
				return getDataInternal();
			}

			@Override
			public String getText() {
				return getTextInternal();
			}

			@Override
			public JavaScriptObject getXML() {
				return getXMLInternal();
			}

		};
		setCallback(callback);
		send(data);
		return request;
	}

	private native int getReadyStateInternal() /*-{
		return this.@com.pmt.network.RequestBuilder::handler.readyState;
	}-*/;

	private native int DONE() /*-{
		return this.@com.pmt.network.RequestBuilder::handler.DONE;
	}-*/;

	private native int HEADERS_RECEIVED() /*-{
		return this.@com.pmt.network.RequestBuilder::handler.HEADERS_RECEIVED;
	}-*/;

	private native int LOADING() /*-{
		return this.@com.pmt.network.RequestBuilder::handler.LOADING;
	}-*/;

	private native int OPENED() /*-{
		return this.@com.pmt.network.RequestBuilder::handler.OPENED;
	}-*/;

	private native int UNSENT() /*-{
		return this.@com.pmt.network.RequestBuilder::handler.UNSENT;
	}-*/;

	private native String getLocationInternal() /*-{
		return this.@com.pmt.network.RequestBuilder::handler.location;
	}-*/;

	private native boolean getConnectedInternal() /*-{
		return this.@com.pmt.network.RequestBuilder::handler.connected;
	}-*/;

	private native void cancelInternal() /*-{
		this.@com.pmt.network.RequestBuilder::handler.abort();
	}-*/;

	private native String getConnectionTypeInternal() /*-{
		return this.@com.pmt.network.RequestBuilder::handler.connectionType;
	}-*/;

	private native JavaScriptObject getXMLInternal() /*-{
		return this.@com.pmt.network.RequestBuilder::handler.responseXML;
	}-*/;

	private native String getTextInternal() /*-{
		return this.@com.pmt.network.RequestBuilder::handler.responseText;
	}-*/;

	private native int getStatusInternal() /*-{
		return this.@com.pmt.network.RequestBuilder::handler.status;
	}-*/;

	private native String getResponseHeaderInternal(String name) /*-{
		return this.@com.pmt.network.RequestBuilder::handler
				.getResponseHeader(name);
	}-*/;

	private native JavaScriptObject getDataInternal() /*-{
		return this.@com.pmt.network.RequestBuilder::handler.responseData;
	}-*/;

	private native void setCallback(RequestCallback callback) /*-{
		this.@com.pmt.network.RequestBuilder::handler.ondatastream = function(e) {
			callback.@com.pmt.network.RequestCallback::onDataStream(IIILcom/google/gwt/core/client/JavaScriptObject;D)(e.totalCount, e.totalSize, e.size, e.blob, e.progress);
		};
		this.@com.pmt.network.RequestBuilder::handler.onerror = function(e) {
			callback.@com.pmt.network.RequestCallback::onError(Lcom/pmt/network/Request;Ljava/lang/String;)(e.source.pointer.@com.pmt.network.RequestBuilder::request, e.error);
		};
		this.@com.pmt.network.RequestBuilder::handler.onload = function(e) {
			callback.@com.pmt.network.RequestCallback::onLoad(Lcom/pmt/network/Request;Lcom/pmt/network/Response;)(e.source.pointer.@com.pmt.network.RequestBuilder::request, e.source.pointer.@com.pmt.network.RequestBuilder::response);
		};
		this.@com.pmt.network.RequestBuilder::handler.onreadystatechange = function(
				e) {
			callback.@com.pmt.network.RequestCallback::onReadyStateChange(Lcom/pmt/network/Request;)(e.source.pointer.@com.pmt.network.RequestBuilder::request);
		};
		this.@com.pmt.network.RequestBuilder::handler.onsendstream = function(e) {
			callback.@com.pmt.network.RequestCallback::onSendStream(Lcom/pmt/network/Request;D)(e.source.pointer.@com.pmt.network.RequestBuilder::request, e.progress);
		};
	}-*/;

	private native void send(JavaScriptObject data) /*-{
		this.@com.pmt.network.RequestBuilder::handler.send(data);
	}-*/;
}
