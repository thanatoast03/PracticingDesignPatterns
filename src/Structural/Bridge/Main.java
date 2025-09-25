package Structural.Bridge;

public class Main {
    public static void main(String[] args) {
        // Main point is that client code only accesses abstract part w/o being worried about implementation
        AutomobileFactory factory = new AutomobileFactory();
        Automobile vehicle = factory.createAutomobile("car", "Honda Civic");
        System.out.println(vehicle.getModel());
        vehicle.drive();
    }
}
