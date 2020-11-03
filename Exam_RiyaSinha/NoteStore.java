package Exam_RiyaSinha;

import java.util.ArrayList;

public class NoteStore {
	
	public static ArrayList<TextNote> textnoteDatabase;
	public static ArrayList<TextAndImageNote> textandimagenoteDatabase;
	
	static {
		textnoteDatabase = new ArrayList<TextNote>();
		textandimagenoteDatabase = new ArrayList<TextAndImageNote>();
		
	}
	
	public NoteStore() {
		// TODO Auto-generated constructor stub
	}
	
	public  void storeNote(String note) {
		TextNote textnote  = new TextNote(note);
		textnoteDatabase.add(textnote);
	}
	
	public  void storeNote(String note, String url) {
		TextAndImageNote textandimagenote = new TextAndImageNote(note, url);
		textandimagenoteDatabase.add(textandimagenote);
	}
	
	public  ArrayList<TextNote> getAllTextNotes() {
		return textnoteDatabase;
	}
	
	public  ArrayList<TextAndImageNote> getAllTextAndImageNotes() {
		return textandimagenoteDatabase;
	}

}
