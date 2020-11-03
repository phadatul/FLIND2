package test;

public class Launcher {
	/**This is the main method which first adds the required notes and then calls displayTextNotes and displayTextAndImageNotes to print the]
	 * notes
	 * @param args
	 */
	public static void main(String[] args) {
		//Creating note object
		NoteStore note = new NoteStore();
		note.storeNote("Java is a set of computer software and specifications developed by James Gosling at Sun MicroSystems");
		note.storeNote("Few books to read - Ikigai , How to  win friends and influence people");
		note.storeNote("The shopping list on my fridge", "//foo/bar1/bar2/imgset1.jpg");
		note.storeNote("The size label of Jack's shirt", "//foo/bar1/bar2/imgset2.jpg");
		
		//prinitng the text notes
		displayTextNotes(note);
		//prinitng the text and image notes
		displayTextAndImageNotes(note);

		
	}

	public static void displayTextNotes(NoteStore note) {
		note.getAllTextNotes();
	}

	public static void displayTextAndImageNotes(NoteStore note) {
		note.getAllTextAndImageNotes();
	}
}