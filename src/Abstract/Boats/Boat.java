package Abstract.Boats;

import Abstract.Vehicle;

public class Boat implements Vehicle {
    private static String model;

    public Boat(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void boat() {
        System.out.println("General boat boating");
    }
}
