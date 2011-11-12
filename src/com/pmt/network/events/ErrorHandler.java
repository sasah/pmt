package com.pmt.network.events;

import com.pmt.network.HTTPClient;

public interface ErrorHandler {
	void onError(HTTPClient source, String error);
}
