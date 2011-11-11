package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>read</b>
 * <p>
 * new data was read off the socket
 */
public interface TitaniumNetworkTCPSocketReadHandler {
	/**
	 * <b>read</b>
	 * <p>
	 * new data was read off the socket
	 * @param source the source object that fired the event
	 * @param data a blob representing the data read, can be interpreted via toString
	 * @param from the reference for the socket that data was retrieved from
	 * @param type the name of the event fired
	 */
	void read(JavaScriptObject source, JavaScriptObject data, JavaScriptObject from, JavaScriptObject type);
}
