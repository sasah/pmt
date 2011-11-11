package com.pmt.wrap.titanium.media;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Media.VideoPlayer</b>
 * <p>
 * The VideoPlayer object is returned by Titanium.Media.createVideoPlayer and is useful for playing videos. 
 * <p>
 * <b>Platforms:</b> android iphone ipad 
 * <p>
 * <b>Since:</b> 0.9
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> view
 * <p>
 * <b>Returns:</b> null
 */
public class VideoPlayer {

	private JavaScriptObject handler;

	public VideoPlayer(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>allowsAirPlay</b> (boolean)
	 * <p>
	 * Whether or not the movie can be played on a remote device.  iOS 4.3+ only.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getAllowsAirPlay() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.allowsAirPlay;
	}-*/;

	/**
	 * <b>allowsAirPlay</b> (boolean)
	 * <p>
	 * Whether or not the movie can be played on a remote device.  iOS 4.3+ only.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setAllowsAirPlay(boolean allowsAirPlay) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.allowsAirPlay = allowsAirPlay;
	}-*/;

	/**
	 * <b>anchorPoint</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the anchor point value. anchor specifies the position by which animation should occur. center is 0.5, 0.5
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getAnchorPoint() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.anchorPoint;
	}-*/;

	/**
	 * <b>anchorPoint</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the anchor point value. anchor specifies the position by which animation should occur. center is 0.5, 0.5
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setAnchorPoint(JavaScriptObject anchorPoint) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.anchorPoint = anchorPoint;
	}-*/;

	/**
	 * <b>animatedCenterPoint</b> (object)
	 * <p>
	 * read-only object with x and y properties of where the view is during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getAnimatedCenterPoint() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.animatedCenterPoint;
	}-*/;

	/**
	 * <b>animatedCenterPoint</b> (object)
	 * <p>
	 * read-only object with x and y properties of where the view is during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setAnimatedCenterPoint(JavaScriptObject animatedCenterPoint) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.animatedCenterPoint = animatedCenterPoint;
	}-*/;

	/**
	 * <b>autoplay</b> (boolean)
	 * <p>
	 * indicates if a movie should automatically start playback when it is likely to finish uninterrupted based on e.g. network conditions. Defaults to true.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getAutoplay() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.autoplay;
	}-*/;

	/**
	 * <b>autoplay</b> (boolean)
	 * <p>
	 * indicates if a movie should automatically start playback when it is likely to finish uninterrupted based on e.g. network conditions. Defaults to true.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setAutoplay(boolean autoplay) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.autoplay = autoplay;
	}-*/;

	/**
	 * <b>backgroundColor</b> (string)
	 * <p>
	 * the background color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundColor() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.backgroundColor;
	}-*/;

	/**
	 * <b>backgroundColor</b> (string)
	 * <p>
	 * the background color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundColor(String backgroundColor) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.backgroundColor = backgroundColor;
	}-*/;

	/**
	 * <b>backgroundDisabledColor</b> (string)
	 * <p>
	 * the disabled background color of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundDisabledColor() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.backgroundDisabledColor;
	}-*/;

	/**
	 * <b>backgroundDisabledColor</b> (string)
	 * <p>
	 * the disabled background color of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundDisabledColor(String backgroundDisabledColor) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.backgroundDisabledColor = backgroundDisabledColor;
	}-*/;

	/**
	 * <b>backgroundDisabledImage</b> (string)
	 * <p>
	 * the disabled background image url of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundDisabledImage() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.backgroundDisabledImage;
	}-*/;

	/**
	 * <b>backgroundDisabledImage</b> (string)
	 * <p>
	 * the disabled background image url of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundDisabledImage(String backgroundDisabledImage) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.backgroundDisabledImage = backgroundDisabledImage;
	}-*/;

	/**
	 * <b>backgroundFocusedColor</b> (string)
	 * <p>
	 * the focused background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundFocusedColor() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.backgroundFocusedColor;
	}-*/;

	/**
	 * <b>backgroundFocusedColor</b> (string)
	 * <p>
	 * the focused background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundFocusedColor(String backgroundFocusedColor) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.backgroundFocusedColor = backgroundFocusedColor;
	}-*/;

	/**
	 * <b>backgroundFocusedImage</b> (string)
	 * <p>
	 * the focused background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundFocusedImage() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.backgroundFocusedImage;
	}-*/;

	/**
	 * <b>backgroundFocusedImage</b> (string)
	 * <p>
	 * the focused background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundFocusedImage(String backgroundFocusedImage) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.backgroundFocusedImage = backgroundFocusedImage;
	}-*/;

	/**
	 * <b>backgroundGradient</b> (object)
	 * <p>
	 * a background gradient for the view with the properties: type,startPoint,endPoint,startRadius,endRadius,backfillStart,backfillEnd,colors.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getBackgroundGradient() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.backgroundGradient;
	}-*/;

	/**
	 * <b>backgroundGradient</b> (object)
	 * <p>
	 * a background gradient for the view with the properties: type,startPoint,endPoint,startRadius,endRadius,backfillStart,backfillEnd,colors.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundGradient(JavaScriptObject backgroundGradient) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.backgroundGradient = backgroundGradient;
	}-*/;

	/**
	 * <b>backgroundImage</b> (string)
	 * <p>
	 * the background image url of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundImage() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.backgroundImage;
	}-*/;

	/**
	 * <b>backgroundImage</b> (string)
	 * <p>
	 * the background image url of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundImage(String backgroundImage) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.backgroundImage = backgroundImage;
	}-*/;

	/**
	 * <b>backgroundLeftCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the left end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The right end cap is therefore computed by adding the size of the left end cap and the middle portion together and then subtracting that value from the width of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getBackgroundLeftCap() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.backgroundLeftCap;
	}-*/;

	/**
	 * <b>backgroundLeftCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the left end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The right end cap is therefore computed by adding the size of the left end cap and the middle portion together and then subtracting that value from the width of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundLeftCap(double backgroundLeftCap) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.backgroundLeftCap = backgroundLeftCap;
	}-*/;

	/**
	 * <b>backgroundSelectedColor</b> (string)
	 * <p>
	 * the selected background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundSelectedColor() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.backgroundSelectedColor;
	}-*/;

	/**
	 * <b>backgroundSelectedColor</b> (string)
	 * <p>
	 * the selected background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundSelectedColor(String backgroundSelectedColor) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.backgroundSelectedColor = backgroundSelectedColor;
	}-*/;

	/**
	 * <b>backgroundSelectedImage</b> (string)
	 * <p>
	 * the selected background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundSelectedImage() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.backgroundSelectedImage;
	}-*/;

	/**
	 * <b>backgroundSelectedImage</b> (string)
	 * <p>
	 * the selected background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundSelectedImage(String backgroundSelectedImage) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.backgroundSelectedImage = backgroundSelectedImage;
	}-*/;

	/**
	 * <b>backgroundTopCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the top end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The bottom end cap is therefore computed by adding the size of the top end cap and the middle portion together and then subtracting that value from the height of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getBackgroundTopCap() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.backgroundTopCap;
	}-*/;

	/**
	 * <b>backgroundTopCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the top end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The bottom end cap is therefore computed by adding the size of the top end cap and the middle portion together and then subtracting that value from the height of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundTopCap(double backgroundTopCap) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.backgroundTopCap = backgroundTopCap;
	}-*/;

	/**
	 * <b>borderColor</b> (string)
	 * <p>
	 * the border color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBorderColor() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.borderColor;
	}-*/;

	/**
	 * <b>borderColor</b> (string)
	 * <p>
	 * the border color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBorderColor(String borderColor) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.borderColor = borderColor;
	}-*/;

	/**
	 * <b>borderRadius</b> (float)
	 * <p>
	 * the border radius of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getBorderRadius() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.borderRadius;
	}-*/;

	/**
	 * <b>borderRadius</b> (float)
	 * <p>
	 * the border radius of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBorderRadius(double borderRadius) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.borderRadius = borderRadius;
	}-*/;

	/**
	 * <b>borderWidth</b> (float)
	 * <p>
	 * the border width of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getBorderWidth() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.borderWidth;
	}-*/;

	/**
	 * <b>borderWidth</b> (float)
	 * <p>
	 * the border width of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBorderWidth(double borderWidth) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.borderWidth = borderWidth;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getBottomF() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBottom(double bottom) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.bottom = bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBottomS() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBottom(String bottom) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.bottom = bottom;
	}-*/;

	/**
	 * <b>center</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the center of the views position relative to the parent view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getCenter() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.center;
	}-*/;

	/**
	 * <b>center</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the center of the views position relative to the parent view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setCenter(JavaScriptObject center) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.center = center;
	}-*/;

	/**
	 * <b>contentURL</b> (string)
	 * <p>
	 * deprecated. use url property instead.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getContentURL() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.contentURL;
	}-*/;

	/**
	 * <b>contentURL</b> (string)
	 * <p>
	 * deprecated. use url property instead.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setContentURL(String contentURL) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.contentURL = contentURL;
	}-*/;

	/**
	 * <b>duration</b> (double)
	 * <p>
	 * The duration of the movie, or 0.0 if not known.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getDuration() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.duration;
	}-*/;

	/**
	 * <b>duration</b> (double)
	 * <p>
	 * The duration of the movie, or 0.0 if not known.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setDuration(double duration) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.duration = duration;
	}-*/;

	/**
	 * <b>endPlaybackTime</b> (double)
	 * <p>
	 * The end time of movie playback. Defaults to NaN, which indicates natural end time of the movie.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getEndPlaybackTime() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.endPlaybackTime;
	}-*/;

	/**
	 * <b>endPlaybackTime</b> (double)
	 * <p>
	 * The end time of movie playback. Defaults to NaN, which indicates natural end time of the movie.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setEndPlaybackTime(double endPlaybackTime) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.endPlaybackTime = endPlaybackTime;
	}-*/;

	/**
	 * <b>focusable</b> (boolean)
	 * <p>
	 * Set true if you want a view to be focusable when navigating with the trackball or D-Pad. Default: false. (Android Only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.9
	 */
	public native boolean getFocusable() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.focusable;
	}-*/;

	/**
	 * <b>focusable</b> (boolean)
	 * <p>
	 * Set true if you want a view to be focusable when navigating with the trackball or D-Pad. Default: false. (Android Only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.9
	 */
	public native void setFocusable(boolean focusable) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.focusable = focusable;
	}-*/;

	/**
	 * <b>fullscreen</b> (boolean)
	 * <p>
	 * Determines if the movie is presented in the entire screen (obscuring all other application content). Default is false. Setting this property to true before the movie player's view is visible will have no effect.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getFullscreen() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.fullscreen;
	}-*/;

	/**
	 * <b>fullscreen</b> (boolean)
	 * <p>
	 * Determines if the movie is presented in the entire screen (obscuring all other application content). Default is false. Setting this property to true before the movie player's view is visible will have no effect.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setFullscreen(boolean fullscreen) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.fullscreen = fullscreen;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getHeightF() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setHeight(double height) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.height = height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getHeightS() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setHeight(String height) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.height = height;
	}-*/;

	/**
	 * <b>initialPlaybackTime</b> (double)
	 * <p>
	 * The start time of movie playback. Defaults to NaN, indicating the natural start time of the movie.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getInitialPlaybackTime() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.initialPlaybackTime;
	}-*/;

	/**
	 * <b>initialPlaybackTime</b> (double)
	 * <p>
	 * The start time of movie playback. Defaults to NaN, indicating the natural start time of the movie.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setInitialPlaybackTime(double initialPlaybackTime) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.initialPlaybackTime = initialPlaybackTime;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getLeftF() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setLeft(double left) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.left = left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getLeftS() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setLeft(String left) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.left = left;
	}-*/;

	/**
	 * <b>loadState</b> (int)
	 * <p>
	 * Returns the network load state of the movie player.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native int getLoadState() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.loadState;
	}-*/;

	/**
	 * <b>loadState</b> (int)
	 * <p>
	 * Returns the network load state of the movie player.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setLoadState(int loadState) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.loadState = loadState;
	}-*/;

	/**
	 * <b>media</b> (object)
	 * <p>
	 * the media object, either a File or Blob.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getMedia() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.media;
	}-*/;

	/**
	 * <b>media</b> (object)
	 * <p>
	 * the media object, either a File or Blob.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setMedia(JavaScriptObject media) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.media = media;
	}-*/;

	/**
	 * <b>mediaControlStyle</b> (int)
	 * <p>
	 * The style of the playback controls. Defaults to Titanium.Media.VIDEO_CONTROL_DEFAULT
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native int getMediaControlStyle() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.mediaControlStyle;
	}-*/;

	/**
	 * <b>mediaControlStyle</b> (int)
	 * <p>
	 * The style of the playback controls. Defaults to Titanium.Media.VIDEO_CONTROL_DEFAULT
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setMediaControlStyle(int mediaControlStyle) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.mediaControlStyle = mediaControlStyle;
	}-*/;

	/**
	 * <b>mediaTypes</b> (int)
	 * <p>
	 * The types of media in the movie, or Titanium.Media.VIDEO_MEDIA_TYPE_NONE if not known.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native int getMediaTypes() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.mediaTypes;
	}-*/;

	/**
	 * <b>mediaTypes</b> (int)
	 * <p>
	 * The types of media in the movie, or Titanium.Media.VIDEO_MEDIA_TYPE_NONE if not known.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setMediaTypes(int mediaTypes) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.mediaTypes = mediaTypes;
	}-*/;

	/**
	 * <b>movieControlMode</b> (int)
	 * <p>
	 * deprecated in 3.2+ of the iPhone SDK - use mediaControlStyle. Provides the ability to set the control mode of the movie player. Defaults to Titanium.Media.VIDEO_CONTROL_DEFAULT.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native int getMovieControlMode() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.movieControlMode;
	}-*/;

	/**
	 * <b>movieControlMode</b> (int)
	 * <p>
	 * deprecated in 3.2+ of the iPhone SDK - use mediaControlStyle. Provides the ability to set the control mode of the movie player. Defaults to Titanium.Media.VIDEO_CONTROL_DEFAULT.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setMovieControlMode(int movieControlMode) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.movieControlMode = movieControlMode;
	}-*/;

	/**
	 * <b>naturalSize</b> (object)
	 * <p>
	 * returns a dictionary with properties width and height. Returns the natural size of the movie or 0 for both properties if not known or applicable.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getNaturalSize() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.naturalSize;
	}-*/;

	/**
	 * <b>naturalSize</b> (object)
	 * <p>
	 * returns a dictionary with properties width and height. Returns the natural size of the movie or 0 for both properties if not known or applicable.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setNaturalSize(JavaScriptObject naturalSize) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.naturalSize = naturalSize;
	}-*/;

	/**
	 * <b>opacity</b> (float)
	 * <p>
	 * the opacity from 0.0-1.0
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getOpacity() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.opacity;
	}-*/;

	/**
	 * <b>opacity</b> (float)
	 * <p>
	 * the opacity from 0.0-1.0
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setOpacity(double opacity) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.opacity = opacity;
	}-*/;

	/**
	 * <b>playableDuration</b> (double)
	 * <p>
	 * The currently playable duration of the movie, for progressively downloaded network content.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getPlayableDuration() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.playableDuration;
	}-*/;

	/**
	 * <b>playableDuration</b> (double)
	 * <p>
	 * The currently playable duration of the movie, for progressively downloaded network content.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setPlayableDuration(double playableDuration) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.playableDuration = playableDuration;
	}-*/;

	/**
	 * <b>playbackState</b> (int)
	 * <p>
	 * Returns the current playback state of the music player
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native int getPlaybackState() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.playbackState;
	}-*/;

	/**
	 * <b>playbackState</b> (int)
	 * <p>
	 * Returns the current playback state of the music player
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setPlaybackState(int playbackState) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.playbackState = playbackState;
	}-*/;

	/**
	 * <b>playing</b> (boolean)
	 * <p>
	 * Boolean to indicate if the player has started playing.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getPlaying() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.playing;
	}-*/;

	/**
	 * <b>playing</b> (boolean)
	 * <p>
	 * Boolean to indicate if the player has started playing.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setPlaying(boolean playing) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.playing = playing;
	}-*/;

	/**
	 * <b>repeatMode</b> (int)
	 * <p>
	 * Determines how the movie player repeats when reaching the end of playback. Defaults to Titanium.Media.VIDEO_REPEAT_MODE_NONE.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native int getRepeatMode() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.repeatMode;
	}-*/;

	/**
	 * <b>repeatMode</b> (int)
	 * <p>
	 * Determines how the movie player repeats when reaching the end of playback. Defaults to Titanium.Media.VIDEO_REPEAT_MODE_NONE.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setRepeatMode(int repeatMode) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.repeatMode = repeatMode;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getRightF() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setRight(double right) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.right = right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getRightS() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setRight(String right) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.right = right;
	}-*/;

	/**
	 * <b>scalingMode</b> (int)
	 * <p>
	 * Determines how the content scales to fit the view. Defaults to Titanium.Media.VIDEO_SCALING_ASPECT_FIT.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native int getScalingMode() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.scalingMode;
	}-*/;

	/**
	 * <b>scalingMode</b> (int)
	 * <p>
	 * Determines how the content scales to fit the view. Defaults to Titanium.Media.VIDEO_SCALING_ASPECT_FIT.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setScalingMode(int scalingMode) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.scalingMode = scalingMode;
	}-*/;

	/**
	 * <b>size</b> (object)
	 * <p>
	 * the size of the view as a dictionary of width and height properties
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getSize() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.size;
	}-*/;

	/**
	 * <b>size</b> (object)
	 * <p>
	 * the size of the view as a dictionary of width and height properties
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setSize(JavaScriptObject size) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.size = size;
	}-*/;

	/**
	 * <b>softKeyboardOnFocus</b> (int)
	 * <p>
	 * One of Titanium.UI.Android.SOFT_KEYBOARD_DEFAULT_ON_FOCUS, Titanium.UI.Android.SOFT_KEYBOARD_HIDE_ON_FOCUS, or Titanium.UI.Android.SOFT_KEYBOARD_SHOW_ON_FOCUS. (Android only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.9
	 */
	public native int getSoftKeyboardOnFocus() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.softKeyboardOnFocus;
	}-*/;

	/**
	 * <b>softKeyboardOnFocus</b> (int)
	 * <p>
	 * One of Titanium.UI.Android.SOFT_KEYBOARD_DEFAULT_ON_FOCUS, Titanium.UI.Android.SOFT_KEYBOARD_HIDE_ON_FOCUS, or Titanium.UI.Android.SOFT_KEYBOARD_SHOW_ON_FOCUS. (Android only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.9
	 */
	public native void setSoftKeyboardOnFocus(int softKeyboardOnFocus) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.softKeyboardOnFocus = softKeyboardOnFocus;
	}-*/;

	/**
	 * <b>sourceType</b> (int)
	 * <p>
	 * The playback type of the movie. Defaults to Titanium.Media.VIDEO_SOURCE_TYPE_UNKNOWN. Specifying a playback type before playing the movie can result in faster load times.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native int getSourceType() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.sourceType;
	}-*/;

	/**
	 * <b>sourceType</b> (int)
	 * <p>
	 * The playback type of the movie. Defaults to Titanium.Media.VIDEO_SOURCE_TYPE_UNKNOWN. Specifying a playback type before playing the movie can result in faster load times.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setSourceType(int sourceType) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.sourceType = sourceType;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getTopF() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTop(double top) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.top = top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getTopS() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTop(String top) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.top = top;
	}-*/;

	/**
	 * <b>touchEnabled</b> (boolean)
	 * <p>
	 * a boolean indicating if the view should receive touch events (true, default) or forward them to peers (false)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getTouchEnabled() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.touchEnabled;
	}-*/;

	/**
	 * <b>touchEnabled</b> (boolean)
	 * <p>
	 * a boolean indicating if the view should receive touch events (true, default) or forward them to peers (false)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTouchEnabled(boolean touchEnabled) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.touchEnabled = touchEnabled;
	}-*/;

	/**
	 * <b>transform</b> (object)
	 * <p>
	 * the transformation matrix to apply to the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getTransform() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.transform;
	}-*/;

	/**
	 * <b>transform</b> (object)
	 * <p>
	 * the transformation matrix to apply to the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTransform(JavaScriptObject transform) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.transform = transform;
	}-*/;

	/**
	 * <b>url</b> (string)
	 * <p>
	 * url of the media.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getUrl() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.url;
	}-*/;

	/**
	 * <b>url</b> (string)
	 * <p>
	 * url of the media.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setUrl(String url) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.url = url;
	}-*/;

	/**
	 * <b>useApplicationAudioSession</b> (boolean)
	 * <p>
	 * Indicates if the movie player should inherit the application's audio session instead of creating a new session (which would interrupt the application's session). Defaults to true. Setting this property during playback will not take effect until playback is stopped and started again.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getUseApplicationAudioSession() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.useApplicationAudioSession;
	}-*/;

	/**
	 * <b>useApplicationAudioSession</b> (boolean)
	 * <p>
	 * Indicates if the movie player should inherit the application's audio session instead of creating a new session (which would interrupt the application's session). Defaults to true. Setting this property during playback will not take effect until playback is stopped and started again.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setUseApplicationAudioSession(boolean useApplicationAudioSession) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.useApplicationAudioSession = useApplicationAudioSession;
	}-*/;

	/**
	 * <b>visible</b> (boolean)
	 * <p>
	 * a boolean of the visibility of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getVisible() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.visible;
	}-*/;

	/**
	 * <b>visible</b> (boolean)
	 * <p>
	 * a boolean of the visibility of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setVisible(boolean visible) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.visible = visible;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getWidthF() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setWidth(double width) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.width = width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getWidthS() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setWidth(String width) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.width = width;
	}-*/;

	/**
	 * <b>zIndex</b> (int)
	 * <p>
	 * the z index position relative to other sibling views
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native int getZIndex() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.zIndex;
	}-*/;

	/**
	 * <b>zIndex</b> (int)
	 * <p>
	 * the z index position relative to other sibling views
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setZIndex(int zIndex) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.zIndex = zIndex;
	}-*/;

	/**
	 * <b>add</b>
	 * <p>
	 * add a child to the view hierarchy
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param view (object) the view to add to this views hiearchy
	 * @return void
	 */
	 public native void add(JavaScriptObject view) /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.add(view);
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
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>animate</b>
	 * <p>
	 * animate the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param obj (object) either a dictionary of animation properties or an Animation object
	 * @param callback (function) function to be invoked upon completion of the animation
	 * @return void
	 */
	 public native void animate(JavaScriptObject obj, JavaScriptObject callback) /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.animate(obj, callback);
	}-*/;

	/**
	 * <b>cancelAllThumbnailImageRequests</b>
	 * <p>
	 * Cancels all pending asynchronous thumbnail requests.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @return void
	 */
	 public native void cancelAllThumbnailImageRequests() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.cancelAllThumbnailImageRequests();
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
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.fireEvent(name, event);
	}-*/;

	/**
	 * <b>hide</b>
	 * <p>
	 * hide the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @return void
	 */
	 public native void hide() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.hide();
	}-*/;

	/**
	 * <b>pause</b>
	 * <p>
	 * pause playing the video. On iOS only available under 3.2 and later
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @return void
	 */
	 public native void pause() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.pause();
	}-*/;

	/**
	 * <b>play</b>
	 * <p>
	 * start playing the video
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @return void
	 */
	 public native void play() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.play();
	}-*/;

	/**
	 * <b>release</b>
	 * <p>
	 * release the internal video resources immediately.  this is not usually necessary but can help if you no longer need to use the player after it is used to help converse memory.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @return void
	 */
	 public native void release() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.release();
	}-*/;

	/**
	 * <b>remove</b>
	 * <p>
	 * remove a previously add view from the view hiearchy
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param view (object) the view to remove from this views hiearchy
	 * @return void
	 */
	 public native void remove(JavaScriptObject view) /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.remove(view);
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
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>requestThumbnailImagesAtTimes</b>
	 * <p>
	 * Asynchronously request thumbnails for one or more times, provided as an array of numbers (double). Fires a thumbnail event on completion. Optionally invokes the callback function passed in the method.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param times (array) array of doubles for each time to request
	 * @param option (int) either [[Titanium.Media.VIDEO_TIME_OPTION_NEAREST_KEYFRAME]] or [[Titanium.Media.VIDEO_TIME_OPTION_EXACT]].
	 * @return void
	 */
	 public native void requestThumbnailImagesAtTimes(JavaScriptObject times, int option) /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.requestThumbnailImagesAtTimes(times, option);
	}-*/;

	/**
	 * <b>setBackgroundView</b>
	 * <p>
	 * A view for customization which is always displayed behind movie content.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param view (object) view to set
	 * @return void
	 */
	 public native void setBackgroundView(JavaScriptObject view) /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.setBackgroundView(view);
	}-*/;

	/**
	 * <b>setMedia</b>
	 * <p>
	 * the a non-url based media to play, either a File or Blob.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param media (object) media to play
	 * @return void
	 */
	 public native void setMediaMethod(JavaScriptObject media) /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.setMediaMethod(media);
	}-*/;

	/**
	 * <b>setUrl</b>
	 * <p>
	 * the url to play
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param url (string) the url to play
	 * @return void
	 */
	 public native void setUrlMethod(String url) /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.setUrlMethod(url);
	}-*/;

	/**
	 * <b>show</b>
	 * <p>
	 * make the view visible
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @return void
	 */
	 public native void show() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.show();
	}-*/;

	/**
	 * <b>stop</b>
	 * <p>
	 * stop playing the video
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @return void
	 */
	 public native void stop() /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.stop();
	}-*/;

	/**
	 * <b>thumbnailImageAtTime</b>
	 * <p>
	 * Returns a thumbnail at the given time as a blob.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param time (double) playback time
	 * @param option (int) either [[Titanium.Media.VIDEO_TIME_OPTION_NEAREST_KEYFRAME]] or [[Titanium.Media.VIDEO_TIME_OPTION_EXACT]]
	 * @return object
	 */
	 public native JavaScriptObject thumbnailImageAtTime(double time, int option) /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.thumbnailImageAtTime(time, option);
	}-*/;

	/**
	 * <b>toImage</b>
	 * <p>
	 * return a Blob image of the rendered view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param f (function) function to be invoked upon completion. if non-null, this method will be performed asynchronously. if null, it will be performed immediately
	 * @return object
	 */
	 public native JavaScriptObject toImage(JavaScriptObject f) /*-{
		return this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.toImage(f);
	}-*/;
	

	/**
	 * <b>click</b>
	 * <p>
	 * fired when the device detects a click (longer than touch) against the view
	 * @param click event handler
	 */
	public native void addClick(com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerClickHandler click) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.addEventListener('click', function(source, type, globalPoint, y, x) {
			click.@com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerClickHandler::click(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>complete</b>
	 * <p>
	 * fired when movie playback ends or a user exits playback
	 * @param complete event handler
	 */
	public native void addComplete(com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerCompleteHandler complete) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.addEventListener('complete', function(source, reason, type, globalPoint, y, x) {
			complete.@com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerCompleteHandler::complete(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, reason, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>dblclick</b>
	 * <p>
	 * fired when the device detects a double click against the view
	 * @param dblclick event handler
	 */
	public native void addDblclick(com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerDblclickHandler dblclick) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.addEventListener('dblclick', function(source, type, globalPoint, y, x) {
			dblclick.@com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerDblclickHandler::dblclick(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>doubletap</b>
	 * <p>
	 * fired when the device detects a double tap against the view
	 * @param doubletap event handler
	 */
	public native void addDoubletap(com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerDoubletapHandler doubletap) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.addEventListener('doubletap', function(source, type, globalPoint, y, x) {
			doubletap.@com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerDoubletapHandler::doubletap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>durationAvailable</b>
	 * <p>
	 * fired when the duration is available
	 * @param durationAvailable event handler
	 */
	public native void addDurationAvailable(com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerDurationAvailableHandler durationAvailable) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.addEventListener('durationAvailable', function(duration, source, type, globalPoint, y, x) {
			durationAvailable.@com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerDurationAvailableHandler::durationAvailable(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(duration, source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>error</b>
	 * <p>
	 * fired when movie playback encounters an error
	 * @param error event handler
	 */
	public native void addError(com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerErrorHandler error) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.addEventListener('error', function(message, source, type, globalPoint, y, x) {
			error.@com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerErrorHandler::error(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(message, source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>fullscreen</b>
	 * <p>
	 * fired when a movie changes from fullscreen view
	 * @param fullscreen event handler
	 */
	public native void addFullscreen(com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerFullscreenHandler fullscreen) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.addEventListener('fullscreen', function(source, type, globalPoint, y, x, entering) {
			fullscreen.@com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerFullscreenHandler::fullscreen(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x, entering);
		});
	}-*/;
	

	/**
	 * <b>load</b>
	 * <p>
	 * fired when the movie play loads
	 * @param load event handler
	 */
	public native void addLoad(com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerLoadHandler load) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.addEventListener('load', function(source, type, globalPoint, y, x) {
			load.@com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerLoadHandler::load(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>loadstate</b>
	 * <p>
	 * fired when the network loadState changes
	 * @param loadstate event handler
	 */
	public native void addLoadstate(com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerLoadstateHandler loadstate) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.addEventListener('loadstate', function(source, loadState, type, globalPoint, y, x) {
			loadstate.@com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerLoadstateHandler::loadstate(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, loadState, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>mediaTypesAvailable</b>
	 * <p>
	 * fired when the media types is available
	 * @param mediaTypesAvailable event handler
	 */
	public native void addMediaTypesAvailable(com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerMediaTypesAvailableHandler mediaTypesAvailable) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.addEventListener('mediaTypesAvailable', function(source, mediaTypes, type, globalPoint, y, x) {
			mediaTypesAvailable.@com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerMediaTypesAvailableHandler::mediaTypesAvailable(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, mediaTypes, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>naturalSizeAvailable</b>
	 * <p>
	 * fired when the natural size is available
	 * @param naturalSizeAvailable event handler
	 */
	public native void addNaturalSizeAvailable(com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerNaturalSizeAvailableHandler naturalSizeAvailable) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.addEventListener('naturalSizeAvailable', function(source, naturalSize, type, globalPoint, y, x) {
			naturalSizeAvailable.@com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerNaturalSizeAvailableHandler::naturalSizeAvailable(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, naturalSize, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>playbackState</b>
	 * <p>
	 * fired when the playbackState changes
	 * @param playbackState event handler
	 */
	public native void addPlaybackState(com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerPlaybackStateHandler playbackState) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.addEventListener('playbackState', function(source, playbackState, type, globalPoint, y, x) {
			playbackState.@com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerPlaybackStateHandler::playbackState(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, playbackState, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>playing</b>
	 * <p>
	 * fired when the currently playing movie changes
	 * @param playing event handler
	 */
	public native void addPlaying(com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerPlayingHandler playing) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.addEventListener('playing', function(source, type, globalPoint, y, url, x) {
			playing.@com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerPlayingHandler::playing(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, url, x);
		});
	}-*/;
	

	/**
	 * <b>preload</b>
	 * <p>
	 * fired when the movie has preloaded and is ready to play
	 * @param preload event handler
	 */
	public native void addPreload(com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerPreloadHandler preload) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.addEventListener('preload', function(source, type, globalPoint, y, x) {
			preload.@com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerPreloadHandler::preload(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>resize</b>
	 * <p>
	 * fired when the movie player is resized
	 * @param resize event handler
	 */
	public native void addResize(com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerResizeHandler resize) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.addEventListener('resize', function(source, type, globalPoint, y, x) {
			resize.@com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerResizeHandler::resize(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>singletap</b>
	 * <p>
	 * fired when the device detects a single tap against the view
	 * @param singletap event handler
	 */
	public native void addSingletap(com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerSingletapHandler singletap) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.addEventListener('singletap', function(source, type, globalPoint, y, x) {
			singletap.@com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerSingletapHandler::singletap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>sourceChange</b>
	 * <p>
	 * fired when the movieSourceType is Titanium.Media.VIDEO_SOURCE_TYPE_UNKNOWN when preparing for playback.
	 * @param sourceChange event handler
	 */
	public native void addSourceChange(com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerSourceChangeHandler sourceChange) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.addEventListener('sourceChange', function(sourceChange, source, type, globalPoint, y, x) {
			sourceChange.@com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerSourceChangeHandler::sourceChange(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(sourceChange, source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>swipe</b>
	 * <p>
	 * fired when the device detects a swipe (left or right) against the view
	 * @param swipe event handler
	 */
	public native void addSwipe(com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerSwipeHandler swipe) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.addEventListener('swipe', function(source, direction, type, globalPoint, y, x) {
			swipe.@com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerSwipeHandler::swipe(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, direction, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>thumbnail</b>
	 * <p>
	 * fired when a movie thumbnail is available from requestThumbnailImagesAtTimes
	 * @param thumbnail event handler
	 */
	public native void addThumbnail(com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerThumbnailHandler thumbnail) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.addEventListener('thumbnail', function(time, source, error, image, type, globalPoint, success, y, x) {
			thumbnail.@com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerThumbnailHandler::thumbnail(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(time, source, error, image, type, globalPoint, success, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchcancel</b>
	 * <p>
	 * fired when a touch event is interrupted by the device. this happens in circumenstances such as an incoming call to allow the UI to clean up state.
	 * @param touchcancel event handler
	 */
	public native void addTouchcancel(com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerTouchcancelHandler touchcancel) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.addEventListener('touchcancel', function(source, type, globalPoint, y, x) {
			touchcancel.@com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerTouchcancelHandler::touchcancel(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchend</b>
	 * <p>
	 * fired when a touch event is completed
	 * @param touchend event handler
	 */
	public native void addTouchend(com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerTouchendHandler touchend) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.addEventListener('touchend', function(source, type, globalPoint, y, x) {
			touchend.@com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerTouchendHandler::touchend(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchmove</b>
	 * <p>
	 * fired as soon as the device detects movement of a touch.  Event coordinates are always relative to the view in which the initial touch occurred
	 * @param touchmove event handler
	 */
	public native void addTouchmove(com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerTouchmoveHandler touchmove) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.addEventListener('touchmove', function(source, type, globalPoint, y, x) {
			touchmove.@com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerTouchmoveHandler::touchmove(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchstart</b>
	 * <p>
	 * fired as soon as the device detects a gesture
	 * @param touchstart event handler
	 */
	public native void addTouchstart(com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerTouchstartHandler touchstart) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.addEventListener('touchstart', function(source, type, globalPoint, y, x) {
			touchstart.@com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerTouchstartHandler::touchstart(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>twofingertap</b>
	 * <p>
	 * fired when the device detects a two-finger tap against the view
	 * @param twofingertap event handler
	 */
	public native void addTwofingertap(com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerTwofingertapHandler twofingertap) /*-{
		this.@com.pmt.wrap.titanium.media.VideoPlayer::handler.addEventListener('twofingertap', function(source, type, globalPoint, y, x) {
			twofingertap.@com.pmt.wrap.titanium.sys.events.TitaniumMediaVideoPlayerTwofingertapHandler::twofingertap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
}
