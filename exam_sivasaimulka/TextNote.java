package exam.sivasaimulka;

public class TextNote extends Note {
	// Default Constructor
	public TextNote() {
		super();
	}

	// Parameterized constructor for super class
	public TextNote(String text) {
		super(text);
	}

	@Override
	public String toString() {
		return super.getText() + ".";
	}

}
