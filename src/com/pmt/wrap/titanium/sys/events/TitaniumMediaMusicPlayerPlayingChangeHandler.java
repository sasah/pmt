package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>playingChange</b>
 * <p>
 * the currently playing media changed
 */
public interface TitaniumMediaMusicPlayerPlayingChangeHandler {
	/**
	 * <b>playingChange</b>
	 * <p>
	 * the currently playing media changed
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 */
	void playingChange(JavaScriptObject source, JavaScriptObject type);
}
