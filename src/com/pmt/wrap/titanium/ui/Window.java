package com.pmt.wrap.titanium.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.Window</b>
 * <p>
 * The Window is an empty drawing surface or container. The Window is created by the method Titanium.UI.createWindow. Unlike Views, Windows can be opened and closed and can have special display properties such as fullscreen or modal.
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
public class Window {

	private JavaScriptObject handler;

	public Window(JavaScriptObject handler) {
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
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getAnchorPoint() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.anchorPoint;
	}-*/;

	/**
	 * <b>anchorPoint</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the anchor point value. anchor specifies the position by which animation should occur. center is 0.5, 0.5
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setAnchorPoint(JavaScriptObject anchorPoint) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.anchorPoint = anchorPoint;
	}-*/;

	/**
	 * <b>animatedCenterPoint</b> (object)
	 * <p>
	 * read-only object with x and y properties of where the view is during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getAnimatedCenterPoint() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.animatedCenterPoint;
	}-*/;

	/**
	 * <b>animatedCenterPoint</b> (object)
	 * <p>
	 * read-only object with x and y properties of where the view is during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setAnimatedCenterPoint(JavaScriptObject animatedCenterPoint) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.animatedCenterPoint = animatedCenterPoint;
	}-*/;

	/**
	 * <b>backButtonTitle</b> (string)
	 * <p>
	 * title for the back button. only available in iPhone. this is only valid when the window is a child of a tab.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackButtonTitle() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.backButtonTitle;
	}-*/;

	/**
	 * <b>backButtonTitle</b> (string)
	 * <p>
	 * title for the back button. only available in iPhone. this is only valid when the window is a child of a tab.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackButtonTitle(String backButtonTitle) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.backButtonTitle = backButtonTitle;
	}-*/;

	/**
	 * <b>backButtonTitleImage</b> (string)
	 * <p>
	 * url to an image to show as the back button.  only available in iPhone. this is only valid when the window is a child of a tab.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackButtonTitleImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.backButtonTitleImage;
	}-*/;

	/**
	 * <b>backButtonTitleImage</b> (string)
	 * <p>
	 * url to an image to show as the back button.  only available in iPhone. this is only valid when the window is a child of a tab.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackButtonTitleImage(String backButtonTitleImage) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.backButtonTitleImage = backButtonTitleImage;
	}-*/;

	/**
	 * <b>backgroundColor</b> (string)
	 * <p>
	 * the background color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.backgroundColor;
	}-*/;

	/**
	 * <b>backgroundColor</b> (string)
	 * <p>
	 * the background color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundColor(String backgroundColor) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.backgroundColor = backgroundColor;
	}-*/;

	/**
	 * <b>backgroundDisabledColor</b> (string)
	 * <p>
	 * the disabled background color of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundDisabledColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.backgroundDisabledColor;
	}-*/;

	/**
	 * <b>backgroundDisabledColor</b> (string)
	 * <p>
	 * the disabled background color of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundDisabledColor(String backgroundDisabledColor) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.backgroundDisabledColor = backgroundDisabledColor;
	}-*/;

	/**
	 * <b>backgroundDisabledImage</b> (string)
	 * <p>
	 * the disabled background image url of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundDisabledImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.backgroundDisabledImage;
	}-*/;

	/**
	 * <b>backgroundDisabledImage</b> (string)
	 * <p>
	 * the disabled background image url of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundDisabledImage(String backgroundDisabledImage) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.backgroundDisabledImage = backgroundDisabledImage;
	}-*/;

	/**
	 * <b>backgroundFocusedColor</b> (string)
	 * <p>
	 * the focused background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundFocusedColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.backgroundFocusedColor;
	}-*/;

	/**
	 * <b>backgroundFocusedColor</b> (string)
	 * <p>
	 * the focused background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundFocusedColor(String backgroundFocusedColor) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.backgroundFocusedColor = backgroundFocusedColor;
	}-*/;

	/**
	 * <b>backgroundFocusedImage</b> (string)
	 * <p>
	 * the focused background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundFocusedImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.backgroundFocusedImage;
	}-*/;

	/**
	 * <b>backgroundFocusedImage</b> (string)
	 * <p>
	 * the focused background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundFocusedImage(String backgroundFocusedImage) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.backgroundFocusedImage = backgroundFocusedImage;
	}-*/;

	/**
	 * <b>backgroundGradient</b> (object)
	 * <p>
	 * a background gradient for the view with the properties: type,startPoint,endPoint,startRadius,endRadius,backfillStart,backfillEnd,colors.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getBackgroundGradient() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.backgroundGradient;
	}-*/;

	/**
	 * <b>backgroundGradient</b> (object)
	 * <p>
	 * a background gradient for the view with the properties: type,startPoint,endPoint,startRadius,endRadius,backfillStart,backfillEnd,colors.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundGradient(JavaScriptObject backgroundGradient) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.backgroundGradient = backgroundGradient;
	}-*/;

	/**
	 * <b>backgroundImage</b> (string)
	 * <p>
	 * the background image url of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.backgroundImage;
	}-*/;

	/**
	 * <b>backgroundImage</b> (string)
	 * <p>
	 * the background image url of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundImage(String backgroundImage) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.backgroundImage = backgroundImage;
	}-*/;

	/**
	 * <b>backgroundLeftCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the left end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The right end cap is therefore computed by adding the size of the left end cap and the middle portion together and then subtracting that value from the width of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getBackgroundLeftCap() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.backgroundLeftCap;
	}-*/;

	/**
	 * <b>backgroundLeftCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the left end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The right end cap is therefore computed by adding the size of the left end cap and the middle portion together and then subtracting that value from the width of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundLeftCap(double backgroundLeftCap) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.backgroundLeftCap = backgroundLeftCap;
	}-*/;

	/**
	 * <b>backgroundSelectedColor</b> (string)
	 * <p>
	 * the selected background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundSelectedColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.backgroundSelectedColor;
	}-*/;

	/**
	 * <b>backgroundSelectedColor</b> (string)
	 * <p>
	 * the selected background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundSelectedColor(String backgroundSelectedColor) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.backgroundSelectedColor = backgroundSelectedColor;
	}-*/;

	/**
	 * <b>backgroundSelectedImage</b> (string)
	 * <p>
	 * the selected background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundSelectedImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.backgroundSelectedImage;
	}-*/;

	/**
	 * <b>backgroundSelectedImage</b> (string)
	 * <p>
	 * the selected background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundSelectedImage(String backgroundSelectedImage) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.backgroundSelectedImage = backgroundSelectedImage;
	}-*/;

	/**
	 * <b>backgroundTopCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the top end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The bottom end cap is therefore computed by adding the size of the top end cap and the middle portion together and then subtracting that value from the height of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getBackgroundTopCap() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.backgroundTopCap;
	}-*/;

	/**
	 * <b>backgroundTopCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the top end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The bottom end cap is therefore computed by adding the size of the top end cap and the middle portion together and then subtracting that value from the height of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundTopCap(double backgroundTopCap) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.backgroundTopCap = backgroundTopCap;
	}-*/;

	/**
	 * <b>barColor</b> (string)
	 * <p>
	 * web named color or hex value for the color of the nav bar. only available in iPhone.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBarColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.barColor;
	}-*/;

	/**
	 * <b>barColor</b> (string)
	 * <p>
	 * web named color or hex value for the color of the nav bar. only available in iPhone.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBarColor(String barColor) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.barColor = barColor;
	}-*/;

	/**
	 * <b>barImage</b> (string)
	 * <p>
	 * url to a local image to place as the background of the nav bar. only available in iPhone.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBarImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.barImage;
	}-*/;

	/**
	 * <b>barImage</b> (string)
	 * <p>
	 * url to a local image to place as the background of the nav bar. only available in iPhone.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBarImage(String barImage) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.barImage = barImage;
	}-*/;

	/**
	 * <b>borderColor</b> (string)
	 * <p>
	 * the border color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBorderColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.borderColor;
	}-*/;

	/**
	 * <b>borderColor</b> (string)
	 * <p>
	 * the border color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBorderColor(String borderColor) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.borderColor = borderColor;
	}-*/;

	/**
	 * <b>borderRadius</b> (float)
	 * <p>
	 * the border radius of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getBorderRadius() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.borderRadius;
	}-*/;

	/**
	 * <b>borderRadius</b> (float)
	 * <p>
	 * the border radius of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBorderRadius(double borderRadius) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.borderRadius = borderRadius;
	}-*/;

	/**
	 * <b>borderWidth</b> (float)
	 * <p>
	 * the border width of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getBorderWidth() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.borderWidth;
	}-*/;

	/**
	 * <b>borderWidth</b> (float)
	 * <p>
	 * the border width of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBorderWidth(double borderWidth) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.borderWidth = borderWidth;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getBottomF() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBottom(double bottom) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.bottom = bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBottomS() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBottom(String bottom) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.bottom = bottom;
	}-*/;

	/**
	 * <b>center</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the center of the views position relative to the parent view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getCenter() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.center;
	}-*/;

	/**
	 * <b>center</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the center of the views position relative to the parent view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setCenter(JavaScriptObject center) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.center = center;
	}-*/;

	/**
	 * <b>exitOnClose</b> (boolean)
	 * <p>
	 * (Android only.) Boolean indicates if the application should exit when the Android back button is pressed while the window is being shown.  You can only set this as a createWindow({...}) option.  Setting it after window creation will no effect.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getExitOnClose() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.exitOnClose;
	}-*/;

	/**
	 * <b>exitOnClose</b> (boolean)
	 * <p>
	 * (Android only.) Boolean indicates if the application should exit when the Android back button is pressed while the window is being shown.  You can only set this as a createWindow({...}) option.  Setting it after window creation will no effect.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setExitOnClose(boolean exitOnClose) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.exitOnClose = exitOnClose;
	}-*/;

	/**
	 * <b>focusable</b> (boolean)
	 * <p>
	 * Set true if you want a view to be focusable when navigating with the trackball or D-Pad. Default: false. (Android Only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.9
	 */
	public native boolean getFocusable() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.focusable;
	}-*/;

	/**
	 * <b>focusable</b> (boolean)
	 * <p>
	 * Set true if you want a view to be focusable when navigating with the trackball or D-Pad. Default: false. (Android Only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.9
	 */
	public native void setFocusable(boolean focusable) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.focusable = focusable;
	}-*/;

	/**
	 * <b>fullscreen</b> (boolean)
	 * <p>
	 * boolean indicates if the window is fullscreen (no device chrome)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getFullscreen() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.fullscreen;
	}-*/;

	/**
	 * <b>fullscreen</b> (boolean)
	 * <p>
	 * boolean indicates if the window is fullscreen (no device chrome)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setFullscreen(boolean fullscreen) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.fullscreen = fullscreen;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getHeightF() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setHeight(double height) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.height = height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getHeightS() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setHeight(String height) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.height = height;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getLeftF() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setLeft(double left) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.left = left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getLeftS() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setLeft(String left) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.left = left;
	}-*/;

	/**
	 * <b>leftNavButton</b> (object)
	 * <p>
	 * view to show in the left nav bar area. only available in iPhone.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getLeftNavButton() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.leftNavButton;
	}-*/;

	/**
	 * <b>leftNavButton</b> (object)
	 * <p>
	 * view to show in the left nav bar area. only available in iPhone.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setLeftNavButton(JavaScriptObject leftNavButton) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.leftNavButton = leftNavButton;
	}-*/;

	/**
	 * <b>modal</b> (boolean)
	 * <p>
	 * boolean to indicate if the window should be opened modal in front of other windows
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getModal() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.modal;
	}-*/;

	/**
	 * <b>modal</b> (boolean)
	 * <p>
	 * boolean to indicate if the window should be opened modal in front of other windows
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setModal(boolean modal) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.modal = modal;
	}-*/;

	/**
	 * <b>navBarHidden</b> (boolean)
	 * <p>
	 * for modal windows, hide the nav bar (true) or show the nav bar (false, default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getNavBarHidden() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.navBarHidden;
	}-*/;

	/**
	 * <b>navBarHidden</b> (boolean)
	 * <p>
	 * for modal windows, hide the nav bar (true) or show the nav bar (false, default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setNavBarHidden(boolean navBarHidden) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.navBarHidden = navBarHidden;
	}-*/;

	/**
	 * <b>opacity</b> (float)
	 * <p>
	 * the opacity from 0.0-1.0
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getOpacity() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.opacity;
	}-*/;

	/**
	 * <b>opacity</b> (float)
	 * <p>
	 * the opacity from 0.0-1.0
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setOpacity(double opacity) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.opacity = opacity;
	}-*/;

	/**
	 * <b>orientationModes</b> (int)
	 * <p>
	 * Array of orientation mode constants defined in Titanium.UI.  On Android, orientation modes that can be set are dependant on the Android SDK level of the device itself.  It should be noted that, the definition of portrait or landscape mode can vary based on the physical orientation of the device.  For example, on some devices Titanium.UI.LANDSCAPE_LEFT represents the top of the device being at the 270 degree position but other devices may (based on camera position for example) treat this position as Titanium.UI.LANDSCAPE_RIGHT.  In general, applications for Android that need to be aware of orientation should try and limit their orientation logic to handling either portrait or landscape rather than worrying about the reverse modes.  This approach will allow the orientation modes to adopt a more natural feel for the specific device.  The following list breaks down the orientation behavior on Android:  1) (Titanium.UI.PORTRAIT OR Titanium.UI.UPSIDE_PORTRAIT) AND (Titanium.UI.LANDSCAPE_LEFT OR Titanium.UI.LANDSCAPE_RIGHT) - Enables full sensor which lets the operating system control the orientation of the screen based on the sensor inside the device.  2) Titanium.UI.PORTRAIT OR Titanium.UI.UPSIDE_PORTRAIT - Enables sensor portrait mode on Android 2.3 and above.  Sensor portrait mode on Android means the screen will shift between both portrait modes according to the sensor inside the device.  If the Android version is less than 2.3, then normal portrait mode is locked.  3) Titanium.UI.LANDSCAPE_LEFT OR Titanium.UI.LANDSCAPE_RIGHT - Enables sensor landscape mode on Android 2.3 and above.  Sensor landscape mode on Android means the screen will shift between both landscape modes according to the sensor inside the device.  If the Android version is less than 2.3, then normal landscape mode is locked.  4) Titanium.UI.PORTRAIT - Locks screen orientation to portrait mode  5) Titanium.UI.LANDSCAPE - Locks screen orientation to landscape mode  6) empty array - resets the orientation to default sensor control
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native int getOrientationModes() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.orientationModes;
	}-*/;

	/**
	 * <b>orientationModes</b> (int)
	 * <p>
	 * Array of orientation mode constants defined in Titanium.UI.  On Android, orientation modes that can be set are dependant on the Android SDK level of the device itself.  It should be noted that, the definition of portrait or landscape mode can vary based on the physical orientation of the device.  For example, on some devices Titanium.UI.LANDSCAPE_LEFT represents the top of the device being at the 270 degree position but other devices may (based on camera position for example) treat this position as Titanium.UI.LANDSCAPE_RIGHT.  In general, applications for Android that need to be aware of orientation should try and limit their orientation logic to handling either portrait or landscape rather than worrying about the reverse modes.  This approach will allow the orientation modes to adopt a more natural feel for the specific device.  The following list breaks down the orientation behavior on Android:  1) (Titanium.UI.PORTRAIT OR Titanium.UI.UPSIDE_PORTRAIT) AND (Titanium.UI.LANDSCAPE_LEFT OR Titanium.UI.LANDSCAPE_RIGHT) - Enables full sensor which lets the operating system control the orientation of the screen based on the sensor inside the device.  2) Titanium.UI.PORTRAIT OR Titanium.UI.UPSIDE_PORTRAIT - Enables sensor portrait mode on Android 2.3 and above.  Sensor portrait mode on Android means the screen will shift between both portrait modes according to the sensor inside the device.  If the Android version is less than 2.3, then normal portrait mode is locked.  3) Titanium.UI.LANDSCAPE_LEFT OR Titanium.UI.LANDSCAPE_RIGHT - Enables sensor landscape mode on Android 2.3 and above.  Sensor landscape mode on Android means the screen will shift between both landscape modes according to the sensor inside the device.  If the Android version is less than 2.3, then normal landscape mode is locked.  4) Titanium.UI.PORTRAIT - Locks screen orientation to portrait mode  5) Titanium.UI.LANDSCAPE - Locks screen orientation to landscape mode  6) empty array - resets the orientation to default sensor control
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setOrientationModes(int orientationModes) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.orientationModes = orientationModes;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getRightF() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setRight(double right) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.right = right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getRightS() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setRight(String right) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.right = right;
	}-*/;

	/**
	 * <b>rightNavButton</b> (object)
	 * <p>
	 * view to show in the right nav bar area. only available in iPhone.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getRightNavButton() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.rightNavButton;
	}-*/;

	/**
	 * <b>rightNavButton</b> (object)
	 * <p>
	 * view to show in the right nav bar area. only available in iPhone.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setRightNavButton(JavaScriptObject rightNavButton) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.rightNavButton = rightNavButton;
	}-*/;

	/**
	 * <b>size</b> (object)
	 * <p>
	 * the size of the view as a dictionary of width and height properties
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getSize() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.size;
	}-*/;

	/**
	 * <b>size</b> (object)
	 * <p>
	 * the size of the view as a dictionary of width and height properties
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setSize(JavaScriptObject size) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.size = size;
	}-*/;

	/**
	 * <b>softKeyboardOnFocus</b> (int)
	 * <p>
	 * One of Titanium.UI.Android.SOFT_KEYBOARD_DEFAULT_ON_FOCUS, Titanium.UI.Android.SOFT_KEYBOARD_HIDE_ON_FOCUS, or Titanium.UI.Android.SOFT_KEYBOARD_SHOW_ON_FOCUS. (Android only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.9
	 */
	public native int getSoftKeyboardOnFocus() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.softKeyboardOnFocus;
	}-*/;

	/**
	 * <b>softKeyboardOnFocus</b> (int)
	 * <p>
	 * One of Titanium.UI.Android.SOFT_KEYBOARD_DEFAULT_ON_FOCUS, Titanium.UI.Android.SOFT_KEYBOARD_HIDE_ON_FOCUS, or Titanium.UI.Android.SOFT_KEYBOARD_SHOW_ON_FOCUS. (Android only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.9
	 */
	public native void setSoftKeyboardOnFocus(int softKeyboardOnFocus) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.softKeyboardOnFocus = softKeyboardOnFocus;
	}-*/;

	/**
	 * <b>tabBarHidden</b> (boolean)
	 * <p>
	 * boolean to indicate if the tab bar should be hidden. this is only valid when the window is a child of a tab.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getTabBarHidden() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.tabBarHidden;
	}-*/;

	/**
	 * <b>tabBarHidden</b> (boolean)
	 * <p>
	 * boolean to indicate if the tab bar should be hidden. this is only valid when the window is a child of a tab.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTabBarHidden(boolean tabBarHidden) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.tabBarHidden = tabBarHidden;
	}-*/;

	/**
	 * <b>title</b> (string)
	 * <p>
	 * title of the window.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getTitle() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.title;
	}-*/;

	/**
	 * <b>title</b> (string)
	 * <p>
	 * title of the window.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTitle(String title) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.title = title;
	}-*/;

	/**
	 * <b>titleControl</b> (object)
	 * <p>
	 * view to show in the title area. only available in iPhone.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getTitleControl() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.titleControl;
	}-*/;

	/**
	 * <b>titleControl</b> (object)
	 * <p>
	 * view to show in the title area. only available in iPhone.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTitleControl(JavaScriptObject titleControl) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.titleControl = titleControl;
	}-*/;

	/**
	 * <b>titleImage</b> (string)
	 * <p>
	 * url to a image that show in the title area. only available in iPhone.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getTitleImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.titleImage;
	}-*/;

	/**
	 * <b>titleImage</b> (string)
	 * <p>
	 * url to a image that show in the title area. only available in iPhone.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTitleImage(String titleImage) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.titleImage = titleImage;
	}-*/;

	/**
	 * <b>titlePrompt</b> (string)
	 * <p>
	 * title prompt for the window. only available in iPhone.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getTitlePrompt() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.titlePrompt;
	}-*/;

	/**
	 * <b>titlePrompt</b> (string)
	 * <p>
	 * title prompt for the window. only available in iPhone.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTitlePrompt(String titlePrompt) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.titlePrompt = titlePrompt;
	}-*/;

	/**
	 * <b>titleid</b> (string)
	 * <p>
	 * the key in the locale file to use for the title property
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getTitleid() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.titleid;
	}-*/;

	/**
	 * <b>titleid</b> (string)
	 * <p>
	 * the key in the locale file to use for the title property
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTitleid(String titleid) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.titleid = titleid;
	}-*/;

	/**
	 * <b>titlepromptid</b> (string)
	 * <p>
	 * the key in the locale file to use for the titlePrompt property
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getTitlepromptid() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.titlepromptid;
	}-*/;

	/**
	 * <b>titlepromptid</b> (string)
	 * <p>
	 * the key in the locale file to use for the titlePrompt property
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTitlepromptid(String titlepromptid) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.titlepromptid = titlepromptid;
	}-*/;

	/**
	 * <b>toolbar</b> (array)
	 * <p>
	 * array of button objects to show in the toolbar of the window. only available in iPhone. this is only valid when the window is a child of a tab.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getToolbar() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.toolbar;
	}-*/;

	/**
	 * <b>toolbar</b> (array)
	 * <p>
	 * array of button objects to show in the toolbar of the window. only available in iPhone. this is only valid when the window is a child of a tab.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setToolbar(JavaScriptObject toolbar) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.toolbar = toolbar;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getTopF() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTop(double top) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.top = top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getTopS() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTop(String top) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.top = top;
	}-*/;

	/**
	 * <b>touchEnabled</b> (boolean)
	 * <p>
	 * a boolean indicating if the view should receive touch events (true, default) or forward them to peers (false)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getTouchEnabled() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.touchEnabled;
	}-*/;

	/**
	 * <b>touchEnabled</b> (boolean)
	 * <p>
	 * a boolean indicating if the view should receive touch events (true, default) or forward them to peers (false)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTouchEnabled(boolean touchEnabled) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.touchEnabled = touchEnabled;
	}-*/;

	/**
	 * <b>transform</b> (object)
	 * <p>
	 * the transformation matrix to apply to the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getTransform() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.transform;
	}-*/;

	/**
	 * <b>transform</b> (object)
	 * <p>
	 * the transformation matrix to apply to the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTransform(JavaScriptObject transform) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.transform = transform;
	}-*/;

	/**
	 * <b>translucent</b> (boolean)
	 * <p>
	 * boolean to indicate if the nav bar is translucent. only available in iPhone.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getTranslucent() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.translucent;
	}-*/;

	/**
	 * <b>translucent</b> (boolean)
	 * <p>
	 * boolean to indicate if the nav bar is translucent. only available in iPhone.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTranslucent(boolean translucent) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.translucent = translucent;
	}-*/;

	/**
	 * <b>url</b> (string)
	 * <p>
	 * url to a JavaScript file with the windows instructions. this window will create a new JavaScript sub-context that will run in its own thread and global variable space.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getUrl() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.url;
	}-*/;

	/**
	 * <b>url</b> (string)
	 * <p>
	 * url to a JavaScript file with the windows instructions. this window will create a new JavaScript sub-context that will run in its own thread and global variable space.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setUrl(String url) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.url = url;
	}-*/;

	/**
	 * <b>visible</b> (boolean)
	 * <p>
	 * a boolean of the visibility of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getVisible() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.visible;
	}-*/;

	/**
	 * <b>visible</b> (boolean)
	 * <p>
	 * a boolean of the visibility of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setVisible(boolean visible) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.visible = visible;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getWidthF() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setWidth(double width) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.width = width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getWidthS() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setWidth(String width) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.width = width;
	}-*/;

	/**
	 * <b>windowSoftInputMode</b> (int)
	 * <p>
	 * One of Ti.UI.Android.SOFT_INPUT_ADJUST_PAN, Ti.UI.Android.SOFT_INPUT_ADJUST_RESIZE, or Ti.UI.Android.SOFT_INPUT_ADJUST_UNSPECIFIED. Note: MUST be passed in the creation options. (Android Only) Android Doc: Window.setSoftInputMode
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native int getWindowSoftInputMode() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.windowSoftInputMode;
	}-*/;

	/**
	 * <b>windowSoftInputMode</b> (int)
	 * <p>
	 * One of Ti.UI.Android.SOFT_INPUT_ADJUST_PAN, Ti.UI.Android.SOFT_INPUT_ADJUST_RESIZE, or Ti.UI.Android.SOFT_INPUT_ADJUST_UNSPECIFIED. Note: MUST be passed in the creation options. (Android Only) Android Doc: Window.setSoftInputMode
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setWindowSoftInputMode(int windowSoftInputMode) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.windowSoftInputMode = windowSoftInputMode;
	}-*/;

	/**
	 * <b>zIndex</b> (int)
	 * <p>
	 * the z index position relative to other sibling views
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native int getZIndex() /*-{
		return this.@com.pmt.wrap.titanium.ui.Window::handler.zIndex;
	}-*/;

	/**
	 * <b>zIndex</b> (int)
	 * <p>
	 * the z index position relative to other sibling views
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setZIndex(int zIndex) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.zIndex = zIndex;
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
		this.@com.pmt.wrap.titanium.ui.Window::handler.add(view);
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
		this.@com.pmt.wrap.titanium.ui.Window::handler.addEventListener(name, callback);
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
		this.@com.pmt.wrap.titanium.ui.Window::handler.animate(obj, callback);
	}-*/;

	/**
	 * <b>close</b>
	 * <p>
	 * close the window
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param options (object) close the window with optional animation or display properties
	 * @return void
	 */
	 public native void close(JavaScriptObject options) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.close(options);
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
		this.@com.pmt.wrap.titanium.ui.Window::handler.fireEvent(name, event);
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
		this.@com.pmt.wrap.titanium.ui.Window::handler.hide();
	}-*/;

	/**
	 * <b>open</b>
	 * <p>
	 * open the window
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param options (object) open the window with optional animation or display properties
	 * @return void
	 */
	 public native void open(JavaScriptObject options) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.open(options);
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
		this.@com.pmt.wrap.titanium.ui.Window::handler.remove(view);
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
		this.@com.pmt.wrap.titanium.ui.Window::handler.removeEventListener(name, callback);
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
		this.@com.pmt.wrap.titanium.ui.Window::handler.show();
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
		return this.@com.pmt.wrap.titanium.ui.Window::handler.toImage(f);
	}-*/;
	

	/**
	 * <b>android:back</b>
	 * <p>
	 * fired when the back button is released. Setting a listener is interpreted as the handler for that button. To restore default behavior, remove the listener. It is recommended that you only have one handler per heavyweight window (Android Only)
	 * @param androidBack event handler
	 */
	public native void addAndroidBack(com.pmt.wrap.titanium.sys.events.TitaniumUIWindowAndroidBackHandler androidBack) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.addEventListener('android:back', function(source, type, globalPoint, y, x) {
			androidBack.@com.pmt.wrap.titanium.sys.events.TitaniumUIWindowAndroidBackHandler::androidBack(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>android:camera</b>
	 * <p>
	 * fired when the camera button is released. Setting a listener is interpreted as the handler for that button. To restore default behavior, remove the listener. It is recommended that you only have one handler per heavyweight window (Android Only)
	 * @param androidCamera event handler
	 */
	public native void addAndroidCamera(com.pmt.wrap.titanium.sys.events.TitaniumUIWindowAndroidCameraHandler androidCamera) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.addEventListener('android:camera', function(source, type, globalPoint, y, x) {
			androidCamera.@com.pmt.wrap.titanium.sys.events.TitaniumUIWindowAndroidCameraHandler::androidCamera(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>android:focus</b>
	 * <p>
	 * fired when the camera button is half-pressed then released. Setting a listener is interpreted as the handler for that button. To restore default behavior, remove the listener. It is recommended that you only have one handler per heavyweight window (Android Only)
	 * @param androidFocus event handler
	 */
	public native void addAndroidFocus(com.pmt.wrap.titanium.sys.events.TitaniumUIWindowAndroidFocusHandler androidFocus) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.addEventListener('android:focus', function(source, type, globalPoint, y, x) {
			androidFocus.@com.pmt.wrap.titanium.sys.events.TitaniumUIWindowAndroidFocusHandler::androidFocus(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>android:search</b>
	 * <p>
	 * fired when the search button is released. Setting a listener is interpreted as the handler for that button. To restore default behavior, remove the listener. It is recommended that you only have one handler per heavyweight window (Android Only)
	 * @param androidSearch event handler
	 */
	public native void addAndroidSearch(com.pmt.wrap.titanium.sys.events.TitaniumUIWindowAndroidSearchHandler androidSearch) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.addEventListener('android:search', function(source, type, globalPoint, y, x) {
			androidSearch.@com.pmt.wrap.titanium.sys.events.TitaniumUIWindowAndroidSearchHandler::androidSearch(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>android:voldown</b>
	 * <p>
	 * fired when the volume down button is released. Setting a listener is interpreted as the handler for that button. To restore default behavior, remove the listener. It is recommended that you only have one handler per heavyweight window (Android Only)
	 * @param androidVoldown event handler
	 */
	public native void addAndroidVoldown(com.pmt.wrap.titanium.sys.events.TitaniumUIWindowAndroidVoldownHandler androidVoldown) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.addEventListener('android:voldown', function(source, type, globalPoint, y, x) {
			androidVoldown.@com.pmt.wrap.titanium.sys.events.TitaniumUIWindowAndroidVoldownHandler::androidVoldown(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>android:volup</b>
	 * <p>
	 * fired when the volume up button is released. Setting a listener is interpreted as the handler for that button. To restore default behavior, remove the listener. It is recommended that you only have one handler per heavyweight window (Android Only)
	 * @param androidVolup event handler
	 */
	public native void addAndroidVolup(com.pmt.wrap.titanium.sys.events.TitaniumUIWindowAndroidVolupHandler androidVolup) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.addEventListener('android:volup', function(source, type, globalPoint, y, x) {
			androidVolup.@com.pmt.wrap.titanium.sys.events.TitaniumUIWindowAndroidVolupHandler::androidVolup(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>blur</b>
	 * <p>
	 * fired when the window loses focus
	 * @param blur event handler
	 */
	public native void addBlur(com.pmt.wrap.titanium.sys.events.TitaniumUIWindowBlurHandler blur) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.addEventListener('blur', function(source, type, globalPoint, y, x) {
			blur.@com.pmt.wrap.titanium.sys.events.TitaniumUIWindowBlurHandler::blur(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>click</b>
	 * <p>
	 * fired when the device detects a click (longer than touch) against the view
	 * @param click event handler
	 */
	public native void addClick(com.pmt.wrap.titanium.sys.events.TitaniumUIWindowClickHandler click) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.addEventListener('click', function(source, type, globalPoint, y, x) {
			click.@com.pmt.wrap.titanium.sys.events.TitaniumUIWindowClickHandler::click(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>close</b>
	 * <p>
	 * fired when the window is closed
	 * @param close event handler
	 */
	public native void addClose(com.pmt.wrap.titanium.sys.events.TitaniumUIWindowCloseHandler close) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.addEventListener('close', function(source, type, globalPoint, y, x) {
			close.@com.pmt.wrap.titanium.sys.events.TitaniumUIWindowCloseHandler::close(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>dblclick</b>
	 * <p>
	 * fired when the device detects a double click against the view
	 * @param dblclick event handler
	 */
	public native void addDblclick(com.pmt.wrap.titanium.sys.events.TitaniumUIWindowDblclickHandler dblclick) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.addEventListener('dblclick', function(source, type, globalPoint, y, x) {
			dblclick.@com.pmt.wrap.titanium.sys.events.TitaniumUIWindowDblclickHandler::dblclick(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>doubletap</b>
	 * <p>
	 * fired when the device detects a double tap against the view
	 * @param doubletap event handler
	 */
	public native void addDoubletap(com.pmt.wrap.titanium.sys.events.TitaniumUIWindowDoubletapHandler doubletap) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.addEventListener('doubletap', function(source, type, globalPoint, y, x) {
			doubletap.@com.pmt.wrap.titanium.sys.events.TitaniumUIWindowDoubletapHandler::doubletap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>focus</b>
	 * <p>
	 * fired when the window gains focus
	 * @param focus event handler
	 */
	public native void addFocus(com.pmt.wrap.titanium.sys.events.TitaniumUIWindowFocusHandler focus) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.addEventListener('focus', function(source, type, globalPoint, y, x) {
			focus.@com.pmt.wrap.titanium.sys.events.TitaniumUIWindowFocusHandler::focus(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>open</b>
	 * <p>
	 * fired when the window is opened
	 * @param open event handler
	 */
	public native void addOpen(com.pmt.wrap.titanium.sys.events.TitaniumUIWindowOpenHandler open) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.addEventListener('open', function(source, type, globalPoint, y, x) {
			open.@com.pmt.wrap.titanium.sys.events.TitaniumUIWindowOpenHandler::open(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>singletap</b>
	 * <p>
	 * fired when the device detects a single tap against the view
	 * @param singletap event handler
	 */
	public native void addSingletap(com.pmt.wrap.titanium.sys.events.TitaniumUIWindowSingletapHandler singletap) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.addEventListener('singletap', function(source, type, globalPoint, y, x) {
			singletap.@com.pmt.wrap.titanium.sys.events.TitaniumUIWindowSingletapHandler::singletap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>swipe</b>
	 * <p>
	 * fired when the device detects a swipe (left or right) against the view
	 * @param swipe event handler
	 */
	public native void addSwipe(com.pmt.wrap.titanium.sys.events.TitaniumUIWindowSwipeHandler swipe) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.addEventListener('swipe', function(source, direction, type, globalPoint, y, x) {
			swipe.@com.pmt.wrap.titanium.sys.events.TitaniumUIWindowSwipeHandler::swipe(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, direction, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchcancel</b>
	 * <p>
	 * fired when a touch event is interrupted by the device. this happens in circumenstances such as an incoming call to allow the UI to clean up state.
	 * @param touchcancel event handler
	 */
	public native void addTouchcancel(com.pmt.wrap.titanium.sys.events.TitaniumUIWindowTouchcancelHandler touchcancel) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.addEventListener('touchcancel', function(source, type, globalPoint, y, x) {
			touchcancel.@com.pmt.wrap.titanium.sys.events.TitaniumUIWindowTouchcancelHandler::touchcancel(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchend</b>
	 * <p>
	 * fired when a touch event is completed
	 * @param touchend event handler
	 */
	public native void addTouchend(com.pmt.wrap.titanium.sys.events.TitaniumUIWindowTouchendHandler touchend) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.addEventListener('touchend', function(source, type, globalPoint, y, x) {
			touchend.@com.pmt.wrap.titanium.sys.events.TitaniumUIWindowTouchendHandler::touchend(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchmove</b>
	 * <p>
	 * fired as soon as the device detects movement of a touch.  Event coordinates are always relative to the view in which the initial touch occurred
	 * @param touchmove event handler
	 */
	public native void addTouchmove(com.pmt.wrap.titanium.sys.events.TitaniumUIWindowTouchmoveHandler touchmove) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.addEventListener('touchmove', function(source, type, globalPoint, y, x) {
			touchmove.@com.pmt.wrap.titanium.sys.events.TitaniumUIWindowTouchmoveHandler::touchmove(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchstart</b>
	 * <p>
	 * fired as soon as the device detects a gesture
	 * @param touchstart event handler
	 */
	public native void addTouchstart(com.pmt.wrap.titanium.sys.events.TitaniumUIWindowTouchstartHandler touchstart) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.addEventListener('touchstart', function(source, type, globalPoint, y, x) {
			touchstart.@com.pmt.wrap.titanium.sys.events.TitaniumUIWindowTouchstartHandler::touchstart(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>twofingertap</b>
	 * <p>
	 * fired when the device detects a two-finger tap against the view
	 * @param twofingertap event handler
	 */
	public native void addTwofingertap(com.pmt.wrap.titanium.sys.events.TitaniumUIWindowTwofingertapHandler twofingertap) /*-{
		this.@com.pmt.wrap.titanium.ui.Window::handler.addEventListener('twofingertap', function(source, type, globalPoint, y, x) {
			twofingertap.@com.pmt.wrap.titanium.sys.events.TitaniumUIWindowTwofingertapHandler::twofingertap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
}
