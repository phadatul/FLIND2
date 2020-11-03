package com.hsbc.note;

import java.util.ArrayList;

public class NoteStore {

	ArrayList a1= new ArrayList();
	ArrayList a2= new ArrayList();
	
	public NoteStore() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	// function for adding user input Text notes to the NoteStore
	public void storeNote(String txt) {
		
		TextNote t1= new TextNote(txt);
		a1.add(t1);
	}
	
	// overloaded function for adding user input Text and Image Url notes to the NoteStore
	public void storeNote(String txt, String url) {
		
		TextAndImageNote t2= new TextAndImageNote(txt, url);
		a2.add(t2);
	}
	
	
	//function for returning the array containing all the Text notes
	public ArrayList getAllTextNotes() {
		
		return a1;
	}
	
	//function for returning the array containing all the Text and Image notes
	public ArrayList getAllTextAndImageNotes() {
		
		return a2;
	}


	
}
