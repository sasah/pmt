package com.pmt.wrap.titanium.ui.iphone;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.iPhone.SystemButton</b>
 * <p>
 * A set of constants for the system button style for buttons.
 * <p>
 * <b>Platforms:</b> iphone ipad 
 * <p>
 * <b>Since:</b> 0.8
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class SystemButton {

	private JavaScriptObject handler;

	public SystemButton(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>ACTION</b> (int) static
	 * <p>
	 * action icon. Usable in nav bars and toolbars only.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int ACTION() /*-{
		return Titanium.UI.iPhone.SystemButton.ACTION;
	}-*/;

	/**
	 * <b>ACTIVITY</b> (int) static
	 * <p>
	 * special style that shows an activity indicator. when visible, the activity indicator is already started.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int ACTIVITY() /*-{
		return Titanium.UI.iPhone.SystemButton.ACTIVITY;
	}-*/;

	/**
	 * <b>ADD</b> (int) static
	 * <p>
	 * add icon. Usable in nav bars and toolbars only.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int ADD() /*-{
		return Titanium.UI.iPhone.SystemButton.ADD;
	}-*/;

	/**
	 * <b>BOOKMARKS</b> (int) static
	 * <p>
	 * bookmarks icon. Usable in nav bars and toolbars only.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int BOOKMARKS() /*-{
		return Titanium.UI.iPhone.SystemButton.BOOKMARKS;
	}-*/;

	/**
	 * <b>CAMERA</b> (int) static
	 * <p>
	 * camera icon. Usable in nav bars and toolbars only.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int CAMERA() /*-{
		return Titanium.UI.iPhone.SystemButton.CAMERA;
	}-*/;

	/**
	 * <b>CANCEL</b> (int) static
	 * <p>
	 * cancel icon. localized. Usable in nav bars and toolbars only.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int CANCEL() /*-{
		return Titanium.UI.iPhone.SystemButton.CANCEL;
	}-*/;

	/**
	 * <b>COMPOSE</b> (int) static
	 * <p>
	 * compose icon. Usable in nav bars and toolbars only.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int COMPOSE() /*-{
		return Titanium.UI.iPhone.SystemButton.COMPOSE;
	}-*/;

	/**
	 * <b>CONTACT_ADD</b> (int) static
	 * <p>
	 * green style plus (+) icon
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int CONTACT_ADD() /*-{
		return Titanium.UI.iPhone.SystemButton.CONTACT_ADD;
	}-*/;

	/**
	 * <b>DISCLOSURE</b> (int) static
	 * <p>
	 * disclosure style icon
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int DISCLOSURE() /*-{
		return Titanium.UI.iPhone.SystemButton.DISCLOSURE;
	}-*/;

	/**
	 * <b>DONE</b> (int) static
	 * <p>
	 * done icon. localized. Usable in nav bars and toolbars only.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int DONE() /*-{
		return Titanium.UI.iPhone.SystemButton.DONE;
	}-*/;

	/**
	 * <b>EDIT</b> (int) static
	 * <p>
	 * edit icon. localized. Usable in nav bars and toolbars only.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int EDIT() /*-{
		return Titanium.UI.iPhone.SystemButton.EDIT;
	}-*/;

	/**
	 * <b>FAST_FORWARD</b> (int) static
	 * <p>
	 * fast forward icon. Usable in nav bars and toolbars only.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int FAST_FORWARD() /*-{
		return Titanium.UI.iPhone.SystemButton.FAST_FORWARD;
	}-*/;

	/**
	 * <b>FIXED_SPACE</b> (int) static
	 * <p>
	 * Blank space to add between other items. Only the width property is used when this value is set.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int FIXED_SPACE() /*-{
		return Titanium.UI.iPhone.SystemButton.FIXED_SPACE;
	}-*/;

	/**
	 * <b>FLEXIBLE_SPACE</b> (int) static
	 * <p>
	 * Blank space to add between other items. The space is distributed equally between the other items. Other item properties are ignored when this value is set.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int FLEXIBLE_SPACE() /*-{
		return Titanium.UI.iPhone.SystemButton.FLEXIBLE_SPACE;
	}-*/;

	/**
	 * <b>INFO_DARK</b> (int) static
	 * <p>
	 * a dark style info circle icon
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int INFO_DARK() /*-{
		return Titanium.UI.iPhone.SystemButton.INFO_DARK;
	}-*/;

	/**
	 * <b>INFO_LIGHT</b> (int) static
	 * <p>
	 * a light style info circle icon
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int INFO_LIGHT() /*-{
		return Titanium.UI.iPhone.SystemButton.INFO_LIGHT;
	}-*/;

	/**
	 * <b>ORGANIZE</b> (int) static
	 * <p>
	 * organize icon. Usable in nav bars and toolbars only.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int ORGANIZE() /*-{
		return Titanium.UI.iPhone.SystemButton.ORGANIZE;
	}-*/;

	/**
	 * <b>PAUSE</b> (int) static
	 * <p>
	 * pause icon. Usable in nav bars and toolbars only.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int PAUSE() /*-{
		return Titanium.UI.iPhone.SystemButton.PAUSE;
	}-*/;

	/**
	 * <b>PLAY</b> (int) static
	 * <p>
	 * play icon. Usable in nav bars and toolbars only.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int PLAY() /*-{
		return Titanium.UI.iPhone.SystemButton.PLAY;
	}-*/;

	/**
	 * <b>REFRESH</b> (int) static
	 * <p>
	 * refresh icon. Usable in nav bars and toolbars only.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int REFRESH() /*-{
		return Titanium.UI.iPhone.SystemButton.REFRESH;
	}-*/;

	/**
	 * <b>REPLY</b> (int) static
	 * <p>
	 * reply icon. Usable in nav bars and toolbars only.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int REPLY() /*-{
		return Titanium.UI.iPhone.SystemButton.REPLY;
	}-*/;

	/**
	 * <b>REWIND</b> (int) static
	 * <p>
	 * rewind icon. Usable in nav bars and toolbars only.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int REWIND() /*-{
		return Titanium.UI.iPhone.SystemButton.REWIND;
	}-*/;

	/**
	 * <b>SAVE</b> (int) static
	 * <p>
	 * save icon. localized. Usable in nav bars and toolbars only.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int SAVE() /*-{
		return Titanium.UI.iPhone.SystemButton.SAVE;
	}-*/;

	/**
	 * <b>SPINNER</b> (int) static
	 * <p>
	 * same as ACTIVITY
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int SPINNER() /*-{
		return Titanium.UI.iPhone.SystemButton.SPINNER;
	}-*/;

	/**
	 * <b>STOP</b> (int) static
	 * <p>
	 * stop icon. Usable in nav bars and toolbars only.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int STOP() /*-{
		return Titanium.UI.iPhone.SystemButton.STOP;
	}-*/;

	/**
	 * <b>TRASH</b> (int) static
	 * <p>
	 * trash icon. Usable in nav bars and toolbars only.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int TRASH() /*-{
		return Titanium.UI.iPhone.SystemButton.TRASH;
	}-*/;
}
