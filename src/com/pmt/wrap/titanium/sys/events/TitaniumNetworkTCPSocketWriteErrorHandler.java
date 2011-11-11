package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>writeError</b>
 * <p>
 * an error occured when writing
 */
public interface TitaniumNetworkTCPSocketWriteErrorHandler {
	/**
	 * <b>writeError</b>
	 * <p>
	 * an error occured when writing
	 * @param source the source object that fired the event
	 * @param error a description of the error
	 * @param code the BSD socket error code
	 * @param type the name of the event fired
	 */
	void writeError(JavaScriptObject source, JavaScriptObject error, JavaScriptObject code, JavaScriptObject type);
}
