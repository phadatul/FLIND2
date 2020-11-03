package exam.sivasaimulka;

public class TextAndImageNote extends Note {
	private String imageUrl;

	// Default Constructor
	public TextAndImageNote() {
		super();
	}

	// Parameterized Constructor
	public TextAndImageNote(String text, String imageUrl) {
		super(text);
		this.imageUrl = imageUrl;
	}

	// Getter for imageUrl
	public String getImageUrl() {
		return imageUrl;
	}

	// Setter for imageUrl
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Override
	public String toString() {
		return super.getText() + ", " + imageUrl;
	}

}
