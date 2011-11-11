package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>click</b>
 * <p>
 * fired when the user presses the button
 */
public interface TitaniumAndroidMenuItemClickHandler {
	/**
	 * <b>click</b>
	 * <p>
	 * fired when the user presses the button
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 */
	void click(JavaScriptObject source, JavaScriptObject type);
}
