package com.pmt.wrap.titanium.media;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Media.AudioRecorder</b>
 * <p>
 * The AudioRecorder object is returned by Titanium.Media.createAudioRecorder and is used for recording audio from the device microphone.
 * <p>
 * <b>Platforms:</b> iphone ipad 
 * <p>
 * <b>Since:</b> 0.9
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> proxy
 * <p>
 * <b>Returns:</b> null
 */
public class AudioRecorder {

	private JavaScriptObject handler;

	public AudioRecorder(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>compression</b> (int)
	 * <p>
	 * audio compression constant to be used for the recording
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public native int getCompression() /*-{
		return this.@com.pmt.wrap.titanium.media.AudioRecorder::handler.compression;
	}-*/;

	/**
	 * <b>compression</b> (int)
	 * <p>
	 * audio compression constant to be used for the recording
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setCompression(int compression) /*-{
		this.@com.pmt.wrap.titanium.media.AudioRecorder::handler.compression = compression;
	}-*/;

	/**
	 * <b>format</b> (int)
	 * <p>
	 * audio format constant for used for the recording
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public native int getFormat() /*-{
		return this.@com.pmt.wrap.titanium.media.AudioRecorder::handler.format;
	}-*/;

	/**
	 * <b>format</b> (int)
	 * <p>
	 * audio format constant for used for the recording
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setFormat(int format) /*-{
		this.@com.pmt.wrap.titanium.media.AudioRecorder::handler.format = format;
	}-*/;

	/**
	 * <b>paused</b> (boolean)
	 * <p>
	 * readonly property to indicate if paused
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getPaused() /*-{
		return this.@com.pmt.wrap.titanium.media.AudioRecorder::handler.paused;
	}-*/;

	/**
	 * <b>paused</b> (boolean)
	 * <p>
	 * readonly property to indicate if paused
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setPaused(boolean paused) /*-{
		this.@com.pmt.wrap.titanium.media.AudioRecorder::handler.paused = paused;
	}-*/;

	/**
	 * <b>recording</b> (boolean)
	 * <p>
	 * readonly property to indicate if recording
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getRecording() /*-{
		return this.@com.pmt.wrap.titanium.media.AudioRecorder::handler.recording;
	}-*/;

	/**
	 * <b>recording</b> (boolean)
	 * <p>
	 * readonly property to indicate if recording
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setRecording(boolean recording) /*-{
		this.@com.pmt.wrap.titanium.media.AudioRecorder::handler.recording = recording;
	}-*/;

	/**
	 * <b>stopped</b> (boolean)
	 * <p>
	 * readonly property to indicate if stopped
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getStopped() /*-{
		return this.@com.pmt.wrap.titanium.media.AudioRecorder::handler.stopped;
	}-*/;

	/**
	 * <b>stopped</b> (boolean)
	 * <p>
	 * readonly property to indicate if stopped
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setStopped(boolean stopped) /*-{
		this.@com.pmt.wrap.titanium.media.AudioRecorder::handler.stopped = stopped;
	}-*/;

	/**
	 * <b>addEventListener</b>
	 * <p>
	 * add an event listener for the instance to receive view triggered events
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public native void addEventListener(String name, JavaScriptObject callback) /*-{
		this.@com.pmt.wrap.titanium.media.AudioRecorder::handler.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public native void fireEvent(String name, JavaScriptObject event) /*-{
		this.@com.pmt.wrap.titanium.media.AudioRecorder::handler.fireEvent(name, event);
	}-*/;

	/**
	 * <b>pause</b>
	 * <p>
	 * called to temporarily pause recording
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 * @return void
	 */
	 public native void pause() /*-{
		this.@com.pmt.wrap.titanium.media.AudioRecorder::handler.pause();
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public native void removeEventListener(String name, JavaScriptObject callback) /*-{
		this.@com.pmt.wrap.titanium.media.AudioRecorder::handler.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>resume</b>
	 * <p>
	 * called to resume audio recording
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 * @return void
	 */
	 public native void resume() /*-{
		this.@com.pmt.wrap.titanium.media.AudioRecorder::handler.resume();
	}-*/;

	/**
	 * <b>start</b>
	 * <p>
	 * called to start recording audio
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 * @return void
	 */
	 public native void start() /*-{
		this.@com.pmt.wrap.titanium.media.AudioRecorder::handler.start();
	}-*/;

	/**
	 * <b>stop</b>
	 * <p>
	 * called to stop recording audio
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.9
	 * @return void
	 */
	 public native void stop() /*-{
		this.@com.pmt.wrap.titanium.media.AudioRecorder::handler.stop();
	}-*/;
}
