package com.hsbc.notes;

/**
 * This class contains the parameters of the text and image notes. Also assigns
 * the text and url of the image to the objects.
 * 
 * @author nikhil
 *
 */
public class TextAndImageNote {

	private String text;
	private String urlOfPhoto;

	/**
	 * This is the default constructor.
	 * 
	 */
	public TextAndImageNote() {
		super();
	}

	/**
	 * This is the parameterized constructor. This takes in text and the url of the
	 * photo to be stored as inputs.
	 * 
	 * @param text       : The text which needs to be stored.
	 * @param urlOfPhoto : The url of the photo which needs to be stored.
	 */
	public TextAndImageNote(String text, String urlOfPhoto) {
		super();
		this.text = text;
		this.urlOfPhoto = urlOfPhoto;
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

	/**
	 * This returns the url of the photo of a specific note.
	 * 
	 * @return : This returns a string containing the url of the photo of the
	 *         specified note.
	 */
	public String getUrlOfPhoto() {
		return this.urlOfPhoto;
	}

	/**
	 * This method sets the given url of the photo into the note.
	 * 
	 * @param text : The url of the photo which needs to be assigned to the specific
	 *             note.
	 */

	public void setUrlOfPhoto(String urlOfPhoto) {
		this.urlOfPhoto = urlOfPhoto;
	}

}
