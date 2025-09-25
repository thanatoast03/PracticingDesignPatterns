package Structural.Flyweight;

public class Main {
    public static void main(String[] args) {
        // The main idea behind flyweight is to re-use resources to prevent the allocation of unnecessary resources

        FlyweightFactory factory = new FlyweightFactory();
        Icon icon = factory.getIcon("folder");
        icon.draw(120, 140);

        icon = factory.getIcon("file");
        icon.draw(120, 140);
    }
}
