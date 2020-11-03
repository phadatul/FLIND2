// Class for only text based notes
public class TextNote {
	private String text;
	public TextNote()
	{}
	public TextNote(String text) {
		super();
		this.text = text;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "TextNote[text=" + text + "]";
	}
	
}
