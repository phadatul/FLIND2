package launcher;
import java.util.ArrayList;

import notes.*;
/*
 * Launcher class with various functions to help make a command line tool
 * */
public class Launcher {

	//private ArrayList that contains all the notes of the user
	private static ArrayList NoteStore=new ArrayList<>();

	/*
	 * Function to store the users input in a note, if the user gives two string
	 * inputs we assume he wants to enter a text and image note else a image note
	 */
	public static void storeNote(String...ar)
	{
		if(ar.length==1)
		{
			NoteStore.add(new TextNote(ar[0]));
		}
		else if(ar.length==2)
		{
			NoteStore.add(new TextAndImageNote(ar[0],ar[1]));
		}
	}

	/*
	 * private function that iterates through the notes and supplies all the text only notes
	 * We do this by checking if the object of the array notestore is a text and image object or not
	 */
	private static ArrayList getAllTextNotes()
	{
		ArrayList<TextNote> temp=new ArrayList<>();
		if(NoteStore.size() ==0)
		{
			System.out.println("No notes");
			return temp;
		}
		for(int i=0;i<NoteStore.size();i++)
		{
			if(NoteStore.get(i).getClass()!=TextAndImageNote.class)
				temp.add((TextNote)NoteStore.get(i));
		}
		return temp;
	}
	
	//private function to get all the contents of the list
	private static ArrayList getAllTextAndImageNotes()
	{
		return NoteStore;
	}

	/*
	 * function to display all the text notes , which it obtains from the private method getAllTextNotes()
	 */
	public static void displayTextNotes()
	{
		ArrayList<TextNote> textNotes=getAllTextNotes();
		int counter=1;
		System.out.println(".............");
		for(TextNote i:textNotes)
		{
			System.out.println("Text Note "+(counter++)+": " +i.getText());
		}
		System.out.println(".............");
	}
	/*
	 * function to display all the text notes , which it obtains from the private method getAllTextAndImageNotes()
	 * It has a counter to help identify different notes
	 */
	public static void displayTextAndImageNotes()
	{
		ArrayList<TextNote> textNotes=getAllTextAndImageNotes();
		int TextNoteCounter=1;
		int TextAndImageNoteCounter=1;
		System.out.println(".............");
		for(TextNote note:textNotes)
		{
			if(note.getClass()!=TextAndImageNote.class)
				System.out.println("Text Note "+(TextNoteCounter++)+": " +note.getText());
			else
				System.out.println("Text And Image Note "+(TextAndImageNoteCounter++)+": " +note.getText());
		}
		System.out.println(".............");
	}
	
	
	
	
	public static void main(String[] args)
	{
		storeNote("Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems");
		storeNote("Few books to read - ikigai, How to win friends and influence people");
		storeNote("The shopping list on my fridge","//foo/bar1/bar2/imgset1.jpg");
		storeNote("The size label of Jacks shirt","//foo/bar1/bar2/imgset2.jpg");
		displayTextAndImageNotes();
		displayTextNotes();
		
	}
}
