package com.hsbc.exam;

public class TextNote {
	private String text;
	
	/**This is the default constructor. 
	 * 
	 */
	public TextNote() {
		
	}
	
	/**This is the constructor with parameters text. 
	 * 
	 */
	public TextNote(String text) {
		this();
		this.text = text;
	}

	@Override
	public String toString() {
		return "Text Note: " + this.text + "\n";
	}
	
}
