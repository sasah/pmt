package com.pmt.wrap.titanium.android;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Android.Service</b>
 * <p>
 * The Titanium binding of an Android Service.  Can be used to start/stop the service directly and listen for service-specific events.  In the Javascript-based services you write, this can be referenced with Titanium.Android.currentService.  You can create an instance of the service with Titanium.Android.createService.
 * <p>
 * <b>Platforms:</b> android 
 * <p>
 * <b>Since:</b> 1.5
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class Service {

	private JavaScriptObject handler;

	public Service(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>intent</b> (Titanium.Android.Intent)
	 * <p>
	 * (read-only) The Titanium.Android.Intent used to start or bind to the Service.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native JavaScriptObject getIntent() /*-{
		return this.@com.pmt.wrap.titanium.android.Service::handler.intent;
	}-*/;

	/**
	 * <b>intent</b> (Titanium.Android.Intent)
	 * <p>
	 * (read-only) The Titanium.Android.Intent used to start or bind to the Service.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setIntent(JavaScriptObject intent) /*-{
		this.@com.pmt.wrap.titanium.android.Service::handler.intent = intent;
	}-*/;

	/**
	 * <b>serviceInstanceId</b> (int)
	 * <p>
	 * (read-only) A service can be started more than once -- this number (based on an incrementing integer) indicates which "start number" in the sequence the current service instance is.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native int getServiceInstanceId() /*-{
		return this.@com.pmt.wrap.titanium.android.Service::handler.serviceInstanceId;
	}-*/;

	/**
	 * <b>serviceInstanceId</b> (int)
	 * <p>
	 * (read-only) A service can be started more than once -- this number (based on an incrementing integer) indicates which "start number" in the sequence the current service instance is.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 */
	public native void setServiceInstanceId(int serviceInstanceId) /*-{
		this.@com.pmt.wrap.titanium.android.Service::handler.serviceInstanceId = serviceInstanceId;
	}-*/;

	/**
	 * <b>start</b>
	 * <p>
	 * Start the Service.  Effective only if this instance of Titanium.Android.Service was created with Titanium.Android.createService.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @return void
	 */
	 public native void start() /*-{
		return this.@com.pmt.wrap.titanium.android.Service::handler.start();
	}-*/;

	/**
	 * <b>stop</b>
	 * <p>
	 * Stop this running instance of the Service.
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 1.5
	 * @return void
	 */
	 public native void stop() /*-{
		return this.@com.pmt.wrap.titanium.android.Service::handler.stop();
	}-*/;
	

	/**
	 * <b>pause</b>
	 * <p>
	 * For Javascript-based Services which you create, pause fires after each time the Javascript code executes.  resume and pause happen in pairs, with resume firing just before your Javascript service code executes, and pause just after.
	 * @param pause event handler
	 */
	public native void addPause(com.pmt.wrap.titanium.sys.events.TitaniumAndroidServicePauseHandler pause) /*-{
		this.@com.pmt.wrap.titanium.android.Service::handler.addEventListener('pause', function(source, type, iteration) {
			pause.@com.pmt.wrap.titanium.sys.events.TitaniumAndroidServicePauseHandler::pause(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, iteration);
		});
	}-*/;
	

	/**
	 * <b>resume</b>
	 * <p>
	 * For Javascript-based Services which you create, resume fires each time the Javascript code executes.  For example, if your Service runs on an interval of 10000 (10 seconds), you would expect to see resume fired every 10 seconds, just as the Javascript service code you wrote is about to execute.
	 * @param resume event handler
	 */
	public native void addResume(com.pmt.wrap.titanium.sys.events.TitaniumAndroidServiceResumeHandler resume) /*-{
		this.@com.pmt.wrap.titanium.android.Service::handler.addEventListener('resume', function(source, type, iteration) {
			resume.@com.pmt.wrap.titanium.sys.events.TitaniumAndroidServiceResumeHandler::resume(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, iteration);
		});
	}-*/;
	

	/**
	 * <b>start</b>
	 * <p>
	 * Fired when the bound Service instance starts.  Bound service instances are created via Titanium.Android.createService.
	 * @param start event handler
	 */
	public native void addStart(com.pmt.wrap.titanium.sys.events.TitaniumAndroidServiceStartHandler start) /*-{
		this.@com.pmt.wrap.titanium.android.Service::handler.addEventListener('start', function(source, type) {
			start.@com.pmt.wrap.titanium.sys.events.TitaniumAndroidServiceStartHandler::start(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type);
		});
	}-*/;
	

	/**
	 * <b>stop</b>
	 * <p>
	 * Fired when the bound Service instance stops, meaning Titanium.Android.Service.stop or Titanium.Android.stopService has been called and there are no more bound, un-stopped clients.
	 * @param stop event handler
	 */
	public native void addStop(com.pmt.wrap.titanium.sys.events.TitaniumAndroidServiceStopHandler stop) /*-{
		this.@com.pmt.wrap.titanium.android.Service::handler.addEventListener('stop', function(source, type) {
			stop.@com.pmt.wrap.titanium.sys.events.TitaniumAndroidServiceStopHandler::stop(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type);
		});
	}-*/;
}
