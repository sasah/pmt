package com.pmt.wrap.titanium.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.Animation</b>
 * <p>
 * The Animation object is used for specifying lower-level animation properties and more low-level control of events during an animation. The Animation is created by the method Titanium.UI.createAnimation.
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
public class Animation {

	private JavaScriptObject handler;

	public Animation(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>autoreverse</b> (boolean)
	 * <p>
	 * the property specifies if the animation should be replayed in reverse upon completion
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getAutoreverse() /*-{
		return this.@com.pmt.wrap.titanium.ui.Animation::handler.autoreverse;
	}-*/;

	/**
	 * <b>autoreverse</b> (boolean)
	 * <p>
	 * the property specifies if the animation should be replayed in reverse upon completion
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setAutoreverse(boolean autoreverse) /*-{
		this.@com.pmt.wrap.titanium.ui.Animation::handler.autoreverse = autoreverse;
	}-*/;

	/**
	 * <b>backgroundColor</b> (string)
	 * <p>
	 * value of the backgroundColor property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getBackgroundColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.Animation::handler.backgroundColor;
	}-*/;

	/**
	 * <b>backgroundColor</b> (string)
	 * <p>
	 * value of the backgroundColor property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBackgroundColor(String backgroundColor) /*-{
		this.@com.pmt.wrap.titanium.ui.Animation::handler.backgroundColor = backgroundColor;
	}-*/;

	/**
	 * <b>bottom</b> (float)
	 * <p>
	 * value of the bottom property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getBottom() /*-{
		return this.@com.pmt.wrap.titanium.ui.Animation::handler.bottom;
	}-*/;

	/**
	 * <b>bottom</b> (float)
	 * <p>
	 * value of the bottom property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setBottom(double bottom) /*-{
		this.@com.pmt.wrap.titanium.ui.Animation::handler.bottom = bottom;
	}-*/;

	/**
	 * <b>center</b> (object)
	 * <p>
	 * value of the center property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getCenter() /*-{
		return this.@com.pmt.wrap.titanium.ui.Animation::handler.center;
	}-*/;

	/**
	 * <b>center</b> (object)
	 * <p>
	 * value of the center property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setCenter(JavaScriptObject center) /*-{
		this.@com.pmt.wrap.titanium.ui.Animation::handler.center = center;
	}-*/;

	/**
	 * <b>color</b> (string)
	 * <p>
	 * value of the color property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native String getColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.Animation::handler.color;
	}-*/;

	/**
	 * <b>color</b> (string)
	 * <p>
	 * value of the color property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setColor(String color) /*-{
		this.@com.pmt.wrap.titanium.ui.Animation::handler.color = color;
	}-*/;

	/**
	 * <b>curve</b> (int)
	 * <p>
	 * the curve of the animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native int getCurve() /*-{
		return this.@com.pmt.wrap.titanium.ui.Animation::handler.curve;
	}-*/;

	/**
	 * <b>curve</b> (int)
	 * <p>
	 * the curve of the animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setCurve(int curve) /*-{
		this.@com.pmt.wrap.titanium.ui.Animation::handler.curve = curve;
	}-*/;

	/**
	 * <b>delay</b> (float)
	 * <p>
	 * the duration of time in milliseconds before starting the animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getDelay() /*-{
		return this.@com.pmt.wrap.titanium.ui.Animation::handler.delay;
	}-*/;

	/**
	 * <b>delay</b> (float)
	 * <p>
	 * the duration of time in milliseconds before starting the animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setDelay(double delay) /*-{
		this.@com.pmt.wrap.titanium.ui.Animation::handler.delay = delay;
	}-*/;

	/**
	 * <b>duration</b> (float)
	 * <p>
	 * the duration of time in milliseconds to perform the animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getDuration() /*-{
		return this.@com.pmt.wrap.titanium.ui.Animation::handler.duration;
	}-*/;

	/**
	 * <b>duration</b> (float)
	 * <p>
	 * the duration of time in milliseconds to perform the animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setDuration(double duration) /*-{
		this.@com.pmt.wrap.titanium.ui.Animation::handler.duration = duration;
	}-*/;

	/**
	 * <b>height</b> (float)
	 * <p>
	 * value of the height property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getHeight() /*-{
		return this.@com.pmt.wrap.titanium.ui.Animation::handler.height;
	}-*/;

	/**
	 * <b>height</b> (float)
	 * <p>
	 * value of the height property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setHeight(double height) /*-{
		this.@com.pmt.wrap.titanium.ui.Animation::handler.height = height;
	}-*/;

	/**
	 * <b>left</b> (float)
	 * <p>
	 * value of the left property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getLeft() /*-{
		return this.@com.pmt.wrap.titanium.ui.Animation::handler.left;
	}-*/;

	/**
	 * <b>left</b> (float)
	 * <p>
	 * value of the left property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setLeft(double left) /*-{
		this.@com.pmt.wrap.titanium.ui.Animation::handler.left = left;
	}-*/;

	/**
	 * <b>opacity</b> (float)
	 * <p>
	 * value of the opacity property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getOpacity() /*-{
		return this.@com.pmt.wrap.titanium.ui.Animation::handler.opacity;
	}-*/;

	/**
	 * <b>opacity</b> (float)
	 * <p>
	 * value of the opacity property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setOpacity(double opacity) /*-{
		this.@com.pmt.wrap.titanium.ui.Animation::handler.opacity = opacity;
	}-*/;

	/**
	 * <b>opaque</b> (boolean)
	 * <p>
	 * value of the opaque property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getOpaque() /*-{
		return this.@com.pmt.wrap.titanium.ui.Animation::handler.opaque;
	}-*/;

	/**
	 * <b>opaque</b> (boolean)
	 * <p>
	 * value of the opaque property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setOpaque(boolean opaque) /*-{
		this.@com.pmt.wrap.titanium.ui.Animation::handler.opaque = opaque;
	}-*/;

	/**
	 * <b>repeat</b> (int)
	 * <p>
	 * the number of times the animation should be performed
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native int getRepeat() /*-{
		return this.@com.pmt.wrap.titanium.ui.Animation::handler.repeat;
	}-*/;

	/**
	 * <b>repeat</b> (int)
	 * <p>
	 * the number of times the animation should be performed
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setRepeat(int repeat) /*-{
		this.@com.pmt.wrap.titanium.ui.Animation::handler.repeat = repeat;
	}-*/;

	/**
	 * <b>right</b> (float)
	 * <p>
	 * value of the right property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getRight() /*-{
		return this.@com.pmt.wrap.titanium.ui.Animation::handler.right;
	}-*/;

	/**
	 * <b>right</b> (float)
	 * <p>
	 * value of the right property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setRight(double right) /*-{
		this.@com.pmt.wrap.titanium.ui.Animation::handler.right = right;
	}-*/;

	/**
	 * <b>top</b> (float)
	 * <p>
	 * value of the top property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getTop() /*-{
		return this.@com.pmt.wrap.titanium.ui.Animation::handler.top;
	}-*/;

	/**
	 * <b>top</b> (float)
	 * <p>
	 * value of the top property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTop(double top) /*-{
		this.@com.pmt.wrap.titanium.ui.Animation::handler.top = top;
	}-*/;

	/**
	 * <b>transform</b> (object)
	 * <p>
	 * value of the transform property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native JavaScriptObject getTransform() /*-{
		return this.@com.pmt.wrap.titanium.ui.Animation::handler.transform;
	}-*/;

	/**
	 * <b>transform</b> (object)
	 * <p>
	 * value of the transform property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTransform(JavaScriptObject transform) /*-{
		this.@com.pmt.wrap.titanium.ui.Animation::handler.transform = transform;
	}-*/;

	/**
	 * <b>transition</b> (int)
	 * <p>
	 * during a transition animation, this is the constant to the type of transition to use
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native int getTransition() /*-{
		return this.@com.pmt.wrap.titanium.ui.Animation::handler.transition;
	}-*/;

	/**
	 * <b>transition</b> (int)
	 * <p>
	 * during a transition animation, this is the constant to the type of transition to use
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setTransition(int transition) /*-{
		this.@com.pmt.wrap.titanium.ui.Animation::handler.transition = transition;
	}-*/;

	/**
	 * <b>visible</b> (boolean)
	 * <p>
	 * value of the visible property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native boolean getVisible() /*-{
		return this.@com.pmt.wrap.titanium.ui.Animation::handler.visible;
	}-*/;

	/**
	 * <b>visible</b> (boolean)
	 * <p>
	 * value of the visible property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setVisible(boolean visible) /*-{
		this.@com.pmt.wrap.titanium.ui.Animation::handler.visible = visible;
	}-*/;

	/**
	 * <b>width</b> (float)
	 * <p>
	 * value of the width property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native double getWidth() /*-{
		return this.@com.pmt.wrap.titanium.ui.Animation::handler.width;
	}-*/;

	/**
	 * <b>width</b> (float)
	 * <p>
	 * value of the width property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setWidth(double width) /*-{
		this.@com.pmt.wrap.titanium.ui.Animation::handler.width = width;
	}-*/;

	/**
	 * <b>zIndex</b> (int)
	 * <p>
	 * value of the zIndex property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native int getZIndex() /*-{
		return this.@com.pmt.wrap.titanium.ui.Animation::handler.zIndex;
	}-*/;

	/**
	 * <b>zIndex</b> (int)
	 * <p>
	 * value of the zIndex property to change during animation
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 */
	public native void setZIndex(int zIndex) /*-{
		this.@com.pmt.wrap.titanium.ui.Animation::handler.zIndex = zIndex;
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
		return this.@com.pmt.wrap.titanium.ui.Animation::handler.addEventListener(name, callback);
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
		return this.@com.pmt.wrap.titanium.ui.Animation::handler.fireEvent(name, event);
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
		return this.@com.pmt.wrap.titanium.ui.Animation::handler.removeEventListener(name, callback);
	}-*/;
	

	/**
	 * <b>complete</b>
	 * <p>
	 * fired when the animation completes
	 * @param complete event handler
	 */
	public native void addComplete(com.pmt.wrap.titanium.sys.events.TitaniumUIAnimationCompleteHandler complete) /*-{
		this.@com.pmt.wrap.titanium.ui.Animation::handler.addEventListener('complete', function(source, type) {
			complete.@com.pmt.wrap.titanium.sys.events.TitaniumUIAnimationCompleteHandler::complete(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type);
		});
	}-*/;
	

	/**
	 * <b>start</b>
	 * <p>
	 * fired when the animation starts
	 * @param start event handler
	 */
	public native void addStart(com.pmt.wrap.titanium.sys.events.TitaniumUIAnimationStartHandler start) /*-{
		this.@com.pmt.wrap.titanium.ui.Animation::handler.addEventListener('start', function(source, type) {
			start.@com.pmt.wrap.titanium.sys.events.TitaniumUIAnimationStartHandler::start(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(source, type);
		});
	}-*/;
}
