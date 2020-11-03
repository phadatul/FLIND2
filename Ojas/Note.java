/*
 * parent class of TextNotes and TextandImageNotes, abstracts out the common features
 * contains the abstract method of print note to be implemented separately
 * 
 */


public abstract class Note {
	
	
	private String title;
	private String text;
	
	public Note() {
		
	}
	
	public Note(String title, String text) {
		this.text = text;
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public abstract void printNote();
	

}
