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
	 * <b>intent</b> (`Titanium.Android.Intent`)
	 * <p>
	 * The Intent that was used to start this Activity
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native JavaScriptObject getIntent() /*-{
		return this.@com.pmt.wrap.titanium.android.Activity::handler.intent;
	}-*/;

	/**
	 * <b>intent</b> (`Titanium.Android.Intent`)
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
	 * @param format (Array<Object>) Optional format arguments for the String resource
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
	 * @param orientation (int) Can be one of <a href="Titanium.Android.SCREEN_ORIENTATION_BEHIND.html">Titanium.Android.SCREEN_ORIENTATION_BEHIND</a>, <a href="Titanium.Android.SCREEN_ORIENTATION_LANDSCAPE.html">Titanium.Android.SCREEN_ORIENTATION_LANDSCAPE</a>, <a href="Titanium.Android.SCREEN_ORIENTATION_NOSENSOR.html">Titanium.Android.SCREEN_ORIENTATION_NOSENSOR</a>, <a href="Titanium.Android.SCREEN_ORIENTATION_PORTRAIT.html">Titanium.Android.SCREEN_ORIENTATION_PORTRAIT</a>, <a href="Titanium.Android.SCREEN_ORIENTATION_SENSOR.html">Titanium.Android.SCREEN_ORIENTATION_SENSOR</a>, <a href="Titanium.Android.SCREEN_ORIENTATION_UNSPECIFIED.html">Titanium.Android.SCREEN_ORIENTATION_UNSPECIFIED</a>, <a href="Titanium.Android.SCREEN_ORIENTATION_USER.html">Titanium.Android.SCREEN_ORIENTATION_USER</a>
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
	 * @param resultCode (int) The result code for this Activity. Must be one of <a href="Titanium.Android.RESULT_OK.html">Titanium.Android.RESULT_OK</a>, <a href="Titanium.Android.RESULT_CANCELED.html">Titanium.Android.RESULT_CANCELED</a>, <a href="Titanium.Android.RESULT_FIRST_USER.html">Titanium.Android.RESULT_FIRST_USER</a>
	 * @param intent (<a href="Titanium.Android.Intent.html">Titanium.Android.Intent</a>) An optional <a href="Titanium.Android.Intent.html">Titanium.Android.Intent</a> with extra result data
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
	 * @param intent (<a href="Titanium.Android.Intent.html">Titanium.Android.Intent</a>) Description of the Activity to start
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
	 * @param intent (<a href="Titanium.Android.Intent.html">Titanium.Android.Intent</a>) Description of the Activity to start
	 * @param callback (function) A callback function that is executed when the Activity has set it's result. See example in <a href="Titanium.Android.Activity-object.html">Titanium.Android.Activity</a>.
	 * @return void
	 */
	 public native void startActivityForResult(JavaScriptObject intent, JavaScriptObject callback) /*-{
		return this.@com.pmt.wrap.titanium.android.Activity::handler.startActivityForResult(intent, callback);
	}-*/;

	/**
	 * <b>create</b>
	 * <p>
	 * Fired from the Activity's onCreate
	 */
	public interface CreateHandler {
		/**
		 * <b>create</b>
		 * <p>
		 * Fired from the Activity's onCreate
		 * @param source the source object that fired the event
		 * @param type the name of the event fired
		 */
		void create(JavaScriptObject source, JavaScriptObject type);
	}

	/**
	 * <b>create</b>
	 * <p>
	 * Fired from the Activity's onCreate
	 * @param create event handler
	 */
	public native void addCreate(CreateHandler create) /*-{
		this.@com.pmt.wrap.titanium.android.Activity::handler.addEventListener('create', function(source, type) {
			create.@com.pmt.wrap.titanium.android.Activity.CreateHandler::create(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type);
		});
	}-*/;

	/**
	 * <b>destroy</b>
	 * <p>
	 * Fired from the Activity's onDestroy
	 */
	public interface DestroyHandler {
		/**
		 * <b>destroy</b>
		 * <p>
		 * Fired from the Activity's onDestroy
		 * @param source the source object that fired the event
		 * @param type the name of the event fired
		 */
		void destroy(JavaScriptObject source, JavaScriptObject type);
	}

	/**
	 * <b>destroy</b>
	 * <p>
	 * Fired from the Activity's onDestroy
	 * @param destroy event handler
	 */
	public native void addDestroy(DestroyHandler destroy) /*-{
		this.@com.pmt.wrap.titanium.android.Activity::handler.addEventListener('destroy', function(source, type) {
			destroy.@com.pmt.wrap.titanium.android.Activity.DestroyHandler::destroy(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type);
		});
	}-*/;

	/**
	 * <b>newIntent</b>
	 * <p>
	 * Fired when the application is already running and certain flags are set in the Intent. Fired from the Activity's onNewIntent
	 */
	public interface NewIntentHandler {
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

	/**
	 * <b>newIntent</b>
	 * <p>
	 * Fired when the application is already running and certain flags are set in the Intent. Fired from the Activity's onNewIntent
	 * @param newIntent event handler
	 */
	public native void addNewIntent(NewIntentHandler newIntent) /*-{
		this.@com.pmt.wrap.titanium.android.Activity::handler.addEventListener('newIntent', function(source, type, intent) {
			newIntent.@com.pmt.wrap.titanium.android.Activity.NewIntentHandler::newIntent(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, intent);
		});
	}-*/;

	/**
	 * <b>pause</b>
	 * <p>
	 * Fired from the Activity's onPause
	 */
	public interface PauseHandler {
		/**
		 * <b>pause</b>
		 * <p>
		 * Fired from the Activity's onPause
		 * @param source the source object that fired the event
		 * @param type the name of the event fired
		 */
		void pause(JavaScriptObject source, JavaScriptObject type);
	}

	/**
	 * <b>pause</b>
	 * <p>
	 * Fired from the Activity's onPause
	 * @param pause event handler
	 */
	public native void addPause(PauseHandler pause) /*-{
		this.@com.pmt.wrap.titanium.android.Activity::handler.addEventListener('pause', function(source, type) {
			pause.@com.pmt.wrap.titanium.android.Activity.PauseHandler::pause(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type);
		});
	}-*/;

	/**
	 * <b>resume</b>
	 * <p>
	 * Fired from the Activity's onResume
	 */
	public interface ResumeHandler {
		/**
		 * <b>resume</b>
		 * <p>
		 * Fired from the Activity's onResume
		 * @param source the source object that fired the event
		 * @param type the name of the event fired
		 */
		void resume(JavaScriptObject source, JavaScriptObject type);
	}

	/**
	 * <b>resume</b>
	 * <p>
	 * Fired from the Activity's onResume
	 * @param resume event handler
	 */
	public native void addResume(ResumeHandler resume) /*-{
		this.@com.pmt.wrap.titanium.android.Activity::handler.addEventListener('resume', function(source, type) {
			resume.@com.pmt.wrap.titanium.android.Activity.ResumeHandler::resume(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type);
		});
	}-*/;

	/**
	 * <b>start</b>
	 * <p>
	 * Fired from the Activity's onStart
	 */
	public interface StartHandler {
		/**
		 * <b>start</b>
		 * <p>
		 * Fired from the Activity's onStart
		 * @param source the source object that fired the event
		 * @param type the name of the event fired
		 */
		void start(JavaScriptObject source, JavaScriptObject type);
	}

	/**
	 * <b>start</b>
	 * <p>
	 * Fired from the Activity's onStart
	 * @param start event handler
	 */
	public native void addStart(StartHandler start) /*-{
		this.@com.pmt.wrap.titanium.android.Activity::handler.addEventListener('start', function(source, type) {
			start.@com.pmt.wrap.titanium.android.Activity.StartHandler::start(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type);
		});
	}-*/;

	/**
	 * <b>stop</b>
	 * <p>
	 * Fired from the Activity's onStop
	 */
	public interface StopHandler {
		/**
		 * <b>stop</b>
		 * <p>
		 * Fired from the Activity's onStop
		 * @param source the source object that fired the event
		 * @param type the name of the event fired
		 */
		void stop(JavaScriptObject source, JavaScriptObject type);
	}

	/**
	 * <b>stop</b>
	 * <p>
	 * Fired from the Activity's onStop
	 * @param stop event handler
	 */
	public native void addStop(StopHandler stop) /*-{
		this.@com.pmt.wrap.titanium.android.Activity::handler.addEventListener('stop', function(source, type) {
			stop.@com.pmt.wrap.titanium.android.Activity.StopHandler::stop(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type);
		});
	}-*/;
}
