package exam.sivasaimulka;

public abstract class Note {
	private String text;

	// Default Constructor
	public Note() {

	}

	public Note(String text) {
		this.text = text;
	}

	// Getter for text
	public String getText() {
		return text;
	}

	// Setter for text
	public void setText(String text) {
		this.text = text;
	}

}
