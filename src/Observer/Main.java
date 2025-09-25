package Observer;

public class Main {
    public static void main(String[] args) {
        Broadcaster broadcaster = new Broadcaster("streamer", 1);

        Listener listener1 = new Listener("listener 1");
        Listener listener2 = new Listener("listener 2");
        Listener listener3 = new Listener("listener 3");
        Listener listener4 = new Listener("listener 4");
        Listener listener5 = new Listener("listener 5");

        Events.subscribe(broadcaster, listener1);
        Events.subscribe(broadcaster, listener2);
        Events.subscribe(broadcaster, listener3);
        Events.subscribe(broadcaster, listener4);
        Events.subscribe(broadcaster, listener5);

        broadcaster.broadcast();

        // Now unsub to see whether listener list updates

        Events.unsubscribe(broadcaster, listener1);
        System.out.println("------------------------------------------");

        broadcaster.broadcast();
    }
}
