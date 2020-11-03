
public class TextAndImageNote extends TextNote {
	private String url;
	public TextAndImageNote() {
		
	}
	public TextAndImageNote(String message, String url) {
		super(message);
		this.url = url;
		
	}

	public String getUrl() {
		return url;
	}

//	public void setUrl(String url) {
//		this.url = url;
//	}

}
