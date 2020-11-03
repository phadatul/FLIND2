package exam.sivasaimulka;

import java.util.List;

public interface NoteStoreInterface {
	public void storeNote(String text);

	public void storeNote(String text, String imageUrl);

	public List<TextNote> getAllTextNotes();

	public List<TextAndImageNote> getAllTextAndImageNotes();
}
