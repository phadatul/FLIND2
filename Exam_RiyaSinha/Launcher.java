package Exam_RiyaSinha;

import java.util.List;

public class Launcher {
	
	public static void displayTextNotes(NoteStore notestore) {
		
		List<TextNote> list = notestore.getAllTextNotes();
		
		for( int i = 0; i<list.size();i++) {
			int noteNumber = i+1;
			System.out.println("Text Note" +noteNumber+": "+ list.get(i).toString());
		}
		
		
	}
	
	public static void displayTextAndImageNotes(NoteStore notestore) {
		List<TextAndImageNote> list = notestore.getAllTextAndImageNotes();
		for( int i = 0; i<list.size();i++) {
			int noteNumber = i+1;
			System.out.println("Text and Image Note" +noteNumber+": "+ list.get(i).toString());
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		NoteStore notestore = new NoteStore();
		
		notestore.storeNote("Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems");
		notestore.storeNote("Few books to read - Ikigai, How to win friends and influence people");
		
		displayTextNotes(notestore);
		
		notestore.storeNote("The shopping list on my fridge", "//foo/bar1/bar2/imgset1.jpg");
		notestore.storeNote("The size label of Jack's shirt", "//foo/bar1/bar2/imgset2.jpg");
		
		displayTextAndImageNotes(notestore);
		
	}

}
