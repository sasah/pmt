package com.pmt.wrap.titanium.network;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Network.BonjourBrowser</b>
 * <p>
 * The BonjourBrowser instance returned from Titanium.Network.createBonjourBrowser.  This object is a browser for the discovery and retrieval of Bonjour services available on the network.
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
public class BonjourBrowser {

	private JavaScriptObject handler;

	public BonjourBrowser(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>domain</b> (string)
	 * <p>
	 * The domain the browser is searching in
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 */
	public native String getDomain() /*-{
		return this.@com.pmt.wrap.titanium.network.BonjourBrowser::handler.domain;
	}-*/;

	/**
	 * <b>domain</b> (string)
	 * <p>
	 * The domain the browser is searching in
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 */
	public native void setDomain(String domain) /*-{
		this.@com.pmt.wrap.titanium.network.BonjourBrowser::handler.domain = domain;
	}-*/;

	/**
	 * <b>isSearching</b> (boolean)
	 * <p>
	 * Whether or not the browser is currently searching
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 */
	public native boolean getIsSearching() /*-{
		return this.@com.pmt.wrap.titanium.network.BonjourBrowser::handler.isSearching;
	}-*/;

	/**
	 * <b>isSearching</b> (boolean)
	 * <p>
	 * Whether or not the browser is currently searching
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 */
	public native void setIsSearching(boolean isSearching) /*-{
		this.@com.pmt.wrap.titanium.network.BonjourBrowser::handler.isSearching = isSearching;
	}-*/;

	/**
	 * <b>serviceType</b> (string)
	 * <p>
	 * The type of the service the browser searches for
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 */
	public native String getServiceType() /*-{
		return this.@com.pmt.wrap.titanium.network.BonjourBrowser::handler.serviceType;
	}-*/;

	/**
	 * <b>serviceType</b> (string)
	 * <p>
	 * The type of the service the browser searches for
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 */
	public native void setServiceType(String serviceType) /*-{
		this.@com.pmt.wrap.titanium.network.BonjourBrowser::handler.serviceType = serviceType;
	}-*/;

	/**
	 * <b>search</b>
	 * <p>
	 * Conduct a search for Bonjour services matching the type and domain specified during creation
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 * @return void
	 */
	 public native void search() /*-{
		this.@com.pmt.wrap.titanium.network.BonjourBrowser::handler.search();
	}-*/;

	/**
	 * <b>stopSearch</b>
	 * <p>
	 * Halt an ongoing search
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2.0
	 * @return void
	 */
	 public native void stopSearch() /*-{
		this.@com.pmt.wrap.titanium.network.BonjourBrowser::handler.stopSearch();
	}-*/;
	

	/**
	 * <b>updatedServices</b>
	 * <p>
	 * Fired when the discovered services list is updated
	 * @param updatedServices event handler
	 */
	public native void addUpdatedServices(com.pmt.wrap.titanium.sys.events.TitaniumNetworkBonjourBrowserUpdatedServicesHandler updatedServices) /*-{
		this.@com.pmt.wrap.titanium.network.BonjourBrowser::handler.addEventListener('updatedServices', function(services, source, type) {
			updatedServices.@com.pmt.wrap.titanium.sys.events.TitaniumNetworkBonjourBrowserUpdatedServicesHandler::updatedServices(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(services, source, type);
		});
	}-*/;
}
