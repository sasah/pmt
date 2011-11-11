package com.pmt.wrap.titanium.android;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Android.Notification</b>
 * <p>
 * The Titanium binding of an Android Notification. 
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
public class Notification {

	private JavaScriptObject handler;

	public Notification(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>audioStreamType</b> (int)
	 * <p>
	 * The audio stream type to use when playing the sound.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getAudioStreamType() /*-{
		return this.@com.pmt.wrap.titanium.android.Notification::handler.audioStreamType;
	}-*/;

	/**
	 * <b>audioStreamType</b> (int)
	 * <p>
	 * The audio stream type to use when playing the sound.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setAudioStreamType(int audioStreamType) /*-{
		this.@com.pmt.wrap.titanium.android.Notification::handler.audioStreamType = audioStreamType;
	}-*/;

	/**
	 * <b>contentIntent</b> (object)
	 * <p>
	 * The Titanium.Android.PendingIntent to execute when the expanded status entry is clicked.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native JavaScriptObject getContentIntent() /*-{
		return this.@com.pmt.wrap.titanium.android.Notification::handler.contentIntent;
	}-*/;

	/**
	 * <b>contentIntent</b> (object)
	 * <p>
	 * The Titanium.Android.PendingIntent to execute when the expanded status entry is clicked.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setContentIntent(JavaScriptObject contentIntent) /*-{
		this.@com.pmt.wrap.titanium.android.Notification::handler.contentIntent = contentIntent;
	}-*/;

	/**
	 * <b>contentText</b> (string)
	 * <p>
	 * Description text of the notification.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native String getContentText() /*-{
		return this.@com.pmt.wrap.titanium.android.Notification::handler.contentText;
	}-*/;

	/**
	 * <b>contentText</b> (string)
	 * <p>
	 * Description text of the notification.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setContentText(String contentText) /*-{
		this.@com.pmt.wrap.titanium.android.Notification::handler.contentText = contentText;
	}-*/;

	/**
	 * <b>contentTitle</b> (string)
	 * <p>
	 * Title of the notification.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native String getContentTitle() /*-{
		return this.@com.pmt.wrap.titanium.android.Notification::handler.contentTitle;
	}-*/;

	/**
	 * <b>contentTitle</b> (string)
	 * <p>
	 * Title of the notification.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setContentTitle(String contentTitle) /*-{
		this.@com.pmt.wrap.titanium.android.Notification::handler.contentTitle = contentTitle;
	}-*/;

	/**
	 * <b>defaults</b> (int)
	 * <p>
	 * Specifies which values should be taken from the defaults.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getDefaults() /*-{
		return this.@com.pmt.wrap.titanium.android.Notification::handler.defaults;
	}-*/;

	/**
	 * <b>defaults</b> (int)
	 * <p>
	 * Specifies which values should be taken from the defaults.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setDefaults(int defaults) /*-{
		this.@com.pmt.wrap.titanium.android.Notification::handler.defaults = defaults;
	}-*/;

	/**
	 * <b>deleteIntent</b> (object)
	 * <p>
	 * The Titanium.Android.PendingIntent to execute when the status entry is deleted by the user with the "Clear All Notifications" button.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native JavaScriptObject getDeleteIntent() /*-{
		return this.@com.pmt.wrap.titanium.android.Notification::handler.deleteIntent;
	}-*/;

	/**
	 * <b>deleteIntent</b> (object)
	 * <p>
	 * The Titanium.Android.PendingIntent to execute when the status entry is deleted by the user with the "Clear All Notifications" button.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setDeleteIntent(JavaScriptObject deleteIntent) /*-{
		this.@com.pmt.wrap.titanium.android.Notification::handler.deleteIntent = deleteIntent;
	}-*/;

	/**
	 * <b>flags</b> (int)
	 * <p>
	 * Set of flags for the notification, defaults to Titanium.Android.FLAG_AUTO_CANCEL. Possible values: Titanium.Android.FLAG_AUTO_CANCEL, Titanium.Android.FLAG_INSISTENT, Titanium.Android.FLAG_NO_CLEAR, Titanium.Android.FLAG_ONGOING_EVENT, Titanium.Android.FLAG_ONLY_ALERT_ONCE, Titanium.Android.FLAG_SHOW_LIGHTS
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getFlags() /*-{
		return this.@com.pmt.wrap.titanium.android.Notification::handler.flags;
	}-*/;

	/**
	 * <b>flags</b> (int)
	 * <p>
	 * Set of flags for the notification, defaults to Titanium.Android.FLAG_AUTO_CANCEL. Possible values: Titanium.Android.FLAG_AUTO_CANCEL, Titanium.Android.FLAG_INSISTENT, Titanium.Android.FLAG_NO_CLEAR, Titanium.Android.FLAG_ONGOING_EVENT, Titanium.Android.FLAG_ONLY_ALERT_ONCE, Titanium.Android.FLAG_SHOW_LIGHTS
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setFlags(int flags) /*-{
		this.@com.pmt.wrap.titanium.android.Notification::handler.flags = flags;
	}-*/;

	/**
	 * <b>icon</b> (int, string)
	 * <p>
	 * A resource id or URL to an icon (the URL must be an image located in Resources/android/images/ or an Android content URI)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getIconI() /*-{
		return this.@com.pmt.wrap.titanium.android.Notification::handler.icon;
	}-*/;

	/**
	 * <b>icon</b> (int, string)
	 * <p>
	 * A resource id or URL to an icon (the URL must be an image located in Resources/android/images/ or an Android content URI)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setIcon(int icon) /*-{
		this.@com.pmt.wrap.titanium.android.Notification::handler.icon = icon;
	}-*/;

	/**
	 * <b>icon</b> (int, string)
	 * <p>
	 * A resource id or URL to an icon (the URL must be an image located in Resources/android/images/ or an Android content URI)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native String getIconS() /*-{
		return this.@com.pmt.wrap.titanium.android.Notification::handler.icon;
	}-*/;

	/**
	 * <b>icon</b> (int, string)
	 * <p>
	 * A resource id or URL to an icon (the URL must be an image located in Resources/android/images/ or an Android content URI)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setIcon(String icon) /*-{
		this.@com.pmt.wrap.titanium.android.Notification::handler.icon = icon;
	}-*/;

	/**
	 * <b>ledARGB</b> (int)
	 * <p>
	 * The color for the LED to blink
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getLedARGB() /*-{
		return this.@com.pmt.wrap.titanium.android.Notification::handler.ledARGB;
	}-*/;

	/**
	 * <b>ledARGB</b> (int)
	 * <p>
	 * The color for the LED to blink
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setLedARGB(int ledARGB) /*-{
		this.@com.pmt.wrap.titanium.android.Notification::handler.ledARGB = ledARGB;
	}-*/;

	/**
	 * <b>ledOffMS</b> (int)
	 * <p>
	 * The number of milliseconds for the LED to be off while it's flashing.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getLedOffMS() /*-{
		return this.@com.pmt.wrap.titanium.android.Notification::handler.ledOffMS;
	}-*/;

	/**
	 * <b>ledOffMS</b> (int)
	 * <p>
	 * The number of milliseconds for the LED to be off while it's flashing.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setLedOffMS(int ledOffMS) /*-{
		this.@com.pmt.wrap.titanium.android.Notification::handler.ledOffMS = ledOffMS;
	}-*/;

	/**
	 * <b>ledOnMS</b> (int)
	 * <p>
	 * The number of milliseconds for the LED to be on while it's flashing.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getLedOnMS() /*-{
		return this.@com.pmt.wrap.titanium.android.Notification::handler.ledOnMS;
	}-*/;

	/**
	 * <b>ledOnMS</b> (int)
	 * <p>
	 * The number of milliseconds for the LED to be on while it's flashing.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setLedOnMS(int ledOnMS) /*-{
		this.@com.pmt.wrap.titanium.android.Notification::handler.ledOnMS = ledOnMS;
	}-*/;

	/**
	 * <b>number</b> (int)
	 * <p>
	 * The number of events that this notification represents.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getNumber() /*-{
		return this.@com.pmt.wrap.titanium.android.Notification::handler.number;
	}-*/;

	/**
	 * <b>number</b> (int)
	 * <p>
	 * The number of events that this notification represents.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setNumber(int number) /*-{
		this.@com.pmt.wrap.titanium.android.Notification::handler.number = number;
	}-*/;

	/**
	 * <b>sound</b> (string)
	 * <p>
	 * A URL to the sound to play (supports Android + Titanium URLs)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native String getSound() /*-{
		return this.@com.pmt.wrap.titanium.android.Notification::handler.sound;
	}-*/;

	/**
	 * <b>sound</b> (string)
	 * <p>
	 * A URL to the sound to play (supports Android + Titanium URLs)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setSound(String sound) /*-{
		this.@com.pmt.wrap.titanium.android.Notification::handler.sound = sound;
	}-*/;

	/**
	 * <b>tickerText</b> (string)
	 * <p>
	 * Text to scroll across the screen when this item is added to the status bar.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native String getTickerText() /*-{
		return this.@com.pmt.wrap.titanium.android.Notification::handler.tickerText;
	}-*/;

	/**
	 * <b>tickerText</b> (string)
	 * <p>
	 * Text to scroll across the screen when this item is added to the status bar.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setTickerText(String tickerText) /*-{
		this.@com.pmt.wrap.titanium.android.Notification::handler.tickerText = tickerText;
	}-*/;

	/**
	 * <b>when</b> (date, int)
	 * <p>
	 * The timestamp for the notification (defaults to the current time)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getWhen() /*-{
		return this.@com.pmt.wrap.titanium.android.Notification::handler.when;
	}-*/;

	/**
	 * <b>when</b> (date, int)
	 * <p>
	 * The timestamp for the notification (defaults to the current time)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setWhen(int when) /*-{
		this.@com.pmt.wrap.titanium.android.Notification::handler.when = when;
	}-*/;

	/**
	 * <b>setLatestEventInfo</b>
	 * <p>
	 * Sets the latest event info using the builtin Notification View for this notification. See Android's documentation for setLatestEventInfo
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @return void
	 */
	 public native void setLatestEventInfo() /*-{
		return this.@com.pmt.wrap.titanium.android.Notification::handler.setLatestEventInfo();
	}-*/;
}
