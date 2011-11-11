package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>volumeChange</b>
 * <p>
 * the volume changed
 */
public interface TitaniumMediaMusicPlayerVolumeChangeHandler {
	/**
	 * <b>volumeChange</b>
	 * <p>
	 * the volume changed
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 */
	void volumeChange(JavaScriptObject source, JavaScriptObject type);
}
