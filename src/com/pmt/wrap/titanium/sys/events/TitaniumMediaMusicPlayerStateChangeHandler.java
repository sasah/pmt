package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>stateChange</b>
 * <p>
 * the playback state changed
 */
public interface TitaniumMediaMusicPlayerStateChangeHandler {
	/**
	 * <b>stateChange</b>
	 * <p>
	 * the playback state changed
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 */
	void stateChange(JavaScriptObject source, JavaScriptObject type);
}
