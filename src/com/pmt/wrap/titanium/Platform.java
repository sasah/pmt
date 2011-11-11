package com.pmt.wrap.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Platform</b>
 * <p>
 * The top level Platform module.  The Platform module is used accessing the device's platformrelated functionality.
 * <p>
 * <b>Platforms:</b> android iphone ipad 
 * <p>
 * <b>Since:</b> 0.1
 * <p>
 * <b>Type:</b> module
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class Platform {

	private JavaScriptObject handler;

	public Platform(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>BATTERY_STATE_CHARGING</b> (int) static
	 * <p>
	 * the device is plugged in and currently being charged
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int BATTERY_STATE_CHARGING() /*-{
		return Titanium.Platform.BATTERY_STATE_CHARGING;
	}-*/;

	/**
	 * <b>BATTERY_STATE_FULL</b> (int) static
	 * <p>
	 * the battery is fully charged
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int BATTERY_STATE_FULL() /*-{
		return Titanium.Platform.BATTERY_STATE_FULL;
	}-*/;

	/**
	 * <b>BATTERY_STATE_UNKNOWN</b> (int) static
	 * <p>
	 * the battery state is unknown or not monitoring is not enabled
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int BATTERY_STATE_UNKNOWN() /*-{
		return Titanium.Platform.BATTERY_STATE_UNKNOWN;
	}-*/;

	/**
	 * <b>BATTERY_STATE_UNPLUGGED</b> (int) static
	 * <p>
	 * the device is unplugged
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int BATTERY_STATE_UNPLUGGED() /*-{
		return Titanium.Platform.BATTERY_STATE_UNPLUGGED;
	}-*/;

	/**
	 * <b>address</b> (string) static
	 * <p>
	 * the ip address that the device reports (only applicable on WIFI network)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getAddress() /*-{
		return Titanium.Platform.address;
	}-*/;

	/**
	 * <b>address</b> (string) static
	 * <p>
	 * the ip address that the device reports (only applicable on WIFI network)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setAddress(String address) /*-{
		Titanium.Platform.address = address;
	}-*/;

	/**
	 * <b>architecture</b> (string) static
	 * <p>
	 * the processor architecture that the device reports
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getArchitecture() /*-{
		return Titanium.Platform.architecture;
	}-*/;

	/**
	 * <b>architecture</b> (string) static
	 * <p>
	 * the processor architecture that the device reports
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setArchitecture(String architecture) /*-{
		Titanium.Platform.architecture = architecture;
	}-*/;

	/**
	 * <b>availableMemory</b> (double) static
	 * <p>
	 * return the amount of memory available on the device in bytes
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native double getAvailableMemory() /*-{
		return Titanium.Platform.availableMemory;
	}-*/;

	/**
	 * <b>availableMemory</b> (double) static
	 * <p>
	 * return the amount of memory available on the device in bytes
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setAvailableMemory(double availableMemory) /*-{
		Titanium.Platform.availableMemory = availableMemory;
	}-*/;

	/**
	 * <b>batteryLevel</b> (float) static
	 * <p>
	 * the current device battery level. this property is only accessible if batteryMonitoring is enabled. on iPhone, this level only changes at 5% intervals.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native double getBatteryLevel() /*-{
		return Titanium.Platform.batteryLevel;
	}-*/;

	/**
	 * <b>batteryLevel</b> (float) static
	 * <p>
	 * the current device battery level. this property is only accessible if batteryMonitoring is enabled. on iPhone, this level only changes at 5% intervals.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setBatteryLevel(double batteryLevel) /*-{
		Titanium.Platform.batteryLevel = batteryLevel;
	}-*/;

	/**
	 * <b>batteryMonitoring</b> (boolean) static
	 * <p>
	 * boolean to indicate if battery monitoring is enabled
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native boolean getBatteryMonitoring() /*-{
		return Titanium.Platform.batteryMonitoring;
	}-*/;

	/**
	 * <b>batteryMonitoring</b> (boolean) static
	 * <p>
	 * boolean to indicate if battery monitoring is enabled
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setBatteryMonitoring(boolean batteryMonitoring) /*-{
		Titanium.Platform.batteryMonitoring = batteryMonitoring;
	}-*/;

	/**
	 * <b>batteryState</b> (int) static
	 * <p>
	 * constant that represents the state of the battery. this property is only accessible if batteryMonitoring is enabled
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int getBatteryState() /*-{
		return Titanium.Platform.batteryState;
	}-*/;

	/**
	 * <b>batteryState</b> (int) static
	 * <p>
	 * constant that represents the state of the battery. this property is only accessible if batteryMonitoring is enabled
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setBatteryState(int batteryState) /*-{
		Titanium.Platform.batteryState = batteryState;
	}-*/;

	/**
	 * <b>displayCaps</b> (object) static
	 * <p>
	 * return the DisplayCaps object for platform
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native JavaScriptObject getDisplayCaps() /*-{
		return Titanium.Platform.displayCaps;
	}-*/;

	/**
	 * <b>displayCaps</b> (object) static
	 * <p>
	 * return the DisplayCaps object for platform
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setDisplayCaps(JavaScriptObject displayCaps) /*-{
		Titanium.Platform.displayCaps = displayCaps;
	}-*/;

	/**
	 * <b>id</b> (string) static
	 * <p>
	 * the unique id of the device
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getId() /*-{
		return Titanium.Platform.id;
	}-*/;

	/**
	 * <b>id</b> (string) static
	 * <p>
	 * the unique id of the device
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setId(String id) /*-{
		Titanium.Platform.id = id;
	}-*/;

	/**
	 * <b>locale</b> (string) static
	 * <p>
	 * the primary language of the device that the user has enabled
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getLocale() /*-{
		return Titanium.Platform.locale;
	}-*/;

	/**
	 * <b>locale</b> (string) static
	 * <p>
	 * the primary language of the device that the user has enabled
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setLocale(String locale) /*-{
		Titanium.Platform.locale = locale;
	}-*/;

	/**
	 * <b>macaddress</b> (string) static
	 * <p>
	 * this property will return a unique identifier for the device
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getMacaddress() /*-{
		return Titanium.Platform.macaddress;
	}-*/;

	/**
	 * <b>macaddress</b> (string) static
	 * <p>
	 * this property will return a unique identifier for the device
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setMacaddress(String macaddress) /*-{
		Titanium.Platform.macaddress = macaddress;
	}-*/;

	/**
	 * <b>model</b> (string) static
	 * <p>
	 * the model of the phone that the device reports
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getModel() /*-{
		return Titanium.Platform.model;
	}-*/;

	/**
	 * <b>model</b> (string) static
	 * <p>
	 * the model of the phone that the device reports
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setModel(String model) /*-{
		Titanium.Platform.model = model;
	}-*/;

	/**
	 * <b>name</b> (string) static
	 * <p>
	 * the name of the platform returned by the device
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getName() /*-{
		return Titanium.Platform.name;
	}-*/;

	/**
	 * <b>name</b> (string) static
	 * <p>
	 * the name of the platform returned by the device
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setName(String name) /*-{
		Titanium.Platform.name = name;
	}-*/;

	/**
	 * <b>netmask</b> (string) static
	 * <p>
	 * the network mask that the device reports (only applicable on WIFI network)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getNetmask() /*-{
		return Titanium.Platform.netmask;
	}-*/;

	/**
	 * <b>netmask</b> (string) static
	 * <p>
	 * the network mask that the device reports (only applicable on WIFI network)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setNetmask(String netmask) /*-{
		Titanium.Platform.netmask = netmask;
	}-*/;

	/**
	 * <b>osname</b> (string) static
	 * <p>
	 * the shortname of the operating system. for example, on an iPhone, will return iphone, iPad will return ipad and Android will return android.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getOsname() /*-{
		return Titanium.Platform.osname;
	}-*/;

	/**
	 * <b>osname</b> (string) static
	 * <p>
	 * the shortname of the operating system. for example, on an iPhone, will return iphone, iPad will return ipad and Android will return android.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setOsname(String osname) /*-{
		Titanium.Platform.osname = osname;
	}-*/;

	/**
	 * <b>ostype</b> (string) static
	 * <p>
	 * the OS architecture, such as 32 bit
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getOstype() /*-{
		return Titanium.Platform.ostype;
	}-*/;

	/**
	 * <b>ostype</b> (string) static
	 * <p>
	 * the OS architecture, such as 32 bit
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setOstype(String ostype) /*-{
		Titanium.Platform.ostype = ostype;
	}-*/;

	/**
	 * <b>processorCount</b> (int) static
	 * <p>
	 * the number of processors the device reports
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int getProcessorCount() /*-{
		return Titanium.Platform.processorCount;
	}-*/;

	/**
	 * <b>processorCount</b> (int) static
	 * <p>
	 * the number of processors the device reports
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setProcessorCount(int processorCount) /*-{
		Titanium.Platform.processorCount = processorCount;
	}-*/;

	/**
	 * <b>username</b> (string) static
	 * <p>
	 * the username of the device, if set
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getUsername() /*-{
		return Titanium.Platform.username;
	}-*/;

	/**
	 * <b>username</b> (string) static
	 * <p>
	 * the username of the device, if set
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setUsername(String username) /*-{
		Titanium.Platform.username = username;
	}-*/;

	/**
	 * <b>version</b> (string) static
	 * <p>
	 * the version of the platform returned by the device
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getVersion() /*-{
		return Titanium.Platform.version;
	}-*/;

	/**
	 * <b>version</b> (string) static
	 * <p>
	 * the version of the platform returned by the device
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setVersion(String version) /*-{
		Titanium.Platform.version = version;
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
		return Titanium.Platform.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>canOpenURL</b>
	 * <p>
	 * returns whether or not a system URL can be opened. iOS only
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param url (string) the url to check
	 * @return void
	 */
	 public static native void canOpenURL(String url) /*-{
		return Titanium.Platform.canOpenURL(url);
	}-*/;

	/**
	 * <b>createUUID</b>
	 * <p>
	 * create a globally unique identifier
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return string
	 */
	 public static native String createUUID() /*-{
		return Titanium.Platform.createUUID();
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
		return Titanium.Platform.fireEvent(name, event);
	}-*/;

	/**
	 * <b>openURL</b>
	 * <p>
	 * open a URL in the system default manner
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param url (string) the url to open
	 * @return void
	 */
	 public static native void openURL(String url) /*-{
		return Titanium.Platform.openURL(url);
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
		return Titanium.Platform.removeEventListener(name, callback);
	}-*/;
	

	/**
	 * <b>battery</b>
	 * <p>
	 * fired when the battery state changes.  the battery state changes are only tracked on iPhone/iPad at 5% increments.
	 * @param battery event handler
	 */
	public native void addBattery(com.pmt.wrap.titanium.sys.events.TitaniumPlatformBatteryHandler battery) /*-{
		this.@com.pmt.wrap.titanium.Platform::handler.addEventListener('battery', function(level, source, state, type) {
			battery.@com.pmt.wrap.titanium.sys.events.TitaniumPlatformBatteryHandler::battery(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(level, source, state, type);
		});
	}-*/;
}
