package com.pmt.wrap.titanium.media;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Media.AudioPlayer</b>
 * <p>
 * The AudioPlayer object is returned by Titanium.Media.createAudioPlayer and is used for streaming audio to the device and low-level control of the audio playback.
 * <p>
 * <b>Platforms:</b> android iphone ipad 
 * <p>
 * <b>Since:</b> 0.9
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> proxy
 * <p>
 * <b>Returns:</b> null
 */
public class AudioPlayer {

	private JavaScriptObject handler;

	public AudioPlayer(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>STATE_BUFFERING</b> (int) static
	 * <p>
	 * current playback is in the buffering from the network state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int STATE_BUFFERING() /*-{
		return Titanium.Media.AudioPlayer.STATE_BUFFERING;
	}-*/;

	/**
	 * <b>STATE_INITIALIZED</b> (int) static
	 * <p>
	 * current playback is in the initialization state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int STATE_INITIALIZED() /*-{
		return Titanium.Media.AudioPlayer.STATE_INITIALIZED;
	}-*/;

	/**
	 * <b>STATE_PAUSED</b> (int) static
	 * <p>
	 * current playback is in the paused state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int STATE_PAUSED() /*-{
		return Titanium.Media.AudioPlayer.STATE_PAUSED;
	}-*/;

	/**
	 * <b>STATE_PLAYING</b> (int) static
	 * <p>
	 * current playback is in the playing state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int STATE_PLAYING() /*-{
		return Titanium.Media.AudioPlayer.STATE_PLAYING;
	}-*/;

	/**
	 * <b>STATE_STARTING</b> (int) static
	 * <p>
	 * current playback is in the starting playback state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int STATE_STARTING() /*-{
		return Titanium.Media.AudioPlayer.STATE_STARTING;
	}-*/;

	/**
	 * <b>STATE_STOPPED</b> (int) static
	 * <p>
	 * current playback is in the stopped state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int STATE_STOPPED() /*-{
		return Titanium.Media.AudioPlayer.STATE_STOPPED;
	}-*/;

	/**
	 * <b>STATE_STOPPING</b> (int) static
	 * <p>
	 * current playback is in the stopping state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int STATE_STOPPING() /*-{
		return Titanium.Media.AudioPlayer.STATE_STOPPING;
	}-*/;

	/**
	 * <b>STATE_WAITING_FOR_DATA</b> (int) static
	 * <p>
	 * current playback is in the waiting for audio data from the network state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int STATE_WAITING_FOR_DATA() /*-{
		return Titanium.Media.AudioPlayer.STATE_WAITING_FOR_DATA;
	}-*/;

	/**
	 * <b>STATE_WAITING_FOR_QUEUE</b> (int) static
	 * <p>
	 * current playback is in the waiting for audio data to fill the queue state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public static native int STATE_WAITING_FOR_QUEUE() /*-{
		return Titanium.Media.AudioPlayer.STATE_WAITING_FOR_QUEUE;
	}-*/;

	/**
	 * <b>allowBackground</b> (boolean)
	 * <p>
	 * boolean to indicate if audio should continue playing even if Activity is paused (Android only as of 1.3.0)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getAllowBackground() /*-{
		return this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.allowBackground;
	}-*/;

	/**
	 * <b>allowBackground</b> (boolean)
	 * <p>
	 * boolean to indicate if audio should continue playing even if Activity is paused (Android only as of 1.3.0)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setAllowBackground(boolean allowBackground) /*-{
		this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.allowBackground = allowBackground;
	}-*/;

	/**
	 * <b>bitRate</b> (double)
	 * <p>
	 * bit rate of the current playback stream
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getBitRate() /*-{
		return this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.bitRate;
	}-*/;

	/**
	 * <b>bitRate</b> (double)
	 * <p>
	 * bit rate of the current playback stream
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBitRate(double bitRate) /*-{
		this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.bitRate = bitRate;
	}-*/;

	/**
	 * <b>bufferSize</b> (int)
	 * <p>
	 * the buffer size used for streaming, in bytes. iOS only.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native int getBufferSize() /*-{
		return this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.bufferSize;
	}-*/;

	/**
	 * <b>bufferSize</b> (int)
	 * <p>
	 * the buffer size used for streaming, in bytes. iOS only.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBufferSize(int bufferSize) /*-{
		this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.bufferSize = bufferSize;
	}-*/;

	/**
	 * <b>idle</b> (boolean)
	 * <p>
	 * returns boolean indicating if the playback is idle
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getIdle() /*-{
		return this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.idle;
	}-*/;

	/**
	 * <b>idle</b> (boolean)
	 * <p>
	 * returns boolean indicating if the playback is idle
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setIdle(boolean idle) /*-{
		this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.idle = idle;
	}-*/;

	/**
	 * <b>paused</b> (boolean)
	 * <p>
	 * returns boolean indicating if the playback is paused
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getPaused() /*-{
		return this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.paused;
	}-*/;

	/**
	 * <b>paused</b> (boolean)
	 * <p>
	 * returns boolean indicating if the playback is paused
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setPaused(boolean paused) /*-{
		this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.paused = paused;
	}-*/;

	/**
	 * <b>playing</b> (boolean)
	 * <p>
	 * returns boolean indicating if the playback is streaming audio
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getPlaying() /*-{
		return this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.playing;
	}-*/;

	/**
	 * <b>playing</b> (boolean)
	 * <p>
	 * returns boolean indicating if the playback is streaming audio
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setPlaying(boolean playing) /*-{
		this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.playing = playing;
	}-*/;

	/**
	 * <b>progress</b> (double)
	 * <p>
	 * returns the current playback progress. Will return zero if sampleRate has not yet been detected
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getProgress() /*-{
		return this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.progress;
	}-*/;

	/**
	 * <b>progress</b> (double)
	 * <p>
	 * returns the current playback progress. Will return zero if sampleRate has not yet been detected
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setProgress(double progress) /*-{
		this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.progress = progress;
	}-*/;

	/**
	 * <b>state</b> (int)
	 * <p>
	 * returns int for the current state of playback
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native int getState() /*-{
		return this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.state;
	}-*/;

	/**
	 * <b>state</b> (int)
	 * <p>
	 * returns int for the current state of playback
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setState(int state) /*-{
		this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.state = state;
	}-*/;

	/**
	 * <b>url</b> (string)
	 * <p>
	 * returns the url for the current playback
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getUrl() /*-{
		return this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.url;
	}-*/;

	/**
	 * <b>url</b> (string)
	 * <p>
	 * returns the url for the current playback
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setUrl(String url) /*-{
		this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.url = url;
	}-*/;

	/**
	 * <b>waiting</b> (boolean)
	 * <p>
	 * returns boolean indicating if the playback is waiting for audio data from the network
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getWaiting() /*-{
		return this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.waiting;
	}-*/;

	/**
	 * <b>waiting</b> (boolean)
	 * <p>
	 * returns boolean indicating if the playback is waiting for audio data from the network
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setWaiting(boolean waiting) /*-{
		this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.waiting = waiting;
	}-*/;

	/**
	 * <b>addEventListener</b>
	 * <p>
	 * add an event listener for the instance to receive view triggered events
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public native void addEventListener(String name, JavaScriptObject callback) /*-{
		return this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public native void fireEvent(String name, JavaScriptObject event) /*-{
		return this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.fireEvent(name, event);
	}-*/;

	/**
	 * <b>pause</b>
	 * <p>
	 * pause playback
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @return void
	 */
	 public native void pause() /*-{
		return this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.pause();
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public native void removeEventListener(String name, JavaScriptObject callback) /*-{
		return this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>setPaused</b>
	 * <p>
	 * control the playback of the audio
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param paused (boolean) pass true to pause the current playback temporarily, false to unpause it
	 * @return void
	 */
	 public native void setPausedMethod(boolean paused) /*-{
		return this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.setPausedMethod(paused);
	}-*/;

	/**
	 * <b>setUrl</b>
	 * <p>
	 * change the url of the audio playback
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param url (string) the new url
	 * @return void
	 */
	 public native void setUrlMethod(String url) /*-{
		return this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.setUrlMethod(url);
	}-*/;

	/**
	 * <b>start</b>
	 * <p>
	 * start playback
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @return void
	 */
	 public native void start() /*-{
		return this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.start();
	}-*/;

	/**
	 * <b>stateDescription</b>
	 * <p>
	 * convert a state into a textual description suitable for display
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @return string
	 */
	 public native String stateDescription() /*-{
		return this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.stateDescription();
	}-*/;

	/**
	 * <b>stop</b>
	 * <p>
	 * stop playback
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @return void
	 */
	 public native void stop() /*-{
		return this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.stop();
	}-*/;
	

	/**
	 * <b>change</b>
	 * <p>
	 * fired when the state of the playback changes
	 * @param change event handler
	 */
	public native void addChange(com.pmt.wrap.titanium.sys.events.TitaniumMediaAudioPlayerChangeHandler change) /*-{
		this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.addEventListener('change', function(source, description, state, type) {
			change.@com.pmt.wrap.titanium.sys.events.TitaniumMediaAudioPlayerChangeHandler::change(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, description, state, type);
		});
	}-*/;
	

	/**
	 * <b>progress</b>
	 * <p>
	 * fired once per second with the current progress during playback
	 * @param progress event handler
	 */
	public native void addProgress(com.pmt.wrap.titanium.sys.events.TitaniumMediaAudioPlayerProgressHandler progress) /*-{
		this.@com.pmt.wrap.titanium.media.AudioPlayer::handler.addEventListener('progress', function(progress, source, type) {
			progress.@com.pmt.wrap.titanium.sys.events.TitaniumMediaAudioPlayerProgressHandler::progress(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(progress, source, type);
		});
	}-*/;
}
