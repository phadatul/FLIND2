package notes;
/*
 * Class definition of a single TextAndImageNote
 * Extended from TextNote class
 * Contains attributes imgURL and content (through its extension)
 */
public class TextAndImageNote extends TextNote{
	
	private String imgURL;
	//Constructor of the class requiring two String arguments a note and the url
	public TextAndImageNote(String note,String imgURL) {
		super(note);
		this.imgURL=imgURL;
	}

	public String getImgURL() {
		return imgURL;
	}

	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}
	
	//Gives an output of what would be displayed
	public String getText()
	{
		return super.getText()+" , "+getImgURL();
	}

	//Sets the content of the textNote
	public void setText(String note)
	{
		super.setText(note);
	}

	@Override
	public String toString() {
		return "TextAndImageNote [imgURL=" + imgURL + ", getText()=" + getText() + "]";
	}
}
