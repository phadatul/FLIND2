package com.hsbc.notes;

import java.util.List;

public interface NoteStoreInterface {
	
	public void storeNote(String text);
	public void storeNote(String text, String urlOfImage);
	public List<TextNote> getAllTextNotes();
	public List<TextAndImageNote> getAllTextAndImageNotes();

}
