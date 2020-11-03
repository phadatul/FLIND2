package com.example.exam;

import java.util.List;

/**
 * Provides behaviour to enable users to create and store
 * notes. The notes are stored using java.util.ArrayList and
 * can be retrieved later.
 *
 */
public interface NoteStoreBehaviour {
	/**
	 * This method accepts the text and creates an object
	 * of type TextNote and then adds it to the NoteStore.
	 * @param text
	 */
	public void storeNote(String text);
	
	/**
	 * This method accepts the text and imageUrl and creates
	 * an object of type TextAndImageNote and then adds it
	 * to the NoteStore.
	 * @param text
	 * @param imageUrl
	 */
	public void storeNote(String text, String imageUrl);
	
	/**
	 * This method accepts an object of type Note and adds it
	 * to the NoteStore.
	 * @param note
	 */
	public void storeNote(Note note);
	
	/**
	 * This methods retrieves and returns all the notes of
	 * type TextNote from the NoteStore.
	 * @return List of TextNote
	 */
	public List<TextNote> getAllTextNotes();
	
	/**
	 * This methods retrieves and returns all the notes of
	 * type TextAndImageNote from the NoteStore.
	 * @return List of TextAndImageNote
	 */
	public List<TextAndImageNote> getAllTextAndImageNotes();
}
