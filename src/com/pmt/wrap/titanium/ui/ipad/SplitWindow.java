package com.pmt.wrap.titanium.ui.ipad;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.iPad.SplitWindow</b>
 * <p>
 * A SplitWindow is a window that manages the presentation of two side-by-side view controllers. You use this class to implement a master-detail interface, in which the left-side view presents a list of items and the right-side presents details of the selected item. The SplitView is for use exclusively on iPad devices. The SplitWindow is created by the method Titanium.UI.iPad.createSplitWindow.
 * <p>
 * <b>Platforms:</b> ipad 
 * <p>
 * <b>Since:</b> 1.2
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> view
 * <p>
 * <b>Returns:</b> null
 */
public class SplitWindow {

	private JavaScriptObject handler;

	public SplitWindow(JavaScriptObject handler) {
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
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native JavaScriptObject getAnchorPoint() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.anchorPoint;
	}-*/;

	/**
	 * <b>anchorPoint</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the anchor point value. anchor specifies the position by which animation should occur. center is 0.5, 0.5
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setAnchorPoint(JavaScriptObject anchorPoint) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.anchorPoint = anchorPoint;
	}-*/;

	/**
	 * <b>animatedCenterPoint</b> (object)
	 * <p>
	 * read-only object with x and y properties of where the view is during animation
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native JavaScriptObject getAnimatedCenterPoint() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.animatedCenterPoint;
	}-*/;

	/**
	 * <b>animatedCenterPoint</b> (object)
	 * <p>
	 * read-only object with x and y properties of where the view is during animation
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setAnimatedCenterPoint(JavaScriptObject animatedCenterPoint) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.animatedCenterPoint = animatedCenterPoint;
	}-*/;

	/**
	 * <b>backgroundColor</b> (string)
	 * <p>
	 * the background color of the view
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native String getBackgroundColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.backgroundColor;
	}-*/;

	/**
	 * <b>backgroundColor</b> (string)
	 * <p>
	 * the background color of the view
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setBackgroundColor(String backgroundColor) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.backgroundColor = backgroundColor;
	}-*/;

	/**
	 * <b>backgroundDisabledColor</b> (string)
	 * <p>
	 * the disabled background color of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native String getBackgroundDisabledColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.backgroundDisabledColor;
	}-*/;

	/**
	 * <b>backgroundDisabledColor</b> (string)
	 * <p>
	 * the disabled background color of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setBackgroundDisabledColor(String backgroundDisabledColor) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.backgroundDisabledColor = backgroundDisabledColor;
	}-*/;

	/**
	 * <b>backgroundDisabledImage</b> (string)
	 * <p>
	 * the disabled background image url of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native String getBackgroundDisabledImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.backgroundDisabledImage;
	}-*/;

	/**
	 * <b>backgroundDisabledImage</b> (string)
	 * <p>
	 * the disabled background image url of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setBackgroundDisabledImage(String backgroundDisabledImage) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.backgroundDisabledImage = backgroundDisabledImage;
	}-*/;

	/**
	 * <b>backgroundFocusedColor</b> (string)
	 * <p>
	 * the focused background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native String getBackgroundFocusedColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.backgroundFocusedColor;
	}-*/;

	/**
	 * <b>backgroundFocusedColor</b> (string)
	 * <p>
	 * the focused background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setBackgroundFocusedColor(String backgroundFocusedColor) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.backgroundFocusedColor = backgroundFocusedColor;
	}-*/;

	/**
	 * <b>backgroundFocusedImage</b> (string)
	 * <p>
	 * the focused background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native String getBackgroundFocusedImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.backgroundFocusedImage;
	}-*/;

	/**
	 * <b>backgroundFocusedImage</b> (string)
	 * <p>
	 * the focused background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setBackgroundFocusedImage(String backgroundFocusedImage) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.backgroundFocusedImage = backgroundFocusedImage;
	}-*/;

	/**
	 * <b>backgroundGradient</b> (object)
	 * <p>
	 * a background gradient for the view with the properties: type,startPoint,endPoint,startRadius,endRadius,backfillStart,backfillEnd,colors.
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native JavaScriptObject getBackgroundGradient() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.backgroundGradient;
	}-*/;

	/**
	 * <b>backgroundGradient</b> (object)
	 * <p>
	 * a background gradient for the view with the properties: type,startPoint,endPoint,startRadius,endRadius,backfillStart,backfillEnd,colors.
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setBackgroundGradient(JavaScriptObject backgroundGradient) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.backgroundGradient = backgroundGradient;
	}-*/;

	/**
	 * <b>backgroundImage</b> (string)
	 * <p>
	 * the background image url of the view
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native String getBackgroundImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.backgroundImage;
	}-*/;

	/**
	 * <b>backgroundImage</b> (string)
	 * <p>
	 * the background image url of the view
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setBackgroundImage(String backgroundImage) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.backgroundImage = backgroundImage;
	}-*/;

	/**
	 * <b>backgroundLeftCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the left end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The right end cap is therefore computed by adding the size of the left end cap and the middle portion together and then subtracting that value from the width of the image
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native double getBackgroundLeftCap() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.backgroundLeftCap;
	}-*/;

	/**
	 * <b>backgroundLeftCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the left end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The right end cap is therefore computed by adding the size of the left end cap and the middle portion together and then subtracting that value from the width of the image
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setBackgroundLeftCap(double backgroundLeftCap) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.backgroundLeftCap = backgroundLeftCap;
	}-*/;

	/**
	 * <b>backgroundSelectedColor</b> (string)
	 * <p>
	 * the selected background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native String getBackgroundSelectedColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.backgroundSelectedColor;
	}-*/;

	/**
	 * <b>backgroundSelectedColor</b> (string)
	 * <p>
	 * the selected background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setBackgroundSelectedColor(String backgroundSelectedColor) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.backgroundSelectedColor = backgroundSelectedColor;
	}-*/;

	/**
	 * <b>backgroundSelectedImage</b> (string)
	 * <p>
	 * the selected background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native String getBackgroundSelectedImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.backgroundSelectedImage;
	}-*/;

	/**
	 * <b>backgroundSelectedImage</b> (string)
	 * <p>
	 * the selected background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setBackgroundSelectedImage(String backgroundSelectedImage) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.backgroundSelectedImage = backgroundSelectedImage;
	}-*/;

	/**
	 * <b>backgroundTopCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the top end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The bottom end cap is therefore computed by adding the size of the top end cap and the middle portion together and then subtracting that value from the height of the image
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native double getBackgroundTopCap() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.backgroundTopCap;
	}-*/;

	/**
	 * <b>backgroundTopCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the top end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The bottom end cap is therefore computed by adding the size of the top end cap and the middle portion together and then subtracting that value from the height of the image
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setBackgroundTopCap(double backgroundTopCap) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.backgroundTopCap = backgroundTopCap;
	}-*/;

	/**
	 * <b>borderColor</b> (string)
	 * <p>
	 * the border color of the view
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native String getBorderColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.borderColor;
	}-*/;

	/**
	 * <b>borderColor</b> (string)
	 * <p>
	 * the border color of the view
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setBorderColor(String borderColor) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.borderColor = borderColor;
	}-*/;

	/**
	 * <b>borderRadius</b> (float)
	 * <p>
	 * the border radius of the view
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native double getBorderRadius() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.borderRadius;
	}-*/;

	/**
	 * <b>borderRadius</b> (float)
	 * <p>
	 * the border radius of the view
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setBorderRadius(double borderRadius) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.borderRadius = borderRadius;
	}-*/;

	/**
	 * <b>borderWidth</b> (float)
	 * <p>
	 * the border width of the view
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native double getBorderWidth() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.borderWidth;
	}-*/;

	/**
	 * <b>borderWidth</b> (float)
	 * <p>
	 * the border width of the view
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setBorderWidth(double borderWidth) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.borderWidth = borderWidth;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native double getBottomF() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setBottom(double bottom) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.bottom = bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native String getBottomS() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setBottom(String bottom) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.bottom = bottom;
	}-*/;

	/**
	 * <b>center</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the center of the views position relative to the parent view
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native JavaScriptObject getCenter() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.center;
	}-*/;

	/**
	 * <b>center</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the center of the views position relative to the parent view
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setCenter(JavaScriptObject center) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.center = center;
	}-*/;

	/**
	 * <b>detailView</b> (object)
	 * <p>
	 * view for the detail view section of the SplitWindow
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native JavaScriptObject getDetailView() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.detailView;
	}-*/;

	/**
	 * <b>detailView</b> (object)
	 * <p>
	 * view for the detail view section of the SplitWindow
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setDetailView(JavaScriptObject detailView) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.detailView = detailView;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native double getHeightF() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setHeight(double height) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.height = height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native String getHeightS() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setHeight(String height) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.height = height;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native double getLeftF() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setLeft(double left) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.left = left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native String getLeftS() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setLeft(String left) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.left = left;
	}-*/;

	/**
	 * <b>masterView</b> (object)
	 * <p>
	 * view for the master view section of the SplitWindow
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native JavaScriptObject getMasterView() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.masterView;
	}-*/;

	/**
	 * <b>masterView</b> (object)
	 * <p>
	 * view for the master view section of the SplitWindow
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setMasterView(JavaScriptObject masterView) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.masterView = masterView;
	}-*/;

	/**
	 * <b>opacity</b> (float)
	 * <p>
	 * the opacity from 0.0-1.0
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native double getOpacity() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.opacity;
	}-*/;

	/**
	 * <b>opacity</b> (float)
	 * <p>
	 * the opacity from 0.0-1.0
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setOpacity(double opacity) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.opacity = opacity;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native double getRightF() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setRight(double right) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.right = right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native String getRightS() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setRight(String right) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.right = right;
	}-*/;

	/**
	 * <b>showMasterInPortrait</b> (boolean)
	 * <p>
	 * whether or not to show the master view in portrait. Default is 'false'
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native boolean getShowMasterInPortrait() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.showMasterInPortrait;
	}-*/;

	/**
	 * <b>showMasterInPortrait</b> (boolean)
	 * <p>
	 * whether or not to show the master view in portrait. Default is 'false'
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setShowMasterInPortrait(boolean showMasterInPortrait) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.showMasterInPortrait = showMasterInPortrait;
	}-*/;

	/**
	 * <b>size</b> (object)
	 * <p>
	 * the size of the view as a dictionary of width and height properties
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native JavaScriptObject getSize() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.size;
	}-*/;

	/**
	 * <b>size</b> (object)
	 * <p>
	 * the size of the view as a dictionary of width and height properties
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setSize(JavaScriptObject size) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.size = size;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native double getTopF() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setTop(double top) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.top = top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native String getTopS() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setTop(String top) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.top = top;
	}-*/;

	/**
	 * <b>touchEnabled</b> (boolean)
	 * <p>
	 * a boolean indicating if the view should receive touch events (true, default) or forward them to peers (false)
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native boolean getTouchEnabled() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.touchEnabled;
	}-*/;

	/**
	 * <b>touchEnabled</b> (boolean)
	 * <p>
	 * a boolean indicating if the view should receive touch events (true, default) or forward them to peers (false)
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setTouchEnabled(boolean touchEnabled) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.touchEnabled = touchEnabled;
	}-*/;

	/**
	 * <b>transform</b> (object)
	 * <p>
	 * the transformation matrix to apply to the view
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native JavaScriptObject getTransform() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.transform;
	}-*/;

	/**
	 * <b>transform</b> (object)
	 * <p>
	 * the transformation matrix to apply to the view
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setTransform(JavaScriptObject transform) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.transform = transform;
	}-*/;

	/**
	 * <b>visible</b> (boolean)
	 * <p>
	 * a boolean of the visibility of the view
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native boolean getVisible() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.visible;
	}-*/;

	/**
	 * <b>visible</b> (boolean)
	 * <p>
	 * a boolean of the visibility of the view
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setVisible(boolean visible) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.visible = visible;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native double getWidthF() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setWidth(double width) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.width = width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native String getWidthS() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setWidth(String width) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.width = width;
	}-*/;

	/**
	 * <b>zIndex</b> (int)
	 * <p>
	 * the z index position relative to other sibling views
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native int getZIndex() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.zIndex;
	}-*/;

	/**
	 * <b>zIndex</b> (int)
	 * <p>
	 * the z index position relative to other sibling views
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 */
	public native void setZIndex(int zIndex) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.zIndex = zIndex;
	}-*/;

	/**
	 * <b>add</b>
	 * <p>
	 * add a child to the view hierarchy
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 * @param view (object) the view to add to this views hiearchy
	 * @return void
	 */
	 public native void add(JavaScriptObject view) /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.add(view);
	}-*/;

	/**
	 * <b>addEventListener</b>
	 * <p>
	 * add an event listener for the instance to receive view triggered events
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public native void addEventListener(String name, JavaScriptObject callback) /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>animate</b>
	 * <p>
	 * animate the view
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 * @param obj (object) either a dictionary of animation properties or an Animation object
	 * @param callback (function) function to be invoked upon completion of the animation
	 * @return void
	 */
	 public native void animate(JavaScriptObject obj, JavaScriptObject callback) /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.animate(obj, callback);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public native void fireEvent(String name, JavaScriptObject event) /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.fireEvent(name, event);
	}-*/;

	/**
	 * <b>hide</b>
	 * <p>
	 * hide the view
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 * @return void
	 */
	 public native void hide() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.hide();
	}-*/;

	/**
	 * <b>remove</b>
	 * <p>
	 * remove a previously add view from the view hiearchy
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 * @param view (object) the view to remove from this views hiearchy
	 * @return void
	 */
	 public native void remove(JavaScriptObject view) /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.remove(view);
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public native void removeEventListener(String name, JavaScriptObject callback) /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>show</b>
	 * <p>
	 * make the view visible
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 * @return void
	 */
	 public native void show() /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.show();
	}-*/;

	/**
	 * <b>toImage</b>
	 * <p>
	 * return a Blob image of the rendered view
	 * <p>
	 * <b>Platforms:</b> ipad, <b>Since:</b> 1.2
	 * @param f (function) function to be invoked upon completion. if non-null, this method will be performed asynchronously. if null, it will be performed immediately
	 * @return object
	 */
	 public native JavaScriptObject toImage(JavaScriptObject f) /*-{
		return this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.toImage(f);
	}-*/;
	

	/**
	 * <b>click</b>
	 * <p>
	 * fired when the device detects a click (longer than touch) against the view
	 * @param click event handler
	 */
	public native void addClick(com.pmt.wrap.titanium.sys.events.TitaniumUIiPadSplitWindowClickHandler click) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.addEventListener('click', function(source, type, globalPoint, y, x) {
			click.@com.pmt.wrap.titanium.sys.events.TitaniumUIiPadSplitWindowClickHandler::click(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>dblclick</b>
	 * <p>
	 * fired when the device detects a double click against the view
	 * @param dblclick event handler
	 */
	public native void addDblclick(com.pmt.wrap.titanium.sys.events.TitaniumUIiPadSplitWindowDblclickHandler dblclick) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.addEventListener('dblclick', function(source, type, globalPoint, y, x) {
			dblclick.@com.pmt.wrap.titanium.sys.events.TitaniumUIiPadSplitWindowDblclickHandler::dblclick(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>doubletap</b>
	 * <p>
	 * fired when the device detects a double tap against the view
	 * @param doubletap event handler
	 */
	public native void addDoubletap(com.pmt.wrap.titanium.sys.events.TitaniumUIiPadSplitWindowDoubletapHandler doubletap) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.addEventListener('doubletap', function(source, type, globalPoint, y, x) {
			doubletap.@com.pmt.wrap.titanium.sys.events.TitaniumUIiPadSplitWindowDoubletapHandler::doubletap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>singletap</b>
	 * <p>
	 * fired when the device detects a single tap against the view
	 * @param singletap event handler
	 */
	public native void addSingletap(com.pmt.wrap.titanium.sys.events.TitaniumUIiPadSplitWindowSingletapHandler singletap) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.addEventListener('singletap', function(source, type, globalPoint, y, x) {
			singletap.@com.pmt.wrap.titanium.sys.events.TitaniumUIiPadSplitWindowSingletapHandler::singletap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>swipe</b>
	 * <p>
	 * fired when the device detects a swipe (left or right) against the view
	 * @param swipe event handler
	 */
	public native void addSwipe(com.pmt.wrap.titanium.sys.events.TitaniumUIiPadSplitWindowSwipeHandler swipe) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.addEventListener('swipe', function(source, direction, type, globalPoint, y, x) {
			swipe.@com.pmt.wrap.titanium.sys.events.TitaniumUIiPadSplitWindowSwipeHandler::swipe(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, direction, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchcancel</b>
	 * <p>
	 * fired when a touch event is interrupted by the device. this happens in circumenstances such as an incoming call to allow the UI to clean up state.
	 * @param touchcancel event handler
	 */
	public native void addTouchcancel(com.pmt.wrap.titanium.sys.events.TitaniumUIiPadSplitWindowTouchcancelHandler touchcancel) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.addEventListener('touchcancel', function(source, type, globalPoint, y, x) {
			touchcancel.@com.pmt.wrap.titanium.sys.events.TitaniumUIiPadSplitWindowTouchcancelHandler::touchcancel(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchend</b>
	 * <p>
	 * fired when a touch event is completed
	 * @param touchend event handler
	 */
	public native void addTouchend(com.pmt.wrap.titanium.sys.events.TitaniumUIiPadSplitWindowTouchendHandler touchend) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.addEventListener('touchend', function(source, type, globalPoint, y, x) {
			touchend.@com.pmt.wrap.titanium.sys.events.TitaniumUIiPadSplitWindowTouchendHandler::touchend(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchmove</b>
	 * <p>
	 * fired as soon as the device detects movement of a touch.  Event coordinates are always relative to the view in which the initial touch occurred
	 * @param touchmove event handler
	 */
	public native void addTouchmove(com.pmt.wrap.titanium.sys.events.TitaniumUIiPadSplitWindowTouchmoveHandler touchmove) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.addEventListener('touchmove', function(source, type, globalPoint, y, x) {
			touchmove.@com.pmt.wrap.titanium.sys.events.TitaniumUIiPadSplitWindowTouchmoveHandler::touchmove(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchstart</b>
	 * <p>
	 * fired as soon as the device detects a gesture
	 * @param touchstart event handler
	 */
	public native void addTouchstart(com.pmt.wrap.titanium.sys.events.TitaniumUIiPadSplitWindowTouchstartHandler touchstart) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.addEventListener('touchstart', function(source, type, globalPoint, y, x) {
			touchstart.@com.pmt.wrap.titanium.sys.events.TitaniumUIiPadSplitWindowTouchstartHandler::touchstart(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>twofingertap</b>
	 * <p>
	 * fired when the device detects a two-finger tap against the view
	 * @param twofingertap event handler
	 */
	public native void addTwofingertap(com.pmt.wrap.titanium.sys.events.TitaniumUIiPadSplitWindowTwofingertapHandler twofingertap) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.addEventListener('twofingertap', function(source, type, globalPoint, y, x) {
			twofingertap.@com.pmt.wrap.titanium.sys.events.TitaniumUIiPadSplitWindowTwofingertapHandler::twofingertap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>visible</b>
	 * <p>
	 * fired when the masterView or detailView becomes visible.
	 * @param visible event handler
	 */
	public native void addVisible(com.pmt.wrap.titanium.sys.events.TitaniumUIiPadSplitWindowVisibleHandler visible) /*-{
		this.@com.pmt.wrap.titanium.ui.ipad.SplitWindow::handler.addEventListener('visible', function(source, button, popover, view, type, globalPoint, y, x) {
			visible.@com.pmt.wrap.titanium.sys.events.TitaniumUIiPadSplitWindowVisibleHandler::visible(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, button, popover, view, type, globalPoint, y, x);
		});
	}-*/;
}