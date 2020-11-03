
public class Launcher extends storeNote{
	public static void main(String[] args) {
		TextNote t1 = new TextNote("Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems");
		TextNote t2 = new TextNote("Few books to read - Ikigai , How to win friends and influence people");
		
		TextAndImageNote ti1 = new TextAndImageNote("The shopping list on my fridge","//foo/bar1/bar2/imgset1.jpg");
		TextAndImageNote ti2 = new TextAndImageNote("The size label of Jack's shirt", "//foo/bar1/bar2/imgset2.jpg");
		
		storeNote s = new storeNote();
		s.storeNote(t1);
		s.storeNote(ti1);
		s.storeNote(ti2);
		s.storeNote(t2);
		
		
		s.displayTextNotes();
		s.displayTextAndImageNotes();
	}
}
