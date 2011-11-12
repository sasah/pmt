package com.pmt.network.events;

import com.pmt.network.HTTPClient;

public interface LoadHandler {
	void load(HTTPClient source);
}
