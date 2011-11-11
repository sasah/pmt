package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>error</b>
 * <p>
 * called when an error is received playing the audio.
 */
public interface TitaniumMediaSoundErrorHandler {
	/**
	 * <b>error</b>
	 * <p>
	 * called when an error is received playing the audio.
	 * @param message error message
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 */
	void error(JavaScriptObject message, JavaScriptObject source, JavaScriptObject type);
}
