package com.pmt.wrap.titanium.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.Slider</b>
 * <p>
 * A Slider is created by the method Titanium.UI.createSlider.
 * <p>
 * <b>Platforms:</b> android iphone ipad 
 * <p>
 * <b>Since:</b> 0.8
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> view
 * <p>
 * <b>Returns:</b> null
 */
public class Slider {

	private JavaScriptObject handler;

	public Slider(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>anchorPoint</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the anchor point value. anchor specifies the position by which animation should occur. center is 0.5, 0.5
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getAnchorPoint() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.anchorPoint;
	}-*/;

	/**
	 * <b>anchorPoint</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the anchor point value. anchor specifies the position by which animation should occur. center is 0.5, 0.5
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setAnchorPoint(JavaScriptObject anchorPoint) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.anchorPoint = anchorPoint;
	}-*/;

	/**
	 * <b>animatedCenterPoint</b> (object)
	 * <p>
	 * read-only object with x and y properties of where the view is during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getAnimatedCenterPoint() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.animatedCenterPoint;
	}-*/;

	/**
	 * <b>animatedCenterPoint</b> (object)
	 * <p>
	 * read-only object with x and y properties of where the view is during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setAnimatedCenterPoint(JavaScriptObject animatedCenterPoint) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.animatedCenterPoint = animatedCenterPoint;
	}-*/;

	/**
	 * <b>backgroundColor</b> (string)
	 * <p>
	 * the background color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBackgroundColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.backgroundColor;
	}-*/;

	/**
	 * <b>backgroundColor</b> (string)
	 * <p>
	 * the background color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundColor(String backgroundColor) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.backgroundColor = backgroundColor;
	}-*/;

	/**
	 * <b>backgroundDisabledColor</b> (string)
	 * <p>
	 * the disabled background color of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBackgroundDisabledColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.backgroundDisabledColor;
	}-*/;

	/**
	 * <b>backgroundDisabledColor</b> (string)
	 * <p>
	 * the disabled background color of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundDisabledColor(String backgroundDisabledColor) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.backgroundDisabledColor = backgroundDisabledColor;
	}-*/;

	/**
	 * <b>backgroundDisabledImage</b> (string)
	 * <p>
	 * the disabled background image url of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBackgroundDisabledImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.backgroundDisabledImage;
	}-*/;

	/**
	 * <b>backgroundDisabledImage</b> (string)
	 * <p>
	 * the disabled background image url of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundDisabledImage(String backgroundDisabledImage) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.backgroundDisabledImage = backgroundDisabledImage;
	}-*/;

	/**
	 * <b>backgroundFocusedColor</b> (string)
	 * <p>
	 * the focused background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBackgroundFocusedColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.backgroundFocusedColor;
	}-*/;

	/**
	 * <b>backgroundFocusedColor</b> (string)
	 * <p>
	 * the focused background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundFocusedColor(String backgroundFocusedColor) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.backgroundFocusedColor = backgroundFocusedColor;
	}-*/;

	/**
	 * <b>backgroundFocusedImage</b> (string)
	 * <p>
	 * the focused background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBackgroundFocusedImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.backgroundFocusedImage;
	}-*/;

	/**
	 * <b>backgroundFocusedImage</b> (string)
	 * <p>
	 * the focused background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundFocusedImage(String backgroundFocusedImage) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.backgroundFocusedImage = backgroundFocusedImage;
	}-*/;

	/**
	 * <b>backgroundGradient</b> (object)
	 * <p>
	 * a background gradient for the view with the properties: type,startPoint,endPoint,startRadius,endRadius,backfillStart,backfillEnd,colors.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getBackgroundGradient() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.backgroundGradient;
	}-*/;

	/**
	 * <b>backgroundGradient</b> (object)
	 * <p>
	 * a background gradient for the view with the properties: type,startPoint,endPoint,startRadius,endRadius,backfillStart,backfillEnd,colors.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundGradient(JavaScriptObject backgroundGradient) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.backgroundGradient = backgroundGradient;
	}-*/;

	/**
	 * <b>backgroundImage</b> (string)
	 * <p>
	 * the background image url of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBackgroundImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.backgroundImage;
	}-*/;

	/**
	 * <b>backgroundImage</b> (string)
	 * <p>
	 * the background image url of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundImage(String backgroundImage) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.backgroundImage = backgroundImage;
	}-*/;

	/**
	 * <b>backgroundLeftCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the left end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The right end cap is therefore computed by adding the size of the left end cap and the middle portion together and then subtracting that value from the width of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getBackgroundLeftCap() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.backgroundLeftCap;
	}-*/;

	/**
	 * <b>backgroundLeftCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the left end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The right end cap is therefore computed by adding the size of the left end cap and the middle portion together and then subtracting that value from the width of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundLeftCap(double backgroundLeftCap) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.backgroundLeftCap = backgroundLeftCap;
	}-*/;

	/**
	 * <b>backgroundSelectedColor</b> (string)
	 * <p>
	 * the selected background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBackgroundSelectedColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.backgroundSelectedColor;
	}-*/;

	/**
	 * <b>backgroundSelectedColor</b> (string)
	 * <p>
	 * the selected background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundSelectedColor(String backgroundSelectedColor) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.backgroundSelectedColor = backgroundSelectedColor;
	}-*/;

	/**
	 * <b>backgroundSelectedImage</b> (string)
	 * <p>
	 * the selected background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBackgroundSelectedImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.backgroundSelectedImage;
	}-*/;

	/**
	 * <b>backgroundSelectedImage</b> (string)
	 * <p>
	 * the selected background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundSelectedImage(String backgroundSelectedImage) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.backgroundSelectedImage = backgroundSelectedImage;
	}-*/;

	/**
	 * <b>backgroundTopCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the top end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The bottom end cap is therefore computed by adding the size of the top end cap and the middle portion together and then subtracting that value from the height of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getBackgroundTopCap() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.backgroundTopCap;
	}-*/;

	/**
	 * <b>backgroundTopCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the top end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The bottom end cap is therefore computed by adding the size of the top end cap and the middle portion together and then subtracting that value from the height of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundTopCap(double backgroundTopCap) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.backgroundTopCap = backgroundTopCap;
	}-*/;

	/**
	 * <b>borderColor</b> (string)
	 * <p>
	 * the border color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBorderColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.borderColor;
	}-*/;

	/**
	 * <b>borderColor</b> (string)
	 * <p>
	 * the border color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBorderColor(String borderColor) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.borderColor = borderColor;
	}-*/;

	/**
	 * <b>borderRadius</b> (float)
	 * <p>
	 * the border radius of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getBorderRadius() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.borderRadius;
	}-*/;

	/**
	 * <b>borderRadius</b> (float)
	 * <p>
	 * the border radius of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBorderRadius(double borderRadius) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.borderRadius = borderRadius;
	}-*/;

	/**
	 * <b>borderWidth</b> (float)
	 * <p>
	 * the border width of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getBorderWidth() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.borderWidth;
	}-*/;

	/**
	 * <b>borderWidth</b> (float)
	 * <p>
	 * the border width of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBorderWidth(double borderWidth) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.borderWidth = borderWidth;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getBottomF() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBottom(double bottom) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.bottom = bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBottomS() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBottom(String bottom) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.bottom = bottom;
	}-*/;

	/**
	 * <b>center</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the center of the views position relative to the parent view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getCenter() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.center;
	}-*/;

	/**
	 * <b>center</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the center of the views position relative to the parent view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setCenter(JavaScriptObject center) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.center = center;
	}-*/;

	/**
	 * <b>disabledLeftTrackImage</b> (string)
	 * <p>
	 * the image url of the slider left track when in the disabled state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getDisabledLeftTrackImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.disabledLeftTrackImage;
	}-*/;

	/**
	 * <b>disabledLeftTrackImage</b> (string)
	 * <p>
	 * the image url of the slider left track when in the disabled state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setDisabledLeftTrackImage(String disabledLeftTrackImage) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.disabledLeftTrackImage = disabledLeftTrackImage;
	}-*/;

	/**
	 * <b>disabledRightTrackImage</b> (string)
	 * <p>
	 * the image url of the slider right track when in the disabled state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getDisabledRightTrackImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.disabledRightTrackImage;
	}-*/;

	/**
	 * <b>disabledRightTrackImage</b> (string)
	 * <p>
	 * the image url of the slider right track when in the disabled state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setDisabledRightTrackImage(String disabledRightTrackImage) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.disabledRightTrackImage = disabledRightTrackImage;
	}-*/;

	/**
	 * <b>disabledThumbImage</b> (string)
	 * <p>
	 * the image url of the slider thumb when in the disabled state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getDisabledThumbImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.disabledThumbImage;
	}-*/;

	/**
	 * <b>disabledThumbImage</b> (string)
	 * <p>
	 * the image url of the slider thumb when in the disabled state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setDisabledThumbImage(String disabledThumbImage) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.disabledThumbImage = disabledThumbImage;
	}-*/;

	/**
	 * <b>enabled</b> (boolean)
	 * <p>
	 * boolean to indicate the enabled state of the slider
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getEnabled() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.enabled;
	}-*/;

	/**
	 * <b>enabled</b> (boolean)
	 * <p>
	 * boolean to indicate the enabled state of the slider
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setEnabled(boolean enabled) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.enabled = enabled;
	}-*/;

	/**
	 * <b>focusable</b> (boolean)
	 * <p>
	 * Set true if you want a view to be focusable when navigating with the trackball or D-Pad. Default: false. (Android Only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.8
	 */
	public native boolean getFocusable() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.focusable;
	}-*/;

	/**
	 * <b>focusable</b> (boolean)
	 * <p>
	 * Set true if you want a view to be focusable when navigating with the trackball or D-Pad. Default: false. (Android Only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.8
	 */
	public native void setFocusable(boolean focusable) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.focusable = focusable;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getHeightF() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setHeight(double height) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.height = height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getHeightS() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setHeight(String height) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.height = height;
	}-*/;

	/**
	 * <b>highlightedLeftTrackImage</b> (string)
	 * <p>
	 * the image url of the slider left track when in the highlighted state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getHighlightedLeftTrackImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.highlightedLeftTrackImage;
	}-*/;

	/**
	 * <b>highlightedLeftTrackImage</b> (string)
	 * <p>
	 * the image url of the slider left track when in the highlighted state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setHighlightedLeftTrackImage(String highlightedLeftTrackImage) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.highlightedLeftTrackImage = highlightedLeftTrackImage;
	}-*/;

	/**
	 * <b>highlightedRightTrackImage</b> (string)
	 * <p>
	 * the image url of the slider right track when in the highlighted state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getHighlightedRightTrackImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.highlightedRightTrackImage;
	}-*/;

	/**
	 * <b>highlightedRightTrackImage</b> (string)
	 * <p>
	 * the image url of the slider right track when in the highlighted state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setHighlightedRightTrackImage(String highlightedRightTrackImage) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.highlightedRightTrackImage = highlightedRightTrackImage;
	}-*/;

	/**
	 * <b>highlightedThumbImage</b> (string)
	 * <p>
	 * the image url of the slider thumb when in the highlighted state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getHighlightedThumbImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.highlightedThumbImage;
	}-*/;

	/**
	 * <b>highlightedThumbImage</b> (string)
	 * <p>
	 * the image url of the slider thumb when in the highlighted state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setHighlightedThumbImage(String highlightedThumbImage) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.highlightedThumbImage = highlightedThumbImage;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getLeftF() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setLeft(double left) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.left = left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getLeftS() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setLeft(String left) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.left = left;
	}-*/;

	/**
	 * <b>leftTrackImage</b> (string)
	 * <p>
	 * the image url of the slider left track
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getLeftTrackImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.leftTrackImage;
	}-*/;

	/**
	 * <b>leftTrackImage</b> (string)
	 * <p>
	 * the image url of the slider left track
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setLeftTrackImage(String leftTrackImage) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.leftTrackImage = leftTrackImage;
	}-*/;

	/**
	 * <b>max</b> (float)
	 * <p>
	 * the maximum slider value
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getMax() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.max;
	}-*/;

	/**
	 * <b>max</b> (float)
	 * <p>
	 * the maximum slider value
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setMax(double max) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.max = max;
	}-*/;

	/**
	 * <b>maxRange</b> (int)
	 * <p>
	 * value can't be moved higher than maxRange. maxRange equals max by default. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getMaxRange() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.maxRange;
	}-*/;

	/**
	 * <b>maxRange</b> (int)
	 * <p>
	 * value can't be moved higher than maxRange. maxRange equals max by default. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setMaxRange(int maxRange) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.maxRange = maxRange;
	}-*/;

	/**
	 * <b>min</b> (float)
	 * <p>
	 * the minimum slider value
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getMin() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.min;
	}-*/;

	/**
	 * <b>min</b> (float)
	 * <p>
	 * the minimum slider value
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setMin(double min) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.min = min;
	}-*/;

	/**
	 * <b>minRange</b> (int)
	 * <p>
	 * value can't be moved lower than minRange. minRange equals min by default. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getMinRange() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.minRange;
	}-*/;

	/**
	 * <b>minRange</b> (int)
	 * <p>
	 * value can't be moved lower than minRange. minRange equals min by default. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setMinRange(int minRange) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.minRange = minRange;
	}-*/;

	/**
	 * <b>opacity</b> (float)
	 * <p>
	 * the opacity from 0.0-1.0
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getOpacity() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.opacity;
	}-*/;

	/**
	 * <b>opacity</b> (float)
	 * <p>
	 * the opacity from 0.0-1.0
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setOpacity(double opacity) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.opacity = opacity;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getRightF() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setRight(double right) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.right = right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getRightS() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setRight(String right) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.right = right;
	}-*/;

	/**
	 * <b>rightTrackImage</b> (string)
	 * <p>
	 * the image url of the slider right track
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getRightTrackImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.rightTrackImage;
	}-*/;

	/**
	 * <b>rightTrackImage</b> (string)
	 * <p>
	 * the image url of the slider right track
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setRightTrackImage(String rightTrackImage) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.rightTrackImage = rightTrackImage;
	}-*/;

	/**
	 * <b>selectedLeftTrackImage</b> (string)
	 * <p>
	 * the image url of the slider left track when in the selected state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getSelectedLeftTrackImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.selectedLeftTrackImage;
	}-*/;

	/**
	 * <b>selectedLeftTrackImage</b> (string)
	 * <p>
	 * the image url of the slider left track when in the selected state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setSelectedLeftTrackImage(String selectedLeftTrackImage) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.selectedLeftTrackImage = selectedLeftTrackImage;
	}-*/;

	/**
	 * <b>selectedRightTrackImage</b> (string)
	 * <p>
	 * the image url of the slider right track when in the selected state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getSelectedRightTrackImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.selectedRightTrackImage;
	}-*/;

	/**
	 * <b>selectedRightTrackImage</b> (string)
	 * <p>
	 * the image url of the slider right track when in the selected state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setSelectedRightTrackImage(String selectedRightTrackImage) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.selectedRightTrackImage = selectedRightTrackImage;
	}-*/;

	/**
	 * <b>selectedThumbImage</b> (string)
	 * <p>
	 * the image url of the slider thumb when in the selected state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getSelectedThumbImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.selectedThumbImage;
	}-*/;

	/**
	 * <b>selectedThumbImage</b> (string)
	 * <p>
	 * the image url of the slider thumb when in the selected state
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setSelectedThumbImage(String selectedThumbImage) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.selectedThumbImage = selectedThumbImage;
	}-*/;

	/**
	 * <b>size</b> (object)
	 * <p>
	 * the size of the view as a dictionary of width and height properties
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getSize() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.size;
	}-*/;

	/**
	 * <b>size</b> (object)
	 * <p>
	 * the size of the view as a dictionary of width and height properties
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setSize(JavaScriptObject size) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.size = size;
	}-*/;

	/**
	 * <b>softKeyboardOnFocus</b> (int)
	 * <p>
	 * One of Titanium.UI.Android.SOFT_KEYBOARD_DEFAULT_ON_FOCUS, Titanium.UI.Android.SOFT_KEYBOARD_HIDE_ON_FOCUS, or Titanium.UI.Android.SOFT_KEYBOARD_SHOW_ON_FOCUS. (Android only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.8
	 */
	public native int getSoftKeyboardOnFocus() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.softKeyboardOnFocus;
	}-*/;

	/**
	 * <b>softKeyboardOnFocus</b> (int)
	 * <p>
	 * One of Titanium.UI.Android.SOFT_KEYBOARD_DEFAULT_ON_FOCUS, Titanium.UI.Android.SOFT_KEYBOARD_HIDE_ON_FOCUS, or Titanium.UI.Android.SOFT_KEYBOARD_SHOW_ON_FOCUS. (Android only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.8
	 */
	public native void setSoftKeyboardOnFocus(int softKeyboardOnFocus) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.softKeyboardOnFocus = softKeyboardOnFocus;
	}-*/;

	/**
	 * <b>thumbImage</b> (string)
	 * <p>
	 * the image url to the slider thumb
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getThumbImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.thumbImage;
	}-*/;

	/**
	 * <b>thumbImage</b> (string)
	 * <p>
	 * the image url to the slider thumb
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setThumbImage(String thumbImage) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.thumbImage = thumbImage;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getTopF() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setTop(double top) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.top = top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getTopS() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setTop(String top) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.top = top;
	}-*/;

	/**
	 * <b>touchEnabled</b> (boolean)
	 * <p>
	 * a boolean indicating if the view should receive touch events (true, default) or forward them to peers (false)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getTouchEnabled() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.touchEnabled;
	}-*/;

	/**
	 * <b>touchEnabled</b> (boolean)
	 * <p>
	 * a boolean indicating if the view should receive touch events (true, default) or forward them to peers (false)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setTouchEnabled(boolean touchEnabled) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.touchEnabled = touchEnabled;
	}-*/;

	/**
	 * <b>transform</b> (object)
	 * <p>
	 * the transformation matrix to apply to the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getTransform() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.transform;
	}-*/;

	/**
	 * <b>transform</b> (object)
	 * <p>
	 * the transformation matrix to apply to the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setTransform(JavaScriptObject transform) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.transform = transform;
	}-*/;

	/**
	 * <b>value</b> (string)
	 * <p>
	 * the value of the slider
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getValue() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.value;
	}-*/;

	/**
	 * <b>value</b> (string)
	 * <p>
	 * the value of the slider
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setValue(String value) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.value = value;
	}-*/;

	/**
	 * <b>visible</b> (boolean)
	 * <p>
	 * a boolean of the visibility of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getVisible() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.visible;
	}-*/;

	/**
	 * <b>visible</b> (boolean)
	 * <p>
	 * a boolean of the visibility of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setVisible(boolean visible) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.visible = visible;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getWidthF() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setWidth(double width) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.width = width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getWidthS() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setWidth(String width) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.width = width;
	}-*/;

	/**
	 * <b>zIndex</b> (int)
	 * <p>
	 * the z index position relative to other sibling views
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getZIndex() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.zIndex;
	}-*/;

	/**
	 * <b>zIndex</b> (int)
	 * <p>
	 * the z index position relative to other sibling views
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setZIndex(int zIndex) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.zIndex = zIndex;
	}-*/;

	/**
	 * <b>add</b>
	 * <p>
	 * add a child to the view hierarchy
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param view (object) the view to add to this views hiearchy
	 * @return void
	 */
	 public native void add(JavaScriptObject view) /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.add(view);
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
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>animate</b>
	 * <p>
	 * animate the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param obj (object) either a dictionary of animation properties or an Animation object
	 * @param callback (function) function to be invoked upon completion of the animation
	 * @return void
	 */
	 public native void animate(JavaScriptObject obj, JavaScriptObject callback) /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.animate(obj, callback);
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
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.fireEvent(name, event);
	}-*/;

	/**
	 * <b>hide</b>
	 * <p>
	 * hide the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @return void
	 */
	 public native void hide() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.hide();
	}-*/;

	/**
	 * <b>remove</b>
	 * <p>
	 * remove a previously add view from the view hiearchy
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param view (object) the view to remove from this views hiearchy
	 * @return void
	 */
	 public native void remove(JavaScriptObject view) /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.remove(view);
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
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>show</b>
	 * <p>
	 * make the view visible
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @return void
	 */
	 public native void show() /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.show();
	}-*/;

	/**
	 * <b>toImage</b>
	 * <p>
	 * return a Blob image of the rendered view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param f (function) function to be invoked upon completion. if non-null, this method will be performed asynchronously. if null, it will be performed immediately
	 * @return object
	 */
	 public native JavaScriptObject toImage(JavaScriptObject f) /*-{
		return this.@com.pmt.wrap.titanium.ui.Slider::handler.toImage(f);
	}-*/;
	

	/**
	 * <b>change</b>
	 * <p>
	 * fired when the value of the slider changes
	 * @param change event handler
	 */
	public native void addChange(com.pmt.wrap.titanium.sys.events.TitaniumUISliderChangeHandler change) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.addEventListener('change', function(thumbOffset, source, thumbSize, value, type, globalPoint, y, x) {
			change.@com.pmt.wrap.titanium.sys.events.TitaniumUISliderChangeHandler::change(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(thumbOffset, source, thumbSize, value, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>click</b>
	 * <p>
	 * fired when the device detects a click (longer than touch) against the view
	 * @param click event handler
	 */
	public native void addClick(com.pmt.wrap.titanium.sys.events.TitaniumUISliderClickHandler click) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.addEventListener('click', function(source, type, globalPoint, y, x) {
			click.@com.pmt.wrap.titanium.sys.events.TitaniumUISliderClickHandler::click(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>dblclick</b>
	 * <p>
	 * fired when the device detects a double click against the view
	 * @param dblclick event handler
	 */
	public native void addDblclick(com.pmt.wrap.titanium.sys.events.TitaniumUISliderDblclickHandler dblclick) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.addEventListener('dblclick', function(source, type, globalPoint, y, x) {
			dblclick.@com.pmt.wrap.titanium.sys.events.TitaniumUISliderDblclickHandler::dblclick(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>doubletap</b>
	 * <p>
	 * fired when the device detects a double tap against the view
	 * @param doubletap event handler
	 */
	public native void addDoubletap(com.pmt.wrap.titanium.sys.events.TitaniumUISliderDoubletapHandler doubletap) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.addEventListener('doubletap', function(source, type, globalPoint, y, x) {
			doubletap.@com.pmt.wrap.titanium.sys.events.TitaniumUISliderDoubletapHandler::doubletap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>singletap</b>
	 * <p>
	 * fired when the device detects a single tap against the view
	 * @param singletap event handler
	 */
	public native void addSingletap(com.pmt.wrap.titanium.sys.events.TitaniumUISliderSingletapHandler singletap) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.addEventListener('singletap', function(source, type, globalPoint, y, x) {
			singletap.@com.pmt.wrap.titanium.sys.events.TitaniumUISliderSingletapHandler::singletap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>swipe</b>
	 * <p>
	 * fired when the device detects a swipe (left or right) against the view
	 * @param swipe event handler
	 */
	public native void addSwipe(com.pmt.wrap.titanium.sys.events.TitaniumUISliderSwipeHandler swipe) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.addEventListener('swipe', function(source, direction, type, globalPoint, y, x) {
			swipe.@com.pmt.wrap.titanium.sys.events.TitaniumUISliderSwipeHandler::swipe(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, direction, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchcancel</b>
	 * <p>
	 * fired when a touch event is interrupted by the device. this happens in circumenstances such as an incoming call to allow the UI to clean up state.
	 * @param touchcancel event handler
	 */
	public native void addTouchcancel(com.pmt.wrap.titanium.sys.events.TitaniumUISliderTouchcancelHandler touchcancel) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.addEventListener('touchcancel', function(source, type, globalPoint, y, x) {
			touchcancel.@com.pmt.wrap.titanium.sys.events.TitaniumUISliderTouchcancelHandler::touchcancel(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchend</b>
	 * <p>
	 * fired when a touch event is completed
	 * @param touchend event handler
	 */
	public native void addTouchend(com.pmt.wrap.titanium.sys.events.TitaniumUISliderTouchendHandler touchend) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.addEventListener('touchend', function(source, type, globalPoint, y, x) {
			touchend.@com.pmt.wrap.titanium.sys.events.TitaniumUISliderTouchendHandler::touchend(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchmove</b>
	 * <p>
	 * fired as soon as the device detects movement of a touch.  Event coordinates are always relative to the view in which the initial touch occurred
	 * @param touchmove event handler
	 */
	public native void addTouchmove(com.pmt.wrap.titanium.sys.events.TitaniumUISliderTouchmoveHandler touchmove) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.addEventListener('touchmove', function(source, type, globalPoint, y, x) {
			touchmove.@com.pmt.wrap.titanium.sys.events.TitaniumUISliderTouchmoveHandler::touchmove(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchstart</b>
	 * <p>
	 * fired as soon as the device detects a gesture
	 * @param touchstart event handler
	 */
	public native void addTouchstart(com.pmt.wrap.titanium.sys.events.TitaniumUISliderTouchstartHandler touchstart) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.addEventListener('touchstart', function(source, type, globalPoint, y, x) {
			touchstart.@com.pmt.wrap.titanium.sys.events.TitaniumUISliderTouchstartHandler::touchstart(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>twofingertap</b>
	 * <p>
	 * fired when the device detects a two-finger tap against the view
	 * @param twofingertap event handler
	 */
	public native void addTwofingertap(com.pmt.wrap.titanium.sys.events.TitaniumUISliderTwofingertapHandler twofingertap) /*-{
		this.@com.pmt.wrap.titanium.ui.Slider::handler.addEventListener('twofingertap', function(source, type, globalPoint, y, x) {
			twofingertap.@com.pmt.wrap.titanium.sys.events.TitaniumUISliderTwofingertapHandler::twofingertap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
}
