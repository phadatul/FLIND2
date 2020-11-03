package Exam_SurajPrathikKumar;

import java.util.ArrayList;

public class NoteStore {
	static ArrayList<TextNote> allTextNotes;
	static ArrayList<TextAndImageNote> allTextAndImageNotes;

	static {
		allTextNotes = new ArrayList<>();
		allTextAndImageNotes = new ArrayList<>();
	}

	public NoteStore() {
		// TODO Auto-generated constructor stub
	}

	public void storeNote(String plainText) {
		TextNote textNote = new TextNote(plainText);
		//Calling the setId to initialize for Text Note
		textNote.setId();
		allTextNotes.add(textNote);
	}

	public void storeNote(String plainText, String imgUrl) {
		TextAndImageNote textImgNote = new TextAndImageNote(plainText, imgUrl);
		//Calling the setId to initialize for Text and Image Note
		textImgNote.setId();
		allTextAndImageNotes.add(textImgNote);
	}

	public ArrayList<TextNote> getAllTextNotes() {
		return allTextNotes;
	}

	public ArrayList<TextAndImageNote> getAllTextAndImageNotes() {
		return allTextAndImageNotes;
	}
}
