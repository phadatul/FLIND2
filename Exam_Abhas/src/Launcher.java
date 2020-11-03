import java.util.ArrayList;

//Main Class which runs the program
public class Launcher {
	
public static void main(String[] args) {
	NoteStore noteStore=new NoteStore();
	noteStore.storeNote("Java is a set of computer software and specifications developed by James Gosling at Sun MicroSystems");
	noteStore.storeNote("Few books to read - Ikigai, How to win friends and influence people");
	noteStore.storeNote("The shopping list is on my fridge","//foo/bar1/bar2/images1.jpg");
	noteStore.storeNote("The size label of Jack's shirt","//foo/bar1/bar2/images2.jpg");
	System.out.println(displayTextNotes(noteStore));
	System.out.println(displayTextAndImageNotes(noteStore));
}
public static String displayTextNotes(NoteStore noteStore ) {
	
	 System.out.println("Text Notes.....");  
		String s = "";
 	   if(noteStore.getAllTextNotes()==null)
 	   {
 		   System.err.println("No text notes");
 		   return "";
 	   }
 	   else
 	   { 
 		   ArrayList<TextNote> textNote=noteStore.getAllTextNotes();
           int i=1;
 		   for (TextNote t : textNote )
 		   {
 			   s=s+"Text Note"+" "+i+": "+t.getText()+"\n";
 			   i++;
 		   }
 		   return s;
 	   }
}

public static String displayTextAndImageNotes(NoteStore noteStore)
{
	System.out.println("Text And Image Notes.....");  
	String s = "";
	   if(noteStore.getAllTextAndImageNotes()==null)
	   {
		   System.err.println("No text and image notes");
		   return "";
	   }
	   else
	   { 
		   
		   int i=1;
		   for (TextAndImageNote t :  noteStore.getAllTextAndImageNotes() )
		   {
			   s=s+"Text and Image Note"+" "+i+": "+t.getText()+", "+t.getUrl()+"\n";
 			   i++;
		   }
		   return s;
	   }
}
}
