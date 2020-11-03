
import java.util.*;

public class NoteStoreImpl {

	public static List<TextNote> repo;

	static {
		repo = new ArrayList<TextNote>();
	}

	public static void storeNote(TextNote note) {
		repo.add(note);
	}

	public static void storeNote(TextAndImageNote note) {
		repo.add(note);
	}

	public static ArrayList<TextNote> getAllTextNotes() {
		ArrayList<TextNote> list = new ArrayList<TextNote>();
		for (Object o : repo) {
			if (o.getClass() == TextNote.class) {
				list.add((TextNote) o);
			}
		}
		return list;
	}

	public static ArrayList<TextAndImageNote> getAllTextAndImageNotes() {
		ArrayList<TextAndImageNote> list = new ArrayList<TextAndImageNote>();
		for (Object o : repo) {
			if (o.getClass() == TextAndImageNote.class) {
				list.add((TextAndImageNote) o);
			}
		}
		return list;
	}

}
