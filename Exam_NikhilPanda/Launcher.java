package com.hsbc.notes;

import java.util.*;

/**
 * This is the launcher class where the notes are initialized and displayed.
 * This class contains the main method.
 * 
 * @author nikhil
 *
 */
public class Launcher {

	public static void main(String[] args) {
		NoteStore note = new NoteStore();

		note.storeNote(
				"Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems");
		note.storeNote("Few books to read - Ikigai, How to win friends and influence people");
		note.storeNote("The shopping list on my fridge", "//foo/bar1/bar2/imgset1.jpg");
		note.storeNote("The size label of Jack's shirt", "//foo/bar1/bar2/imgset2.jpg");

		Launcher.displayTextNotes(note);
		Launcher.displayTextAndImageNotes(note);

	}

	/**
	 * This method displays all the text notes stored.
	 * 
	 * @param note : This contains the list of text notes to be displayed.
	 */
	public static void displayTextNotes(NoteStore note) {
		List<TextNote> listOfTextNote = note.getAllTextNotes();
		for (int i = 0; i < listOfTextNote.size(); i++) {
			System.out.println("Text Note " + (i + 1) + ": " + listOfTextNote.get(i).getText());
		}
	}

	/**
	 * This method displays all the text and image notes stored.
	 * 
	 * @param note : This contains the list of text and image notes to be displayed.
	 */

	public static void displayTextAndImageNotes(NoteStore note) {
		List<TextAndImageNote> listOfTextAndImageNote = note.getAllTextAndImageNotes();
		for (int i = 0; i < listOfTextAndImageNote.size(); i++) {
			System.out.println("Text and Image Note " + (i + 1) + ": " + listOfTextAndImageNote.get(i).getText() + ", "
					+ listOfTextAndImageNote.get(i).getUrlOfPhoto());
		}
	}
}
