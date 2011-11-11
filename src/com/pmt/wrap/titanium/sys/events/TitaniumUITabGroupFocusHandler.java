package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>focus</b>
 * <p>
 * fired when the tab group gains focus
 */
public interface TitaniumUITabGroupFocusHandler {
	/**
	 * <b>focus</b>
	 * <p>
	 * fired when the tab group gains focus
	 * @param previousIndex the previous tab index
	 * @param index the tab index
	 * @param source the source object that fired the event
	 * @param tab the tab object
	 * @param previousTab the previous tab object
	 * @param type the name of the event fired
	 * @param globalPoint a dictionary with properties x and y describing the point of the event in screen coordinates
	 * @param y the y point of the event, in receiving view coordinates
	 * @param x the x point of the event in receiving view coordiantes
	 */
	void focus(JavaScriptObject previousIndex, JavaScriptObject index, JavaScriptObject source, JavaScriptObject tab, JavaScriptObject previousTab, JavaScriptObject type, JavaScriptObject globalPoint, JavaScriptObject y, JavaScriptObject x);
}
