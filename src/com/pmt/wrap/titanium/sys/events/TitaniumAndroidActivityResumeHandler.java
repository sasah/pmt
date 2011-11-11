package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>resume</b>
 * <p>
 * Fired from the Activity's onResume
 */
public interface TitaniumAndroidActivityResumeHandler {
	/**
	 * <b>resume</b>
	 * <p>
	 * Fired from the Activity's onResume
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 */
	void resume(JavaScriptObject source, JavaScriptObject type);
}
