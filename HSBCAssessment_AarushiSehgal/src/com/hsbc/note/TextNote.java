package com.hsbc.note;

public class TextNote {

	public String txt = "";

	public TextNote(String txt) {
		super();
		this.txt = txt;
	}

	public TextNote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

	@Override
	public String toString() {
		return "TextNote [txt=" + txt + "]";
	}
	
	
}
