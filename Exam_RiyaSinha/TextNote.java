package Exam_RiyaSinha;

public class TextNote {
	
	private String note; //field for text noter
	
	public TextNote() {
		
		//default constructor
	}

	public TextNote(String note) {
		
		//parameterized constructor
		this.note = note;
	}

	public String getNote() {
		
		//getter method to return text note
		return note;
	}

	public void setNote(String note) {
		
		//setter method to set text note
		this.note = note;
	}

	@Override
	public String toString() {
		
		//toString method
		return note;
	}
	
	

}
