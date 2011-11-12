package com.pmt.network;

import com.pmt.network.RequestBuilder.Method;
import com.pmt.network.RequestBuilder.ReadyState;

public abstract class Request {
	
	public RequestBuilder requestBuilder;

	/**
	 * <b>abort</b>
	 * <p>
	 * abort a pending request
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * 
	 * @return void
	 */
	public abstract void cancel();

	/**
	 * <b>readyState</b> (int)
	 * <p>
	 * the readyState value
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public abstract ReadyState getReadyState();

	/**
	 * <b>connectionType</b> (string)
	 * <p>
	 * the connection type, normally either GET or POST.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public abstract Method getConnectionType();

	/**
	 * <b>location</b> (string)
	 * <p>
	 * the absolute URL of the request
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public abstract String getLocation();
}
