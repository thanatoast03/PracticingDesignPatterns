package Structural.Proxy;

public class Proxy implements Access {
    private ProtectedResource protectedResource;
    private boolean allowed;

    public Proxy(ProtectedResource protectedResource, boolean allowed) {
        this.protectedResource = protectedResource;
        this.allowed = allowed;
    }
    @Override
    public void access() {
        System.out.println("Doing middleware stuff");
        if (allowed) {
            System.out.println("Allowed, therefore access protected resource");
            protectedResource.access();
        } else {
            System.out.println("Denied, therefore prevent access to protected resource");
        }
    }
}
