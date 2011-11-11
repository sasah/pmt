package com.pmt.wrap.titanium.database;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Database.ResultSet</b>
 * <p>
 * The ResultSet instance returned by invoking a database SQL execute.
 * <p>
 * <b>Platforms:</b> android iphone ipad 
 * <p>
 * <b>Since:</b> 0.1
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class ResultSet {

	private JavaScriptObject handler;

	public ResultSet(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>rowCount</b> (int)
	 * <p>
	 * the number of rows in the result set
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native int getRowCount() /*-{
		return this.@com.pmt.wrap.titanium.database.ResultSet::handler.rowCount;
	}-*/;

	/**
	 * <b>rowCount</b> (int)
	 * <p>
	 * the number of rows in the result set
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setRowCount(int rowCount) /*-{
		this.@com.pmt.wrap.titanium.database.ResultSet::handler.rowCount = rowCount;
	}-*/;

	/**
	 * <b>validRow</b> (boolean)
	 * <p>
	 * returns true if the current row is still valid
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native boolean getValidRow() /*-{
		return this.@com.pmt.wrap.titanium.database.ResultSet::handler.validRow;
	}-*/;

	/**
	 * <b>validRow</b> (boolean)
	 * <p>
	 * returns true if the current row is still valid
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setValidRow(boolean validRow) /*-{
		this.@com.pmt.wrap.titanium.database.ResultSet::handler.validRow = validRow;
	}-*/;

	/**
	 * <b>close</b>
	 * <p>
	 * close the result set and release resources. once closed, this result set must no longer be used
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return void
	 */
	 public native void close() /*-{
		return this.@com.pmt.wrap.titanium.database.ResultSet::handler.close();
	}-*/;

	/**
	 * <b>field</b>
	 * <p>
	 * retrieve a row value by field index
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param index (int) column index (which is zero based)
	 * @param type (int) [optional] one of (Titanium.Database.FIELD_TYPE_STRING | Titanium.Database.FIELD_TYPE_INT | Titanium.Database.FIELD_TYPE_FLOAT | Titanium.Database.FIELD_TYPE_DOUBLE)
	 * @return object
	 */
	 public native JavaScriptObject field(int index, int type) /*-{
		return this.@com.pmt.wrap.titanium.database.ResultSet::handler.field(index, type);
	}-*/;

	/**
	 * <b>fieldByName</b>
	 * <p>
	 * retrieve a row value by field name
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param name (string) column name from SQL query
	 * @param type (int) [optional] one of (Titanium.Database.FIELD_TYPE_STRING | Titanium.Database.FIELD_TYPE_INT | Titanium.Database.FIELD_TYPE_FLOAT | Titanium.Database.FIELD_TYPE_DOUBLE)
	 * @return object
	 */
	 public native JavaScriptObject fieldByName(String name, int type) /*-{
		return this.@com.pmt.wrap.titanium.database.ResultSet::handler.fieldByName(name, type);
	}-*/;

	/**
	 * <b>fieldCount</b>
	 * <p>
	 * return the number of columns in the result set
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return int
	 */
	 public native int fieldCount() /*-{
		return this.@com.pmt.wrap.titanium.database.ResultSet::handler.fieldCount();
	}-*/;

	/**
	 * <b>fieldName</b>
	 * <p>
	 * return the field name for field index
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param index (int) field name column index (which is zero based)
	 * @return string
	 */
	 public native String fieldName(int index) /*-{
		return this.@com.pmt.wrap.titanium.database.ResultSet::handler.fieldName(index);
	}-*/;

	/**
	 * <b>isValidRow</b>
	 * <p>
	 * return true if the row is a valid row
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return boolean
	 */
	 public native boolean isValidRow() /*-{
		return this.@com.pmt.wrap.titanium.database.ResultSet::handler.isValidRow();
	}-*/;

	/**
	 * <b>next</b>
	 * <p>
	 * iterate to the next row in the result set. returns false if no more results are available
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return boolean
	 */
	 public native boolean next() /*-{
		return this.@com.pmt.wrap.titanium.database.ResultSet::handler.next();
	}-*/;
}
