package com.pmt.wrap.titanium.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.ScrollView</b>
 * <p>
 * A Scroll View is used to create a scrollable region of content.  Views added to the Scroll View will be scrolled based on the content size of the Scroll View. The Scroll View is created by the method Titanium.UI.createScrollView. Note: In Android, Scroll Views can only scroll in one direction, either vertical or horizontal, but not both at the same time. See the Titanium.UI.ScrollView.scrollType property
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
public class ScrollView {

	private JavaScriptObject handler;

	public ScrollView(JavaScriptObject handler) {
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
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.anchorPoint;
	}-*/;

	/**
	 * <b>anchorPoint</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the anchor point value. anchor specifies the position by which animation should occur. center is 0.5, 0.5
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setAnchorPoint(JavaScriptObject anchorPoint) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.anchorPoint = anchorPoint;
	}-*/;

	/**
	 * <b>animatedCenterPoint</b> (object)
	 * <p>
	 * read-only object with x and y properties of where the view is during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getAnimatedCenterPoint() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.animatedCenterPoint;
	}-*/;

	/**
	 * <b>animatedCenterPoint</b> (object)
	 * <p>
	 * read-only object with x and y properties of where the view is during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setAnimatedCenterPoint(JavaScriptObject animatedCenterPoint) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.animatedCenterPoint = animatedCenterPoint;
	}-*/;

	/**
	 * <b>backgroundColor</b> (string)
	 * <p>
	 * the background color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.backgroundColor;
	}-*/;

	/**
	 * <b>backgroundColor</b> (string)
	 * <p>
	 * the background color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundColor(String backgroundColor) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.backgroundColor = backgroundColor;
	}-*/;

	/**
	 * <b>backgroundDisabledColor</b> (string)
	 * <p>
	 * the disabled background color of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundDisabledColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.backgroundDisabledColor;
	}-*/;

	/**
	 * <b>backgroundDisabledColor</b> (string)
	 * <p>
	 * the disabled background color of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundDisabledColor(String backgroundDisabledColor) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.backgroundDisabledColor = backgroundDisabledColor;
	}-*/;

	/**
	 * <b>backgroundDisabledImage</b> (string)
	 * <p>
	 * the disabled background image url of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundDisabledImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.backgroundDisabledImage;
	}-*/;

	/**
	 * <b>backgroundDisabledImage</b> (string)
	 * <p>
	 * the disabled background image url of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundDisabledImage(String backgroundDisabledImage) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.backgroundDisabledImage = backgroundDisabledImage;
	}-*/;

	/**
	 * <b>backgroundFocusedColor</b> (string)
	 * <p>
	 * the focused background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundFocusedColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.backgroundFocusedColor;
	}-*/;

	/**
	 * <b>backgroundFocusedColor</b> (string)
	 * <p>
	 * the focused background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundFocusedColor(String backgroundFocusedColor) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.backgroundFocusedColor = backgroundFocusedColor;
	}-*/;

	/**
	 * <b>backgroundFocusedImage</b> (string)
	 * <p>
	 * the focused background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundFocusedImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.backgroundFocusedImage;
	}-*/;

	/**
	 * <b>backgroundFocusedImage</b> (string)
	 * <p>
	 * the focused background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundFocusedImage(String backgroundFocusedImage) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.backgroundFocusedImage = backgroundFocusedImage;
	}-*/;

	/**
	 * <b>backgroundGradient</b> (object)
	 * <p>
	 * a background gradient for the view with the properties: type,startPoint,endPoint,startRadius,endRadius,backfillStart,backfillEnd,colors.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getBackgroundGradient() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.backgroundGradient;
	}-*/;

	/**
	 * <b>backgroundGradient</b> (object)
	 * <p>
	 * a background gradient for the view with the properties: type,startPoint,endPoint,startRadius,endRadius,backfillStart,backfillEnd,colors.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundGradient(JavaScriptObject backgroundGradient) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.backgroundGradient = backgroundGradient;
	}-*/;

	/**
	 * <b>backgroundImage</b> (string)
	 * <p>
	 * the background image url of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.backgroundImage;
	}-*/;

	/**
	 * <b>backgroundImage</b> (string)
	 * <p>
	 * the background image url of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundImage(String backgroundImage) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.backgroundImage = backgroundImage;
	}-*/;

	/**
	 * <b>backgroundLeftCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the left end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The right end cap is therefore computed by adding the size of the left end cap and the middle portion together and then subtracting that value from the width of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getBackgroundLeftCap() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.backgroundLeftCap;
	}-*/;

	/**
	 * <b>backgroundLeftCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the left end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The right end cap is therefore computed by adding the size of the left end cap and the middle portion together and then subtracting that value from the width of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundLeftCap(double backgroundLeftCap) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.backgroundLeftCap = backgroundLeftCap;
	}-*/;

	/**
	 * <b>backgroundSelectedColor</b> (string)
	 * <p>
	 * the selected background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundSelectedColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.backgroundSelectedColor;
	}-*/;

	/**
	 * <b>backgroundSelectedColor</b> (string)
	 * <p>
	 * the selected background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundSelectedColor(String backgroundSelectedColor) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.backgroundSelectedColor = backgroundSelectedColor;
	}-*/;

	/**
	 * <b>backgroundSelectedImage</b> (string)
	 * <p>
	 * the selected background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundSelectedImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.backgroundSelectedImage;
	}-*/;

	/**
	 * <b>backgroundSelectedImage</b> (string)
	 * <p>
	 * the selected background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundSelectedImage(String backgroundSelectedImage) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.backgroundSelectedImage = backgroundSelectedImage;
	}-*/;

	/**
	 * <b>backgroundTopCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the top end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The bottom end cap is therefore computed by adding the size of the top end cap and the middle portion together and then subtracting that value from the height of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getBackgroundTopCap() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.backgroundTopCap;
	}-*/;

	/**
	 * <b>backgroundTopCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the top end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The bottom end cap is therefore computed by adding the size of the top end cap and the middle portion together and then subtracting that value from the height of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundTopCap(double backgroundTopCap) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.backgroundTopCap = backgroundTopCap;
	}-*/;

	/**
	 * <b>borderColor</b> (string)
	 * <p>
	 * the border color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBorderColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.borderColor;
	}-*/;

	/**
	 * <b>borderColor</b> (string)
	 * <p>
	 * the border color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBorderColor(String borderColor) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.borderColor = borderColor;
	}-*/;

	/**
	 * <b>borderRadius</b> (float)
	 * <p>
	 * the border radius of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getBorderRadius() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.borderRadius;
	}-*/;

	/**
	 * <b>borderRadius</b> (float)
	 * <p>
	 * the border radius of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBorderRadius(double borderRadius) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.borderRadius = borderRadius;
	}-*/;

	/**
	 * <b>borderWidth</b> (float)
	 * <p>
	 * the border width of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getBorderWidth() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.borderWidth;
	}-*/;

	/**
	 * <b>borderWidth</b> (float)
	 * <p>
	 * the border width of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBorderWidth(double borderWidth) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.borderWidth = borderWidth;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getBottomF() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBottom(double bottom) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.bottom = bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBottomS() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBottom(String bottom) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.bottom = bottom;
	}-*/;

	/**
	 * <b>canCancelEvents</b> (boolean)
	 * <p>
	 * (iPhone only) boolean to indicate if the scroll view can cancel subview touches in order to scroll instead. Default of true
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getCanCancelEvents() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.canCancelEvents;
	}-*/;

	/**
	 * <b>canCancelEvents</b> (boolean)
	 * <p>
	 * (iPhone only) boolean to indicate if the scroll view can cancel subview touches in order to scroll instead. Default of true
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setCanCancelEvents(boolean canCancelEvents) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.canCancelEvents = canCancelEvents;
	}-*/;

	/**
	 * <b>center</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the center of the views position relative to the parent view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getCenter() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.center;
	}-*/;

	/**
	 * <b>center</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the center of the views position relative to the parent view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setCenter(JavaScriptObject center) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.center = center;
	}-*/;

	/**
	 * <b>contentHeight</b> (float)
	 * <p>
	 * the height of the scrollable area
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getContentHeight() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.contentHeight;
	}-*/;

	/**
	 * <b>contentHeight</b> (float)
	 * <p>
	 * the height of the scrollable area
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setContentHeight(double contentHeight) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.contentHeight = contentHeight;
	}-*/;

	/**
	 * <b>contentOffset</b> (object)
	 * <p>
	 * an object (with x and y properties) to indicate the offset of the content area
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getContentOffset() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.contentOffset;
	}-*/;

	/**
	 * <b>contentOffset</b> (object)
	 * <p>
	 * an object (with x and y properties) to indicate the offset of the content area
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setContentOffset(JavaScriptObject contentOffset) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.contentOffset = contentOffset;
	}-*/;

	/**
	 * <b>contentWidth</b> (float)
	 * <p>
	 * the width of the scrollable area
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getContentWidth() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.contentWidth;
	}-*/;

	/**
	 * <b>contentWidth</b> (float)
	 * <p>
	 * the width of the scrollable area
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setContentWidth(double contentWidth) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.contentWidth = contentWidth;
	}-*/;

	/**
	 * <b>disableBounce</b> (boolean)
	 * <p>
	 * boolean to control bounce during scrolling
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getDisableBounce() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.disableBounce;
	}-*/;

	/**
	 * <b>disableBounce</b> (boolean)
	 * <p>
	 * boolean to control bounce during scrolling
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setDisableBounce(boolean disableBounce) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.disableBounce = disableBounce;
	}-*/;

	/**
	 * <b>focusable</b> (boolean)
	 * <p>
	 * Set true if you want a view to be focusable when navigating with the trackball or D-Pad. Default: false. (Android Only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.9
	 */
	public native boolean getFocusable() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.focusable;
	}-*/;

	/**
	 * <b>focusable</b> (boolean)
	 * <p>
	 * Set true if you want a view to be focusable when navigating with the trackball or D-Pad. Default: false. (Android Only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.9
	 */
	public native void setFocusable(boolean focusable) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.focusable = focusable;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getHeightF() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setHeight(double height) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.height = height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getHeightS() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setHeight(String height) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.height = height;
	}-*/;

	/**
	 * <b>horizontalBounce</b> (boolean)
	 * <p>
	 * boolean to control the horizontal bounce during scrolling
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getHorizontalBounce() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.horizontalBounce;
	}-*/;

	/**
	 * <b>horizontalBounce</b> (boolean)
	 * <p>
	 * boolean to control the horizontal bounce during scrolling
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setHorizontalBounce(boolean horizontalBounce) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.horizontalBounce = horizontalBounce;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getLeftF() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setLeft(double left) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.left = left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getLeftS() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setLeft(String left) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.left = left;
	}-*/;

	/**
	 * <b>maxZoomScale</b> (float)
	 * <p>
	 * the maximum scale of the content
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getMaxZoomScale() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.maxZoomScale;
	}-*/;

	/**
	 * <b>maxZoomScale</b> (float)
	 * <p>
	 * the maximum scale of the content
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setMaxZoomScale(double maxZoomScale) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.maxZoomScale = maxZoomScale;
	}-*/;

	/**
	 * <b>minZoomScale</b> (float)
	 * <p>
	 * the minimum scale of the content
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getMinZoomScale() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.minZoomScale;
	}-*/;

	/**
	 * <b>minZoomScale</b> (float)
	 * <p>
	 * the minimum scale of the content
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setMinZoomScale(double minZoomScale) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.minZoomScale = minZoomScale;
	}-*/;

	/**
	 * <b>opacity</b> (float)
	 * <p>
	 * the opacity from 0.0-1.0
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getOpacity() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.opacity;
	}-*/;

	/**
	 * <b>opacity</b> (float)
	 * <p>
	 * the opacity from 0.0-1.0
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setOpacity(double opacity) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.opacity = opacity;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getRightF() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setRight(double right) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.right = right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getRightS() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setRight(String right) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.right = right;
	}-*/;

	/**
	 * <b>scrollType</b> (string)
	 * <p>
	 * (Android only) the type of ScrollView: "vertical" or "horizontal"
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getScrollType() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.scrollType;
	}-*/;

	/**
	 * <b>scrollType</b> (string)
	 * <p>
	 * (Android only) the type of ScrollView: "vertical" or "horizontal"
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setScrollType(String scrollType) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.scrollType = scrollType;
	}-*/;

	/**
	 * <b>showHorizontalScrollIndicator</b> (boolean)
	 * <p>
	 * boolean to indicate whether the horizontal scroll indicator is visible
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getShowHorizontalScrollIndicator() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.showHorizontalScrollIndicator;
	}-*/;

	/**
	 * <b>showHorizontalScrollIndicator</b> (boolean)
	 * <p>
	 * boolean to indicate whether the horizontal scroll indicator is visible
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setShowHorizontalScrollIndicator(boolean showHorizontalScrollIndicator) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.showHorizontalScrollIndicator = showHorizontalScrollIndicator;
	}-*/;

	/**
	 * <b>showVerticalScrollIndicator</b> (boolean)
	 * <p>
	 * boolean to indicate whether the vertical scroll indicator is visible
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getShowVerticalScrollIndicator() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.showVerticalScrollIndicator;
	}-*/;

	/**
	 * <b>showVerticalScrollIndicator</b> (boolean)
	 * <p>
	 * boolean to indicate whether the vertical scroll indicator is visible
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setShowVerticalScrollIndicator(boolean showVerticalScrollIndicator) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.showVerticalScrollIndicator = showVerticalScrollIndicator;
	}-*/;

	/**
	 * <b>size</b> (object)
	 * <p>
	 * the size of the view as a dictionary of width and height properties
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getSize() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.size;
	}-*/;

	/**
	 * <b>size</b> (object)
	 * <p>
	 * the size of the view as a dictionary of width and height properties
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setSize(JavaScriptObject size) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.size = size;
	}-*/;

	/**
	 * <b>softKeyboardOnFocus</b> (int)
	 * <p>
	 * One of Titanium.UI.Android.SOFT_KEYBOARD_DEFAULT_ON_FOCUS, Titanium.UI.Android.SOFT_KEYBOARD_HIDE_ON_FOCUS, or Titanium.UI.Android.SOFT_KEYBOARD_SHOW_ON_FOCUS. (Android only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.9
	 */
	public native int getSoftKeyboardOnFocus() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.softKeyboardOnFocus;
	}-*/;

	/**
	 * <b>softKeyboardOnFocus</b> (int)
	 * <p>
	 * One of Titanium.UI.Android.SOFT_KEYBOARD_DEFAULT_ON_FOCUS, Titanium.UI.Android.SOFT_KEYBOARD_HIDE_ON_FOCUS, or Titanium.UI.Android.SOFT_KEYBOARD_SHOW_ON_FOCUS. (Android only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.9
	 */
	public native void setSoftKeyboardOnFocus(int softKeyboardOnFocus) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.softKeyboardOnFocus = softKeyboardOnFocus;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getTopF() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTop(double top) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.top = top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getTopS() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTop(String top) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.top = top;
	}-*/;

	/**
	 * <b>touchEnabled</b> (boolean)
	 * <p>
	 * a boolean indicating if the view should receive touch events (true, default) or forward them to peers (false)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getTouchEnabled() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.touchEnabled;
	}-*/;

	/**
	 * <b>touchEnabled</b> (boolean)
	 * <p>
	 * a boolean indicating if the view should receive touch events (true, default) or forward them to peers (false)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTouchEnabled(boolean touchEnabled) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.touchEnabled = touchEnabled;
	}-*/;

	/**
	 * <b>transform</b> (object)
	 * <p>
	 * the transformation matrix to apply to the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getTransform() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.transform;
	}-*/;

	/**
	 * <b>transform</b> (object)
	 * <p>
	 * the transformation matrix to apply to the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTransform(JavaScriptObject transform) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.transform = transform;
	}-*/;

	/**
	 * <b>verticalBounce</b> (boolean)
	 * <p>
	 * boolean to control the vertical bounce during scrolling
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getVerticalBounce() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.verticalBounce;
	}-*/;

	/**
	 * <b>verticalBounce</b> (boolean)
	 * <p>
	 * boolean to control the vertical bounce during scrolling
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setVerticalBounce(boolean verticalBounce) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.verticalBounce = verticalBounce;
	}-*/;

	/**
	 * <b>visible</b> (boolean)
	 * <p>
	 * a boolean of the visibility of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getVisible() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.visible;
	}-*/;

	/**
	 * <b>visible</b> (boolean)
	 * <p>
	 * a boolean of the visibility of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setVisible(boolean visible) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.visible = visible;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getWidthF() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setWidth(double width) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.width = width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getWidthS() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setWidth(String width) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.width = width;
	}-*/;

	/**
	 * <b>zIndex</b> (int)
	 * <p>
	 * the z index position relative to other sibling views
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native int getZIndex() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.zIndex;
	}-*/;

	/**
	 * <b>zIndex</b> (int)
	 * <p>
	 * the z index position relative to other sibling views
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setZIndex(int zIndex) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.zIndex = zIndex;
	}-*/;

	/**
	 * <b>zoomScale</b> (float)
	 * <p>
	 * set the zoom scale for the current content area
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getZoomScale() /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.zoomScale;
	}-*/;

	/**
	 * <b>zoomScale</b> (float)
	 * <p>
	 * set the zoom scale for the current content area
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setZoomScale(double zoomScale) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.zoomScale = zoomScale;
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
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.add(view);
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
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.addEventListener(name, callback);
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
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.animate(obj, callback);
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
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.fireEvent(name, event);
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
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.hide();
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
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.remove(view);
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
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>scrollTo</b>
	 * <p>
	 * scrollTo a particular point
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param x (float) the x point within the view
	 * @param y (float) the y point within the view
	 * @return void
	 */
	 public native void scrollTo(double x, double y) /*-{
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.scrollTo(x, y);
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
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.show();
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
		return this.@com.pmt.wrap.titanium.ui.ScrollView::handler.toImage(f);
	}-*/;
	

	/**
	 * <b>click</b>
	 * <p>
	 * fired when the device detects a click (longer than touch) against the view
	 * @param click event handler
	 */
	public native void addClick(com.pmt.wrap.titanium.sys.events.TitaniumUIScrollViewClickHandler click) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.addEventListener('click', function(source, type, globalPoint, y, x) {
			click.@com.pmt.wrap.titanium.sys.events.TitaniumUIScrollViewClickHandler::click(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>dblclick</b>
	 * <p>
	 * fired when the device detects a double click against the view
	 * @param dblclick event handler
	 */
	public native void addDblclick(com.pmt.wrap.titanium.sys.events.TitaniumUIScrollViewDblclickHandler dblclick) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.addEventListener('dblclick', function(source, type, globalPoint, y, x) {
			dblclick.@com.pmt.wrap.titanium.sys.events.TitaniumUIScrollViewDblclickHandler::dblclick(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>doubletap</b>
	 * <p>
	 * fired when the device detects a double tap against the view
	 * @param doubletap event handler
	 */
	public native void addDoubletap(com.pmt.wrap.titanium.sys.events.TitaniumUIScrollViewDoubletapHandler doubletap) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.addEventListener('doubletap', function(source, type, globalPoint, y, x) {
			doubletap.@com.pmt.wrap.titanium.sys.events.TitaniumUIScrollViewDoubletapHandler::doubletap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>scale</b>
	 * <p>
	 * fired when the zoom scale factor changes
	 * @param scale event handler
	 */
	public native void addScale(com.pmt.wrap.titanium.sys.events.TitaniumUIScrollViewScaleHandler scale) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.addEventListener('scale', function(scale, source, type, globalPoint, y, x) {
			scale.@com.pmt.wrap.titanium.sys.events.TitaniumUIScrollViewScaleHandler::scale(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(scale, source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>scroll</b>
	 * <p>
	 * fired when the view is scrolled
	 * @param scroll event handler
	 */
	public native void addScroll(com.pmt.wrap.titanium.sys.events.TitaniumUIScrollViewScrollHandler scroll) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.addEventListener('scroll', function(dragging, source, decelerating, type, globalPoint, y, x) {
			scroll.@com.pmt.wrap.titanium.sys.events.TitaniumUIScrollViewScrollHandler::scroll(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(dragging, source, decelerating, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>singletap</b>
	 * <p>
	 * fired when the device detects a single tap against the view
	 * @param singletap event handler
	 */
	public native void addSingletap(com.pmt.wrap.titanium.sys.events.TitaniumUIScrollViewSingletapHandler singletap) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.addEventListener('singletap', function(source, type, globalPoint, y, x) {
			singletap.@com.pmt.wrap.titanium.sys.events.TitaniumUIScrollViewSingletapHandler::singletap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>swipe</b>
	 * <p>
	 * fired when the device detects a swipe (left or right) against the view
	 * @param swipe event handler
	 */
	public native void addSwipe(com.pmt.wrap.titanium.sys.events.TitaniumUIScrollViewSwipeHandler swipe) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.addEventListener('swipe', function(source, direction, type, globalPoint, y, x) {
			swipe.@com.pmt.wrap.titanium.sys.events.TitaniumUIScrollViewSwipeHandler::swipe(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, direction, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchcancel</b>
	 * <p>
	 * fired when a touch event is interrupted by the device. this happens in circumenstances such as an incoming call to allow the UI to clean up state.
	 * @param touchcancel event handler
	 */
	public native void addTouchcancel(com.pmt.wrap.titanium.sys.events.TitaniumUIScrollViewTouchcancelHandler touchcancel) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.addEventListener('touchcancel', function(source, type, globalPoint, y, x) {
			touchcancel.@com.pmt.wrap.titanium.sys.events.TitaniumUIScrollViewTouchcancelHandler::touchcancel(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchend</b>
	 * <p>
	 * fired when a touch event is completed
	 * @param touchend event handler
	 */
	public native void addTouchend(com.pmt.wrap.titanium.sys.events.TitaniumUIScrollViewTouchendHandler touchend) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.addEventListener('touchend', function(source, type, globalPoint, y, x) {
			touchend.@com.pmt.wrap.titanium.sys.events.TitaniumUIScrollViewTouchendHandler::touchend(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchmove</b>
	 * <p>
	 * fired as soon as the device detects movement of a touch.  Event coordinates are always relative to the view in which the initial touch occurred
	 * @param touchmove event handler
	 */
	public native void addTouchmove(com.pmt.wrap.titanium.sys.events.TitaniumUIScrollViewTouchmoveHandler touchmove) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.addEventListener('touchmove', function(source, type, globalPoint, y, x) {
			touchmove.@com.pmt.wrap.titanium.sys.events.TitaniumUIScrollViewTouchmoveHandler::touchmove(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchstart</b>
	 * <p>
	 * fired as soon as the device detects a gesture
	 * @param touchstart event handler
	 */
	public native void addTouchstart(com.pmt.wrap.titanium.sys.events.TitaniumUIScrollViewTouchstartHandler touchstart) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.addEventListener('touchstart', function(source, type, globalPoint, y, x) {
			touchstart.@com.pmt.wrap.titanium.sys.events.TitaniumUIScrollViewTouchstartHandler::touchstart(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>twofingertap</b>
	 * <p>
	 * fired when the device detects a two-finger tap against the view
	 * @param twofingertap event handler
	 */
	public native void addTwofingertap(com.pmt.wrap.titanium.sys.events.TitaniumUIScrollViewTwofingertapHandler twofingertap) /*-{
		this.@com.pmt.wrap.titanium.ui.ScrollView::handler.addEventListener('twofingertap', function(source, type, globalPoint, y, x) {
			twofingertap.@com.pmt.wrap.titanium.sys.events.TitaniumUIScrollViewTwofingertapHandler::twofingertap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
}
