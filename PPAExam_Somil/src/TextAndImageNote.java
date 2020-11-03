package com.hsbc;

public class TextAndImageNote extends TextNote {

	private String url;

	/**
	 * @param msg : message to be stored in note
	 * @param url : url of image to be stored
	 */
	public TextAndImageNote(String msg, String url) {
		super(msg);
		this.url = url;
	}

	public String getText() {
		return this.msg;
	}

	public String getUrl() {
		return this.url;
	}

	@Override
	public String toString() {
		return this.msg + ", " + this.url;
	}
}
