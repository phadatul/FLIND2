package exam.sivasaimulka;

public class Launcher {

	public void displayTextNotes(NoteStore n) {
		int i = 1;
		for (TextNote t : n.getAllTextNotes()) {
			System.out.println("Text Note " + i + ": " + t + "\n");
			i++;
		}
	}

	public void displayTextAndImageNotes(NoteStore n) {
		int i = 1;
		for (TextAndImageNote t : n.getAllTextAndImageNotes()) {
			System.out.println("Text and Image Note " + i + ": " + t + "\n");
			i++;
		}
	}

	public static void main(String[] args) {
		Launcher l = new Launcher();
		NoteStore n = new NoteStore();
		n.storeNote("This is the text note 1");
		n.storeNote("This is the text note 2");
		n.storeNote("This is text and image note 1", "//foo/bar1/bar2/imgset1.jpg");
		n.storeNote("This is the text and image note 2", "//foo/bar1/bar2/imgset2.jpg");
		l.displayTextNotes(n);
		l.displayTextAndImageNotes(n);
	}
}
