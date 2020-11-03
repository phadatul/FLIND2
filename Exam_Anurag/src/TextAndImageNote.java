
public class TextAndImageNote {
	private String text , url ;
	
	public TextAndImageNote() {
		// TODO Auto-generated constructor stub
	}

	public TextAndImageNote(String text, String url) {
		super();
		this.text = text;
		this.url = url;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "TextAndImageNote [text=" + text + ", url=" + url + "]";
	}
	
	
}
