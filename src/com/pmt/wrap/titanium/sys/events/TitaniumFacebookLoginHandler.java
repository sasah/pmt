package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>login</b>
 * <p>
 * fired at session login
 */
public interface TitaniumFacebookLoginHandler {
	/**
	 * <b>login</b>
	 * <p>
	 * fired at session login
	 * @param uid the user id returned by Facebook if the login was successful.
	 * @param source the source object that fired the event
	 * @param error error message if success was false
	 * @param data data returned by Facebook when we query for the uid (using graph path "me") after successful login.  Data is in JSON format.  Includes information such as user name, locale and gender.
	 * @param cancelled true if the user cancelled the request by closing the dialog
	 * @param type the name of the event fired
	 * @param success true if the login was successful
	 */
	void login(JavaScriptObject uid, JavaScriptObject source, JavaScriptObject error, JavaScriptObject data, JavaScriptObject cancelled, JavaScriptObject type, JavaScriptObject success);
}
