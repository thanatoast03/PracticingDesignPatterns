package Structural.Facade;

public class Main {
    public static void main(String[] args) {
        Broadcaster broadcaster = new Broadcaster("streamer", 1);

        Listener listener1 = new Listener("listener 1");
        Listener listener2 = new Listener("listener 2");
        Listener listener3 = new Listener("listener 3");
        Listener listener4 = new Listener("listener 4");
        Listener listener5 = new Listener("listener 5");

        // Important part is how Facade pattern is used to hide the inner-workings of listener and broadcaster subscription action

        Facade.subscribe(broadcaster, listener1);
        Facade.subscribe(broadcaster, listener2);
        Facade.subscribe(broadcaster, listener3);
        Facade.subscribe(broadcaster, listener4);
        Facade.subscribe(broadcaster, listener5);

        broadcaster.broadcast();

        // Important part is how Facade pattern is used to hide the inner-workings of listener and broadcaster unsub action

        Facade.unsubscribe(broadcaster, listener1);
        System.out.println("------------------------------------------");

        broadcaster.broadcast();
    }
}
