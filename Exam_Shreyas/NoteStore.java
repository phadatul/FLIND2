package com.hsbc.exam;

import java.util.ArrayList;

public class NoteStore {
	ArrayList<TextNote> listOfTextNote ;
	ArrayList<TextAndImageNote> listOfTextAndImageNote ;

	/**This is the default constructor. This initializes the two Lists which contains the list of text notes and list of image and text notes.
	 * 
	 */
	public NoteStore() {
		listOfTextNote = new ArrayList<TextNote>();
		listOfTextAndImageNote = new ArrayList<TextAndImageNote>();
	}
	
	/*This method adds textnote to the Arraylist listOfTextNote
	 * 
	 * */
	public void storeNote(TextNote _textnote) {
		listOfTextNote.add(_textnote);
	}
	
	/*This method adds textandimagenote to the Arraylist listOfTextAndImageNote
	 * 
	 * */
	public void storeNote(TextAndImageNote _textandimagenote) {
		listOfTextAndImageNote.add(_textandimagenote);
	}
	
	/*This method returns the Arraylist listOfTextNode
	 * 
	 * */
	public ArrayList<TextNote> getAllTextNotes() {
		return listOfTextNote;
	}
	
	/*This method returns the Arraylist listOfTextAndImageNote
	 * 
	 * */
	public ArrayList<TextAndImageNote> getAllTextAndImageNotes() {
		return listOfTextAndImageNote;
	}	
}
