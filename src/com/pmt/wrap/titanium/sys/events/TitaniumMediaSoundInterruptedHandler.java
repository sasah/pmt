package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>interrupted</b>
 * <p>
 * called when the audio is interrupted by the device. this is typically called during an interruption due to an incoming phone call.
 */
public interface TitaniumMediaSoundInterruptedHandler {
	/**
	 * <b>interrupted</b>
	 * <p>
	 * called when the audio is interrupted by the device. this is typically called during an interruption due to an incoming phone call.
	 * @param source the source object that fired the event
	 * @param type the name of the event fired
	 */
	void interrupted(JavaScriptObject source, JavaScriptObject type);
}
