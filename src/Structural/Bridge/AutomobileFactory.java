package Structural.Bridge;

public class AutomobileFactory {
    public Automobile createAutomobile(String type, String model) {
        if (type.equals("car"))
            return new Car(model);
        else if (type.equals("truck"))
            return new Truck(model);
        else
            return null;
    }
}
