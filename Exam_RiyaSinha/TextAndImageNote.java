package Exam_RiyaSinha;

public class TextAndImageNote extends TextNote{
	
	private String imageURL;
	
	public TextAndImageNote() {
		// TODO Auto-generated constructor stub
	}

	public TextAndImageNote(String note, String imageURL) {
		super(note);
		this.imageURL = imageURL;
	}
	
	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	@Override
	public String toString() {
		return this.getNote() + ", " + this.imageURL;
	}
	
	

}
