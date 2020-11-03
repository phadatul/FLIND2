// Class for Text and image based notes
public class TextAndImageNote {
	private String text;
	private String url;
	public TextAndImageNote()
	{}
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
