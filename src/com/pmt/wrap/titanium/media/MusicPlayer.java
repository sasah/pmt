package com.pmt.wrap.titanium.media;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Media.MusicPlayer</b>
 * <p>
 * The MusicPlayer instance returned from Titanium.Media.createMusicPlayer.  This object represents a music controller.
 * <p>
 * <b>Platforms:</b> iphone ipad 
 * <p>
 * <b>Since:</b> 1.4.0
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class MusicPlayer {

	private JavaScriptObject handler;

	public MusicPlayer(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>currentPlaybackTime</b> (double)
	 * <p>
	 * the current point in song playback
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native double getCurrentPlaybackTime() /*-{
		return this.@com.pmt.wrap.titanium.media.MusicPlayer::handler.currentPlaybackTime;
	}-*/;

	/**
	 * <b>currentPlaybackTime</b> (double)
	 * <p>
	 * the current point in song playback
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native void setCurrentPlaybackTime(double currentPlaybackTime) /*-{
		this.@com.pmt.wrap.titanium.media.MusicPlayer::handler.currentPlaybackTime = currentPlaybackTime;
	}-*/;

	/**
	 * <b>nowPlaying</b> (object)
	 * <p>
	 * an Item object which indicates the currently playing media
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native JavaScriptObject getNowPlaying() /*-{
		return this.@com.pmt.wrap.titanium.media.MusicPlayer::handler.nowPlaying;
	}-*/;

	/**
	 * <b>nowPlaying</b> (object)
	 * <p>
	 * an Item object which indicates the currently playing media
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native void setNowPlaying(JavaScriptObject nowPlaying) /*-{
		this.@com.pmt.wrap.titanium.media.MusicPlayer::handler.nowPlaying = nowPlaying;
	}-*/;

	/**
	 * <b>playbackState</b> (int)
	 * <p>
	 * the playback state; one of Titanium.Media.MUSIC_PLAYER_STATE_STOPPED, Titanium.Media.MUSIC_PLAYER_STATE_PLAYING, Titanium.Media.MUSIC_PLAYER_STATE_PAUSED, Titanium.Media.MUSIC_PLAYER_STATE_INTERRUPTED, Titanium.Media.MUSIC_PLAYER_STATE_SKEEK_FORWARD, Titanium.Media.MUSIC_PLAYER_STATE_SEEK_BACKWARD
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native int getPlaybackState() /*-{
		return this.@com.pmt.wrap.titanium.media.MusicPlayer::handler.playbackState;
	}-*/;

	/**
	 * <b>playbackState</b> (int)
	 * <p>
	 * the playback state; one of Titanium.Media.MUSIC_PLAYER_STATE_STOPPED, Titanium.Media.MUSIC_PLAYER_STATE_PLAYING, Titanium.Media.MUSIC_PLAYER_STATE_PAUSED, Titanium.Media.MUSIC_PLAYER_STATE_INTERRUPTED, Titanium.Media.MUSIC_PLAYER_STATE_SKEEK_FORWARD, Titanium.Media.MUSIC_PLAYER_STATE_SEEK_BACKWARD
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native void setPlaybackState(int playbackState) /*-{
		this.@com.pmt.wrap.titanium.media.MusicPlayer::handler.playbackState = playbackState;
	}-*/;

	/**
	 * <b>repeatMode</b> (int)
	 * <p>
	 * the repeat setting; one of Titanium.Media.MUSIC_PLAYER_REPEAT_DEFAULT, Titanium.Media.MUSIC_PLAYER_REPEAT_NONE, Titanium.Media.MUSIC_PLAYER_REPEAT_ONE, Titanium.Media.MUSIC_PLAYER_REPEAT_ALL
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native int getRepeatMode() /*-{
		return this.@com.pmt.wrap.titanium.media.MusicPlayer::handler.repeatMode;
	}-*/;

	/**
	 * <b>repeatMode</b> (int)
	 * <p>
	 * the repeat setting; one of Titanium.Media.MUSIC_PLAYER_REPEAT_DEFAULT, Titanium.Media.MUSIC_PLAYER_REPEAT_NONE, Titanium.Media.MUSIC_PLAYER_REPEAT_ONE, Titanium.Media.MUSIC_PLAYER_REPEAT_ALL
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native void setRepeatMode(int repeatMode) /*-{
		this.@com.pmt.wrap.titanium.media.MusicPlayer::handler.repeatMode = repeatMode;
	}-*/;

	/**
	 * <b>shuffleMode</b> (int)
	 * <p>
	 * the shuffle setting; one of Titanium.Media.MUSIC_PLAYER_SHUFFLE_DEFAULT, Titanium.Media.MUSIC_PLAYER_SHUFFLE_NONE, Titanium.Media.MUSIC_PLAYER_SHUFFLE_SONGS, Titanium.Media.MUSIC_PLAYER_SHUFFLE_ALBUMS
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native int getShuffleMode() /*-{
		return this.@com.pmt.wrap.titanium.media.MusicPlayer::handler.shuffleMode;
	}-*/;

	/**
	 * <b>shuffleMode</b> (int)
	 * <p>
	 * the shuffle setting; one of Titanium.Media.MUSIC_PLAYER_SHUFFLE_DEFAULT, Titanium.Media.MUSIC_PLAYER_SHUFFLE_NONE, Titanium.Media.MUSIC_PLAYER_SHUFFLE_SONGS, Titanium.Media.MUSIC_PLAYER_SHUFFLE_ALBUMS
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native void setShuffleMode(int shuffleMode) /*-{
		this.@com.pmt.wrap.titanium.media.MusicPlayer::handler.shuffleMode = shuffleMode;
	}-*/;

	/**
	 * <b>volume</b> (float)
	 * <p>
	 * a value between 0.0 and 1.0 indicating the volume level for the music player
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native double getVolume() /*-{
		return this.@com.pmt.wrap.titanium.media.MusicPlayer::handler.volume;
	}-*/;

	/**
	 * <b>volume</b> (float)
	 * <p>
	 * a value between 0.0 and 1.0 indicating the volume level for the music player
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native void setVolume(double volume) /*-{
		this.@com.pmt.wrap.titanium.media.MusicPlayer::handler.volume = volume;
	}-*/;

	/**
	 * <b>pause</b>
	 * <p>
	 * pause playback
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 * @return void
	 */
	 public native void pause() /*-{
		return this.@com.pmt.wrap.titanium.media.MusicPlayer::handler.pause();
	}-*/;

	/**
	 * <b>play</b>
	 * <p>
	 * begin playback
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 * @return void
	 */
	 public native void play() /*-{
		return this.@com.pmt.wrap.titanium.media.MusicPlayer::handler.play();
	}-*/;

	/**
	 * <b>seekBackward</b>
	 * <p>
	 * seek backward in the currently playing media
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 * @return void
	 */
	 public native void seekBackward() /*-{
		return this.@com.pmt.wrap.titanium.media.MusicPlayer::handler.seekBackward();
	}-*/;

	/**
	 * <b>seekForward</b>
	 * <p>
	 * seek forward in the currently playing media
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 * @return void
	 */
	 public native void seekForward() /*-{
		return this.@com.pmt.wrap.titanium.media.MusicPlayer::handler.seekForward();
	}-*/;

	/**
	 * <b>setQueue</b>
	 * <p>
	 * set the media queue
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 * @param queue (object) a queue representation to set the player queue to.  Can be any of: A dictionary with an <tt>items</tt> key that is an array of <a href="Titanium.Media.Item-object.html">Titanium.Media.Item</a> objects, an array of <a href="Titanium.Media.Item-object.html">Titanium.Media.Item</a> objects, or a single <a href="Titanium.Media.Item-object.html">Titanium.Media.Item</a> object.
	 * @return void
	 */
	 public native void setQueue(JavaScriptObject queue) /*-{
		return this.@com.pmt.wrap.titanium.media.MusicPlayer::handler.setQueue(queue);
	}-*/;

	/**
	 * <b>skipToBeginning</b>
	 * <p>
	 * skip to the beginning of the currently playing media
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 * @return void
	 */
	 public native void skipToBeginning() /*-{
		return this.@com.pmt.wrap.titanium.media.MusicPlayer::handler.skipToBeginning();
	}-*/;

	/**
	 * <b>skipToNext</b>
	 * <p>
	 * skip to the next media in the queue
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 * @return void
	 */
	 public native void skipToNext() /*-{
		return this.@com.pmt.wrap.titanium.media.MusicPlayer::handler.skipToNext();
	}-*/;

	/**
	 * <b>skipToPrevious</b>
	 * <p>
	 * skip to the previous media in the queue
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 * @return void
	 */
	 public native void skipToPrevious() /*-{
		return this.@com.pmt.wrap.titanium.media.MusicPlayer::handler.skipToPrevious();
	}-*/;

	/**
	 * <b>stop</b>
	 * <p>
	 * stop playback
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 * @return void
	 */
	 public native void stop() /*-{
		return this.@com.pmt.wrap.titanium.media.MusicPlayer::handler.stop();
	}-*/;

	/**
	 * <b>stopSeeking</b>
	 * <p>
	 * end a seek operation
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 * @return void
	 */
	 public native void stopSeeking() /*-{
		return this.@com.pmt.wrap.titanium.media.MusicPlayer::handler.stopSeeking();
	}-*/;

	/**
	 * <b>playingChange</b>
	 * <p>
	 * the currently playing media changed
	 */
	public interface PlayingChangeHandler {
		/**
		 * <b>playingChange</b>
		 * <p>
		 * the currently playing media changed
		 * @param source the source object that fired the event
		 * @param type the name of the event fired
		 */
		void playingChange(JavaScriptObject source, JavaScriptObject type);
	}

	/**
	 * <b>playingChange</b>
	 * <p>
	 * the currently playing media changed
	 * @param playingChange event handler
	 */
	public native void addPlayingChange(PlayingChangeHandler playingChange) /*-{
		this.@com.pmt.wrap.titanium.media.MusicPlayer::handler.addEventListener('playingChange', function(source, type) {
			playingChange.@com.pmt.wrap.titanium.media.MusicPlayer.PlayingChangeHandler::playingChange(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type);
		});
	}-*/;

	/**
	 * <b>stateChange</b>
	 * <p>
	 * the playback state changed
	 */
	public interface StateChangeHandler {
		/**
		 * <b>stateChange</b>
		 * <p>
		 * the playback state changed
		 * @param source the source object that fired the event
		 * @param type the name of the event fired
		 */
		void stateChange(JavaScriptObject source, JavaScriptObject type);
	}

	/**
	 * <b>stateChange</b>
	 * <p>
	 * the playback state changed
	 * @param stateChange event handler
	 */
	public native void addStateChange(StateChangeHandler stateChange) /*-{
		this.@com.pmt.wrap.titanium.media.MusicPlayer::handler.addEventListener('stateChange', function(source, type) {
			stateChange.@com.pmt.wrap.titanium.media.MusicPlayer.StateChangeHandler::stateChange(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type);
		});
	}-*/;

	/**
	 * <b>volumeChange</b>
	 * <p>
	 * the volume changed
	 */
	public interface VolumeChangeHandler {
		/**
		 * <b>volumeChange</b>
		 * <p>
		 * the volume changed
		 * @param source the source object that fired the event
		 * @param type the name of the event fired
		 */
		void volumeChange(JavaScriptObject source, JavaScriptObject type);
	}

	/**
	 * <b>volumeChange</b>
	 * <p>
	 * the volume changed
	 * @param volumeChange event handler
	 */
	public native void addVolumeChange(VolumeChangeHandler volumeChange) /*-{
		this.@com.pmt.wrap.titanium.media.MusicPlayer::handler.addEventListener('volumeChange', function(source, type) {
			volumeChange.@com.pmt.wrap.titanium.media.MusicPlayer.VolumeChangeHandler::volumeChange(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type);
		});
	}-*/;
}
