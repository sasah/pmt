package com.pmt.wrap.titanium.android;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Android.RemoteViews</b>
 * <p>
 * The Titanium binding of Android RemoteViews. RemoteViews are an API for referencing and updating views that live in another process (i.e. in a Titanium.Android.Notification)
 * <p>
 * <b>Platforms:</b> android 
 * <p>
 * <b>Since:</b> 1.6
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class RemoteViews {

	private JavaScriptObject handler;

	public RemoteViews(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>setBoolean</b>
	 * <p>
	 * Call a method taking one boolean on a view in the layout for this RemoteViews. See Android's documentation for setBoolean
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.6
	 * @param viewId (int) The resource id of the View (also see <a href="Titanium.App.Android.R.html">Titanium.App.Android.R</a>)
	 * @param methodName (string) The name of the method to call
	 * @param value (boolean) The boolean to pass to the method
	 * @return void
	 */
	 public native void setBoolean(int viewId, String methodName, boolean value) /*-{
		return this.@com.pmt.wrap.titanium.android.RemoteViews::handler.setBoolean(viewId, methodName, value);
	}-*/;

	/**
	 * <b>setChronometer</b>
	 * <p>
	 * Sets a chronometer's base, format, and started flag. See Android's documentation for setChronometer
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.6
	 * @param viewId (int) The resource id of the Chronometer whose values will change (also see <a href="Titanium.App.Android.R.html">Titanium.App.Android.R</a>)
	 * @param base (date) The time at which the timer would have read 0:00
	 * @param format (string) The Chronometer format string, or null to simply display the timer value
	 * @param started (boolean) True if you want the clock to be started, false if not
	 * @return void
	 */
	 public native void setChronometer(int viewId, JavaScriptObject base, String format, boolean started) /*-{
		return this.@com.pmt.wrap.titanium.android.RemoteViews::handler.setChronometer(viewId, base, format, started);
	}-*/;

	/**
	 * <b>setDouble</b>
	 * <p>
	 * Call a method taking one double on a view in the layout for this RemoteViews. See Android's documentation for setDouble
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.6
	 * @param viewId (int) The resource id of the View (also see <a href="Titanium.App.Android.R.html">Titanium.App.Android.R</a>)
	 * @param methodName (string) The name of the method to call
	 * @param value (double) The double to pass to the method
	 * @return void
	 */
	 public native void setDouble(int viewId, String methodName, double value) /*-{
		return this.@com.pmt.wrap.titanium.android.RemoteViews::handler.setDouble(viewId, methodName, value);
	}-*/;

	/**
	 * <b>setImageViewResource</b>
	 * <p>
	 * Sets an ImageView's source given a Resource ID. See Android's documentation for setImageViewResource
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.6
	 * @param viewId (int) The resource id of the ImageView whose image should change (also see <a href="Titanium.App.Android.R.html">Titanium.App.Android.R</a>)
	 * @param srcId (int) The resource id of the image
	 * @return void
	 */
	 public native void setImageViewResource(int viewId, int srcId) /*-{
		return this.@com.pmt.wrap.titanium.android.RemoteViews::handler.setImageViewResource(viewId, srcId);
	}-*/;

	/**
	 * <b>setImageViewUri</b>
	 * <p>
	 * Sets an ImageView's source given a URI (supports both Android and Titanium URLs). See Android's documentation for setImageViewUri
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.6
	 * @param viewId (int) The resource id of the ImageView whose image should change (also see <a href="Titanium.App.Android.R.html">Titanium.App.Android.R</a>)
	 * @param uri (string) The URI of the image (both Android and Titanium URLs are supported)
	 * @return void
	 */
	 public native void setImageViewUri(int viewId, String uri) /*-{
		return this.@com.pmt.wrap.titanium.android.RemoteViews::handler.setImageViewUri(viewId, uri);
	}-*/;

	/**
	 * <b>setInt</b>
	 * <p>
	 * Call a method taking one int on a view in the layout for this RemoteViews. See Android's documentation for setInt
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.6
	 * @param viewId (int) The resource id of the View (also see <a href="Titanium.App.Android.R.html">Titanium.App.Android.R</a>)
	 * @param methodName (string) The name of the method to call
	 * @param value (int) The int to pass to the method
	 * @return void
	 */
	 public native void setInt(int viewId, String methodName, int value) /*-{
		return this.@com.pmt.wrap.titanium.android.RemoteViews::handler.setInt(viewId, methodName, value);
	}-*/;

	/**
	 * <b>setOnClickPendingIntent</b>
	 * <p>
	 * Launches a Titanium.Android.PendingIntent when the specified view is clicked. See Android's documentation for setOnClickPendingIntent
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.6
	 * @param viewId (int) The resource id of the View to add a click listener to (also see <a href="Titanium.App.Android.R.html">Titanium.App.Android.R</a>)
	 * @param pendingIntent (<tt>Ti.Android.PendingIntent</tt>) The PendingIntent to execute when this view is clicked
	 * @return void
	 */
	 public native void setOnClickPendingIntent(int viewId, JavaScriptObject pendingIntent) /*-{
		return this.@com.pmt.wrap.titanium.android.RemoteViews::handler.setOnClickPendingIntent(viewId, pendingIntent);
	}-*/;

	/**
	 * <b>setProgressBar</b>
	 * <p>
	 * Sets the progress, max value, and indeterminate flag of a ProgressBar. See Android's documentation for setProgressBar
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.6
	 * @param viewId (int) The resource id of the ProgressBar to change (also see <a href="Titanium.App.Android.R.html">Titanium.App.Android.R</a>)
	 * @param max (int) The new max value of the ProgressBar
	 * @param progress (int) The new progress value of the ProgressBar (from 0..max)
	 * @param indeterminate (boolean) Whether or not the progress in indeterminate
	 * @return void
	 */
	 public native void setProgressBar(int viewId, int max, int progress, boolean indeterminate) /*-{
		return this.@com.pmt.wrap.titanium.android.RemoteViews::handler.setProgressBar(viewId, max, progress, indeterminate);
	}-*/;

	/**
	 * <b>setString</b>
	 * <p>
	 * Call a method taking one String on a view in the layout for this RemoteViews. See Android's documentation for setString
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.6
	 * @param viewId (int) The resource id of the View (also see <a href="Titanium.App.Android.R.html">Titanium.App.Android.R</a>)
	 * @param methodName (string) The name of the method to call
	 * @param value (string) The String to pass to the method
	 * @return void
	 */
	 public native void setString(int viewId, String methodName, String value) /*-{
		return this.@com.pmt.wrap.titanium.android.RemoteViews::handler.setString(viewId, methodName, value);
	}-*/;

	/**
	 * <b>setTextColor</b>
	 * <p>
	 * Sets the text color of a view. See Android's documentation for setTextColor
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.6
	 * @param viewId (int) The resource id of the View whose text color will change (also see <a href="Titanium.App.Android.R.html">Titanium.App.Android.R</a>)
	 * @param color (int) A color as an integer
	 * @return void
	 */
	 public native void setTextColor(int viewId, int color) /*-{
		return this.@com.pmt.wrap.titanium.android.RemoteViews::handler.setTextColor(viewId, color);
	}-*/;

	/**
	 * <b>setTextViewText</b>
	 * <p>
	 * Sets the text of a TextView. See Android's documentation for setTextViewText
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.6
	 * @param viewId (int) The resource id of the TextView whose text will change (also see <a href="Titanium.App.Android.R.html">Titanium.App.Android.R</a>)
	 * @param text (string) The new text of the TextView
	 * @return void
	 */
	 public native void setTextViewText(int viewId, String text) /*-{
		return this.@com.pmt.wrap.titanium.android.RemoteViews::handler.setTextViewText(viewId, text);
	}-*/;

	/**
	 * <b>setUri</b>
	 * <p>
	 * Call a method taking one Uri on a view in the layout for this RemoteViews. See Android's documentation for setUri
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.6
	 * @param viewId (int) The resource id of the View (also see <a href="Titanium.App.Android.R.html">Titanium.App.Android.R</a>)
	 * @param methodName (string) The name of the method to call
	 * @param value (string) The URI (as a string) to pass to the method
	 * @return void
	 */
	 public native void setUri(int viewId, String methodName, String value) /*-{
		return this.@com.pmt.wrap.titanium.android.RemoteViews::handler.setUri(viewId, methodName, value);
	}-*/;

	/**
	 * <b>setViewVisibility</b>
	 * <p>
	 * Sets the visibility of a View. See Android's documentation for setViewVisibility
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.6
	 * @param viewId (int) The resource id of the View whose visibility will change (also see <a href="Titanium.App.Android.R.html">Titanium.App.Android.R</a>)
	 * @param visibility (int) The visibility, one of <a href="Titanium.Android.VISIBLE.html">Titanium.Android.VISIBLE</a>, <a href="Titanium.Android.INVISIBLE.html">Titanium.Android.INVISIBLE</a>, or <a href="Titanium.Android.GONE.html">Titanium.Android.GONE</a>
	 * @return void
	 */
	 public native void setViewVisibility(int viewId, int visibility) /*-{
		return this.@com.pmt.wrap.titanium.android.RemoteViews::handler.setViewVisibility(viewId, visibility);
	}-*/;
}
