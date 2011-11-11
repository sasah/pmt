package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>progress</b>
 * <p>
 * fired once per second with the current progress during playback
 */
public interface TitaniumMediaAudioPlayerProgressHandler {
	/**
	 * <b>progress</b>
	 * <p>
	 * fired once per second with the current progress during playback
	 * @param progress current progress value
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 */
	void progress(JavaScriptObject progress, JavaScriptObject source, JavaScriptObject type);
}
