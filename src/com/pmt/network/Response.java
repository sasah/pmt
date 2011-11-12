package com.pmt.network;

import com.google.gwt.core.client.JavaScriptObject;

public abstract class Response {
	public static final int SC_ACCEPTED = 202;
	public static final int SC_BAD_GATEWAY = 502;
	public static final int SC_BAD_REQUEST = 400;
	public static final int SC_CONFLICT = 409;
	public static final int SC_CONTINUE = 100;
	public static final int SC_CREATED = 201;
	public static final int SC_EXPECTATION_FAILED = 417;
	public static final int SC_FORBIDDEN = 403;
	public static final int SC_GATEWAY_TIMEOUT = 405;
	public static final int SC_GONE = 410;
	public static final int SC_HTTP_VERSION_NOT_SUPPORTED = 505;
	public static final int SC_INTERNAL_SERVER_ERROR = 500;
	public static final int SC_LENGTH_REQUIRED = 411;
	public static final int SC_METHOD_NOT_ALLOWED = 405;
	public static final int SC_MOVED_PERMANENTLY = 301;
	public static final int SC_MOVED_TEMPORARILY = 302;
	public static final int SC_MULTIPLE_CHOICES = 300;
	public static final int SC_NO_CONTENT = 204;
	public static final int SC_NON_AUTHORITATIVE_INFORMATION = 203;
	public static final int SC_NOT_ACCEPTABLE = 406;
	public static final int SC_NOT_FOUND = 404;
	public static final int SC_NOT_IMPLEMENTED = 501;
	public static final int SC_NOT_MODIFIED = 304;
	public static final int SC_OK = 200;
	public static final int SC_PARTIAL_CONTENT = 206;
	public static final int SC_PAYMENT_REQUIRED = 402;
	public static final int SC_PRECONDITION_FAILED = 412;
	public static final int SC_PROXY_AUTHENTICATION_REQUIRED = 407;
	public static final int SC_REQUEST_ENTITY_TOO_LARGE = 413;
	public static final int SC_REQUESTED_RANGE_NOT_SATISFIABLE = 416;
	public static final int SC_RESET_CONTENT = 205;
	public static final int SC_SEE_OTHER = 303;
	public static final int SC_SERVICE_UNAVAILABLE = 503;
	public static final int SC_SWITCHING_PROTOCOLS = 101;
	public static final int SC_TEMPORARY_REDIRECT = 307;
	public static final int SC_UNAUTHORIZED = 401;
	public static final int SC_UNSUPPORTED_MEDIA_TYPE = 415;
	public static final int SC_USE_PROXY = 305;
	
	
	/**
	 * <b>connected</b> (boolean)
	 * <p>
	 * boolean to indicate that the response was successful
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public abstract boolean getConnected();
	
	/**
	 * <b>status</b> (int)
	 * <p>
	 * the response HTTP status code
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public abstract int getStatus();

	/**
	 * <b>getResponseHeader</b>
	 * <p>
	 * return the response header.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * 
	 * @param name
	 *            (string) the header name
	 * @return string
	 */
	public abstract String getResponseHeader(String name);

	/**
	 * <b>responseData</b> (object)
	 * <p>
	 * the response data as a Blob object.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public abstract JavaScriptObject getData();

	/**
	 * <b>responseText</b> (string)
	 * <p>
	 * the response as text or null if an error was received or no data was
	 * returned
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public abstract String getText();

	/**
	 * <b>responseXML</b> (object)
	 * <p>
	 * the response object as an XML DOMDocument object. returns null if the
	 * content type returned by the server was not XML or the content could not
	 * be parsed
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public abstract JavaScriptObject getXML();
}
