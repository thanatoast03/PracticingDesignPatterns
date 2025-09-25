package Structural.Bridge;

public class Car extends Automobile {
    public Car(String model) {
        super(model);
    }

    @Override
    public void drive() {
        System.out.println("Car driving");
    }
}
