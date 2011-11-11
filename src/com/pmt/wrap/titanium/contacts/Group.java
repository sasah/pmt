package com.pmt.wrap.titanium.contacts;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Contacts.Group</b>
 * <p>
 * An object which represents a group in the contacts database.
 * <p>
 * <b>Platforms:</b> iphone ipad 
 * <p>
 * <b>Since:</b> 1.4.0
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class Group {

	private JavaScriptObject handler;

	public Group(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>name</b> (string)
	 * <p>
	 * The name of the group
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native String getName() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Group::handler.name;
	}-*/;

	/**
	 * <b>name</b> (string)
	 * <p>
	 * The name of the group
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native void setName(String name) /*-{
		this.@com.pmt.wrap.titanium.contacts.Group::handler.name = name;
	}-*/;

	/**
	 * <b>add</b>
	 * <p>
	 * Adds a person to the group
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 * @param person (object) <a href="Titanium.Contacts.Person.html">Titanium.Contacts.Person</a> object to remove from the group
	 * @return void
	 */
	 public native void add(JavaScriptObject person) /*-{
		return this.@com.pmt.wrap.titanium.contacts.Group::handler.add(person);
	}-*/;

	/**
	 * <b>members</b>
	 * <p>
	 * The complete list of members of the group
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 * @return void
	 */
	 public native void members() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Group::handler.members();
	}-*/;

	/**
	 * <b>remove</b>
	 * <p>
	 * Removes a person from the group
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 * @param person (object) <a href="Titanium.Contacts.Person.html">Titanium.Contacts.Person</a> object to remove from the group
	 * @return void
	 */
	 public native void remove(JavaScriptObject person) /*-{
		return this.@com.pmt.wrap.titanium.contacts.Group::handler.remove(person);
	}-*/;

	/**
	 * <b>sortedMembers</b>
	 * <p>
	 * A list of sorted members
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 * @param sortBy (int) Method for sorting.  Must be one of  <a href="Titanium.Contacts.CONTACTS_SORT_FIRST_NAME-property.html">Titanium.Contacts.CONTACTS_SORT_FIRST_NAME</a> or <a href="Titanium.Contacts.CONTACTS_SORT_LAST_NAME-property.html">Titanium.Contacts.CONTACTS_SORT_LAST_NAME</a>
	 * @return void
	 */
	 public native void sortedMembers(int sortBy) /*-{
		return this.@com.pmt.wrap.titanium.contacts.Group::handler.sortedMembers(sortBy);
	}-*/;
}
