package Creational.Builder;

public class Main {
    public static void main(String[] args) {
        OutfitBuilder outfitBuilder = new OutfitBuilder().setCap(true).setShirt(true).setUnderwear(true).setPants(true);
        System.out.println(outfitBuilder.build());
    }
}
