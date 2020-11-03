package com.example.exam;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.Test;

class NoteStoreTest {

	@Test
	void testNoteStoreWorks() {
		NoteStore noteStore = NoteStore.getInstance();
		
		noteStore.storeNote(new TextNote("Text note"));
		assertEquals(1, noteStore.getAllTextNotes().size());
		
		noteStore.storeNote(new TextAndImageNote("Text and image note", "image-url.jpg"));
		assertEquals(1, noteStore.getAllTextAndImageNotes().size());		
	}
	
	@Test
	void testNoteStoreReturnsImmutableList() {
		NoteStore noteStore = NoteStore.getInstance();
		
		List<TextNote> textNotes = noteStore.getAllTextNotes();
		assertThrows(UnsupportedOperationException.class, () -> textNotes.add(new TextNote("")));
		
		List<TextAndImageNote> textAndImageNotes = noteStore.getAllTextAndImageNotes();
		assertThrows(UnsupportedOperationException.class, () -> textAndImageNotes.add(new TextAndImageNote("", "")));
	}

}
