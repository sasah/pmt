package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>newIntent</b>
 * <p>
 * Fired when the application is already running and certain flags are set in the Intent. Fired from the Activity's onNewIntent
 */
public interface TitaniumAndroidActivityNewIntentHandler {
	/**
	 * <b>newIntent</b>
	 * <p>
	 * Fired when the application is already running and certain flags are set in the Intent. Fired from the Activity's onNewIntent
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 * @param intent the Titanium.Android.Intent passed to the native onNewIntent method.
	 */
	void newIntent(JavaScriptObject source, JavaScriptObject type, JavaScriptObject intent);
}
