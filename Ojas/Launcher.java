import java.util.ArrayList;


/*
 * Launcher contains the main method, where the noteStore object is instantiated
 * displayTextNotes and displayTextAndImageNotes functions take the notestore object as parameter and print the respective lists  
 * 
 */

public class Launcher {
	
	public static void main(String a[]) {
		
		NoteStore notestore = new NoteStore();
		notestore.storeNote("Text Note 1", "Java is a set of computer software....");
		notestore.storeNote("Text Note 2", "Few books to read Ikigai....");
		displayTextNotes(notestore);
		
		notestore.storeNote("Text And Image Note 1", "The shopping list", "foo.baar/ab.jpg");
		notestore.storeNote("Text And Image Note 2", "The size and label of Jack's...", "url/url.jpg");
		displayTextAndImageNotes(notestore);
		
	}
	
	/*
	* Gets all TextNotes using getAllTextNotes method and prints each one using the printNote method
	*/
	public static void displayTextNotes(NoteStore notestore) {
		ArrayList<TextNote> textNotes = notestore.getAllTextNotes();
		for(int i=0; i<textNotes.size(); i++) {
			textNotes.get(i).printNote();
		}
	}
	
	/*
	* Gets all Text&ImageNotes using getAllTextAndImageNotes method and prints each one using the printNote method
	*/
	
	public static void displayTextAndImageNotes(NoteStore notestore) {
		ArrayList<TextAndImageNote> textAndImageNotes = notestore.getAllTextAndImageNotes();
		for(int i=0; i<textAndImageNotes.size(); i++) {
			textAndImageNotes.get(i).printNote();
		}
	}

}
