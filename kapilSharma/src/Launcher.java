
import java.util.ArrayList;

public class Launcher {
	public static final NotesStore notesstore = new NotesStore();
	public static void main(String[] args) {
		
		TextNote textNote = new TextNote("Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems");
		TextNote textNote1 = new TextNote("Few books to read - Ikigai, How to win friends and influence people");
		notesstore.storeNote(textNote);
		notesstore.storeNote(textNote1);
		TextNote textAndImageNote = new TextAndImageNote("The shopping list on my fridge","//foo/bar1/bar2/imgset1.jpg");
		TextNote textAndImageNote1 = new TextAndImageNote("The size label of Jack's shirt","//foo/bar1/bar2/imgset2.jpg");
		notesstore.storeNote(textAndImageNote);
		notesstore.storeNote(textAndImageNote1);
		displayTextNotes();
		displayTextAndImageNotes();
		
	}
	public static void displayTextNotes() {
		ArrayList<TextNote> printingList = new ArrayList<TextNote>();
		
		printingList = notesstore.getAllTextNotes();
		int count = 1;
		for(TextNote t : printingList) {
			System.out.println("Text Note " + count + ": " +  t.getMessage());
			count ++;
		}
		
		
	}
	public static void displayTextAndImageNotes() {
		ArrayList<TextAndImageNote> printingList = new ArrayList<TextAndImageNote>();
		
		printingList = notesstore.getAllTextAndImageNotes();
		int count = 1;
		for(TextAndImageNote t : printingList) {
			System.out.println("Text and Image Note " + count + ": " + t.getMessage() + ", " + t.getUrl());
		}
		
		
	}
}
