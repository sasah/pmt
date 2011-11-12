package com.pmt.network.events;

import com.pmt.network.HTTPClient;

public interface ReadyStateChangeHandler {
	void onReadyStateChange(HTTPClient source);
}
