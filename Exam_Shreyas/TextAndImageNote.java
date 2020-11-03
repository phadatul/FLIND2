package com.hsbc.exam;

public class TextAndImageNote{
	private String text;
	private String url;
	
	/**This is the default constructor. 
	 * 
	 */
	public TextAndImageNote() {
		
	}
	
	/**This is the constructor with parameters text and url. 
	 * 
	 */
	public TextAndImageNote(String text,String url) {
		this();
		this.text = text;
		this.url = url;
	}

	@Override
	public String toString() {
		return "Text and Image Note: " + this.text + ", " + url;
	}
	
}
