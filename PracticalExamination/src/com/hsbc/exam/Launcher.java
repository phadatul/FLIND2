package com.hsbc.exam;

import java.util.ArrayList;

public class Launcher {
	
	
	public static void displayTextNotes(NoteStore notestore)
	{
		ArrayList<TextNote>textNoteList= new ArrayList<>();
		textNoteList=notestore.getAllTextNotes();
		int i=1;
		for(TextNote textnote:textNoteList)
		{
			System.out.println("Text Note "+ i++ + ": " +textnote.getText());
		}
	}
	
	public static void displayTextAndImageNotes(NoteStore notestore)
	{
		ArrayList<TextAndImageNote>textAndImageNoteList= new ArrayList<>();
		textAndImageNoteList=notestore.getAllTextAndImageNotes();
		int i=1;
		for(TextAndImageNote textandimagenote:textAndImageNoteList)
		{
			System.out.println("Text and Image Note "+i++ +": " + textandimagenote.getText() + ", "+ textandimagenote.getUrl());
		}
	}

	public static void main(String[] args) {
		
		
	
		NoteStore notestore=new NoteStore();
		
		notestore.storeNote("The shopping list on my fridge", "//foo/bar1/bar2/imgset1.jpg");
		notestore.storeNote("The size label of Jack's shirt", "//foo/bar1/bar2/imgset2.jpg");
		notestore.storeNote("Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems");
		notestore.storeNote("Few books to read - Ikigai, How to win friends and influence people");
		
		
		displayTextNotes(notestore);
		System.out.println("\n");
		displayTextAndImageNotes(notestore);

	}

}