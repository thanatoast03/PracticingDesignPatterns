package Structural.Proxy;

public class ProtectedResource implements Access {
    @Override
    public void access() {
        System.out.println("Activity on protected resource");
    }
}
