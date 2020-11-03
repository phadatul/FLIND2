package test;

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
	 * @param text : String of Message to be stored .
	 */
	public TextNote(String text) {
		super();
		this.text = text;
	}

	/**
	 * This returns the text of a specific note.
	 * 
	 * @return : Returns String of the specified note.
	 */
	public String getText() {
		return this.text;
	}

	/**
	 * Sets the text in the note.
	 * 
	 * @param text : Text String to be assigned to the specific note.
	 */

	public void setText(String text) {
		this.text = text;
	}

}