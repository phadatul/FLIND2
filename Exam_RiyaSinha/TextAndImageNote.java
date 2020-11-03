package Exam_RiyaSinha;

public class TextAndImageNote extends TextNote{
	
	private String imageURL; //field to store image URL
	
	public TextAndImageNote() {
		// TODO Auto-generated constructor stub
	}

	public TextAndImageNote(String note, String imageURL) {
		super(note); //super to store text note
		this.imageURL = imageURL; //set image url 
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
