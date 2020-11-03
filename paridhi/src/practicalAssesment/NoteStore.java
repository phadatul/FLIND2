package practicalAssesment;

import java.util.ArrayList;

public class NoteStore {
	static private ArrayList<TextNote> TextNoteList=new ArrayList<TextNote>();
	static private ArrayList<TextAndImageNote> TextAndImageNoteList=new ArrayList<TextAndImageNote>();
	
	public NoteStore() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static void storeNote(String noteText) { //method overloading
		TextNote note=new TextNote(noteText);
		TextNoteList.add(note);
	}
	
	public static void storeNote(String noteText, String noteUrl) { //method overloading
		TextAndImageNote note=new TextAndImageNote(noteText,noteUrl);
		TextAndImageNoteList.add(note);
	}
	
	
	public static ArrayList<TextNote> getAllTextNotes() {
		return TextNoteList;
	}
	
	public static ArrayList<TextAndImageNote> getAllTextAndImageNotes() {
		return TextAndImageNoteList;
	}	
	
}
