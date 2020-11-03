package notes;

/*
 * Class definition of a single textNote
 * Contains attributes: Text which is the content of the note
 */
public class TextNote {
	
	private String text;
	
	public TextNote(String note)
	{
		text=note;
	}
	
	//Gives an output of what would be displayed
	public String getText() {
		return text;
	}
	//Sets the content of the textNote
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "TextNote [text=" + text + "]";
	}
	
}
