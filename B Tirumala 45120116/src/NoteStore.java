import java.util.ArrayList;

public class NoteStore {
	ArrayList<TextNote> TextNoteList = new ArrayList<TextNote>();
	ArrayList<TextAndImageNote> TextAndImageNoteList = new ArrayList<TextAndImageNote>();

//StoreNote method is overloaded to create notes depending on the number of input parameters	
	public void storeNote(String text) {
		TextNote note = new TextNote();
		note.setText(text);
		this.TextNoteList.add(note);
	}

	public void storeNote(String text, String imageURL) {
		TextAndImageNote note = new TextAndImageNote();
		note.setText(text);
		note.setImageURL(imageURL);
		this.TextAndImageNoteList.add(note);
	}

	public ArrayList<TextNote> getAllTextNotes() {
		return TextNoteList;
	}

	public ArrayList<TextAndImageNote> getAllTextAndImageNotes() {
		return TextAndImageNoteList;
	}
}
