package com.hsbc.notes;

/**
 * This class contains the parameters of the text notes. Also assigns the text
 * to the objects.
 * 
 * @author nikhil
 *
 */
public class TextNote {

	private String text;

	/**
	 * This is the default constructor
	 * 
	 */
	public TextNote() {
		super();
	}

	/**
	 * This is the parameterized constructor. This takes in the text to be stored.
	 * 
	 * @param text : This is the text which needs to be stored.
	 */
	public TextNote(String text) {
		super();
		this.text = text;
	}

	/**
	 * This returns the text of a specific note.
	 * 
	 * @return : This returns a string containing the text of the specified note.
	 */
	public String getText() {
		return this.text;
	}

	/**
	 * This method sets the given text into the note.
	 * 
	 * @param text : The text which needs to be assigned to the specific note.
	 */

	public void setText(String text) {
		this.text = text;
	}

}
