package com.pmt.wrap.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI</b>
 * <p>
 * The main Titanium.UI module.  The UI module is responsible for native user-interface components and interaction inside Titanium.  The goal of the UI module is to provide a native experience along with native performance by compiling Javascript code into their native counterparts as part of the build process. 
 * <p>
 * <b>Platforms:</b> android iphone ipad 
 * <p>
 * <b>Since:</b> 0.4
 * <p>
 * <b>Type:</b> module
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class UI {

	private JavaScriptObject handler;

	public UI(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>ANIMATION_CURVE_EASE_IN</b> (int) static
	 * <p>
	 * animation curve constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int ANIMATION_CURVE_EASE_IN() /*-{
		return Titanium.UI.ANIMATION_CURVE_EASE_IN;
	}-*/;

	/**
	 * <b>ANIMATION_CURVE_EASE_IN_OUT</b> (int) static
	 * <p>
	 * animation curve constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int ANIMATION_CURVE_EASE_IN_OUT() /*-{
		return Titanium.UI.ANIMATION_CURVE_EASE_IN_OUT;
	}-*/;

	/**
	 * <b>ANIMATION_CURVE_EASE_OUT</b> (int) static
	 * <p>
	 * animation curve constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int ANIMATION_CURVE_EASE_OUT() /*-{
		return Titanium.UI.ANIMATION_CURVE_EASE_OUT;
	}-*/;

	/**
	 * <b>ANIMATION_CURVE_LINEAR</b> (int) static
	 * <p>
	 * animation curve constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int ANIMATION_CURVE_LINEAR() /*-{
		return Titanium.UI.ANIMATION_CURVE_LINEAR;
	}-*/;

	/**
	 * <b>AUTODETECT_ADDRESS</b> (int) static
	 * <p>
	 * text autodetection constant (iOS 4.0+)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int AUTODETECT_ADDRESS() /*-{
		return Titanium.UI.AUTODETECT_ADDRESS;
	}-*/;

	/**
	 * <b>AUTODETECT_ALL</b> (int) static
	 * <p>
	 * text autodetection constant (iOS)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int AUTODETECT_ALL() /*-{
		return Titanium.UI.AUTODETECT_ALL;
	}-*/;

	/**
	 * <b>AUTODETECT_CALENDAR</b> (int) static
	 * <p>
	 * text autodetection constant (iOS 4.0+)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int AUTODETECT_CALENDAR() /*-{
		return Titanium.UI.AUTODETECT_CALENDAR;
	}-*/;

	/**
	 * <b>AUTODETECT_LINK</b> (int) static
	 * <p>
	 * text autodetection constant (iOS)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int AUTODETECT_LINK() /*-{
		return Titanium.UI.AUTODETECT_LINK;
	}-*/;

	/**
	 * <b>AUTODETECT_NONE</b> (int) static
	 * <p>
	 * text autodetection constant (iOS)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int AUTODETECT_NONE() /*-{
		return Titanium.UI.AUTODETECT_NONE;
	}-*/;

	/**
	 * <b>AUTODETECT_PHONE</b> (int) static
	 * <p>
	 * text autodetection constant (iOS)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int AUTODETECT_PHONE() /*-{
		return Titanium.UI.AUTODETECT_PHONE;
	}-*/;

	/**
	 * <b>BLEND_MODE_CLEAR</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_CLEAR() /*-{
		return Titanium.UI.BLEND_MODE_CLEAR;
	}-*/;

	/**
	 * <b>BLEND_MODE_COLOR</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_COLOR() /*-{
		return Titanium.UI.BLEND_MODE_COLOR;
	}-*/;

	/**
	 * <b>BLEND_MODE_COLOR_BURN</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_COLOR_BURN() /*-{
		return Titanium.UI.BLEND_MODE_COLOR_BURN;
	}-*/;

	/**
	 * <b>BLEND_MODE_COLOR_DODGE</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_COLOR_DODGE() /*-{
		return Titanium.UI.BLEND_MODE_COLOR_DODGE;
	}-*/;

	/**
	 * <b>BLEND_MODE_COPY</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_COPY() /*-{
		return Titanium.UI.BLEND_MODE_COPY;
	}-*/;

	/**
	 * <b>BLEND_MODE_DARKEN</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_DARKEN() /*-{
		return Titanium.UI.BLEND_MODE_DARKEN;
	}-*/;

	/**
	 * <b>BLEND_MODE_DESTINATION_ATOP</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_DESTINATION_ATOP() /*-{
		return Titanium.UI.BLEND_MODE_DESTINATION_ATOP;
	}-*/;

	/**
	 * <b>BLEND_MODE_DESTINATION_IN</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_DESTINATION_IN() /*-{
		return Titanium.UI.BLEND_MODE_DESTINATION_IN;
	}-*/;

	/**
	 * <b>BLEND_MODE_DESTINATION_OUT</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_DESTINATION_OUT() /*-{
		return Titanium.UI.BLEND_MODE_DESTINATION_OUT;
	}-*/;

	/**
	 * <b>BLEND_MODE_DESTINATION_OVER</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_DESTINATION_OVER() /*-{
		return Titanium.UI.BLEND_MODE_DESTINATION_OVER;
	}-*/;

	/**
	 * <b>BLEND_MODE_DIFFERENCE</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_DIFFERENCE() /*-{
		return Titanium.UI.BLEND_MODE_DIFFERENCE;
	}-*/;

	/**
	 * <b>BLEND_MODE_EXCLUSION</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_EXCLUSION() /*-{
		return Titanium.UI.BLEND_MODE_EXCLUSION;
	}-*/;

	/**
	 * <b>BLEND_MODE_HARD_LIGHT</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_HARD_LIGHT() /*-{
		return Titanium.UI.BLEND_MODE_HARD_LIGHT;
	}-*/;

	/**
	 * <b>BLEND_MODE_HUE</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_HUE() /*-{
		return Titanium.UI.BLEND_MODE_HUE;
	}-*/;

	/**
	 * <b>BLEND_MODE_LIGHTEN</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_LIGHTEN() /*-{
		return Titanium.UI.BLEND_MODE_LIGHTEN;
	}-*/;

	/**
	 * <b>BLEND_MODE_LUMINOSITY</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_LUMINOSITY() /*-{
		return Titanium.UI.BLEND_MODE_LUMINOSITY;
	}-*/;

	/**
	 * <b>BLEND_MODE_MULTIPLY</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_MULTIPLY() /*-{
		return Titanium.UI.BLEND_MODE_MULTIPLY;
	}-*/;

	/**
	 * <b>BLEND_MODE_NORMAL</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_NORMAL() /*-{
		return Titanium.UI.BLEND_MODE_NORMAL;
	}-*/;

	/**
	 * <b>BLEND_MODE_OVERLAY</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_OVERLAY() /*-{
		return Titanium.UI.BLEND_MODE_OVERLAY;
	}-*/;

	/**
	 * <b>BLEND_MODE_PLUS_DARKER</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_PLUS_DARKER() /*-{
		return Titanium.UI.BLEND_MODE_PLUS_DARKER;
	}-*/;

	/**
	 * <b>BLEND_MODE_PLUS_LIGHTER</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_PLUS_LIGHTER() /*-{
		return Titanium.UI.BLEND_MODE_PLUS_LIGHTER;
	}-*/;

	/**
	 * <b>BLEND_MODE_SATURATION</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_SATURATION() /*-{
		return Titanium.UI.BLEND_MODE_SATURATION;
	}-*/;

	/**
	 * <b>BLEND_MODE_SCREEN</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_SCREEN() /*-{
		return Titanium.UI.BLEND_MODE_SCREEN;
	}-*/;

	/**
	 * <b>BLEND_MODE_SOFT_LIGHT</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_SOFT_LIGHT() /*-{
		return Titanium.UI.BLEND_MODE_SOFT_LIGHT;
	}-*/;

	/**
	 * <b>BLEND_MODE_SOURCE_ATOP</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_SOURCE_ATOP() /*-{
		return Titanium.UI.BLEND_MODE_SOURCE_ATOP;
	}-*/;

	/**
	 * <b>BLEND_MODE_SOURCE_IN</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_SOURCE_IN() /*-{
		return Titanium.UI.BLEND_MODE_SOURCE_IN;
	}-*/;

	/**
	 * <b>BLEND_MODE_SOURCE_OUT</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_SOURCE_OUT() /*-{
		return Titanium.UI.BLEND_MODE_SOURCE_OUT;
	}-*/;

	/**
	 * <b>BLEND_MODE_XOR</b> (int) static
	 * <p>
	 * image mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int BLEND_MODE_XOR() /*-{
		return Titanium.UI.BLEND_MODE_XOR;
	}-*/;

	/**
	 * <b>FACE_DOWN</b> (int) static
	 * <p>
	 * orientation constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int FACE_DOWN() /*-{
		return Titanium.UI.FACE_DOWN;
	}-*/;

	/**
	 * <b>FACE_UP</b> (int) static
	 * <p>
	 * orientation constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int FACE_UP() /*-{
		return Titanium.UI.FACE_UP;
	}-*/;

	/**
	 * <b>INPUT_BORDERSTYLE_BEZEL</b> (int) static
	 * <p>
	 * input border style constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int INPUT_BORDERSTYLE_BEZEL() /*-{
		return Titanium.UI.INPUT_BORDERSTYLE_BEZEL;
	}-*/;

	/**
	 * <b>INPUT_BORDERSTYLE_LINE</b> (int) static
	 * <p>
	 * input border style constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int INPUT_BORDERSTYLE_LINE() /*-{
		return Titanium.UI.INPUT_BORDERSTYLE_LINE;
	}-*/;

	/**
	 * <b>INPUT_BORDERSTYLE_NONE</b> (int) static
	 * <p>
	 * input border style constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int INPUT_BORDERSTYLE_NONE() /*-{
		return Titanium.UI.INPUT_BORDERSTYLE_NONE;
	}-*/;

	/**
	 * <b>INPUT_BORDERSTYLE_ROUNDED</b> (int) static
	 * <p>
	 * input border style constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int INPUT_BORDERSTYLE_ROUNDED() /*-{
		return Titanium.UI.INPUT_BORDERSTYLE_ROUNDED;
	}-*/;

	/**
	 * <b>INPUT_BUTTONMODE_ALWAYS</b> (int) static
	 * <p>
	 * input button mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int INPUT_BUTTONMODE_ALWAYS() /*-{
		return Titanium.UI.INPUT_BUTTONMODE_ALWAYS;
	}-*/;

	/**
	 * <b>INPUT_BUTTONMODE_NEVER</b> (int) static
	 * <p>
	 * input button mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int INPUT_BUTTONMODE_NEVER() /*-{
		return Titanium.UI.INPUT_BUTTONMODE_NEVER;
	}-*/;

	/**
	 * <b>INPUT_BUTTONMODE_ONBLUR</b> (int) static
	 * <p>
	 * input button mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int INPUT_BUTTONMODE_ONBLUR() /*-{
		return Titanium.UI.INPUT_BUTTONMODE_ONBLUR;
	}-*/;

	/**
	 * <b>INPUT_BUTTONMODE_ONFOCUS</b> (int) static
	 * <p>
	 * input button mode constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int INPUT_BUTTONMODE_ONFOCUS() /*-{
		return Titanium.UI.INPUT_BUTTONMODE_ONFOCUS;
	}-*/;

	/**
	 * <b>KEYBOARD_APPEARANCE_ALERT</b> (int) static
	 * <p>
	 * textfield keyboard appearance constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int KEYBOARD_APPEARANCE_ALERT() /*-{
		return Titanium.UI.KEYBOARD_APPEARANCE_ALERT;
	}-*/;

	/**
	 * <b>KEYBOARD_APPEARANCE_DEFAULT</b> (int) static
	 * <p>
	 * textfield keyboard appearance constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int KEYBOARD_APPEARANCE_DEFAULT() /*-{
		return Titanium.UI.KEYBOARD_APPEARANCE_DEFAULT;
	}-*/;

	/**
	 * <b>KEYBOARD_ASCII</b> (int) static
	 * <p>
	 * textfield keyboard constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int KEYBOARD_ASCII() /*-{
		return Titanium.UI.KEYBOARD_ASCII;
	}-*/;

	/**
	 * <b>KEYBOARD_DEFAULT</b> (int) static
	 * <p>
	 * textfield keyboard constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int KEYBOARD_DEFAULT() /*-{
		return Titanium.UI.KEYBOARD_DEFAULT;
	}-*/;

	/**
	 * <b>KEYBOARD_EMAIL</b> (int) static
	 * <p>
	 * textfield keyboard constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int KEYBOARD_EMAIL() /*-{
		return Titanium.UI.KEYBOARD_EMAIL;
	}-*/;

	/**
	 * <b>KEYBOARD_NAMEPHONE_PAD</b> (int) static
	 * <p>
	 * textfield keyboard constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int KEYBOARD_NAMEPHONE_PAD() /*-{
		return Titanium.UI.KEYBOARD_NAMEPHONE_PAD;
	}-*/;

	/**
	 * <b>KEYBOARD_NUMBERS_PUNCTUATION</b> (int) static
	 * <p>
	 * textfield keyboard constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int KEYBOARD_NUMBERS_PUNCTUATION() /*-{
		return Titanium.UI.KEYBOARD_NUMBERS_PUNCTUATION;
	}-*/;

	/**
	 * <b>KEYBOARD_NUMBER_PAD</b> (int) static
	 * <p>
	 * textfield keyboard constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int KEYBOARD_NUMBER_PAD() /*-{
		return Titanium.UI.KEYBOARD_NUMBER_PAD;
	}-*/;

	/**
	 * <b>KEYBOARD_PHONE_PAD</b> (int) static
	 * <p>
	 * textfield keyboard constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int KEYBOARD_PHONE_PAD() /*-{
		return Titanium.UI.KEYBOARD_PHONE_PAD;
	}-*/;

	/**
	 * <b>KEYBOARD_URL</b> (int) static
	 * <p>
	 * textfield keyboard constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int KEYBOARD_URL() /*-{
		return Titanium.UI.KEYBOARD_URL;
	}-*/;

	/**
	 * <b>LANDSCAPE_LEFT</b> (int) static
	 * <p>
	 * orientation (home button on left) constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int LANDSCAPE_LEFT() /*-{
		return Titanium.UI.LANDSCAPE_LEFT;
	}-*/;

	/**
	 * <b>LANDSCAPE_RIGHT</b> (int) static
	 * <p>
	 * orientation (home button on right) constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int LANDSCAPE_RIGHT() /*-{
		return Titanium.UI.LANDSCAPE_RIGHT;
	}-*/;

	/**
	 * <b>NOTIFICATION_DURATION_LONG</b> (int) static
	 * <p>
	 * Duration of the notification
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int NOTIFICATION_DURATION_LONG() /*-{
		return Titanium.UI.NOTIFICATION_DURATION_LONG;
	}-*/;

	/**
	 * <b>NOTIFICATION_DURATION_SHORT</b> (int) static
	 * <p>
	 * Duration of the notification
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int NOTIFICATION_DURATION_SHORT() /*-{
		return Titanium.UI.NOTIFICATION_DURATION_SHORT;
	}-*/;

	/**
	 * <b>PICKER_TYPE_COUNT_DOWN_TIMER</b> (int) static
	 * <p>
	 * picker type constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int PICKER_TYPE_COUNT_DOWN_TIMER() /*-{
		return Titanium.UI.PICKER_TYPE_COUNT_DOWN_TIMER;
	}-*/;

	/**
	 * <b>PICKER_TYPE_DATE</b> (int) static
	 * <p>
	 * picker type constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int PICKER_TYPE_DATE() /*-{
		return Titanium.UI.PICKER_TYPE_DATE;
	}-*/;

	/**
	 * <b>PICKER_TYPE_DATE_AND_TIME</b> (int) static
	 * <p>
	 * picker type constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int PICKER_TYPE_DATE_AND_TIME() /*-{
		return Titanium.UI.PICKER_TYPE_DATE_AND_TIME;
	}-*/;

	/**
	 * <b>PICKER_TYPE_PLAIN</b> (int) static
	 * <p>
	 * picker type constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int PICKER_TYPE_PLAIN() /*-{
		return Titanium.UI.PICKER_TYPE_PLAIN;
	}-*/;

	/**
	 * <b>PICKER_TYPE_TIME</b> (int) static
	 * <p>
	 * picker type constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int PICKER_TYPE_TIME() /*-{
		return Titanium.UI.PICKER_TYPE_TIME;
	}-*/;

	/**
	 * <b>PORTRAIT</b> (int) static
	 * <p>
	 * orientation (home button on bottom) constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int PORTRAIT() /*-{
		return Titanium.UI.PORTRAIT;
	}-*/;

	/**
	 * <b>RETURNKEY_DEFAULT</b> (int) static
	 * <p>
	 * textfield return key constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int RETURNKEY_DEFAULT() /*-{
		return Titanium.UI.RETURNKEY_DEFAULT;
	}-*/;

	/**
	 * <b>RETURNKEY_DONE</b> (int) static
	 * <p>
	 * textfield return key constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int RETURNKEY_DONE() /*-{
		return Titanium.UI.RETURNKEY_DONE;
	}-*/;

	/**
	 * <b>RETURNKEY_EMERGENCY_CALL</b> (int) static
	 * <p>
	 * textfield return key constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int RETURNKEY_EMERGENCY_CALL() /*-{
		return Titanium.UI.RETURNKEY_EMERGENCY_CALL;
	}-*/;

	/**
	 * <b>RETURNKEY_GO</b> (int) static
	 * <p>
	 * textfield return key constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int RETURNKEY_GO() /*-{
		return Titanium.UI.RETURNKEY_GO;
	}-*/;

	/**
	 * <b>RETURNKEY_GOOGLE</b> (int) static
	 * <p>
	 * textfield return key constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int RETURNKEY_GOOGLE() /*-{
		return Titanium.UI.RETURNKEY_GOOGLE;
	}-*/;

	/**
	 * <b>RETURNKEY_JOIN</b> (int) static
	 * <p>
	 * textfield return key constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int RETURNKEY_JOIN() /*-{
		return Titanium.UI.RETURNKEY_JOIN;
	}-*/;

	/**
	 * <b>RETURNKEY_NEXT</b> (int) static
	 * <p>
	 * textfield return key constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int RETURNKEY_NEXT() /*-{
		return Titanium.UI.RETURNKEY_NEXT;
	}-*/;

	/**
	 * <b>RETURNKEY_ROUTE</b> (int) static
	 * <p>
	 * textfield return key constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int RETURNKEY_ROUTE() /*-{
		return Titanium.UI.RETURNKEY_ROUTE;
	}-*/;

	/**
	 * <b>RETURNKEY_SEARCH</b> (int) static
	 * <p>
	 * textfield return key constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int RETURNKEY_SEARCH() /*-{
		return Titanium.UI.RETURNKEY_SEARCH;
	}-*/;

	/**
	 * <b>RETURNKEY_SEND</b> (int) static
	 * <p>
	 * textfield return key constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int RETURNKEY_SEND() /*-{
		return Titanium.UI.RETURNKEY_SEND;
	}-*/;

	/**
	 * <b>RETURNKEY_YAHOO</b> (int) static
	 * <p>
	 * textfield return key constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int RETURNKEY_YAHOO() /*-{
		return Titanium.UI.RETURNKEY_YAHOO;
	}-*/;

	/**
	 * <b>TEXT_ALIGNMENT_CENTER</b> (int) static
	 * <p>
	 * text align constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int TEXT_ALIGNMENT_CENTER() /*-{
		return Titanium.UI.TEXT_ALIGNMENT_CENTER;
	}-*/;

	/**
	 * <b>TEXT_ALIGNMENT_LEFT</b> (int) static
	 * <p>
	 * text align constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int TEXT_ALIGNMENT_LEFT() /*-{
		return Titanium.UI.TEXT_ALIGNMENT_LEFT;
	}-*/;

	/**
	 * <b>TEXT_ALIGNMENT_RIGHT</b> (int) static
	 * <p>
	 * text align constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int TEXT_ALIGNMENT_RIGHT() /*-{
		return Titanium.UI.TEXT_ALIGNMENT_RIGHT;
	}-*/;

	/**
	 * <b>TEXT_AUTOCAPITALIZATION_ALL</b> (int) static
	 * <p>
	 * text capitalization constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int TEXT_AUTOCAPITALIZATION_ALL() /*-{
		return Titanium.UI.TEXT_AUTOCAPITALIZATION_ALL;
	}-*/;

	/**
	 * <b>TEXT_AUTOCAPITALIZATION_NONE</b> (int) static
	 * <p>
	 * text capitalization constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int TEXT_AUTOCAPITALIZATION_NONE() /*-{
		return Titanium.UI.TEXT_AUTOCAPITALIZATION_NONE;
	}-*/;

	/**
	 * <b>TEXT_AUTOCAPITALIZATION_SENTENCES</b> (int) static
	 * <p>
	 * text capitalization constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int TEXT_AUTOCAPITALIZATION_SENTENCES() /*-{
		return Titanium.UI.TEXT_AUTOCAPITALIZATION_SENTENCES;
	}-*/;

	/**
	 * <b>TEXT_AUTOCAPITALIZATION_WORDS</b> (int) static
	 * <p>
	 * text capitalization constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int TEXT_AUTOCAPITALIZATION_WORDS() /*-{
		return Titanium.UI.TEXT_AUTOCAPITALIZATION_WORDS;
	}-*/;

	/**
	 * <b>TEXT_VERTICAL_ALIGNMENT_BOTTOM</b> (int) static
	 * <p>
	 * text vertical align constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int TEXT_VERTICAL_ALIGNMENT_BOTTOM() /*-{
		return Titanium.UI.TEXT_VERTICAL_ALIGNMENT_BOTTOM;
	}-*/;

	/**
	 * <b>TEXT_VERTICAL_ALIGNMENT_CENTER</b> (int) static
	 * <p>
	 * text vertical align constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int TEXT_VERTICAL_ALIGNMENT_CENTER() /*-{
		return Titanium.UI.TEXT_VERTICAL_ALIGNMENT_CENTER;
	}-*/;

	/**
	 * <b>TEXT_VERTICAL_ALIGNMENT_TOP</b> (int) static
	 * <p>
	 * text vertical align constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int TEXT_VERTICAL_ALIGNMENT_TOP() /*-{
		return Titanium.UI.TEXT_VERTICAL_ALIGNMENT_TOP;
	}-*/;

	/**
	 * <b>UNKNOWN</b> (int) static
	 * <p>
	 * orientation constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int UNKNOWN() /*-{
		return Titanium.UI.UNKNOWN;
	}-*/;

	/**
	 * <b>UPSIDE_PORTRAIT</b> (int) static
	 * <p>
	 * orientation (home button on top) constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int UPSIDE_PORTRAIT() /*-{
		return Titanium.UI.UPSIDE_PORTRAIT;
	}-*/;

	/**
	 * <b>backgroundColor</b> (string) static
	 * <p>
	 * this sets the background color of the master UIView (when there are no windows/tab groups on it)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native String getBackgroundColor() /*-{
		return Titanium.UI.backgroundColor;
	}-*/;

	/**
	 * <b>backgroundColor</b> (string) static
	 * <p>
	 * this sets the background color of the master UIView (when there are no windows/tab groups on it)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native void setBackgroundColor(String backgroundColor) /*-{
		Titanium.UI.backgroundColor = backgroundColor;
	}-*/;

	/**
	 * <b>backgroundImage</b> (string) static
	 * <p>
	 * path/url to an image file for setting a background for the master UIView (when there are no windows/tab groups on it).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native String getBackgroundImage() /*-{
		return Titanium.UI.backgroundImage;
	}-*/;

	/**
	 * <b>backgroundImage</b> (string) static
	 * <p>
	 * path/url to an image file for setting a background for the master UIView (when there are no windows/tab groups on it).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native void setBackgroundImage(String backgroundImage) /*-{
		Titanium.UI.backgroundImage = backgroundImage;
	}-*/;

	/**
	 * <b>currentWindow</b> (Titanium.UI.Window) static
	 * <p>
	 * The active window associated with the executing Javascript context.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native JavaScriptObject getCurrentWindow() /*-{
		return Titanium.UI.currentWindow;
	}-*/;

	/**
	 * <b>currentWindow</b> (Titanium.UI.Window) static
	 * <p>
	 * The active window associated with the executing Javascript context.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native void setCurrentWindow(JavaScriptObject currentWindow) /*-{
		Titanium.UI.currentWindow = currentWindow;
	}-*/;

	/**
	 * <b>orientation</b> (int) static
	 * <p>
	 * DEPRECATED.  To set an orientation, it is suggested to instead set Titanium.Window.orientationModes to the specific orientation desired.  When set, this will update the orientation of the current window to the specified orientation value
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native int getOrientation() /*-{
		return Titanium.UI.orientation;
	}-*/;

	/**
	 * <b>orientation</b> (int) static
	 * <p>
	 * DEPRECATED.  To set an orientation, it is suggested to instead set Titanium.Window.orientationModes to the specific orientation desired.  When set, this will update the orientation of the current window to the specified orientation value
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 */
	public static native void setOrientation(int orientation) /*-{
		Titanium.UI.orientation = orientation;
	}-*/;

	/**
	 * <b>addEventListener</b>
	 * <p>
	 * add an event listener for the instance to receive view triggered events
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public static native void addEventListener(String name, JavaScriptObject callback) /*-{
		return Titanium.UI.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>create2DMatrix</b>
	 * <p>
	 * create and return an instance of Titanium.UI.2DMatrix
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.2DMatrix
	 * @return object
	 */
	 public static native JavaScriptObject create2DMatrix(JavaScriptObject parameters) /*-{
		return Titanium.UI.create2DMatrix(parameters);
	}-*/;

	/**
	 * <b>create3DMatrix</b>
	 * <p>
	 * create and return an instance of Titanium.UI.3DMatrix
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.3DMatrix
	 * @return object
	 */
	 public static native JavaScriptObject create3DMatrix(JavaScriptObject parameters) /*-{
		return Titanium.UI.create3DMatrix(parameters);
	}-*/;

	/**
	 * <b>createActivityIndicator</b>
	 * <p>
	 * create and return an instance of Titanium.UI.ActivityIndicator
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.ActivityIndicator
	 * @return object
	 */
	 public static native JavaScriptObject createActivityIndicator(JavaScriptObject parameters) /*-{
		return Titanium.UI.createActivityIndicator(parameters);
	}-*/;

	/**
	 * <b>createAlertDialog</b>
	 * <p>
	 * create and return an instance of Titanium.UI.AlertDialog
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.AlertDialog
	 * @return object
	 */
	 public static native JavaScriptObject createAlertDialog(JavaScriptObject parameters) /*-{
		return Titanium.UI.createAlertDialog(parameters);
	}-*/;

	/**
	 * <b>createAnimation</b>
	 * <p>
	 * create and return an instance of Titanium.UI.Animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.Animation
	 * @return object
	 */
	 public static native JavaScriptObject createAnimation(JavaScriptObject parameters) /*-{
		return Titanium.UI.createAnimation(parameters);
	}-*/;

	/**
	 * <b>createButton</b>
	 * <p>
	 * create and return an instance of Titanium.UI.Button
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.Button
	 * @return object
	 */
	 public static native JavaScriptObject createButton(JavaScriptObject parameters) /*-{
		return Titanium.UI.createButton(parameters);
	}-*/;

	/**
	 * <b>createButtonBar</b>
	 * <p>
	 * create and return an instance of Titanium.UI.ButtonBar
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.ButtonBar
	 * @return object
	 */
	 public static native JavaScriptObject createButtonBar(JavaScriptObject parameters) /*-{
		return Titanium.UI.createButtonBar(parameters);
	}-*/;

	/**
	 * <b>createCoverFlowView</b>
	 * <p>
	 * create and return an instance of Titanium.UI.CoverFlowView
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.CoverFlowView
	 * @return object
	 */
	 public static native JavaScriptObject createCoverFlowView(JavaScriptObject parameters) /*-{
		return Titanium.UI.createCoverFlowView(parameters);
	}-*/;

	/**
	 * <b>createDashboardItem</b>
	 * <p>
	 * create and return an instance of Titanium.UI.DashboardItem
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.DashboardItem
	 * @return object
	 */
	 public static native JavaScriptObject createDashboardItem(JavaScriptObject parameters) /*-{
		return Titanium.UI.createDashboardItem(parameters);
	}-*/;

	/**
	 * <b>createDashboardView</b>
	 * <p>
	 * create and return an instance of Titanium.UI.DashboardView
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.DashboardView
	 * @return object
	 */
	 public static native JavaScriptObject createDashboardView(JavaScriptObject parameters) /*-{
		return Titanium.UI.createDashboardView(parameters);
	}-*/;

	/**
	 * <b>createEmailDialog</b>
	 * <p>
	 * create and return an instance of Titanium.UI.EmailDialog
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.EmailDialog
	 * @return object
	 */
	 public static native JavaScriptObject createEmailDialog(JavaScriptObject parameters) /*-{
		return Titanium.UI.createEmailDialog(parameters);
	}-*/;

	/**
	 * <b>createImageView</b>
	 * <p>
	 * create and return an instance of Titanium.UI.ImageView
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.ImageView
	 * @return object
	 */
	 public static native JavaScriptObject createImageView(JavaScriptObject parameters) /*-{
		return Titanium.UI.createImageView(parameters);
	}-*/;

	/**
	 * <b>createLabel</b>
	 * <p>
	 * create and return an instance of Titanium.UI.Label
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.Label
	 * @return object
	 */
	 public static native JavaScriptObject createLabel(JavaScriptObject parameters) /*-{
		return Titanium.UI.createLabel(parameters);
	}-*/;

	/**
	 * <b>createOptionDialog</b>
	 * <p>
	 * create and return an instance of Titanium.UI.OptionDialog
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.OptionDialog
	 * @return object
	 */
	 public static native JavaScriptObject createOptionDialog(JavaScriptObject parameters) /*-{
		return Titanium.UI.createOptionDialog(parameters);
	}-*/;

	/**
	 * <b>createPicker</b>
	 * <p>
	 * create and return an instance of Titanium.UI.Picker
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.Picker
	 * @return object
	 */
	 public static native JavaScriptObject createPicker(JavaScriptObject parameters) /*-{
		return Titanium.UI.createPicker(parameters);
	}-*/;

	/**
	 * <b>createPickerColumn</b>
	 * <p>
	 * create and return an instance of Titanium.UI.PickerColumn
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.PickerColumn
	 * @return object
	 */
	 public static native JavaScriptObject createPickerColumn(JavaScriptObject parameters) /*-{
		return Titanium.UI.createPickerColumn(parameters);
	}-*/;

	/**
	 * <b>createPickerRow</b>
	 * <p>
	 * create and return an instance of Titanium.UI.PickerRow
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.PickerRow
	 * @return object
	 */
	 public static native JavaScriptObject createPickerRow(JavaScriptObject parameters) /*-{
		return Titanium.UI.createPickerRow(parameters);
	}-*/;

	/**
	 * <b>createProgressBar</b>
	 * <p>
	 * create and return an instance of Titanium.UI.ProgressBar
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.ProgressBar
	 * @return object
	 */
	 public static native JavaScriptObject createProgressBar(JavaScriptObject parameters) /*-{
		return Titanium.UI.createProgressBar(parameters);
	}-*/;

	/**
	 * <b>createScrollView</b>
	 * <p>
	 * create and return an instance of Titanium.UI.ScrollView
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.ScrollView
	 * @return object
	 */
	 public static native JavaScriptObject createScrollView(JavaScriptObject parameters) /*-{
		return Titanium.UI.createScrollView(parameters);
	}-*/;

	/**
	 * <b>createScrollableView</b>
	 * <p>
	 * create and return an instance of Titanium.UI.ScrollableView
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.ScrollableView
	 * @return object
	 */
	 public static native JavaScriptObject createScrollableView(JavaScriptObject parameters) /*-{
		return Titanium.UI.createScrollableView(parameters);
	}-*/;

	/**
	 * <b>createSearchBar</b>
	 * <p>
	 * create and return an instance of Titanium.UI.SearchBar
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.SearchBar
	 * @return object
	 */
	 public static native JavaScriptObject createSearchBar(JavaScriptObject parameters) /*-{
		return Titanium.UI.createSearchBar(parameters);
	}-*/;

	/**
	 * <b>createSlider</b>
	 * <p>
	 * create and return an instance of Titanium.UI.Slider
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.Slider
	 * @return object
	 */
	 public static native JavaScriptObject createSlider(JavaScriptObject parameters) /*-{
		return Titanium.UI.createSlider(parameters);
	}-*/;

	/**
	 * <b>createSwitch</b>
	 * <p>
	 * create and return an instance of Titanium.UI.Switch
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.Switch
	 * @return object
	 */
	 public static native JavaScriptObject createSwitch(JavaScriptObject parameters) /*-{
		return Titanium.UI.createSwitch(parameters);
	}-*/;

	/**
	 * <b>createTab</b>
	 * <p>
	 * create and return an instance of Titanium.UI.Tab
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.Tab
	 * @return object
	 */
	 public static native JavaScriptObject createTab(JavaScriptObject parameters) /*-{
		return Titanium.UI.createTab(parameters);
	}-*/;

	/**
	 * <b>createTabGroup</b>
	 * <p>
	 * create and return an instance of Titanium.UI.TabGroup
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.TabGroup
	 * @return object
	 */
	 public static native JavaScriptObject createTabGroup(JavaScriptObject parameters) /*-{
		return Titanium.UI.createTabGroup(parameters);
	}-*/;

	/**
	 * <b>createTabbedBar</b>
	 * <p>
	 * create and return an instance of Titanium.UI.TabbedBar
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.TabbedBar
	 * @return object
	 */
	 public static native JavaScriptObject createTabbedBar(JavaScriptObject parameters) /*-{
		return Titanium.UI.createTabbedBar(parameters);
	}-*/;

	/**
	 * <b>createTableView</b>
	 * <p>
	 * create and return an instance of Titanium.UI.TableView
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.TableView
	 * @return object
	 */
	 public static native JavaScriptObject createTableView(JavaScriptObject parameters) /*-{
		return Titanium.UI.createTableView(parameters);
	}-*/;

	/**
	 * <b>createTableViewRow</b>
	 * <p>
	 * create and return an instance of Titanium.UI.TableViewRow
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.TableViewRow
	 * @return object
	 */
	 public static native JavaScriptObject createTableViewRow(JavaScriptObject parameters) /*-{
		return Titanium.UI.createTableViewRow(parameters);
	}-*/;

	/**
	 * <b>createTableViewSection</b>
	 * <p>
	 * create and return an instance of Titanium.UI.TableViewSection
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.TableViewSection
	 * @return object
	 */
	 public static native JavaScriptObject createTableViewSection(JavaScriptObject parameters) /*-{
		return Titanium.UI.createTableViewSection(parameters);
	}-*/;

	/**
	 * <b>createTextArea</b>
	 * <p>
	 * create and return an instance of Titanium.UI.TextArea
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.TextArea
	 * @return object
	 */
	 public static native JavaScriptObject createTextArea(JavaScriptObject parameters) /*-{
		return Titanium.UI.createTextArea(parameters);
	}-*/;

	/**
	 * <b>createTextField</b>
	 * <p>
	 * create and return an instance of Titanium.UI.TextField
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.TextField
	 * @return object
	 */
	 public static native JavaScriptObject createTextField(JavaScriptObject parameters) /*-{
		return Titanium.UI.createTextField(parameters);
	}-*/;

	/**
	 * <b>createToolbar</b>
	 * <p>
	 * create and return an instance of Titanium.UI.Toolbar
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.Toolbar
	 * @return object
	 */
	 public static native JavaScriptObject createToolbar(JavaScriptObject parameters) /*-{
		return Titanium.UI.createToolbar(parameters);
	}-*/;

	/**
	 * <b>createView</b>
	 * <p>
	 * create and return an instance of Titanium.UI.View
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.View
	 * @return object
	 */
	 public static native JavaScriptObject createView(JavaScriptObject parameters) /*-{
		return Titanium.UI.createView(parameters);
	}-*/;

	/**
	 * <b>createWebView</b>
	 * <p>
	 * create and return an instance of Titanium.UI.WebView
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.WebView
	 * @return object
	 */
	 public static native JavaScriptObject createWebView(JavaScriptObject parameters) /*-{
		return Titanium.UI.createWebView(parameters);
	}-*/;

	/**
	 * <b>createWindow</b>
	 * <p>
	 * create and return an instance of Titanium.UI.Window
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.UI.Window
	 * @return object
	 */
	 public static native JavaScriptObject createWindow(JavaScriptObject parameters) /*-{
		return Titanium.UI.createWindow(parameters);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public static native void fireEvent(String name, JavaScriptObject event) /*-{
		return Titanium.UI.fireEvent(name, event);
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.4
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public static native void removeEventListener(String name, JavaScriptObject callback) /*-{
		return Titanium.UI.removeEventListener(name, callback);
	}-*/;
}
