public class TextAndImageNote extends Note{

	// the title and text fields are in the parent class
	private String imageURL;
	
	public TextAndImageNote(String title, String text, String imageURL) {
		super(title, text);
		this.imageURL = imageURL;
	}
	
	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	
	
	// overridden prinNote method
	
	@Override
	public void printNote() {
		System.out.println(this.getTitle());
		System.out.println(this.getText());
		System.out.println(this.getImageURL());
	}
	
}
