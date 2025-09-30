package Behavioral.Memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<DocumentMemento> history = new ArrayList<>();

    public DocumentMemento add(DocumentMemento document) {
        history.add(document);
        return document;
    }

    public DocumentMemento getMemento(Integer idx) { // Little scuffed but it works lol just use idx
        try {
            return history.get(idx);
        } catch (IndexOutOfBoundsException e) { // I will try not to bump into this when doing test cases
            return null;
        }
    }
}
