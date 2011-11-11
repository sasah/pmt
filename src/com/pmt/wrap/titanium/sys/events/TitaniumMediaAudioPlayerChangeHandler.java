package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>change</b>
 * <p>
 * fired when the state of the playback changes
 */
public interface TitaniumMediaAudioPlayerChangeHandler {
	/**
	 * <b>change</b>
	 * <p>
	 * fired when the state of the playback changes
	 * @param source the source object that fired the event
	 * @param description textual description of the state of playback
	 * @param state current state of playback
	 * @param type the name of the event fired
	 */
	void change(JavaScriptObject source, JavaScriptObject description, JavaScriptObject state, JavaScriptObject type);
}
