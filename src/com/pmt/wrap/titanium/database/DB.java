package com.pmt.wrap.titanium.database;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Database.DB</b>
 * <p>
 * The Database instance returned by Titanium.Database.open or Titanium.Database.install. 
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
public class DB {

	private JavaScriptObject handler;

	public DB(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>lastInsertRowId</b> (int)
	 * <p>
	 * the last row identifier by the last INSERT query
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native int getLastInsertRowId() /*-{
		return this.@com.pmt.wrap.titanium.database.DB::handler.lastInsertRowId;
	}-*/;

	/**
	 * <b>lastInsertRowId</b> (int)
	 * <p>
	 * the last row identifier by the last INSERT query
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setLastInsertRowId(int lastInsertRowId) /*-{
		this.@com.pmt.wrap.titanium.database.DB::handler.lastInsertRowId = lastInsertRowId;
	}-*/;

	/**
	 * <b>name</b> (string)
	 * <p>
	 * the name of the database
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native String getName() /*-{
		return this.@com.pmt.wrap.titanium.database.DB::handler.name;
	}-*/;

	/**
	 * <b>name</b> (string)
	 * <p>
	 * the name of the database
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setName(String name) /*-{
		this.@com.pmt.wrap.titanium.database.DB::handler.name = name;
	}-*/;

	/**
	 * <b>rowsAffected</b> (int)
	 * <p>
	 * the number of rows affected by the last query
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native int getRowsAffected() /*-{
		return this.@com.pmt.wrap.titanium.database.DB::handler.rowsAffected;
	}-*/;

	/**
	 * <b>rowsAffected</b> (int)
	 * <p>
	 * the number of rows affected by the last query
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setRowsAffected(int rowsAffected) /*-{
		this.@com.pmt.wrap.titanium.database.DB::handler.rowsAffected = rowsAffected;
	}-*/;

	/**
	 * <b>close</b>
	 * <p>
	 * close the database and release resources from memory. once closed, this instance is no longer valid and must no longer be used.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return void
	 */
	 public native void close() /*-{
		return this.@com.pmt.wrap.titanium.database.DB::handler.close();
	}-*/;

	/**
	 * <b>execute</b>
	 * <p>
	 * execute a SQL statement against the database and returns a ResultSet
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @param sql (string) the SQL to execute
	 * @param vararg (Array) one or more optional variable arguments passed to this function or an array of objects to be replaced in the query using ? substitution.
	 * @return object
	 */
	 public native JavaScriptObject execute(String sql, JavaScriptObject vararg) /*-{
		return this.@com.pmt.wrap.titanium.database.DB::handler.execute(sql, vararg);
	}-*/;

	/**
	 * <b>remove</b>
	 * <p>
	 * remove the database files for this instance from disk. WARNING: this is a destructive operation and cannot be reversed. All data in the database will be lost upon calling this function. Use with caution.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * @return void
	 */
	 public native void remove() /*-{
		return this.@com.pmt.wrap.titanium.database.DB::handler.remove();
	}-*/;
}
