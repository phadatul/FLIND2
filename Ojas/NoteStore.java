import java.util.ArrayList;

public class NoteStore {
	
	//2 separate arrays for the 2 types of notes
	
	private ArrayList<TextNote> textNoteList = new ArrayList<TextNote> ();
	private ArrayList<TextAndImageNote> textAndImageNoteList = new ArrayList<TextAndImageNote> ();
	
	
	/* The storeNote method is overloaded. It adds the particular note to the resp. list based on the parameters
	 * 
	 */
	public void storeNote(String title, String text) {
		TextNote note = new TextNote(title, text);
		textNoteList.add(note);
	}
	
	public void storeNote(String title, String text, String imageURL) {
		TextAndImageNote note = new TextAndImageNote(title, text, imageURL);
		textAndImageNoteList.add(note);
	}
	
	public ArrayList<TextNote> getAllTextNotes(){
		return textNoteList;
	}
	
	public ArrayList<TextAndImageNote> getAllTextAndImageNotes(){
		return textAndImageNoteList;
	}

	public NoteStore() {
	
	}
	
	

}
