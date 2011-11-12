package com.pmt.wrap.titanium.android;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Android.Intent</b>
 * <p>
 * The Titanium binding of an Android Intent
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
public class Intent {

	private JavaScriptObject handler;

	public Intent(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>action</b> (string)
	 * <p>
	 * An action constant from Titanium.Android
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native String getAction() /*-{
		return this.@com.pmt.wrap.titanium.android.Intent::handler.action;
	}-*/;

	/**
	 * <b>action</b> (string)
	 * <p>
	 * An action constant from Titanium.Android
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setAction(String action) /*-{
		this.@com.pmt.wrap.titanium.android.Intent::handler.action = action;
	}-*/;

	/**
	 * <b>className</b> (string)
	 * <p>
	 * The Java class name of the activity (packageName must also be set)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native String getClassName() /*-{
		return this.@com.pmt.wrap.titanium.android.Intent::handler.className;
	}-*/;

	/**
	 * <b>className</b> (string)
	 * <p>
	 * The Java class name of the activity (packageName must also be set)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setClassName(String className) /*-{
		this.@com.pmt.wrap.titanium.android.Intent::handler.className = className;
	}-*/;

	/**
	 * <b>data</b> (string)
	 * <p>
	 * The Intent's Data URI. See also Android's Intent.setData
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native String getData() /*-{
		return this.@com.pmt.wrap.titanium.android.Intent::handler.data;
	}-*/;

	/**
	 * <b>data</b> (string)
	 * <p>
	 * The Intent's Data URI. See also Android's Intent.setData
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setData(String data) /*-{
		this.@com.pmt.wrap.titanium.android.Intent::handler.data = data;
	}-*/;

	/**
	 * <b>flags</b> (int)
	 * <p>
	 * Intent flags. See the flags constants in Titanium.Android.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getFlags() /*-{
		return this.@com.pmt.wrap.titanium.android.Intent::handler.flags;
	}-*/;

	/**
	 * <b>flags</b> (int)
	 * <p>
	 * Intent flags. See the flags constants in Titanium.Android.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setFlags(int flags) /*-{
		this.@com.pmt.wrap.titanium.android.Intent::handler.flags = flags;
	}-*/;

	/**
	 * <b>packageName</b> (string)
	 * <p>
	 * The fully-qualified Java package name of the activity
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native String getPackageName() /*-{
		return this.@com.pmt.wrap.titanium.android.Intent::handler.packageName;
	}-*/;

	/**
	 * <b>packageName</b> (string)
	 * <p>
	 * The fully-qualified Java package name of the activity
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setPackageName(String packageName) /*-{
		this.@com.pmt.wrap.titanium.android.Intent::handler.packageName = packageName;
	}-*/;

	/**
	 * <b>type</b> (string)
	 * <p>
	 * The mime type for this Intent. See also Android's Intent.setType
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native String getType() /*-{
		return this.@com.pmt.wrap.titanium.android.Intent::handler.type;
	}-*/;

	/**
	 * <b>type</b> (string)
	 * <p>
	 * The mime type for this Intent. See also Android's Intent.setType
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setType(String type) /*-{
		this.@com.pmt.wrap.titanium.android.Intent::handler.type = type;
	}-*/;

	/**
	 * <b>url</b> (string)
	 * <p>
	 * The URL to a Titanium Javascript Activity
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native String getUrl() /*-{
		return this.@com.pmt.wrap.titanium.android.Intent::handler.url;
	}-*/;

	/**
	 * <b>url</b> (string)
	 * <p>
	 * The URL to a Titanium Javascript Activity
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setUrl(String url) /*-{
		this.@com.pmt.wrap.titanium.android.Intent::handler.url = url;
	}-*/;

	/**
	 * <b>addCategory</b>
	 * <p>
	 * Add a category to this Intent. See the category constants in Titanium.Android.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param name (string) The category name. See the category constants in Titanium.Android
	 * @return void
	 */
	 public native void addCategory(String name) /*-{
		this.@com.pmt.wrap.titanium.android.Intent::handler.addCategory(name);
	}-*/;

	/**
	 * <b>addFlags</b>
	 * <p>
	 * augment the existing flags on the Intent.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param flags (int) the flags to add to the existing set.
	 * @return void
	 */
	 public native void addFlags(int flags) /*-{
		this.@com.pmt.wrap.titanium.android.Intent::handler.addFlags(flags);
	}-*/;

	/**
	 * <b>getBooleanExtra</b>
	 * <p>
	 * Get a boolean property from this Intent
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param name (string) The boolean property to get
	 * @return boolean
	 */
	 public native boolean getBooleanExtra(String name) /*-{
		return this.@com.pmt.wrap.titanium.android.Intent::handler.getBooleanExtra(name);
	}-*/;

	/**
	 * <b>getData</b>
	 * <p>
	 * Get the Data URI from this Intent
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @return void
	 */
	 public native void getDataMethod() /*-{
		this.@com.pmt.wrap.titanium.android.Intent::handler.getData();
	}-*/;

	/**
	 * <b>getDoubleExtra</b>
	 * <p>
	 * Get a double property from this Intent
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param name (string) The double property to get
	 * @return double
	 */
	 public native double getDoubleExtra(String name) /*-{
		return this.@com.pmt.wrap.titanium.android.Intent::handler.getDoubleExtra(name);
	}-*/;

	/**
	 * <b>getIntExtra</b>
	 * <p>
	 * Get a int property from this Intent
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param name (string) The int property to get
	 * @return int
	 */
	 public native int getIntExtra(String name) /*-{
		return this.@com.pmt.wrap.titanium.android.Intent::handler.getIntExtra(name);
	}-*/;

	/**
	 * <b>getLongExtra</b>
	 * <p>
	 * Get a long property from this Intent
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param name (string) The long property to get
	 * @return int
	 */
	 public native int getLongExtra(String name) /*-{
		return this.@com.pmt.wrap.titanium.android.Intent::handler.getLongExtra(name);
	}-*/;

	/**
	 * <b>getStringExtra</b>
	 * <p>
	 * Get a string property from this Intent
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param name (string) The string property to get
	 * @return string
	 */
	 public native String getStringExtra(String name) /*-{
		return this.@com.pmt.wrap.titanium.android.Intent::handler.getStringExtra(name);
	}-*/;

	/**
	 * <b>hasExtra</b>
	 * <p>
	 * Returns whether or not this Intent has a property
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param name (string) The property name to check for
	 * @return boolean
	 */
	 public native boolean hasExtra(String name) /*-{
		return this.@com.pmt.wrap.titanium.android.Intent::handler.hasExtra(name);
	}-*/;

	/**
	 * <b>putExtra</b>
	 * <p>
	 * Put an extra property on this Intent
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param name (string) The property name
	 * @param value (object) The property value
	 * @return void
	 */
	 public native void putExtra(String name, JavaScriptObject value) /*-{
		this.@com.pmt.wrap.titanium.android.Intent::handler.putExtra(name, value);
	}-*/;

	/**
	 * <b>putExtraUri</b>
	 * <p>
	 * Put a URI property on this Intent (useful for Titanium.Android.EXTRA_STREAM)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @param name (string) The property name
	 * @param value (string) The URI string
	 * @return void
	 */
	 public native void putExtraUri(String name, String value) /*-{
		this.@com.pmt.wrap.titanium.android.Intent::handler.putExtraUri(name, value);
	}-*/;
}
