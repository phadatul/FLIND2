package test;

public class TextAndImageNote {

	private String text;
	private String url;

	/**This is the default constructor.
	 * 
	 */
	public TextAndImageNote() {
		super();
	}

	/**This is the parameterized constructor. This takes in text and the url of the photo to be stored as inputs.
	 * @param text : The text which needs to be stored.
	 * @param url : The url of the photo which needs to be stored.
	 */
	public TextAndImageNote(String text, String url) {
		super();
		this.text = text;
		this.url = url;
	}

	/** This returns the text of a specific note.
	 * @return : This returns a string containing the text of the specified note.
	 */
	public String getText() {
		return this.text;
	}

	/** This method sets the given text into the note.
	 * @param text : The text which needs to be assigned to the specific note.
	 */
	public void setText(String text) {
		this.text = text;
	}
	
	/** This returns the url of the photo of a specific note.
	 * @return : This returns a string containing the url of the photo of the specified note.
	 */
	public String geturl() {
		return this.url;
	}
	
	/** This method sets the given url of the photo into the note.
	 * @param text : The url of the photo which needs to be assigned to the specific note.
	 */

	public void seturl(String url) {
		this.url = url;
	}

}
