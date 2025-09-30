package Behavioral.Memento;

public class Document {
    private String content = "";
    private History history = new History();

    public void write(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public DocumentMemento createMemento() {
        return history.add(new DocumentMemento(content));
    }

    public void restoreFromMemento(Integer idx) {
        DocumentMemento memento = history.getMemento(idx);

        if (memento != null) this.content = memento.getState();
        else System.out.println("No memento found");

    }
}
