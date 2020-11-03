import java.util.*;

public class Launcher {

	public static void main(String[] args) {
		TextNote tn1 = new TextNote(
				"Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems");
		TextNote tn2 = new TextNote("few books to read-Ikigai,How to win friends and infulence people");

		TextAndImageNote tin1 = new TextAndImageNote("The shopping list on my fridge", "//foo/bar1/bar2/imgset1.jpg");
		TextAndImageNote tin2 = new TextAndImageNote("The size label of Jack's shirt", "//foo/bar1/bar2/imgset2.jpg");

		NoteStoreImpl.storeNote(tn1);
		NoteStoreImpl.storeNote(tn2);
		NoteStoreImpl.storeNote(tin1);
		NoteStoreImpl.storeNote(tin2);

		displayTextNotes(NoteStoreImpl.getAllTextNotes());
		displayTextAndImageNotes(NoteStoreImpl.getAllTextAndImageNotes());
	}

	public static void displayTextNotes(ArrayList<TextNote> list) {
		int i = 1;
		for (TextNote tn : list) {
			System.out.println("Text Note " + i + ": " + tn.toString());
			i++;
		}
	}

	public static void displayTextAndImageNotes(ArrayList<TextAndImageNote> list) {
		int i = 1;
		for (TextAndImageNote tin : list) {
			System.out.println("Text And Image Note " + i + ": " + tin.toString());
			i++;
		}
	}

}
