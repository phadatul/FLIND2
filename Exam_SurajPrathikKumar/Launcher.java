package Exam_SurajPrathikKumar;

import java.util.ArrayList;

public class Launcher {

	public Launcher() {
		// TODO Auto-generated constructor stub
	}
	//Display All Text Notes
	public static void displayTextNotes(NoteStore store) {
		ArrayList<TextNote> textNotes = store.getAllTextNotes();
		
		for(TextNote text:textNotes)
			System.out.println(text.toString());
	}
	//Display All Text and Image Notes
	public static void displayTexAndImageNotes(NoteStore store) {
		ArrayList<TextAndImageNote> textAndImage = store.getAllTextAndImageNotes();
		
		for(TextAndImageNote textImage:textAndImage)
			System.out.println(textImage.toString());
		
	}

	public static void main(String[] args) {
		NoteStore store = new NoteStore();
		
		store.storeNote("This is the first Note without image");
		store.storeNote("This is the second Note without image");
		
		store.storeNote("This is the first Note with image","https://pngtree.com/freebackground/c4d-neon-cool-background_1113037.html");
		store.storeNote("This is the second Note with image","https://pngtree.com/freebackground/neon-sense-of-space-light-technology_927375.html");
		
		displayTextNotes(store);
		displayTexAndImageNotes(store);
	}

}
