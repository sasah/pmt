package com.pmt.network.events;

import com.pmt.network.HTTPClient;

public interface SendStreamHandler {
	void onSendStream(HTTPClient source, double progress);
}
