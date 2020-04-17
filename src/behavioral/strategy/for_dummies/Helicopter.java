package behavioral.strategy.for_dummies;

public class Helicopter extends Vehicle {

    public Helicopter() {
        setGoAlgorithm(new Flying());
    }
}
