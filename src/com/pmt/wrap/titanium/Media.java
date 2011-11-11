package com.pmt.wrap.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Media</b>
 * <p>
 * The top level Media module.  The Media module is used accessing the device's media related  functionality such as playing audio or recording video.
 * <p>
 * <b>Platforms:</b> android iphone ipad 
 * <p>
 * <b>Since:</b> 0.1
 * <p>
 * <b>Type:</b> module
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> object
 */
public class Media {

	private JavaScriptObject handler;

	public Media(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>AUDIO_FILEFORMAT_3GP2</b> (int) static
	 * <p>
	 * audio file format 3GPP-2
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_FILEFORMAT_3GP2() /*-{
		return Titanium.Media.AUDIO_FILEFORMAT_3GP2;
	}-*/;

	/**
	 * <b>AUDIO_FILEFORMAT_3GPP</b> (int) static
	 * <p>
	 * audio file format 3GPP
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_FILEFORMAT_3GPP() /*-{
		return Titanium.Media.AUDIO_FILEFORMAT_3GPP;
	}-*/;

	/**
	 * <b>AUDIO_FILEFORMAT_AIFF</b> (int) static
	 * <p>
	 * audio file format AIFF
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_FILEFORMAT_AIFF() /*-{
		return Titanium.Media.AUDIO_FILEFORMAT_AIFF;
	}-*/;

	/**
	 * <b>AUDIO_FILEFORMAT_AMR</b> (int) static
	 * <p>
	 * audio file format AMR
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_FILEFORMAT_AMR() /*-{
		return Titanium.Media.AUDIO_FILEFORMAT_AMR;
	}-*/;

	/**
	 * <b>AUDIO_FILEFORMAT_CAF</b> (int) static
	 * <p>
	 * audio file format Apple Compressed Audio Format (CAF)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_FILEFORMAT_CAF() /*-{
		return Titanium.Media.AUDIO_FILEFORMAT_CAF;
	}-*/;

	/**
	 * <b>AUDIO_FILEFORMAT_MP3</b> (int) static
	 * <p>
	 * audio file format MP3
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_FILEFORMAT_MP3() /*-{
		return Titanium.Media.AUDIO_FILEFORMAT_MP3;
	}-*/;

	/**
	 * <b>AUDIO_FILEFORMAT_MP4</b> (int) static
	 * <p>
	 * audio file format MP4
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_FILEFORMAT_MP4() /*-{
		return Titanium.Media.AUDIO_FILEFORMAT_MP4;
	}-*/;

	/**
	 * <b>AUDIO_FILEFORMAT_MP4A</b> (int) static
	 * <p>
	 * audio file format MP4A
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_FILEFORMAT_MP4A() /*-{
		return Titanium.Media.AUDIO_FILEFORMAT_MP4A;
	}-*/;

	/**
	 * <b>AUDIO_FILEFORMAT_WAVE</b> (int) static
	 * <p>
	 * audio file format WAVE
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_FILEFORMAT_WAVE() /*-{
		return Titanium.Media.AUDIO_FILEFORMAT_WAVE;
	}-*/;

	/**
	 * <b>AUDIO_FORMAT_AAC</b> (int) static
	 * <p>
	 * audio format MPEG4 AAC encoding
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_FORMAT_AAC() /*-{
		return Titanium.Media.AUDIO_FORMAT_AAC;
	}-*/;

	/**
	 * <b>AUDIO_FORMAT_ALAW</b> (int) static
	 * <p>
	 * audio format 8-bit aLaw encoding
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_FORMAT_ALAW() /*-{
		return Titanium.Media.AUDIO_FORMAT_ALAW;
	}-*/;

	/**
	 * <b>AUDIO_FORMAT_APPLE_LOSSLESS</b> (int) static
	 * <p>
	 * audio format apple lossless encoding
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_FORMAT_APPLE_LOSSLESS() /*-{
		return Titanium.Media.AUDIO_FORMAT_APPLE_LOSSLESS;
	}-*/;

	/**
	 * <b>AUDIO_FORMAT_ILBC</b> (int) static
	 * <p>
	 * audio format iLBC encoding
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_FORMAT_ILBC() /*-{
		return Titanium.Media.AUDIO_FORMAT_ILBC;
	}-*/;

	/**
	 * <b>AUDIO_FORMAT_IMA4</b> (int) static
	 * <p>
	 * audio format Apple IMA4 encoding
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_FORMAT_IMA4() /*-{
		return Titanium.Media.AUDIO_FORMAT_IMA4;
	}-*/;

	/**
	 * <b>AUDIO_FORMAT_LINEAR_PCM</b> (int) static
	 * <p>
	 * audio format Linear 16-bit, PCM encoding
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_FORMAT_LINEAR_PCM() /*-{
		return Titanium.Media.AUDIO_FORMAT_LINEAR_PCM;
	}-*/;

	/**
	 * <b>AUDIO_FORMAT_ULAW</b> (int) static
	 * <p>
	 * audio format 8-bit muLaw encoding
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_FORMAT_ULAW() /*-{
		return Titanium.Media.AUDIO_FORMAT_ULAW;
	}-*/;

	/**
	 * <b>AUDIO_HEADPHONES</b> (int) static
	 * <p>
	 * constant for line type headphones
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_HEADPHONES() /*-{
		return Titanium.Media.AUDIO_HEADPHONES;
	}-*/;

	/**
	 * <b>AUDIO_HEADPHONES_AND_MIC</b> (int) static
	 * <p>
	 * constant line type headphones and microphone
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_HEADPHONES_AND_MIC() /*-{
		return Titanium.Media.AUDIO_HEADPHONES_AND_MIC;
	}-*/;

	/**
	 * <b>AUDIO_HEADSET_INOUT</b> (int) static
	 * <p>
	 * constant line type headset in/out
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_HEADSET_INOUT() /*-{
		return Titanium.Media.AUDIO_HEADSET_INOUT;
	}-*/;

	/**
	 * <b>AUDIO_LINEOUT</b> (int) static
	 * <p>
	 * constant line type line out
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_LINEOUT() /*-{
		return Titanium.Media.AUDIO_LINEOUT;
	}-*/;

	/**
	 * <b>AUDIO_MICROPHONE</b> (int) static
	 * <p>
	 * constant line type microphone
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_MICROPHONE() /*-{
		return Titanium.Media.AUDIO_MICROPHONE;
	}-*/;

	/**
	 * <b>AUDIO_MUTED</b> (int) static
	 * <p>
	 * constant line type muted switch is on
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_MUTED() /*-{
		return Titanium.Media.AUDIO_MUTED;
	}-*/;

	/**
	 * <b>AUDIO_RECEIVER_AND_MIC</b> (int) static
	 * <p>
	 * constant line type receiver and microphone
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_RECEIVER_AND_MIC() /*-{
		return Titanium.Media.AUDIO_RECEIVER_AND_MIC;
	}-*/;

	/**
	 * <b>AUDIO_SESSION_MODE_AMBIENT</b> (int) static
	 * <p>
	 * For long-duration sounds such as rain, car engine noise, and so on. It is also for 'play along' style applications, such a virtual piano that a user plays over iPod audio.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_SESSION_MODE_AMBIENT() /*-{
		return Titanium.Media.AUDIO_SESSION_MODE_AMBIENT;
	}-*/;

	/**
	 * <b>AUDIO_SESSION_MODE_PLAYBACK</b> (int) static
	 * <p>
	 * For playing recorded music or other sounds that are central to the successful use of your application. When using this mode, your application audio continues with the Ring/Silent switch set to silent or when the screen locks. This property normally disallows iPod audio to mix with application audio
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_SESSION_MODE_PLAYBACK() /*-{
		return Titanium.Media.AUDIO_SESSION_MODE_PLAYBACK;
	}-*/;

	/**
	 * <b>AUDIO_SESSION_MODE_PLAY_AND_RECORD</b> (int) static
	 * <p>
	 * Allows recording (input) and playback (output) of audio, such as for a VOIP (voice over IP) application. This category is appropriate for simultaneous recording and playback, and also for applications that record and play back but not simultaneously. If you want to ensure that sounds such as Messages alerts do not play while your application is recording, use  Titanium.Media.AUDIO_SESSION_MODE_RECORD instead. This category normally disallows iPod audio to mix with application audio.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_SESSION_MODE_PLAY_AND_RECORD() /*-{
		return Titanium.Media.AUDIO_SESSION_MODE_PLAY_AND_RECORD;
	}-*/;

	/**
	 * <b>AUDIO_SESSION_MODE_RECORD</b> (int) static
	 * <p>
	 * For recording audio; it silences playback audio.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_SESSION_MODE_RECORD() /*-{
		return Titanium.Media.AUDIO_SESSION_MODE_RECORD;
	}-*/;

	/**
	 * <b>AUDIO_SESSION_MODE_SOLO_AMBIENT</b> (int) static
	 * <p>
	 * The solo ambient sound category is for long-duration sounds such as rain, car engine noise, and so on. When you use this category, audio from built-in applications, such as the iPod, is silenced. Your audio is silenced when the Ring/Silent switch is set to silent or when the screen locks.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_SESSION_MODE_SOLO_AMBIENT() /*-{
		return Titanium.Media.AUDIO_SESSION_MODE_SOLO_AMBIENT;
	}-*/;

	/**
	 * <b>AUDIO_SPEAKER</b> (int) static
	 * <p>
	 * constant line type speaker
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_SPEAKER() /*-{
		return Titanium.Media.AUDIO_SPEAKER;
	}-*/;

	/**
	 * <b>AUDIO_UNAVAILABLE</b> (int) static
	 * <p>
	 * constant line type unavailable
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_UNAVAILABLE() /*-{
		return Titanium.Media.AUDIO_UNAVAILABLE;
	}-*/;

	/**
	 * <b>AUDIO_UNKNOWN</b> (int) static
	 * <p>
	 * constant line type unknown or not determined
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int AUDIO_UNKNOWN() /*-{
		return Titanium.Media.AUDIO_UNKNOWN;
	}-*/;

	/**
	 * <b>DEVICE_BUSY</b> (int) static
	 * <p>
	 * constant for media device busy error
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int DEVICE_BUSY() /*-{
		return Titanium.Media.DEVICE_BUSY;
	}-*/;

	/**
	 * <b>MEDIA_TYPE_PHOTO</b> (int) static
	 * <p>
	 * media type constant to signify photo
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int MEDIA_TYPE_PHOTO() /*-{
		return Titanium.Media.MEDIA_TYPE_PHOTO;
	}-*/;

	/**
	 * <b>MEDIA_TYPE_VIDEO</b> (int) static
	 * <p>
	 * media type constant to signify video
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int MEDIA_TYPE_VIDEO() /*-{
		return Titanium.Media.MEDIA_TYPE_VIDEO;
	}-*/;

	/**
	 * <b>MUSIC_MEDIA_TYPE_ALL</b> (int) static
	 * <p>
	 * media containing any content
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int MUSIC_MEDIA_TYPE_ALL() /*-{
		return Titanium.Media.MUSIC_MEDIA_TYPE_ALL;
	}-*/;

	/**
	 * <b>MUSIC_MEDIA_TYPE_ANY_AUDIO</b> (int) static
	 * <p>
	 * media containing any audio content
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int MUSIC_MEDIA_TYPE_ANY_AUDIO() /*-{
		return Titanium.Media.MUSIC_MEDIA_TYPE_ANY_AUDIO;
	}-*/;

	/**
	 * <b>MUSIC_MEDIA_TYPE_AUDIOBOOK</b> (int) static
	 * <p>
	 * media containing audiobook content
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int MUSIC_MEDIA_TYPE_AUDIOBOOK() /*-{
		return Titanium.Media.MUSIC_MEDIA_TYPE_AUDIOBOOK;
	}-*/;

	/**
	 * <b>MUSIC_MEDIA_TYPE_MUSIC</b> (int) static
	 * <p>
	 * media containing music content
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int MUSIC_MEDIA_TYPE_MUSIC() /*-{
		return Titanium.Media.MUSIC_MEDIA_TYPE_MUSIC;
	}-*/;

	/**
	 * <b>MUSIC_MEDIA_TYPE_PODCAST</b> (int) static
	 * <p>
	 * media containing podcast content
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int MUSIC_MEDIA_TYPE_PODCAST() /*-{
		return Titanium.Media.MUSIC_MEDIA_TYPE_PODCAST;
	}-*/;

	/**
	 * <b>MUSIC_PLAYER_REPEAT_ALL</b> (int) static
	 * <p>
	 * constant for repeating all setting
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int MUSIC_PLAYER_REPEAT_ALL() /*-{
		return Titanium.Media.MUSIC_PLAYER_REPEAT_ALL;
	}-*/;

	/**
	 * <b>MUSIC_PLAYER_REPEAT_DEFAULT</b> (int) static
	 * <p>
	 * constant for user default repeat setting
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int MUSIC_PLAYER_REPEAT_DEFAULT() /*-{
		return Titanium.Media.MUSIC_PLAYER_REPEAT_DEFAULT;
	}-*/;

	/**
	 * <b>MUSIC_PLAYER_REPEAT_NONE</b> (int) static
	 * <p>
	 * constant for no repeat setting
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int MUSIC_PLAYER_REPEAT_NONE() /*-{
		return Titanium.Media.MUSIC_PLAYER_REPEAT_NONE;
	}-*/;

	/**
	 * <b>MUSIC_PLAYER_REPEAT_ONE</b> (int) static
	 * <p>
	 * constant for repeating one item setting
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int MUSIC_PLAYER_REPEAT_ONE() /*-{
		return Titanium.Media.MUSIC_PLAYER_REPEAT_ONE;
	}-*/;

	/**
	 * <b>MUSIC_PLAYER_SHUFFLE_ALBUMS</b> (int) static
	 * <p>
	 * constant for shuffling complete albums setting
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int MUSIC_PLAYER_SHUFFLE_ALBUMS() /*-{
		return Titanium.Media.MUSIC_PLAYER_SHUFFLE_ALBUMS;
	}-*/;

	/**
	 * <b>MUSIC_PLAYER_SHUFFLE_DEFAULT</b> (int) static
	 * <p>
	 * constant for user default shuffle setting
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int MUSIC_PLAYER_SHUFFLE_DEFAULT() /*-{
		return Titanium.Media.MUSIC_PLAYER_SHUFFLE_DEFAULT;
	}-*/;

	/**
	 * <b>MUSIC_PLAYER_SHUFFLE_NONE</b> (int) static
	 * <p>
	 * constant for no shuffle setting
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int MUSIC_PLAYER_SHUFFLE_NONE() /*-{
		return Titanium.Media.MUSIC_PLAYER_SHUFFLE_NONE;
	}-*/;

	/**
	 * <b>MUSIC_PLAYER_SHUFFLE_SONGS</b> (int) static
	 * <p>
	 * constant for shuffling songs setting
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int MUSIC_PLAYER_SHUFFLE_SONGS() /*-{
		return Titanium.Media.MUSIC_PLAYER_SHUFFLE_SONGS;
	}-*/;

	/**
	 * <b>MUSIC_PLAYER_STATE_INTERRUPTED</b> (int) static
	 * <p>
	 * constant for interrupted state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int MUSIC_PLAYER_STATE_INTERRUPTED() /*-{
		return Titanium.Media.MUSIC_PLAYER_STATE_INTERRUPTED;
	}-*/;

	/**
	 * <b>MUSIC_PLAYER_STATE_PAUSED</b> (int) static
	 * <p>
	 * constant for paused state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int MUSIC_PLAYER_STATE_PAUSED() /*-{
		return Titanium.Media.MUSIC_PLAYER_STATE_PAUSED;
	}-*/;

	/**
	 * <b>MUSIC_PLAYER_STATE_PLAYING</b> (int) static
	 * <p>
	 * constant for playing state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int MUSIC_PLAYER_STATE_PLAYING() /*-{
		return Titanium.Media.MUSIC_PLAYER_STATE_PLAYING;
	}-*/;

	/**
	 * <b>MUSIC_PLAYER_STATE_SEEK_BACKWARD</b> (int) static
	 * <p>
	 * constant for backward seek state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int MUSIC_PLAYER_STATE_SEEK_BACKWARD() /*-{
		return Titanium.Media.MUSIC_PLAYER_STATE_SEEK_BACKWARD;
	}-*/;

	/**
	 * <b>MUSIC_PLAYER_STATE_SKEEK_FORWARD</b> (int) static
	 * <p>
	 * constant for forward seek state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int MUSIC_PLAYER_STATE_SKEEK_FORWARD() /*-{
		return Titanium.Media.MUSIC_PLAYER_STATE_SKEEK_FORWARD;
	}-*/;

	/**
	 * <b>MUSIC_PLAYER_STATE_STOPPED</b> (int) static
	 * <p>
	 * constant for stopped state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int MUSIC_PLAYER_STATE_STOPPED() /*-{
		return Titanium.Media.MUSIC_PLAYER_STATE_STOPPED;
	}-*/;

	/**
	 * <b>NO_CAMERA</b> (int) static
	 * <p>
	 * constant for media no camera error
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int NO_CAMERA() /*-{
		return Titanium.Media.NO_CAMERA;
	}-*/;

	/**
	 * <b>NO_VIDEO</b> (int) static
	 * <p>
	 * constant for media no video error
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int NO_VIDEO() /*-{
		return Titanium.Media.NO_VIDEO;
	}-*/;

	/**
	 * <b>QUALITY_HIGH</b> (int) static
	 * <p>
	 * media type constant to use high-quality video recording. Recorded files are suitable for on-device playback and for wired transfer to the Desktop using Image Capture; they are likely to be too large for transfer using Wi-Fi.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int QUALITY_HIGH() /*-{
		return Titanium.Media.QUALITY_HIGH;
	}-*/;

	/**
	 * <b>QUALITY_LOW</b> (int) static
	 * <p>
	 * media type constant to use use low-quality video recording. Recorded files can usually be transferred over the cellular network.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int QUALITY_LOW() /*-{
		return Titanium.Media.QUALITY_LOW;
	}-*/;

	/**
	 * <b>QUALITY_MEDIUM</b> (int) static
	 * <p>
	 * media type constant to use medium-quality video recording. Recorded files can usually be transferred using Wi-Fi. This is the default video quality setting.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int QUALITY_MEDIUM() /*-{
		return Titanium.Media.QUALITY_MEDIUM;
	}-*/;

	/**
	 * <b>UNKNOWN_ERROR</b> (int) static
	 * <p>
	 * constant for unknown media error
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int UNKNOWN_ERROR() /*-{
		return Titanium.Media.UNKNOWN_ERROR;
	}-*/;

	/**
	 * <b>VIDEO_CONTROL_DEFAULT</b> (int) static
	 * <p>
	 * constant for video controls default
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_CONTROL_DEFAULT() /*-{
		return Titanium.Media.VIDEO_CONTROL_DEFAULT;
	}-*/;

	/**
	 * <b>VIDEO_CONTROL_EMBEDDED</b> (int) static
	 * <p>
	 * Controls for an embedded view. Used in conjunction with movieControlStyle property of Titanium.Media.VideoPlayer in iPhone 3.2+
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_CONTROL_EMBEDDED() /*-{
		return Titanium.Media.VIDEO_CONTROL_EMBEDDED;
	}-*/;

	/**
	 * <b>VIDEO_CONTROL_FULLSCREEN</b> (int) static
	 * <p>
	 * Controls for fullscreen. Used in conjunction with movieControlStyle property of Titanium.Media.VideoPlayer in iPhone 3.2+
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_CONTROL_FULLSCREEN() /*-{
		return Titanium.Media.VIDEO_CONTROL_FULLSCREEN;
	}-*/;

	/**
	 * <b>VIDEO_CONTROL_HIDDEN</b> (int) static
	 * <p>
	 * constant for video controls hidden
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_CONTROL_HIDDEN() /*-{
		return Titanium.Media.VIDEO_CONTROL_HIDDEN;
	}-*/;

	/**
	 * <b>VIDEO_CONTROL_NONE</b> (int) static
	 * <p>
	 * No controls. Used in conjunction with movieControlStyle property of Titanium.Media.VideoPlayer in iPhone 3.2+
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_CONTROL_NONE() /*-{
		return Titanium.Media.VIDEO_CONTROL_NONE;
	}-*/;

	/**
	 * <b>VIDEO_CONTROL_VOLUME_ONLY</b> (int) static
	 * <p>
	 * constant for video controls volume only
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_CONTROL_VOLUME_ONLY() /*-{
		return Titanium.Media.VIDEO_CONTROL_VOLUME_ONLY;
	}-*/;

	/**
	 * <b>VIDEO_FINISH_REASON_PLAYBACK_ENDED</b> (int) static
	 * <p>
	 * the video playback ended normally
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_FINISH_REASON_PLAYBACK_ENDED() /*-{
		return Titanium.Media.VIDEO_FINISH_REASON_PLAYBACK_ENDED;
	}-*/;

	/**
	 * <b>VIDEO_FINISH_REASON_PLAYBACK_ERROR</b> (int) static
	 * <p>
	 * the video playback ended abnormally
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_FINISH_REASON_PLAYBACK_ERROR() /*-{
		return Titanium.Media.VIDEO_FINISH_REASON_PLAYBACK_ERROR;
	}-*/;

	/**
	 * <b>VIDEO_FINISH_REASON_USER_EXITED</b> (int) static
	 * <p>
	 * the video playback ended by user action (such as clicking the Done button)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_FINISH_REASON_USER_EXITED() /*-{
		return Titanium.Media.VIDEO_FINISH_REASON_USER_EXITED;
	}-*/;

	/**
	 * <b>VIDEO_LOAD_STATE_PLAYABLE</b> (int) static
	 * <p>
	 * the current media is playable
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_LOAD_STATE_PLAYABLE() /*-{
		return Titanium.Media.VIDEO_LOAD_STATE_PLAYABLE;
	}-*/;

	/**
	 * <b>VIDEO_LOAD_STATE_PLAYTHROUGH_OK</b> (int) static
	 * <p>
	 * playback will be automatically started in this state when autoplay is true
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_LOAD_STATE_PLAYTHROUGH_OK() /*-{
		return Titanium.Media.VIDEO_LOAD_STATE_PLAYTHROUGH_OK;
	}-*/;

	/**
	 * <b>VIDEO_LOAD_STATE_STALLED</b> (int) static
	 * <p>
	 * playback will be automatically paused in this state, if started
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_LOAD_STATE_STALLED() /*-{
		return Titanium.Media.VIDEO_LOAD_STATE_STALLED;
	}-*/;

	/**
	 * <b>VIDEO_LOAD_STATE_UNKNOWN</b> (int) static
	 * <p>
	 * the current load state is not known
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_LOAD_STATE_UNKNOWN() /*-{
		return Titanium.Media.VIDEO_LOAD_STATE_UNKNOWN;
	}-*/;

	/**
	 * <b>VIDEO_MEDIA_TYPE_AUDIO</b> (int) static
	 * <p>
	 * A audio type of media in the movie returned by Titanium.Media.VideoPlayer mediaTypes property
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_MEDIA_TYPE_AUDIO() /*-{
		return Titanium.Media.VIDEO_MEDIA_TYPE_AUDIO;
	}-*/;

	/**
	 * <b>VIDEO_MEDIA_TYPE_NONE</b> (int) static
	 * <p>
	 * An unknown type of media in the movie returned by Titanium.Media.VideoPlayer mediaTypes property.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_MEDIA_TYPE_NONE() /*-{
		return Titanium.Media.VIDEO_MEDIA_TYPE_NONE;
	}-*/;

	/**
	 * <b>VIDEO_MEDIA_TYPE_VIDEO</b> (int) static
	 * <p>
	 * A video type of media in the movie returned by Titanium.Media.VideoPlayer mediaTypes property
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_MEDIA_TYPE_VIDEO() /*-{
		return Titanium.Media.VIDEO_MEDIA_TYPE_VIDEO;
	}-*/;

	/**
	 * <b>VIDEO_PLAYBACK_STATE_INTERRUPTED</b> (int) static
	 * <p>
	 * playback has been interrupted
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_PLAYBACK_STATE_INTERRUPTED() /*-{
		return Titanium.Media.VIDEO_PLAYBACK_STATE_INTERRUPTED;
	}-*/;

	/**
	 * <b>VIDEO_PLAYBACK_STATE_PAUSED</b> (int) static
	 * <p>
	 * playback is paused
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_PLAYBACK_STATE_PAUSED() /*-{
		return Titanium.Media.VIDEO_PLAYBACK_STATE_PAUSED;
	}-*/;

	/**
	 * <b>VIDEO_PLAYBACK_STATE_PLAYING</b> (int) static
	 * <p>
	 * playback is playing
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_PLAYBACK_STATE_PLAYING() /*-{
		return Titanium.Media.VIDEO_PLAYBACK_STATE_PLAYING;
	}-*/;

	/**
	 * <b>VIDEO_PLAYBACK_STATE_SEEKING_BACKWARD</b> (int) static
	 * <p>
	 * playback is rewinding
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_PLAYBACK_STATE_SEEKING_BACKWARD() /*-{
		return Titanium.Media.VIDEO_PLAYBACK_STATE_SEEKING_BACKWARD;
	}-*/;

	/**
	 * <b>VIDEO_PLAYBACK_STATE_SEEKING_FORWARD</b> (int) static
	 * <p>
	 * playback is seeking forward
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_PLAYBACK_STATE_SEEKING_FORWARD() /*-{
		return Titanium.Media.VIDEO_PLAYBACK_STATE_SEEKING_FORWARD;
	}-*/;

	/**
	 * <b>VIDEO_PLAYBACK_STATE_STOPPED</b> (int) static
	 * <p>
	 * playback has stopped
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_PLAYBACK_STATE_STOPPED() /*-{
		return Titanium.Media.VIDEO_PLAYBACK_STATE_STOPPED;
	}-*/;

	/**
	 * <b>VIDEO_REPEAT_MODE_NONE</b> (int) static
	 * <p>
	 * the video will not repeat
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_REPEAT_MODE_NONE() /*-{
		return Titanium.Media.VIDEO_REPEAT_MODE_NONE;
	}-*/;

	/**
	 * <b>VIDEO_REPEAT_MODE_ONE</b> (int) static
	 * <p>
	 * the video will repeat once
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_REPEAT_MODE_ONE() /*-{
		return Titanium.Media.VIDEO_REPEAT_MODE_ONE;
	}-*/;

	/**
	 * <b>VIDEO_SCALING_ASPECT_FILL</b> (int) static
	 * <p>
	 * constant for video aspect where the movie will be scaled until the movie fills the entire screen. Content at the edges of the larger of the two dimensions is clipped so that the other dimension fits the screen exactly. The aspect ratio of the movie is preserved.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_SCALING_ASPECT_FILL() /*-{
		return Titanium.Media.VIDEO_SCALING_ASPECT_FILL;
	}-*/;

	/**
	 * <b>VIDEO_SCALING_ASPECT_FIT</b> (int) static
	 * <p>
	 * constant for video aspect fit where the movie will be scaled until one dimension fits on the screen exactly. In the other dimension, the region between the edge of the movie and the edge of the screen is filled with a black bar. The aspect ratio of the movie is preserved.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_SCALING_ASPECT_FIT() /*-{
		return Titanium.Media.VIDEO_SCALING_ASPECT_FIT;
	}-*/;

	/**
	 * <b>VIDEO_SCALING_MODE_FILL</b> (int) static
	 * <p>
	 * constant for video aspect where the movie will be scaled until both dimensions fit the screen exactly. The aspect ratio of the movie is not preserved.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_SCALING_MODE_FILL() /*-{
		return Titanium.Media.VIDEO_SCALING_MODE_FILL;
	}-*/;

	/**
	 * <b>VIDEO_SCALING_NONE</b> (int) static
	 * <p>
	 * constant for video scaling where the scaling is turn off. The movie will not be scaled.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_SCALING_NONE() /*-{
		return Titanium.Media.VIDEO_SCALING_NONE;
	}-*/;

	/**
	 * <b>VIDEO_SOURCE_TYPE_FILE</b> (int) static
	 * <p>
	 * the video source type is a file. Related to the sourceType property of Titanium.Media.VideoPlayer
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_SOURCE_TYPE_FILE() /*-{
		return Titanium.Media.VIDEO_SOURCE_TYPE_FILE;
	}-*/;

	/**
	 * <b>VIDEO_SOURCE_TYPE_STREAMING</b> (int) static
	 * <p>
	 * the video source type is a remote stream. Related to the sourceType property of Titanium.Media.VideoPlayer
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_SOURCE_TYPE_STREAMING() /*-{
		return Titanium.Media.VIDEO_SOURCE_TYPE_STREAMING;
	}-*/;

	/**
	 * <b>VIDEO_SOURCE_TYPE_UNKNOWN</b> (int) static
	 * <p>
	 * the video source type is unknown. Related to the sourceType property of Titanium.Media.VideoPlayer
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_SOURCE_TYPE_UNKNOWN() /*-{
		return Titanium.Media.VIDEO_SOURCE_TYPE_UNKNOWN;
	}-*/;

	/**
	 * <b>VIDEO_TIME_OPTION_EXACT</b> (int) static
	 * <p>
	 * use the exact time
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_TIME_OPTION_EXACT() /*-{
		return Titanium.Media.VIDEO_TIME_OPTION_EXACT;
	}-*/;

	/**
	 * <b>VIDEO_TIME_OPTION_NEAREST_KEYFRAME</b> (int) static
	 * <p>
	 * use the closest keyframe in the time
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int VIDEO_TIME_OPTION_NEAREST_KEYFRAME() /*-{
		return Titanium.Media.VIDEO_TIME_OPTION_NEAREST_KEYFRAME;
	}-*/;

	/**
	 * <b>appMusicPlayer</b> (object) static
	 * <p>
	 * an instance of Titanium.Media.MusicPlayer representing the app-specific music player.  iPhone/iPad only
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native JavaScriptObject getAppMusicPlayer() /*-{
		return Titanium.Media.appMusicPlayer;
	}-*/;

	/**
	 * <b>appMusicPlayer</b> (object) static
	 * <p>
	 * an instance of Titanium.Media.MusicPlayer representing the app-specific music player.  iPhone/iPad only
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setAppMusicPlayer(JavaScriptObject appMusicPlayer) /*-{
		Titanium.Media.appMusicPlayer = appMusicPlayer;
	}-*/;

	/**
	 * <b>audioLineType</b> (int) static
	 * <p>
	 * returns the line type constant for the current line type
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int getAudioLineType() /*-{
		return Titanium.Media.audioLineType;
	}-*/;

	/**
	 * <b>audioLineType</b> (int) static
	 * <p>
	 * returns the line type constant for the current line type
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setAudioLineType(int audioLineType) /*-{
		Titanium.Media.audioLineType = audioLineType;
	}-*/;

	/**
	 * <b>audioPlaying</b> (boolean) static
	 * <p>
	 * returns true if the device is playing audio
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native boolean getAudioPlaying() /*-{
		return Titanium.Media.audioPlaying;
	}-*/;

	/**
	 * <b>audioPlaying</b> (boolean) static
	 * <p>
	 * returns true if the device is playing audio
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setAudioPlaying(boolean audioPlaying) /*-{
		Titanium.Media.audioPlaying = audioPlaying;
	}-*/;

	/**
	 * <b>audioSessionMode</b> (int) static
	 * <p>
	 * a constant for the audio session mode to be used. Must be set while the audio session is inactive (no sounds are playing, no listeners for audio properties on the Media module, but the iPod may be active).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native int getAudioSessionMode() /*-{
		return Titanium.Media.audioSessionMode;
	}-*/;

	/**
	 * <b>audioSessionMode</b> (int) static
	 * <p>
	 * a constant for the audio session mode to be used. Must be set while the audio session is inactive (no sounds are playing, no listeners for audio properties on the Media module, but the iPod may be active).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setAudioSessionMode(int audioSessionMode) /*-{
		Titanium.Media.audioSessionMode = audioSessionMode;
	}-*/;

	/**
	 * <b>availableCameraMediaTypes</b> (array) static
	 * <p>
	 * return an array of media type constants supported for the camera
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native JavaScriptObject getAvailableCameraMediaTypes() /*-{
		return Titanium.Media.availableCameraMediaTypes;
	}-*/;

	/**
	 * <b>availableCameraMediaTypes</b> (array) static
	 * <p>
	 * return an array of media type constants supported for the camera
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setAvailableCameraMediaTypes(JavaScriptObject availableCameraMediaTypes) /*-{
		Titanium.Media.availableCameraMediaTypes = availableCameraMediaTypes;
	}-*/;

	/**
	 * <b>availablePhotoGalleryMediaTypes</b> (array) static
	 * <p>
	 * return an array of media type constants supported for saving to the photo gallery
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native JavaScriptObject getAvailablePhotoGalleryMediaTypes() /*-{
		return Titanium.Media.availablePhotoGalleryMediaTypes;
	}-*/;

	/**
	 * <b>availablePhotoGalleryMediaTypes</b> (array) static
	 * <p>
	 * return an array of media type constants supported for saving to the photo gallery
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setAvailablePhotoGalleryMediaTypes(JavaScriptObject availablePhotoGalleryMediaTypes) /*-{
		Titanium.Media.availablePhotoGalleryMediaTypes = availablePhotoGalleryMediaTypes;
	}-*/;

	/**
	 * <b>availablePhotoMediaTypes</b> (array) static
	 * <p>
	 * return an array of media type constants supported for the photo
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native JavaScriptObject getAvailablePhotoMediaTypes() /*-{
		return Titanium.Media.availablePhotoMediaTypes;
	}-*/;

	/**
	 * <b>availablePhotoMediaTypes</b> (array) static
	 * <p>
	 * return an array of media type constants supported for the photo
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setAvailablePhotoMediaTypes(JavaScriptObject availablePhotoMediaTypes) /*-{
		Titanium.Media.availablePhotoMediaTypes = availablePhotoMediaTypes;
	}-*/;

	/**
	 * <b>averageMicrophonePower</b> (float) static
	 * <p>
	 * return the current average microphone level in dB or -1 if microphone monitoring is disabled
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native double getAverageMicrophonePower() /*-{
		return Titanium.Media.averageMicrophonePower;
	}-*/;

	/**
	 * <b>averageMicrophonePower</b> (float) static
	 * <p>
	 * return the current average microphone level in dB or -1 if microphone monitoring is disabled
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setAverageMicrophonePower(double averageMicrophonePower) /*-{
		Titanium.Media.averageMicrophonePower = averageMicrophonePower;
	}-*/;

	/**
	 * <b>canRecord</b> (boolean) static
	 * <p>
	 * returns true if the device has recording input device available
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native boolean getCanRecord() /*-{
		return Titanium.Media.canRecord;
	}-*/;

	/**
	 * <b>canRecord</b> (boolean) static
	 * <p>
	 * returns true if the device has recording input device available
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setCanRecord(boolean canRecord) /*-{
		Titanium.Media.canRecord = canRecord;
	}-*/;

	/**
	 * <b>isCameraSupported</b> (boolean) static
	 * <p>
	 * returns true if the device has camera support
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native boolean getIsCameraSupported() /*-{
		return Titanium.Media.isCameraSupported;
	}-*/;

	/**
	 * <b>isCameraSupported</b> (boolean) static
	 * <p>
	 * returns true if the device has camera support
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setIsCameraSupported(boolean isCameraSupported) /*-{
		Titanium.Media.isCameraSupported = isCameraSupported;
	}-*/;

	/**
	 * <b>peakMicrophonePower</b> (float) static
	 * <p>
	 * return the current microphone level peak power in dB or -1 if microphone monitoring is disabled
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native double getPeakMicrophonePower() /*-{
		return Titanium.Media.peakMicrophonePower;
	}-*/;

	/**
	 * <b>peakMicrophonePower</b> (float) static
	 * <p>
	 * return the current microphone level peak power in dB or -1 if microphone monitoring is disabled
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setPeakMicrophonePower(double peakMicrophonePower) /*-{
		Titanium.Media.peakMicrophonePower = peakMicrophonePower;
	}-*/;

	/**
	 * <b>systemMusicPlayer</b> (object) static
	 * <p>
	 * an instance of Titanium.Media.MusicPlayer representing the system-wide music player.  iPhone/iPad only
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native JavaScriptObject getSystemMusicPlayer() /*-{
		return Titanium.Media.systemMusicPlayer;
	}-*/;

	/**
	 * <b>systemMusicPlayer</b> (object) static
	 * <p>
	 * an instance of Titanium.Media.MusicPlayer representing the system-wide music player.  iPhone/iPad only
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setSystemMusicPlayer(JavaScriptObject systemMusicPlayer) /*-{
		Titanium.Media.systemMusicPlayer = systemMusicPlayer;
	}-*/;

	/**
	 * <b>volume</b> (float) static
	 * <p>
	 * the current volume of the playback device
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native double getVolume() /*-{
		return Titanium.Media.volume;
	}-*/;

	/**
	 * <b>volume</b> (float) static
	 * <p>
	 * the current volume of the playback device
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public static native void setVolume(double volume) /*-{
		Titanium.Media.volume = volume;
	}-*/;

	/**
	 * <b>addEventListener</b>
	 * <p>
	 * add an event listener for the instance to receive view triggered events
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public static native void addEventListener(String name, JavaScriptObject callback) /*-{
		return Titanium.Media.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>beep</b>
	 * <p>
	 * play a device beep notification
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return void
	 */
	 public static native void beep() /*-{
		return Titanium.Media.beep();
	}-*/;

	/**
	 * <b>createAudioPlayer</b>
	 * <p>
	 * create and return an instance of Titanium.Media.AudioPlayer
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param parameters (object) (optional) a dictionary object properties defined in <a href="Titanium.Media.AudioPlayer.html">Titanium.Media.AudioPlayer</a>
	 * @return object
	 */
	 public static native JavaScriptObject createAudioPlayer(JavaScriptObject parameters) /*-{
		return Titanium.Media.createAudioPlayer(parameters);
	}-*/;

	/**
	 * <b>createAudioRecorder</b>
	 * <p>
	 * create and return an instance of Titanium.Media.AudioRecorder
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param parameters (object) (optional) a dictionary object properties defined in <a href="Titanium.Media.AudioRecorder.html">Titanium.Media.AudioRecorder</a>
	 * @return object
	 */
	 public static native JavaScriptObject createAudioRecorder(JavaScriptObject parameters) /*-{
		return Titanium.Media.createAudioRecorder(parameters);
	}-*/;

	/**
	 * <b>createItem</b>
	 * <p>
	 * create and return an instance of Titanium.Media.Item
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param parameters (object) (optional) a dictionary object properties defined in <a href="Titanium.Media.Item.html">Titanium.Media.Item</a>
	 * @return object
	 */
	 public static native JavaScriptObject createItem(JavaScriptObject parameters) /*-{
		return Titanium.Media.createItem(parameters);
	}-*/;

	/**
	 * <b>createMusicPlayer</b>
	 * <p>
	 * create and return an instance of Titanium.Media.MusicPlayer
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param parameters (object) (optional) a dictionary object properties defined in <a href="Titanium.Media.MusicPlayer.html">Titanium.Media.MusicPlayer</a>
	 * @return object
	 */
	 public static native JavaScriptObject createMusicPlayer(JavaScriptObject parameters) /*-{
		return Titanium.Media.createMusicPlayer(parameters);
	}-*/;

	/**
	 * <b>createSound</b>
	 * <p>
	 * create and return an instance of Titanium.Media.Sound
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param parameters (object) (optional) a dictionary object properties defined in <a href="Titanium.Media.Sound.html">Titanium.Media.Sound</a>
	 * @return object
	 */
	 public static native JavaScriptObject createSound(JavaScriptObject parameters) /*-{
		return Titanium.Media.createSound(parameters);
	}-*/;

	/**
	 * <b>createVideoPlayer</b>
	 * <p>
	 * create and return an instance of Titanium.Media.VideoPlayer
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param parameters (object) (optional) a dictionary object properties defined in <a href="Titanium.Media.VideoPlayer.html">Titanium.Media.VideoPlayer</a>
	 * @return object
	 */
	 public static native JavaScriptObject createVideoPlayer(JavaScriptObject parameters) /*-{
		return Titanium.Media.createVideoPlayer(parameters);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public static native void fireEvent(String name, JavaScriptObject event) /*-{
		return Titanium.Media.fireEvent(name, event);
	}-*/;

	/**
	 * <b>hideCamera</b>
	 * <p>
	 * hide the device camera UI. this must be called after calling showCamera and only when autohide is set to false. this method will cause the media capture device be hidden.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return void
	 */
	 public static native void hideCamera() /*-{
		return Titanium.Media.hideCamera();
	}-*/;

	/**
	 * <b>hideMusicLibrary</b>
	 * <p>
	 * hide the music library.  This must be called after calling showMusicLibrary and only when autohide is set to false.  iPhone and iPad only.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return void
	 */
	 public static native void hideMusicLibrary() /*-{
		return Titanium.Media.hideMusicLibrary();
	}-*/;

	/**
	 * <b>isMediaTypeSupported</b>
	 * <p>
	 * return boolean to indicate if the media type is supported
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param media (string) media type as a string of either <tt>camera</tt>, <tt>photo</tt> or <tt>photogallery</tt>.
	 * @param type (string) the type of media to check
	 * @return boolean
	 */
	 public static native boolean isMediaTypeSupported(String media, String type) /*-{
		return Titanium.Media.isMediaTypeSupported(media, type);
	}-*/;

	/**
	 * <b>openPhotoGallery</b>
	 * <p>
	 * open the photo gallery picker
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param options (object) pass a dictionary with the following supported keys: <tt>success</tt> a function that will be called when the camera is completed, <tt>error</tt> a function that will be called upon receiving an error, <tt>cancel</tt> a function that will be called if the user presses the cancel button, <tt>autohide</tt> boolean if the camera should auto hide after the media capture is completed (defaults to true), <tt>animated</tt> boolean if the dialog should be animated (defaults to true) upon showing and hiding, <tt>saveToPhotoGallery</tt> boolean if the media should be saved to the photo gallery upon successful capture, <tt>allowEditing</tt> boolean if the media should be editable after capture in the UI interface, <tt>mediaTypes</tt> an array of media type constants supported by the capture device UI, <tt>showControls</tt> boolean to indicate if the built-in UI controls should be displayed, <tt>overlay</tt> view which is added as an overlay to the UI (on top), <tt>transform</tt> an transformation matrix that applies to the UI transform. For iPad, <tt>popoverView</tt> can be provided to position the photo gallery popover a specific view and <tt>arrowDirection</tt> can be provided to control the type of arrow and position of the gallery.
	 * @return void
	 */
	 public static native void openPhotoGallery(JavaScriptObject options) /*-{
		return Titanium.Media.openPhotoGallery(options);
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public static native void removeEventListener(String name, JavaScriptObject callback) /*-{
		return Titanium.Media.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>saveToPhotoGallery</b>
	 * <p>
	 * save media to photo gallery / camera roll
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param media (object) save the media passed to the cameras photo roll/media gallery. must be one of Blob object or File object or an error will be generated.
	 * @param callbacks (object) pass a dictionary with the following supported keys: <tt>success</tt> a function that will be called when the save succeeds, and <tt>error</tt> a function that will be called upon anreceiving an error
	 * @return void
	 */
	 public static native void saveToPhotoGallery(JavaScriptObject media, JavaScriptObject callbacks) /*-{
		return Titanium.Media.saveToPhotoGallery(media, callbacks);
	}-*/;

	/**
	 * <b>showCamera</b>
	 * <p>
	 * show the camera
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param options (object) pass a dictionary with the following supported keys: <tt>success</tt> a function that will be called when the camera is completed, <tt>error</tt> a function that will be called upon receiving an error, <tt>cancel</tt> a function that will be called if the user presses the cancel button, <tt>autohide</tt> boolean if the camera should auto hide after the media capture is completed (defaults to true), <tt>animated</tt> boolean if the dialog should be animated (defaults to true) upon showing and hiding, <tt>saveToPhotoGallery</tt> boolean if the media should be saved to the photo gallery upon successful capture, <tt>allowEditing</tt> boolean if the media should be editable after capture in the UI interface, <tt>mediaTypes</tt> an array of media type constants supported by the capture device UI, <tt>videoMaximumDuration</tt> float duration on how long in milliseconds to allow capture before completing, <tt>videoQuality</tt> constant to indicate the video quality during capture, <tt>showControls</tt> boolean to indicate if the built-in UI controls should be displayed, <tt>overlay</tt> view which is added as an overlay to the camera UI (on top), <tt>transform</tt> an transformation matrix that applies to the camera UI transform.
	 * @return void
	 */
	 public static native void showCamera(JavaScriptObject options) /*-{
		return Titanium.Media.showCamera(options);
	}-*/;

	/**
	 * <b>showMusicLibrary</b>
	 * <p>
	 * show the music library.  iPhone and iPad only.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param options (object) pass a dictionary with the following supported keys: <tt>success</tt> a function that will be called when the camera is completed, <tt>error</tt> a function that will be called upon receiving an error, <tt>cancel</tt> a function that will be called if the user presses the cancel button, <tt>autohide</tt> boolean if the library listing should auto hide after selection is completed (defaults to true), <tt>animated</tt> boolean if the dialog should be animated (defaults to true) upon showing and hiding, <tt>mediaTypes</tt> an array of media type constants defining selectable media (see MUSIC_MEDIA_TYPE_* properties below) as either an array or a bitwise-or single value, <tt>allowMultipleSelections</tt> boolean whether or not more than one media selection is allowed
	 * @return void
	 */
	 public static native void showMusicLibrary(JavaScriptObject options) /*-{
		return Titanium.Media.showMusicLibrary(options);
	}-*/;

	/**
	 * <b>startMicrophoneMonitor</b>
	 * <p>
	 * start the monitoring of microphone sound level
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return void
	 */
	 public static native void startMicrophoneMonitor() /*-{
		return Titanium.Media.startMicrophoneMonitor();
	}-*/;

	/**
	 * <b>stopMicrophoneMonitor</b>
	 * <p>
	 * stop the monitoring of microphone sound level
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return void
	 */
	 public static native void stopMicrophoneMonitor() /*-{
		return Titanium.Media.stopMicrophoneMonitor();
	}-*/;

	/**
	 * <b>takePicture</b>
	 * <p>
	 * use the device camera to capture a photo. this must be called after calling showCamera and only when autohide is set to false. this method will cause the media capture device to capture a photo and call the success callback.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return void
	 */
	 public static native void takePicture() /*-{
		return Titanium.Media.takePicture();
	}-*/;

	/**
	 * <b>takeScreenshot</b>
	 * <p>
	 * take a screen shot of the visible UI on the device
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param callback (function) function that will be called upon capture. the event property <tt>media</tt> will contain an image Blob object of the screenshot
	 * @return void
	 */
	 public static native void takeScreenshot(JavaScriptObject callback) /*-{
		return Titanium.Media.takeScreenshot(callback);
	}-*/;

	/**
	 * <b>vibrate</b>
	 * <p>
	 * play a device vibration
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return void
	 */
	 public static native void vibrate() /*-{
		return Titanium.Media.vibrate();
	}-*/;

	/**
	 * <b>linechange</b>
	 * <p>
	 * fired when a audio line type change is detected
	 */
	public interface LinechangeHandler {
		/**
		 * <b>linechange</b>
		 * <p>
		 * fired when a audio line type change is detected
		 * @param source the source object that fired the event
		 * @param type the name of the event fired
		 */
		void linechange(JavaScriptObject source, JavaScriptObject type);
	}

	/**
	 * <b>linechange</b>
	 * <p>
	 * fired when a audio line type change is detected
	 * @param linechange event handler
	 */
	public native void addLinechange(LinechangeHandler linechange) /*-{
		this.@com.pmt.wrap.titanium.Media::handler.addEventListener('linechange', function(source, type) {
			linechange.@com.pmt.wrap.titanium.Media.LinechangeHandler::linechange(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type);
		});
	}-*/;

	/**
	 * <b>recordinginput</b>
	 * <p>
	 * fired when availablity of recording input changes
	 */
	public interface RecordinginputHandler {
		/**
		 * <b>recordinginput</b>
		 * <p>
		 * fired when availablity of recording input changes
		 * @param source the source object that fired the event
		 * @param available bool indicating availability of recording device
		 * @param type the name of the event fired
		 */
		void recordinginput(JavaScriptObject source, JavaScriptObject available, JavaScriptObject type);
	}

	/**
	 * <b>recordinginput</b>
	 * <p>
	 * fired when availablity of recording input changes
	 * @param recordinginput event handler
	 */
	public native void addRecordinginput(RecordinginputHandler recordinginput) /*-{
		this.@com.pmt.wrap.titanium.Media::handler.addEventListener('recordinginput', function(source, available, type) {
			recordinginput.@com.pmt.wrap.titanium.Media.RecordinginputHandler::recordinginput(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, available, type);
		});
	}-*/;

	/**
	 * <b>volume</b>
	 * <p>
	 * fired when the volume output changes
	 */
	public interface VolumeHandler {
		/**
		 * <b>volume</b>
		 * <p>
		 * fired when the volume output changes
		 * @param source the source object that fired the event
		 * @param volume float of the new volume in dB
		 * @param type the name of the event fired
		 */
		void volume(JavaScriptObject source, JavaScriptObject volume, JavaScriptObject type);
	}

	/**
	 * <b>volume</b>
	 * <p>
	 * fired when the volume output changes
	 * @param volume event handler
	 */
	public native void addVolume(VolumeHandler volume) /*-{
		this.@com.pmt.wrap.titanium.Media::handler.addEventListener('volume', function(source, volume, type) {
			volume.@com.pmt.wrap.titanium.Media.VolumeHandler::volume(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, volume, type);
		});
	}-*/;
}
