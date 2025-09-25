package Structural.Bridge;

abstract public class Automobile { // Here is the abstract class
    private static String model;

    public Automobile(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    abstract public void drive();
}
