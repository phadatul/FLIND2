package com.hsbc.notes;

import java.util.List;

/** This is the blueprint of the note store class specifying all the methods used in the note store class.
 * @author nikhil
 *
 */
public interface NoteStoreInterface {

	/**
	 * This method stores the notes of the object of text note.
	 * 
	 * @param text : The text which needs to be stored.
	 */
	public void storeNote(String text);

	/**
	 * This method stores the note and image url of the object of text and image
	 * note.
	 * 
	 * @param text       : The text which needs to be stored.
	 * @param urlOfImage : The url of image which needs to be stored.
	 */
	public void storeNote(String text, String urlOfImage);

	/**
	 * This method returns all the text notes stored.
	 * 
	 * @return
	 */
	public List<TextNote> getAllTextNotes();

	/**
	 * This method returns all the text and image notes stored.
	 * 
	 * @return
	 */
	public List<TextAndImageNote> getAllTextAndImageNotes();

}
