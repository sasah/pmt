package com.pmt.wrap.titanium.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.AlertDialog</b>
 * <p>
 * The Alert Dialog is created by Titanium.UI.createAlertDialog and allows you to show a modal application dialog.
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
public class AlertDialog {

	private JavaScriptObject handler;

	public AlertDialog(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>buttonNames</b> (array)
	 * <p>
	 * array of button names as strings
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getButtonNames() /*-{
		return this.@com.pmt.wrap.titanium.ui.AlertDialog::handler.buttonNames;
	}-*/;

	/**
	 * <b>buttonNames</b> (array)
	 * <p>
	 * array of button names as strings
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setButtonNames(JavaScriptObject buttonNames) /*-{
		this.@com.pmt.wrap.titanium.ui.AlertDialog::handler.buttonNames = buttonNames;
	}-*/;

	/**
	 * <b>cancel</b> (int)
	 * <p>
	 * an index to indicate which button should be the cancel button
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getCancel() /*-{
		return this.@com.pmt.wrap.titanium.ui.AlertDialog::handler.cancel;
	}-*/;

	/**
	 * <b>cancel</b> (int)
	 * <p>
	 * an index to indicate which button should be the cancel button
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setCancel(int cancel) /*-{
		this.@com.pmt.wrap.titanium.ui.AlertDialog::handler.cancel = cancel;
	}-*/;

	/**
	 * <b>message</b> (string)
	 * <p>
	 * the message of the dialog
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getMessage() /*-{
		return this.@com.pmt.wrap.titanium.ui.AlertDialog::handler.message;
	}-*/;

	/**
	 * <b>message</b> (string)
	 * <p>
	 * the message of the dialog
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setMessage(String message) /*-{
		this.@com.pmt.wrap.titanium.ui.AlertDialog::handler.message = message;
	}-*/;

	/**
	 * <b>messageid</b> (string)
	 * <p>
	 * the key in the locale file to use for the message property
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getMessageid() /*-{
		return this.@com.pmt.wrap.titanium.ui.AlertDialog::handler.messageid;
	}-*/;

	/**
	 * <b>messageid</b> (string)
	 * <p>
	 * the key in the locale file to use for the message property
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setMessageid(String messageid) /*-{
		this.@com.pmt.wrap.titanium.ui.AlertDialog::handler.messageid = messageid;
	}-*/;

	/**
	 * <b>title</b> (string)
	 * <p>
	 * the title of the dialog
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getTitle() /*-{
		return this.@com.pmt.wrap.titanium.ui.AlertDialog::handler.title;
	}-*/;

	/**
	 * <b>title</b> (string)
	 * <p>
	 * the title of the dialog
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setTitle(String title) /*-{
		this.@com.pmt.wrap.titanium.ui.AlertDialog::handler.title = title;
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
		return this.@com.pmt.wrap.titanium.ui.AlertDialog::handler.addEventListener(name, callback);
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
		return this.@com.pmt.wrap.titanium.ui.AlertDialog::handler.fireEvent(name, event);
	}-*/;

	/**
	 * <b>hide</b>
	 * <p>
	 * cause the dialog to become hidden
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @return void
	 */
	 public native void hide() /*-{
		return this.@com.pmt.wrap.titanium.ui.AlertDialog::handler.hide();
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
		return this.@com.pmt.wrap.titanium.ui.AlertDialog::handler.removeEventListener(name, callback);
	}-*/;

	/**
	 * <b>show</b>
	 * <p>
	 * cause the dialog to become visible
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 * @return void
	 */
	 public native void show() /*-{
		return this.@com.pmt.wrap.titanium.ui.AlertDialog::handler.show();
	}-*/;

	/**
	 * <b>click</b>
	 * <p>
	 * fired when a button in the dialog is clicked
	 */
	public interface ClickHandler {
		/**
		 * <b>click</b>
		 * <p>
		 * fired when a button in the dialog is clicked
		 * @param index the button index that was pressed
		 * @param source the source object that fired the event
		 * @param cancel boolean to indicate if the cancel button was pressed
		 * @param type the name of the event fired
		 */
		void click(JavaScriptObject index, JavaScriptObject source, JavaScriptObject cancel, JavaScriptObject type);
	}

	/**
	 * <b>click</b>
	 * <p>
	 * fired when a button in the dialog is clicked
	 * @param click event handler
	 */
	public native void addClick(ClickHandler click) /*-{
		this.@com.pmt.wrap.titanium.ui.AlertDialog::handler.addEventListener('click', function(index, source, cancel, type) {
			click.@com.pmt.wrap.titanium.ui.AlertDialog.ClickHandler::click(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(index, source, cancel, type);
		});
	}-*/;
}
