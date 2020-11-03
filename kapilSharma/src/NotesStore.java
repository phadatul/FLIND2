import java.util.ArrayList;
import java.util.List;

public class NotesStore {
	private List<TextNote> list;
	
	public NotesStore() {
		list = new ArrayList<TextNote>();
	}
	
	public void storeNote(TextNote t) {
		list.add(t);
	}
	public ArrayList<TextNote> getAllTextNotes(){
		ArrayList<TextNote> finalList = new ArrayList<TextNote>();
		for(TextNote t : list) {
			if(t instanceof TextAndImageNote ) {
				continue;
			}
			else {
				finalList.add(t);
			}
			
		}
		return finalList;
		
	}
	public ArrayList<TextAndImageNote> getAllTextAndImageNotes(){
		ArrayList<TextAndImageNote> finalList = new ArrayList<TextAndImageNote>();
		for(TextNote t : list) {
			if(t instanceof TextAndImageNote ) {
				finalList.add((TextAndImageNote)t);
			}
			else {
				continue;
			}
			
		}
		return finalList;
		
	}

}
