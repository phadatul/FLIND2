package Exam_SurajPrathikKumar;

public class TextAndImageNote extends TextNote {
	private String imgUrl;
	// Counter to calculate the id for new note
	private static int counter;
	// Added Id to each note
	private int id;

	static {
		counter = 0;
	}

	public TextAndImageNote() {
		// TODO Auto-generated constructor stub

	}

	public TextAndImageNote(String plainText, String imgUrl) {
		super(plainText);
		this.imgUrl = imgUrl;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public int getId() {
		return id;
	}
	
	// Incrementing the counter and setting id for Text and Image Note
	public void setId() {
		TextAndImageNote.counter += 1;
		this.id = TextAndImageNote.counter;
	}

	@Override
	public String toString() {
		return "Text And Image Note " + this.id + ": " + super.getPlainText() + ", " + this.imgUrl + "\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + id;
		result = prime * result + ((imgUrl == null) ? 0 : imgUrl.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TextAndImageNote other = (TextAndImageNote) obj;
		if (id != other.id)
			return false;
		if (imgUrl == null) {
			if (other.imgUrl != null)
				return false;
		} else if (!imgUrl.equals(other.imgUrl))
			return false;
		return true;
	}

}
