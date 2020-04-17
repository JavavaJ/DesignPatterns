package behavioral.strategy.for_dummies;

public class StreetRacer extends Vehicle {

    public StreetRacer() {
        setGoAlgorithm(new Driving());
    }
}
