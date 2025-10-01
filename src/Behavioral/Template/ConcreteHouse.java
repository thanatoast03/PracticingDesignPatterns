package Behavioral.Template;

public class ConcreteHouse extends Template {
    @Override
    void buildFoundation() {
        System.out.println("Built concrete foundation");
    }

    @Override
    void buildPillars() {
        System.out.println("Built concrete pillars");
    }

    @Override
    void buildWalls() {
        System.out.println("Built concrete walls");
    }

    public ConcreteHouse() {
        super();
    }
}
