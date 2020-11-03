package com.example.exam;

import java.util.List;

/**
 * The users will access the NoteStore using Launcher. The
 * Launcher will also enable the users to view the notes stored
 *
 */
public class Launcher {
	private static NoteStore noteStore;
	
	static {
		noteStore = NoteStore.getInstance();
	}
	
	/**
	 * Prints all the TextNotes stored in the NoteStore in a
	 * user friendly readable format onto the console.
	 */
	public static void displayTextNotes() {
		List<TextNote> textNotes = noteStore.getAllTextNotes();
		for (int i = 0; i < textNotes.size(); ++i) {
			System.out.print("Text Note ");
			System.out.print(i + 1);
			System.out.print(": ");
			System.out.println(textNotes.get(i));
		}
	}
	
	/**
	 * Prints all the TextAndImageNotes stored in the NoteStore
	 * in a user friendly readable format onto the console.
	 */
	public static void displayTextAndImageNotes() {
		List<TextAndImageNote> textAndImageNotes = noteStore.getAllTextAndImageNotes();
		for (int i = 0; i < textAndImageNotes.size(); ++i) {
			System.out.print("Text and Image Note ");
			System.out.print(i + 1);
			System.out.print(": ");
			System.out.println(textAndImageNotes.get(i));
		}
	}
	
	public static void main(String[] args) {		
		noteStore.storeNote(new TextNote(
				"Java is a set of computer software and specifications"
				+ "developed by James Gosling at Sun Microsystems"));
		noteStore.storeNote(new TextNote(
				"Few books to read - Ikigai, How to win friends and"
				+ "influence people"));
		
		noteStore.storeNote(new TextAndImageNote(
				"The shopping list on my fridge",
				"//foo/bar1/bar2/imgset1.jpg"));
		noteStore.storeNote(new TextAndImageNote(
				"The size label of Jack's shirt",
				"//foo/bar1/bar2/imgset2.jpg"));
		
		displayTextNotes();
		displayTextAndImageNotes();
	}
}
