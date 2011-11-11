package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>stop</b>
 * <p>
 * Fired when the bound Service instance stops, meaning Titanium.Android.Service.stop or Titanium.Android.stopService has been called and there are no more bound, un-stopped clients.
 */
public interface TitaniumAndroidServiceStopHandler {
	/**
	 * <b>stop</b>
	 * <p>
	 * Fired when the bound Service instance stops, meaning Titanium.Android.Service.stop or Titanium.Android.stopService has been called and there are no more bound, un-stopped clients.
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 */
	void stop(JavaScriptObject source, JavaScriptObject type);
}
