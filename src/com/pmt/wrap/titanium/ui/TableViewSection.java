package com.pmt.wrap.titanium.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.TableViewSection</b>
 * <p>
 * A TableView section object created by the method Titanium.UI.createTableViewSection.
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
public class TableViewSection {

	private JavaScriptObject handler;

	public TableViewSection(JavaScriptObject handler) {
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
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.anchorPoint;
	}-*/;

	/**
	 * <b>anchorPoint</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the anchor point value. anchor specifies the position by which animation should occur. center is 0.5, 0.5
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setAnchorPoint(JavaScriptObject anchorPoint) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.anchorPoint = anchorPoint;
	}-*/;

	/**
	 * <b>animatedCenterPoint</b> (object)
	 * <p>
	 * read-only object with x and y properties of where the view is during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getAnimatedCenterPoint() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.animatedCenterPoint;
	}-*/;

	/**
	 * <b>animatedCenterPoint</b> (object)
	 * <p>
	 * read-only object with x and y properties of where the view is during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setAnimatedCenterPoint(JavaScriptObject animatedCenterPoint) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.animatedCenterPoint = animatedCenterPoint;
	}-*/;

	/**
	 * <b>backgroundColor</b> (string)
	 * <p>
	 * the background color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.backgroundColor;
	}-*/;

	/**
	 * <b>backgroundColor</b> (string)
	 * <p>
	 * the background color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundColor(String backgroundColor) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.backgroundColor = backgroundColor;
	}-*/;

	/**
	 * <b>backgroundDisabledColor</b> (string)
	 * <p>
	 * the disabled background color of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundDisabledColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.backgroundDisabledColor;
	}-*/;

	/**
	 * <b>backgroundDisabledColor</b> (string)
	 * <p>
	 * the disabled background color of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundDisabledColor(String backgroundDisabledColor) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.backgroundDisabledColor = backgroundDisabledColor;
	}-*/;

	/**
	 * <b>backgroundDisabledImage</b> (string)
	 * <p>
	 * the disabled background image url of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundDisabledImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.backgroundDisabledImage;
	}-*/;

	/**
	 * <b>backgroundDisabledImage</b> (string)
	 * <p>
	 * the disabled background image url of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundDisabledImage(String backgroundDisabledImage) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.backgroundDisabledImage = backgroundDisabledImage;
	}-*/;

	/**
	 * <b>backgroundFocusedColor</b> (string)
	 * <p>
	 * the focused background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundFocusedColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.backgroundFocusedColor;
	}-*/;

	/**
	 * <b>backgroundFocusedColor</b> (string)
	 * <p>
	 * the focused background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundFocusedColor(String backgroundFocusedColor) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.backgroundFocusedColor = backgroundFocusedColor;
	}-*/;

	/**
	 * <b>backgroundFocusedImage</b> (string)
	 * <p>
	 * the focused background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundFocusedImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.backgroundFocusedImage;
	}-*/;

	/**
	 * <b>backgroundFocusedImage</b> (string)
	 * <p>
	 * the focused background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundFocusedImage(String backgroundFocusedImage) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.backgroundFocusedImage = backgroundFocusedImage;
	}-*/;

	/**
	 * <b>backgroundGradient</b> (object)
	 * <p>
	 * a background gradient for the view with the properties: type,startPoint,endPoint,startRadius,endRadius,backfillStart,backfillEnd,colors.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getBackgroundGradient() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.backgroundGradient;
	}-*/;

	/**
	 * <b>backgroundGradient</b> (object)
	 * <p>
	 * a background gradient for the view with the properties: type,startPoint,endPoint,startRadius,endRadius,backfillStart,backfillEnd,colors.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundGradient(JavaScriptObject backgroundGradient) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.backgroundGradient = backgroundGradient;
	}-*/;

	/**
	 * <b>backgroundImage</b> (string)
	 * <p>
	 * the background image url of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.backgroundImage;
	}-*/;

	/**
	 * <b>backgroundImage</b> (string)
	 * <p>
	 * the background image url of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundImage(String backgroundImage) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.backgroundImage = backgroundImage;
	}-*/;

	/**
	 * <b>backgroundLeftCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the left end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The right end cap is therefore computed by adding the size of the left end cap and the middle portion together and then subtracting that value from the width of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getBackgroundLeftCap() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.backgroundLeftCap;
	}-*/;

	/**
	 * <b>backgroundLeftCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the left end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The right end cap is therefore computed by adding the size of the left end cap and the middle portion together and then subtracting that value from the width of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundLeftCap(double backgroundLeftCap) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.backgroundLeftCap = backgroundLeftCap;
	}-*/;

	/**
	 * <b>backgroundSelectedColor</b> (string)
	 * <p>
	 * the selected background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundSelectedColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.backgroundSelectedColor;
	}-*/;

	/**
	 * <b>backgroundSelectedColor</b> (string)
	 * <p>
	 * the selected background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundSelectedColor(String backgroundSelectedColor) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.backgroundSelectedColor = backgroundSelectedColor;
	}-*/;

	/**
	 * <b>backgroundSelectedImage</b> (string)
	 * <p>
	 * the selected background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundSelectedImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.backgroundSelectedImage;
	}-*/;

	/**
	 * <b>backgroundSelectedImage</b> (string)
	 * <p>
	 * the selected background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundSelectedImage(String backgroundSelectedImage) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.backgroundSelectedImage = backgroundSelectedImage;
	}-*/;

	/**
	 * <b>backgroundTopCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the top end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The bottom end cap is therefore computed by adding the size of the top end cap and the middle portion together and then subtracting that value from the height of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getBackgroundTopCap() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.backgroundTopCap;
	}-*/;

	/**
	 * <b>backgroundTopCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the top end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The bottom end cap is therefore computed by adding the size of the top end cap and the middle portion together and then subtracting that value from the height of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundTopCap(double backgroundTopCap) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.backgroundTopCap = backgroundTopCap;
	}-*/;

	/**
	 * <b>borderColor</b> (string)
	 * <p>
	 * the border color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBorderColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.borderColor;
	}-*/;

	/**
	 * <b>borderColor</b> (string)
	 * <p>
	 * the border color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBorderColor(String borderColor) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.borderColor = borderColor;
	}-*/;

	/**
	 * <b>borderRadius</b> (float)
	 * <p>
	 * the border radius of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getBorderRadius() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.borderRadius;
	}-*/;

	/**
	 * <b>borderRadius</b> (float)
	 * <p>
	 * the border radius of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBorderRadius(double borderRadius) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.borderRadius = borderRadius;
	}-*/;

	/**
	 * <b>borderWidth</b> (float)
	 * <p>
	 * the border width of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getBorderWidth() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.borderWidth;
	}-*/;

	/**
	 * <b>borderWidth</b> (float)
	 * <p>
	 * the border width of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBorderWidth(double borderWidth) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.borderWidth = borderWidth;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getBottomF() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBottom(double bottom) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.bottom = bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBottomS() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBottom(String bottom) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.bottom = bottom;
	}-*/;

	/**
	 * <b>center</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the center of the views position relative to the parent view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getCenter() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.center;
	}-*/;

	/**
	 * <b>center</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the center of the views position relative to the parent view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setCenter(JavaScriptObject center) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.center = center;
	}-*/;

	/**
	 * <b>focusable</b> (boolean)
	 * <p>
	 * Set true if you want a view to be focusable when navigating with the trackball or D-Pad. Default: false. (Android Only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.9
	 */
	public native boolean getFocusable() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.focusable;
	}-*/;

	/**
	 * <b>focusable</b> (boolean)
	 * <p>
	 * Set true if you want a view to be focusable when navigating with the trackball or D-Pad. Default: false. (Android Only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.9
	 */
	public native void setFocusable(boolean focusable) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.focusable = focusable;
	}-*/;

	/**
	 * <b>footerTitle</b> (string)
	 * <p>
	 * the title of the section footer
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getFooterTitle() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.footerTitle;
	}-*/;

	/**
	 * <b>footerTitle</b> (string)
	 * <p>
	 * the title of the section footer
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setFooterTitle(String footerTitle) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.footerTitle = footerTitle;
	}-*/;

	/**
	 * <b>footerView</b> (object)
	 * <p>
	 * a view to use instead of the default label when rendering the section footer
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getFooterView() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.footerView;
	}-*/;

	/**
	 * <b>footerView</b> (object)
	 * <p>
	 * a view to use instead of the default label when rendering the section footer
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setFooterView(JavaScriptObject footerView) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.footerView = footerView;
	}-*/;

	/**
	 * <b>headerTitle</b> (string)
	 * <p>
	 * the title of the section header
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getHeaderTitle() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.headerTitle;
	}-*/;

	/**
	 * <b>headerTitle</b> (string)
	 * <p>
	 * the title of the section header
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setHeaderTitle(String headerTitle) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.headerTitle = headerTitle;
	}-*/;

	/**
	 * <b>headerView</b> (object)
	 * <p>
	 * a view to use instead of the default label when rendering the section header
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getHeaderView() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.headerView;
	}-*/;

	/**
	 * <b>headerView</b> (object)
	 * <p>
	 * a view to use instead of the default label when rendering the section header
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setHeaderView(JavaScriptObject headerView) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.headerView = headerView;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getHeightF() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setHeight(double height) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.height = height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getHeightS() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setHeight(String height) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.height = height;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getLeftF() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setLeft(double left) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.left = left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getLeftS() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setLeft(String left) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.left = left;
	}-*/;

	/**
	 * <b>opacity</b> (float)
	 * <p>
	 * the opacity from 0.0-1.0
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getOpacity() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.opacity;
	}-*/;

	/**
	 * <b>opacity</b> (float)
	 * <p>
	 * the opacity from 0.0-1.0
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setOpacity(double opacity) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.opacity = opacity;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getRightF() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setRight(double right) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.right = right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getRightS() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setRight(String right) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.right = right;
	}-*/;

	/**
	 * <b>rowCount</b> (int)
	 * <p>
	 * the (readonly) number of rows in the section
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native int getRowCount() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.rowCount;
	}-*/;

	/**
	 * <b>rowCount</b> (int)
	 * <p>
	 * the (readonly) number of rows in the section
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setRowCount(int rowCount) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.rowCount = rowCount;
	}-*/;

	/**
	 * <b>size</b> (object)
	 * <p>
	 * the size of the view as a dictionary of width and height properties
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getSize() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.size;
	}-*/;

	/**
	 * <b>size</b> (object)
	 * <p>
	 * the size of the view as a dictionary of width and height properties
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setSize(JavaScriptObject size) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.size = size;
	}-*/;

	/**
	 * <b>softKeyboardOnFocus</b> (int)
	 * <p>
	 * One of Titanium.UI.Android.SOFT_KEYBOARD_DEFAULT_ON_FOCUS, Titanium.UI.Android.SOFT_KEYBOARD_HIDE_ON_FOCUS, or Titanium.UI.Android.SOFT_KEYBOARD_SHOW_ON_FOCUS. (Android only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.9
	 */
	public native int getSoftKeyboardOnFocus() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.softKeyboardOnFocus;
	}-*/;

	/**
	 * <b>softKeyboardOnFocus</b> (int)
	 * <p>
	 * One of Titanium.UI.Android.SOFT_KEYBOARD_DEFAULT_ON_FOCUS, Titanium.UI.Android.SOFT_KEYBOARD_HIDE_ON_FOCUS, or Titanium.UI.Android.SOFT_KEYBOARD_SHOW_ON_FOCUS. (Android only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.9
	 */
	public native void setSoftKeyboardOnFocus(int softKeyboardOnFocus) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.softKeyboardOnFocus = softKeyboardOnFocus;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getTopF() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTop(double top) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.top = top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getTopS() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTop(String top) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.top = top;
	}-*/;

	/**
	 * <b>touchEnabled</b> (boolean)
	 * <p>
	 * a boolean indicating if the view should receive touch events (true, default) or forward them to peers (false)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getTouchEnabled() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.touchEnabled;
	}-*/;

	/**
	 * <b>touchEnabled</b> (boolean)
	 * <p>
	 * a boolean indicating if the view should receive touch events (true, default) or forward them to peers (false)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTouchEnabled(boolean touchEnabled) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.touchEnabled = touchEnabled;
	}-*/;

	/**
	 * <b>transform</b> (object)
	 * <p>
	 * the transformation matrix to apply to the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getTransform() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.transform;
	}-*/;

	/**
	 * <b>transform</b> (object)
	 * <p>
	 * the transformation matrix to apply to the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTransform(JavaScriptObject transform) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.transform = transform;
	}-*/;

	/**
	 * <b>visible</b> (boolean)
	 * <p>
	 * a boolean of the visibility of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getVisible() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.visible;
	}-*/;

	/**
	 * <b>visible</b> (boolean)
	 * <p>
	 * a boolean of the visibility of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setVisible(boolean visible) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.visible = visible;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getWidthF() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setWidth(double width) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.width = width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getWidthS() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setWidth(String width) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.width = width;
	}-*/;

	/**
	 * <b>zIndex</b> (int)
	 * <p>
	 * the z index position relative to other sibling views
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native int getZIndex() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.zIndex;
	}-*/;

	/**
	 * <b>zIndex</b> (int)
	 * <p>
	 * the z index position relative to other sibling views
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setZIndex(int zIndex) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.zIndex = zIndex;
	}-*/;

	/**
	 * <b>add</b>
	 * <p>
	 * add a child to the view hierarchy
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param row (object) the row object to add to the section
	 * @param view (object) the view to add to this views hiearchy
	 * @return void
	 */
	 public native void add(JavaScriptObject row, JavaScriptObject view) /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.add(row, view);
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
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.addEventListener(name, callback);
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
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.animate(obj, callback);
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
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.fireEvent(name, event);
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
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.hide();
	}-*/;

	/**
	 * <b>remove</b>
	 * <p>
	 * remove a previously add view from the view hiearchy
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param row (object) the row object to remove from the section
	 * @param view (object) the view to remove from this views hiearchy
	 * @return void
	 */
	 public native void remove(JavaScriptObject row, JavaScriptObject view) /*-{
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.remove(row, view);
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
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.removeEventListener(name, callback);
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
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.show();
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
		return this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.toImage(f);
	}-*/;
	

	/**
	 * <b>click</b>
	 * <p>
	 * fired when the device detects a click (longer than touch) against the view
	 * @param click event handler
	 */
	public native void addClick(com.pmt.wrap.titanium.sys.events.TitaniumUITableViewSectionClickHandler click) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.addEventListener('click', function(source, type, globalPoint, y, x) {
			click.@com.pmt.wrap.titanium.sys.events.TitaniumUITableViewSectionClickHandler::click(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>dblclick</b>
	 * <p>
	 * fired when the device detects a double click against the view
	 * @param dblclick event handler
	 */
	public native void addDblclick(com.pmt.wrap.titanium.sys.events.TitaniumUITableViewSectionDblclickHandler dblclick) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.addEventListener('dblclick', function(source, type, globalPoint, y, x) {
			dblclick.@com.pmt.wrap.titanium.sys.events.TitaniumUITableViewSectionDblclickHandler::dblclick(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>doubletap</b>
	 * <p>
	 * fired when the device detects a double tap against the view
	 * @param doubletap event handler
	 */
	public native void addDoubletap(com.pmt.wrap.titanium.sys.events.TitaniumUITableViewSectionDoubletapHandler doubletap) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.addEventListener('doubletap', function(source, type, globalPoint, y, x) {
			doubletap.@com.pmt.wrap.titanium.sys.events.TitaniumUITableViewSectionDoubletapHandler::doubletap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>singletap</b>
	 * <p>
	 * fired when the device detects a single tap against the view
	 * @param singletap event handler
	 */
	public native void addSingletap(com.pmt.wrap.titanium.sys.events.TitaniumUITableViewSectionSingletapHandler singletap) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.addEventListener('singletap', function(source, type, globalPoint, y, x) {
			singletap.@com.pmt.wrap.titanium.sys.events.TitaniumUITableViewSectionSingletapHandler::singletap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>swipe</b>
	 * <p>
	 * fired when the device detects a swipe (left or right) against the view
	 * @param swipe event handler
	 */
	public native void addSwipe(com.pmt.wrap.titanium.sys.events.TitaniumUITableViewSectionSwipeHandler swipe) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.addEventListener('swipe', function(source, direction, type, globalPoint, y, x) {
			swipe.@com.pmt.wrap.titanium.sys.events.TitaniumUITableViewSectionSwipeHandler::swipe(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, direction, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchcancel</b>
	 * <p>
	 * fired when a touch event is interrupted by the device. this happens in circumenstances such as an incoming call to allow the UI to clean up state.
	 * @param touchcancel event handler
	 */
	public native void addTouchcancel(com.pmt.wrap.titanium.sys.events.TitaniumUITableViewSectionTouchcancelHandler touchcancel) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.addEventListener('touchcancel', function(source, type, globalPoint, y, x) {
			touchcancel.@com.pmt.wrap.titanium.sys.events.TitaniumUITableViewSectionTouchcancelHandler::touchcancel(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchend</b>
	 * <p>
	 * fired when a touch event is completed
	 * @param touchend event handler
	 */
	public native void addTouchend(com.pmt.wrap.titanium.sys.events.TitaniumUITableViewSectionTouchendHandler touchend) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.addEventListener('touchend', function(source, type, globalPoint, y, x) {
			touchend.@com.pmt.wrap.titanium.sys.events.TitaniumUITableViewSectionTouchendHandler::touchend(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchmove</b>
	 * <p>
	 * fired as soon as the device detects movement of a touch.  Event coordinates are always relative to the view in which the initial touch occurred
	 * @param touchmove event handler
	 */
	public native void addTouchmove(com.pmt.wrap.titanium.sys.events.TitaniumUITableViewSectionTouchmoveHandler touchmove) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.addEventListener('touchmove', function(source, type, globalPoint, y, x) {
			touchmove.@com.pmt.wrap.titanium.sys.events.TitaniumUITableViewSectionTouchmoveHandler::touchmove(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchstart</b>
	 * <p>
	 * fired as soon as the device detects a gesture
	 * @param touchstart event handler
	 */
	public native void addTouchstart(com.pmt.wrap.titanium.sys.events.TitaniumUITableViewSectionTouchstartHandler touchstart) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.addEventListener('touchstart', function(source, type, globalPoint, y, x) {
			touchstart.@com.pmt.wrap.titanium.sys.events.TitaniumUITableViewSectionTouchstartHandler::touchstart(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>twofingertap</b>
	 * <p>
	 * fired when the device detects a two-finger tap against the view
	 * @param twofingertap event handler
	 */
	public native void addTwofingertap(com.pmt.wrap.titanium.sys.events.TitaniumUITableViewSectionTwofingertapHandler twofingertap) /*-{
		this.@com.pmt.wrap.titanium.ui.TableViewSection::handler.addEventListener('twofingertap', function(source, type, globalPoint, y, x) {
			twofingertap.@com.pmt.wrap.titanium.sys.events.TitaniumUITableViewSectionTwofingertapHandler::twofingertap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
}
