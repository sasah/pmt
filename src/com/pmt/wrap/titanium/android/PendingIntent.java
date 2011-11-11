package com.pmt.wrap.titanium.android;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Android.PendingIntent</b>
 * <p>
 * The Titanium binding of an Android Pending Intent
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
public class PendingIntent {

	private JavaScriptObject handler;

	public PendingIntent(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>flags</b> (int)
	 * <p>
	 * Flags used for creating the Pending Intent. Possible values are Titanium.Android.FLAG_CANCEL_CURRENT, Titanium.Android.FLAG_NO_CREATE, Titanium.Android.FLAG_ONE_SHOT, and Titanium.Android.FLAG_UPDATE_CURRENT.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getFlags() /*-{
		return this.@com.pmt.wrap.titanium.android.PendingIntent::handler.flags;
	}-*/;

	/**
	 * <b>flags</b> (int)
	 * <p>
	 * Flags used for creating the Pending Intent. Possible values are Titanium.Android.FLAG_CANCEL_CURRENT, Titanium.Android.FLAG_NO_CREATE, Titanium.Android.FLAG_ONE_SHOT, and Titanium.Android.FLAG_UPDATE_CURRENT.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setFlags(int flags) /*-{
		this.@com.pmt.wrap.titanium.android.PendingIntent::handler.flags = flags;
	}-*/;

	/**
	 * <b>intent</b> (`Titanium.Android.Intent`)
	 * <p>
	 * The intent data to pass to the Activity launched by this PendingIntent
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native JavaScriptObject getIntent() /*-{
		return this.@com.pmt.wrap.titanium.android.PendingIntent::handler.intent;
	}-*/;

	/**
	 * <b>intent</b> (`Titanium.Android.Intent`)
	 * <p>
	 * The intent data to pass to the Activity launched by this PendingIntent
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setIntent(JavaScriptObject intent) /*-{
		this.@com.pmt.wrap.titanium.android.PendingIntent::handler.intent = intent;
	}-*/;
}
