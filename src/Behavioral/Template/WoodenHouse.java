package Behavioral.Template;

public class WoodenHouse extends Template {
    @Override
    public void buildFoundation() {
        System.out.println("Built wooden foundation");
    }

    @Override
    public void buildPillars() {
        System.out.println("Built wooden pillars");
    }

    @Override
    public void buildWalls() {
        System.out.println("Built wooden walls");
    }

    public WoodenHouse() {
        super();
    }
}
