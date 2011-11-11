package com.pmt.wrap.titanium.contacts;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Contacts.Person</b>
 * <p>
 * An object which represents a person in the contacts database.
 * <p>
 * <b>Platforms:</b> iphone ipad 
 * <p>
 * <b>Since:</b> 0.8
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class Person {

	private JavaScriptObject handler;

	public Person(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>URL</b> (object) static
	 * <p>
	 * URLs of webpages associated with the person.  Multi-value, valid labels are: home, work, other, homepage.  Values are strings.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public static native JavaScriptObject URL() /*-{
		return Titanium.Contacts.Person.URL;
	}-*/;

	/**
	 * <b>address</b> (object)
	 * <p>
	 * The addresses for the person.  Multi-value, valid labels are: home, work, other.  Values are dictionaries.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getAddress() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Person::handler.address;
	}-*/;

	/**
	 * <b>address</b> (object)
	 * <p>
	 * The addresses for the person.  Multi-value, valid labels are: home, work, other.  Values are dictionaries.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setAddress(JavaScriptObject address) /*-{
		this.@com.pmt.wrap.titanium.contacts.Person::handler.address = address;
	}-*/;

	/**
	 * <b>birthday</b> (string)
	 * <p>
	 * The birthday of the person.  Single value, format is "yyyy-MM-dd'T'HH:mm:ss'.'SSS+0000"
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBirthday() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Person::handler.birthday;
	}-*/;

	/**
	 * <b>birthday</b> (string)
	 * <p>
	 * The birthday of the person.  Single value, format is "yyyy-MM-dd'T'HH:mm:ss'.'SSS+0000"
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBirthday(String birthday) /*-{
		this.@com.pmt.wrap.titanium.contacts.Person::handler.birthday = birthday;
	}-*/;

	/**
	 * <b>created</b> (string)
	 * <p>
	 * The date the person was created in the database.  Single value, format is "yyyy-MM-dd'T'HH:mm:ss'.'SSS+0000", read-only
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getCreated() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Person::handler.created;
	}-*/;

	/**
	 * <b>created</b> (string)
	 * <p>
	 * The date the person was created in the database.  Single value, format is "yyyy-MM-dd'T'HH:mm:ss'.'SSS+0000", read-only
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setCreated(String created) /*-{
		this.@com.pmt.wrap.titanium.contacts.Person::handler.created = created;
	}-*/;

	/**
	 * <b>date</b> (object)
	 * <p>
	 * Dates associated with the person.  Multi-value, valid labels are: anniversary.  Values are strings of format "yyyy-MM-dd'T'HH:mm:ss'.'SSS+0000"
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getDate() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Person::handler.date;
	}-*/;

	/**
	 * <b>date</b> (object)
	 * <p>
	 * Dates associated with the person.  Multi-value, valid labels are: anniversary.  Values are strings of format "yyyy-MM-dd'T'HH:mm:ss'.'SSS+0000"
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setDate(JavaScriptObject date) /*-{
		this.@com.pmt.wrap.titanium.contacts.Person::handler.date = date;
	}-*/;

	/**
	 * <b>department</b> (string)
	 * <p>
	 * The department of the person.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getDepartment() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Person::handler.department;
	}-*/;

	/**
	 * <b>department</b> (string)
	 * <p>
	 * The department of the person.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setDepartment(String department) /*-{
		this.@com.pmt.wrap.titanium.contacts.Person::handler.department = department;
	}-*/;

	/**
	 * <b>email</b> (object)
	 * <p>
	 * The email addresses for the person.  Multi-value, valid labels are: home, work, other.  Values are strings.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getEmail() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Person::handler.email;
	}-*/;

	/**
	 * <b>email</b> (object)
	 * <p>
	 * The email addresses for the person.  Multi-value, valid labels are: home, work, other.  Values are strings.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setEmail(JavaScriptObject email) /*-{
		this.@com.pmt.wrap.titanium.contacts.Person::handler.email = email;
	}-*/;

	/**
	 * <b>firstName</b> (string)
	 * <p>
	 * The first name of the person.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getFirstName() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Person::handler.firstName;
	}-*/;

	/**
	 * <b>firstName</b> (string)
	 * <p>
	 * The first name of the person.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setFirstName(String firstName) /*-{
		this.@com.pmt.wrap.titanium.contacts.Person::handler.firstName = firstName;
	}-*/;

	/**
	 * <b>firstPhonetic</b> (string)
	 * <p>
	 * The phonetic first name of the person.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getFirstPhonetic() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Person::handler.firstPhonetic;
	}-*/;

	/**
	 * <b>firstPhonetic</b> (string)
	 * <p>
	 * The phonetic first name of the person.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setFirstPhonetic(String firstPhonetic) /*-{
		this.@com.pmt.wrap.titanium.contacts.Person::handler.firstPhonetic = firstPhonetic;
	}-*/;

	/**
	 * <b>fullName</b> (string)
	 * <p>
	 * The localized full name of the person.  Single value, read-only
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getFullName() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Person::handler.fullName;
	}-*/;

	/**
	 * <b>fullName</b> (string)
	 * <p>
	 * The localized full name of the person.  Single value, read-only
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setFullName(String fullName) /*-{
		this.@com.pmt.wrap.titanium.contacts.Person::handler.fullName = fullName;
	}-*/;

	/**
	 * <b>image</b> (object)
	 * <p>
	 * A blob object representing the image for the person.  Set to null to remove the image.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getImage() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Person::handler.image;
	}-*/;

	/**
	 * <b>image</b> (object)
	 * <p>
	 * A blob object representing the image for the person.  Set to null to remove the image.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setImage(JavaScriptObject image) /*-{
		this.@com.pmt.wrap.titanium.contacts.Person::handler.image = image;
	}-*/;

	/**
	 * <b>instantMessage</b> (object)
	 * <p>
	 * The instant messenger names for the person.  Multi-value, valid labels are: aim, icq, jabber, msn, yahoo.  Values are dictionaries.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getInstantMessage() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Person::handler.instantMessage;
	}-*/;

	/**
	 * <b>instantMessage</b> (object)
	 * <p>
	 * The instant messenger names for the person.  Multi-value, valid labels are: aim, icq, jabber, msn, yahoo.  Values are dictionaries.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setInstantMessage(JavaScriptObject instantMessage) /*-{
		this.@com.pmt.wrap.titanium.contacts.Person::handler.instantMessage = instantMessage;
	}-*/;

	/**
	 * <b>jobTitle</b> (string)
	 * <p>
	 * The job title of the person.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getJobTitle() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Person::handler.jobTitle;
	}-*/;

	/**
	 * <b>jobTitle</b> (string)
	 * <p>
	 * The job title of the person.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setJobTitle(String jobTitle) /*-{
		this.@com.pmt.wrap.titanium.contacts.Person::handler.jobTitle = jobTitle;
	}-*/;

	/**
	 * <b>kind</b> (int)
	 * <p>
	 * The kind of person.  Single value, one of Titanium.Contacts.CONTACTS_KIND_PERSON or Titanium.Contacts.CONTACTS_KIND_ORGANIZATION
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getKind() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Person::handler.kind;
	}-*/;

	/**
	 * <b>kind</b> (int)
	 * <p>
	 * The kind of person.  Single value, one of Titanium.Contacts.CONTACTS_KIND_PERSON or Titanium.Contacts.CONTACTS_KIND_ORGANIZATION
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setKind(int kind) /*-{
		this.@com.pmt.wrap.titanium.contacts.Person::handler.kind = kind;
	}-*/;

	/**
	 * <b>lastName</b> (string)
	 * <p>
	 * The last name of the person.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getLastName() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Person::handler.lastName;
	}-*/;

	/**
	 * <b>lastName</b> (string)
	 * <p>
	 * The last name of the person.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setLastName(String lastName) /*-{
		this.@com.pmt.wrap.titanium.contacts.Person::handler.lastName = lastName;
	}-*/;

	/**
	 * <b>lastPhonetic</b> (string)
	 * <p>
	 * The phonetic last name of the person.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getLastPhonetic() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Person::handler.lastPhonetic;
	}-*/;

	/**
	 * <b>lastPhonetic</b> (string)
	 * <p>
	 * The phonetic last name of the person.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setLastPhonetic(String lastPhonetic) /*-{
		this.@com.pmt.wrap.titanium.contacts.Person::handler.lastPhonetic = lastPhonetic;
	}-*/;

	/**
	 * <b>middleName</b> (string)
	 * <p>
	 * The middle name of the person.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getMiddleName() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Person::handler.middleName;
	}-*/;

	/**
	 * <b>middleName</b> (string)
	 * <p>
	 * The middle name of the person.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setMiddleName(String middleName) /*-{
		this.@com.pmt.wrap.titanium.contacts.Person::handler.middleName = middleName;
	}-*/;

	/**
	 * <b>middlePhonetic</b> (string)
	 * <p>
	 * The phonetic middle name of the person.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getMiddlePhonetic() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Person::handler.middlePhonetic;
	}-*/;

	/**
	 * <b>middlePhonetic</b> (string)
	 * <p>
	 * The phonetic middle name of the person.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setMiddlePhonetic(String middlePhonetic) /*-{
		this.@com.pmt.wrap.titanium.contacts.Person::handler.middlePhonetic = middlePhonetic;
	}-*/;

	/**
	 * <b>modified</b> (string)
	 * <p>
	 * The most recent date the person was modified.  Single value, format is "yyyy-MM-dd'T'HH:mm:ss'.'SSS+0000", read-only
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getModified() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Person::handler.modified;
	}-*/;

	/**
	 * <b>modified</b> (string)
	 * <p>
	 * The most recent date the person was modified.  Single value, format is "yyyy-MM-dd'T'HH:mm:ss'.'SSS+0000", read-only
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setModified(String modified) /*-{
		this.@com.pmt.wrap.titanium.contacts.Person::handler.modified = modified;
	}-*/;

	/**
	 * <b>nickname</b> (string)
	 * <p>
	 * The nickname of the person.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getNickname() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Person::handler.nickname;
	}-*/;

	/**
	 * <b>nickname</b> (string)
	 * <p>
	 * The nickname of the person.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setNickname(String nickname) /*-{
		this.@com.pmt.wrap.titanium.contacts.Person::handler.nickname = nickname;
	}-*/;

	/**
	 * <b>note</b> (string)
	 * <p>
	 * Notes for the person.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getNote() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Person::handler.note;
	}-*/;

	/**
	 * <b>note</b> (string)
	 * <p>
	 * Notes for the person.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setNote(String note) /*-{
		this.@com.pmt.wrap.titanium.contacts.Person::handler.note = note;
	}-*/;

	/**
	 * <b>organization</b> (string)
	 * <p>
	 * The organization the person belongs to.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getOrganization() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Person::handler.organization;
	}-*/;

	/**
	 * <b>organization</b> (string)
	 * <p>
	 * The organization the person belongs to.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setOrganization(String organization) /*-{
		this.@com.pmt.wrap.titanium.contacts.Person::handler.organization = organization;
	}-*/;

	/**
	 * <b>phone</b> (object)
	 * <p>
	 * The phone numbers for the person.  Multi-value, valid labels are: home, work, other, mobile, pager, workFax, homeFax, main, iPhone.  Values are strings.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getPhone() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Person::handler.phone;
	}-*/;

	/**
	 * <b>phone</b> (object)
	 * <p>
	 * The phone numbers for the person.  Multi-value, valid labels are: home, work, other, mobile, pager, workFax, homeFax, main, iPhone.  Values are strings.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setPhone(JavaScriptObject phone) /*-{
		this.@com.pmt.wrap.titanium.contacts.Person::handler.phone = phone;
	}-*/;

	/**
	 * <b>prefix</b> (string)
	 * <p>
	 * The prefix for the person.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getPrefix() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Person::handler.prefix;
	}-*/;

	/**
	 * <b>prefix</b> (string)
	 * <p>
	 * The prefix for the person.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setPrefix(String prefix) /*-{
		this.@com.pmt.wrap.titanium.contacts.Person::handler.prefix = prefix;
	}-*/;

	/**
	 * <b>relatedNames</b> (object)
	 * <p>
	 * The names of people the person is related to.  Multi-value, valid labels are: mother, father, parent, sister, brother, child, friend, spouse, partner, manager, assistant.  Values are strings.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getRelatedNames() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Person::handler.relatedNames;
	}-*/;

	/**
	 * <b>relatedNames</b> (object)
	 * <p>
	 * The names of people the person is related to.  Multi-value, valid labels are: mother, father, parent, sister, brother, child, friend, spouse, partner, manager, assistant.  Values are strings.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setRelatedNames(JavaScriptObject relatedNames) /*-{
		this.@com.pmt.wrap.titanium.contacts.Person::handler.relatedNames = relatedNames;
	}-*/;

	/**
	 * <b>suffix</b> (string)
	 * <p>
	 * The suffix for the person.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getSuffix() /*-{
		return this.@com.pmt.wrap.titanium.contacts.Person::handler.suffix;
	}-*/;

	/**
	 * <b>suffix</b> (string)
	 * <p>
	 * The suffix for the person.  Single value
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setSuffix(String suffix) /*-{
		this.@com.pmt.wrap.titanium.contacts.Person::handler.suffix = suffix;
	}-*/;
}
