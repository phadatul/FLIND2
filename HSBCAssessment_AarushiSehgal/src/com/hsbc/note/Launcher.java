package com.hsbc.note;

import java.util.ArrayList;

public class Launcher {
	
	// function for clearly displaying the notes containing only Text 
	public void displayTextNotes(NoteStore o) {
		
		ArrayList<TextNote> printingList = new ArrayList<TextNote>();
		
		printingList = o.getAllTextNotes();
		int count = 1;
		for(TextNote t : printingList) {
			System.out.println("Text Note " + count + ": " +  t.getTxt());
			count ++;
		}
		//System.out.println(o.getAllTextNotes());
	}
	
	// function for clearly displaying the notes containing both Text and Image Url
	public void displayTextAndImageNotes(NoteStore o1) {
		
		ArrayList<TextAndImageNote> printingList = new ArrayList<TextAndImageNote>();
		
		printingList = o1.getAllTextAndImageNotes();
		int count = 1;
		for(TextAndImageNote t : printingList) {
			System.out.println("Text And Image Note " + count + ": " +  t.getTxt());
			count ++;
		}
		
		//System.out.println(o1.getAllTextAndImageNotes());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//adding two records each of text only notes and text & image url notes
		NoteStore n = new NoteStore();
		n.storeNote("Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems");
		n.storeNote("Few books to read - Ikigai, How to win friends and influence people");
		n.storeNote("The shopping list on my fridge", "//foo/bar1/bar2/imgset1.jpg");
		n.storeNote("The size label of Jack's shirt", "//foo/bar1/bar2/imgset2.jpg");
		
		
		// displaying the final notes respectively
		Launcher l = new Launcher();
		l.displayTextNotes(n);
		l.displayTextAndImageNotes(n);
		
	}
	
	
	
	
	

}
