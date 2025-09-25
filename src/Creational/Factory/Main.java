package Creational.Factory;

public class Main {
    public static void main(String[] args) {
        AutomobileFactory factory = new AutomobileFactory();
        Automobile vehicle = factory.createAutomobile("car", "Honda Civic");
        System.out.println(vehicle.getModel());
        vehicle.drive();
    }
}