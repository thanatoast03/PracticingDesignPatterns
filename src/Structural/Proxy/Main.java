package Structural.Proxy;

public class Main {
    public static void main(String[] args) {
        // Essentially like middleware??

        // Show that proxy worked because it was allowed to access the resource
        ProtectedResource protectedResource = new ProtectedResource();
        Access proxy = new Proxy(protectedResource, true);

        proxy.access();

        System.out.println("-------------------------------------------------------");

        // Show that proxy worked because it denies access to resource
        proxy = new Proxy(protectedResource, false);

        proxy.access();
    }
}
