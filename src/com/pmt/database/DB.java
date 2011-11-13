package com.pmt.database;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Database.DB</b>
 * <p>
 * The Database instance returned by Titanium.Database.open or
 * Titanium.Database.install.
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

	public DB(String path, String name) {
		this.handler = install(path, name);
	}

	public DB(String name) {
		this.handler = open(name);
	}

	/**
	 * <b>install</b>
	 * <p>
	 * install a database from the application Resources folder (at build time)
	 * and return a reference to the opened database. it is safe to call this
	 * method multiple times since this method will only install once if it
	 * doesn't already exist on the device.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * 
	 * @param path
	 *            (string) the path (relative to the main application Resources
	 *            folder at build time) to the db to install. this file must be
	 *            in the SQLite 3 file format.
	 * @param name
	 *            (string) the name of the database
	 * @return object
	 */
	private static native JavaScriptObject install(String path, String name) /*-{
		return Titanium.Database.install(path, name);
	}-*/;

	/**
	 * <b>open</b>
	 * <p>
	 * open a database. if it doesn't yet exist, create it.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * 
	 * @param name
	 *            (string) the name of the database
	 * @return object
	 */
	private static native JavaScriptObject open(String name) /*-{
		return Titanium.Database.open(name);
	}-*/;

	/**
	 * <b>lastInsertRowId</b> (int)
	 * <p>
	 * the last row identifier by the last INSERT query
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native int getLastInsertRowId() /*-{
		return this.@com.pmt.database.DB::handler.lastInsertRowId;
	}-*/;

	/**
	 * <b>lastInsertRowId</b> (int)
	 * <p>
	 * the last row identifier by the last INSERT query
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setLastInsertRowId(int lastInsertRowId) /*-{
		this.@com.pmt.database.DB::handler.lastInsertRowId = lastInsertRowId;
	}-*/;

	/**
	 * <b>name</b> (string)
	 * <p>
	 * the name of the database
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native String getName() /*-{
		return this.@com.pmt.database.DB::handler.name;
	}-*/;

	/**
	 * <b>name</b> (string)
	 * <p>
	 * the name of the database
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setName(String name) /*-{
		this.@com.pmt.database.DB::handler.name = name;
	}-*/;

	/**
	 * <b>rowsAffected</b> (int)
	 * <p>
	 * the number of rows affected by the last query
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native int getRowsAffected() /*-{
		return this.@com.pmt.database.DB::handler.rowsAffected;
	}-*/;

	/**
	 * <b>rowsAffected</b> (int)
	 * <p>
	 * the number of rows affected by the last query
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 */
	public native void setRowsAffected(int rowsAffected) /*-{
		this.@com.pmt.database.DB::handler.rowsAffected = rowsAffected;
	}-*/;

	/**
	 * <b>close</b>
	 * <p>
	 * close the database and release resources from memory. once closed, this
	 * instance is no longer valid and must no longer be used.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * 
	 * @return void
	 */
	public native void close() /*-{
		this.@com.pmt.database.DB::handler.close();
	}-*/;

	/**
	 * <b>execute</b>
	 * <p>
	 * execute a SQL statement against the database and returns a ResultSet
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * 
	 * @param sql
	 *            (string) the SQL to execute
	 * @param vararg
	 *            (Array) one or more optional variable arguments passed to this
	 *            function or an array of objects to be replaced in the query
	 *            using ? substitution.
	 * @return object
	 */
	public native JavaScriptObject execute(String sql, JavaScriptObject vararg) /*-{
		return this.@com.pmt.database.DB::handler.execute(sql, vararg);
	}-*/;

	/**
	 * <b>remove</b>
	 * <p>
	 * remove the database files for this instance from disk. WARNING: this is a
	 * destructive operation and cannot be reversed. All data in the database
	 * will be lost upon calling this function. Use with caution.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.1
	 * 
	 * @return void
	 */
	public native void remove() /*-{
		this.@com.pmt.database.DB::handler.remove();
	}-*/;
}
