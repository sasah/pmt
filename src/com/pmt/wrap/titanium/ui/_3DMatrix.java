package com.pmt.wrap.titanium.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.3DMatrix</b>
 * <p>
 * The 3DMatrix is created by Titanium.UI.create3DMatrix.  The 3D Matrix is an object for holding values for an affine transformation matrix. A 3D matrix is used to rotate, scale, translate, or skew the objects in a three-dimensional space. A 3D matrix is represented by a 4 by 4 matrix. Because the forth column is always (0,0,1), the data structure contains values for only the first three columns.
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
public class _3DMatrix {

	private JavaScriptObject handler;

	public _3DMatrix(JavaScriptObject handler) {
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
		return this.@com.pmt.wrap.titanium.ui._3DMatrix::handler.addEventListener(name, callback);
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
		return this.@com.pmt.wrap.titanium.ui._3DMatrix::handler.fireEvent(name, event);
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
		return this.@com.pmt.wrap.titanium.ui._3DMatrix::handler.invert();
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
		return this.@com.pmt.wrap.titanium.ui._3DMatrix::handler.multiply(t2);
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
		return this.@com.pmt.wrap.titanium.ui._3DMatrix::handler.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>rotate</b>
	 * <p>
	 * Returns a matrix constructed by rotating an existing matrix
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param angle (float) The angle, in degrees, by which to rotate the matrix. A positive value specifies counterclockwise rotation and a negative value specifies clockwise rotation.
	 * @param x (float) The x part of the vector about which to rotate
	 * @param y (float) The y part of the vector about which to rotate
	 * @param z (float) The z part of the vector about which to rotate
	 * @return object
	 */
	 public native JavaScriptObject rotate(double angle, double x, double y, double z) /*-{
		return this.@com.pmt.wrap.titanium.ui._3DMatrix::handler.rotate(angle, x, y, z);
	}-*/;

	/**
	 * <b>scale</b>
	 * <p>
	 * Returns a matrix constructed by scaling an existing matrix
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param sx (float) The value by which to scale x values of the matrix
	 * @param sy (float) The value by which to scale y values of the matrix
	 * @param sz (float) The value by which to scale z values of the matrix
	 * @return object
	 */
	 public native JavaScriptObject scale(double sx, double sy, double sz) /*-{
		return this.@com.pmt.wrap.titanium.ui._3DMatrix::handler.scale(sx, sy, sz);
	}-*/;

	/**
	 * <b>translate</b>
	 * <p>
	 * Returns a matrix constructed by translating an existing matrix
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.9
	 * @param tx (float) The value by which to move x values with the matrix
	 * @param ty (float) The value by which to move y values with the matrix
	 * @param tz (float) The value by which to move z values with the matrix
	 * @return object
	 */
	 public native JavaScriptObject translate(double tx, double ty, double tz) /*-{
		return this.@com.pmt.wrap.titanium.ui._3DMatrix::handler.translate(tx, ty, tz);
	}-*/;
}
