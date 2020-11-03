import java.util.ArrayList;

public class storeNote {
	public storeNote() {
		// TODO Auto-generated constructor stub
	}
	
	ArrayList<String> textonly = new ArrayList<String>();
	ArrayList<String> text = new ArrayList<String>();
	ArrayList<String> url = new ArrayList<String>();
	
	public void storeNote(TextNote s1)
	{
		textonly.add(s1.getPtnote());
	}
	
	public void storeNote(TextAndImageNote s2)
	{
		text.add(s2.getText());
		url.add(s2.getUrl());
	}
	
	

	public ArrayList<String> getText() {
		return text;
	}

	public void setText(ArrayList<String> text) {
		this.text = text;
	}

	public void displayTextNotes()
	{
		for(int i=0;i<textonly.size();i++)
		{
			System.out.println("Text Note "+(i+1)+" : "+textonly.get(i));
		}
	}
	
	public void displayTextAndImageNotes()
	{
		for(int i=0;i<text.size();i++)
		{
			System.out.println("Text and Image Note "+(i+1)+" : "+text.get(i)+" , "+url.get(i));
		}
	}

	
	
	
	
	
}
