public class TextNote extends Note{

	public TextNote(String text, String title) {
		super(title, text);
	}
	
	// overridden prinNote method
	
	@Override
	public void printNote() {
		System.out.println(this.getTitle());
		System.out.println(this.getText());
	}
	

}
