package com.pmt.network.events;

import com.pmt.network.HTTPClient;

public interface ErrorHandler {
	void error(HTTPClient source, String error);
}
