package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>volume</b>
 * <p>
 * fired when the volume output changes
 */
public interface TitaniumMediaVolumeHandler {
	/**
	 * <b>volume</b>
	 * <p>
	 * fired when the volume output changes
	 * @param source the source object that fired the event
	 * @param volume float of the new volume in dB
	 * @param type the name of the event fired
	 */
	void volume(JavaScriptObject source, JavaScriptObject volume, JavaScriptObject type);
}
