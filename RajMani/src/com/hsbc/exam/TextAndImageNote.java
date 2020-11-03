package com.hsbc.exam;

public class TextAndImageNote {
	private String url;
	private String text;
	public TextAndImageNote(String text, String url) {
		super();
		this.url = url;
		this.text = text;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}
	