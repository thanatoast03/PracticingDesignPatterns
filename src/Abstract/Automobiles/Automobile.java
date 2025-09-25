package Abstract.Automobiles;

import Abstract.Vehicle;

public class Automobile implements Vehicle {
    private static String model;

    public Automobile(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void drive() {
        System.out.println("General automobile driving");
    }
}
