package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>complete</b>
 * <p>
 * fired when the email dialog has completed sending the email
 */
public interface TitaniumUIEmailDialogCompleteHandler {
	/**
	 * <b>complete</b>
	 * <p>
	 * fired when the email dialog has completed sending the email
	 * @param result result status either as SENT, SAVED, CANCELLED or FAILED. (Note: Android result will be SENT even if user discards or saves the message.  SAVED and CANCELLED are not supported on Android.)
	 * @param source the source object that fired the event
	 * @param error string message of the error or null if successfully sent
	 * @param type the name of the event fired
	 * @param success boolean to indicate if the email was successfully sent
	 */
	void complete(JavaScriptObject result, JavaScriptObject source, JavaScriptObject error, JavaScriptObject type, JavaScriptObject success);
}
