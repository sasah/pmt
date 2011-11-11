package com.pmt.wrap.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Geolocation</b>
 * <p>
 * The top level Geolocation module. The Geolocation module is used for accessing device location based information.
 * <p>
 * <b>Platforms:</b> android iphone ipad 
 * <p>
 * <b>Since:</b> 0.1
 * <p>
 * <b>Type:</b> module
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> object
 */
public class Geolocation {

	private JavaScriptObject handler;

	public Geolocation(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>ACCURACY_BEST</b> (int) static
	 * <p>
	 * accuracy constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int ACCURACY_BEST() /*-{
		return Titanium.Geolocation.ACCURACY_BEST;
	}-*/;

	/**
	 * <b>ACCURACY_HUNDRED_METERS</b> (int) static
	 * <p>
	 * accuracy constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int ACCURACY_HUNDRED_METERS() /*-{
		return Titanium.Geolocation.ACCURACY_HUNDRED_METERS;
	}-*/;

	/**
	 * <b>ACCURACY_KILOMETER</b> (int) static
	 * <p>
	 * accuracy constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int ACCURACY_KILOMETER() /*-{
		return Titanium.Geolocation.ACCURACY_KILOMETER;
	}-*/;

	/**
	 * <b>ACCURACY_NEAREST_TEN_METERS</b> (int) static
	 * <p>
	 * accuracy constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int ACCURACY_NEAREST_TEN_METERS() /*-{
		return Titanium.Geolocation.ACCURACY_NEAREST_TEN_METERS;
	}-*/;

	/**
	 * <b>ACCURACY_THREE_KILOMETERS</b> (int) static
	 * <p>
	 * accuracy constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int ACCURACY_THREE_KILOMETERS() /*-{
		return Titanium.Geolocation.ACCURACY_THREE_KILOMETERS;
	}-*/;

	/**
	 * <b>AUTHORIZATION_AUTHORIZED</b> (int) static
	 * <p>
	 * authorization constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUTHORIZATION_AUTHORIZED() /*-{
		return Titanium.Geolocation.AUTHORIZATION_AUTHORIZED;
	}-*/;

	/**
	 * <b>AUTHORIZATION_DENIED</b> (int) static
	 * <p>
	 * authorization constant (user disabled authorization)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUTHORIZATION_DENIED() /*-{
		return Titanium.Geolocation.AUTHORIZATION_DENIED;
	}-*/;

	/**
	 * <b>AUTHORIZATION_RESTRICTED</b> (int) static
	 * <p>
	 * authorization constant (system disabled authorization)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUTHORIZATION_RESTRICTED() /*-{
		return Titanium.Geolocation.AUTHORIZATION_RESTRICTED;
	}-*/;

	/**
	 * <b>AUTHORIZATION_UNKNOWN</b> (int) static
	 * <p>
	 * authorization constant
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUTHORIZATION_UNKNOWN() /*-{
		return Titanium.Geolocation.AUTHORIZATION_UNKNOWN;
	}-*/;

	/**
	 * <b>ERROR_DENIED</b> (int) static
	 * <p>
	 * error constant (iOS only)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int ERROR_DENIED() /*-{
		return Titanium.Geolocation.ERROR_DENIED;
	}-*/;

	/**
	 * <b>ERROR_HEADING_FAILURE</b> (int) static
	 * <p>
	 * error constant (iOS only)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int ERROR_HEADING_FAILURE() /*-{
		return Titanium.Geolocation.ERROR_HEADING_FAILURE;
	}-*/;

	/**
	 * <b>ERROR_LOCATION_UNKNOWN</b> (int) static
	 * <p>
	 * error constant (iOS only)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int ERROR_LOCATION_UNKNOWN() /*-{
		return Titanium.Geolocation.ERROR_LOCATION_UNKNOWN;
	}-*/;

	/**
	 * <b>ERROR_NETWORK</b> (int) static
	 * <p>
	 * error constant (iOS only)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int ERROR_NETWORK() /*-{
		return Titanium.Geolocation.ERROR_NETWORK;
	}-*/;

	/**
	 * <b>ERROR_REGION_MONITORING_DELAYED</b> (int) static
	 * <p>
	 * error constant (iOS 4.0+ only)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int ERROR_REGION_MONITORING_DELAYED() /*-{
		return Titanium.Geolocation.ERROR_REGION_MONITORING_DELAYED;
	}-*/;

	/**
	 * <b>ERROR_REGION_MONITORING_DENIED</b> (int) static
	 * <p>
	 * error constant (iOS 4.0+ only)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int ERROR_REGION_MONITORING_DENIED() /*-{
		return Titanium.Geolocation.ERROR_REGION_MONITORING_DENIED;
	}-*/;

	/**
	 * <b>ERROR_REGION_MONITORING_FAILURE</b> (int) static
	 * <p>
	 * error constant (iOS 4.0+ only)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int ERROR_REGION_MONITORING_FAILURE() /*-{
		return Titanium.Geolocation.ERROR_REGION_MONITORING_FAILURE;
	}-*/;

	/**
	 * <b>PROVIDER_GPS</b> (string) static
	 * <p>
	 * The GPS location provider
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String PROVIDER_GPS() /*-{
		return Titanium.Geolocation.PROVIDER_GPS;
	}-*/;

	/**
	 * <b>PROVIDER_NETWORK</b> (string) static
	 * <p>
	 * The Network location provider
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String PROVIDER_NETWORK() /*-{
		return Titanium.Geolocation.PROVIDER_NETWORK;
	}-*/;

	/**
	 * <b>distanceFilter</b> (double) static
	 * <p>
	 * The minimum change of position (in meters) before a 'location' event is fired. Default is 0, meaning that location events are continuously generated.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native double getDistanceFilter() /*-{
		return Titanium.Geolocation.distanceFilter;
	}-*/;

	/**
	 * <b>distanceFilter</b> (double) static
	 * <p>
	 * The minimum change of position (in meters) before a 'location' event is fired. Default is 0, meaning that location events are continuously generated.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setDistanceFilter(double distanceFilter) /*-{
		Titanium.Geolocation.distanceFilter = distanceFilter;
	}-*/;

	/**
	 * <b>headingFilter</b> (double) static
	 * <p>
	 * The minium change of heading (in degrees) before a 'heading' event is fired. Default is 0, meaning that heading events are continuously generated.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native double getHeadingFilter() /*-{
		return Titanium.Geolocation.headingFilter;
	}-*/;

	/**
	 * <b>headingFilter</b> (double) static
	 * <p>
	 * The minium change of heading (in degrees) before a 'heading' event is fired. Default is 0, meaning that heading events are continuously generated.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setHeadingFilter(double headingFilter) /*-{
		Titanium.Geolocation.headingFilter = headingFilter;
	}-*/;

	/**
	 * <b>locationServicesAuthorization</b> (int) static
	 * <p>
	 * (iOS 4.2+ only). Returns an authorization constant indicating if the application has access to location services. Always returns AUTHORIZATION_UNKNOWN on pre-4.2 devices. Attempting to re-authorize when AUTHORIZATION_RESTRICTED will lead to issues
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int getLocationServicesAuthorization() /*-{
		return Titanium.Geolocation.locationServicesAuthorization;
	}-*/;

	/**
	 * <b>locationServicesAuthorization</b> (int) static
	 * <p>
	 * (iOS 4.2+ only). Returns an authorization constant indicating if the application has access to location services. Always returns AUTHORIZATION_UNKNOWN on pre-4.2 devices. Attempting to re-authorize when AUTHORIZATION_RESTRICTED will lead to issues
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setLocationServicesAuthorization(int locationServicesAuthorization) /*-{
		Titanium.Geolocation.locationServicesAuthorization = locationServicesAuthorization;
	}-*/;

	/**
	 * <b>locationServicesEnabled</b> (boolean) static
	 * <p>
	 * returns true if the user has enabled or disable location services for the device (not the application).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native boolean getLocationServicesEnabled() /*-{
		return Titanium.Geolocation.locationServicesEnabled;
	}-*/;

	/**
	 * <b>locationServicesEnabled</b> (boolean) static
	 * <p>
	 * returns true if the user has enabled or disable location services for the device (not the application).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setLocationServicesEnabled(boolean locationServicesEnabled) /*-{
		Titanium.Geolocation.locationServicesEnabled = locationServicesEnabled;
	}-*/;

	/**
	 * <b>preferredProvider</b> (string) static
	 * <p>
	 * allows setting of the preferred location provider.  Returns undefined when the preferred provider is auto-detected
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getPreferredProvider() /*-{
		return Titanium.Geolocation.preferredProvider;
	}-*/;

	/**
	 * <b>preferredProvider</b> (string) static
	 * <p>
	 * allows setting of the preferred location provider.  Returns undefined when the preferred provider is auto-detected
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setPreferredProvider(String preferredProvider) /*-{
		Titanium.Geolocation.preferredProvider = preferredProvider;
	}-*/;

	/**
	 * <b>purpose</b> (string) static
	 * <p>
	 * (iOS only). This property informs the end-user why location services are being requested by the application.  This string will be display in the permission dialog. This property is REQUIRED starting in 4.0.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getPurpose() /*-{
		return Titanium.Geolocation.purpose;
	}-*/;

	/**
	 * <b>purpose</b> (string) static
	 * <p>
	 * (iOS only). This property informs the end-user why location services are being requested by the application.  This string will be display in the permission dialog. This property is REQUIRED starting in 4.0.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setPurpose(String purpose) /*-{
		Titanium.Geolocation.purpose = purpose;
	}-*/;

	/**
	 * <b>showCalibration</b> (boolean) static
	 * <p>
	 * returns true if the calibration UI can show
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native boolean getShowCalibration() /*-{
		return Titanium.Geolocation.showCalibration;
	}-*/;

	/**
	 * <b>showCalibration</b> (boolean) static
	 * <p>
	 * returns true if the calibration UI can show
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setShowCalibration(boolean showCalibration) /*-{
		Titanium.Geolocation.showCalibration = showCalibration;
	}-*/;

	/**
	 * <b>addEventListener</b>
	 * <p>
	 * add an event listener for the instance to receive view triggered events
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public static native void addEventListener(String name, JavaScriptObject callback) /*-{
		return Titanium.Geolocation.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public static native void fireEvent(String name, JavaScriptObject event) /*-{
		return Titanium.Geolocation.fireEvent(name, event);
	}-*/;

	/**
	 * <b>forwardGeocoder</b>
	 * <p>
	 * tries to resolve an address to a location.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param address (string) address to resolve.
	 * @param callback (function) function to invoke on success or failure. The event object contains the properties described as the place dictionary in Titanium.Geolocation.reverseGeocoder.
	 * @return void
	 */
	 public static native void forwardGeocoder(String address, JavaScriptObject callback) /*-{
		return Titanium.Geolocation.forwardGeocoder(address, callback);
	}-*/;

	/**
	 * <b>getCurrentHeading</b>
	 * <p>
	 * retrieve the current compass heading.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param callback (function) function to invoke on success or failure of obtaining the current heading. See heading event in Titanium.Geolocation.
	 * @return void
	 */
	 public static native void getCurrentHeading(JavaScriptObject callback) /*-{
		return Titanium.Geolocation.getCurrentHeading(callback);
	}-*/;

	/**
	 * <b>getCurrentPosition</b>
	 * <p>
	 * retrieve the last known location from the device. On Android, the radios are not turned on to update the location. On iOS the radios MAY be used if the location is too "old".
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param callback (function) function to invoke on success or failure of obtaining the current location. See location event in Titanium.Geolocation.
	 * @return void
	 */
	 public static native void getCurrentPosition(JavaScriptObject callback) /*-{
		return Titanium.Geolocation.getCurrentPosition(callback);
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public static native void removeEventListener(String name, JavaScriptObject callback) /*-{
		return Titanium.Geolocation.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>reverseGeocoder</b>
	 * <p>
	 * tries to resolve a location to an address.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param latitude (double) latitude to search
	 * @param longitude (double) longitude to search
	 * @param callback (function) function to invoke on success or failure. The event object passed contains a places array of zero or more place dictionaries. Each place dictionary contains the following properties: street, street1, city, region1, region2, postalCode, country, countryCode, longitude, latitude, displayAddress, address.
	 * @return void
	 */
	 public static native void reverseGeocoder(double latitude, double longitude, JavaScriptObject callback) /*-{
		return Titanium.Geolocation.reverseGeocoder(latitude, longitude, callback);
	}-*/;

	/**
	 * <b>setShowCalibration</b>
	 * <p>
	 * configure the calibration UI. set the false to disable the calibration display. (iOS only)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return void
	 */
	 public static native void setShowCalibrationMethod() /*-{
		return Titanium.Geolocation.setShowCalibrationMethod();
	}-*/;
	

	/**
	 * <b>calibration</b>
	 * <p>
	 * fired only on iPhone/iPad when the device detects interface and requires calibration. when this event is fired, the calibration UI is being displayed to the end user.
	 * @param calibration event handler
	 */
	public native void addCalibration(com.pmt.wrap.titanium.sys.events.TitaniumGeolocationCalibrationHandler calibration) /*-{
		this.@com.pmt.wrap.titanium.Geolocation::handler.addEventListener('calibration', function(source, type) {
			calibration.@com.pmt.wrap.titanium.sys.events.TitaniumGeolocationCalibrationHandler::calibration(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type);
		});
	}-*/;
	

	/**
	 * <b>heading</b>
	 * <p>
	 * fired when a heading event is received
	 * @param heading event handler
	 */
	public native void addHeading(com.pmt.wrap.titanium.sys.events.TitaniumGeolocationHeadingHandler heading) /*-{
		this.@com.pmt.wrap.titanium.Geolocation::handler.addEventListener('heading', function(source, error, code, type, success, heading) {
			heading.@com.pmt.wrap.titanium.sys.events.TitaniumGeolocationHeadingHandler::heading(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, error, code, type, success, heading);
		});
	}-*/;
	

	/**
	 * <b>location</b>
	 * <p>
	 * fired when a location event is received
	 * @param location event handler
	 */
	public native void addLocation(com.pmt.wrap.titanium.sys.events.TitaniumGeolocationLocationHandler location) /*-{
		this.@com.pmt.wrap.titanium.Geolocation::handler.addEventListener('location', function(coords, source, error, provider, code, type, success) {
			location.@com.pmt.wrap.titanium.sys.events.TitaniumGeolocationLocationHandler::location(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(coords, source, error, provider, code, type, success);
		});
	}-*/;
}
