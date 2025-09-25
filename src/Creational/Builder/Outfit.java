package Creational.Builder;

public class Outfit {
    private boolean cap;
    private boolean shirt;
    private boolean underwear;
    private boolean pants;
    private boolean socks;

    public Outfit(boolean cap, boolean shirt, boolean underwear, boolean pants, boolean socks) {
        this.cap = cap;
        this.shirt = shirt;
        this.underwear = underwear;
        this.pants = pants;
        this.socks = socks;
    }

    @Override
    public String toString() {
        return String.format("Cap: %s, Shirt: %s, Underwear: %s, Pants: %s, Socks: %s", cap, shirt, underwear, pants, socks);
    }
}
