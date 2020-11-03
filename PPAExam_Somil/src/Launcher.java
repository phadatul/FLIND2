package com.hsbc;

import java.util.ArrayList;

public class Launcher {

	public static void displayTextNotes(NoteStore store) {
		ArrayList<TextNote> arr = store.getAllTextNotes();
		for (int i = 0; i < arr.size(); i++) {
			System.out.print("Text Note " + (i + 1) + ": ");
			System.out.print(arr.get(i));
			System.out.println("");
		}
	}

	public static void displayTextAndImageNotes(NoteStore store) {
		ArrayList<TextNote> arr = store.getAllTextAndImageNotes();
		for (int i = 0; i < arr.size(); i++) {
			System.out.print("Text and Image Note " + (i + 1) + ": ");
			System.out.print(arr.get(i));
			System.out.println("");
		}
	}

	public static void main(String[] args) {

		NoteStore notify = new NoteStore();
		notify.storeNote(new TextNote(
				"Java is a set of computer Software and specifications developed by james Gosling at Sun Microsystems."));
		notify.storeNote(new TextAndImageNote("The Shopping list on my Fridge", "https://www.testurl1.com/image1.jpg"));
		notify.storeNote(new TextNote("Few Books to Read - Ikigai, How to win Friends annd influence People"));
		notify.storeNote(new TextAndImageNote("The size label of jack's Shirt", "https://www.testurl2.com/image2.jpg"));

		System.out.println("Printing all the Text Notes");
		displayTextNotes(notify);
		System.out.println("Printing all the Text and Image Notes");
		displayTextAndImageNotes(notify);
	}

}
