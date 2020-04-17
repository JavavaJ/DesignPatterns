package behavioral.strategy.for_dummies;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Vehicle car = new StreetRacer();
        Vehicle f1 = new FormulaOne();
        Vehicle heli = new Helicopter();
        Vehicle jet = new Jet();

        vehicles.addAll(Arrays.asList(car, f1, heli, jet));

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }

}
