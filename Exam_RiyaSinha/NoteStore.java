package Exam_RiyaSinha;

import java.util.ArrayList;

public class NoteStore {
	
	public static ArrayList<TextNote> textnoteDatabase; //arraylist to store text notes
	public static ArrayList<TextAndImageNote> textandimagenoteDatabase; //arraylist to store text and image notes
	
	static {
		textnoteDatabase = new ArrayList<TextNote>();
		textandimagenoteDatabase = new ArrayList<TextAndImageNote>();
		
	}
	
	public NoteStore() {
		// TODO Auto-generated constructor stub
	}
	
	//method to store text notes
	public  void storeNote(String note) {
		TextNote textnote  = new TextNote(note);
		textnoteDatabase.add(textnote);
	}
	
	//method to store text and image notes
	public  void storeNote(String note, String url) {
		TextAndImageNote textandimagenote = new TextAndImageNote(note, url);
		textandimagenoteDatabase.add(textandimagenote);
	}
	
	//method to return text notes database
	public  ArrayList<TextNote> getAllTextNotes() {
		return textnoteDatabase;
	}
	
	//method to return text and image notes database
	public  ArrayList<TextAndImageNote> getAllTextAndImageNotes() {
		return textandimagenoteDatabase;
	}

}
