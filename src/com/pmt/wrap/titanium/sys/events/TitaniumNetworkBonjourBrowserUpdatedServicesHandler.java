package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>updatedServices</b>
 * <p>
 * Fired when the discovered services list is updated
 */
public interface TitaniumNetworkBonjourBrowserUpdatedServicesHandler {
	/**
	 * <b>updatedServices</b>
	 * <p>
	 * Fired when the discovered services list is updated
	 * @param services An array of BonjourService objects corresponding to currently available services.  If you cache this value, including using it as table data, be aware that it could become out of date at any time due to the asynchronous nature of Bonjour service discovery.
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 */
	void updatedServices(JavaScriptObject services, JavaScriptObject source, JavaScriptObject type);
}
