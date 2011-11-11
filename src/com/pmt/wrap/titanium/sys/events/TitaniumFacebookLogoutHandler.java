package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>logout</b>
 * <p>
 * fired at session logout
 */
public interface TitaniumFacebookLogoutHandler {
	/**
	 * <b>logout</b>
	 * <p>
	 * fired at session logout
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 */
	void logout(JavaScriptObject source, JavaScriptObject type);
}
