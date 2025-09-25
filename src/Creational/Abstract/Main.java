package Creational.Abstract;

import Creational.Abstract.Automobiles.AutomobileFactory;
import Creational.Abstract.Boats.BoatFactory;

public class Main {
    public static void main(String[] args) {
        Factory automobileFactory = new AutomobileFactory();
        Vehicle car = automobileFactory.createVehicle("car", "Honda Civic");
        System.out.println(car.getModel());

        Factory boatFactory = new BoatFactory();
        Vehicle boat = boatFactory.createVehicle("Motor", "Titanic");
        System.out.println(boat.getModel());
    }
}