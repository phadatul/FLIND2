//Class to store and access different types of notes 
import java.util.ArrayList;

public class NoteStore {
	ArrayList<TextNote> textNote=new ArrayList<TextNote>();
	ArrayList<TextAndImageNote> textAndImageNote=new ArrayList<TextAndImageNote>();
	public NoteStore()
	{}
	public void storeNote(String name)
	{
		TextNote t=new TextNote(name);
		this.textNote.add(t);
	}
	public void storeNote(String name,String url)
	{
		TextAndImageNote t= new TextAndImageNote(name,url);
		this.textAndImageNote.add(t);
	}
	public ArrayList<TextNote> getAllTextNotes()
	{
		return this.textNote;
	}
	public ArrayList<TextAndImageNote> getAllTextAndImageNotes()
	{
		return this.textAndImageNote;
	}
	
}
