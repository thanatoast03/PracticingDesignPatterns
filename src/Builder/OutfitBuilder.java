package Builder;

public class OutfitBuilder {
    private boolean cap;
    private boolean shirt;
    private boolean underwear;
    private boolean pants;
    private boolean socks;

    public OutfitBuilder setCap(boolean cap) {
        this.cap = cap;
        return this;
    }

    public OutfitBuilder setShirt(boolean shirt) {
        this.shirt = shirt;
        return this;
    }

    public OutfitBuilder setUnderwear(boolean underwear) {
        this.underwear = underwear;
        return this;
    }

    public OutfitBuilder setPants(boolean pants) {
        this.pants = pants;
        return this;
    }

    public OutfitBuilder setSocks(boolean socks) {
        this.socks = socks;
        return this;
    }

    public Outfit build(){
        return new Outfit(this.cap, this.shirt, this.underwear, this.pants, this.socks);
    }
}
