package com.hsbc;

import java.util.ArrayList;

/**
 * @author Somil
 */
public class NoteStore {

	ArrayList<TextNote> store = new ArrayList<TextNote>();

	/**
	 * @param note : Note Object to be stored
	 */
	public void storeNote(TextNote note) {
		this.store.add(note);
	}

	/**
	 * @return ArrayList containing notes with with only message
	 */
	public ArrayList<TextNote> getAllTextNotes() {
		ArrayList<TextNote> sublist = new ArrayList<TextNote>();
		for (int i = 0; i < store.size(); i++) {
			if ((store.get(i) instanceof TextNote) && !(store.get(i) instanceof TextAndImageNote))
				sublist.add(store.get(i));
		}
		return sublist;
	}

	/**
	 * @return ArrayList containing notes with message and image url
	 */
	public ArrayList<TextNote> getAllTextAndImageNotes() {
		
		ArrayList<TextNote> sublist = new ArrayList<TextNote>();
		for (int i = 0; i < store.size(); i++) {
			if (store.get(i) instanceof TextAndImageNote)
				sublist.add(store.get(i));
		}
		return sublist;
	}
}
