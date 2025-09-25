package Behavioral.Observer;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Listener {
    private String name;
    private HashMap<Integer, Broadcaster> broadcasters = new HashMap<>();

    public Listener(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Broadcaster> getBroadcasters() {
        return broadcasters.values().stream().collect(Collectors.toList());
    }

    public void addBroadcaster(Broadcaster broadcaster) {
        broadcasters.put(broadcaster.getId(), broadcaster);
    }

    public void removeBroadcaster(Broadcaster broadcaster) {
        broadcasters.remove(broadcaster.getId());
    }

    public void listen(Broadcaster broadcaster) {
        System.out.println(name + " received message from " + broadcaster.getName());
    }

    @Override
    public String toString() {
        return "name: " + name + ", broadcasters: " + broadcasters.toString();
    }
}
