package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>complete</b>
 * <p>
 * fired when the audio has completed
 */
public interface TitaniumMediaSoundCompleteHandler {
	/**
	 * <b>complete</b>
	 * <p>
	 * fired when the audio has completed
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 * @param success boolean to indicate if the sound was successfully played
	 */
	void complete(JavaScriptObject source, JavaScriptObject type, JavaScriptObject success);
}
