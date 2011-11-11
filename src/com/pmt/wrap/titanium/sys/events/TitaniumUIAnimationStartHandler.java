package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>start</b>
 * <p>
 * fired when the animation starts
 */
public interface TitaniumUIAnimationStartHandler {
	/**
	 * <b>start</b>
	 * <p>
	 * fired when the animation starts
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 */
	void start(JavaScriptObject source, JavaScriptObject type);
}
