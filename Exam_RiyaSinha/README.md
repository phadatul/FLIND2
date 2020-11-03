Folder Name: Exam_RiyaSinha

The folder contains the following classes - 

TextNote Class:
This class is the class that helps store text messages only.
This class contains a parametrized constructor with 1 field.
This class contains one private field called 'note' of type String.

TextAndImageNote Class:
This class is the class that helps store text messages along with image URL.
This class inherits the TextNote class.
This class contains a parametrized constructor with 2 fields.
This class inherits a private field called 'note' of type String and contains a private field called "imageURL" of type String.

NoteStore Class:
This class contains two static ArrayLists called textnoteDatabase of type TextNote and textandimagenoteDatabase of type TextAndImageNote to store respective messages.
It contains the following methods - storeNote(String note), storeNote(String note, String url), getAllTextNotes(), getAllTextAndImageNotes().

Launcher Class:
This class contains the main method and is used to run the program.
It contains two static methods  - displayTextNotes(NoteStore notestore), public static void displayTextAndImageNotes(NoteStore notestore) .