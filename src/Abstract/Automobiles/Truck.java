package Abstract.Automobiles;

public class Truck extends Automobile {
    public Truck(String model) {
        super(model);
    }

    @Override
    public void drive() {
        System.out.println("Factory.Truck driving");
    }
}
