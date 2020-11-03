package Exam_SurajPrathikKumar;

public class TextNote {
	private String plainText;
	// Counter to calculate the id for new note
	private static int counter;
	// Added Id to each note
	private int id;

	static {
		counter = 0;
	}

	public TextNote() {

	}

	public TextNote(String plainText) {
		this();
		this.plainText = plainText;
	}

	public String getPlainText() {
		return plainText;
	}

	public void setPlainText(String plainText) {
		this.plainText = plainText;
	}

	public int getId() {
		return id;
	}

	// Incrementing the counter and setting id for Text Note
	public void setId() {
		TextNote.counter += 1;
		this.id = TextNote.counter;
	}

	@Override
	public String toString() {
		return "Text Note " + this.id + ": " + this.plainText + "\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((plainText == null) ? 0 : plainText.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TextNote other = (TextNote) obj;
		if (id != other.id)
			return false;
		if (plainText == null) {
			if (other.plainText != null)
				return false;
		} else if (!plainText.equals(other.plainText))
			return false;
		return true;
	}

}
