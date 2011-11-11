package com.pmt.wrap.titanium.android;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Android.Activity</b>
 * <p>
 * The Titanium binding of an Android Activity
 * <p>
 * <b>Platforms:</b> android 
 * <p>
 * <b>Since:</b> 1.5
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class Activity {

	private JavaScriptObject handler;

	public Activity(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>intent</b> (Titanium.Android.Intent)
	 * <p>
	 * The Intent that was used to start this Activity
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native JavaScriptObject getIntent() /*-{
		return this.@com.pmt.wrap.titanium.android.Activity::handler.intent;
	}-*/;

	/**
	 * <b>intent</b> (Titanium.Android.Intent)
	 * <p>
	 * The Intent that was used to start this Activity
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setIntent(JavaScriptObject intent) /*-{
		this.@com.pmt.wrap.titanium.android.Activity::handler.intent = intent;
	}-*/;

	/**
	 * <b>onCreateOptionsMenu</b> (function)
	 * <p>
	 * A callback function that is called to initially create an Android Options Menu for this Activity when the user presses the Menu button. See the menu examples in Titanium.Android.Menu
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native JavaScriptObject getOnCreateOptionsMenu() /*-{
		return this.@com.pmt.wrap.titanium.android.Activity::handler.onCreateOptionsMenu;
	}-*/;

	/**
	 * <b>onCreateOptionsMenu</b> (function)
	 * <p>
	 * A callback function that is called to initially create an Android Options Menu for this Activity when the user presses the Menu button. See the menu examples in Titanium.Android.Menu
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setOnCreateOptionsMenu(JavaScriptObject onCreateOptionsMenu) /*-{
		this.@com.pmt.wrap.titanium.android.Activity::handler.onCreateOptionsMenu = onCreateOptionsMenu;
	}-*/;

	/**
	 * <b>onPrepareOptionsMenu</b> (function)
	 * <p>
	 * A callback function that is called to prepare an Options Menu for displaying on this Activity when the user presses the Menu button. See the menu examples in Titanium.Android.Menu
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native JavaScriptObject getOnPrepareOptionsMenu() /*-{
		return this.@com.pmt.wrap.titanium.android.Activity::handler.onPrepareOptionsMenu;
	}-*/;

	/**
	 * <b>onPrepareOptionsMenu</b> (function)
	 * <p>
	 * A callback function that is called to prepare an Options Menu for displaying on this Activity when the user presses the Menu button. See the menu examples in Titanium.Android.Menu
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setOnPrepareOptionsMenu(JavaScriptObject onPrepareOptionsMenu) /*-{
		this.@com.pmt.wrap.titanium.android.Activity::handler.onPrepareOptionsMenu = onPrepareOptionsMenu;
	}-*/;

	/**
	 * <b>requestedOrientation</b> (int)
	 * <p>
	 * The requested orientation of this Activity. See possible constant values that begin with SCREEN_ORIENTATION in the Titanium.Android module.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getRequestedOrientation() /*-{
		return this.@com.pmt.wrap.titanium.android.Activity::handler.requestedOrientation;
	}-*/;

	/**
	 * <b>requestedOrientation</b> (int)
	 * <p>
	 * The requested orientation of this Activity. See possible constant values that begin with SCREEN_ORIENTATION in the Titanium.Android module.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setRequestedOrientation(int requestedOrientation) /*-{
		this.@com.pmt.wrap.titanium.android.Activity::handler.requestedOrientation = requestedOrientation;
	}-*/;

	/**
	 * <b>finish</b>
	 * <p>
	 * Called when the activity is done and should be closed. Also see Android's documentation for finish
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @return void
	 */
	 public native void finish() /*-{
		return this.@com.pmt.wrap.titanium.android.Activity::handler.finish();
	}-*/;

	/**
	 * <b>getIntent</b>
	 * <p>
	 * Returns the Titanium.Android.Intent that was used to start this Activity.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @return <a href="Titanium.Android.Intent.html">Titanium.Android.Intent</a>
	 */
	 public native JavaScriptObject getIntentMethod() /*-{
		return this.@com.pmt.wrap.titanium.android.Activity::handler.getIntentMethod();
	}-*/;

	/**
	 * <b>getString</b>
	 * <p>
	 * Get an Android or Application string using the passed-in Resource ID and optional format arguments. Also see Android's documentation for getString and String Resources
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param resourceId (int) A Resource ID from the Application or Android.
	 * @param format (Array) Optional format arguments for the String resource
	 * @return string
	 */
	 public native String getString(int resourceId, JavaScriptObject format) /*-{
		return this.@com.pmt.wrap.titanium.android.Activity::handler.getString(resourceId, format);
	}-*/;

	/**
	 * <b>setRequestedOrientation</b>
	 * <p>
	 * Set the requested Activity orientation. Also see Android's documentation for setRequestedOrientation
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param orientation (int) Can be one of Titanium.Android.SCREEN_ORIENTATION_BEHIND, Titanium.Android.SCREEN_ORIENTATION_LANDSCAPE, Titanium.Android.SCREEN_ORIENTATION_NOSENSOR, Titanium.Android.SCREEN_ORIENTATION_PORTRAIT, Titanium.Android.SCREEN_ORIENTATION_SENSOR, Titanium.Android.SCREEN_ORIENTATION_UNSPECIFIED, Titanium.Android.SCREEN_ORIENTATION_USER
	 * @return void
	 */
	 public native void setRequestedOrientationMethod(int orientation) /*-{
		return this.@com.pmt.wrap.titanium.android.Activity::handler.setRequestedOrientationMethod(orientation);
	}-*/;

	/**
	 * <b>setResult</b>
	 * <p>
	 * Sets the result of this Activity using an Intent. This should be used in the case when the Activity responds to startActivityForResult. Also see Android's documentation for setResult
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param resultCode (int) The result code for this Activity. Must be one of Titanium.Android.RESULT_OK, Titanium.Android.RESULT_CANCELED, Titanium.Android.RESULT_FIRST_USER
	 * @param intent (Titanium.Android.Intent) An optional Titanium.Android.Intent with extra result data
	 * @return void
	 */
	 public native void setResult(int resultCode, JavaScriptObject intent) /*-{
		return this.@com.pmt.wrap.titanium.android.Activity::handler.setResult(resultCode, intent);
	}-*/;

	/**
	 * <b>startActivity</b>
	 * <p>
	 * Starts a new Activity, using the passed in Intent as the description. Also see Android's documentation for startActivity
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param intent (Titanium.Android.Intent) Description of the Activity to start
	 * @return void
	 */
	 public native void startActivity(JavaScriptObject intent) /*-{
		return this.@com.pmt.wrap.titanium.android.Activity::handler.startActivity(intent);
	}-*/;

	/**
	 * <b>startActivityForResult</b>
	 * <p>
	 * The same as startActivity, but also accepts a callback function for handling the result of the started Activity. Also see Android's documentation for startActivityForResult
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param intent (Titanium.Android.Intent) Description of the Activity to start
	 * @param callback (function) A callback function that is executed when the Activity has set it's result. See example in Titanium.Android.Activity.
	 * @return void
	 */
	 public native void startActivityForResult(JavaScriptObject intent, JavaScriptObject callback) /*-{
		return this.@com.pmt.wrap.titanium.android.Activity::handler.startActivityForResult(intent, callback);
	}-*/;
	

	/**
	 * <b>create</b>
	 * <p>
	 * Fired from the Activity's onCreate
	 * @param create event handler
	 */
	public native void addCreate(com.pmt.wrap.titanium.sys.events.TitaniumAndroidActivityCreateHandler create) /*-{
		this.@com.pmt.wrap.titanium.android.Activity::handler.addEventListener('create', function(source, type) {
			create.@com.pmt.wrap.titanium.sys.events.TitaniumAndroidActivityCreateHandler::create(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type);
		});
	}-*/;
	

	/**
	 * <b>destroy</b>
	 * <p>
	 * Fired from the Activity's onDestroy
	 * @param destroy event handler
	 */
	public native void addDestroy(com.pmt.wrap.titanium.sys.events.TitaniumAndroidActivityDestroyHandler destroy) /*-{
		this.@com.pmt.wrap.titanium.android.Activity::handler.addEventListener('destroy', function(source, type) {
			destroy.@com.pmt.wrap.titanium.sys.events.TitaniumAndroidActivityDestroyHandler::destroy(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type);
		});
	}-*/;
	

	/**
	 * <b>newIntent</b>
	 * <p>
	 * Fired when the application is already running and certain flags are set in the Intent. Fired from the Activity's onNewIntent
	 * @param newIntent event handler
	 */
	public native void addNewIntent(com.pmt.wrap.titanium.sys.events.TitaniumAndroidActivityNewIntentHandler newIntent) /*-{
		this.@com.pmt.wrap.titanium.android.Activity::handler.addEventListener('newIntent', function(source, type, intent) {
			newIntent.@com.pmt.wrap.titanium.sys.events.TitaniumAndroidActivityNewIntentHandler::newIntent(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, intent);
		});
	}-*/;
	

	/**
	 * <b>pause</b>
	 * <p>
	 * Fired from the Activity's onPause
	 * @param pause event handler
	 */
	public native void addPause(com.pmt.wrap.titanium.sys.events.TitaniumAndroidActivityPauseHandler pause) /*-{
		this.@com.pmt.wrap.titanium.android.Activity::handler.addEventListener('pause', function(source, type) {
			pause.@com.pmt.wrap.titanium.sys.events.TitaniumAndroidActivityPauseHandler::pause(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type);
		});
	}-*/;
	

	/**
	 * <b>resume</b>
	 * <p>
	 * Fired from the Activity's onResume
	 * @param resume event handler
	 */
	public native void addResume(com.pmt.wrap.titanium.sys.events.TitaniumAndroidActivityResumeHandler resume) /*-{
		this.@com.pmt.wrap.titanium.android.Activity::handler.addEventListener('resume', function(source, type) {
			resume.@com.pmt.wrap.titanium.sys.events.TitaniumAndroidActivityResumeHandler::resume(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type);
		});
	}-*/;
	

	/**
	 * <b>start</b>
	 * <p>
	 * Fired from the Activity's onStart
	 * @param start event handler
	 */
	public native void addStart(com.pmt.wrap.titanium.sys.events.TitaniumAndroidActivityStartHandler start) /*-{
		this.@com.pmt.wrap.titanium.android.Activity::handler.addEventListener('start', function(source, type) {
			start.@com.pmt.wrap.titanium.sys.events.TitaniumAndroidActivityStartHandler::start(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type);
		});
	}-*/;
	

	/**
	 * <b>stop</b>
	 * <p>
	 * Fired from the Activity's onStop
	 * @param stop event handler
	 */
	public native void addStop(com.pmt.wrap.titanium.sys.events.TitaniumAndroidActivityStopHandler stop) /*-{
		this.@com.pmt.wrap.titanium.android.Activity::handler.addEventListener('stop', function(source, type) {
			stop.@com.pmt.wrap.titanium.sys.events.TitaniumAndroidActivityStopHandler::stop(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type);
		});
	}-*/;
}
