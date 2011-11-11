package com.pmt.wrap.titanium.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.UI.OptionDialog</b>
 * <p>
 * The Option Dialog is created by Titanium.UI.createOptionDialog and allows you to show a modal dialog of one or more options to the user.
 * <p>
 * <b>Platforms:</b> android iphone ipad 
 * <p>
 * <b>Since:</b> 0.8
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class OptionDialog {

	private JavaScriptObject handler;

	public OptionDialog(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>androidView</b> (object)
	 * <p>
	 * A Titanium.UI.View. Allows for arbitrary contents inside a native dialog. Works for any dialog. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getAndroidView() /*-{
		return this.@com.pmt.wrap.titanium.ui.OptionDialog::handler.androidView;
	}-*/;

	/**
	 * <b>androidView</b> (object)
	 * <p>
	 * A Titanium.UI.View. Allows for arbitrary contents inside a native dialog. Works for any dialog. (Android)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setAndroidView(JavaScriptObject androidView) /*-{
		this.@com.pmt.wrap.titanium.ui.OptionDialog::handler.androidView = androidView;
	}-*/;

	/**
	 * <b>cancel</b> (int)
	 * <p>
	 * an index to indicate which button should be the cancel button. If no button should be the cancel button, use -1. If there is a cancel button, it MUST be the last button for use on iPad.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getCancel() /*-{
		return this.@com.pmt.wrap.titanium.ui.OptionDialog::handler.cancel;
	}-*/;

	/**
	 * <b>cancel</b> (int)
	 * <p>
	 * an index to indicate which button should be the cancel button. If no button should be the cancel button, use -1. If there is a cancel button, it MUST be the last button for use on iPad.
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setCancel(int cancel) /*-{
		this.@com.pmt.wrap.titanium.ui.OptionDialog::handler.cancel = cancel;
	}-*/;

	/**
	 * <b>destructive</b> (int)
	 * <p>
	 * the destructive button (indicated by a visual clue in the UI)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getDestructive() /*-{
		return this.@com.pmt.wrap.titanium.ui.OptionDialog::handler.destructive;
	}-*/;

	/**
	 * <b>destructive</b> (int)
	 * <p>
	 * the destructive button (indicated by a visual clue in the UI)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setDestructive(int destructive) /*-{
		this.@com.pmt.wrap.titanium.ui.OptionDialog::handler.destructive = destructive;
	}-*/;

	/**
	 * <b>options</b> (array)
	 * <p>
	 * array of button names as strings
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native JavaScriptObject getOptions() /*-{
		return this.@com.pmt.wrap.titanium.ui.OptionDialog::handler.options;
	}-*/;

	/**
	 * <b>options</b> (array)
	 * <p>
	 * array of button names as strings
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setOptions(JavaScriptObject options) /*-{
		this.@com.pmt.wrap.titanium.ui.OptionDialog::handler.options = options;
	}-*/;

	/**
	 * <b>selectedIndex</b> (int)
	 * <p>
	 * set an initially selected option. Only valid when options has been specified. (Android only)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native int getSelectedIndex() /*-{
		return this.@com.pmt.wrap.titanium.ui.OptionDialog::handler.selectedIndex;
	}-*/;

	/**
	 * <b>selectedIndex</b> (int)
	 * <p>
	 * set an initially selected option. Only valid when options has been specified. (Android only)
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setSelectedIndex(int selectedIndex) /*-{
		this.@com.pmt.wrap.titanium.ui.OptionDialog::handler.selectedIndex = selectedIndex;
	}-*/;

	/**
	 * <b>title</b> (string)
	 * <p>
	 * the title of the dialog
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getTitle() /*-{
		return this.@com.pmt.wrap.titanium.ui.OptionDialog::handler.title;
	}-*/;

	/**
	 * <b>title</b> (string)
	 * <p>
	 * the title of the dialog
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setTitle(String title) /*-{
		this.@com.pmt.wrap.titanium.ui.OptionDialog::handler.title = title;
	}-*/;

	/**
	 * <b>titleid</b> (string)
	 * <p>
	 * the key in the locale file to use for the title property
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native String getTitleid() /*-{
		return this.@com.pmt.wrap.titanium.ui.OptionDialog::handler.titleid;
	}-*/;

	/**
	 * <b>titleid</b> (string)
	 * <p>
	 * the key in the locale file to use for the title property
	 * <p>
	 * <b>Platforms:</b> android iphone ipad, <b>Since:</b> 0.8
	 */
	public native void setTitleid(String titleid) /*-{
		this.@com.pmt.wrap.titanium.ui.OptionDialog::handler.titleid = titleid;
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
		return this.@com.pmt.wrap.titanium.ui.OptionDialog::handler.show();
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
		 * @param button boolean to indicate that the index refers to a button on the dialog and not an item. (Android)
		 * @param destructive the index of the destructive button
		 * @param cancel the index of the cancel button
		 * @param type the name of the event fired
		 */
		void click(JavaScriptObject index, JavaScriptObject source, JavaScriptObject button, JavaScriptObject destructive, JavaScriptObject cancel, JavaScriptObject type);
	}

	/**
	 * <b>click</b>
	 * <p>
	 * fired when a button in the dialog is clicked
	 * @param click event handler
	 */
	public native void addClick(ClickHandler click) /*-{
		this.@com.pmt.wrap.titanium.ui.OptionDialog::handler.addEventListener('click', function(index, source, button, destructive, cancel, type) {
			click.@com.pmt.wrap.titanium.ui.OptionDialog.ClickHandler::click(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(index, source, button, destructive, cancel, type);
		});
	}-*/;
}
