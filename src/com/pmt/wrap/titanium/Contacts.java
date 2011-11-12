package com.pmt.wrap.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Contacts</b>
 * <p>
 * The top level Contacts module.  The Contacts module is used accessing the device Address Book.  (Read-only on Android.)
 * <p>
 * <b>Platforms:</b> iphone ipad android 
 * <p>
 * <b>Since:</b> 0.8
 * <p>
 * <b>Type:</b> module
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> object
 */
public class Contacts {

	private JavaScriptObject handler;

	public Contacts(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>CONTACTS_KIND_ORGANIZATION</b> (int) static
	 * <p>
	 * constant for 'organization' kind property of Person object
	 * <p>
	 * <b>Platforms:</b> iphone ipad android, <b>Since:</b> 0.8
	 */
	public static native int CONTACTS_KIND_ORGANIZATION() /*-{
		return Titanium.Contacts.CONTACTS_KIND_ORGANIZATION;
	}-*/;

	/**
	 * <b>CONTACTS_KIND_PERSON</b> (int) static
	 * <p>
	 * constant for 'person' kind property of Person object
	 * <p>
	 * <b>Platforms:</b> iphone ipad android, <b>Since:</b> 0.8
	 */
	public static native int CONTACTS_KIND_PERSON() /*-{
		return Titanium.Contacts.CONTACTS_KIND_PERSON;
	}-*/;

	/**
	 * <b>CONTACTS_SORT_FIRST_NAME</b> (int) static
	 * <p>
	 * constant for sorting group members by first name
	 * <p>
	 * <b>Platforms:</b> iphone ipad android, <b>Since:</b> 0.8
	 */
	public static native int CONTACTS_SORT_FIRST_NAME() /*-{
		return Titanium.Contacts.CONTACTS_SORT_FIRST_NAME;
	}-*/;

	/**
	 * <b>CONTACTS_SORT_LAST_NAME</b> (int) static
	 * <p>
	 * constant for sorting group members by last name
	 * <p>
	 * <b>Platforms:</b> iphone ipad android, <b>Since:</b> 0.8
	 */
	public static native int CONTACTS_SORT_LAST_NAME() /*-{
		return Titanium.Contacts.CONTACTS_SORT_LAST_NAME;
	}-*/;

	/**
	 * <b>addEventListener</b>
	 * <p>
	 * add an event listener for the instance to receive view triggered events
	 * <p>
	 * <b>Platforms:</b> iphone ipad android, <b>Since:</b> 0.8
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public static native void addEventListener(String name, JavaScriptObject callback) /*-{
		Titanium.Contacts.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>createGroup</b>
	 * <p>
	 * create and return an instance of Titanium.Contacts.Group
	 * <p>
	 * <b>Platforms:</b> iphone ipad android, <b>Since:</b> 0.8
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.Contacts.Group
	 * @return object
	 */
	 public static native JavaScriptObject createGroup(JavaScriptObject parameters) /*-{
		return Titanium.Contacts.createGroup(parameters);
	}-*/;

	/**
	 * <b>createPerson</b>
	 * <p>
	 * create and return an instance of Titanium.Contacts.Person
	 * <p>
	 * <b>Platforms:</b> iphone ipad android, <b>Since:</b> 0.8
	 * @param parameters (object) (optional) a dictionary object properties defined in Titanium.Contacts.Person
	 * @return object
	 */
	 public static native JavaScriptObject createPerson(JavaScriptObject parameters) /*-{
		return Titanium.Contacts.createPerson(parameters);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> iphone ipad android, <b>Since:</b> 0.8
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public static native void fireEvent(String name, JavaScriptObject event) /*-{
		Titanium.Contacts.fireEvent(name, event);
	}-*/;

	/**
	 * <b>getAllGroups</b>
	 * <p>
	 * Returns an of all Titanium.Contacts.Group objects in the contacts database
	 * <p>
	 * <b>Platforms:</b> iphone ipad android, <b>Since:</b> 0.8
	 * @return void
	 */
	 public static native void getAllGroups() /*-{
		Titanium.Contacts.getAllGroups();
	}-*/;

	/**
	 * <b>getAllPeople</b>
	 * <p>
	 * Returns an array of all Titanium.Contacts.Person objects in the contacts database
	 * <p>
	 * <b>Platforms:</b> iphone ipad android, <b>Since:</b> 0.8
	 * @return void
	 */
	 public static native void getAllPeople() /*-{
		Titanium.Contacts.getAllPeople();
	}-*/;

	/**
	 * <b>getGroupByID</b>
	 * <p>
	 * Returns a Titanium.Contacts.Group object with the given ID
	 * <p>
	 * <b>Platforms:</b> iphone ipad android, <b>Since:</b> 0.8
	 * @param id (int) The database ID of the group to retrieve
	 * @return object
	 */
	 public static native JavaScriptObject getGroupByID(int id) /*-{
		return Titanium.Contacts.getGroupByID(id);
	}-*/;

	/**
	 * <b>getPeopleWithName</b>
	 * <p>
	 * Returns an array of Titanium.Contacts.Person objects who have a name (first, last, middle, composite) which matches the given name
	 * <p>
	 * <b>Platforms:</b> iphone ipad android, <b>Since:</b> 0.8
	 * @param name (string) The name to match in the database
	 * @return array
	 */
	 public static native JavaScriptObject getPeopleWithName(String name) /*-{
		return Titanium.Contacts.getPeopleWithName(name);
	}-*/;

	/**
	 * <b>getPersonByID</b>
	 * <p>
	 * Returns a Titanium.Contacts.Person object with the given ID
	 * <p>
	 * <b>Platforms:</b> iphone ipad android, <b>Since:</b> 0.8
	 * @param id (int) The database ID of the person to retrieve
	 * @return object
	 */
	 public static native JavaScriptObject getPersonByID(int id) /*-{
		return Titanium.Contacts.getPersonByID(id);
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> iphone ipad android, <b>Since:</b> 0.8
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public static native void removeEventListener(String name, JavaScriptObject callback) /*-{
		Titanium.Contacts.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>removeGroup</b>
	 * <p>
	 * Removes a group from the contacts database (NOTE: not supported on Android.)
	 * <p>
	 * <b>Platforms:</b> iphone ipad android, <b>Since:</b> 0.8
	 * @param group (object) The Titanium.Contacts.Group object to remove from the database. (NOTE: not supported on Android.)
	 * @return void
	 */
	 public static native void removeGroup(JavaScriptObject group) /*-{
		Titanium.Contacts.removeGroup(group);
	}-*/;

	/**
	 * <b>removePerson</b>
	 * <p>
	 * Removes a person from the contacts database. (NOTE: not supported on Android.)
	 * <p>
	 * <b>Platforms:</b> iphone ipad android, <b>Since:</b> 0.8
	 * @param person (object) The Titanium.Contacts.Person object to remove from the database. (NOTE: not supported on Android.)
	 * @return void
	 */
	 public static native void removePerson(JavaScriptObject person) /*-{
		Titanium.Contacts.removePerson(person);
	}-*/;

	/**
	 * <b>revert</b>
	 * <p>
	 * Reverts all changes made to the previous save of the database (NOTE: not supported on Android.)
	 * <p>
	 * <b>Platforms:</b> iphone ipad android, <b>Since:</b> 0.8
	 * @return void
	 */
	 public static native void revert() /*-{
		Titanium.Contacts.revert();
	}-*/;

	/**
	 * <b>save</b>
	 * <p>
	 * Saves all changes to contacts to the database (NOTE: not supported on Android.)
	 * <p>
	 * <b>Platforms:</b> iphone ipad android, <b>Since:</b> 0.8
	 * @return void
	 */
	 public static native void save() /*-{
		Titanium.Contacts.save();
	}-*/;

	/**
	 * <b>showContacts</b>
	 * <p>
	 * Displays the contact picker
	 * <p>
	 * <b>Platforms:</b> iphone ipad android, <b>Since:</b> 0.8
	 * @param cancel (function) The function to call when selection is cancelled
	 * @param selectedPerson (function) The function to call when a person is selected.  Mutually exclusive with selectedProperty
	 * @param selectedProperty (function) The function to call when a property is selected.  Mutally exclusive with selectedPerson
	 * @param animated (boolean) Whether or not to animate the show/hide of the contacts picker
	 * @param fields (array) A list of field names to show when selecting properties, default is to show all available
	 * @return void
	 */
	 public static native void showContacts(JavaScriptObject cancel, JavaScriptObject selectedPerson, JavaScriptObject selectedProperty, boolean animated, JavaScriptObject fields) /*-{
		Titanium.Contacts.showContacts(cancel, selectedPerson, selectedProperty, animated, fields);
	}-*/;
}
