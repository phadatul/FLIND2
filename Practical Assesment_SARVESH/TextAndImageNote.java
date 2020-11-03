
public class TextAndImageNote extends TextNote {
	private String url;

	public TextAndImageNote(String text, String url) {
		super(text);
		this.url = url;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.getText() + ", " + this.url;
	}
}
