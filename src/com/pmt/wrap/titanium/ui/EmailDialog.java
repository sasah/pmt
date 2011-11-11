package com.pmt.wrap.titanium.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.EmailDialog</b>
 * <p>
 * The Email Dialog is created by Titanium.UI.createEmailDialog and allows you to send in application emails on behalf of the application user.
 * <p>
 * <b>Platforms:</b> android iphone ipad 
 * <p>
 * <b>Since:</b> 0.8
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> proxy
 * <p>
 * <b>Returns:</b> null
 */
public class EmailDialog {

	private JavaScriptObject handler;

	public EmailDialog(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>CANCELLED</b> (int) static
	 * <p>
	 * constant for the CANCELLED status result
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int CANCELLED() /*-{
		return Titanium.UI.EmailDialog.CANCELLED;
	}-*/;

	/**
	 * <b>FAILED</b> (int) static
	 * <p>
	 * constant for the FAILED status result
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int FAILED() /*-{
		return Titanium.UI.EmailDialog.FAILED;
	}-*/;

	/**
	 * <b>SAVED</b> (int) static
	 * <p>
	 * constant for the SAVED status result
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int SAVED() /*-{
		return Titanium.UI.EmailDialog.SAVED;
	}-*/;

	/**
	 * <b>SENT</b> (int) static
	 * <p>
	 * constant for the SENT status result
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public static native int SENT() /*-{
		return Titanium.UI.EmailDialog.SENT;
	}-*/;

	/**
	 * <b>barColor</b> (string)
	 * <p>
	 * the bar color of the email dialog window when opened
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getBarColor() /*-{
		return this.@com.pmt.wrap.titanium.ui.EmailDialog::handler.barColor;
	}-*/;

	/**
	 * <b>barColor</b> (string)
	 * <p>
	 * the bar color of the email dialog window when opened
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBarColor(String barColor) /*-{
		this.@com.pmt.wrap.titanium.ui.EmailDialog::handler.barColor = barColor;
	}-*/;

	/**
	 * <b>bccRecipients</b> (array)
	 * <p>
	 * array of email BCC: recipients
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getBccRecipients() /*-{
		return this.@com.pmt.wrap.titanium.ui.EmailDialog::handler.bccRecipients;
	}-*/;

	/**
	 * <b>bccRecipients</b> (array)
	 * <p>
	 * array of email BCC: recipients
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setBccRecipients(JavaScriptObject bccRecipients) /*-{
		this.@com.pmt.wrap.titanium.ui.EmailDialog::handler.bccRecipients = bccRecipients;
	}-*/;

	/**
	 * <b>ccRecipients</b> (array)
	 * <p>
	 * array of email CC: recipients
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getCcRecipients() /*-{
		return this.@com.pmt.wrap.titanium.ui.EmailDialog::handler.ccRecipients;
	}-*/;

	/**
	 * <b>ccRecipients</b> (array)
	 * <p>
	 * array of email CC: recipients
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setCcRecipients(JavaScriptObject ccRecipients) /*-{
		this.@com.pmt.wrap.titanium.ui.EmailDialog::handler.ccRecipients = ccRecipients;
	}-*/;

	/**
	 * <b>html</b> (boolean)
	 * <p>
	 * boolean to indicate whether the email messageBody should be sent as HTML content type. defaults to false. (Android note: you should not use html messages in 1.6: after that is okay.)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native boolean getHtml() /*-{
		return this.@com.pmt.wrap.titanium.ui.EmailDialog::handler.html;
	}-*/;

	/**
	 * <b>html</b> (boolean)
	 * <p>
	 * boolean to indicate whether the email messageBody should be sent as HTML content type. defaults to false. (Android note: you should not use html messages in 1.6: after that is okay.)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setHtml(boolean html) /*-{
		this.@com.pmt.wrap.titanium.ui.EmailDialog::handler.html = html;
	}-*/;

	/**
	 * <b>messageBody</b> (string)
	 * <p>
	 * the email message body
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getMessageBody() /*-{
		return this.@com.pmt.wrap.titanium.ui.EmailDialog::handler.messageBody;
	}-*/;

	/**
	 * <b>messageBody</b> (string)
	 * <p>
	 * the email message body
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setMessageBody(String messageBody) /*-{
		this.@com.pmt.wrap.titanium.ui.EmailDialog::handler.messageBody = messageBody;
	}-*/;

	/**
	 * <b>subject</b> (string)
	 * <p>
	 * the subject line for the email
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getSubject() /*-{
		return this.@com.pmt.wrap.titanium.ui.EmailDialog::handler.subject;
	}-*/;

	/**
	 * <b>subject</b> (string)
	 * <p>
	 * the subject line for the email
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setSubject(String subject) /*-{
		this.@com.pmt.wrap.titanium.ui.EmailDialog::handler.subject = subject;
	}-*/;

	/**
	 * <b>toRecipients</b> (array)
	 * <p>
	 * array of email recipients
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getToRecipients() /*-{
		return this.@com.pmt.wrap.titanium.ui.EmailDialog::handler.toRecipients;
	}-*/;

	/**
	 * <b>toRecipients</b> (array)
	 * <p>
	 * array of email recipients
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setToRecipients(JavaScriptObject toRecipients) /*-{
		this.@com.pmt.wrap.titanium.ui.EmailDialog::handler.toRecipients = toRecipients;
	}-*/;

	/**
	 * <b>addAttachment</b>
	 * <p>
	 * add an attachment to the email. the attachment can either be a Blob or File object. (Note: Android will only accept one attachment at this time.)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param attachment (object) attachment object as either a Blob or File object
	 * @return void
	 */
	 public native void addAttachment(JavaScriptObject attachment) /*-{
		return this.@com.pmt.wrap.titanium.ui.EmailDialog::handler.addAttachment(attachment);
	}-*/;

	/**
	 * <b>addEventListener</b>
	 * <p>
	 * add an event listener for the instance to receive view triggered events
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param name (string) name of the event
	 * @param callback (function) callback function to invoke when the event is fired
	 * @return void
	 */
	 public native void addEventListener(String name, JavaScriptObject callback) /*-{
		return this.@com.pmt.wrap.titanium.ui.EmailDialog::handler.addEventListener(name, callback);
	}-*/;

	/**
	 * <b>fireEvent</b>
	 * <p>
	 * fire a synthesized event to the views listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param name (string) name of the event
	 * @param event (object) event object
	 * @return void
	 */
	 public native void fireEvent(String name, JavaScriptObject event) /*-{
		return this.@com.pmt.wrap.titanium.ui.EmailDialog::handler.fireEvent(name, event);
	}-*/;

	/**
	 * <b>isSupported</b>
	 * <p>
	 * return whether or not sending email is supported
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @return void
	 */
	 public native void isSupported() /*-{
		return this.@com.pmt.wrap.titanium.ui.EmailDialog::handler.isSupported();
	}-*/;

	/**
	 * <b>open</b>
	 * <p>
	 * open the email dialog. the email dialog itself is a modal window
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param properties (object) object of animation properties. pass <tt>animated</tt> property (as boolean) to indicate if the dialog should be animated on open.
	 * @return void
	 */
	 public native void open(JavaScriptObject properties) /*-{
		return this.@com.pmt.wrap.titanium.ui.EmailDialog::handler.open(properties);
	}-*/;

	/**
	 * <b>removeEventListener</b>
	 * <p>
	 * remove a previously added event listener
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @param name (string) name of the event
	 * @param callback (function) callback function passed in addEventListener
	 * @return void
	 */
	 public native void removeEventListener(String name, JavaScriptObject callback) /*-{
		return this.@com.pmt.wrap.titanium.ui.EmailDialog::handler.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>complete</b>
	 * <p>
	 * fired when the email dialog has completed sending the email
	 */
	public interface CompleteHandler {
		/**
		 * <b>complete</b>
		 * <p>
		 * fired when the email dialog has completed sending the email
		 * @param result result status either as SENT, SAVED, CANCELLED or FAILED. (Note: Android result will be SENT even if user discards or saves the message.  SAVED and CANCELLED are not supported on Android.)
		 * @param source the source object that fired the event
		 * @param error string message of the error or null if successfully sent
		 * @param type the name of the event fired
		 * @param success boolean to indicate if the email was successfully sent
		 */
		void complete(JavaScriptObject result, JavaScriptObject source, JavaScriptObject error, JavaScriptObject type, JavaScriptObject success);
	}

	/**
	 * <b>complete</b>
	 * <p>
	 * fired when the email dialog has completed sending the email
	 * @param complete event handler
	 */
	public native void addComplete(CompleteHandler complete) /*-{
		this.@com.pmt.wrap.titanium.ui.EmailDialog::handler.addEventListener('complete', function(result, source, error, type, success) {
			complete.@com.pmt.wrap.titanium.ui.EmailDialog.CompleteHandler::complete(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(result, source, error, type, success);
		});
	}-*/;
}
