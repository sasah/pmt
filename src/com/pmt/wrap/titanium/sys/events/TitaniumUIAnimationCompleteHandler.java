package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>complete</b>
 * <p>
 * fired when the animation completes
 */
public interface TitaniumUIAnimationCompleteHandler {
	/**
	 * <b>complete</b>
	 * <p>
	 * fired when the animation completes
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 */
	void complete(JavaScriptObject source, JavaScriptObject type);
}
