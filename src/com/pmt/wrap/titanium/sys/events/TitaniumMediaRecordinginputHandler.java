package com.pmt.wrap.titanium.sys.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>recordinginput</b>
 * <p>
 * fired when availablity of recording input changes
 */
public interface TitaniumMediaRecordinginputHandler {
	/**
	 * <b>recordinginput</b>
	 * <p>
	 * fired when availablity of recording input changes
	 * @param source the source object that fired the event
	 * @param available bool indicating availability of recording device
	 * @param type the name of the event fired
	 */
	void recordinginput(JavaScriptObject source, JavaScriptObject available, JavaScriptObject type);
}
