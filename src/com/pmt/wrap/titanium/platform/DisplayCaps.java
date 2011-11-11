package com.pmt.wrap.titanium.platform;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Platform.DisplayCaps</b>
 * <p>
 * The Display Caps object returned by the Titanium.Platform.displayCaps property.
 * <p>
 * <b>Platforms:</b> android iphone ipad 
 * <p>
 * <b>Since:</b> 0.8
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class DisplayCaps {

	private JavaScriptObject handler;

	public DisplayCaps(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>density</b> (string)
	 * <p>
	 * returns the density property of the display device.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getDensity() /*-{
		return this.@com.pmt.wrap.titanium.platform.DisplayCaps::handler.density;
	}-*/;

	/**
	 * <b>density</b> (string)
	 * <p>
	 * returns the density property of the display device.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setDensity(String density) /*-{
		this.@com.pmt.wrap.titanium.platform.DisplayCaps::handler.density = density;
	}-*/;

	/**
	 * <b>dpi</b> (int)
	 * <p>
	 * the DPI of the display device.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getDpi() /*-{
		return this.@com.pmt.wrap.titanium.platform.DisplayCaps::handler.dpi;
	}-*/;

	/**
	 * <b>dpi</b> (int)
	 * <p>
	 * the DPI of the display device.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setDpi(int dpi) /*-{
		this.@com.pmt.wrap.titanium.platform.DisplayCaps::handler.dpi = dpi;
	}-*/;

	/**
	 * <b>platformHeight</b> (float)
	 * <p>
	 * the height of the device screen
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getPlatformHeight() /*-{
		return this.@com.pmt.wrap.titanium.platform.DisplayCaps::handler.platformHeight;
	}-*/;

	/**
	 * <b>platformHeight</b> (float)
	 * <p>
	 * the height of the device screen
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setPlatformHeight(double platformHeight) /*-{
		this.@com.pmt.wrap.titanium.platform.DisplayCaps::handler.platformHeight = platformHeight;
	}-*/;

	/**
	 * <b>platformWidth</b> (float)
	 * <p>
	 * the width of the device screen
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native double getPlatformWidth() /*-{
		return this.@com.pmt.wrap.titanium.platform.DisplayCaps::handler.platformWidth;
	}-*/;

	/**
	 * <b>platformWidth</b> (float)
	 * <p>
	 * the width of the device screen
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setPlatformWidth(double platformWidth) /*-{
		this.@com.pmt.wrap.titanium.platform.DisplayCaps::handler.platformWidth = platformWidth;
	}-*/;
}
