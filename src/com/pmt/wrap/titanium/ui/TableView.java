package com.pmt.wrap.titanium.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.TableView</b>
 * <p>
 * A Table View allows you to create a scrollable table of content in a list-based fashion. The Table View is created by the method Titanium.UI.createTableView.
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
public class TableView {

	private JavaScriptObject handler;

	public TableView(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>allowsSelection</b> (boolean)
	 * <p>
	 * true if the rows can be selected
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getAllowsSelection() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.allowsSelection;
	}-*/;

	/**
	 * <b>allowsSelection</b> (boolean)
	 * <p>
	 * true if the rows can be selected
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setAllowsSelection(boolean allowsSelection) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.allowsSelection = allowsSelection;
	}-*/;

	/**
	 * <b>allowsSelectionDuringEditing</b> (boolean)
	 * <p>
	 * true if the rows can be selected while editing the table (iOS Only)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getAllowsSelectionDuringEditing() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.allowsSelectionDuringEditing;
	}-*/;

	/**
	 * <b>allowsSelectionDuringEditing</b> (boolean)
	 * <p>
	 * true if the rows can be selected while editing the table (iOS Only)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setAllowsSelectionDuringEditing(boolean allowsSelectionDuringEditing) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.allowsSelectionDuringEditing = allowsSelectionDuringEditing;
	}-*/;

	/**
	 * <b>anchorPoint</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the anchor point value. anchor specifies the position by which animation should occur. center is 0.5, 0.5
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getAnchorPoint() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.anchorPoint;
	}-*/;

	/**
	 * <b>anchorPoint</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the anchor point value. anchor specifies the position by which animation should occur. center is 0.5, 0.5
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setAnchorPoint(JavaScriptObject anchorPoint) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.anchorPoint = anchorPoint;
	}-*/;

	/**
	 * <b>animatedCenterPoint</b> (object)
	 * <p>
	 * read-only object with x and y properties of where the view is during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getAnimatedCenterPoint() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.animatedCenterPoint;
	}-*/;

	/**
	 * <b>animatedCenterPoint</b> (object)
	 * <p>
	 * read-only object with x and y properties of where the view is during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setAnimatedCenterPoint(JavaScriptObject animatedCenterPoint) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.animatedCenterPoint = animatedCenterPoint;
	}-*/;

	/**
	 * <b>backgroundColor</b> (string)
	 * <p>
	 * the background color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBackgroundColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.backgroundColor;
	}-*/;

	/**
	 * <b>backgroundColor</b> (string)
	 * <p>
	 * the background color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundColor(String backgroundColor) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.backgroundColor = backgroundColor;
	}-*/;

	/**
	 * <b>backgroundDisabledColor</b> (string)
	 * <p>
	 * the disabled background color of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBackgroundDisabledColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.backgroundDisabledColor;
	}-*/;

	/**
	 * <b>backgroundDisabledColor</b> (string)
	 * <p>
	 * the disabled background color of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundDisabledColor(String backgroundDisabledColor) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.backgroundDisabledColor = backgroundDisabledColor;
	}-*/;

	/**
	 * <b>backgroundDisabledImage</b> (string)
	 * <p>
	 * the disabled background image url of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBackgroundDisabledImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.backgroundDisabledImage;
	}-*/;

	/**
	 * <b>backgroundDisabledImage</b> (string)
	 * <p>
	 * the disabled background image url of the view. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundDisabledImage(String backgroundDisabledImage) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.backgroundDisabledImage = backgroundDisabledImage;
	}-*/;

	/**
	 * <b>backgroundFocusedColor</b> (string)
	 * <p>
	 * the focused background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBackgroundFocusedColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.backgroundFocusedColor;
	}-*/;

	/**
	 * <b>backgroundFocusedColor</b> (string)
	 * <p>
	 * the focused background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundFocusedColor(String backgroundFocusedColor) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.backgroundFocusedColor = backgroundFocusedColor;
	}-*/;

	/**
	 * <b>backgroundFocusedImage</b> (string)
	 * <p>
	 * the focused background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBackgroundFocusedImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.backgroundFocusedImage;
	}-*/;

	/**
	 * <b>backgroundFocusedImage</b> (string)
	 * <p>
	 * the focused background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundFocusedImage(String backgroundFocusedImage) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.backgroundFocusedImage = backgroundFocusedImage;
	}-*/;

	/**
	 * <b>backgroundGradient</b> (object)
	 * <p>
	 * a background gradient for the view with the properties: type,startPoint,endPoint,startRadius,endRadius,backfillStart,backfillEnd,colors.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getBackgroundGradient() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.backgroundGradient;
	}-*/;

	/**
	 * <b>backgroundGradient</b> (object)
	 * <p>
	 * a background gradient for the view with the properties: type,startPoint,endPoint,startRadius,endRadius,backfillStart,backfillEnd,colors.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundGradient(JavaScriptObject backgroundGradient) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.backgroundGradient = backgroundGradient;
	}-*/;

	/**
	 * <b>backgroundImage</b> (string)
	 * <p>
	 * the background image url of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBackgroundImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.backgroundImage;
	}-*/;

	/**
	 * <b>backgroundImage</b> (string)
	 * <p>
	 * the background image url of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundImage(String backgroundImage) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.backgroundImage = backgroundImage;
	}-*/;

	/**
	 * <b>backgroundLeftCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the left end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The right end cap is therefore computed by adding the size of the left end cap and the middle portion together and then subtracting that value from the width of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getBackgroundLeftCap() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.backgroundLeftCap;
	}-*/;

	/**
	 * <b>backgroundLeftCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the left end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The right end cap is therefore computed by adding the size of the left end cap and the middle portion together and then subtracting that value from the width of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundLeftCap(double backgroundLeftCap) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.backgroundLeftCap = backgroundLeftCap;
	}-*/;

	/**
	 * <b>backgroundSelectedColor</b> (string)
	 * <p>
	 * the selected background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBackgroundSelectedColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.backgroundSelectedColor;
	}-*/;

	/**
	 * <b>backgroundSelectedColor</b> (string)
	 * <p>
	 * the selected background color of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundSelectedColor(String backgroundSelectedColor) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.backgroundSelectedColor = backgroundSelectedColor;
	}-*/;

	/**
	 * <b>backgroundSelectedImage</b> (string)
	 * <p>
	 * the selected background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBackgroundSelectedImage() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.backgroundSelectedImage;
	}-*/;

	/**
	 * <b>backgroundSelectedImage</b> (string)
	 * <p>
	 * the selected background image url of the view. focusable must be true for normal views. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundSelectedImage(String backgroundSelectedImage) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.backgroundSelectedImage = backgroundSelectedImage;
	}-*/;

	/**
	 * <b>backgroundTopCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the top end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The bottom end cap is therefore computed by adding the size of the top end cap and the middle portion together and then subtracting that value from the height of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getBackgroundTopCap() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.backgroundTopCap;
	}-*/;

	/**
	 * <b>backgroundTopCap</b> (float)
	 * <p>
	 * End caps specify the portion of an image that should not be resized when an image is stretched. This technique is used to implement buttons and other resizable image-based interface elements. When a button with end caps is resized, the resizing occurs only in the middle of the button, in the region between the end caps. The end caps themselves keep their original size and appearance. This property specifies the size of the top end cap. The middle (stretchable) portion is assumed to be 1 pixel wide. The bottom end cap is therefore computed by adding the size of the top end cap and the middle portion together and then subtracting that value from the height of the image
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBackgroundTopCap(double backgroundTopCap) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.backgroundTopCap = backgroundTopCap;
	}-*/;

	/**
	 * <b>borderColor</b> (string)
	 * <p>
	 * the border color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBorderColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.borderColor;
	}-*/;

	/**
	 * <b>borderColor</b> (string)
	 * <p>
	 * the border color of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBorderColor(String borderColor) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.borderColor = borderColor;
	}-*/;

	/**
	 * <b>borderRadius</b> (float)
	 * <p>
	 * the border radius of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getBorderRadius() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.borderRadius;
	}-*/;

	/**
	 * <b>borderRadius</b> (float)
	 * <p>
	 * the border radius of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBorderRadius(double borderRadius) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.borderRadius = borderRadius;
	}-*/;

	/**
	 * <b>borderWidth</b> (float)
	 * <p>
	 * the border width of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getBorderWidth() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.borderWidth;
	}-*/;

	/**
	 * <b>borderWidth</b> (float)
	 * <p>
	 * the border width of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBorderWidth(double borderWidth) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.borderWidth = borderWidth;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getBottomF() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBottom(double bottom) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.bottom = bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBottomS() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float,string)
	 * <p>
	 * property for the view bottom position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBottom(String bottom) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.bottom = bottom;
	}-*/;

	/**
	 * <b>center</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the center of the views position relative to the parent view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getCenter() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.center;
	}-*/;

	/**
	 * <b>center</b> (object)
	 * <p>
	 * a dictionary with properties x and y to indicate the center of the views position relative to the parent view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setCenter(JavaScriptObject center) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.center = center;
	}-*/;

	/**
	 * <b>data</b> (array)
	 * <p>
	 * the data array of objects to be used for the rows of the table view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getData() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.data;
	}-*/;

	/**
	 * <b>data</b> (array)
	 * <p>
	 * the data array of objects to be used for the rows of the table view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setData(JavaScriptObject data) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.data = data;
	}-*/;

	/**
	 * <b>editable</b> (boolean)
	 * <p>
	 * allow the table view to be editable (this must be true for swipe-to-delete) (iOS Only)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getEditable() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.editable;
	}-*/;

	/**
	 * <b>editable</b> (boolean)
	 * <p>
	 * allow the table view to be editable (this must be true for swipe-to-delete) (iOS Only)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setEditable(boolean editable) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.editable = editable;
	}-*/;

	/**
	 * <b>editing</b> (boolean)
	 * <p>
	 * boolean to control the editing state of the table view (iOS Only)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getEditing() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.editing;
	}-*/;

	/**
	 * <b>editing</b> (boolean)
	 * <p>
	 * boolean to control the editing state of the table view (iOS Only)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setEditing(boolean editing) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.editing = editing;
	}-*/;

	/**
	 * <b>filterAttribute</b> (string)
	 * <p>
	 * the filter attribute to be used when searching. this property maps to your data object or a property on the row object
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getFilterAttribute() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.filterAttribute;
	}-*/;

	/**
	 * <b>filterAttribute</b> (string)
	 * <p>
	 * the filter attribute to be used when searching. this property maps to your data object or a property on the row object
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setFilterAttribute(String filterAttribute) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.filterAttribute = filterAttribute;
	}-*/;

	/**
	 * <b>filterCaseInsensitive</b> (boolean)
	 * <p>
	 * boolean to indicate if the search should be case sensitive or case insensitive (default)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getFilterCaseInsensitive() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.filterCaseInsensitive;
	}-*/;

	/**
	 * <b>filterCaseInsensitive</b> (boolean)
	 * <p>
	 * boolean to indicate if the search should be case sensitive or case insensitive (default)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setFilterCaseInsensitive(boolean filterCaseInsensitive) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.filterCaseInsensitive = filterCaseInsensitive;
	}-*/;

	/**
	 * <b>focusable</b> (boolean)
	 * <p>
	 * Set true if you want a view to be focusable when navigating with the trackball or D-Pad. Default: false. (Android Only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.8
	 */
	public native boolean getFocusable() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.focusable;
	}-*/;

	/**
	 * <b>focusable</b> (boolean)
	 * <p>
	 * Set true if you want a view to be focusable when navigating with the trackball or D-Pad. Default: false. (Android Only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.8
	 */
	public native void setFocusable(boolean focusable) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.focusable = focusable;
	}-*/;

	/**
	 * <b>footerTitle</b> (string)
	 * <p>
	 * the table view footer title
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getFooterTitle() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.footerTitle;
	}-*/;

	/**
	 * <b>footerTitle</b> (string)
	 * <p>
	 * the table view footer title
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setFooterTitle(String footerTitle) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.footerTitle = footerTitle;
	}-*/;

	/**
	 * <b>footerView</b> (object)
	 * <p>
	 * the table view footer as a view that will be rendered instead of a label
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getFooterView() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.footerView;
	}-*/;

	/**
	 * <b>footerView</b> (object)
	 * <p>
	 * the table view footer as a view that will be rendered instead of a label
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setFooterView(JavaScriptObject footerView) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.footerView = footerView;
	}-*/;

	/**
	 * <b>headerTitle</b> (string)
	 * <p>
	 * the table view header title
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getHeaderTitle() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.headerTitle;
	}-*/;

	/**
	 * <b>headerTitle</b> (string)
	 * <p>
	 * the table view header title
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setHeaderTitle(String headerTitle) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.headerTitle = headerTitle;
	}-*/;

	/**
	 * <b>headerView</b> (object)
	 * <p>
	 * the table view header as a view that will be rendered instead of a label
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getHeaderView() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.headerView;
	}-*/;

	/**
	 * <b>headerView</b> (object)
	 * <p>
	 * the table view header as a view that will be rendered instead of a label
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setHeaderView(JavaScriptObject headerView) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.headerView = headerView;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getHeightF() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setHeight(double height) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.height = height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getHeightS() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.height;
	}-*/;

	/**
	 * <b>height</b> (float,string)
	 * <p>
	 * property for the view height. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setHeight(String height) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.height = height;
	}-*/;

	/**
	 * <b>index</b> (array)
	 * <p>
	 * an array of objects (with title and index properties) to control the table view index
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getIndex() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.index;
	}-*/;

	/**
	 * <b>index</b> (array)
	 * <p>
	 * an array of objects (with title and index properties) to control the table view index
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setIndex(JavaScriptObject index) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.index = index;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getLeftF() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setLeft(double left) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.left = left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getLeftS() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.left;
	}-*/;

	/**
	 * <b>left</b> (float,string)
	 * <p>
	 * property for the view left position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setLeft(String left) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.left = left;
	}-*/;

	/**
	 * <b>maxRowHeight</b> (float)
	 * <p>
	 * max row height for table view rows
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getMaxRowHeight() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.maxRowHeight;
	}-*/;

	/**
	 * <b>maxRowHeight</b> (float)
	 * <p>
	 * max row height for table view rows
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setMaxRowHeight(double maxRowHeight) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.maxRowHeight = maxRowHeight;
	}-*/;

	/**
	 * <b>minRowHeight</b> (float)
	 * <p>
	 * min row height for table view rows
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getMinRowHeight() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.minRowHeight;
	}-*/;

	/**
	 * <b>minRowHeight</b> (float)
	 * <p>
	 * min row height for table view rows
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setMinRowHeight(double minRowHeight) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.minRowHeight = minRowHeight;
	}-*/;

	/**
	 * <b>moving</b> (boolean)
	 * <p>
	 * boolean to control the moveable state of the table view (iOS Only)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getMoving() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.moving;
	}-*/;

	/**
	 * <b>moving</b> (boolean)
	 * <p>
	 * boolean to control the moveable state of the table view (iOS Only)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setMoving(boolean moving) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.moving = moving;
	}-*/;

	/**
	 * <b>opacity</b> (float)
	 * <p>
	 * the opacity from 0.0-1.0
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getOpacity() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.opacity;
	}-*/;

	/**
	 * <b>opacity</b> (float)
	 * <p>
	 * the opacity from 0.0-1.0
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setOpacity(double opacity) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.opacity = opacity;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getRightF() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setRight(double right) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.right = right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getRightS() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.right;
	}-*/;

	/**
	 * <b>right</b> (float,string)
	 * <p>
	 * property for the view right position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setRight(String right) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.right = right;
	}-*/;

	/**
	 * <b>rowHeight</b> (float)
	 * <p>
	 * default row height for table view rows
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getRowHeight() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.rowHeight;
	}-*/;

	/**
	 * <b>rowHeight</b> (float)
	 * <p>
	 * default row height for table view rows
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setRowHeight(double rowHeight) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.rowHeight = rowHeight;
	}-*/;

	/**
	 * <b>scrollable</b> (boolean)
	 * <p>
	 * true (default) if tableview can be scrolled
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getScrollable() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.scrollable;
	}-*/;

	/**
	 * <b>scrollable</b> (boolean)
	 * <p>
	 * true (default) if tableview can be scrolled
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setScrollable(boolean scrollable) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.scrollable = scrollable;
	}-*/;

	/**
	 * <b>search</b> (object)
	 * <p>
	 * the search field to use for the table view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getSearch() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.search;
	}-*/;

	/**
	 * <b>search</b> (object)
	 * <p>
	 * the search field to use for the table view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setSearch(JavaScriptObject search) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.search = search;
	}-*/;

	/**
	 * <b>searchHidden</b> (boolean)
	 * <p>
	 * boolean to control the visibility of the search field
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getSearchHidden() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.searchHidden;
	}-*/;

	/**
	 * <b>searchHidden</b> (boolean)
	 * <p>
	 * boolean to control the visibility of the search field
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setSearchHidden(boolean searchHidden) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.searchHidden = searchHidden;
	}-*/;

	/**
	 * <b>separatorColor</b> (string)
	 * <p>
	 * the separator color color as a hex or named value
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getSeparatorColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.separatorColor;
	}-*/;

	/**
	 * <b>separatorColor</b> (string)
	 * <p>
	 * the separator color color as a hex or named value
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setSeparatorColor(String separatorColor) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.separatorColor = separatorColor;
	}-*/;

	/**
	 * <b>separatorStyle</b> (int)
	 * <p>
	 * the separator style constant. For iPhone, Titanium.UI.iPhone.TableViewSeparatorStyle
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getSeparatorStyle() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.separatorStyle;
	}-*/;

	/**
	 * <b>separatorStyle</b> (int)
	 * <p>
	 * the separator style constant. For iPhone, Titanium.UI.iPhone.TableViewSeparatorStyle
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setSeparatorStyle(int separatorStyle) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.separatorStyle = separatorStyle;
	}-*/;

	/**
	 * <b>showVerticalScrollIndicator</b> (boolean)
	 * <p>
	 * true (default) if tableview displays vertical scroll indicator (iOS Only)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getShowVerticalScrollIndicator() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.showVerticalScrollIndicator;
	}-*/;

	/**
	 * <b>showVerticalScrollIndicator</b> (boolean)
	 * <p>
	 * true (default) if tableview displays vertical scroll indicator (iOS Only)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setShowVerticalScrollIndicator(boolean showVerticalScrollIndicator) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.showVerticalScrollIndicator = showVerticalScrollIndicator;
	}-*/;

	/**
	 * <b>size</b> (object)
	 * <p>
	 * the size of the view as a dictionary of width and height properties
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getSize() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.size;
	}-*/;

	/**
	 * <b>size</b> (object)
	 * <p>
	 * the size of the view as a dictionary of width and height properties
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setSize(JavaScriptObject size) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.size = size;
	}-*/;

	/**
	 * <b>softKeyboardOnFocus</b> (int)
	 * <p>
	 * One of Titanium.UI.Android.SOFT_KEYBOARD_DEFAULT_ON_FOCUS, Titanium.UI.Android.SOFT_KEYBOARD_HIDE_ON_FOCUS, or Titanium.UI.Android.SOFT_KEYBOARD_SHOW_ON_FOCUS. (Android only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.8
	 */
	public native int getSoftKeyboardOnFocus() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.softKeyboardOnFocus;
	}-*/;

	/**
	 * <b>softKeyboardOnFocus</b> (int)
	 * <p>
	 * One of Titanium.UI.Android.SOFT_KEYBOARD_DEFAULT_ON_FOCUS, Titanium.UI.Android.SOFT_KEYBOARD_HIDE_ON_FOCUS, or Titanium.UI.Android.SOFT_KEYBOARD_SHOW_ON_FOCUS. (Android only)
	 * <p>
	 * <b>Platforms:</b> android, <b>Since:</b> 0.8
	 */
	public native void setSoftKeyboardOnFocus(int softKeyboardOnFocus) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.softKeyboardOnFocus = softKeyboardOnFocus;
	}-*/;

	/**
	 * <b>style</b> (int)
	 * <p>
	 * iPhone only. the style of the table view. constant from Titanium.UI.iPhone.TableViewStyle
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getStyle() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.style;
	}-*/;

	/**
	 * <b>style</b> (int)
	 * <p>
	 * iPhone only. the style of the table view. constant from Titanium.UI.iPhone.TableViewStyle
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setStyle(int style) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.style = style;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getTopF() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setTop(double top) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.top = top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getTopS() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.top;
	}-*/;

	/**
	 * <b>top</b> (float,string)
	 * <p>
	 * property for the view top position. This position is relative to the view's parent. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setTop(String top) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.top = top;
	}-*/;

	/**
	 * <b>touchEnabled</b> (boolean)
	 * <p>
	 * a boolean indicating if the view should receive touch events (true, default) or forward them to peers (false)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getTouchEnabled() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.touchEnabled;
	}-*/;

	/**
	 * <b>touchEnabled</b> (boolean)
	 * <p>
	 * a boolean indicating if the view should receive touch events (true, default) or forward them to peers (false)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setTouchEnabled(boolean touchEnabled) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.touchEnabled = touchEnabled;
	}-*/;

	/**
	 * <b>transform</b> (object)
	 * <p>
	 * the transformation matrix to apply to the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getTransform() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.transform;
	}-*/;

	/**
	 * <b>transform</b> (object)
	 * <p>
	 * the transformation matrix to apply to the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setTransform(JavaScriptObject transform) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.transform = transform;
	}-*/;

	/**
	 * <b>visible</b> (boolean)
	 * <p>
	 * a boolean of the visibility of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getVisible() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.visible;
	}-*/;

	/**
	 * <b>visible</b> (boolean)
	 * <p>
	 * a boolean of the visibility of the view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setVisible(boolean visible) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.visible = visible;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getWidthF() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setWidth(double width) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.width = width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getWidthS() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.width;
	}-*/;

	/**
	 * <b>width</b> (float,string)
	 * <p>
	 * property for the view width. Can be either a float value or a dimension string ie 'auto' (default).
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setWidth(String width) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.width = width;
	}-*/;

	/**
	 * <b>zIndex</b> (int)
	 * <p>
	 * the z index position relative to other sibling views
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getZIndex() /*-{
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.zIndex;
	}-*/;

	/**
	 * <b>zIndex</b> (int)
	 * <p>
	 * the z index position relative to other sibling views
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setZIndex(int zIndex) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.zIndex = zIndex;
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
		this.@com.pmt.wrap.titanium.ui.TableView::handler.add(view);
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
		this.@com.pmt.wrap.titanium.ui.TableView::handler.addEventListener(name, callback);
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
		this.@com.pmt.wrap.titanium.ui.TableView::handler.animate(obj, callback);
	}-*/;

	/**
	 * <b>appendRow</b>
	 * <p>
	 * append a row to the table, optionally with animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param row (object) row to append
	 * @param properties (object) animation properties
	 * @return void
	 */
	 public native void appendRow(JavaScriptObject row, JavaScriptObject properties) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.appendRow(row, properties);
	}-*/;

	/**
	 * <b>deleteRow</b>
	 * <p>
	 * delete an existing row, optionally with animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param row (int) index of row to delete
	 * @param properties (object) animation properties
	 * @return void
	 */
	 public native void deleteRow(int row, JavaScriptObject properties) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.deleteRow(row, properties);
	}-*/;

	/**
	 * <b>deselectRow</b>
	 * <p>
	 * programmatically deselect a row
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param row (int) row index to deselect
	 * @return void
	 */
	 public native void deselectRow(int row) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.deselectRow(row);
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
		this.@com.pmt.wrap.titanium.ui.TableView::handler.fireEvent(name, event);
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
		this.@com.pmt.wrap.titanium.ui.TableView::handler.hide();
	}-*/;

	/**
	 * <b>insertRowAfter</b>
	 * <p>
	 * insert a row before another row, optionally with animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param index (int) index
	 * @param row (object) row to insert
	 * @param properties (object) animation properties
	 * @return void
	 */
	 public native void insertRowAfter(int index, JavaScriptObject row, JavaScriptObject properties) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.insertRowAfter(index, row, properties);
	}-*/;

	/**
	 * <b>insertRowBefore</b>
	 * <p>
	 * insert a row after another row, optionally with animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param index (int) index
	 * @param row (object) row to insert
	 * @param properties (object) animation properties
	 * @return void
	 */
	 public native void insertRowBefore(int index, JavaScriptObject row, JavaScriptObject properties) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.insertRowBefore(index, row, properties);
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
		this.@com.pmt.wrap.titanium.ui.TableView::handler.remove(view);
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
		this.@com.pmt.wrap.titanium.ui.TableView::handler.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>scrollToIndex</b>
	 * <p>
	 * scroll to a specific row index and ensure that that row is on screen
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param index (int) index
	 * @param properties (object) animation properties. position property controls the position constant to use for position (on iPhone, use constants from Titanium.UI.iPhone.TableViewScrollPosition).
	 * @return void
	 */
	 public native void scrollToIndex(int index, JavaScriptObject properties) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.scrollToIndex(index, properties);
	}-*/;

	/**
	 * <b>scrollToTop</b>
	 * <p>
	 * scroll the table to a specific top position where 0 is the topmost y position in the table view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param top (float) y position
	 * @param properties (object) optional dictionary with the key animated (default, true) as boolean to indicate if the scroll should be animated or immediate
	 * @return void
	 */
	 public native void scrollToTop(double top, JavaScriptObject properties) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.scrollToTop(top, properties);
	}-*/;

	/**
	 * <b>selectRow</b>
	 * <p>
	 * programmatically select a row
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param row (int) row index to select
	 * @return void
	 */
	 public native void selectRow(int row) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.selectRow(row);
	}-*/;

	/**
	 * <b>setData</b>
	 * <p>
	 * set the data in the table, optionally with animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param data (array) data array of rows either as objects or row objects
	 * @param properties (object) animation properties
	 * @return void
	 */
	 public native void setDataMethod(JavaScriptObject data, JavaScriptObject properties) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.setData(data, properties);
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
		this.@com.pmt.wrap.titanium.ui.TableView::handler.show();
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
		return this.@com.pmt.wrap.titanium.ui.TableView::handler.toImage(f);
	}-*/;

	/**
	 * <b>updateRow</b>
	 * <p>
	 * update an existing row, optionally with animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param row (object) row data to update
	 * @param properties (object) animation properties
	 * @return void
	 */
	 public native void updateRow(JavaScriptObject row, JavaScriptObject properties) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.updateRow(row, properties);
	}-*/;
	

	/**
	 * <b>click</b>
	 * <p>
	 * fired when the device detects a click (longer than touch) against the view
	 * @param click event handler
	 */
	public native void addClick(com.pmt.wrap.titanium.sys.events.TitaniumUITableViewClickHandler click) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.addEventListener('click', function(index, detail, source, rowData, type, globalPoint, y, section, searchMode, row, x) {
			click.@com.pmt.wrap.titanium.sys.events.TitaniumUITableViewClickHandler::click(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(index, detail, source, rowData, type, globalPoint, y, section, searchMode, row, x);
		});
	}-*/;
	

	/**
	 * <b>dblclick</b>
	 * <p>
	 * fired when the device detects a double click against the view
	 * @param dblclick event handler
	 */
	public native void addDblclick(com.pmt.wrap.titanium.sys.events.TitaniumUITableViewDblclickHandler dblclick) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.addEventListener('dblclick', function(source, type, globalPoint, y, x) {
			dblclick.@com.pmt.wrap.titanium.sys.events.TitaniumUITableViewDblclickHandler::dblclick(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>delete</b>
	 * <p>
	 * fired when a table row is delete by the user
	 * @param deleteEvent event handler
	 */
	public native void addDelete(com.pmt.wrap.titanium.sys.events.TitaniumUITableViewDeleteHandler deleteEvent) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.addEventListener('delete', function(index, detail, source, rowData, type, globalPoint, y, section, searchMode, row, x) {
			deleteEvent.@com.pmt.wrap.titanium.sys.events.TitaniumUITableViewDeleteHandler::delete(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(index, detail, source, rowData, type, globalPoint, y, section, searchMode, row, x);
		});
	}-*/;
	

	/**
	 * <b>doubletap</b>
	 * <p>
	 * fired when the device detects a double tap against the view
	 * @param doubletap event handler
	 */
	public native void addDoubletap(com.pmt.wrap.titanium.sys.events.TitaniumUITableViewDoubletapHandler doubletap) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.addEventListener('doubletap', function(source, type, globalPoint, y, x) {
			doubletap.@com.pmt.wrap.titanium.sys.events.TitaniumUITableViewDoubletapHandler::doubletap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>move</b>
	 * <p>
	 * fired when a table row is moved by the user
	 * @param move event handler
	 */
	public native void addMove(com.pmt.wrap.titanium.sys.events.TitaniumUITableViewMoveHandler move) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.addEventListener('move', function(index, detail, source, rowData, type, globalPoint, y, section, searchMode, row, x) {
			move.@com.pmt.wrap.titanium.sys.events.TitaniumUITableViewMoveHandler::move(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(index, detail, source, rowData, type, globalPoint, y, section, searchMode, row, x);
		});
	}-*/;
	

	/**
	 * <b>scroll</b>
	 * <p>
	 * fired when the table view is scrolled
	 * @param scroll event handler
	 */
	public native void addScroll(com.pmt.wrap.titanium.sys.events.TitaniumUITableViewScrollHandler scroll) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.addEventListener('scroll', function(source, contentSize, totalItemCount, contentOffset, type, globalPoint, y, visibleItemCount, firstVisibleItem, x, size) {
			scroll.@com.pmt.wrap.titanium.sys.events.TitaniumUITableViewScrollHandler::scroll(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, contentSize, totalItemCount, contentOffset, type, globalPoint, y, visibleItemCount, firstVisibleItem, x, size);
		});
	}-*/;
	

	/**
	 * <b>scrollEnd</b>
	 * <p>
	 * fired when the table view stops scrolling
	 * @param scrollEnd event handler
	 */
	public native void addScrollEnd(com.pmt.wrap.titanium.sys.events.TitaniumUITableViewScrollEndHandler scrollEnd) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.addEventListener('scrollEnd', function(source, contentSize, contentOffset, type, globalPoint, y, x, size) {
			scrollEnd.@com.pmt.wrap.titanium.sys.events.TitaniumUITableViewScrollEndHandler::scrollEnd(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, contentSize, contentOffset, type, globalPoint, y, x, size);
		});
	}-*/;
	

	/**
	 * <b>singletap</b>
	 * <p>
	 * fired when the device detects a single tap against the view
	 * @param singletap event handler
	 */
	public native void addSingletap(com.pmt.wrap.titanium.sys.events.TitaniumUITableViewSingletapHandler singletap) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.addEventListener('singletap', function(source, type, globalPoint, y, x) {
			singletap.@com.pmt.wrap.titanium.sys.events.TitaniumUITableViewSingletapHandler::singletap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>swipe</b>
	 * <p>
	 * fired when the device detects a swipe (left or right) against the view
	 * @param swipe event handler
	 */
	public native void addSwipe(com.pmt.wrap.titanium.sys.events.TitaniumUITableViewSwipeHandler swipe) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.addEventListener('swipe', function(source, direction, type, globalPoint, y, x) {
			swipe.@com.pmt.wrap.titanium.sys.events.TitaniumUITableViewSwipeHandler::swipe(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, direction, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchcancel</b>
	 * <p>
	 * fired when a touch event is interrupted by the device. this happens in circumenstances such as an incoming call to allow the UI to clean up state.
	 * @param touchcancel event handler
	 */
	public native void addTouchcancel(com.pmt.wrap.titanium.sys.events.TitaniumUITableViewTouchcancelHandler touchcancel) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.addEventListener('touchcancel', function(source, type, globalPoint, y, x) {
			touchcancel.@com.pmt.wrap.titanium.sys.events.TitaniumUITableViewTouchcancelHandler::touchcancel(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchend</b>
	 * <p>
	 * fired when a touch event is completed
	 * @param touchend event handler
	 */
	public native void addTouchend(com.pmt.wrap.titanium.sys.events.TitaniumUITableViewTouchendHandler touchend) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.addEventListener('touchend', function(source, type, globalPoint, y, x) {
			touchend.@com.pmt.wrap.titanium.sys.events.TitaniumUITableViewTouchendHandler::touchend(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchmove</b>
	 * <p>
	 * fired as soon as the device detects movement of a touch.  Event coordinates are always relative to the view in which the initial touch occurred
	 * @param touchmove event handler
	 */
	public native void addTouchmove(com.pmt.wrap.titanium.sys.events.TitaniumUITableViewTouchmoveHandler touchmove) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.addEventListener('touchmove', function(source, type, globalPoint, y, x) {
			touchmove.@com.pmt.wrap.titanium.sys.events.TitaniumUITableViewTouchmoveHandler::touchmove(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>touchstart</b>
	 * <p>
	 * fired as soon as the device detects a gesture
	 * @param touchstart event handler
	 */
	public native void addTouchstart(com.pmt.wrap.titanium.sys.events.TitaniumUITableViewTouchstartHandler touchstart) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.addEventListener('touchstart', function(source, type, globalPoint, y, x) {
			touchstart.@com.pmt.wrap.titanium.sys.events.TitaniumUITableViewTouchstartHandler::touchstart(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
	

	/**
	 * <b>twofingertap</b>
	 * <p>
	 * fired when the device detects a two-finger tap against the view
	 * @param twofingertap event handler
	 */
	public native void addTwofingertap(com.pmt.wrap.titanium.sys.events.TitaniumUITableViewTwofingertapHandler twofingertap) /*-{
		this.@com.pmt.wrap.titanium.ui.TableView::handler.addEventListener('twofingertap', function(source, type, globalPoint, y, x) {
			twofingertap.@com.pmt.wrap.titanium.sys.events.TitaniumUITableViewTwofingertapHandler::twofingertap(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type, globalPoint, y, x);
		});
	}-*/;
}
