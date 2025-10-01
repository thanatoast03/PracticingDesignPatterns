package Behavioral.Template;

public class Main {
    public static void main(String[] args) {
        System.out.println("Making concrete house");
        Template build = new ConcreteHouse();

        System.out.println("Making wooden house");
        build = new WoodenHouse();
    }
}
