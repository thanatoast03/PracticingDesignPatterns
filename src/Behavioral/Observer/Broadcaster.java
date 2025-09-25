package Behavioral.Observer;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Broadcaster {
    HashMap<String, Listener> listeners = new HashMap<>();
    private String name;
    private int id;

    public Broadcaster(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public List<Listener> getListeners() {
        return listeners.values().stream().collect(Collectors.toList());
    }

    public void addListener(Listener listener) {
        listeners.put(listener.getName(), listener);
    }

    public void removeListener(Listener listener) {
        listeners.remove(listener.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void broadcast(){
        System.out.println(name + " broadcasted new message");
        for (Listener listener : listeners.values()) {
            listener.listen(this);
        }
    }

    @Override
    public String toString() {
        String temp = "";

        for (Listener listener : listeners.values()) {
            temp += listener.getName() + ", ";
        }

        return "name: " + name + ", id: " + id + ", listeners: " + temp;
    }
}
