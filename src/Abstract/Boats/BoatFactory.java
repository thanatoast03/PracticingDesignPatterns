package Abstract.Boats;

import Abstract.Factory;
import Abstract.Vehicle;

public class BoatFactory implements Factory {

    @Override
    public Vehicle createVehicle(String type, String model) {
        if (type.equals("Motor"))
            return new Motorboat(model);
        else if (type.equals("Sail"))
            return new Sailboat(model);
        return null;
    }
}
