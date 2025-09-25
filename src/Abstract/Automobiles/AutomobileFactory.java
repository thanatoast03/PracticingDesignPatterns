package Abstract.Automobiles;

import Abstract.Factory;
import Abstract.Vehicle;

public class AutomobileFactory implements Factory {
    @Override
    public Vehicle createVehicle(String type, String model) {
        if (type.equals("car"))
            return new Car(model);
        else if (type.equals("truck"))
            return new Truck(model);
        return null;
    }
}
