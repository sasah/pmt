package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>linechange</b>
 * <p>
 * fired when a audio line type change is detected
 */
public interface TitaniumMediaLinechangeHandler {
	/**
	 * <b>linechange</b>
	 * <p>
	 * fired when a audio line type change is detected
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 */
	void linechange(JavaScriptObject source, JavaScriptObject type);
}
