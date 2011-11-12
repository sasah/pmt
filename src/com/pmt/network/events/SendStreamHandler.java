package com.pmt.network.events;

import com.pmt.network.HTTPClient;

public interface SendStreamHandler {
	void sendStream(HTTPClient source, double progress);
}
