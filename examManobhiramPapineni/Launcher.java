public class Launcher {

  public static void main(String[] args) {
    // Creating NoteStore Object
    NoteStore n = new NoteStore();
    n.storeNote("Java is a set of computer software and specifications developed by James Gpsling at Sun Microsystems");
    n.storeNote("Few books to read - Ikigai, How to win friends and influence people");
    n.storeNote("The shopping list on my firdge", "//foo/bar1/bar2/imgset1.jpg");
    n.storeNote("The size label of Jack's shirt", "//foo/bar1/bar2/imget2.jpg");

    // Displays all the Text NOtes
    n.displayTextNotes();
    // Displays all the Text and Image Notes
    n.displayTextAndImageNotes();
  }
}