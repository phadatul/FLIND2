package practicalAssesment;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Launcher {
	
	public static void displayTextNotes() {
		ArrayList<TextNote> NoteList=NoteStore.getAllTextNotes();
		int noteNumber=1;
		for (TextNote t: NoteList) {
			System.out.println("Text Note "+noteNumber+":"+t);
			System.out.println();
			noteNumber++;
		}
		
	}
	
	public static void displayTextAndImageNotes() {
		ArrayList<TextAndImageNote> NoteList=NoteStore.getAllTextAndImageNotes();
		int noteNumber=1;
		for (TextAndImageNote t: NoteList) {
			System.out.println("Text and Image Note "+noteNumber+":"+t);
			System.out.println();
			noteNumber++;
		}
	}
	
	public static void main(String args[]) {
		//adding notes
		NoteStore.storeNote("Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems");
		NoteStore.storeNote("Few books to read - Ikigai, How to win friends and influence people");
		
		NoteStore.storeNote("The shopping list on my fridge", "//foo/bar1/bar2/imgset1.jpg");
		NoteStore.storeNote("The size label of Jack's shirt", "//foo/bar1/bar2/imgset2.jpg");
		
		displayTextNotes();
		displayTextAndImageNotes();
		
	}
}
