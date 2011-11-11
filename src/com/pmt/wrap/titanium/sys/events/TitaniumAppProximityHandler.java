package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>proximity</b>
 * <p>
 * fired when a proximity state changes
 */
public interface TitaniumAppProximityHandler {
	/**
	 * <b>proximity</b>
	 * <p>
	 * fired when a proximity state changes
	 * @param source the source object that fired the event
	 * @param state the proximity state value
	 * @param type the name of the event fired
	 */
	void proximity(JavaScriptObject source, JavaScriptObject state, JavaScriptObject type);
}
