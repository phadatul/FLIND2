package com.hsbc.exam;

import java.util.ArrayList;

public class Launcher {
	
	public static void displayTextNotes(NoteStore ns) {
		ArrayList<TextNote> newtn = ns.getAllTextNotes();
		ArrayList<TextAndImageNote> newtin = ns.getAllTextAndImageNotes();
		
		System.out.println(newtn);
		System.out.println(newtin);

	}

	public static void main(String[] args) {
		String s1 = "Note1";
		String s2 = "Note2";
		String s3 = "Note3";
		String s4 = "Note4";

		String url1 = "URL1";
		String url2 = "URL2";

		TextNote tn1 = new TextNote(s1);
		TextNote tn2 = new TextNote(s2);
		TextAndImageNote tin1 = new TextAndImageNote(s3, url1);
		TextAndImageNote tin2 = new TextAndImageNote(s4, url2);

		NoteStore ns = new NoteStore();
		ns.listOfTextNote.add(tn1);
		ns.listOfTextNote.add(tn2);
		ns.listOfTextAndImageNote.add(tin1);
		ns.listOfTextAndImageNote.add(tin2);
		displayTextNotes(ns);
	}
}
