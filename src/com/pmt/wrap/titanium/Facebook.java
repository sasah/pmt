package com.pmt.wrap.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Facebook</b>
 * <p>
 * The top level Facebook module.  The Facebook module is used for connecting your application with Facebook through the Facebook Graph API (see requestWithGraphPath) or the deprecated Facebook REST API (see request).Due to how the facebook login process works on iOS, your app will need to have the following in your tiapp.xml if you target those platforms:your_app_id_hereYou must still set Ti.Facebook.appid within your app itself to use the facebook module.  This property is used only for configuring your app to interface with the facebook login process.
 * <p>
 * <b>Platforms:</b> android iphone ipad 
 * <p>
 * <b>Since:</b> 0.8
 * <p>
 * <b>Type:</b> module
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> object
 */
public class Facebook {

	private JavaScriptObject handler;

	public Facebook(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>accessToken</b> (string) static
	 * <p>
	 * OAuth token set after a successful authorize.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public static native String getAccessToken() /*-{
		return Titanium.Facebook.accessToken;
	}-*/;

	/**
	 * <b>accessToken</b> (string) static
	 * <p>
	 * OAuth token set after a successful authorize.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public static native void setAccessToken(String accessToken) /*-{
		Titanium.Facebook.accessToken = accessToken;
	}-*/;

	/**
	 * <b>appid</b> (string) static
	 * <p>
	 * your Facebook application id.  You need to set this for anything to work.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public static native String getAppid() /*-{
		return Titanium.Facebook.appid;
	}-*/;

	/**
	 * <b>appid</b> (string) static
	 * <p>
	 * your Facebook application id.  You need to set this for anything to work.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public static native void setAppid(String appid) /*-{
		Titanium.Facebook.appid = appid;
	}-*/;

	/**
	 * <b>expirationDate</b> (date) static
	 * <p>
	 * Time at which the accessToken expires.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int getExpirationDate() /*-{
		return Titanium.Facebook.expirationDate;
	}-*/;

	/**
	 * <b>expirationDate</b> (date) static
	 * <p>
	 * Time at which the accessToken expires.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public static native void setExpirationDate(int expirationDate) /*-{
		Titanium.Facebook.expirationDate = expirationDate;
	}-*/;

	/**
	 * <b>forceDialogAuth</b> (boolean) static
	 * <p>
	 * Set to false to enable "Single-Sign-On" in cases where the official Facebook app is on the device.  Default is true, meaning the traditional, dialog-based authentication is used rather than Single-Sign-On.  See Facebook Mobile Guide for details of their Single-Sign-On schem.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public static native boolean getForceDialogAuth() /*-{
		return Titanium.Facebook.forceDialogAuth;
	}-*/;

	/**
	 * <b>forceDialogAuth</b> (boolean) static
	 * <p>
	 * Set to false to enable "Single-Sign-On" in cases where the official Facebook app is on the device.  Default is true, meaning the traditional, dialog-based authentication is used rather than Single-Sign-On.  See Facebook Mobile Guide for details of their Single-Sign-On schem.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public static native void setForceDialogAuth(boolean forceDialogAuth) /*-{
		Titanium.Facebook.forceDialogAuth = forceDialogAuth;
	}-*/;

	/**
	 * <b>loggedIn</b> (boolean) static
	 * <p>
	 * returns true if the user has logged in
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public static native boolean getLoggedIn() /*-{
		return Titanium.Facebook.loggedIn;
	}-*/;

	/**
	 * <b>loggedIn</b> (boolean) static
	 * <p>
	 * returns true if the user has logged in
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public static native void setLoggedIn(boolean loggedIn) /*-{
		Titanium.Facebook.loggedIn = loggedIn;
	}-*/;

	/**
	 * <b>permissions</b> (object) static
	 * <p>
	 * set/return an array of permissions to request for your app.  Be sure the permissions you want are set before calling authorize.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public static native JavaScriptObject getPermissions() /*-{
		return Titanium.Facebook.permissions;
	}-*/;

	/**
	 * <b>permissions</b> (object) static
	 * <p>
	 * set/return an array of permissions to request for your app.  Be sure the permissions you want are set before calling authorize.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public static native void setPermissions(JavaScriptObject permissions) /*-{
		Titanium.Facebook.permissions = permissions;
	}-*/;

	/**
	 * <b>uid</b> (string) static
	 * <p>
	 * the unique user id returned from Facebook.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public static native String getUid() /*-{
		return Titanium.Facebook.uid;
	}-*/;

	/**
	 * <b>uid</b> (string) static
	 * <p>
	 * the unique user id returned from Facebook.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public static native void setUid(String uid) /*-{
		Titanium.Facebook.uid = uid;
	}-*/;

	/**
	 * <b>addEventListener</b>
	 * <p>
	 * add an event listener for the instance to receive view triggered events
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public static native void addEventListener(String name, JavaScriptObject callback) /*-{
		Titanium.Facebook.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>authorize</b>
	 * <p>
	 * Login the user (if not already logged in) and authorize your application.  Be sure to set your desired permissions and your appid before calling this.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @return void
	 */
	 public static native void authorize() /*-{
		Titanium.Facebook.authorize();
	}-*/;

	/**
	 * <b>createLoginButton</b>
	 * <p>
	 * create and return an instance of Titanium.Facebook.LoginButton
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.Facebook.LoginButton
	 * @return object
	 */
	 public static native JavaScriptObject createLoginButton(JavaScriptObject parameters) /*-{
		return Titanium.Facebook.createLoginButton(parameters);
	}-*/;

	/**
	 * <b>dialog</b>
	 * <p>
	 * Open a supported Facebook dialog.  "feed" is just about the only useful one.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param action (string) Specifies which dialog to show, such as "feed".
	 * @param params (object) A dictionary object for pre-filling some of the dialog's fields.  See example.
	 * @param callback (function) A callback for when dialog is completed/cancelled.  The callback should accept a single argument which will be filled with a dictionary object concerning call results: items in the dictionary can be "success" (boolean), "error" (string with the error message), "cancelled" (set to true if user cancelled) and "result" (the data returned by Facebook.)
	 * @return void
	 */
	 public static native void dialog(String action, JavaScriptObject params, JavaScriptObject callback) /*-{
		Titanium.Facebook.dialog(action, params, callback);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public static native void fireEvent(String name, JavaScriptObject event) /*-{
		Titanium.Facebook.fireEvent(name, event);
	}-*/;

	/**
	 * <b>logout</b>
	 * <p>
	 * Clear the OAuth accessToken and logout the user.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @return void
	 */
	 public static native void logout() /*-{
		Titanium.Facebook.logout();
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public static native void removeEventListener(String name, JavaScriptObject callback) /*-{
		Titanium.Facebook.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>request</b>
	 * <p>
	 * Make a request to the deprecated Facebook REST API.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param method (string) The REST API method to call.
	 * @param params (object) A dictionary object for setting parameters required by the call, if any.  See examples.
	 * @param callback (function) A callback for when call is completed.  The callback should accept a single argument which will be filled with a dictionary object concerning call results: items in the dictionary can be "success" (boolean), "error" (string with the error message), "method" (the REST method call you specified), "result" (the data returned by Facebook.)
	 * @return void
	 */
	 public static native void request(String method, JavaScriptObject params, JavaScriptObject callback) /*-{
		Titanium.Facebook.request(method, params, callback);
	}-*/;

	/**
	 * <b>requestWithGraphPath</b>
	 * <p>
	 * Make a Facebook Graph API request.  If the request requires user authorization, be sure user is already logged-in and your app is authorized.  (You can check loggedIn for that.)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param path (string) The graph API path to request.  For example, "me" requests [information about the logged-in user](http://developers.facebook.com/docs/reference/api/user/).
	 * @param params (object) A dictionary object for setting parameters required by the call, if any.  See examples.
	 * @param httpMethod (string) The http method (GET/POST/DELETE) to use for the call.
	 * @param callback (function) A callback for when call is completed.  The callback should accept a single argument which will be filled with a dictionary object concerning call results: items in the dictionary can be "success" (boolean), "error" (string with the error message), "path" (the graph call path you specified), "result" (the JSON returned by Facebook.)
	 * @return void
	 */
	 public static native void requestWithGraphPath(String path, JavaScriptObject params, String httpMethod, JavaScriptObject callback) /*-{
		Titanium.Facebook.requestWithGraphPath(path, params, httpMethod, callback);
	}-*/;
	

	/**
	 * <b>login</b>
	 * <p>
	 * fired at session login
	 * @param login event handler
	 */
	public native void addLogin(com.pmt.wrap.titanium.sys.events.TitaniumFacebookLoginHandler login) /*-{
		this.@com.pmt.wrap.titanium.Facebook::handler.addEventListener('login', function(uid, source, error, data, cancelled, type, success) {
			login.@com.pmt.wrap.titanium.sys.events.TitaniumFacebookLoginHandler::login(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(uid, source, error, data, cancelled, type, success);
		});
	}-*/;
	

	/**
	 * <b>logout</b>
	 * <p>
	 * fired at session logout
	 * @param logout event handler
	 */
	public native void addLogout(com.pmt.wrap.titanium.sys.events.TitaniumFacebookLogoutHandler logout) /*-{
		this.@com.pmt.wrap.titanium.Facebook::handler.addEventListener('logout', function(source, type) {
			logout.@com.pmt.wrap.titanium.sys.events.TitaniumFacebookLogoutHandler::logout(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type);
		});
	}-*/;
}
