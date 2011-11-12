package com.pmt.network;

import com.google.gwt.core.client.JavaScriptObject;

public interface RequestCallback {

	/**
	 * <b>onreadystatechange</b> (function)
	 * <p>
	 * set this to a function before calling open to cause the function to be
	 * called for each readyState change
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	void onReadyStateChange(Request request);

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
	void onDataStream(int contentLength, int downloadLength, int chunkLength, JavaScriptObject blob, double progress);

	/**
	 * <b>onload</b> (function)
	 * <p>
	 * set this to a function before calling open to cause the function to be
	 * called upon a successful response
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	void onLoad(Request request, Response response);

	/**
	 * <b>onerror</b> (function)
	 * <p>
	 * set this to a function before calling open to cause the function to be
	 * called upon a error response
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	void onError(Request request, String error);

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
	void onSendStream(Request request, double progress);
}
