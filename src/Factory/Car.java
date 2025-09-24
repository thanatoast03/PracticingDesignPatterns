package Factory;

public class Car extends Automobile {
    public Car(String model) {
        super(model);
    }

    @Override
    public void drive() {
        System.out.println("Factory.Car driving");
    }
}
