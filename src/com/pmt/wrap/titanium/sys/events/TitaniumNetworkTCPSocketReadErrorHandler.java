package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>readError</b>
 * <p>
 * an error occured when reading
 */
public interface TitaniumNetworkTCPSocketReadErrorHandler {
	/**
	 * <b>readError</b>
	 * <p>
	 * an error occured when reading
	 * @param source the source object that fired the event
	 * @param error a description of the error
	 * @param code the BSD socket error code
	 * @param type the name of the event fired
	 */
	void readError(JavaScriptObject source, JavaScriptObject error, JavaScriptObject code, JavaScriptObject type);
}
