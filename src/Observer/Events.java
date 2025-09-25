package Observer;

public class Events {
    public static void subscribe(Broadcaster broadcaster, Listener listener) {
        broadcaster.addListener(listener);
        listener.addBroadcaster(broadcaster);
    }

    public static void unsubscribe(Broadcaster broadcaster, Listener listener) {
        broadcaster.removeListener(listener);
        listener.removeBroadcaster(broadcaster);
    }
}
