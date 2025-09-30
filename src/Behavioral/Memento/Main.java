package Behavioral.Memento;

public class Main {
    public static void main(String[] args) {
        // Memento pattern is for creating a history of states (like save states)

        Document doc = new Document();
        doc.createMemento(); // Creates memento for blank document

        doc.write("Text I want to delete");
        doc.createMemento(); // Creates memento with text "Text I want to delete"

        // Undo function
        doc.restoreFromMemento(0); // Restores back to blank document
        System.out.println("Document current state: " + doc.getContent());

        // Redo function
        doc.restoreFromMemento(1); // Restores back to "Text I want to delete"
        System.out.println("Document current state: " + doc.getContent());
    }
}
