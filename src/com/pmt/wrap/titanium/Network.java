package com.pmt.wrap.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Network</b>
 * <p>
 * The top level Network module.  The Network module is used accessing Networking related functionality, including Titanium.Network.Socket
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
public class Network {

	private JavaScriptObject handler;

	public Network(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>INADDR_ANY</b> (string) static
	 * <p>
	 * constant value representing the ability for sockets to listen on any locally available network device
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String INADDR_ANY() /*-{
		return Titanium.Network.INADDR_ANY;
	}-*/;

	/**
	 * <b>NETWORK_LAN</b> (int) static
	 * <p>
	 * constant value to indicate that the network is LAN
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int NETWORK_LAN() /*-{
		return Titanium.Network.NETWORK_LAN;
	}-*/;

	/**
	 * <b>NETWORK_MOBILE</b> (int) static
	 * <p>
	 * constant value to indicate that the network is MOBILE
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int NETWORK_MOBILE() /*-{
		return Titanium.Network.NETWORK_MOBILE;
	}-*/;

	/**
	 * <b>NETWORK_NONE</b> (int) static
	 * <p>
	 * constant value to indicate that the network is not available
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int NETWORK_NONE() /*-{
		return Titanium.Network.NETWORK_NONE;
	}-*/;

	/**
	 * <b>NETWORK_UNKNOWN</b> (int) static
	 * <p>
	 * constant value to indicate that the network is not known
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int NETWORK_UNKNOWN() /*-{
		return Titanium.Network.NETWORK_UNKNOWN;
	}-*/;

	/**
	 * <b>NETWORK_WIFI</b> (int) static
	 * <p>
	 * constant value to indicate that the network is WIFI
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int NETWORK_WIFI() /*-{
		return Titanium.Network.NETWORK_WIFI;
	}-*/;

	/**
	 * <b>NOTIFICATION_TYPE_ALERT</b> (int) static
	 * <p>
	 * constant value for the push notification alert type
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int NOTIFICATION_TYPE_ALERT() /*-{
		return Titanium.Network.NOTIFICATION_TYPE_ALERT;
	}-*/;

	/**
	 * <b>NOTIFICATION_TYPE_BADGE</b> (int) static
	 * <p>
	 * constant value for the push notification badge type
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int NOTIFICATION_TYPE_BADGE() /*-{
		return Titanium.Network.NOTIFICATION_TYPE_BADGE;
	}-*/;

	/**
	 * <b>NOTIFICATION_TYPE_SOUND</b> (int) static
	 * <p>
	 * constant value for the push notification sound type
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int NOTIFICATION_TYPE_SOUND() /*-{
		return Titanium.Network.NOTIFICATION_TYPE_SOUND;
	}-*/;

	/**
	 * <b>READ_MODE</b> (int) static
	 * <p>
	 * constant value specifying read-only mode for sockets
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int READ_MODE() /*-{
		return Titanium.Network.READ_MODE;
	}-*/;

	/**
	 * <b>READ_WRITE_MODE</b> (int) static
	 * <p>
	 * constant value specifying read-write mode for sockets
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int READ_WRITE_MODE() /*-{
		return Titanium.Network.READ_WRITE_MODE;
	}-*/;

	/**
	 * <b>SOCKET_CLOSED</b> (int) static
	 * <p>
	 * constant value representing a socket in the CLOSED state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int SOCKET_CLOSED() /*-{
		return Titanium.Network.SOCKET_CLOSED;
	}-*/;

	/**
	 * <b>SOCKET_CONNECTED</b> (int) static
	 * <p>
	 * constant value representing a socket in the CONNECTED state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int SOCKET_CONNECTED() /*-{
		return Titanium.Network.SOCKET_CONNECTED;
	}-*/;

	/**
	 * <b>SOCKET_ERROR</b> (int) static
	 * <p>
	 * constant value representing a socket in the ERROR state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int SOCKET_ERROR() /*-{
		return Titanium.Network.SOCKET_ERROR;
	}-*/;

	/**
	 * <b>SOCKET_INITIALIZED</b> (int) static
	 * <p>
	 * constant value representing a socket in the INITIALIZED state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int SOCKET_INITIALIZED() /*-{
		return Titanium.Network.SOCKET_INITIALIZED;
	}-*/;

	/**
	 * <b>SOCKET_LISTENING</b> (int) static
	 * <p>
	 * constant value representing a socket in the LISTENING state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int SOCKET_LISTENING() /*-{
		return Titanium.Network.SOCKET_LISTENING;
	}-*/;

	/**
	 * <b>WRITE_MODE</b> (int) static
	 * <p>
	 * constant value specifying write-only mode for sockets
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int WRITE_MODE() /*-{
		return Titanium.Network.WRITE_MODE;
	}-*/;

	/**
	 * <b>networkType</b> (int) static
	 * <p>
	 * the network type value as a constant.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int getNetworkType() /*-{
		return Titanium.Network.networkType;
	}-*/;

	/**
	 * <b>networkType</b> (int) static
	 * <p>
	 * the network type value as a constant.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setNetworkType(int networkType) /*-{
		Titanium.Network.networkType = networkType;
	}-*/;

	/**
	 * <b>networkTypeName</b> (string) static
	 * <p>
	 * the network type name constant. Returns one of NONE, WIFI, LAN or MOBILE.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getNetworkTypeName() /*-{
		return Titanium.Network.networkTypeName;
	}-*/;

	/**
	 * <b>networkTypeName</b> (string) static
	 * <p>
	 * the network type name constant. Returns one of NONE, WIFI, LAN or MOBILE.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setNetworkTypeName(String networkTypeName) /*-{
		Titanium.Network.networkTypeName = networkTypeName;
	}-*/;

	/**
	 * <b>online</b> (boolean) static
	 * <p>
	 * readonly boolean value that indicates if the network is reachable to the Internet either via WIFI or Carrier network
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native boolean getOnline() /*-{
		return Titanium.Network.online;
	}-*/;

	/**
	 * <b>online</b> (boolean) static
	 * <p>
	 * readonly boolean value that indicates if the network is reachable to the Internet either via WIFI or Carrier network
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setOnline(boolean online) /*-{
		Titanium.Network.online = online;
	}-*/;

	/**
	 * <b>remoteDeviceUUID</b> (string) static
	 * <p>
	 * the remote device UUID if the device was registered with the Apple Push Notification Service or null if not set. Only available on iPhone.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native String getRemoteDeviceUUID() /*-{
		return Titanium.Network.remoteDeviceUUID;
	}-*/;

	/**
	 * <b>remoteDeviceUUID</b> (string) static
	 * <p>
	 * the remote device UUID if the device was registered with the Apple Push Notification Service or null if not set. Only available on iPhone.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setRemoteDeviceUUID(String remoteDeviceUUID) /*-{
		Titanium.Network.remoteDeviceUUID = remoteDeviceUUID;
	}-*/;

	/**
	 * <b>remoteNotificationTypes</b> (array) static
	 * <p>
	 * returns an array of network type constants enabled for the application. Only available on iPhone.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native JavaScriptObject getRemoteNotificationTypes() /*-{
		return Titanium.Network.remoteNotificationTypes;
	}-*/;

	/**
	 * <b>remoteNotificationTypes</b> (array) static
	 * <p>
	 * returns an array of network type constants enabled for the application. Only available on iPhone.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setRemoteNotificationTypes(JavaScriptObject remoteNotificationTypes) /*-{
		Titanium.Network.remoteNotificationTypes = remoteNotificationTypes;
	}-*/;

	/**
	 * <b>remoteNotificationsEnabled</b> (boolean) static
	 * <p>
	 * returns true if remote notifications have been enabled. Only available on iPhone.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native boolean getRemoteNotificationsEnabled() /*-{
		return Titanium.Network.remoteNotificationsEnabled;
	}-*/;

	/**
	 * <b>remoteNotificationsEnabled</b> (boolean) static
	 * <p>
	 * returns true if remote notifications have been enabled. Only available on iPhone.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setRemoteNotificationsEnabled(boolean remoteNotificationsEnabled) /*-{
		Titanium.Network.remoteNotificationsEnabled = remoteNotificationsEnabled;
	}-*/;

	/**
	 * <b>addConnectivityListener</b>
	 * <p>
	 * adds a connectivity listener to listen for network changes. This method has been deprecated in favor of listening for a change event.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param callback (function) callback function to invoke upon network connectivity changes
	 * @return void
	 */
	 public static native void addConnectivityListener(JavaScriptObject callback) /*-{
		return Titanium.Network.addConnectivityListener(callback);
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
		return Titanium.Network.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>createBonjourBrowser</b>
	 * <p>
	 * create and return an instance of Titanium.Network.BonjourBrowser
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param serviceType (string) service to search for, must include the protocol type suffix (._tcp)
	 * @param domain (string) the Bonjour service domain to conduct the search in.  Default value is 'local.'
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.Network.BonjourBrowser
	 * @return object
	 */
	 public static native JavaScriptObject createBonjourBrowser(String serviceType, String domain, JavaScriptObject parameters) /*-{
		return Titanium.Network.createBonjourBrowser(serviceType, domain, parameters);
	}-*/;

	/**
	 * <b>createBonjourService</b>
	 * <p>
	 * create and return an instance of Titanium.Network.BonjourService
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param name (string) the name of the service.  Must be a unique identifier for this service type and domain.
	 * @param type (string) the type of service.  Must include the protocol identifier (._tcp)
	 * @param domain (string) the domain to publish the service in.  Default value is 'local.'
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.Network.BonjourService
	 * @return object
	 */
	 public static native JavaScriptObject createBonjourService(String name, String type, String domain, JavaScriptObject parameters) /*-{
		return Titanium.Network.createBonjourService(name, type, domain, parameters);
	}-*/;

	/**
	 * <b>createHTTPClient</b>
	 * <p>
	 * create and return an instance of Titanium.Network.HTTPClient
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.Network.HTTPClient
	 * @return object
	 */
	 public static native JavaScriptObject createHTTPClient(JavaScriptObject parameters) /*-{
		return Titanium.Network.createHTTPClient(parameters);
	}-*/;

	/**
	 * <b>createTCPSocket</b>
	 * <p>
	 * create and return an instance of Titanium.Network.TCPSocket
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param hostName (string) the host name to connect to/listen on
	 * @param port (int) the port for the socket
	 * @param mode (int) the socket's mode; one of Titanium.Network.READ_MODE, Titanium.Network.WRITE_MODE, Titanium.Network.READ_WRITE_MODE
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.Network.TCPSocket
	 * @return object
	 */
	 public static native JavaScriptObject createTCPSocket(String hostName, int port, int mode, JavaScriptObject parameters) /*-{
		return Titanium.Network.createTCPSocket(hostName, port, mode, parameters);
	}-*/;

	/**
	 * <b>decodeURIComponent</b>
	 * <p>
	 * decode a URI component part using URI encoding
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param value (string) input value to be decoded
	 * @return string
	 */
	 public static native String decodeURIComponent(String value) /*-{
		return Titanium.Network.decodeURIComponent(value);
	}-*/;

	/**
	 * <b>encodeURIComponent</b>
	 * <p>
	 * encode a URI component part using URI encoding
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param value (string) input value to be encoded
	 * @return string
	 */
	 public static native String encodeURIComponent(String value) /*-{
		return Titanium.Network.encodeURIComponent(value);
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
		return Titanium.Network.fireEvent(name, event);
	}-*/;

	/**
	 * <b>registerForPushNotifications</b>
	 * <p>
	 * register for push notifications with the Apple Push Notification Service. Only available on iPhone.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param config (object) dictionary of the following: types is an array of type constants that the application would like to receive, success is a callback function that is called when the push registration is successfully completed, error is a callback function that is called when an error is received during registration and callback is a callback function that is invoked upon receiving a new push notification. This method should be called at application startup.
	 * @return void
	 */
	 public static native void registerForPushNotifications(JavaScriptObject config) /*-{
		return Titanium.Network.registerForPushNotifications(config);
	}-*/;

	/**
	 * <b>removeConnectivityListener</b>
	 * <p>
	 * removes a connectivity listener. This method has been deprecated in favor of listening for a change event.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param callback (function) callback function to remove
	 * @return void
	 */
	 public static native void removeConnectivityListener(JavaScriptObject callback) /*-{
		return Titanium.Network.removeConnectivityListener(callback);
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
		return Titanium.Network.removeEventListener(name, callback);
	}-*/;
	

	/**
	 * <b>change</b>
	 * <p>
	 * fired upon a network connectivity change
	 * @param change event handler
	 */
	public native void addChange(com.pmt.wrap.titanium.sys.events.TitaniumNetworkChangeHandler change) /*-{
		this.@com.pmt.wrap.titanium.Network::handler.addEventListener('change', function(networkType, source, type, online, networkTypeName) {
			change.@com.pmt.wrap.titanium.sys.events.TitaniumNetworkChangeHandler::change(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(networkType, source, type, online, networkTypeName);
		});
	}-*/;
}
