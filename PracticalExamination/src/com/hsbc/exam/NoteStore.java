package com.hsbc.exam;

import java.util.ArrayList;

public class NoteStore {
	ArrayList<TextNote>textNoteList= new ArrayList<>();
	ArrayList<TextAndImageNote>textAndImageNoteList= new ArrayList<>();
	
	public ArrayList<TextNote> getAllTextNotes()
	{
		return textNoteList;
	}
	
	public ArrayList<TextAndImageNote> getAllTextAndImageNotes()
	{
		return textAndImageNoteList;
	}
	
	public void storeNote(String message)
	{
		TextNote textnote=new TextNote(message);
		textNoteList.add(textnote);
	}
	
	public void storeNote(String message, String url)
	{
		TextAndImageNote textAndImageNote=new TextAndImageNote(message,url);
		textAndImageNoteList.add(textAndImageNote);
	}
}