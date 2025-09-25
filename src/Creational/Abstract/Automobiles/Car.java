package Creational.Abstract.Automobiles;

public class Car extends Automobile {
    public Car(String model) {
        super(model);
    }

    @Override
    public void drive() {
        System.out.println("Creational.Factory.Car driving");
    }
}
