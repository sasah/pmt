package com.pmt.wrap.titanium.map;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Map.Annotation</b>
 * <p>
 * An Annotation object that is created by the method Titanium.Map.createAnnotation. This object gives you low level control over annotations that can be added to a Map View.
 * <p>
 * <b>Platforms:</b> android iphone ipad 
 * <p>
 * <b>Since:</b> 0.9
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> proxy
 * <p>
 * <b>Returns:</b> null
 */
public class Annotation {

	private JavaScriptObject handler;

	public Annotation(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>animate</b> (boolean)
	 * <p>
	 * boolean to indicate whether the pin should animate when dropped
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getAnimate() /*-{
		return this.@com.pmt.wrap.titanium.map.Annotation::handler.animate;
	}-*/;

	/**
	 * <b>animate</b> (boolean)
	 * <p>
	 * boolean to indicate whether the pin should animate when dropped
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setAnimate(boolean animate) /*-{
		this.@com.pmt.wrap.titanium.map.Annotation::handler.animate = animate;
	}-*/;

	/**
	 * <b>image</b> (string)
	 * <p>
	 * image view for the pin instead of default image.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getImage() /*-{
		return this.@com.pmt.wrap.titanium.map.Annotation::handler.image;
	}-*/;

	/**
	 * <b>image</b> (string)
	 * <p>
	 * image view for the pin instead of default image.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setImage(String image) /*-{
		this.@com.pmt.wrap.titanium.map.Annotation::handler.image = image;
	}-*/;

	/**
	 * <b>leftButton</b> (int,string)
	 * <p>
	 * the left button image on the annotation. must either be a button type constant or url
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native int getLeftButtonI() /*-{
		return this.@com.pmt.wrap.titanium.map.Annotation::handler.leftButton;
	}-*/;

	/**
	 * <b>leftButton</b> (int,string)
	 * <p>
	 * the left button image on the annotation. must either be a button type constant or url
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setLeftButton(int leftButton) /*-{
		this.@com.pmt.wrap.titanium.map.Annotation::handler.leftButton = leftButton;
	}-*/;

	/**
	 * <b>leftButton</b> (int,string)
	 * <p>
	 * the left button image on the annotation. must either be a button type constant or url
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getLeftButtonS() /*-{
		return this.@com.pmt.wrap.titanium.map.Annotation::handler.leftButton;
	}-*/;

	/**
	 * <b>leftButton</b> (int,string)
	 * <p>
	 * the left button image on the annotation. must either be a button type constant or url
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setLeftButton(String leftButton) /*-{
		this.@com.pmt.wrap.titanium.map.Annotation::handler.leftButton = leftButton;
	}-*/;

	/**
	 * <b>leftView</b> (object)
	 * <p>
	 * a left view that is displayed on the annotation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getLeftView() /*-{
		return this.@com.pmt.wrap.titanium.map.Annotation::handler.leftView;
	}-*/;

	/**
	 * <b>leftView</b> (object)
	 * <p>
	 * a left view that is displayed on the annotation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setLeftView(JavaScriptObject leftView) /*-{
		this.@com.pmt.wrap.titanium.map.Annotation::handler.leftView = leftView;
	}-*/;

	/**
	 * <b>pinImage</b> (string)
	 * <p>
	 * Android only. DEPRECATED use Titanium.Map.Annotation.image property instead.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getPinImage() /*-{
		return this.@com.pmt.wrap.titanium.map.Annotation::handler.pinImage;
	}-*/;

	/**
	 * <b>pinImage</b> (string)
	 * <p>
	 * Android only. DEPRECATED use Titanium.Map.Annotation.image property instead.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setPinImage(String pinImage) /*-{
		this.@com.pmt.wrap.titanium.map.Annotation::handler.pinImage = pinImage;
	}-*/;

	/**
	 * <b>pincolor</b> (int)
	 * <p>
	 * the pin color as one of Titanium.Map.ANNOTATION_RED, Titanium.Map.ANNOTATION_GREEN or Titanium.Map.ANNOTATION_PURPLE.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native int getPincolor() /*-{
		return this.@com.pmt.wrap.titanium.map.Annotation::handler.pincolor;
	}-*/;

	/**
	 * <b>pincolor</b> (int)
	 * <p>
	 * the pin color as one of Titanium.Map.ANNOTATION_RED, Titanium.Map.ANNOTATION_GREEN or Titanium.Map.ANNOTATION_PURPLE.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setPincolor(int pincolor) /*-{
		this.@com.pmt.wrap.titanium.map.Annotation::handler.pincolor = pincolor;
	}-*/;

	/**
	 * <b>rightButton</b> (int,string)
	 * <p>
	 * the right button image on the annotation. must either be a button type constant or url
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native int getRightButtonI() /*-{
		return this.@com.pmt.wrap.titanium.map.Annotation::handler.rightButton;
	}-*/;

	/**
	 * <b>rightButton</b> (int,string)
	 * <p>
	 * the right button image on the annotation. must either be a button type constant or url
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setRightButton(int rightButton) /*-{
		this.@com.pmt.wrap.titanium.map.Annotation::handler.rightButton = rightButton;
	}-*/;

	/**
	 * <b>rightButton</b> (int,string)
	 * <p>
	 * the right button image on the annotation. must either be a button type constant or url
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getRightButtonS() /*-{
		return this.@com.pmt.wrap.titanium.map.Annotation::handler.rightButton;
	}-*/;

	/**
	 * <b>rightButton</b> (int,string)
	 * <p>
	 * the right button image on the annotation. must either be a button type constant or url
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setRightButton(String rightButton) /*-{
		this.@com.pmt.wrap.titanium.map.Annotation::handler.rightButton = rightButton;
	}-*/;

	/**
	 * <b>rightView</b> (object)
	 * <p>
	 * a right view that is displayed on the annotation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getRightView() /*-{
		return this.@com.pmt.wrap.titanium.map.Annotation::handler.rightView;
	}-*/;

	/**
	 * <b>rightView</b> (object)
	 * <p>
	 * a right view that is displayed on the annotation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setRightView(JavaScriptObject rightView) /*-{
		this.@com.pmt.wrap.titanium.map.Annotation::handler.rightView = rightView;
	}-*/;

	/**
	 * <b>subtitle</b> (string)
	 * <p>
	 * the secondary title of the annotation view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getSubtitle() /*-{
		return this.@com.pmt.wrap.titanium.map.Annotation::handler.subtitle;
	}-*/;

	/**
	 * <b>subtitle</b> (string)
	 * <p>
	 * the secondary title of the annotation view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setSubtitle(String subtitle) /*-{
		this.@com.pmt.wrap.titanium.map.Annotation::handler.subtitle = subtitle;
	}-*/;

	/**
	 * <b>subtitleid</b> (string)
	 * <p>
	 * the key in the locale file to use for the subtitle property
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getSubtitleid() /*-{
		return this.@com.pmt.wrap.titanium.map.Annotation::handler.subtitleid;
	}-*/;

	/**
	 * <b>subtitleid</b> (string)
	 * <p>
	 * the key in the locale file to use for the subtitle property
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setSubtitleid(String subtitleid) /*-{
		this.@com.pmt.wrap.titanium.map.Annotation::handler.subtitleid = subtitleid;
	}-*/;

	/**
	 * <b>title</b> (string)
	 * <p>
	 * the primary title of the annotation view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getTitle() /*-{
		return this.@com.pmt.wrap.titanium.map.Annotation::handler.title;
	}-*/;

	/**
	 * <b>title</b> (string)
	 * <p>
	 * the primary title of the annotation view
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTitle(String title) /*-{
		this.@com.pmt.wrap.titanium.map.Annotation::handler.title = title;
	}-*/;

	/**
	 * <b>titleid</b> (string)
	 * <p>
	 * the key in the locale file to use for the title property
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getTitleid() /*-{
		return this.@com.pmt.wrap.titanium.map.Annotation::handler.titleid;
	}-*/;

	/**
	 * <b>titleid</b> (string)
	 * <p>
	 * the key in the locale file to use for the title property
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTitleid(String titleid) /*-{
		this.@com.pmt.wrap.titanium.map.Annotation::handler.titleid = titleid;
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
		return this.@com.pmt.wrap.titanium.map.Annotation::handler.addEventListener(name, callback);
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
		return this.@com.pmt.wrap.titanium.map.Annotation::handler.fireEvent(name, event);
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
		return this.@com.pmt.wrap.titanium.map.Annotation::handler.removeEventListener(name, callback);
	}-*/;
}
