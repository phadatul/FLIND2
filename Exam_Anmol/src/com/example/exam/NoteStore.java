package com.example.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NoteStore implements NoteStoreBehaviour {
	private List<Note> notes;
	private static NoteStore instance;
	
	private NoteStore() {
		super();
		notes = new ArrayList<>();
	}
	
	public static NoteStore getInstance() {
		if (instance == null) {
			instance = new NoteStore();
		}
		
		return instance;
	}
	
	@Override
	public void storeNote(String text) {
		storeNote(new TextNote(text));
	}
	
	@Override
	public void storeNote(String text, String imageUrl) {
		storeNote(new TextAndImageNote(text, imageUrl));
	}
	
	@Override
	public void storeNote(Note note) {
		notes.add(note);
	}

	@Override
	public List<TextNote> getAllTextNotes() {
		List<TextNote> textNotes = new ArrayList<>();
		for (Note note : notes) {
			if (note instanceof TextNote) {
				TextNote textNote = (TextNote) note;
				textNotes.add(textNote);
			}
		}
		
		return Collections.unmodifiableList(textNotes);
	}

	@Override
	public List<TextAndImageNote> getAllTextAndImageNotes() {
		List<TextAndImageNote> textAndImageNotes = new ArrayList<>();
		for (Note note : notes) {
			if (note instanceof TextAndImageNote) {
				TextAndImageNote textAndImageNote = (TextAndImageNote) note;
				textAndImageNotes.add(textAndImageNote);
			}
		}
		
		return Collections.unmodifiableList(textAndImageNotes);
	}
}
