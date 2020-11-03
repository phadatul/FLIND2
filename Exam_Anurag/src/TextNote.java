
public class TextNote {
	private String ptnote;
	
	//Default Constructor
	public TextNote() {
		// TODO Auto-generated constructor stub
	}
	//Parameterized Constructor
	public TextNote(String ptnote) {
		super();
		this.ptnote = ptnote;
	}
	//Get and Set Functions
	public String getPtnote() {
		return ptnote;
	}

	public void setPtnote(String ptnote) {
		this.ptnote = ptnote;
	}
	
	//Print Function
	@Override
	public String toString() {
		return "TextNote [ptnote=" + ptnote + "]";
	}
	
	
	
}
