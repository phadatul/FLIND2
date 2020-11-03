Classes Used
1. TextNote - To store Notes with some lines of text
Class Members - private int text 
Member Functions - getText(), setText(), toString()(Overridden method)

2.TextAndImageNote - To store Notes with some lines of text and an image url
Class Members - private int text, private int url 
Member Functions - getText(), setText(), getUrl(), setUrl(), toString()(Overridden method)

3.NoteStore - To store and access notes of type TextNote and TextAndImageNote
Class Members - private Array List textNote , private Array List textAndImageNote , 
Member Functions - storeNote()(Overridden for TextNote and TextAndImageNote),getAllTextNotes(),getAllTextAndImageNotes()

4. Launcher - To run the program
Member Functions - main(), displayTextNotes(),displayTextAndImageNotes()