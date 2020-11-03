package com.hsbc.note;

public class TextAndImageNote {

	public String txt = "";
	public String url = "";
	
	public TextAndImageNote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TextAndImageNote(String txt, String url) {
		super();
		this.txt = txt;
		this.url = url;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "TextAndImageNote [txt=" + txt + ", url=" + url + "]";
	}
	
	
}
