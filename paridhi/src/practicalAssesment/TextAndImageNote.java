package practicalAssesment;

public class TextAndImageNote {
	private String text;
	private String url;
	
	public TextAndImageNote() {
		super();
	}

	public TextAndImageNote(String text, String url) {
		super();
		this.text = text;
		this.url = url;
	}

	@Override
	public String toString() {
		return this.text+", "+this.url;
	}
	
	
	
}
