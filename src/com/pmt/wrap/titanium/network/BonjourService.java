package com.pmt.wrap.titanium.network;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Network.BonjourService</b>
 * <p>
 * The BonjourService instance returned either from Titanium.Network.createBonjourService or via the service list from a BonjourBrowser updatedServices event.  This object describes a service on the network which is published by Bonjour.
 * <p>
 * <b>Platforms:</b> iphone ipad 
 * <p>
 * <b>Since:</b> 1.2.0
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class BonjourService {

	private JavaScriptObject handler;

	public BonjourService(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>domain</b> (string)
	 * <p>
	 * the domain of the service
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 */
	public native String getDomain() /*-{
		return this.@com.pmt.wrap.titanium.network.BonjourService::handler.domain;
	}-*/;

	/**
	 * <b>domain</b> (string)
	 * <p>
	 * the domain of the service
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 */
	public native void setDomain(String domain) /*-{
		this.@com.pmt.wrap.titanium.network.BonjourService::handler.domain = domain;
	}-*/;

	/**
	 * <b>isLocal</b> (boolean)
	 * <p>
	 * whether or not the service is local to the device
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 */
	public native boolean getIsLocal() /*-{
		return this.@com.pmt.wrap.titanium.network.BonjourService::handler.isLocal;
	}-*/;

	/**
	 * <b>isLocal</b> (boolean)
	 * <p>
	 * whether or not the service is local to the device
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 */
	public native void setIsLocal(boolean isLocal) /*-{
		this.@com.pmt.wrap.titanium.network.BonjourService::handler.isLocal = isLocal;
	}-*/;

	/**
	 * <b>name</b> (string)
	 * <p>
	 * the name of the service
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 */
	public native String getName() /*-{
		return this.@com.pmt.wrap.titanium.network.BonjourService::handler.name;
	}-*/;

	/**
	 * <b>name</b> (string)
	 * <p>
	 * the name of the service
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 */
	public native void setName(String name) /*-{
		this.@com.pmt.wrap.titanium.network.BonjourService::handler.name = name;
	}-*/;

	/**
	 * <b>socket</b> (object)
	 * <p>
	 * the TCPSocket object that is used to connect to the service
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 */
	public native JavaScriptObject getSocket() /*-{
		return this.@com.pmt.wrap.titanium.network.BonjourService::handler.socket;
	}-*/;

	/**
	 * <b>socket</b> (object)
	 * <p>
	 * the TCPSocket object that is used to connect to the service
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 */
	public native void setSocket(JavaScriptObject socket) /*-{
		this.@com.pmt.wrap.titanium.network.BonjourService::handler.socket = socket;
	}-*/;

	/**
	 * <b>type</b> (string)
	 * <p>
	 * the type of the service
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 */
	public native String getType() /*-{
		return this.@com.pmt.wrap.titanium.network.BonjourService::handler.type;
	}-*/;

	/**
	 * <b>type</b> (string)
	 * <p>
	 * the type of the service
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 */
	public native void setType(String type) /*-{
		this.@com.pmt.wrap.titanium.network.BonjourService::handler.type = type;
	}-*/;

	/**
	 * <b>publish</b>
	 * <p>
	 * Publish a Bonjour service to the network.  Only works if isLocal is TRUE
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 * @param socket (object) a TCPSocket object to associate with the Bonjour service.
	 * @return void
	 */
	 public native void publish(JavaScriptObject socket) /*-{
		this.@com.pmt.wrap.titanium.network.BonjourService::handler.publish(socket);
	}-*/;

	/**
	 * <b>resolve</b>
	 * <p>
	 * Resolve a Bonjour service from the network.  Must be done before attempting to access the service's socket information, if a remote service.  You cannot resolve a locally published service.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 * @param timeout (double) the timeout for service resolution, in seconds.  Optional, default is 120s.
	 * @return void
	 */
	 public native void resolve(double timeout) /*-{
		this.@com.pmt.wrap.titanium.network.BonjourService::handler.resolve(timeout);
	}-*/;

	/**
	 * <b>stop</b>
	 * <p>
	 * Halts publication of a service.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 * @return void
	 */
	 public native void stop() /*-{
		this.@com.pmt.wrap.titanium.network.BonjourService::handler.stop();
	}-*/;
}
