import java.util.ArrayList;

public class NoteStore {

  private ArrayList<TextAndImageNote> txtNImageNotes = new ArrayList<TextAndImageNote>();
  private ArrayList<TextNote> txtNotes = new ArrayList<TextNote>();

  // This method is used to store the inputs into corresponding Arraylists
  public void storeNote(String note, String image) {
    TextAndImageNote c = new TextAndImageNote(note, image);
    txtNImageNotes.add(c);
  }

  // This method is used to store the inputs into corresponding Arraylists
  public void storeNote(String note) {
    TextNote d = new TextNote(note);
    txtNotes.add(d);
  }

  // This method is used to display the current text notes stored
  public void displayTextNotes() {
    ArrayList<TextNote> dispTxt = getAllTextNotes();
    int length = dispTxt.size();
    for (int i = 1; i <= length; i++) {
      System.out.println("Text Note " + i + " " + dispTxt.get(i - 1).note);
    }
  }

  // This method is used to display the current text and image notes stored
  public void displayTextAndImageNotes() {
    ArrayList<TextAndImageNote> dispTxtNImage = getAllTextAndImageNotes();
    int length = dispTxtNImage.size();
    for (int i = 1; i <= length; i++) {

      System.out.println("Text and Image Note" + " " + i + " " + dispTxtNImage.get(i - 1).note + ", "
          + dispTxtNImage.get(i - 1).image);
    }
  }

  // This method returns the text notes stored
  public ArrayList<TextNote> getAllTextNotes() {
    return txtNotes;
  }

  // This method returns the text and image notes stored
  public ArrayList<TextAndImageNote> getAllTextAndImageNotes() {
    return txtNImageNotes;
  }
}
