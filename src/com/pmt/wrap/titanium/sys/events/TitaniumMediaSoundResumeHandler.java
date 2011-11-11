package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>resume</b>
 * <p>
 * called when the audio is resumed after an interruption.
 */
public interface TitaniumMediaSoundResumeHandler {
	/**
	 * <b>resume</b>
	 * <p>
	 * called when the audio is resumed after an interruption.
	 * @param interruption boolean to indicate if the resume was from an interruption
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 */
	void resume(JavaScriptObject interruption, JavaScriptObject source, JavaScriptObject type);
}
