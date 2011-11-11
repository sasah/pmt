package com.pmt.wrap.titanium.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.DashboardView</b>
 * <p>
 * The Dashboard View provides a view that supports the ability to have Springboard-like view of icons which can be reordered by dragging and can contain multiple pages of icons in a scrollable view. The Dashboard View is created by the method Titanium.UI.createDashboardView.
 * <p>
 * <b>Platforms:</b> iphone ipad 
 * <p>
 * <b>Since:</b> 1.2
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> view
 * <p>
 * <b>Returns:</b> null
 */
public class DashboardView {

	private JavaScriptObject handler;

	public DashboardView(JavaScriptObject handler) {
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
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native JavaScriptObject getAnchorPoint() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.anchorPoint;
	}-*/;

	/**
	 * <b>anchorPoint</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the anchor point value. anchor specifies the position by which animation should occur. center is 0.5, 0.5
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setAnchorPoint(JavaScriptObject anchorPoint) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.anchorPoint = anchorPoint;
	}-*/;

	/**
	 * <b>animatedCenterPoint</b> (object)
	 * <p>
	 * read-only object with x and y properties of where the view is during animation
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native JavaScriptObject getAnimatedCenterPoint() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.animatedCenterPoint;
	}-*/;

	/**
	 * <b>animatedCenterPoint</b> (object)
	 * <p>
	 * read-only object with x and y properties of where the view is during animation
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setAnimatedCenterPoint(JavaScriptObject animatedCenterPoint) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.animatedCenterPoint = animatedCenterPoint;
	}-*/;

	/**
	 * <b>backgroundColor</b> (string)
	 * <p>
	 * the background color of the view
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native String getBackgroundColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.backgroundColor;
	}-*/;

	/**
	 * <b>backgroundColor</b> (string)
	 * <p>
	 * the background color of the view
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setBackgroundColor(String backgroundColor) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.backgroundColor = backgroundColor;
	}-*/;

	/**
	 * <b>backgroundDisabledColor</b> (string)
	 * <p>
	 * the disabled background color of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native String getBackgroundDisabledColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.backgroundDisabledColor;
	}-*/;

	/**
	 * <b>backgroundDisabledColor</b> (string)
	 * <p>
	 * the disabled background color of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setBackgroundDisabledColor(String backgroundDisabledColor) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.backgroundDisabledColor = backgroundDisabledColor;
	}-*/;

	/**
	 * <b>backgroundDisabledImage</b> (string)
	 * <p>
	 * the disabled background image url of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native String getBackgroundDisabledImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.backgroundDisabledImage;
	}-*/;

	/**
	 * <b>backgroundDisabledImage</b> (string)
	 * <p>
	 * the disabled background image url of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setBackgroundDisabledImage(String backgroundDisabledImage) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.backgroundDisabledImage = backgroundDisabledImage;
	}-*/;

	/**
	 * <b>backgroundFocusedColor</b> (string)
	 * <p>
	 * the focused background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native String getBackgroundFocusedColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.backgroundFocusedColor;
	}-*/;

	/**
	 * <b>backgroundFocusedColor</b> (string)
	 * <p>
	 * the focused background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setBackgroundFocusedColor(String backgroundFocusedColor) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.backgroundFocusedColor = backgroundFocusedColor;
	}-*/;

	/**
	 * <b>backgroundFocusedImage</b> (string)
	 * <p>
	 * the focused background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native String getBackgroundFocusedImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.backgroundFocusedImage;
	}-*/;

	/**
	 * <b>backgroundFocusedImage</b> (string)
	 * <p>
	 * the focused background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setBackgroundFocusedImage(String backgroundFocusedImage) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.backgroundFocusedImage = backgroundFocusedImage;
	}-*/;

	/**
	 * <b>backgroundGradient</b> (object)
	 * <p>
	 * a background gradient for the view with the properties: type,startPoint,endPoint,startRadius,endRadius,backfillStart,backfillEnd,colors.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native JavaScriptObject getBackgroundGradient() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.backgroundGradient;
	}-*/;

	/**
	 * <b>backgroundGradient</b> (object)
	 * <p>
	 * a background gradient for the view with the properties: type,startPoint,endPoint,startRadius,endRadius,backfillStart,backfillEnd,colors.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setBackgroundGradient(JavaScriptObject backgroundGradient) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.backgroundGradient = backgroundGradient;
	}-*/;

	/**
	 * <b>backgroundImage</b> (string)
	 * <p>
	 * the background image url of the view
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native String getBackgroundImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.backgroundImage;
	}-*/;

	/**
	 * <b>backgroundImage</b> (string)
	 * <p>
	 * the background image url of the view
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setBackgroundImage(String backgroundImage) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.backgroundImage = backgroundImage;
	}-*/;

	/**
	 * <b>backgroundLeftCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the left end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The right end cap is therefore computed by adding the size of the left end cap and the middle portion together and then subtracting that value from the width of the image
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native double getBackgroundLeftCap() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.backgroundLeftCap;
	}-*/;

	/**
	 * <b>backgroundLeftCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the left end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The right end cap is therefore computed by adding the size of the left end cap and the middle portion together and then subtracting that value from the width of the image
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setBackgroundLeftCap(double backgroundLeftCap) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.backgroundLeftCap = backgroundLeftCap;
	}-*/;

	/**
	 * <b>backgroundSelectedColor</b> (string)
	 * <p>
	 * the selected background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native String getBackgroundSelectedColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.backgroundSelectedColor;
	}-*/;

	/**
	 * <b>backgroundSelectedColor</b> (string)
	 * <p>
	 * the selected background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setBackgroundSelectedColor(String backgroundSelectedColor) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.backgroundSelectedColor = backgroundSelectedColor;
	}-*/;

	/**
	 * <b>backgroundSelectedImage</b> (string)
	 * <p>
	 * the selected background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native String getBackgroundSelectedImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.backgroundSelectedImage;
	}-*/;

	/**
	 * <b>backgroundSelectedImage</b> (string)
	 * <p>
	 * the selected background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setBackgroundSelectedImage(String backgroundSelectedImage) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.backgroundSelectedImage = backgroundSelectedImage;
	}-*/;

	/**
	 * <b>backgroundTopCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the top end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The bottom end cap is therefore computed by adding the size of the top end cap and the middle portion together and then subtracting that value from the height of the image
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native double getBackgroundTopCap() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.backgroundTopCap;
	}-*/;

	/**
	 * <b>backgroundTopCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the top end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The bottom end cap is therefore computed by adding the size of the top end cap and the middle portion together and then subtracting that value from the height of the image
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setBackgroundTopCap(double backgroundTopCap) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.backgroundTopCap = backgroundTopCap;
	}-*/;

	/**
	 * <b>borderColor</b> (string)
	 * <p>
	 * the border color of the view
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native String getBorderColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.borderColor;
	}-*/;

	/**
	 * <b>borderColor</b> (string)
	 * <p>
	 * the border color of the view
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setBorderColor(String borderColor) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.borderColor = borderColor;
	}-*/;

	/**
	 * <b>borderRadius</b> (float)
	 * <p>
	 * the border radius of the view
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native double getBorderRadius() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.borderRadius;
	}-*/;

	/**
	 * <b>borderRadius</b> (float)
	 * <p>
	 * the border radius of the view
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setBorderRadius(double borderRadius) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.borderRadius = borderRadius;
	}-*/;

	/**
	 * <b>borderWidth</b> (float)
	 * <p>
	 * the border width of the view
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native double getBorderWidth() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.borderWidth;
	}-*/;

	/**
	 * <b>borderWidth</b> (float)
	 * <p>
	 * the border width of the view
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setBorderWidth(double borderWidth) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.borderWidth = borderWidth;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native double getBottomF() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setBottom(double bottom) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.bottom = bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native String getBottomS() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setBottom(String bottom) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.bottom = bottom;
	}-*/;

	/**
	 * <b>center</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the center of the views position relative to the parent view
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native JavaScriptObject getCenter() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.center;
	}-*/;

	/**
	 * <b>center</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the center of the views position relative to the parent view
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setCenter(JavaScriptObject center) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.center = center;
	}-*/;

	/**
	 * <b>data</b> (array)
	 * <p>
	 * an array of Titanium.UI.DashboardItem objects to display in the view
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native JavaScriptObject getData() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.data;
	}-*/;

	/**
	 * <b>data</b> (array)
	 * <p>
	 * an array of Titanium.UI.DashboardItem objects to display in the view
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setData(JavaScriptObject data) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.data = data;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native double getHeightF() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setHeight(double height) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.height = height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native String getHeightS() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setHeight(String height) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.height = height;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native double getLeftF() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setLeft(double left) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.left = left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native String getLeftS() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setLeft(String left) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.left = left;
	}-*/;

	/**
	 * <b>opacity</b> (float)
	 * <p>
	 * the opacity from 0.0-1.0
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native double getOpacity() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.opacity;
	}-*/;

	/**
	 * <b>opacity</b> (float)
	 * <p>
	 * the opacity from 0.0-1.0
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setOpacity(double opacity) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.opacity = opacity;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native double getRightF() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setRight(double right) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.right = right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native String getRightS() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setRight(String right) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.right = right;
	}-*/;

	/**
	 * <b>size</b> (object)
	 * <p>
	 * the size of the view as a dictionary of width and height properties
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native JavaScriptObject getSize() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.size;
	}-*/;

	/**
	 * <b>size</b> (object)
	 * <p>
	 * the size of the view as a dictionary of width and height properties
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setSize(JavaScriptObject size) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.size = size;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native double getTopF() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setTop(double top) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.top = top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native String getTopS() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setTop(String top) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.top = top;
	}-*/;

	/**
	 * <b>touchEnabled</b> (boolean)
	 * <p>
	 * a boolean indicating if the view should receive touch events (true, default) or forward them to peers (false)
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native boolean getTouchEnabled() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.touchEnabled;
	}-*/;

	/**
	 * <b>touchEnabled</b> (boolean)
	 * <p>
	 * a boolean indicating if the view should receive touch events (true, default) or forward them to peers (false)
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setTouchEnabled(boolean touchEnabled) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.touchEnabled = touchEnabled;
	}-*/;

	/**
	 * <b>transform</b> (object)
	 * <p>
	 * the transformation matrix to apply to the view
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native JavaScriptObject getTransform() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.transform;
	}-*/;

	/**
	 * <b>transform</b> (object)
	 * <p>
	 * the transformation matrix to apply to the view
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setTransform(JavaScriptObject transform) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.transform = transform;
	}-*/;

	/**
	 * <b>visible</b> (boolean)
	 * <p>
	 * a boolean of the visibility of the view
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native boolean getVisible() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.visible;
	}-*/;

	/**
	 * <b>visible</b> (boolean)
	 * <p>
	 * a boolean of the visibility of the view
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setVisible(boolean visible) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.visible = visible;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native double getWidthF() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setWidth(double width) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.width = width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native String getWidthS() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setWidth(String width) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.width = width;
	}-*/;

	/**
	 * <b>wobble</b> (boolean)
	 * <p>
	 * true (default) to wobble during edit, false to disable wobble effect
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native boolean getWobble() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.wobble;
	}-*/;

	/**
	 * <b>wobble</b> (boolean)
	 * <p>
	 * true (default) to wobble during edit, false to disable wobble effect
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setWobble(boolean wobble) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.wobble = wobble;
	}-*/;

	/**
	 * <b>zIndex</b> (int)
	 * <p>
	 * the z index position relative to other sibling views
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native int getZIndex() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.zIndex;
	}-*/;

	/**
	 * <b>zIndex</b> (int)
	 * <p>
	 * the z index position relative to other sibling views
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 */
	public native void setZIndex(int zIndex) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.zIndex = zIndex;
	}-*/;

	/**
	 * <b>add</b>
	 * <p>
	 * add a child to the view hierarchy
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 * @param view (object) the view to add to this views hiearchy
	 * @return void
	 */
	 public native void add(JavaScriptObject view) /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.add(view);
	}-*/;

	/**
	 * <b>addEventListener</b>
	 * <p>
	 * add an event listener for the instance to receive view triggered events
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public native void addEventListener(String name, JavaScriptObject callback) /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>animate</b>
	 * <p>
	 * animate the view
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 * @param obj (object) either a dictionary of animation properties or an Animation object
	 * @param callback (function) function to be invoked upon completion of the animation
	 * @return void
	 */
	 public native void animate(JavaScriptObject obj, JavaScriptObject callback) /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.animate(obj, callback);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public native void fireEvent(String name, JavaScriptObject event) /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.fireEvent(name, event);
	}-*/;

	/**
	 * <b>hide</b>
	 * <p>
	 * hide the view
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 * @return void
	 */
	 public native void hide() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.hide();
	}-*/;

	/**
	 * <b>remove</b>
	 * <p>
	 * remove a previously add view from the view hiearchy
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 * @param view (object) the view to remove from this views hiearchy
	 * @return void
	 */
	 public native void remove(JavaScriptObject view) /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.remove(view);
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public native void removeEventListener(String name, JavaScriptObject callback) /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>show</b>
	 * <p>
	 * make the view visible
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 * @return void
	 */
	 public native void show() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.show();
	}-*/;

	/**
	 * <b>startEditing</b>
	 * <p>
	 * put the dashboard in edit mode
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 * @return void
	 */
	 public native void startEditing() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.startEditing();
	}-*/;

	/**
	 * <b>stopEditing</b>
	 * <p>
	 * cancel editing
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 * @return void
	 */
	 public native void stopEditing() /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.stopEditing();
	}-*/;

	/**
	 * <b>toImage</b>
	 * <p>
	 * return a Blob image of the rendered view
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.2
	 * @param f (function) function to be invoked upon completion. if non-null, this method will be performed asynchronously. if null, it will be performed immediately
	 * @return object
	 */
	 public native JavaScriptObject toImage(JavaScriptObject f) /*-{
		return this.@com.pmt.wrap.titanium.ui.DashboardView::handler.toImage(f);
	}-*/;
	

	/**
	 * <b>click</b>
	 * <p>
	 * fired when the device detects a click (longer than touch) against the view
	 * @param click event handler
	 */
	public native void addClick(com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewClickHandler click) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.addEventListener('click', function(source, location, item, type, globalPoint, y, x) {
			click.@com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewClickHandler::click(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, location, item, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>commit</b>
	 * <p>
	 * fired when editing ends
	 * @param commit event handler
	 */
	public native void addCommit(com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewCommitHandler commit) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.addEventListener('commit', function(source, type, globalPoint, y, x) {
			commit.@com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewCommitHandler::commit(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>dblclick</b>
	 * <p>
	 * fired when the device detects a double click against the view
	 * @param dblclick event handler
	 */
	public native void addDblclick(com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewDblclickHandler dblclick) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.addEventListener('dblclick', function(source, type, globalPoint, y, x) {
			dblclick.@com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewDblclickHandler::dblclick(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>delete</b>
	 * <p>
	 * fired when a  Titanium.UI.DashboardItem is deleted during editings
	 * @param deleteEvent event handler
	 */
	public native void addDelete(com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewDeleteHandler deleteEvent) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.addEventListener('delete', function(source, item, type, globalPoint, y, x) {
			deleteEvent.@com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewDeleteHandler::delete(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, item, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>doubletap</b>
	 * <p>
	 * fired when the device detects a double tap against the view
	 * @param doubletap event handler
	 */
	public native void addDoubletap(com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewDoubletapHandler doubletap) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.addEventListener('doubletap', function(source, type, globalPoint, y, x) {
			doubletap.@com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewDoubletapHandler::doubletap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>edit</b>
	 * <p>
	 * fired when editing begins
	 * @param edit event handler
	 */
	public native void addEdit(com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewEditHandler edit) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.addEventListener('edit', function(source, type, globalPoint, y, x) {
			edit.@com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewEditHandler::edit(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>move</b>
	 * <p>
	 * fired when a  Titanium.UI.DashboardItem is moved during editing
	 * @param move event handler
	 */
	public native void addMove(com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewMoveHandler move) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.addEventListener('move', function(source, items, item, type, globalPoint, y, x) {
			move.@com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewMoveHandler::move(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, items, item, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>singletap</b>
	 * <p>
	 * fired when the device detects a single tap against the view
	 * @param singletap event handler
	 */
	public native void addSingletap(com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewSingletapHandler singletap) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.addEventListener('singletap', function(source, type, globalPoint, y, x) {
			singletap.@com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewSingletapHandler::singletap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>swipe</b>
	 * <p>
	 * fired when the device detects a swipe (left or right) against the view
	 * @param swipe event handler
	 */
	public native void addSwipe(com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewSwipeHandler swipe) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.addEventListener('swipe', function(source, direction, type, globalPoint, y, x) {
			swipe.@com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewSwipeHandler::swipe(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, direction, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchcancel</b>
	 * <p>
	 * fired when a touch event is interrupted by the device. this happens in circumenstances such as an incoming call to allow the UI to clean up state.
	 * @param touchcancel event handler
	 */
	public native void addTouchcancel(com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewTouchcancelHandler touchcancel) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.addEventListener('touchcancel', function(source, type, globalPoint, y, x) {
			touchcancel.@com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewTouchcancelHandler::touchcancel(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchend</b>
	 * <p>
	 * fired when a touch event is completed
	 * @param touchend event handler
	 */
	public native void addTouchend(com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewTouchendHandler touchend) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.addEventListener('touchend', function(source, type, globalPoint, y, x) {
			touchend.@com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewTouchendHandler::touchend(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchmove</b>
	 * <p>
	 * fired as soon as the device detects movement of a touch.  Event coordinates are always relative to the view in which the initial touch occurred
	 * @param touchmove event handler
	 */
	public native void addTouchmove(com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewTouchmoveHandler touchmove) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.addEventListener('touchmove', function(source, type, globalPoint, y, x) {
			touchmove.@com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewTouchmoveHandler::touchmove(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchstart</b>
	 * <p>
	 * fired as soon as the device detects a gesture
	 * @param touchstart event handler
	 */
	public native void addTouchstart(com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewTouchstartHandler touchstart) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.addEventListener('touchstart', function(source, type, globalPoint, y, x) {
			touchstart.@com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewTouchstartHandler::touchstart(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>twofingertap</b>
	 * <p>
	 * fired when the device detects a two-finger tap against the view
	 * @param twofingertap event handler
	 */
	public native void addTwofingertap(com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewTwofingertapHandler twofingertap) /*-{
		this.@com.pmt.wrap.titanium.ui.DashboardView::handler.addEventListener('twofingertap', function(source, type, globalPoint, y, x) {
			twofingertap.@com.pmt.wrap.titanium.sys.events.TitaniumUIDashboardViewTwofingertapHandler::twofingertap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
}
