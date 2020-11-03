package com.example.exam;

/**
 * TextNote contains a few lines of Text
 *
 */
public class TextNote extends Note {
	private String text;

	public TextNote() {
		super();
	}

	public TextNote(String text) {
		this();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return text;
	}
}
