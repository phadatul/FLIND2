import java.util.ArrayList;

public class Launcher {
//	Method to display text notes
	public static void displayTextNotes(NoteStore store) {
		ArrayList<TextNote> TextNoteList = store.getAllTextNotes();
		for (int i = 0; i < TextNoteList.size(); i++) {
			System.out.println("Text Note " + (i + 1) + ": " + TextNoteList.get(i));
		}
	}

//	Method to display text and image notes
	public static void displayTextAndImageNotes(NoteStore store) {
		ArrayList<TextAndImageNote> TextAndImageNoteList = store.getAllTextAndImageNotes();
		for (int i = 0; i < TextAndImageNoteList.size(); i++) {
			System.out.println("Text and Image Note " + (i + 1) + ": " + TextAndImageNoteList.get(i));
		}
	}

	public static void main(String[] args) {
		NoteStore store = new NoteStore();
		store.storeNote(
				"Java is a set of computer software and specifications developed by James Gosling at Sun microsystems");
		store.storeNote("Few books to read - Ikigai, How to win friends and influence people");
		store.storeNote("The shopping list on my fridge", "//foo/bar1/bar2/imgset.jpg");
		store.storeNote("The size label on jack's short", "//foo/bar1/bar2/imgset2.jpg");
		displayTextNotes(store);
		displayTextAndImageNotes(store);

	}
}
