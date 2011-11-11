package com.pmt.wrap.titanium.media;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Media.Sound</b>
 * <p>
 * The Sound object is returned by Titanium.Media.createSound and is useful for playing basic sounds. The Sound object loads the entire media resource in memory before playing.  If you need to support streaming, use the Titanium.Media.createAudioPlayer API.
 * <p>
 * <b>Platforms:</b> android iphone ipad 
 * <p>
 * <b>Since:</b> 0.8
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> proxy
 * <p>
 * <b>Returns:</b> null
 */
public class Sound {

	private JavaScriptObject handler;

	public Sound(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>allowBackground</b> (boolean)
	 * <p>
	 * boolean to indicate if audio should continue playing even if Activity is paused (Android only as of 1.3.0)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getAllowBackground() /*-{
		return this.@com.pmt.wrap.titanium.media.Sound::handler.allowBackground;
	}-*/;

	/**
	 * <b>allowBackground</b> (boolean)
	 * <p>
	 * boolean to indicate if audio should continue playing even if Activity is paused (Android only as of 1.3.0)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setAllowBackground(boolean allowBackground) /*-{
		this.@com.pmt.wrap.titanium.media.Sound::handler.allowBackground = allowBackground;
	}-*/;

	/**
	 * <b>duration</b> (float)
	 * <p>
	 * the duration of the audio.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getDuration() /*-{
		return this.@com.pmt.wrap.titanium.media.Sound::handler.duration;
	}-*/;

	/**
	 * <b>duration</b> (float)
	 * <p>
	 * the duration of the audio.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setDuration(double duration) /*-{
		this.@com.pmt.wrap.titanium.media.Sound::handler.duration = duration;
	}-*/;

	/**
	 * <b>looping</b> (boolean)
	 * <p>
	 * boolean to indicate if the audio should loop upon completion
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getLooping() /*-{
		return this.@com.pmt.wrap.titanium.media.Sound::handler.looping;
	}-*/;

	/**
	 * <b>looping</b> (boolean)
	 * <p>
	 * boolean to indicate if the audio should loop upon completion
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setLooping(boolean looping) /*-{
		this.@com.pmt.wrap.titanium.media.Sound::handler.looping = looping;
	}-*/;

	/**
	 * <b>paused</b> (boolean)
	 * <p>
	 * boolean to indicate if the audio is paused
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getPaused() /*-{
		return this.@com.pmt.wrap.titanium.media.Sound::handler.paused;
	}-*/;

	/**
	 * <b>paused</b> (boolean)
	 * <p>
	 * boolean to indicate if the audio is paused
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setPaused(boolean paused) /*-{
		this.@com.pmt.wrap.titanium.media.Sound::handler.paused = paused;
	}-*/;

	/**
	 * <b>playing</b> (boolean)
	 * <p>
	 * boolean to indicate if the audio is playing
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getPlaying() /*-{
		return this.@com.pmt.wrap.titanium.media.Sound::handler.playing;
	}-*/;

	/**
	 * <b>playing</b> (boolean)
	 * <p>
	 * boolean to indicate if the audio is playing
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setPlaying(boolean playing) /*-{
		this.@com.pmt.wrap.titanium.media.Sound::handler.playing = playing;
	}-*/;

	/**
	 * <b>time</b> (float)
	 * <p>
	 * the time position of the audio.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getTime() /*-{
		return this.@com.pmt.wrap.titanium.media.Sound::handler.time;
	}-*/;

	/**
	 * <b>time</b> (float)
	 * <p>
	 * the time position of the audio.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setTime(double time) /*-{
		this.@com.pmt.wrap.titanium.media.Sound::handler.time = time;
	}-*/;

	/**
	 * <b>url</b> (string)
	 * <p>
	 * url to the audio
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getUrl() /*-{
		return this.@com.pmt.wrap.titanium.media.Sound::handler.url;
	}-*/;

	/**
	 * <b>url</b> (string)
	 * <p>
	 * url to the audio
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setUrl(String url) /*-{
		this.@com.pmt.wrap.titanium.media.Sound::handler.url = url;
	}-*/;

	/**
	 * <b>volume</b> (float)
	 * <p>
	 * the volume of the audio. this volume only affects the media, not the device audio.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getVolume() /*-{
		return this.@com.pmt.wrap.titanium.media.Sound::handler.volume;
	}-*/;

	/**
	 * <b>volume</b> (float)
	 * <p>
	 * the volume of the audio. this volume only affects the media, not the device audio.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setVolume(double volume) /*-{
		this.@com.pmt.wrap.titanium.media.Sound::handler.volume = volume;
	}-*/;

	/**
	 * <b>addEventListener</b>
	 * <p>
	 * add an event listener for the instance to receive view triggered events
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public native void addEventListener(String name, JavaScriptObject callback) /*-{
		return this.@com.pmt.wrap.titanium.media.Sound::handler.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public native void fireEvent(String name, JavaScriptObject event) /*-{
		return this.@com.pmt.wrap.titanium.media.Sound::handler.fireEvent(name, event);
	}-*/;

	/**
	 * <b>getTime</b>
	 * <p>
	 * return the current time position of the audio
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @return double
	 */
	 public native double getTimeMethod() /*-{
		return this.@com.pmt.wrap.titanium.media.Sound::handler.getTimeMethod();
	}-*/;

	/**
	 * <b>getVolume</b>
	 * <p>
	 * return the value of the audio
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @return float
	 */
	 public native double getVolumeMethod() /*-{
		return this.@com.pmt.wrap.titanium.media.Sound::handler.getVolumeMethod();
	}-*/;

	/**
	 * <b>isLooping</b>
	 * <p>
	 * returns true if the audio will loop
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @return boolean
	 */
	 public native boolean isLooping() /*-{
		return this.@com.pmt.wrap.titanium.media.Sound::handler.isLooping();
	}-*/;

	/**
	 * <b>isPaused</b>
	 * <p>
	 * returns true if the audio is paused
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @return boolean
	 */
	 public native boolean isPaused() /*-{
		return this.@com.pmt.wrap.titanium.media.Sound::handler.isPaused();
	}-*/;

	/**
	 * <b>isPlaying</b>
	 * <p>
	 * returns true if the audio is playing
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @return boolean
	 */
	 public native boolean isPlaying() /*-{
		return this.@com.pmt.wrap.titanium.media.Sound::handler.isPlaying();
	}-*/;

	/**
	 * <b>pause</b>
	 * <p>
	 * temporarily pause the audio. to resume, invoke play.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @return void
	 */
	 public native void pause() /*-{
		return this.@com.pmt.wrap.titanium.media.Sound::handler.pause();
	}-*/;

	/**
	 * <b>play</b>
	 * <p>
	 * starting playing the source. if paused, will resume.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @return void
	 */
	 public native void play() /*-{
		return this.@com.pmt.wrap.titanium.media.Sound::handler.play();
	}-*/;

	/**
	 * <b>release</b>
	 * <p>
	 * release all internal resources. this is typically unnecessary but can be useful if you load a large audio file in app.js and play it only once and you would like to release all releases after your final play to reduce memory.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @return void
	 */
	 public native void release() /*-{
		return this.@com.pmt.wrap.titanium.media.Sound::handler.release();
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public native void removeEventListener(String name, JavaScriptObject callback) /*-{
		return this.@com.pmt.wrap.titanium.media.Sound::handler.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>reset</b>
	 * <p>
	 * reset the audio to the beginning.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @return void
	 */
	 public native void reset() /*-{
		return this.@com.pmt.wrap.titanium.media.Sound::handler.reset();
	}-*/;

	/**
	 * <b>setLooping</b>
	 * <p>
	 * control whether the audio should loop
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @return void
	 */
	 public native void setLoopingMethod() /*-{
		return this.@com.pmt.wrap.titanium.media.Sound::handler.setLoopingMethod();
	}-*/;

	/**
	 * <b>setPaused</b>
	 * <p>
	 * control whether the audio is paused
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @return void
	 */
	 public native void setPausedMethod() /*-{
		return this.@com.pmt.wrap.titanium.media.Sound::handler.setPausedMethod();
	}-*/;

	/**
	 * <b>setTime</b>
	 * <p>
	 * set the time position of the audio
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @return void
	 */
	 public native void setTimeMethod() /*-{
		return this.@com.pmt.wrap.titanium.media.Sound::handler.setTimeMethod();
	}-*/;

	/**
	 * <b>setVolume</b>
	 * <p>
	 * set the volume of the audio
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @return void
	 */
	 public native void setVolumeMethod() /*-{
		return this.@com.pmt.wrap.titanium.media.Sound::handler.setVolumeMethod();
	}-*/;

	/**
	 * <b>stop</b>
	 * <p>
	 * stop playing the audio and reset it to the beginning.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @return void
	 */
	 public native void stop() /*-{
		return this.@com.pmt.wrap.titanium.media.Sound::handler.stop();
	}-*/;
	

	/**
	 * <b>complete</b>
	 * <p>
	 * fired when the audio has completed
	 * @param complete event handler
	 */
	public native void addComplete(com.pmt.wrap.titanium.sys.events.TitaniumMediaSoundCompleteHandler complete) /*-{
		this.@com.pmt.wrap.titanium.media.Sound::handler.addEventListener('complete', function(source, type, success) {
			complete.@com.pmt.wrap.titanium.sys.events.TitaniumMediaSoundCompleteHandler::complete(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, success);
		});
	}-*/;
	

	/**
	 * <b>error</b>
	 * <p>
	 * called when an error is received playing the audio.
	 * @param error event handler
	 */
	public native void addError(com.pmt.wrap.titanium.sys.events.TitaniumMediaSoundErrorHandler error) /*-{
		this.@com.pmt.wrap.titanium.media.Sound::handler.addEventListener('error', function(message, source, type) {
			error.@com.pmt.wrap.titanium.sys.events.TitaniumMediaSoundErrorHandler::error(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(message, source, type);
		});
	}-*/;
	

	/**
	 * <b>interrupted</b>
	 * <p>
	 * called when the audio is interrupted by the device. this is typically called during an interruption due to an incoming phone call.
	 * @param interrupted event handler
	 */
	public native void addInterrupted(com.pmt.wrap.titanium.sys.events.TitaniumMediaSoundInterruptedHandler interrupted) /*-{
		this.@com.pmt.wrap.titanium.media.Sound::handler.addEventListener('interrupted', function(source, type) {
			interrupted.@com.pmt.wrap.titanium.sys.events.TitaniumMediaSoundInterruptedHandler::interrupted(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type);
		});
	}-*/;
	

	/**
	 * <b>resume</b>
	 * <p>
	 * called when the audio is resumed after an interruption.
	 * @param resume event handler
	 */
	public native void addResume(com.pmt.wrap.titanium.sys.events.TitaniumMediaSoundResumeHandler resume) /*-{
		this.@com.pmt.wrap.titanium.media.Sound::handler.addEventListener('resume', function(interruption, source, type) {
			resume.@com.pmt.wrap.titanium.sys.events.TitaniumMediaSoundResumeHandler::resume(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(interruption, source, type);
		});
	}-*/;
}
