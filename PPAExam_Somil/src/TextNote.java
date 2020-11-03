package com.hsbc;

public class TextNote {

	protected String msg;

	/**
	 * @param msg : message to be stored in note
	 */
	public TextNote(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return this.msg;
	}

	@Override
	public String toString() {
		return this.msg;
	}

}
