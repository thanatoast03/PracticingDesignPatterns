package Behavioral.Memento;

public class DocumentMemento {
    private String state;

    public DocumentMemento(String state) {
        this.state = state;

        System.out.println("Memento created with state: " + state);
    }

    public String getState() {
        return state;
    }
}
