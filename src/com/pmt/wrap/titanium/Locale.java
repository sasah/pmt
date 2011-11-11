package com.pmt.wrap.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Locale</b>
 * <p>
 * The top level Locale module.  The Locale module works with localization files to which are generated during compilation into the operating system specific localization formats. The Locale module provides locale-specific strings which can be referenced at runtime.  Additionally, the module contains a few methods and properties for querying device locale information.
 * <p>
 * <b>Platforms:</b> android iphone ipad 
 * <p>
 * <b>Since:</b> 1.5
 * <p>
 * <b>Type:</b> module
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class Locale {

	private JavaScriptObject handler;

	public Locale(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>currentCountry</b> (string) static
	 * <p>
	 * return the current (default) ISO 2-letter country code for the device.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 1.5
	 */
	public static native String getCurrentCountry() /*-{
		return Titanium.Locale.currentCountry;
	}-*/;

	/**
	 * <b>currentCountry</b> (string) static
	 * <p>
	 * return the current (default) ISO 2-letter country code for the device.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 1.5
	 */
	public static native void setCurrentCountry(String currentCountry) /*-{
		Titanium.Locale.currentCountry = currentCountry;
	}-*/;

	/**
	 * <b>currentLanguage</b> (string) static
	 * <p>
	 * return the current language for the device based on the user's settings (readonly)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 1.5
	 */
	public static native String getCurrentLanguage() /*-{
		return Titanium.Locale.currentLanguage;
	}-*/;

	/**
	 * <b>currentLanguage</b> (string) static
	 * <p>
	 * return the current language for the device based on the user's settings (readonly)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 1.5
	 */
	public static native void setCurrentLanguage(String currentLanguage) /*-{
		Titanium.Locale.currentLanguage = currentLanguage;
	}-*/;

	/**
	 * <b>currentLocale</b> (string) static
	 * <p>
	 * return the current locale string for the device based on the user's settings (e.g., en-US).  (readonly) (Android only)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 1.5
	 */
	public static native String getCurrentLocale() /*-{
		return Titanium.Locale.currentLocale;
	}-*/;

	/**
	 * <b>currentLocale</b> (string) static
	 * <p>
	 * return the current locale string for the device based on the user's settings (e.g., en-US).  (readonly) (Android only)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 1.5
	 */
	public static native void setCurrentLocale(String currentLocale) /*-{
		Titanium.Locale.currentLocale = currentLocale;
	}-*/;

	/**
	 * <b>addEventListener</b>
	 * <p>
	 * add an event listener for the instance to receive view triggered events
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 1.5
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public static native void addEventListener(String name, JavaScriptObject callback) /*-{
		return Titanium.Locale.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 1.5
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public static native void fireEvent(String name, JavaScriptObject event) /*-{
		return Titanium.Locale.fireEvent(name, event);
	}-*/;

	/**
	 * <b>formatTelephoneNumber</b>
	 * <p>
	 * format a telephone number according to the current locale.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 1.5
	 * @param number (string) the phone number to format
	 * @return string
	 */
	 public static native String formatTelephoneNumber(String number) /*-{
		return Titanium.Locale.formatTelephoneNumber(number);
	}-*/;

	/**
	 * <b>getCurrencyCode</b>
	 * <p>
	 * return a currency code for a given locale. (Android only)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 1.5
	 * @param locale (string) the locale for which you want to the currency code, e.g. getCurrencyCode('en-US') -> 'USD'
	 * @return string
	 */
	 public static native String getCurrencyCode(String locale) /*-{
		return Titanium.Locale.getCurrencyCode(locale);
	}-*/;

	/**
	 * <b>getCurrencySymbol</b>
	 * <p>
	 * return a currency symbol for the given currency code. (Android only)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 1.5
	 * @param currencyCode (string) the currency for which you want the symbol, e.g. getCurrencySymbol('USD') -> '$'
	 * @return string
	 */
	 public static native String getCurrencySymbol(String currencyCode) /*-{
		return Titanium.Locale.getCurrencySymbol(currencyCode);
	}-*/;

	/**
	 * <b>getLocaleCurrencySymbol</b>
	 * <p>
	 * return a currency symbol for the given locale. (Android only)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 1.5
	 * @param locale (string) the locale whose currency symbol you want, e.g. getLocaleCurrencySymbol('en-US') -> '$'
	 * @return string
	 */
	 public static native String getLocaleCurrencySymbol(String locale) /*-{
		return Titanium.Locale.getLocaleCurrencySymbol(locale);
	}-*/;

	/**
	 * <b>getString</b>
	 * <p>
	 * return a localization string
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 1.5
	 * @param key (string) the key to use when mapping into the localization file
	 * @param hint (string) the text to use if no key found in the localization file
	 * @return string
	 */
	 public static native String getString(String key, String hint) /*-{
		return Titanium.Locale.getString(key, hint);
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 1.5
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public static native void removeEventListener(String name, JavaScriptObject callback) /*-{
		return Titanium.Locale.removeEventListener(name, callback);
	}-*/;
}
