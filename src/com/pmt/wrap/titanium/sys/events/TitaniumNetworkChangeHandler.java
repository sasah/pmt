package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>change</b>
 * <p>
 * fired upon a network connectivity change
 */
public interface TitaniumNetworkChangeHandler {
	/**
	 * <b>change</b>
	 * <p>
	 * fired upon a network connectivity change
	 * @param networkType the new network type
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 * @param online boolean to indicate if the network is online
	 * @param networkTypeName the new network type as a string
	 */
	void change(JavaScriptObject networkType, JavaScriptObject source, JavaScriptObject type, JavaScriptObject online, JavaScriptObject networkTypeName);
}
