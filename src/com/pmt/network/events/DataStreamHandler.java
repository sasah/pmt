package com.pmt.network.events;

import com.google.gwt.core.client.JavaScriptObject;

public interface DataStreamHandler {
	void dataStream(int contentLength, int downloadLength, int chunkLength, JavaScriptObject blob, double progress);
}
