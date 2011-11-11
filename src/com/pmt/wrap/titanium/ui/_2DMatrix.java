package com.pmt.wrap.titanium.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.2DMatrix</b>
 * <p>
 * The 2DMatrix is created by Titanium.UI.create2DMatrix.  The 2D Matrix is an object for holding values for an affine transformation matrix. A 2D matrix is used to rotate, scale, translate, or skew the objects in a two-dimensional space. A 2D matrix is represented by a 3 by 3 matrix. Because the third column is always (0,0,1), the data structure contains values for only the first two columns.
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
public class _2DMatrix {

	private JavaScriptObject handler;

	public _2DMatrix(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

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
		return this.@com.pmt.wrap.titanium.ui._2DMatrix::handler.addEventListener(name, callback);
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
		return this.@com.pmt.wrap.titanium.ui._2DMatrix::handler.fireEvent(name, event);
	}-*/;

	/**
	 * <b>invert</b>
	 * <p>
	 * Returns a matrix constructed by inverting an existing matrix
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @return void
	 */
	 public native void invert() /*-{
		return this.@com.pmt.wrap.titanium.ui._2DMatrix::handler.invert();
	}-*/;

	/**
	 * <b>multiply</b>
	 * <p>
	 * Returns a matrix constructed by combining two existing matrix.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param t2 (object) The second matrix. This matrix is concatenated to the matrix instance against which the function is invoked.  The result of this function is the first matrix multiplied by the second matrix. You might perform several multiplications in order to create a single matrix that contains the cumulative effects of several transformations. Note that matrix operations are not commutative - the order in which you concatenate matrices is important. That is, the result of multiplying matrix t1 by matrix t2 does not necessarily equal the result of multiplying matrix t2 by matrix t1.
	 * @return object
	 */
	 public native JavaScriptObject multiply(JavaScriptObject t2) /*-{
		return this.@com.pmt.wrap.titanium.ui._2DMatrix::handler.multiply(t2);
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
		return this.@com.pmt.wrap.titanium.ui._2DMatrix::handler.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>rotate</b>
	 * <p>
	 * Returns a matrix constructed by rotating an existing matrix
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param angle (float) The angle, in degrees, by which to rotate the matrix. A positive value specifies counterclockwise rotation and a negative value specifies clockwise rotation.
	 * @return object
	 */
	 public native JavaScriptObject rotate(double angle) /*-{
		return this.@com.pmt.wrap.titanium.ui._2DMatrix::handler.rotate(angle);
	}-*/;

	/**
	 * <b>scale</b>
	 * <p>
	 * Returns a matrix constructed by scaling an existing matrix
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param sx (float) The value by which to scale x values of the matrix
	 * @param sy (float) The value by which to scale y values of the matrix
	 * @return object
	 */
	 public native JavaScriptObject scale(double sx, double sy) /*-{
		return this.@com.pmt.wrap.titanium.ui._2DMatrix::handler.scale(sx, sy);
	}-*/;

	/**
	 * <b>translate</b>
	 * <p>
	 * Returns a matrix constructed by translating an existing matrix
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param tx (float) The value by which to move x values with the matrix
	 * @param ty (float) The value by which to move y values with the matrix
	 * @return object
	 */
	 public native JavaScriptObject translate(double tx, double ty) /*-{
		return this.@com.pmt.wrap.titanium.ui._2DMatrix::handler.translate(tx, ty);
	}-*/;
}
