1.The Note class is an abstract class that both TextNote and TextAndImageUrl classes extend, and the Note class contains a private attribute Text.

2.TextNote class is a child of Note class and can store text.

3.TextAndImageUrl class extends Note and has its own imageUrl private attribute

4.The NoteStoreInterface is an interface that has the required methods to be implemented by NoteStore.

5.NoteStore implements the NoteStoreInterface and the add and display methods accordingly.

6.The Launcher class contains the main methods and also a displayTextNotes and displayTextAndImageNotes methods which call the display methods from the NoteStore and can print the lists in a proper readable format.

7.All these are under the package exam.sivasaimulka.
