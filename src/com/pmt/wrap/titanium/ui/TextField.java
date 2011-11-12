package com.pmt.wrap.titanium.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.TextField</b>
 * <p>
 * A Text Area is created by the method Titanium.UI.createTextField. The Text Field is a single line field.
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
public class TextField {

	private JavaScriptObject handler;

	public TextField(JavaScriptObject handler) {
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
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.anchorPoint;
	}-*/;

	/**
	 * <b>anchorPoint</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the anchor point value. anchor specifies the position by which animation should occur. center is 0.5, 0.5
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setAnchorPoint(JavaScriptObject anchorPoint) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.anchorPoint = anchorPoint;
	}-*/;

	/**
	 * <b>animatedCenterPoint</b> (object)
	 * <p>
	 * read-only object with x and y properties of where the view is during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getAnimatedCenterPoint() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.animatedCenterPoint;
	}-*/;

	/**
	 * <b>animatedCenterPoint</b> (object)
	 * <p>
	 * read-only object with x and y properties of where the view is during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setAnimatedCenterPoint(JavaScriptObject animatedCenterPoint) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.animatedCenterPoint = animatedCenterPoint;
	}-*/;

	/**
	 * <b>autocapitalization</b> (int)
	 * <p>
	 * One of Titanium.UI.TEXT_AUTOCAPITALIZATION_NONE, Titanium.UI.TEXT_AUTOCAPITALIZATION_WORDS, Titanium.UI.TEXT_AUTOCAPITALIZATION_SENTENCES, or Titanium.UI.TEXT_AUTOCAPITALIZATION_ALL to indicate how the field should be capitalized during typing.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getAutocapitalization() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.autocapitalization;
	}-*/;

	/**
	 * <b>autocapitalization</b> (int)
	 * <p>
	 * One of Titanium.UI.TEXT_AUTOCAPITALIZATION_NONE, Titanium.UI.TEXT_AUTOCAPITALIZATION_WORDS, Titanium.UI.TEXT_AUTOCAPITALIZATION_SENTENCES, or Titanium.UI.TEXT_AUTOCAPITALIZATION_ALL to indicate how the field should be capitalized during typing.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setAutocapitalization(int autocapitalization) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.autocapitalization = autocapitalization;
	}-*/;

	/**
	 * <b>backgroundColor</b> (string)
	 * <p>
	 * the background color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBackgroundColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.backgroundColor;
	}-*/;

	/**
	 * <b>backgroundColor</b> (string)
	 * <p>
	 * the background color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundColor(String backgroundColor) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.backgroundColor = backgroundColor;
	}-*/;

	/**
	 * <b>backgroundDisabledColor</b> (string)
	 * <p>
	 * the disabled background color of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBackgroundDisabledColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.backgroundDisabledColor;
	}-*/;

	/**
	 * <b>backgroundDisabledColor</b> (string)
	 * <p>
	 * the disabled background color of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundDisabledColor(String backgroundDisabledColor) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.backgroundDisabledColor = backgroundDisabledColor;
	}-*/;

	/**
	 * <b>backgroundDisabledImage</b> (string)
	 * <p>
	 * the disabled background image url of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBackgroundDisabledImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.backgroundDisabledImage;
	}-*/;

	/**
	 * <b>backgroundDisabledImage</b> (string)
	 * <p>
	 * the disabled background image url of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundDisabledImage(String backgroundDisabledImage) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.backgroundDisabledImage = backgroundDisabledImage;
	}-*/;

	/**
	 * <b>backgroundFocusedColor</b> (string)
	 * <p>
	 * the focused background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBackgroundFocusedColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.backgroundFocusedColor;
	}-*/;

	/**
	 * <b>backgroundFocusedColor</b> (string)
	 * <p>
	 * the focused background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundFocusedColor(String backgroundFocusedColor) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.backgroundFocusedColor = backgroundFocusedColor;
	}-*/;

	/**
	 * <b>backgroundFocusedImage</b> (string)
	 * <p>
	 * the focused background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBackgroundFocusedImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.backgroundFocusedImage;
	}-*/;

	/**
	 * <b>backgroundFocusedImage</b> (string)
	 * <p>
	 * the focused background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundFocusedImage(String backgroundFocusedImage) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.backgroundFocusedImage = backgroundFocusedImage;
	}-*/;

	/**
	 * <b>backgroundGradient</b> (object)
	 * <p>
	 * a background gradient for the view with the properties: type,startPoint,endPoint,startRadius,endRadius,backfillStart,backfillEnd,colors.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getBackgroundGradient() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.backgroundGradient;
	}-*/;

	/**
	 * <b>backgroundGradient</b> (object)
	 * <p>
	 * a background gradient for the view with the properties: type,startPoint,endPoint,startRadius,endRadius,backfillStart,backfillEnd,colors.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundGradient(JavaScriptObject backgroundGradient) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.backgroundGradient = backgroundGradient;
	}-*/;

	/**
	 * <b>backgroundImage</b> (string)
	 * <p>
	 * the background image url of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBackgroundImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.backgroundImage;
	}-*/;

	/**
	 * <b>backgroundImage</b> (string)
	 * <p>
	 * the background image url of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundImage(String backgroundImage) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.backgroundImage = backgroundImage;
	}-*/;

	/**
	 * <b>backgroundLeftCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the left end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The right end cap is therefore computed by adding the size of the left end cap and the middle portion together and then subtracting that value from the width of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getBackgroundLeftCap() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.backgroundLeftCap;
	}-*/;

	/**
	 * <b>backgroundLeftCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the left end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The right end cap is therefore computed by adding the size of the left end cap and the middle portion together and then subtracting that value from the width of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundLeftCap(double backgroundLeftCap) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.backgroundLeftCap = backgroundLeftCap;
	}-*/;

	/**
	 * <b>backgroundSelectedColor</b> (string)
	 * <p>
	 * the selected background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBackgroundSelectedColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.backgroundSelectedColor;
	}-*/;

	/**
	 * <b>backgroundSelectedColor</b> (string)
	 * <p>
	 * the selected background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundSelectedColor(String backgroundSelectedColor) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.backgroundSelectedColor = backgroundSelectedColor;
	}-*/;

	/**
	 * <b>backgroundSelectedImage</b> (string)
	 * <p>
	 * the selected background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBackgroundSelectedImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.backgroundSelectedImage;
	}-*/;

	/**
	 * <b>backgroundSelectedImage</b> (string)
	 * <p>
	 * the selected background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundSelectedImage(String backgroundSelectedImage) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.backgroundSelectedImage = backgroundSelectedImage;
	}-*/;

	/**
	 * <b>backgroundTopCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the top end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The bottom end cap is therefore computed by adding the size of the top end cap and the middle portion together and then subtracting that value from the height of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getBackgroundTopCap() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.backgroundTopCap;
	}-*/;

	/**
	 * <b>backgroundTopCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the top end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The bottom end cap is therefore computed by adding the size of the top end cap and the middle portion together and then subtracting that value from the height of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundTopCap(double backgroundTopCap) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.backgroundTopCap = backgroundTopCap;
	}-*/;

	/**
	 * <b>borderColor</b> (string)
	 * <p>
	 * the border color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBorderColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.borderColor;
	}-*/;

	/**
	 * <b>borderColor</b> (string)
	 * <p>
	 * the border color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBorderColor(String borderColor) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.borderColor = borderColor;
	}-*/;

	/**
	 * <b>borderRadius</b> (float)
	 * <p>
	 * the border radius of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getBorderRadius() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.borderRadius;
	}-*/;

	/**
	 * <b>borderRadius</b> (float)
	 * <p>
	 * the border radius of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBorderRadius(double borderRadius) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.borderRadius = borderRadius;
	}-*/;

	/**
	 * <b>borderStyle</b> (int)
	 * <p>
	 * the border style constant for the field
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getBorderStyle() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.borderStyle;
	}-*/;

	/**
	 * <b>borderStyle</b> (int)
	 * <p>
	 * the border style constant for the field
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBorderStyle(int borderStyle) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.borderStyle = borderStyle;
	}-*/;

	/**
	 * <b>borderWidth</b> (float)
	 * <p>
	 * the border width of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getBorderWidth() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.borderWidth;
	}-*/;

	/**
	 * <b>borderWidth</b> (float)
	 * <p>
	 * the border width of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBorderWidth(double borderWidth) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.borderWidth = borderWidth;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getBottomF() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBottom(double bottom) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.bottom = bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBottomS() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBottom(String bottom) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.bottom = bottom;
	}-*/;

	/**
	 * <b>center</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the center of the views position relative to the parent view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getCenter() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.center;
	}-*/;

	/**
	 * <b>center</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the center of the views position relative to the parent view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setCenter(JavaScriptObject center) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.center = center;
	}-*/;

	/**
	 * <b>clearButtonMode</b> (int)
	 * <p>
	 * the mode constant for how to handle displaying the clear button
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getClearButtonMode() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.clearButtonMode;
	}-*/;

	/**
	 * <b>clearButtonMode</b> (int)
	 * <p>
	 * the mode constant for how to handle displaying the clear button
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setClearButtonMode(int clearButtonMode) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.clearButtonMode = clearButtonMode;
	}-*/;

	/**
	 * <b>clearOnEdit</b> (boolean)
	 * <p>
	 * boolean that indicates if the value of the field is cleared upon editing
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getClearOnEdit() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.clearOnEdit;
	}-*/;

	/**
	 * <b>clearOnEdit</b> (boolean)
	 * <p>
	 * boolean that indicates if the value of the field is cleared upon editing
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setClearOnEdit(boolean clearOnEdit) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.clearOnEdit = clearOnEdit;
	}-*/;

	/**
	 * <b>editable</b> (boolean)
	 * <p>
	 * boolean indicating if the field is editable
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getEditable() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.editable;
	}-*/;

	/**
	 * <b>editable</b> (boolean)
	 * <p>
	 * boolean indicating if the field is editable
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setEditable(boolean editable) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.editable = editable;
	}-*/;

	/**
	 * <b>enabled</b> (boolean)
	 * <p>
	 * boolean indicating the enabled state of the field
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getEnabled() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.enabled;
	}-*/;

	/**
	 * <b>enabled</b> (boolean)
	 * <p>
	 * boolean indicating the enabled state of the field
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setEnabled(boolean enabled) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.enabled = enabled;
	}-*/;

	/**
	 * <b>focusable</b> (boolean)
	 * <p>
	 * Set true if you want a view to be focusable when navigating with the trackball or D-Pad. Default: false. (Android Only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.8
	 */
	public native boolean getFocusable() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.focusable;
	}-*/;

	/**
	 * <b>focusable</b> (boolean)
	 * <p>
	 * Set true if you want a view to be focusable when navigating with the trackball or D-Pad. Default: false. (Android Only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.8
	 */
	public native void setFocusable(boolean focusable) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.focusable = focusable;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getHeightF() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setHeight(double height) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.height = height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getHeightS() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setHeight(String height) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.height = height;
	}-*/;

	/**
	 * <b>hintText</b> (string)
	 * <p>
	 * the hint text to display when the field is unfocused
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getHintText() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.hintText;
	}-*/;

	/**
	 * <b>hintText</b> (string)
	 * <p>
	 * the hint text to display when the field is unfocused
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setHintText(String hintText) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.hintText = hintText;
	}-*/;

	/**
	 * <b>keyboardToolbar</b> (array)
	 * <p>
	 * array of toolbar button objects to be used when the keyboard is displayed
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getKeyboardToolbar() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.keyboardToolbar;
	}-*/;

	/**
	 * <b>keyboardToolbar</b> (array)
	 * <p>
	 * array of toolbar button objects to be used when the keyboard is displayed
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setKeyboardToolbar(JavaScriptObject keyboardToolbar) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.keyboardToolbar = keyboardToolbar;
	}-*/;

	/**
	 * <b>keyboardToolbarColor</b> (string)
	 * <p>
	 * the color of the keyboard toolbar
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getKeyboardToolbarColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.keyboardToolbarColor;
	}-*/;

	/**
	 * <b>keyboardToolbarColor</b> (string)
	 * <p>
	 * the color of the keyboard toolbar
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setKeyboardToolbarColor(String keyboardToolbarColor) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.keyboardToolbarColor = keyboardToolbarColor;
	}-*/;

	/**
	 * <b>keyboardToolbarHeight</b> (float)
	 * <p>
	 * the height of the keyboard toolbar
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getKeyboardToolbarHeight() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.keyboardToolbarHeight;
	}-*/;

	/**
	 * <b>keyboardToolbarHeight</b> (float)
	 * <p>
	 * the height of the keyboard toolbar
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setKeyboardToolbarHeight(double keyboardToolbarHeight) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.keyboardToolbarHeight = keyboardToolbarHeight;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getLeftF() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setLeft(double left) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.left = left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getLeftS() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setLeft(String left) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.left = left;
	}-*/;

	/**
	 * <b>leftButton</b> (object)
	 * <p>
	 * the left button view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getLeftButton() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.leftButton;
	}-*/;

	/**
	 * <b>leftButton</b> (object)
	 * <p>
	 * the left button view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setLeftButton(JavaScriptObject leftButton) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.leftButton = leftButton;
	}-*/;

	/**
	 * <b>leftButtonMode</b> (int)
	 * <p>
	 * the mode of the left button view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getLeftButtonMode() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.leftButtonMode;
	}-*/;

	/**
	 * <b>leftButtonMode</b> (int)
	 * <p>
	 * the mode of the left button view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setLeftButtonMode(int leftButtonMode) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.leftButtonMode = leftButtonMode;
	}-*/;

	/**
	 * <b>leftButtonPadding</b> (float)
	 * <p>
	 * the left padding of the space between the button and the edge of the field
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getLeftButtonPadding() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.leftButtonPadding;
	}-*/;

	/**
	 * <b>leftButtonPadding</b> (float)
	 * <p>
	 * the left padding of the space between the button and the edge of the field
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setLeftButtonPadding(double leftButtonPadding) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.leftButtonPadding = leftButtonPadding;
	}-*/;

	/**
	 * <b>minimumFontSize</b> (int)
	 * <p>
	 * the minimum size of the font when the font is sized based on the contents.  Enables font scaling to fit
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getMinimumFontSize() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.minimumFontSize;
	}-*/;

	/**
	 * <b>minimumFontSize</b> (int)
	 * <p>
	 * the minimum size of the font when the font is sized based on the contents.  Enables font scaling to fit
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setMinimumFontSize(int minimumFontSize) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.minimumFontSize = minimumFontSize;
	}-*/;

	/**
	 * <b>opacity</b> (float)
	 * <p>
	 * the opacity from 0.0-1.0
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getOpacity() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.opacity;
	}-*/;

	/**
	 * <b>opacity</b> (float)
	 * <p>
	 * the opacity from 0.0-1.0
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setOpacity(double opacity) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.opacity = opacity;
	}-*/;

	/**
	 * <b>paddingLeft</b> (float)
	 * <p>
	 * the left padding of the text field
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getPaddingLeft() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.paddingLeft;
	}-*/;

	/**
	 * <b>paddingLeft</b> (float)
	 * <p>
	 * the left padding of the text field
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setPaddingLeft(double paddingLeft) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.paddingLeft = paddingLeft;
	}-*/;

	/**
	 * <b>paddingRight</b> (float)
	 * <p>
	 * the right padding of the text field
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getPaddingRight() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.paddingRight;
	}-*/;

	/**
	 * <b>paddingRight</b> (float)
	 * <p>
	 * the right padding of the text field
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setPaddingRight(double paddingRight) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.paddingRight = paddingRight;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getRightF() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setRight(double right) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.right = right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getRightS() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setRight(String right) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.right = right;
	}-*/;

	/**
	 * <b>rightButton</b> (object)
	 * <p>
	 * the right button view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getRightButton() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.rightButton;
	}-*/;

	/**
	 * <b>rightButton</b> (object)
	 * <p>
	 * the right button view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setRightButton(JavaScriptObject rightButton) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.rightButton = rightButton;
	}-*/;

	/**
	 * <b>rightButtonMode</b> (int)
	 * <p>
	 * the mode of the right button view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getRightButtonMode() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.rightButtonMode;
	}-*/;

	/**
	 * <b>rightButtonMode</b> (int)
	 * <p>
	 * the mode of the right button view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setRightButtonMode(int rightButtonMode) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.rightButtonMode = rightButtonMode;
	}-*/;

	/**
	 * <b>rightButtonPadding</b> (float)
	 * <p>
	 * the right padding of the space between the button and the edge of the field
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getRightButtonPadding() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.rightButtonPadding;
	}-*/;

	/**
	 * <b>rightButtonPadding</b> (float)
	 * <p>
	 * the right padding of the space between the button and the edge of the field
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setRightButtonPadding(double rightButtonPadding) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.rightButtonPadding = rightButtonPadding;
	}-*/;

	/**
	 * <b>size</b> (object)
	 * <p>
	 * the size of the view as a dictionary of width and height properties
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getSize() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.size;
	}-*/;

	/**
	 * <b>size</b> (object)
	 * <p>
	 * the size of the view as a dictionary of width and height properties
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setSize(JavaScriptObject size) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.size = size;
	}-*/;

	/**
	 * <b>softKeyboardOnFocus</b> (int)
	 * <p>
	 * One of Titanium.UI.Android.SOFT_KEYBOARD_DEFAULT_ON_FOCUS, Titanium.UI.Android.SOFT_KEYBOARD_HIDE_ON_FOCUS, or Titanium.UI.Android.SOFT_KEYBOARD_SHOW_ON_FOCUS. (Android only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.8
	 */
	public native int getSoftKeyboardOnFocus() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.softKeyboardOnFocus;
	}-*/;

	/**
	 * <b>softKeyboardOnFocus</b> (int)
	 * <p>
	 * One of Titanium.UI.Android.SOFT_KEYBOARD_DEFAULT_ON_FOCUS, Titanium.UI.Android.SOFT_KEYBOARD_HIDE_ON_FOCUS, or Titanium.UI.Android.SOFT_KEYBOARD_SHOW_ON_FOCUS. (Android only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.8
	 */
	public native void setSoftKeyboardOnFocus(int softKeyboardOnFocus) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.softKeyboardOnFocus = softKeyboardOnFocus;
	}-*/;

	/**
	 * <b>suppressReturn</b> (boolean)
	 * <p>
	 * boolean to indicate if the return key should be suppressed during entry
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getSuppressReturn() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.suppressReturn;
	}-*/;

	/**
	 * <b>suppressReturn</b> (boolean)
	 * <p>
	 * boolean to indicate if the return key should be suppressed during entry
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setSuppressReturn(boolean suppressReturn) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.suppressReturn = suppressReturn;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getTopF() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setTop(double top) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.top = top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getTopS() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setTop(String top) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.top = top;
	}-*/;

	/**
	 * <b>touchEnabled</b> (boolean)
	 * <p>
	 * a boolean indicating if the view should receive touch events (true, default) or forward them to peers (false)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getTouchEnabled() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.touchEnabled;
	}-*/;

	/**
	 * <b>touchEnabled</b> (boolean)
	 * <p>
	 * a boolean indicating if the view should receive touch events (true, default) or forward them to peers (false)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setTouchEnabled(boolean touchEnabled) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.touchEnabled = touchEnabled;
	}-*/;

	/**
	 * <b>transform</b> (object)
	 * <p>
	 * the transformation matrix to apply to the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getTransform() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.transform;
	}-*/;

	/**
	 * <b>transform</b> (object)
	 * <p>
	 * the transformation matrix to apply to the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setTransform(JavaScriptObject transform) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.transform = transform;
	}-*/;

	/**
	 * <b>value</b> (string)
	 * <p>
	 * value of the field
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getValue() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.value;
	}-*/;

	/**
	 * <b>value</b> (string)
	 * <p>
	 * value of the field
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setValue(String value) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.value = value;
	}-*/;

	/**
	 * <b>verticalAlign</b> (int,string)
	 * <p>
	 * the constant or string value for the fields vertical alignment.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getVerticalAlignI() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.verticalAlign;
	}-*/;

	/**
	 * <b>verticalAlign</b> (int,string)
	 * <p>
	 * the constant or string value for the fields vertical alignment.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setVerticalAlign(int verticalAlign) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.verticalAlign = verticalAlign;
	}-*/;

	/**
	 * <b>verticalAlign</b> (int,string)
	 * <p>
	 * the constant or string value for the fields vertical alignment.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getVerticalAlignS() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.verticalAlign;
	}-*/;

	/**
	 * <b>verticalAlign</b> (int,string)
	 * <p>
	 * the constant or string value for the fields vertical alignment.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setVerticalAlign(String verticalAlign) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.verticalAlign = verticalAlign;
	}-*/;

	/**
	 * <b>visible</b> (boolean)
	 * <p>
	 * a boolean of the visibility of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getVisible() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.visible;
	}-*/;

	/**
	 * <b>visible</b> (boolean)
	 * <p>
	 * a boolean of the visibility of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setVisible(boolean visible) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.visible = visible;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getWidthF() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setWidth(double width) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.width = width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getWidthS() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setWidth(String width) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.width = width;
	}-*/;

	/**
	 * <b>zIndex</b> (int)
	 * <p>
	 * the z index position relative to other sibling views
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getZIndex() /*-{
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.zIndex;
	}-*/;

	/**
	 * <b>zIndex</b> (int)
	 * <p>
	 * the z index position relative to other sibling views
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setZIndex(int zIndex) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.zIndex = zIndex;
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
		this.@com.pmt.wrap.titanium.ui.TextField::handler.add(view);
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
		this.@com.pmt.wrap.titanium.ui.TextField::handler.addEventListener(name, callback);
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
		this.@com.pmt.wrap.titanium.ui.TextField::handler.animate(obj, callback);
	}-*/;

	/**
	 * <b>blur</b>
	 * <p>
	 * force the field to lose focus
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @return void
	 */
	 public native void blur() /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.blur();
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
		this.@com.pmt.wrap.titanium.ui.TextField::handler.fireEvent(name, event);
	}-*/;

	/**
	 * <b>focus</b>
	 * <p>
	 * force the field to gain focus
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @return void
	 */
	 public native void focus() /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.focus();
	}-*/;

	/**
	 * <b>hasText</b>
	 * <p>
	 * return boolean (true) if the field has text
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @return void
	 */
	 public native void hasText() /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.hasText();
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
		this.@com.pmt.wrap.titanium.ui.TextField::handler.hide();
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
		this.@com.pmt.wrap.titanium.ui.TextField::handler.remove(view);
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
		this.@com.pmt.wrap.titanium.ui.TextField::handler.removeEventListener(name, callback);
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
		this.@com.pmt.wrap.titanium.ui.TextField::handler.show();
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
		return this.@com.pmt.wrap.titanium.ui.TextField::handler.toImage(f);
	}-*/;
	

	/**
	 * <b>blur</b>
	 * <p>
	 * fired when the field loses focus
	 * @param blur event handler
	 */
	public native void addBlur(com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldBlurHandler blur) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.addEventListener('blur', function(source, value, type, globalPoint, y, x) {
			blur.@com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldBlurHandler::blur(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, value, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>change</b>
	 * <p>
	 * fired when the field value changes
	 * @param change event handler
	 */
	public native void addChange(com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldChangeHandler change) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.addEventListener('change', function(source, value, type, globalPoint, y, x) {
			change.@com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldChangeHandler::change(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, value, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>click</b>
	 * <p>
	 * fired when the device detects a click (longer than touch) against the view
	 * @param click event handler
	 */
	public native void addClick(com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldClickHandler click) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.addEventListener('click', function(source, type, globalPoint, y, x) {
			click.@com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldClickHandler::click(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>dblclick</b>
	 * <p>
	 * fired when the device detects a double click against the view
	 * @param dblclick event handler
	 */
	public native void addDblclick(com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldDblclickHandler dblclick) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.addEventListener('dblclick', function(source, type, globalPoint, y, x) {
			dblclick.@com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldDblclickHandler::dblclick(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>doubletap</b>
	 * <p>
	 * fired when the device detects a double tap against the view
	 * @param doubletap event handler
	 */
	public native void addDoubletap(com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldDoubletapHandler doubletap) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.addEventListener('doubletap', function(source, type, globalPoint, y, x) {
			doubletap.@com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldDoubletapHandler::doubletap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>focus</b>
	 * <p>
	 * fired when the field gains focus
	 * @param focus event handler
	 */
	public native void addFocus(com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldFocusHandler focus) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.addEventListener('focus', function(source, value, type, globalPoint, y, x) {
			focus.@com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldFocusHandler::focus(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, value, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>return</b>
	 * <p>
	 * fired when the field return key is pressed on the keyboard
	 * @param returnEvent event handler
	 */
	public native void addReturn(com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldReturnHandler returnEvent) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.addEventListener('return', function(source, type, globalPoint, y, x) {
			returnEvent.@com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldReturnHandler::returnEvent(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>singletap</b>
	 * <p>
	 * fired when the device detects a single tap against the view
	 * @param singletap event handler
	 */
	public native void addSingletap(com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldSingletapHandler singletap) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.addEventListener('singletap', function(source, type, globalPoint, y, x) {
			singletap.@com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldSingletapHandler::singletap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>swipe</b>
	 * <p>
	 * fired when the device detects a swipe (left or right) against the view
	 * @param swipe event handler
	 */
	public native void addSwipe(com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldSwipeHandler swipe) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.addEventListener('swipe', function(source, direction, type, globalPoint, y, x) {
			swipe.@com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldSwipeHandler::swipe(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, direction, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchcancel</b>
	 * <p>
	 * fired when a touch event is interrupted by the device. this happens in circumenstances such as an incoming call to allow the UI to clean up state.
	 * @param touchcancel event handler
	 */
	public native void addTouchcancel(com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldTouchcancelHandler touchcancel) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.addEventListener('touchcancel', function(source, type, globalPoint, y, x) {
			touchcancel.@com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldTouchcancelHandler::touchcancel(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchend</b>
	 * <p>
	 * fired when a touch event is completed
	 * @param touchend event handler
	 */
	public native void addTouchend(com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldTouchendHandler touchend) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.addEventListener('touchend', function(source, type, globalPoint, y, x) {
			touchend.@com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldTouchendHandler::touchend(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchmove</b>
	 * <p>
	 * fired as soon as the device detects movement of a touch.  Event coordinates are always relative to the view in which the initial touch occurred
	 * @param touchmove event handler
	 */
	public native void addTouchmove(com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldTouchmoveHandler touchmove) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.addEventListener('touchmove', function(source, type, globalPoint, y, x) {
			touchmove.@com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldTouchmoveHandler::touchmove(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchstart</b>
	 * <p>
	 * fired as soon as the device detects a gesture
	 * @param touchstart event handler
	 */
	public native void addTouchstart(com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldTouchstartHandler touchstart) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.addEventListener('touchstart', function(source, type, globalPoint, y, x) {
			touchstart.@com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldTouchstartHandler::touchstart(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>twofingertap</b>
	 * <p>
	 * fired when the device detects a two-finger tap against the view
	 * @param twofingertap event handler
	 */
	public native void addTwofingertap(com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldTwofingertapHandler twofingertap) /*-{
		this.@com.pmt.wrap.titanium.ui.TextField::handler.addEventListener('twofingertap', function(source, type, globalPoint, y, x) {
			twofingertap.@com.pmt.wrap.titanium.sys.events.TitaniumUITextFieldTwofingertapHandler::twofingertap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
}
