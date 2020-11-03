package exam.sivasaimulka;

import java.util.ArrayList;
import java.util.List;

public class NoteStore implements NoteStoreInterface {
	private List<TextNote> l1 = new ArrayList<TextNote>();
	private List<TextAndImageNote> l2 = new ArrayList<TextAndImageNote>();

	// Default Constructor
	public NoteStore() {

	}

	@Override
	public void storeNote(String text) {
		l1.add(new TextNote(text));
	}

	@Override
	public void storeNote(String text, String imageUrl) {
		l2.add(new TextAndImageNote(text, imageUrl));
	}

	@Override
	public List<TextNote> getAllTextNotes() {
		return l1;
	}

	@Override
	public List<TextAndImageNote> getAllTextAndImageNotes() {
		return l2;
	}

}
